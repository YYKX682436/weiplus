package vs3;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f439901d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f439902e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f439903f;

    /* renamed from: m, reason: collision with root package name */
    public int f439907m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f439908n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f439909o;

    /* renamed from: p, reason: collision with root package name */
    public vr4.e f439910p;

    /* renamed from: q, reason: collision with root package name */
    public vr4.e f439911q;

    /* renamed from: r, reason: collision with root package name */
    public vr4.e f439912r;

    /* renamed from: s, reason: collision with root package name */
    public vr4.e f439913s;

    /* renamed from: t, reason: collision with root package name */
    public vr4.e f439914t;

    /* renamed from: u, reason: collision with root package name */
    public vr4.a1 f439915u;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f439918x;

    /* renamed from: y, reason: collision with root package name */
    public final int f439919y;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f439904g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f439905h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f439906i = "";

    /* renamed from: v, reason: collision with root package name */
    public int f439916v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f439917w = "";

    public g(java.lang.String str, int i17) {
        this.f439903f = "";
        this.f439903f = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.t55();
        lVar.f70665b = new r45.u55();
        lVar.f70666c = "/cgi-bin/mmpay-bin/paychargeproxy";
        lVar.f70667d = 1571;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f439902e = a17;
        r45.t55 t55Var = (r45.t55) a17.f70710a.f70684a;
        t55Var.f386158d = i17;
        this.f439919y = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePayChargeProxy", "cmdId: %d", java.lang.Integer.valueOf(i17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePayChargeProxy", "hy: requesting phone num: %s", str);
        t55Var.f386159e = java.lang.String.format("phone=%s", str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f439901d = u0Var;
        return dispatch(sVar, this.f439902e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1571;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.String string;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePayChargeProxy", "hy: NetScenePayChargeProxy end: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f439916v = i19;
        if (i18 == 0 && i19 == 0) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((r45.u55) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f387075d);
                jSONObject.toString();
                this.f439904g = jSONObject.optString("appId");
                this.f439916v = jSONObject.optInt("errCode", -1);
                this.f439917w = jSONObject.optString("errMsg", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kng));
                if (this.f439916v < 0) {
                    this.f439905h = true;
                } else {
                    this.f439905h = false;
                }
                this.f439906i = jSONObject.optString("desc");
                this.f439907m = jSONObject.optInt("userTag", 0);
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("productList");
                if (optJSONArray != null) {
                    this.f439908n = new java.util.ArrayList();
                    this.f439909o = new java.util.ArrayList();
                    int i27 = 0;
                    while (i27 < optJSONArray.length()) {
                        org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i27);
                        org.json.JSONArray jSONArray = optJSONArray;
                        vr4.b1 b1Var = new vr4.b1();
                        b1Var.f439692f = jSONObject2.optString("desc", "");
                        b1Var.f439690d = jSONObject2.optString(dm.i4.COL_ID, "");
                        b1Var.f439691e = jSONObject2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "");
                        b1Var.f439693g = jSONObject2.optInt("status", 0);
                        b1Var.f439694h = jSONObject2.optString("url", "");
                        b1Var.f439695i = jSONObject2.optInt("type");
                        b1Var.f439696m = jSONObject2.optString("typeName");
                        b1Var.f439698o = jSONObject2.optString("isColor", "0");
                        b1Var.f439699p = jSONObject2.optString("colorCode", "0");
                        b1Var.f439700q = jSONObject2.optInt("isReConfirm", 0);
                        b1Var.f439701r = jSONObject2.optString("weappID");
                        b1Var.f439702s = jSONObject2.optString("weappPath");
                        b1Var.f439703t = jSONObject2.optInt("isRecommend", 0);
                        b1Var.f439704u = jSONObject2.optString("recommendId", "");
                        if (b1Var.f439695i == 1) {
                            this.f439908n.add(b1Var);
                        } else {
                            b1Var.f439697n = jSONObject2.optString("productAttr");
                            this.f439909o.add(b1Var);
                        }
                        i27++;
                        optJSONArray = jSONArray;
                    }
                } else {
                    this.f439908n = null;
                    this.f439909o = null;
                }
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("weSim");
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString("url");
                    java.lang.String optString2 = optJSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                    java.lang.String optString3 = optJSONObject.optString("weappID");
                    java.lang.String optString4 = optJSONObject.optString("weappPath");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.NetScenePayChargeProxy", "tf: weSim is missing");
                        this.f439913s = null;
                    } else {
                        vr4.e eVar = new vr4.e();
                        this.f439913s = eVar;
                        eVar.f439712d = optString;
                        eVar.f439713e = optString2;
                        eVar.f439714f = optString3;
                        eVar.f439715g = optString4;
                    }
                }
                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("wxRemind");
                if (optJSONObject2 != null) {
                    java.lang.String optString5 = optJSONObject2.optString("url");
                    java.lang.String optString6 = optJSONObject2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                    java.lang.String optString7 = optJSONObject2.optString("weappID");
                    java.lang.String optString8 = optJSONObject2.optString("weappPath");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(optString6)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.NetScenePayChargeProxy", "hy: remind unicom unnecessary element missing");
                        this.f439910p = null;
                    } else {
                        vr4.e eVar2 = new vr4.e();
                        this.f439910p = eVar2;
                        eVar2.f439712d = optString5;
                        eVar2.f439713e = optString6;
                        eVar2.f439714f = optString7;
                        eVar2.f439715g = optString8;
                    }
                } else {
                    this.f439910p = null;
                }
                org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("wxCard");
                if (optJSONObject3 != null) {
                    java.lang.String optString9 = optJSONObject3.optString("url");
                    java.lang.String optString10 = optJSONObject3.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                    java.lang.String optString11 = optJSONObject3.optString("weappID");
                    java.lang.String optString12 = optJSONObject3.optString("weappPath");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(optString10)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.NetScenePayChargeProxy", "hy: phone card necessary element missing");
                        this.f439911q = null;
                    } else {
                        vr4.e eVar3 = new vr4.e();
                        this.f439911q = eVar3;
                        eVar3.f439712d = optString9;
                        eVar3.f439713e = optString10;
                        eVar3.f439714f = optString11;
                        eVar3.f439715g = optString12;
                    }
                } else {
                    this.f439911q = null;
                }
                org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("wxWt");
                if (optJSONObject4 != null) {
                    java.lang.String optString13 = optJSONObject4.optString("url");
                    java.lang.String optString14 = optJSONObject4.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                    java.lang.String optString15 = optJSONObject4.optString("weappID");
                    java.lang.String optString16 = optJSONObject4.optString("weappPath");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(optString14)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.NetScenePayChargeProxy", "hy: phone hall necessary element missing");
                        this.f439912r = null;
                    } else {
                        vr4.e eVar4 = new vr4.e();
                        this.f439912r = eVar4;
                        eVar4.f439712d = optString13;
                        eVar4.f439713e = optString14;
                        eVar4.f439714f = optString15;
                        eVar4.f439715g = optString16;
                    }
                } else {
                    this.f439912r = null;
                }
                org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("banner");
                if (optJSONObject5 != null) {
                    vr4.a1 a1Var = new vr4.a1();
                    this.f439915u = a1Var;
                    a1Var.f439675d = optJSONObject5.getInt(dm.i4.COL_ID);
                    this.f439915u.f439676e = optJSONObject5.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                    this.f439915u.f439677f = optJSONObject5.optString("url");
                    this.f439915u.f439678g = optJSONObject5.optString("weappID");
                    this.f439915u.f439679h = optJSONObject5.optString("weappPath");
                } else {
                    this.f439915u = null;
                }
                org.json.JSONObject optJSONObject6 = jSONObject.optJSONObject("headEnter");
                if (optJSONObject6 != null) {
                    java.lang.String optString17 = optJSONObject6.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                    java.lang.String optString18 = optJSONObject6.optString("url");
                    java.lang.String optString19 = optJSONObject6.optString("weappID");
                    java.lang.String optString20 = optJSONObject6.optString("weappPath");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(optString17)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.NetScenePayChargeProxy", "tf: headEnter is missing");
                        this.f439914t = null;
                    } else {
                        vr4.e eVar5 = new vr4.e();
                        this.f439914t = eVar5;
                        eVar5.f439713e = optString17;
                        eVar5.f439712d = optString18;
                        eVar5.f439714f = optString19;
                        eVar5.f439715g = optString20;
                    }
                } else {
                    this.f439914t = null;
                }
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("numberList");
                if (optJSONArray2 != null) {
                    com.tencent.mm.sdk.platformtools.t8.K0(this.f439903f);
                    if (optJSONArray2.length() <= 0) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.NetScenePayChargeProxy", "number length is short! %s", java.lang.Integer.valueOf(optJSONArray2.length()));
                        this.f439918x = null;
                    } else {
                        this.f439918x = new java.util.ArrayList();
                        for (int i28 = 0; i28 < optJSONArray2.length(); i28++) {
                            org.json.JSONObject optJSONObject7 = optJSONArray2.optJSONObject(i28);
                            if (optJSONObject7 != null) {
                                java.lang.String optString21 = optJSONObject7.optString("number");
                                java.lang.String optString22 = optJSONObject7.optString("desc");
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString21)) {
                                    this.f439918x.add(new vs3.a(optString21, "", optString22, 2));
                                }
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePayChargeProxy", "number list: %s, %s", java.lang.Integer.valueOf(this.f439918x.size()), optJSONArray2.toString());
                    }
                } else {
                    this.f439918x = null;
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetScenePayChargeProxy", "empty numberList");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetScenePayChargeProxy", "hy: exception occurred when parsing json: %s", e17.toString());
                this.f439905h = true;
                this.f439917w = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kng);
            }
            string = str;
        } else {
            this.f439905h = true;
            string = com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkk) : str;
            this.f439917w = string;
        }
        this.f439901d.onSceneEnd(i18, i19, string, this);
    }
}
