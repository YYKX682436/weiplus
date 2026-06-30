package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class r5 extends com.tencent.mm.plugin.luckymoney.model.p5 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f145581h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145582i;

    /* renamed from: m, reason: collision with root package name */
    public int f145583m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145584n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f145585o;

    /* renamed from: p, reason: collision with root package name */
    public long f145586p;

    /* renamed from: q, reason: collision with root package name */
    public int f145587q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.h0 f145588r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f145589s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.e1 f145590t = null;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper f145591u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.utils.n f145592v;

    public r5(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4) {
        this.f145581h = str;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sendId", str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        hashMap.put("way", i17 + "");
        hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, "2");
        hashMap.put("package", str3);
        hashMap.put("sessionUserName", str4);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public int I() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBusiOpen", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        this.f145582i = jSONObject.optString("spidName");
        jSONObject.optInt("hbStatus");
        this.f145583m = jSONObject.optInt("receiveStatus");
        this.f145584n = jSONObject.optString("statusMess");
        this.f145585o = jSONObject.optString("hintMess");
        this.f145586p = jSONObject.optLong("amount");
        jSONObject.optInt("recNum");
        this.f145587q = jSONObject.optInt("totalNum");
        this.f145588r = new com.tencent.mm.plugin.luckymoney.model.h0();
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("atomicFunc");
        if (optJSONObject2 != null) {
            this.f145588r.f145304d = optJSONObject2.optInt("enable");
            this.f145588r.f145306f = optJSONObject2.optString("fissionContent");
            this.f145588r.f145305e = optJSONObject2.optString("fissionUrl");
        }
        jSONObject.optInt("focusFlag");
        jSONObject.optString("focusWording");
        jSONObject.optString("focusAppidUserName");
        jSONObject.optInt("isFocus");
        this.f145589s = jSONObject.optString("smallHbButtonMess");
        try {
            com.tencent.mm.plugin.luckymoney.model.e1 d17 = com.tencent.mm.plugin.luckymoney.model.g5.d(jSONObject);
            this.f145590t = d17;
            d17.f145240m = jSONObject.optString("spidLogo");
            this.f145590t.f145239i = jSONObject.optString("spidName");
            this.f145590t.f145238h = jSONObject.optString("spidWishing");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneLuckyMoneyBusiOpen", "parse luckyMoneyDetail fail: " + e17.getLocalizedMessage());
        }
        if (i17 == 0 && jSONObject.has("real_name_info") && (optJSONObject = jSONObject.optJSONObject("real_name_info")) != null) {
            java.lang.String optString = optJSONObject.optString("guide_flag");
            java.lang.String optString2 = optJSONObject.optString("guide_wording");
            java.lang.String optString3 = optJSONObject.optString("left_button_wording");
            java.lang.String optString4 = optJSONObject.optString("right_button_wording");
            java.lang.String optString5 = optJSONObject.optString("upload_credit_url");
            com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = new com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper();
            this.f145591u = realnameGuideHelper;
            realnameGuideHelper.d(optString, optString2, optString3, optString4, optString5, 1005);
        }
        if (i17 == 0 && jSONObject.has("intercept_win")) {
            this.f145592v = com.tencent.mm.plugin.wallet_core.utils.n.a(jSONObject.optJSONObject("intercept_win"));
        }
    }
}
