package zv2;

/* loaded from: classes4.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final zv2.g0 f476405d = new zv2.g0();

    public g0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zv2.h0 h0Var = zv2.l0.f476408i;
        r45.n74 n74Var = new r45.n74();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("PostLinkVideoPageLiteapp");
            if (d17 == null) {
                d17 = "";
            }
            com.tencent.mars.xlog.Log.i("FinderConfig", "FINDER_POST_LINK_VIDEO_PAGE_LITEAPP PostLinkVideoPageLiteapp: dynamic config chars = ".concat(d17));
            byte[] decode = android.util.Base64.decode(d17, 0);
            kotlin.jvm.internal.o.f(decode, "decode(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(decode, r26.c.f368865a));
            n74Var.f381130d = jSONObject.optString("appId");
            n74Var.f381131e = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            n74Var.f381132f = jSONObject.optString("query");
            kotlin.Result.m521constructorimpl(n74Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        com.tencent.mars.xlog.Log.i("FinderTencentVideoWidget", "appId:" + n74Var.f381130d + " path:" + n74Var.f381131e + " query:" + n74Var.f381132f);
        return n74Var;
    }
}
