package qe;

/* loaded from: classes7.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.tcp.libmmtcp.TcpNative f361975a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f361976b = true;

    /* renamed from: c, reason: collision with root package name */
    public final qe.l0 f361977c = new qe.l0(this, new qe.k0(this));

    public void a(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.mars.xlog.Log.i("Luggage.TcpNativeInstallHelper", "createTcpBinding");
        if (tVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.TcpNativeInstallHelper", "createTcpBinding jsruntime is null");
            return;
        }
        com.tencent.mm.tcp.libmmtcp.c.f196412a.loadLibrary("mmtcp");
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.TcpNativeInstallHelper", "createTcpBinding jsThreadHandler is null");
            return;
        }
        qe.g0 g0Var = (qe.g0) i95.n0.c(qe.g0.class);
        if (g0Var != null) {
            boolean wi6 = ((yc1.g0) g0Var).wi();
            this.f361976b = wi6;
            com.tencent.mars.xlog.Log.i("Luggage.TcpNativeInstallHelper", "createTcpBinding xLibUVSwitch:%b ", java.lang.Boolean.valueOf(wi6));
        }
        f0Var.k0(new qe.j0(this, tVar, new qe.i0(this, new java.lang.ref.WeakReference(f0Var))));
    }

    public void b(com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        com.tencent.mars.xlog.Log.i("Luggage.TcpNativeInstallHelper", "destroyTcpBinding");
        if (tVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.TcpNativeInstallHelper", "destroyTcpBinding jsruntime is null");
        } else {
            ((com.tencent.mm.plugin.appbrand.jsruntime.y) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class)).r(this.f361977c);
        }
    }
}
