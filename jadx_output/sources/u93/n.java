package u93;

/* loaded from: classes15.dex */
public class n extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f425828g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f425829h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final m33.o1 f425830i = new u93.m(this);

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("fail: invalid_data");
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("localIds");
        this.f425828g = jSONObject.optString(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY);
        int optInt = jSONObject.optInt("postType");
        this.f425829h = optInt;
        com.tencent.mars.xlog.Log.i("LiteAppJsApiUploadGameMediaFile", "LiteAppJsApiUploadGameMediaFile identifier:%s postType:%d", this.f425828g, java.lang.Integer.valueOf(optInt));
        if (this.f425829h == 0 || optJSONArray == null || optJSONArray.length() == 0) {
            this.f143443f.a("fail: postType or localIds params error");
            return;
        }
        m33.p1 p1Var = (m33.p1) i95.n0.c(m33.p1.class);
        int i17 = this.f425829h;
        m33.o1 o1Var = this.f425830i;
        ((i53.o0) p1Var).getClass();
        i53.v0 v0Var = new i53.v0();
        java.util.LinkedList b17 = r53.f.b(optJSONArray);
        boolean z18 = false;
        if (com.tencent.mm.sdk.platformtools.t8.L0(b17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.GameHaowanUploadTask", "localIds is null or empty");
        } else if (i17 == 2 || i17 == 1) {
            v0Var.f288753e = o1Var;
            if (i17 == 2) {
                v0Var.f288749a.add((java.lang.String) b17.get(0));
                if (b17.size() > 1) {
                    v0Var.f288757i = (java.lang.String) b17.get(1);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Haowan.GameHaowanUploadTask", "postType == 2 but no thumbnail localId!");
                }
            } else {
                v0Var.f288749a.addAll(b17);
            }
            ((ku5.t0) ku5.t0.f312615d).g(new i53.r0(v0Var, i17));
            z18 = true;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.GameHaowanUploadTask", "unrecognized posttype:%d", java.lang.Integer.valueOf(i17));
        }
        if (z18) {
            return;
        }
        this.f143443f.a("fail: upload fail before real upload");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
