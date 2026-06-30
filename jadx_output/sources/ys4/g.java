package ys4;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.wallet_core.model.z0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465232d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f465233e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f465234f;

    /* renamed from: g, reason: collision with root package name */
    public long f465235g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465236h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465237i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465238m;

    /* renamed from: n, reason: collision with root package name */
    public at4.y0 f465239n;

    /* renamed from: o, reason: collision with root package name */
    public at4.h0 f465240o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f465241p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f465242q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f465243r;

    public g(java.lang.String str, java.lang.String str2, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("flag", "1");
        hashMap.put("true_name", str);
        hashMap.put("identify_card", str2);
        hashMap.put("cre_type", "1");
        hashMap.put("realname_scene", i17 + "");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRealNameVerify", "realname_scene=%d", java.lang.Integer.valueOf(i17));
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void configRequest(boolean z17, boolean z18) {
        com.tencent.mm.modelbase.o commReqResp = getCommReqResp();
        if (commReqResp == null) {
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.fl6();
            lVar.f70665b = new r45.gl6();
            lVar.f70666c = "/cgi-bin/mmpay-bin/tenpay/realnameauthen";
            lVar.f70667d = 1616;
            lVar.f70668e = 185;
            lVar.f70669f = 1000000185;
            commReqResp = lVar.a();
            commReqResp.setIsUserCmd(true);
        }
        r45.fl6 fl6Var = (r45.fl6) commReqResp.f70710a.f70684a;
        if (z18) {
            fl6Var.f374428e = 1;
        }
        setCommReqResp(commReqResp);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.callback = u0Var;
        return dispatch(sVar, this.f214040rr, this);
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public java.lang.String getEncryptUrl(java.lang.String str) {
        return com.tenpay.android.wechat.TenpayUtil.signWith3Des(str);
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public int getPayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public com.tencent.mm.wallet_core.model.e1 getRetModel(com.tencent.mm.modelbase.o oVar) {
        r45.gl6 gl6Var = (r45.gl6) oVar.f70711b.f70700a;
        com.tencent.mm.wallet_core.model.e1 e1Var = new com.tencent.mm.wallet_core.model.e1();
        int i17 = gl6Var.f375345g;
        e1Var.f213890c = gl6Var.f375344f;
        e1Var.f213889b = gl6Var.f375343e;
        e1Var.f213888a = gl6Var.f375342d;
        e1Var.f213892e = gl6Var.f375347i;
        e1Var.f213891d = gl6Var.f375346h;
        return e1Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1616;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        at4.h0 h0Var;
        if (i17 == 0) {
            this.f465232d = jSONObject.optString("token");
            this.f465233e = jSONObject.optBoolean("is_need_bind");
            this.f465234f = jSONObject.optBoolean("is_need_face");
            jSONObject.optBoolean("is_need_Laund");
            jSONObject.optString("laundh5");
            this.f465235g = jSONObject.optLong(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            this.f465236h = jSONObject.optString("package", "");
            this.f465237i = jSONObject.optString("packagesign", "");
            this.f465238m = jSONObject.optString("addbankword");
            this.f465243r = this.f465232d;
            this.f465239n = at4.y0.b(jSONObject);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("under_age_mid_dialog");
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                kotlin.jvm.internal.o.f(optString, "optString(...)");
                java.lang.String optString2 = optJSONObject.optString("wording");
                kotlin.jvm.internal.o.f(optString2, "optString(...)");
                java.lang.String optString3 = optJSONObject.optString("btn_cancel");
                kotlin.jvm.internal.o.f(optString3, "optString(...)");
                java.lang.String optString4 = optJSONObject.optString("btn_confirm");
                kotlin.jvm.internal.o.f(optString4, "optString(...)");
                h0Var = new at4.h0(optString, optString2, optString3, optString4);
            } else {
                h0Var = null;
            }
            this.f465240o = h0Var;
            this.f465241p = jSONObject.optString("under_age_session_id");
            this.f465242q = jSONObject.optString("underage_msg_preview");
        }
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public java.lang.String parseErrDialogCancelBtnText(org.json.JSONObject jSONObject) {
        return jSONObject.optString("error_btn_cancel");
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public java.lang.String parseErrDialogOkBtnText(org.json.JSONObject jSONObject) {
        return jSONObject.optString("error_btn_confirm");
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void putToReqText(com.tencent.mm.modelbase.o oVar, r45.cu5 cu5Var) {
        ((r45.fl6) oVar.f70710a.f70684a).f374429f = cu5Var;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void putToWXReqText(com.tencent.mm.modelbase.o oVar, r45.cu5 cu5Var) {
        ((r45.fl6) oVar.f70710a.f70684a).f374430g = cu5Var;
    }

    public g(java.lang.String str, java.lang.String str2, int i17, int i18, com.tencent.mm.plugin.wallet_core.id_verify.model.Profession profession, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j17, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, boolean z17, java.lang.String str13, int i19, java.lang.String str14) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("flag", "1");
        hashMap.put("true_name", str);
        hashMap.put("identify_card", str2);
        hashMap.put("realname_scene", i17 + "");
        hashMap.put("cre_type", java.lang.String.valueOf(i18));
        if (profession != null) {
            hashMap.put("profession_name", profession.f179421d);
            hashMap.put("profession_type", java.lang.String.valueOf(profession.f179422e));
        }
        hashMap.put("user_country", str3);
        hashMap.put("user_province", str4);
        hashMap.put("user_city", str5);
        hashMap.put("cre_expire_date", str6);
        hashMap.put("creid_renewal", java.lang.String.valueOf(j17));
        hashMap.put("birth_date", str7);
        hashMap.put("nationality", str8);
        hashMap.put("session_id", str9);
        hashMap.put("cre_effect_date", str10);
        hashMap.put("cre_effective_date", str10);
        hashMap.put("entry_scene", java.lang.String.valueOf(i19));
        hashMap.put("detail_address", str11);
        hashMap.put("sex", str12);
        if (z17) {
            hashMap.put("is_close_marketing", "true");
        }
        hashMap.put("cre_expire_date_plain", str13);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str14)) {
            hashMap.put("cre_begin_date", str14);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRealNameVerify", "realname_scene=%d", java.lang.Integer.valueOf(i19));
        setRequestData(hashMap);
    }
}
