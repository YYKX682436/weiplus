package vx1;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f441225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vx1.i f441226e;

    public g(vx1.i iVar, android.os.Handler handler) {
        this.f441226e = iVar;
        this.f441225d = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f441226e.wi(this.f441225d);
    }
}
