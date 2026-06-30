package qe;

/* loaded from: classes7.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f361966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.tcp.libmmtcp.TcpNative.NativeCallBackInterface f361967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe.m0 f361968f;

    public j0(qe.m0 m0Var, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.tcp.libmmtcp.TcpNative.NativeCallBackInterface nativeCallBackInterface) {
        this.f361968f = m0Var;
        this.f361966d = tVar;
        this.f361967e = nativeCallBackInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("Luggage.TcpNativeInstallHelper", "createTcpBinding InitCallBack ");
        qe.m0 m0Var = this.f361968f;
        if (m0Var.f361975a != null) {
            com.tencent.mars.xlog.Log.i("Luggage.TcpNativeInstallHelper", "createTcpBinding tcpNative != null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) this.f361966d.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
        if (l0Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.TcpNativeInstallHelper", "createTcpBinding v8Addon is null");
            return;
        }
        if (m0Var.f361976b) {
            m0Var.f361975a = new com.tencent.mm.tcp.libmmtcp.TcpNative(l0Var.L(), l0Var.G(), l0Var.z());
        } else {
            m0Var.f361975a = new com.tencent.mm.tcp.libmmtcp.TcpNative(l0Var.L(), l0Var.G(), 0L);
        }
        com.tencent.mars.xlog.Log.i("Luggage.TcpNativeInstallHelper", "createTcpBinding InitCallBack ret:%d", java.lang.Integer.valueOf(m0Var.f361975a.setCallBack(this.f361967e)));
    }
}
