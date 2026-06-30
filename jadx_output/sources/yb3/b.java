package yb3;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.plugin.luckymoney.model.f6 {
    public int A;
    public int B;
    public final java.util.Map C;

    public b(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int i19) {
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.f145281i = str;
        this.f145282m = str2;
        this.f145283n = str5;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.C = hashMap;
        hashMap.put("msgType", i17 + "");
        hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, i18 + "");
        hashMap.put("sendId", str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            hashMap.put("headImg", java.net.URLEncoder.encode(str3));
            hashMap.put("nickName", java.net.URLEncoder.encode(str4 == null ? "" : str4));
        }
        hashMap.put("ver", str6);
        hashMap.put("timingIdentifier", str7);
        hashMap.put("left_button_continue", str8);
        hashMap.put("liveid", str9);
        hashMap.put("liveattach", str10);
        if (i19 > 0) {
            hashMap.put("channellive_sender_flag", java.lang.String.valueOf(i19));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLiveOpenLuckyMoney", "NetSceneOpenLuckyMoney request");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.f6, com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/ftfhb/channelliveopenwxhb";
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void J(int i17, org.json.JSONObject jSONObject) {
        int i18;
        if (i17 == 0 || jSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLiveOpenLuckyMoney", "needCallbackWhenError error ok or json null");
            this.A = 0;
            this.B = 0;
            return;
        }
        int optInt = jSONObject.optInt("tryafterms");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLiveOpenLuckyMoney", "needCallbackWhenError delayTimeMS: %s, retryTimes: %s, errCode: %s", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(i17));
        if (optInt <= 0 || (i18 = this.A) >= 1) {
            this.A = 0;
            this.B = 0;
        } else {
            this.A = i18 + 1;
            this.B = java.lang.Math.min(optInt, 5000);
        }
    }

    public yb3.b L() {
        java.util.Map map = this.C;
        if (map == null) {
            return null;
        }
        ((java.util.HashMap) map).put("policy_retry", java.lang.String.valueOf(1));
        yb3.b bVar = new yb3.b(map);
        bVar.f145281i = this.f145281i;
        bVar.f145282m = this.f145282m;
        bVar.f145283n = this.f145283n;
        bVar.A = this.A;
        return bVar;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.f6, com.tencent.mm.modelbase.m1
    public int getType() {
        return 4595;
    }

    public b(java.util.Map map) {
        this.A = 0;
        this.B = 0;
        this.C = null;
        setRequestData(map);
    }
}
