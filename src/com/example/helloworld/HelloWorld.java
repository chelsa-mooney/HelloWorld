package com.example.helloworld;

public class HelloWorld {
    static void myMethod() {
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        myMethod();
    }

    public static class Technologists {
        private String firstName; //private

        //Getter
        public String getFirstName()
        {
            return firstName;
        }

        //Setter
        public void setFirstName(String newFirstName) {
            this.firstName = newFirstName;
        }

        public static class Technologists2 {

            protected String firstName; //visibility to same package and sublcass

            protected String company = "Strategio";
            public void study()
            {
                System.out.println("I am studying");
            }

        }

        public static class SRE extends Technologists2
        {
            private String previousRole = "IT Ops";
            public static void Main (String[] args)
            {
                //Create an com.example.helloworld.HelloWorld.Technologists.SRE object
                SRE sreOne = new SRE();

                //Call study() from parent
                sreOne.study();
                System.out.println(sreOne.company + "" + sreOne.previousRole);
            }
        }
    }
}
