package qn1;

/* loaded from: classes12.dex */
public class c extends kn1.f {

    /* renamed from: p, reason: collision with root package name */
    public static qn1.c f364938p;

    /* renamed from: j, reason: collision with root package name */
    public qn1.d f364939j;

    /* renamed from: k, reason: collision with root package name */
    public qn1.c0 f364940k;

    /* renamed from: l, reason: collision with root package name */
    public qn1.t f364941l;

    /* renamed from: m, reason: collision with root package name */
    public xn1.h f364942m;

    /* renamed from: n, reason: collision with root package name */
    public ln1.g f364943n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f364944o = null;

    public static synchronized qn1.c i() {
        qn1.c cVar;
        synchronized (qn1.c.class) {
            if (f364938p == null) {
                qn1.c cVar2 = new qn1.c();
                f364938p = cVar2;
                kn1.a.a(cVar2);
            }
            cVar = f364938p;
        }
        return cVar;
    }

    public static boolean n(android.content.Context context, int i17) {
        if (!o().f364968h || !o().h()) {
            return false;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.u(context.getString(i17));
        u1Var.m(com.tencent.mm.R.string.f490454vi);
        u1Var.q(false);
        return true;
    }

    public static qn1.d o() {
        return i().j();
    }

    @Override // kn1.a
    public synchronized void b() {
        f364938p = null;
    }

    @Override // kn1.f
    public void c(java.lang.Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        ((java.lang.Boolean) objArr[0]).booleanValue();
        qn1.d j17 = i().j();
        j17.getClass();
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(new qn1.i(j17), 100L);
    }

    @Override // kn1.f
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcModel", "startWakeLock");
        com.tencent.mm.sdk.platformtools.u3.h(new qn1.a(this));
    }

    @Override // kn1.f
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcModel", "stopWakeLock");
        com.tencent.mm.sdk.platformtools.u3.h(new qn1.b(this));
    }

    public ln1.g h() {
        if (this.f364943n == null) {
            this.f364943n = new ln1.g();
        }
        return this.f364943n;
    }

    public qn1.d j() {
        if (this.f364939j == null) {
            this.f364939j = new qn1.d();
        }
        return this.f364939j;
    }

    public qn1.t k() {
        if (this.f364941l == null) {
            this.f364941l = new qn1.t();
        }
        return this.f364941l;
    }

    public qn1.c0 l() {
        if (this.f364940k == null) {
            this.f364940k = new qn1.c0();
        }
        return this.f364940k;
    }

    public xn1.h m() {
        if (this.f364942m == null) {
            xn1.h hVar = new xn1.h();
            this.f364942m = hVar;
            hVar.f455463i = xn1.a.f455452e;
        }
        return this.f364942m;
    }
}
