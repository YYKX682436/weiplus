package jt4;

/* loaded from: classes9.dex */
public class h extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f301649d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f301650e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qz4 f301651f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f301652g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f301653h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f301654i;

    /* renamed from: m, reason: collision with root package name */
    public int f301655m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f301656n;

    public h(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, boolean z17, boolean z18, int i18, java.lang.String str6) {
        this(str, str2, str3, str4, str5, i17, z17, false, z18, i18, str6);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f301649d = u0Var;
        return dispatch(sVar, this.f301650e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_CORRUPT;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenECard", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.qz4 qz4Var = (r45.qz4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f301651f = qz4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenECard", "ret_code: %d, ret_msg: %s", java.lang.Integer.valueOf(qz4Var.f384366d), this.f301651f.f384367e);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f301651f.f384368f)) {
            java.lang.String str2 = this.f301651f.f384368f;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f301651f.f384368f);
                this.f301655m = jSONObject.optInt("retcode", 0);
                this.f301656n = jSONObject.optString("retmsg", "");
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneOpenECard", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f301649d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    public h(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, boolean z17, boolean z18, boolean z19, int i18, java.lang.String str6) {
        this.f301655m = 0;
        this.f301656n = "";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pz4();
        lVar.f70665b = new r45.qz4();
        lVar.f70667d = com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_CORRUPT;
        lVar.f70666c = "/cgi-bin/mmpay-bin/openecard";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f301650e = a17;
        r45.pz4 pz4Var = (r45.pz4) a17.f70710a.f70684a;
        pz4Var.f383491d = str;
        pz4Var.f383492e = str2;
        a17.setIsUserCmd(true);
        if (z17) {
            pz4Var.f383493f = str3;
        } else {
            pz4Var.f383494g = str3;
        }
        if (z18) {
            pz4Var.f383498n = 1;
        } else {
            pz4Var.f383498n = 0;
        }
        pz4Var.f383495h = str4;
        pz4Var.f383496i = str5;
        pz4Var.f383497m = i17;
        pz4Var.f383499o = z19;
        pz4Var.f383500p = i18;
        pz4Var.f383501q = str6;
        this.f301652g = str3;
        this.f301653h = str4;
        this.f301654i = str5;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenECard", "cardType: %s, reqSerial: %s, openScene: %s, mobileNo: %s, bankType: %s, bankCardInfo: %s, fromScene: %s", str, str2, java.lang.Integer.valueOf(i17), str4, str5, str6, java.lang.Integer.valueOf(i18));
    }

    public h(java.lang.String str, java.lang.String str2, int i17) {
        this.f301655m = 0;
        this.f301656n = "";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pz4();
        lVar.f70665b = new r45.qz4();
        lVar.f70667d = com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_CORRUPT;
        lVar.f70666c = "/cgi-bin/mmpay-bin/openecard";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f301650e = a17;
        r45.pz4 pz4Var = (r45.pz4) a17.f70710a.f70684a;
        pz4Var.f383491d = str;
        pz4Var.f383492e = str2;
        a17.setIsUserCmd(true);
        pz4Var.f383498n = 0;
        pz4Var.f383497m = i17;
        pz4Var.f383500p = 1;
        pz4Var.f383499o = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenECard", "create NetSceneOpenECard with reuse exist card, cardType: %s, reqSerial: %s, openScene: %s", str, str2, java.lang.Integer.valueOf(i17));
    }
}
