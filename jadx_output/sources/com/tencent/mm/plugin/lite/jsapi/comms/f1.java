package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/f1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class f1 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String md52 = jSONObject != null ? jSONObject.optString("md5") : null;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("packThumbExtBuf") : null;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("pid") : null;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("emojiInfoBuf") : null;
        int optInt = jSONObject != null ? jSONObject.optInt("emoticonScene") : 26;
        int optInt2 = jSONObject != null ? jSONObject.optInt("addEmoticonScene") : 8;
        java.lang.String optString4 = jSONObject != null ? jSONObject.optString("requestID") : null;
        java.lang.String str2 = optString4 == null ? "" : optString4;
        java.lang.String optString5 = jSONObject != null ? jSONObject.optString("reportInfo") : null;
        int optInt3 = jSONObject != null ? jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) : 0;
        int optInt4 = jSONObject != null ? jSONObject.optInt("showEntry") : 0;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (!(optString5 == null || optString5.length() == 0)) {
            linkedHashMap.put("reportInfo30474", optString5);
        }
        if (md52 == null || md52.length() == 0) {
            this.f143443f.a("emoticonOpenHalfScreenSendView:fail_missing arguments");
            return;
        }
        com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
        android.content.Context c17 = c();
        kotlin.jvm.internal.o.f(c17, "getContext(...)");
        boolean z18 = optInt4 == 1;
        com.tencent.mm.feature.emoji.c4 c4Var = (com.tencent.mm.feature.emoji.c4) o6Var;
        c4Var.getClass();
        kotlin.jvm.internal.o.g(md52, "md5");
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
        emojiInfo.field_md5 = md52;
        if (optString3 == null || optString3.length() == 0) {
            if (!(optString == null || optString.length() == 0)) {
                r45.m35 m35Var = new r45.m35();
                byte[] decode = android.util.Base64.decode(optString, 2);
                if (decode != null) {
                    try {
                        m35Var.parseFrom(decode);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
                emojiInfo.field_groupId = optString2;
                emojiInfo.field_cdnUrl = m35Var.f380119h;
                emojiInfo.field_thumbUrl = m35Var.f380120i;
                emojiInfo.field_aeskey = m35Var.f380118g;
                emojiInfo.field_encrypturl = m35Var.f380121m;
                emojiInfo.field_externUrl = m35Var.f380122n;
                emojiInfo.field_externMd5 = m35Var.f380123o;
                emojiInfo.field_activityid = m35Var.f380124p;
                emojiInfo.field_emojiFlag = m35Var.f380125q;
            }
        } else {
            byte[] nj6 = c4Var.nj(optString3);
            r45.ri0 ri0Var = new r45.ri0();
            if (nj6 != null) {
                try {
                    ri0Var.parseFrom(nj6);
                } catch (java.lang.Exception e18) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                }
            }
            n22.m.a(ri0Var, emojiInfo);
        }
        j22.a.d(emojiInfo, 0, optInt3, 0L, optInt);
        java.lang.Object obj = linkedHashMap.get("reportInfo30474");
        java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (!(str3 == null || str3.length() == 0)) {
            try {
                org.json.JSONObject optJSONObject = new org.json.JSONObject(str3).optJSONObject("halfExpose");
                if (optJSONObject != null) {
                    java.lang.String optString6 = optJSONObject.optString("actionType");
                    kotlin.jvm.internal.o.f(optString6, "optString(...)");
                    java.lang.String optString7 = optJSONObject.optString("eleId");
                    kotlin.jvm.internal.o.f(optString7, "optString(...)");
                    java.lang.String optString8 = optJSONObject.optString("eleInfo");
                    kotlin.jvm.internal.o.f(optString8, "optString(...)");
                    java.lang.String optString9 = optJSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE_INFO);
                    kotlin.jvm.internal.o.f(optString9, "optString(...)");
                    java.lang.String optString10 = optJSONObject.optString("pageId");
                    kotlin.jvm.internal.o.f(optString10, "optString(...)");
                    j22.a.c(optString6, optString7, optString8, optString9, optString10);
                }
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.i(c4Var.f66207d, "showEmojiHalfDialog parse reportInfo30474 error: " + e19);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.emoji.t3(c17, emojiInfo, z18, optInt, optInt2, str2, str3));
        this.f143443f.d(false);
    }
}
