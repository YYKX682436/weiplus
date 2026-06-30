package qn2;

/* loaded from: classes3.dex */
public final class l0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f365089a;

    /* renamed from: b, reason: collision with root package name */
    public final st2.h2 f365090b;

    public l0(qn2.i0 plugin) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f365089a = new java.lang.ref.WeakReference(plugin);
        com.tencent.mm.plugin.finder.live.view.k0 Y0 = plugin.Y0();
        this.f365090b = Y0 != null ? new st2.h2(Y0, "") : null;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String value = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mars.xlog.Log.i("VisitorLotteryCardDoneWidget", "navigate back with value ".concat(value));
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(value);
            boolean z17 = true;
            if (jSONObject.optInt("is_claim_prize", 0) == 1) {
                if (jSONObject.optInt("accept") != 1) {
                    z17 = false;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("VisitorLotteryCardDoneWidget", "accepted");
                    qn2.i0 i0Var = (qn2.i0) this.f365089a.get();
                    if (i0Var != null) {
                        i0Var.u1(new qn2.k0(i0Var));
                    }
                }
            } else {
                st2.h2 h2Var = this.f365090b;
                if (h2Var != null) {
                    h2Var.onReceiveValue(value);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("VisitorLotteryCardDoneWidget", e17, "parse back value failed", new java.lang.Object[0]);
        }
    }
}
