package com.example.demo;

public class CompanyDTO {
    public String Name;
    public String CatchPhrase;
    public String Bs;

    public CompanyDTO() {
    }

    public CompanyDTO(String name, String catchPhrase, String bs) {
        Name = name;
        CatchPhrase = catchPhrase;
        Bs = bs;
    }

    @Override
    public String toString() {
        return "CompanyDTO{" +
                "Name='" + Name + '\'' +
                ", CatchPhrase='" + CatchPhrase + '\'' +
                ", Bs='" + Bs + '\'' +
                '}';
    }
}
