
package alferez;

import java.util.*;

public class Account {
    
    List<Accounts> acc = new ArrayList<>();
    
    public void getAccount(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Account Details:");
        
        boolean alreadyExist;
        
        int id;
        do {
            System.out.print("ID: ");
            id = scan.nextInt();
            alreadyExist = false;
            for (Accounts acc1 : acc) {
                if (acc1.id == id) {
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
                if (acc1.email.equals(email)) {
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
                if (acc1.username.equals(usern)) {
                    System.out.println("This Username already exists.\n");
                    alreadyExist = true;
                    break;
                }
           }   
        } while (alreadyExist);      
        
        String pass;
        boolean validPass;
        do{ 
            System.out.print("Password: ");
            pass = scan.next();
            validPass = this.passwordVerify(pass);
            if(!validPass){
                System.out.println("Invalid Password, Try Again.\n");
            }          
        }while(!validPass);
        
        Accounts temp = new Accounts();
        temp.addAccounts(id, fs, ls, email, usern, pass);
        acc.add(temp);
        
        System.out.println("");
        System.out.printf("%-5s %-15s %-15s %-25s %-15s\n",
                "ID", "First Name", "Last Name", "Email", "Username");
        for(Accounts acc1 : acc) {
            acc1.viewAccounts();
        }
        System.out.println("");
        
    }
    
    public boolean passwordVerify(String password) {
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        
        if (password.length() < 8){
            return false;
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

        return hasUppercase && hasLowercase && hasSpecialChar;
    }
}
