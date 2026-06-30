package tg4;

/* loaded from: classes7.dex */
public abstract class c extends tg4.f {
    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("frameSetId", "");
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            gq0.r rVar = (gq0.r) i95.n0.c(gq0.r.class);
            kotlin.jvm.internal.o.d(optString);
            fq0.x Ai = ((fq0.z) rVar).Ai(optString);
            if (Ai != null) {
                magicSclViewContainer = Ai.f265488l;
            }
        }
        if (magicSclViewContainer != null) {
            pm0.v.X(new tg4.b(magicSclViewContainer, this, data));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MBBaseOperateCoverViewJsApi", "invoke JsApi failed, rootView is null");
            v("rootView is null");
        }
    }

    public final void v(java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        new lc3.a0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(errMsg)) {
            s().invoke(k());
        } else {
            s().invoke(h(1, errMsg));
        }
    }

    public void w(org.json.JSONObject data, com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer rootView, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        throw new java.lang.IllegalStateException("invokeImpl must be impl." + this);
    }
}
