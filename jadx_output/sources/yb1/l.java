package yb1;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f460664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f460665e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17, kotlinx.coroutines.q qVar) {
        super(1);
        this.f460664d = i17;
        this.f460665e = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject optJSONObject;
        java.lang.String params = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPageContentService", "getDocument callbackId:" + this.f460664d + ", params:" + params);
        int i17 = -1;
        try {
            org.json.JSONObject optJSONObject2 = new org.json.JSONObject(params).optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("root")) != null) {
                i17 = optJSONObject.optInt("nodeId", -1);
            }
        } catch (java.lang.Exception unused) {
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f460665e).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(i17)));
        return jz5.f0.f302826a;
    }
}
