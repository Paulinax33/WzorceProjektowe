package org.example.ad3;

public interface Observable {
    void addReader(Observer observerR);
    void removeReader(Observer observerR);
    void notifyReader();
}
