package jb1;

/* loaded from: classes7.dex */
public final class z extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f298750d;

    public z(yz5.l lVar) {
        this.f298750d = lVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.f298750d.invoke(java.lang.Boolean.FALSE);
        cancel();
    }
}
