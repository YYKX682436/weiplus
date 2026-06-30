package pe4;

/* loaded from: classes15.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final re4.c0 f353717a;

    /* renamed from: b, reason: collision with root package name */
    public final re4.d0 f353718b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f353719c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Handler f353720d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f353721e = false;

    /* renamed from: f, reason: collision with root package name */
    public iu5.e f353722f = null;

    /* renamed from: g, reason: collision with root package name */
    public iu5.e f353723g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f353724h = -1;

    /* renamed from: i, reason: collision with root package name */
    public pe4.n f353725i = null;

    public o(java.lang.ref.WeakReference weakReference, re4.c0 c0Var, re4.d0 d0Var, android.os.Handler handler) {
        this.f353717a = null;
        this.f353718b = null;
        this.f353719c = null;
        this.f353717a = c0Var;
        this.f353718b = d0Var;
        this.f353719c = weakReference;
        this.f353720d = handler;
    }

    public void a() {
        android.os.Handler handler = this.f353720d;
        if (handler != null) {
            handler.obtainMessage(5).sendToTarget();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
        }
    }

    public void b() {
        if (this.f353720d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
            return;
        }
        a();
        boolean z17 = this.f353721e;
        re4.d0 d0Var = this.f353718b;
        d0Var.f394531f = z17;
        this.f353720d.obtainMessage(2, d0Var).sendToTarget();
    }

    public abstract void c(android.os.Bundle bundle);

    public abstract void d(android.os.Bundle bundle);

    public abstract void e(int i17, java.lang.String[] strArr, int[] iArr);

    public void f(java.lang.String[] strArr, int i17) {
        android.os.Handler handler = this.f353720d;
        if (handler == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
            return;
        }
        android.os.Message obtainMessage = handler.obtainMessage(3);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putStringArray("permissions", strArr);
        bundle.putInt("request_code", i17);
        obtainMessage.setData(bundle);
        obtainMessage.sendToTarget();
    }
}
