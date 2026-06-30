package ru5;

/* loaded from: classes.dex */
public class b implements ru5.j {
    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).q(runnable);
    }

    @Override // ru5.j
    public java.lang.String getTag() {
        return "IOScheduler@" + hashCode();
    }

    @Override // ru5.j
    public void j() {
    }
}
