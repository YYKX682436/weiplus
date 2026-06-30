package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class q5 extends com.tencent.mm.plugin.luckymoney.model.p5 {
    public q5(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("appId", str);
        hashMap.put("timeStamp", str2);
        hashMap.put("nonceStr", str3);
        if (str4 != null) {
            hashMap.put("package", java.net.URLEncoder.encode(str4));
        }
        hashMap.put("signType", str5);
        if (str6 != null) {
            hashMap.put("paySign", java.net.URLEncoder.encode(str6));
        }
        hashMap.put("way", i17 + "");
        if (str7 != null) {
            hashMap.put("jsapiH5Url", java.net.URLEncoder.encode(str7) + "");
        }
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public int I() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }

    public q5(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, java.lang.String str7, java.lang.String str8) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("appId", str);
        hashMap.put("timeStamp", str2);
        hashMap.put("nonceStr", str3);
        if (str4 != null) {
            hashMap.put("package", java.net.URLEncoder.encode(str4));
        }
        hashMap.put("signType", str5);
        if (str6 != null) {
            hashMap.put("paySign", java.net.URLEncoder.encode(str6));
        }
        hashMap.put("way", i17 + "");
        if (str7 != null) {
            hashMap.put("androidSign", java.net.URLEncoder.encode(str7));
        }
        if (str8 != null) {
            hashMap.put("androidPackage", java.net.URLEncoder.encode(str8));
        }
        setRequestData(hashMap);
    }
}
