#create a class LogToFile
# variable -->msg
# method --filebuf() write To file


class logtofile():
     def __init__(self , message):
         self.message = message
     def filebuf(self):
        with open("output.txt", "w") as file:
            file.write(self.message)  
          
t = logtofile("write to file")
t.filebuf()
     