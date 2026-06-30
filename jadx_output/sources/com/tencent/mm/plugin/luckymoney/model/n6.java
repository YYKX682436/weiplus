package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class n6 extends com.tencent.mm.plugin.luckymoney.model.c6 {
    public n6(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.COL_USERNAME, str);
        hashMap.put("sendId", str2);
        hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, i17 + "");
        hashMap.put("ver", str3);
        hashMap.put("sendUserName", c01.z1.r());
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/sharewxhb";
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1668;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
