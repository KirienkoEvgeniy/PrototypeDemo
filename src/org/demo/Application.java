package org.demo;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.setName("Name3");
        User userShallow = user.shallowCopy();

        System.out.println("user = userShallow -> " + userShallow.getName().equals(user.getName()));
        user.setName("Name2");
        System.out.println("user.setName -> " + user.getName());
        System.out.println("user.getName -> " + user.getName());
        System.out.println("userShallow.getName -> " + userShallow.getName());

        User userDeep = user.deepCopy();

        System.out.println("user.setName -> " + user.getName());
        System.out.println("user.getName -> " + user.getName());
        System.out.println("userDeep.getName -> " + userDeep.getName());
        System.out.println("userShallow.getName -> " + userShallow.getName());

    }
}
