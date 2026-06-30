package qe;

/* loaded from: classes7.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f362002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.d1 f362003e;

    public w0(qe.d1 d1Var, com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        this.f362003e = d1Var;
        this.f362002d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "createWcWssBinding setCallback ");
        qe.d1 d1Var = this.f362003e;
        if (d1Var.f361928a != null) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding mContextId != null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) this.f362002d.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
        if (l0Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding v8Addon is null");
            return;
        }
        d1Var.f361935h = new com.tencent.mm.websocket.libwcwss.WcwssNative();
        com.tencent.mm.websocket.libwcwss.WcwssNative wcwssNative = d1Var.f361935h;
        if (wcwssNative == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "createWcWssBinding mWcwssNative = null");
            return;
        }
        if (d1Var.f361933f) {
            d1Var.f361928a = wcwssNative.initWcwss(l0Var.L(), l0Var.G(), l0Var.z());
        } else {
            d1Var.f361928a = wcwssNative.initWcwss(l0Var.L(), l0Var.G(), 0L);
        }
        d1Var.f361929b = d1Var.f361935h.setCallback(d1Var.f361937j, d1Var.f361936i);
        com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "createWcWssBinding setCallback mContextId:%s,mInitCallBack:%d", d1Var.f361928a, java.lang.Integer.valueOf(d1Var.f361929b));
    }
}
