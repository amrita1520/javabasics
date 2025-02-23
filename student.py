class Student: #class
    def __init__(self,names,ages): #constructor
        self.name=names  #variables
        self.age=ages
    def display(self): #function
        print("name",self.name,"age",self.age)

#class creates objects
#objects variables need to be initlialized
# through objects we can invoke functions  
st=Student("amrita",15)  
st.display()


