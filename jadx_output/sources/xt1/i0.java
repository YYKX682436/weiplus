package xt1;

/* loaded from: classes8.dex */
public class i0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456493d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456494e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456495f;

    /* renamed from: g, reason: collision with root package name */
    public int f456496g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456497h;

    /* renamed from: i, reason: collision with root package name */
    public int f456498i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456499m;

    public i0(java.util.LinkedList linkedList, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fc3();
        lVar.f70665b = new r45.gc3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getcardlistfromapp";
        lVar.f70667d = 1079;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456493d = a17;
        r45.fc3 fc3Var = (r45.fc3) a17.f70710a.f70684a;
        fc3Var.f374196d = linkedList;
        fc3Var.f374197e = i17;
        fc3Var.f374199g = str;
        fc3Var.f374200h = str2;
        fc3Var.f374202m = str3;
        fc3Var.f374201i = str4;
        fc3Var.f374203n = str5;
        fc3Var.f374204o = i18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456494e = u0Var;
        return dispatch(sVar, this.f456493d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1079;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, errType = " + i18 + " errCode = " + i19 + " netType = 1079");
        if (i18 == 0 && i19 == 0) {
            java.lang.String str2 = ((r45.gc3) this.f456493d.f70711b.f70700a).f375083d;
            this.f456495f = str2;
            if (android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData json_ret is empty!");
            } else {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(this.f456495f);
                    this.f456496g = jSONObject.optInt("accept_button_status", 0);
                    this.f456497h = jSONObject.optString("accept_button_wording");
                    this.f456498i = jSONObject.optInt("private_status", 0);
                    this.f456499m = jSONObject.optString("private_wording");
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetCardListFromApp", e17, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData:" + e17.getMessage());
                }
            }
        }
        this.f456494e.onSceneEnd(i18, i19, str, this);
    }
}
