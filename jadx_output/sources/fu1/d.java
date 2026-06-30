package fu1;

/* loaded from: classes4.dex */
public class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f266825d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f266826e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f266827f;

    /* renamed from: g, reason: collision with root package name */
    public int f266828g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f266829h;

    /* renamed from: i, reason: collision with root package name */
    public int f266830i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f266831m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f266832n;

    public d(java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.oi4();
        lVar.f70665b = new r45.pi4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/marksharecard";
        lVar.f70667d = 1078;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f266825d = a17;
        r45.oi4 oi4Var = (r45.oi4) a17.f70710a.f70684a;
        oi4Var.f382279d = str;
        oi4Var.f382281f = i18;
        oi4Var.f382280e = i17;
        oi4Var.f382282g = i19;
        this.f266832n = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f266826e = u0Var;
        return dispatch(sVar, this.f266825d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1078;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMarkShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", 1078, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.pi4 pi4Var = (r45.pi4) this.f266825d.f70711b.f70700a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMarkShareCard", "json_ret:" + pi4Var.f383076g);
            java.lang.String str2 = pi4Var.f383076g;
            if (android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneMarkShareCard", "parseJson json_ret is empty!");
            } else {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    this.f266827f = jSONObject.optString("mark_user");
                    this.f266828g = jSONObject.optInt("mark_succ", 0);
                    this.f266829h = jSONObject.optString("mark_card_id");
                    this.f266830i = jSONObject.optInt("expire_time", 0);
                    this.f266831m = jSONObject.optString("pay_qrcode_wording");
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneMarkShareCard", e17, "", new java.lang.Object[0]);
                }
            }
        }
        this.f266826e.onSceneEnd(i18, i19, str, this);
    }
}
