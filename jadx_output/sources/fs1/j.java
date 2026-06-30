package fs1;

/* loaded from: classes7.dex */
public final class j implements sd.h {

    /* renamed from: d, reason: collision with root package name */
    public static final fs1.j f266291d = new fs1.j();

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.jsruntime.r f266292e = null;

    /* renamed from: f, reason: collision with root package name */
    public static od.l f266293f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f266294g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f266295h = "";

    public static final java.lang.Object a(fs1.j jVar, kotlin.coroutines.Continuation continuation) {
        jVar.getClass();
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int a17 = ((b17.y - com.tencent.mm.ui.bl.a(com.tencent.mm.sdk.platformtools.x2.f193071a)) - com.tencent.mm.ui.bl.h(com.tencent.mm.sdk.platformtools.x2.f193071a)) - com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        float g17 = i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.String e17 = ik1.f.e("game_jscore_system_info.js");
        kotlin.jvm.internal.o.d(e17);
        java.lang.String valueOf = java.lang.String.valueOf(b17.x);
        java.lang.String valueOf2 = java.lang.String.valueOf(a17);
        java.lang.String valueOf3 = java.lang.String.valueOf(b17.x);
        java.lang.String valueOf4 = java.lang.String.valueOf(b17.y);
        java.lang.String valueOf5 = java.lang.String.valueOf(g17);
        java.lang.String str = android.os.Build.BRAND;
        java.lang.String m17 = wo.w0.m();
        java.lang.String format = java.lang.String.format("0x%08X", java.util.Arrays.copyOf(new java.lang.Object[]{new java.lang.Integer(o45.wf.f343029g)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        java.lang.String format2 = java.lang.String.format(e17, java.util.Arrays.copyOf(new java.lang.Object[]{valueOf, valueOf2, valueOf3, valueOf4, valueOf5, formatedNetType, str, m17, format, "Android-" + android.os.Build.VERSION.SDK_INT, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.C())}, 12));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        java.lang.Object b18 = jVar.b(format2, fs1.i.f266290d, continuation);
        return b18 == pz5.a.f359186d ? b18 : jz5.f0.f302826a;
    }

    @Override // od.p
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsruntime.r rVar = f266292e;
        if (rVar != null) {
            ((com.tencent.mm.plugin.appbrand.jsruntime.n) rVar).addJavascriptInterface(obj, str);
        }
    }

    public final java.lang.Object b(java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mm.plugin.appbrand.jsruntime.r rVar = f266292e;
        if (rVar != null) {
            ((com.tencent.mm.plugin.appbrand.jsruntime.n) rVar).evaluateJavascript(str, new fs1.b(lVar, nVar));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    @Override // sd.h
    public void destroy() {
        f266293f = null;
        com.tencent.mm.plugin.appbrand.jsruntime.r rVar = f266292e;
        if (rVar != null) {
            rVar.destroy();
        }
    }

    @Override // od.p
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        com.tencent.mm.plugin.appbrand.jsruntime.r rVar = f266292e;
        if (rVar != null) {
            ((com.tencent.mm.plugin.appbrand.jsruntime.n) rVar).evaluateJavascript(str, valueCallback);
        }
    }

    @Override // od.p
    public android.content.Context getContext() {
        return null;
    }

    @Override // od.p
    public java.lang.String getUserAgent() {
        return ik1.l0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, hy4.w.f286200f.a(), lu4.m.f321441d.a());
    }

    @Override // sd.h
    public void injectInitScript() {
    }
}
