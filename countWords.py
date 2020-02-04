import sys

"""
To count number of words in text file,
change working directory to directory where
text file is found. Input the following command into 
the terminal: 

python countWords.py file-name.txt
"""

def countWords(file_name):
    words = {}
    try:
        file = open(file_name, "r")
        for word in file.read().split():
            if word not in words:
                words[word] = 1

            else:
                words[word] += 1

        file.close()
        return words

    except IOError:
        print("Incorrect file name. Please try again with the correct file name")
        print("Make sure the command argument is: python countWords.py /file_name.txt/")



if __name__ == "__main__":
    args = sys.argv
    file_name = args[1]

    words = countWords(file_name)
    print("\n")
    print("{:14}{:3}".format("WORD", "COUNT"))
    print("-"*18)

    for word, count in words.items():
        print("{:14}{:3}".format(word, count))
