package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/w0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class w0 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("md5") : null;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("emojiInfo") : null;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("aesKey") : null;
        java.lang.String optString4 = jSONObject != null ? jSONObject.optString("cdnUrl") : null;
        java.lang.String optString5 = jSONObject != null ? jSONObject.optString("encryptUrl") : null;
        java.lang.String optString6 = jSONObject != null ? jSONObject.optString("externMd5") : null;
        java.lang.String optString7 = jSONObject != null ? jSONObject.optString("externUrl") : null;
        java.lang.String optString8 = jSONObject != null ? jSONObject.optString("tpUrl") : null;
        java.lang.String optString9 = jSONObject != null ? jSONObject.optString("authKey") : null;
        if (str == null || optString == null) {
            this.f143443f.a("emoticonGetSingleEmotionPath:fail_missing arguments");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonGetSingleEmotionPath", "invoke: " + c());
        com.tencent.mm.api.IEmojiInfo Zi = ((com.tencent.mm.feature.emoji.c4) ((com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class))).Zi(optString, optString2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            ((com.tencent.mm.storage.emotion.EmojiInfo) Zi).field_aeskey = optString3;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
            ((com.tencent.mm.storage.emotion.EmojiInfo) Zi).field_cdnUrl = optString4;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString5)) {
            ((com.tencent.mm.storage.emotion.EmojiInfo) Zi).field_encrypturl = optString5;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString6)) {
            ((com.tencent.mm.storage.emotion.EmojiInfo) Zi).field_externMd5 = optString6;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString7)) {
            ((com.tencent.mm.storage.emotion.EmojiInfo) Zi).field_externUrl = optString7;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString8)) {
            ((com.tencent.mm.storage.emotion.EmojiInfo) Zi).field_tpurl = optString8;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString9)) {
            ((com.tencent.mm.storage.emotion.EmojiInfo) Zi).field_tpauthkey = optString9;
        }
        com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
        com.tencent.mm.plugin.lite.jsapi.comms.v0 v0Var = new com.tencent.mm.plugin.lite.jsapi.comms.v0(optString, this);
        com.tencent.mm.feature.emoji.c4 c4Var = (com.tencent.mm.feature.emoji.c4) o6Var;
        c4Var.getClass();
        c4Var.ij(Zi, true, v0Var);
    }
}
