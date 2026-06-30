package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class s5 extends com.tencent.mm.plugin.luckymoney.model.p5 {
    public com.tencent.mm.plugin.luckymoney.model.h0 B;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145616h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145617i;

    /* renamed from: m, reason: collision with root package name */
    public int f145618m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145619n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f145620o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f145621p;

    /* renamed from: q, reason: collision with root package name */
    public int f145622q;

    /* renamed from: r, reason: collision with root package name */
    public int f145623r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f145624s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f145625t;

    /* renamed from: u, reason: collision with root package name */
    public int f145626u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f145627v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f145628w;

    /* renamed from: x, reason: collision with root package name */
    public int f145629x;

    /* renamed from: y, reason: collision with root package name */
    public int f145630y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f145631z = null;
    public long A = 0;

    public s5() {
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public int I() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBusiBase", "errCode：%s errMsg：%s json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        this.f145631z = jSONObject.toString();
        this.f145619n = jSONObject.optString("spidLogo");
        this.f145620o = jSONObject.optString("spidWishing");
        this.f145621p = jSONObject.optString("spidName");
        this.f145619n = jSONObject.optString("spidLogo");
        this.f145622q = jSONObject.optInt("hbStatus");
        this.f145623r = jSONObject.optInt("receiveStatus");
        this.f145624s = jSONObject.optString("statusMess");
        jSONObject.optString("hintMess");
        this.f145625t = jSONObject.optString("watermark");
        this.f145617i = jSONObject.optString("sendId");
        this.f145626u = jSONObject.optInt("focusFlag");
        this.f145627v = jSONObject.optString("focusWording");
        this.f145628w = jSONObject.optString("focusAppidUserName");
        this.f145629x = jSONObject.optInt("isFocus");
        this.f145630y = jSONObject.optInt("hbType");
        this.B = new com.tencent.mm.plugin.luckymoney.model.h0();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("atomicFunc");
        if (optJSONObject != null) {
            this.B.f145304d = optJSONObject.optInt("enable");
            this.B.f145306f = optJSONObject.optString("fissionContent");
            this.B.f145305e = optJSONObject.optString("fissionUrl");
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("agree_duty");
        if (optJSONObject2 != null) {
            optJSONObject2.optString("agreed_flag", "-1");
            optJSONObject2.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            optJSONObject2.optString("service_protocol_wording", "");
            optJSONObject2.optString("service_protocol_url", "");
            optJSONObject2.optString("button_wording", "");
            this.A = optJSONObject2.optLong("delay_expired_time", 0L);
        }
        if (this.A > 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + (this.A * 1000)));
        }
        com.tencent.mm.plugin.luckymoney.model.g5.h(jSONObject.optJSONObject("operationTail"));
    }

    public s5(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBusiBase", "sendId:%s nativeUrl:%s way:%s", str, str2, java.lang.Integer.valueOf(i17));
        this.f145616h = str2;
        this.f145617i = str;
        this.f145618m = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sendId", str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        hashMap.put("way", i17 + "");
        hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, "2");
        hashMap.put("package", str3);
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, 0L)).longValue();
        if (longValue > 0) {
            if (java.lang.System.currentTimeMillis() < longValue) {
                hashMap.put("agreeDuty", "0");
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                gm0.j1.i();
                sb6.append((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_DISCLAIMER_NEED_AGERR_INT_SYNC, 1));
                sb6.append("");
                hashMap.put("agreeDuty", sb6.toString());
            }
        }
        setRequestData(hashMap);
    }
}
