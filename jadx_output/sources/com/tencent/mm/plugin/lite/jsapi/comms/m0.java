package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/m0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class m0 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public qk.l7 f143674g;

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonDoMoreAction", "doMoreAction: " + jSONObject);
        jz5.f0 f0Var = null;
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("md5");
            kotlin.jvm.internal.o.d(optString);
            if (!(optString.length() > 0)) {
                optString = null;
            }
            if (optString == null) {
                this.f143443f.a("Missing or empty md5 parameter");
                return;
            }
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            java.lang.Object wj6 = g0Var != null ? ((com.tencent.mm.feature.lite.i) g0Var).wj(this.f143442e.f299024a, "EmotionMsgBrowseLogicData") : null;
            qk.l7 l7Var = wj6 instanceof qk.l7 ? (qk.l7) wj6 : null;
            if (l7Var == null) {
                kotlin.jvm.internal.o.d(jSONObject.optString("emojiInfoBuf"));
                if (!(!r26.n0.N(r9))) {
                    this.f143443f.a("emojiInfoBuf is isBlank");
                    return;
                }
                com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
                android.content.Context c17 = c();
                kotlin.jvm.internal.o.f(c17, "getContext(...)");
                ((com.tencent.mm.feature.emoji.c4) o6Var).Ni(c17, null, jSONObject);
                return;
            }
            this.f143674g = l7Var;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = l7Var.f364224b;
            if (iEmojiInfo == null) {
                this.f143443f.a("invalid emojiInfo");
                return;
            }
            if (!optString.equals(iEmojiInfo.H0())) {
                this.f143443f.a("no emojiMsgWrap for md5: ".concat(optString));
                com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiEmoticonDoMoreAction", "no emojiMsgWrap for md5: %s", optString);
                return;
            }
            if (this.f143674g != null) {
                com.tencent.mm.feature.emoji.api.o6 o6Var2 = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
                android.content.Context c18 = c();
                kotlin.jvm.internal.o.f(c18, "getContext(...)");
                ((com.tencent.mm.feature.emoji.c4) o6Var2).Ni(c18, this.f143674g, null);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            this.f143443f.a("data is null");
        }
    }
}
