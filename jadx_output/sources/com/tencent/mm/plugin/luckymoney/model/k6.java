package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class k6 extends com.tencent.mm.plugin.luckymoney.model.c6 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145398h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145399i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f145400m;

    public k6(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6, int i19, java.lang.String str7, int i27, int i28, java.lang.String str8, com.tencent.mm.plugin.luckymoney.model.j6 j6Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("amount", i17 + "");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        hashMap.put("wishing", java.net.URLEncoder.encode(str == null ? "" : str));
        hashMap.put("sendUserName", str4);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            hashMap.put(dm.i4.COL_USERNAME, str3);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            hashMap.put("headImg", java.net.URLEncoder.encode(str2));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            hashMap.put("nickName", java.net.URLEncoder.encode(str5 == null ? "" : str5));
        }
        hashMap.put("inWay", i18 + "");
        hashMap.put("imageId", "");
        hashMap.put("imageAesKey", "");
        hashMap.put("imageLength", "0");
        hashMap.put("expressionurl", str6);
        hashMap.put("expressiontype", "" + i19);
        if (j6Var != null) {
            hashMap.put("voice_url", j6Var.f145356a);
            hashMap.put("voice_aeskey", j6Var.f145357b);
            hashMap.put("voice_file_length", j6Var.f145358c + "");
            hashMap.put("voice_playtime", j6Var.f145359d + "");
            hashMap.put("voice_format", "4");
            hashMap.put("voice_key_words", j6Var.f145360e);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            hashMap.put("unique_id", str7);
        }
        hashMap.put("user_confirm_jump", "" + i27);
        hashMap.put("unpay_type", "" + i28);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
            hashMap.put("cancel_sendid", str8);
        }
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/yearrequestwxhb";
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1643;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f145398h = jSONObject.optString("sendId");
        this.f145399i = jSONObject.optString("reqkey");
        this.f145400m = jSONObject.optString("sendMsgXml");
    }
}
