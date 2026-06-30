package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/k0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class k0 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143628g = "";

    /* renamed from: h, reason: collision with root package name */
    public final r45.v75 f143629h = new r45.v75();

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        jz5.f0 f0Var;
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("oldRedirectUrl");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            this.f143628g = optString;
            byte[] decode = android.util.Base64.decode(jSONObject.optString("personalDesigner"), 2);
            if (decode != null) {
                try {
                    this.f143629h.parseFrom(decode);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
            if (o6Var != null) {
                android.content.Context c17 = c();
                kotlin.jvm.internal.o.f(c17, "getContext(...)");
                r45.v75 personalDesigner = this.f143629h;
                java.lang.String str2 = personalDesigner.f387968h;
                kotlin.jvm.internal.o.f(str2, "getDesignerDescription(...)");
                java.lang.String oldRedirectUrl = this.f143628g;
                kotlin.jvm.internal.o.g(personalDesigner, "personalDesigner");
                kotlin.jvm.internal.o.g(oldRedirectUrl, "oldRedirectUrl");
                com.tencent.mars.xlog.Log.i(((com.tencent.mm.feature.emoji.c4) o6Var).f66207d, "showEmojiDesignerProfilePageShareBottomSheet");
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.emoji.s3(c17, 1001, 1000, personalDesigner, str2, oldRedirectUrl));
            }
            this.f143443f.d(false);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("emoticonDesignerProfileShare", "missing arguments. no json object provided");
            this.f143443f.a("missing arguments.");
        }
    }
}
