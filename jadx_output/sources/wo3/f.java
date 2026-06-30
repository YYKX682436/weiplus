package wo3;

/* loaded from: classes8.dex */
public class f extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f448151d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f448152e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f448153f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f448154g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f448155h = -1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f448156i = "";

    /* renamed from: m, reason: collision with root package name */
    public final int f448157m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper f448158n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f448159o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f448160p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f448161q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f448162r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f448163s;

    public f(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f448157m = 1;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gy4();
        lVar.f70665b = new r45.hy4();
        lVar.f70666c = "/cgi-bin/mmpay-bin/offlinepayconfirm";
        lVar.f70667d = com.hilive.mediasdk.SdkInfo.ErrCode.kErrCodeFormatUnSupport;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.wallet_core.ui.r1.J(str3);
        lVar.f70671h = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f448152e = a17;
        r45.gy4 gy4Var = (r45.gy4) a17.f70710a.f70684a;
        gy4Var.f375638d = i17;
        gy4Var.f375639e = str;
        gy4Var.f375640f = str2;
        gy4Var.f375641g = at4.g0.c();
        this.f448157m = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f448151d = u0Var;
        return dispatch(sVar, this.f448152e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.hilive.mediasdk.SdkInfo.ErrCode.kErrCodeFormatUnSupport;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneOfflinePayConfirm", "Cmd : 609, errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        }
        r45.hy4 hy4Var = (r45.hy4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            try {
                if (hy4Var.f376555d != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(hy4Var.f376555d);
                    this.f448153f = jSONObject.optString(ya.b.TRANSACTION_ID);
                    this.f448154g = jSONObject.optInt("retcode");
                    jSONObject.optString("retmsg");
                    this.f448155h = jSONObject.optInt("wx_error_type");
                    this.f448156i = jSONObject.optString("wx_error_msg");
                    jSONObject.toString();
                    if (jSONObject.has("real_name_info")) {
                        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("real_name_info");
                        this.f448159o = optJSONObject.optString("guide_flag");
                        this.f448160p = optJSONObject.optString("guide_wording");
                        this.f448161q = optJSONObject.optString("left_button_wording");
                        this.f448162r = optJSONObject.optString("right_button_wording");
                        this.f448163s = optJSONObject.optString("upload_credit_url");
                        if ("1".equals(this.f448159o) || "2".equals(this.f448159o)) {
                            com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = new com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper();
                            this.f448158n = realnameGuideHelper;
                            realnameGuideHelper.d(this.f448159o, this.f448160p, this.f448161q, this.f448162r, this.f448163s, 0);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneOfflinePayConfirm", e17, "", new java.lang.Object[0]);
                str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkk);
                i18 = 1000;
                i19 = 2;
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f448151d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
