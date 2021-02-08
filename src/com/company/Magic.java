package com.company;

public class Magic extends Boss implements Printable {
    private String superPower;
    private int damageSupPower;

    public Magic(String superPower, int damageSupPower) {
        this.superPower = superPower;
        this.damageSupPower = damageSupPower;
    }

    @Override
    public void print() {
        System.out.println("Super power: " + superPower +". Damage of Super power: " + damageSupPower);
    }
}
