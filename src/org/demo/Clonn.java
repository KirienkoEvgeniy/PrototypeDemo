package org.demo;

public interface Clonn extends Cloneable{

    public User shallowCopy() throws CloneNotSupportedException;
    public User deepCopy() throws CloneNotSupportedException;
}
