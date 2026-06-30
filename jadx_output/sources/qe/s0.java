package qe;

/* loaded from: classes7.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.udp.libmmudp.UdpNative f361990a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f361991b = true;

    /* renamed from: c, reason: collision with root package name */
    public final qe.r0 f361992c = new qe.r0(this, new qe.q0(this));

    public void a(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.mars.xlog.Log.i("Luggage.UdpNativeInstallHelper", "createUdpBinding");
        if (tVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.UdpNativeInstallHelper", "createUdpBinding jsruntime is null");
            return;
        }
        com.tencent.mm.udp.libmmudp.c.f196448a.loadLibrary("mmudp");
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.UdpNativeInstallHelper", "createUdpBinding jsThreadHandler is null");
            return;
        }
        qe.g0 g0Var = (qe.g0) i95.n0.c(qe.g0.class);
        if (g0Var != null) {
            boolean wi6 = ((yc1.g0) g0Var).wi();
            this.f361991b = wi6;
            com.tencent.mars.xlog.Log.i("Luggage.UdpNativeInstallHelper", "createUdpBinding xLibUVSwitch:%b ", java.lang.Boolean.valueOf(wi6));
        }
        f0Var.k0(new qe.p0(this, tVar, new qe.o0(this, new java.lang.ref.WeakReference(f0Var))));
    }

    public void b(com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        com.tencent.mars.xlog.Log.i("Luggage.UdpNativeInstallHelper", "destroyUdpBinding");
        if (tVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.UdpNativeInstallHelper", "destroyUdpBinding jsruntime is null");
        } else {
            ((com.tencent.mm.plugin.appbrand.jsruntime.y) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class)).r(this.f361992c);
        }
    }
}
