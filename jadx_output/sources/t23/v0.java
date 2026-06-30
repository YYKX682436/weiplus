package t23;

/* loaded from: classes10.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t23.i f415280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t23.y0 f415281e;

    public v0(t23.y0 y0Var, t23.i iVar, java.lang.String str) {
        this.f415281e = y0Var;
        this.f415280d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.SystemClock.currentThreadTimeMillis();
        android.os.SystemClock.uptimeMillis();
        boolean a17 = this.f415280d.a();
        android.os.SystemClock.currentThreadTimeMillis();
        android.os.SystemClock.uptimeMillis();
        this.f415281e.a().post(new t23.u0(this, a17));
    }
}
