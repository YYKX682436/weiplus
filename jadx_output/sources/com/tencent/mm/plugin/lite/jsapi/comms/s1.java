package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/s1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class s1 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        org.json.JSONObject jSONObject2 = null;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("chatId") : null;
        if (optString == null || optString.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonSetSearchTagResult", "chatUserName is null or empty");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonSetSearchTagResult", "onSetSearchTagResult data: " + jSONObject);
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("content") : null;
        if (!(optString2 == null || optString2.length() == 0)) {
            try {
                org.json.JSONArray optJSONArray = new org.json.JSONObject(optString2).optJSONArray("items");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                    if (optJSONObject != null) {
                        jSONObject2 = optJSONObject;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiEmoticonSetSearchTagResult", "Error parsing content JSON", e17);
            }
        }
        if (jSONObject2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiEmoticonSetSearchTagResult", "setSearchTagResult failed, emojiContent is null or empty");
            this.f143443f.a(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
            return;
        }
        jSONObject2.put("sendFromScene", "chatSearch");
        com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
        android.content.Context c17 = c();
        kotlin.jvm.internal.o.f(c17, "getContext(...)");
        com.tencent.mm.plugin.lite.jsapi.comms.r1 r1Var = new com.tencent.mm.plugin.lite.jsapi.comms.r1(this);
        com.tencent.mm.feature.emoji.c4 c4Var = (com.tencent.mm.feature.emoji.c4) o6Var;
        c4Var.getClass();
        java.lang.String optString3 = jSONObject2.optString("md5");
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(optString3);
        if (u17 == null) {
            u17 = new com.tencent.mm.storage.emotion.EmojiInfo();
        }
        u17.field_md5 = optString3;
        u17.field_type = jSONObject2.optInt("type");
        u17.field_thumbUrl = jSONObject2.optString("thumb");
        java.lang.String optString4 = jSONObject2.optString("aesKey");
        u17.field_aeskey = optString4;
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
            u17.field_cdnUrl = jSONObject2.optString("encryptUrl");
        } else {
            u17.field_encrypturl = jSONObject2.optString("encryptUrl");
        }
        u17.field_designerID = jSONObject2.optString("designerId", "");
        u17.F2 = jSONObject2.optInt("pay", 0);
        u17.E2 = jSONObject2.optString("productName", "");
        u17.field_groupId = jSONObject2.optString("productId", "");
        java.lang.String str2 = "upload emoji, to username: " + optString + ", md5: " + u17.getMd5();
        java.lang.String str3 = c4Var.f66207d;
        com.tencent.mars.xlog.Log.i(str3, str2);
        java.lang.String optString5 = jSONObject2.optString("sendFromScene", "");
        if (!android.text.TextUtils.isEmpty(optString5) && kotlin.jvm.internal.o.b(optString5, "chatSearch")) {
            u17.K2 = qk.z6.SEND_FROM_SCENE_SEARCH;
        }
        if (u17.F2 == 1) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(u17.field_groupId)) {
                if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).S(u17.field_groupId)) {
                    com.tencent.mars.xlog.Log.i(str3, "buy and resend emoji");
                }
            }
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211709a = "";
            aVar.f211729s = c17.getString(com.tencent.mm.R.string.j5f);
            aVar.A = true;
            aVar.f211732v = of5.b.a(c17).getString(com.tencent.mm.R.string.bup);
            aVar.E = new com.tencent.mm.feature.emoji.k3(u17, c4Var, c17, r1Var);
            aVar.f211733w = of5.b.a(c17).getString(com.tencent.mm.R.string.f490347sg);
            aVar.F = new com.tencent.mm.feature.emoji.l3(r1Var);
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(c17, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            android.view.Window window = j0Var.getWindow();
            if (window != null) {
                window.setSoftInputMode(48);
                window.setFlags(131072, 131072);
            }
            j0Var.show();
            return;
        }
        if (com.tencent.mm.storage.n5.f().c().u1(u17.getMd5()) == null) {
            com.tencent.mm.storage.n5.f().c().insert(u17);
        }
        com.tencent.mm.feature.emoji.z2 z2Var = new com.tencent.mm.feature.emoji.z2(c4Var, r1Var, u17);
        zq.h hVar = zq.h.f474972a;
        new dr.k(u17, z2Var).f(false);
    }
}
