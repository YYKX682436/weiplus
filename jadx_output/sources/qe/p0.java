package qe;

/* loaded from: classes7.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f361983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.udp.libmmudp.UdpNative.NativeCallBackInterface f361984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe.s0 f361985f;

    public p0(qe.s0 s0Var, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.udp.libmmudp.UdpNative.NativeCallBackInterface nativeCallBackInterface) {
        this.f361985f = s0Var;
        this.f361983d = tVar;
        this.f361984e = nativeCallBackInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("Luggage.UdpNativeInstallHelper", "createUdpBinding InitCallBack ");
        qe.s0 s0Var = this.f361985f;
        if (s0Var.f361990a != null) {
            com.tencent.mars.xlog.Log.i("Luggage.UdpNativeInstallHelper", "createUdpBinding udpNative != null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) this.f361983d.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
        if (l0Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.UdpNativeInstallHelper", "createUdpBinding v8Addon is null");
            return;
        }
        if (s0Var.f361991b) {
            s0Var.f361990a = new com.tencent.mm.udp.libmmudp.UdpNative(l0Var.L(), l0Var.G(), l0Var.z());
        } else {
            s0Var.f361990a = new com.tencent.mm.udp.libmmudp.UdpNative(l0Var.L(), l0Var.G(), 0L);
        }
        com.tencent.mars.xlog.Log.i("Luggage.UdpNativeInstallHelper", "createUdpBinding InitCallBack ret:%d", java.lang.Integer.valueOf(s0Var.f361990a.setCallBack(this.f361984e)));
    }
}
