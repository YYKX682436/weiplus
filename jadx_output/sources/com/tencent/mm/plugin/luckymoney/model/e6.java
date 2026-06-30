package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class e6 extends com.tencent.mm.plugin.luckymoney.model.c6 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f145263h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f145264i;

    public e6(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f145263h = str3;
        this.f145264i = str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sendId", str);
        hashMap.put("receiveId", str3);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        hashMap.put("wishing", java.net.URLEncoder.encode(str2 == null ? "" : str2));
        hashMap.put("ver", str4);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/wishwxhb";
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1682;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
