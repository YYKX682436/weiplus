package el;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el.k f253715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, el.k kVar) {
        super(3);
        this.f253714d = str;
        this.f253715e = kVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String errorMsg = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = this.f253714d;
        if (intValue2 == 0 && intValue == 0) {
            jSONObject.put("result", true);
            jSONObject.put("errMsg", errorMsg);
            jSONObject.put(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY, str);
        } else {
            jSONObject.put("result", false);
            jSONObject.put("errMsg", errorMsg);
            jSONObject.put(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY, str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiFavoriteAction", "[handleDeleteFavorite] errType = " + intValue2 + ", errCode = " + intValue + ", errMsg = " + errorMsg + ", identifier = " + str + ", return json = " + jSONObject);
        this.f253715e.f143443f.c(jSONObject, false);
        return jz5.f0.f302826a;
    }
}
