package yb3;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.plugin.luckymoney.model.l6 {
    public e(int i17, int i18, java.lang.String str, java.lang.String str2, int i19, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i27) {
        this.f145418h = i17;
        this.f145419i = i18;
        this.f145420m = str;
        this.f145421n = str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgType", i17 + "");
        hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, i18 + "");
        hashMap.put("sendId", str);
        hashMap.put("inWay", i19 + "");
        hashMap.put("ver", str3);
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
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        hashMap.put("group_name", str4);
        hashMap.put("liveid", str5);
        hashMap.put("liveattach", str6);
        if (i27 > 0) {
            hashMap.put("channellive_sender_flag", java.lang.String.valueOf(i27));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLiveReceiveLuckyMoney", "NetSceneReceiveLuckyMoney request");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.l6, com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/ftfhb/channellivereceivewxhb";
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.l6, com.tencent.mm.modelbase.m1
    public int getType() {
        return 4717;
    }
}
