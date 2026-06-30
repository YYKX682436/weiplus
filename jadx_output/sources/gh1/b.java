package gh1;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "createMagicBrushFrameSetRoot";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (!data.has(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
            s().invoke(i(new lc3.z(1, "fail")));
            return;
        }
        java.lang.String optString = data.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, ya.b.INDEX);
        java.lang.String optString2 = data.optString("query", "");
        boolean optBoolean = data.optBoolean("useClientClick", false);
        lc3.e eVar = this.f317890a;
        kotlin.jvm.internal.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MagicSclMBFrameBiz");
        fh1.x0 x0Var = (fh1.x0) eVar;
        kotlin.jvm.internal.o.d(optString);
        kotlin.jvm.internal.o.d(optString2);
        com.tencent.mars.xlog.Log.i(x0Var.A, "createFrameSetRoot: " + x0Var.B);
        if (x0Var.B == null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            x0Var.B = x0Var.H0(x0Var, context, "MagicWeAppMagicBrushFrame", optString, optString2, optBoolean);
        }
        s().invoke(k());
    }
}
