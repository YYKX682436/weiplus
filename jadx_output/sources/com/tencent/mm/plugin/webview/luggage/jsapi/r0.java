package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class r0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f182445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.s0 f182446e;

    public r0(com.tencent.mm.plugin.webview.luggage.jsapi.s0 s0Var, sd.b bVar) {
        this.f182446e = s0Var;
        this.f182445d = bVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        sd.b bVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String str;
        com.tencent.mm.plugin.webview.luggage.jsapi.s0 s0Var = this.f182446e;
        if (i17 == (s0Var.hashCode() & 65535)) {
            sd.b bVar2 = this.f182445d;
            ((com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.webview.luggage.e0) bVar2.f406596a).f406610d).mmSetOnActivityResultCallback(null);
            if (i18 != -1 || intent == null) {
                bVar = bVar2;
            } else {
                java.lang.String stringExtra = intent.getStringExtra("nationalCode");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                java.lang.String stringExtra2 = intent.getStringExtra("userName");
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                java.lang.String stringExtra3 = intent.getStringExtra("telNumber");
                if (stringExtra3 == null) {
                    stringExtra3 = "";
                }
                java.lang.String stringExtra4 = intent.getStringExtra("addressPostalCode");
                if (stringExtra4 == null) {
                    stringExtra4 = "";
                }
                java.lang.String stringExtra5 = intent.getStringExtra("proviceFirstStageName");
                java.lang.String str2 = stringExtra5 == null ? "" : stringExtra5;
                java.lang.String stringExtra6 = intent.getStringExtra("addressCitySecondStageName");
                java.lang.String str3 = stringExtra6 != null ? stringExtra6 : "";
                java.lang.String stringExtra7 = intent.getStringExtra("addressCountiesThirdStageName");
                java.lang.String str4 = stringExtra7 == null ? "" : stringExtra7;
                java.lang.String stringExtra8 = intent.getStringExtra("addressCountiesFourStageName");
                if (stringExtra8 == null) {
                    stringExtra8 = "";
                }
                java.lang.String stringExtra9 = intent.getStringExtra("addressDetailInfo");
                if (stringExtra9 == null) {
                    stringExtra9 = "";
                }
                if (android.text.TextUtils.isEmpty(stringExtra8) || stringExtra9.startsWith(stringExtra8)) {
                    obj = "addressDetailInfo";
                    obj2 = "proviceFirstStageName";
                    str = stringExtra9;
                } else {
                    obj = "addressDetailInfo";
                    obj2 = "proviceFirstStageName";
                    str = java.lang.String.format("%s%s", stringExtra8, stringExtra9);
                }
                java.lang.String str5 = str;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEditAddress", "first =  " + str2 + " ; detail =" + stringExtra9 + "; second = " + str3 + " ; tel = " + stringExtra3 + "; third = " + str4);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    s0Var.getClass();
                    hashMap.put("nationalCode", stringExtra.length() < 6 ? stringExtra : stringExtra.substring(0, 6));
                    hashMap.put("nationalCodeFull", stringExtra);
                    hashMap.put("userName", stringExtra2);
                    hashMap.put("telNumber", stringExtra3);
                    hashMap.put("addressPostalCode", stringExtra4);
                    hashMap.put(obj2, str2);
                    hashMap.put("addressCitySecondStageName", str3);
                    hashMap.put("addressCountiesThirdStageName", str4);
                    hashMap.put("addressStreetFourthStageName", stringExtra8);
                    hashMap.put(obj, str5);
                    hashMap.put("addressDetailInfoNew", stringExtra9);
                    bVar2.d(hashMap);
                    return;
                }
                bVar = bVar2;
            }
            if (i18 == 0) {
                bVar.c("cancel", null);
            } else {
                bVar.c("fail", null);
            }
        }
    }
}
