package pu5;

/* loaded from: classes12.dex */
public final class e extends android.os.HandlerThread {
    @Override // java.lang.Thread
    public void interrupt() {
        super.interrupt();
        ku5.o.f312598b.a(this, getName(), getId());
    }

    @Override // android.os.HandlerThread
    public boolean quit() {
        ku5.o.f312598b.a(this, getName(), getId());
        return super.quit();
    }

    @Override // android.os.HandlerThread
    public boolean quitSafely() {
        ku5.o.f312598b.a(this, getName(), getId());
        return super.quitSafely();
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        super.start();
        ku5.o.f312598b.c(this, getName(), getId());
    }
}
