
package alferez;

import java.util.*;

public class Account {
    
    public void getAccount(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Number of Accounts: ");
        int acount = scan.nextInt();
        
        Accounts[] acc = new Accounts[acount];
        
        for(int i = 0; i < acount; i++){
            
            acc[i] = new Accounts();
            
            System.out.printf("\nEnter Account Details for Account %d: \n", (i + 1));

            boolean alreadyExist;

            int id;
            do {
                System.out.print("ID: ");
                id = scan.nextInt();
                alreadyExist = false;
                for (Accounts acc1 : acc) {
                    if (acc1 != null && acc1.id == id) {
                        System.out.println("This ID already exists. Please enter a different ID.\n");
                        alreadyExist = true;
                        break;
                    }
               }   
            } while (alreadyExist);

            System.out.print("First Name: ");
            String fs = scan.next();
            System.out.print("Last Name: ");
            String ls = scan.next();

            String email;
            do {
                System.out.print("Email: ");
                email = scan.next();
                alreadyExist = false;
                for (Accounts acc1 : acc) {
                    if (acc1 != null && acc1.email != null && acc1.email.equals(email)) {
                        System.out.println("This Email already exists.\n");
                        alreadyExist = true;
                        break;
                    }
               }   
            } while (alreadyExist);

            String usern;
            do {
                System.out.print("Username: ");
                usern = scan.next();
                alreadyExist = false;
                for (Accounts acc1 : acc) {
                    if (acc1 != null && acc1.email != null && acc1.username.equals(usern)) {
                        System.out.println("This Username already exists.\n");
                        alreadyExist = true;
                        break;
                    }
               }   
            } while (alreadyExist);      

            String pass;
            String validPass;
            do{ 
                System.out.print("Password: ");
                pass = scan.next();
                validPass = this.passwordVerify(pass);
                if(!validPass.equals("valid")){
                    System.out.println(validPass + " Try Again.\n");
                }          
            }while(!validPass.equals("valid"));
        
            acc[i].addAccounts(id, fs, ls, email, usern, pass);
        }        
        
        System.out.println("");
        System.out.printf("%-5s %-15s %-15s %-35s %-15s\n",
                "ID", "First Name", "Last Name", "Email", "Username");
        for(Accounts acc1 : acc) {
            acc1.viewAccounts();
        }
        System.out.println("");
        
    }
    
    public String passwordVerify(String password) {
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        
        if (password.length() < 8){
            return "Password too short!";
        }
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)){
                hasUppercase = true;
            }
            if (Character.isLowerCase(c)){
                hasLowercase = true;
            }
            if (!Character.isLetterOrDigit(c)){
                hasSpecialChar = true;
            }
        }

        if(!hasUppercase){
            return "Password Must Have an Uppercase Letter!";
        }
        if(!hasLowercase){
            return "Password Must Have a Lowecase Letter!";
        }
        if(!hasSpecialChar){
            return "Password Must Have a Special Character!";
        }
        
        return "valid";
    }
}
