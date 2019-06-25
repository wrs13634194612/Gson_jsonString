package com.example.administrator.testz;

/**
 * Created by wrs on 2019/6/25,17:35
 * projectName: Testz
 * packageName: com.example.administrator.testz
 */
public class UserSimple {
    // 通过快捷键Alt+Insert

    String name;
    String email;
    int age;
    boolean isDeveloper;

    public UserSimple(String mName, String mEmail, int mAge, boolean developer) {
        this.name = mName;
        this.email = mEmail;
        this.age = mAge;
        this.isDeveloper = developer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDeveloper() {
        return isDeveloper;
    }

    public void setDeveloper(boolean developer) {
        isDeveloper = developer;
    }


}