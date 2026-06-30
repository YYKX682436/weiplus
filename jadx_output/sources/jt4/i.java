package jt4;

/* loaded from: classes4.dex */
public class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f301657d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f301658e;

    /* renamed from: f, reason: collision with root package name */
    public r45.oz4 f301659f;

    /* renamed from: g, reason: collision with root package name */
    public int f301660g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f301661h = "";

    public i(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nz4();
        lVar.f70665b = new r45.oz4();
        lVar.f70667d = 1958;
        lVar.f70666c = "/cgi-bin/mmpay-bin/openecardauth";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f301658e = a17;
        r45.nz4 nz4Var = (r45.nz4) a17.f70710a.f70684a;
        nz4Var.f381774d = str;
        nz4Var.f381775e = str2;
        nz4Var.f381776f = i17;
        nz4Var.f381777g = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenECardAuth", "cardType: %s, scene: %d, token: %s, wxp_passwd_enc==null: %s", str, java.lang.Integer.valueOf(i17), str3, java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str2)));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenECardAuth", "cardType: %s, scene: %d", str, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f301657d = u0Var;
        return dispatch(sVar, this.f301658e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1958;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenECardAuth", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.oz4 oz4Var = (r45.oz4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f301659f = oz4Var;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(oz4Var.f382623d);
        r45.oz4 oz4Var2 = this.f301659f;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenECardAuth", "ret_code: %d, ret_msg: %s, is_token_invalid: %s", valueOf, oz4Var2.f382624e, java.lang.Boolean.valueOf(oz4Var2.f382628i));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f301659f.f382625f)) {
            java.lang.String str2 = this.f301659f.f382625f;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f301659f.f382625f);
                this.f301660g = jSONObject.optInt("retcode", 0);
                this.f301661h = jSONObject.optString("retmsg", "");
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneOpenECardAuth", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f301657d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
