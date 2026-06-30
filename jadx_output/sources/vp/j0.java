package vp;

/* loaded from: classes15.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public android.os.Handler f438781a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.HandlerThread f438782b;

    /* renamed from: d, reason: collision with root package name */
    public final vp.i0 f438784d;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Boolean f438783c = java.lang.Boolean.FALSE;

    /* renamed from: e, reason: collision with root package name */
    public int f438785e = 1;

    public j0(vp.k kVar) {
        this.f438784d = new vp.i0(kVar, null);
    }

    public final boolean a() {
        if (this.f438785e == 1) {
            return this.f438781a != null;
        }
        android.os.HandlerThread handlerThread = this.f438782b;
        return (handlerThread == null || !handlerThread.isAlive() || this.f438781a == null) ? false : true;
    }

    public void b(int i17) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = i17;
        if (a()) {
            this.f438781a.sendMessage(obtain);
        }
    }

    public void c(int i17) {
        com.tencent.mars.xlog.Log.i("DanmakuManager", "checkedThreadAlive mDrawingThreadType:%d", java.lang.Integer.valueOf(this.f438785e));
        boolean z17 = this.f438785e == 1;
        vp.i0 i0Var = this.f438784d;
        if (z17) {
            if (this.f438781a == null) {
                this.f438781a = new android.os.Handler(android.os.Looper.getMainLooper(), i0Var);
            }
        } else if (this.f438781a == null) {
            if (this.f438782b == null) {
                int i18 = pu5.i.f358473b;
                android.os.HandlerThread a17 = pu5.f.a("DanmakuManager", 5);
                this.f438782b = a17;
                a17.start();
            }
            com.tencent.mars.xlog.Log.i("DanmakuManager", "checkedThreadAlive mDrawThread start ", java.lang.Boolean.valueOf(this.f438782b.isAlive()));
            this.f438781a = new android.os.Handler(this.f438782b.getLooper(), i0Var);
        }
    }
}
