package t93;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t93.e f416573e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, t93.e eVar) {
        super(3);
        this.f416572d = str;
        this.f416573e = eVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj3).intValue();
        t93.e eVar = this.f416573e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("ret", java.lang.Integer.valueOf(intValue));
            jSONObject.putOpt("url", str);
            jSONObject.putOpt("requestId", this.f416572d);
            eVar.f143443f.c(jSONObject, false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiGetFinderLivePreviewUrl", e17, "", new java.lang.Object[0]);
            eVar.f143443f.a("fail");
        }
        return jz5.f0.f302826a;
    }
}
