package pu5;

/* loaded from: classes12.dex */
public final class b extends java.lang.Thread {
    @Override // java.lang.Thread
    public void interrupt() {
        super.interrupt();
        ku5.o.f312598b.a(this, getName(), getId());
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        super.start();
        ku5.o.f312598b.c(this, getName(), getId());
    }
}
