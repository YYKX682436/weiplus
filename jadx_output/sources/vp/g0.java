package vp;

/* loaded from: classes15.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public android.os.Handler f438773a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.HandlerThread f438774b;

    /* renamed from: d, reason: collision with root package name */
    public final vp.f0 f438776d;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Boolean f438775c = java.lang.Boolean.FALSE;

    /* renamed from: e, reason: collision with root package name */
    public int f438777e = 1;

    public g0(vp.d dVar) {
        this.f438776d = new vp.f0(dVar, null);
    }

    public final boolean a() {
        if (this.f438777e == 1) {
            return this.f438773a != null;
        }
        android.os.HandlerThread handlerThread = this.f438774b;
        return (handlerThread == null || !handlerThread.isAlive() || this.f438773a == null) ? false : true;
    }

    public void b(int i17) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = i17;
        if (a()) {
            this.f438773a.sendMessage(obtain);
        }
    }

    public void c(int i17) {
        com.tencent.mars.xlog.Log.i("DanmakuManager", "checkedThreadAlive mDrawingThreadType:%d", java.lang.Integer.valueOf(this.f438777e));
        boolean z17 = this.f438777e == 1;
        vp.f0 f0Var = this.f438776d;
        if (z17) {
            if (this.f438773a == null) {
                this.f438773a = new android.os.Handler(android.os.Looper.getMainLooper(), f0Var);
            }
        } else if (this.f438773a == null) {
            if (this.f438774b == null) {
                int i18 = pu5.i.f358473b;
                android.os.HandlerThread a17 = pu5.f.a("DanmakuManager", 5);
                this.f438774b = a17;
                a17.start();
            }
            com.tencent.mars.xlog.Log.i("DanmakuManager", "checkedThreadAlive mDrawThread start ", java.lang.Boolean.valueOf(this.f438774b.isAlive()));
            this.f438773a = new android.os.Handler(this.f438774b.getLooper(), f0Var);
        }
    }
}
