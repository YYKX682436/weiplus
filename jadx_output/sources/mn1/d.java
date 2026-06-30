package mn1;

/* loaded from: classes12.dex */
public class d extends kn1.f {

    /* renamed from: p, reason: collision with root package name */
    public static mn1.d f329830p;

    /* renamed from: j, reason: collision with root package name */
    public mn1.y f329831j;

    /* renamed from: k, reason: collision with root package name */
    public mn1.e f329832k;

    /* renamed from: l, reason: collision with root package name */
    public xn1.h f329833l;

    /* renamed from: m, reason: collision with root package name */
    public ln1.g f329834m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f329835n = "tickit";

    /* renamed from: o, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f329836o = null;

    public static mn1.d i() {
        if (f329830p == null) {
            mn1.d dVar = new mn1.d();
            f329830p = dVar;
            kn1.a.a(dVar);
        }
        return f329830p;
    }

    @Override // kn1.a
    public void b() {
        f329830p = null;
    }

    @Override // kn1.f
    public void c(java.lang.Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new mn1.a(this, (java.lang.String) objArr[0]));
    }

    @Override // kn1.f
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveModel", "startWakeLock");
        com.tencent.mm.sdk.platformtools.u3.h(new mn1.b(this));
    }

    @Override // kn1.f
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveModel", "stopWakeLock");
        com.tencent.mm.sdk.platformtools.u3.h(new mn1.c(this));
    }

    public ln1.g h() {
        if (this.f329834m == null) {
            this.f329834m = new ln1.g();
        }
        return this.f329834m;
    }

    public mn1.e j() {
        if (this.f329832k == null) {
            this.f329832k = new mn1.e();
        }
        return this.f329832k;
    }

    public mn1.y k() {
        if (this.f329831j == null) {
            this.f329831j = new mn1.y();
        }
        return this.f329831j;
    }

    public xn1.h l() {
        if (this.f329833l == null) {
            this.f329833l = new xn1.h();
        }
        return this.f329833l;
    }
}
