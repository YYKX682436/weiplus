package h53;

/* loaded from: classes7.dex */
public class p implements sd.h {
    private static final java.lang.String TAG = "MicroMsg.LuggageGameJsRuntimeImpl";
    private boolean firstCreate = true;
    private android.content.Context mContext;
    private cl.q0 mEngine;

    public p(android.content.Context context) {
        this.mContext = context;
        init();
    }

    @Override // od.p
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        cl.q0 q0Var = this.mEngine;
        q0Var.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        ((cl.a) q0Var.f42724b).h(new cl.t0(q0Var, obj, str, android.webkit.JavascriptInterface.class), false);
    }

    @Override // sd.h
    public void destroy() {
        this.mEngine.c();
        ((cl.a) this.mEngine.f42724b).g();
        this.mContext = null;
    }

    @Override // od.p
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.mEngine.d(str, new h53.o(this, valueCallback));
    }

    @Override // od.p
    public android.content.Context getContext() {
        return this.mContext;
    }

    @Override // od.p
    public java.lang.String getUserAgent() {
        return ik1.l0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, "", (ik1.k0) nd.f.a(ik1.k0.class)) + " v8";
    }

    public void init() {
        boolean z17 = cl.x.f42817a;
        cl.e0 e0Var = new cl.e0(null);
        if (e0Var.B == null) {
            e0Var.B = new cl.q0(e0Var, e0Var.b(), new cl.d0(e0Var));
        }
        cl.q0 q0Var = e0Var.B;
        this.mEngine = q0Var;
        q0Var.g(1, new h53.n(this));
        addJavascriptInterface(new h53.l(), "WxGameJsCoreNative");
    }

    @Override // sd.h
    public void injectInitScript() {
        this.mEngine.d(ik1.f.e("luggage_mm_adapter.js"), null);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int a17 = ((b17.y - com.tencent.mm.ui.bl.a(com.tencent.mm.sdk.platformtools.x2.f193071a)) - com.tencent.mm.ui.bl.h(com.tencent.mm.sdk.platformtools.x2.f193071a)) - com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        float g17 = i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        evaluateJavascript(java.lang.String.format(ik1.f.e("game_jscore_system_info.js"), java.lang.String.valueOf(b17.x), java.lang.String.valueOf(a17), java.lang.String.valueOf(b17.x), java.lang.String.valueOf(b17.y), java.lang.String.valueOf(g17), formatedNetType, android.os.Build.BRAND, wo.w0.m(), java.lang.String.format("0x%08X", java.lang.Integer.valueOf(o45.wf.f343029g)), "Android-" + android.os.Build.VERSION.SDK_INT, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.C())), null);
    }
}
