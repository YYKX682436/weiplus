package yn1;

/* loaded from: classes11.dex */
public final class r2 implements com.tencent.wechat.aff.migration.h {

    /* renamed from: f, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f463809f;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.migration.g f463810a;

    /* renamed from: b, reason: collision with root package name */
    public kotlinx.coroutines.r2 f463811b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f463812c;

    /* renamed from: d, reason: collision with root package name */
    public final yn1.d1 f463813d = new yn1.d1(this);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f463814e = jz5.h.b(new yn1.c1(this));

    static {
        new yn1.a1(null);
        f463809f = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
    }

    public r2() {
        try {
            com.tencent.mars.xlog.Log.w("MM.Mig.MigrationPlatformImpl", "Try to register network listener");
            c();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MM.Mig.MigrationPlatformImpl", "Fail to register network listener, e=" + e17);
        }
    }

    public final vn1.m a() {
        return (vn1.m) ((jz5.n) this.f463814e).getValue();
    }

    public boolean b() {
        bp1.d dVar = bp1.e.f23040a;
        bp1.f[] requiredPermissions = bp1.e.f23042c;
        kotlin.jvm.internal.o.g(requiredPermissions, "requiredPermissions");
        for (bp1.f fVar : requiredPermissions) {
            if (com.tencent.mm.sdk.platformtools.x2.f193071a.checkSelfPermission(fVar.f23043a) != 0) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        yn1.g2 g2Var = new yn1.g2(yn1.h2.f463688d);
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((android.net.ConnectivityManager) systemService).registerNetworkCallback(new android.net.NetworkRequest.Builder().addTransportType(0).addTransportType(1).addTransportType(6).build(), g2Var);
    }
}
