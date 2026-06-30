package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes5.dex */
public final class j5 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "showInputToolView";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        if (bVar == null) {
            return;
        }
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        android.content.Context context = ((sd.a) bVar.f406596a).getContext();
        if (jSONObject == null || context == null) {
            bVar.c("invalid_params", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("toolViewType");
        java.lang.String optString2 = jSONObject.optString("gamecenter_identifier");
        java.lang.String optString3 = jSONObject.optString("configdict");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString3) || com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            bVar.c("invalid_params", null);
            return;
        }
        if (kotlin.jvm.internal.o.b(optString, com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE)) {
            bVar.a();
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString3);
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig = new com.tencent.mm.plugin.game.api.GameInputConfig();
            gameInputConfig.textPlaceHolder = jSONObject2.optString("textPlaceHolder", "");
            gameInputConfig.emoticonBoardViewType = jSONObject2.optString("emoticonBoardViewType", "");
            gameInputConfig.contentText = jSONObject2.optString("contentText", "");
            gameInputConfig.stickBtmIfNonEmpty = jSONObject2.optBoolean("stickBtmIfNonEmpty", false);
            gameInputConfig.forceClearContent = jSONObject2.optBoolean("forceClearContent", false);
            gameInputConfig.hideImgBtn = jSONObject2.optBoolean("hideImgBtn", false);
            gameInputConfig.forceUserInterfaceStyle = jSONObject2.optInt("forceUserInterfaceStyle", 0);
            gameInputConfig.showEmojiQuickInputView = jSONObject2.optBoolean("showEmojiQuickInputView", false);
            gameInputConfig.canShowAtSomeoneView = jSONObject2.optBoolean("canShowAtSomeoneView", false);
            gameInputConfig.quickEmojiList = jSONObject2.optString("quickEmojiList", "");
            gameInputConfig.maxInputCharsCo = jSONObject2.optInt("maxInputCharsCo", 1000);
            gameInputConfig.canSendWithoutText = jSONObject2.optBoolean("canSendWithoutText", false);
            gameInputConfig.identifier = jSONObject2.optString(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY, "");
            gameInputConfig.isToolsProcess = com.tencent.mm.sdk.platformtools.x2.s();
            gameInputConfig.atContentId = jSONObject2.optString("contentId", "");
            gameInputConfig.atContext = jSONObject2.optString("context", "");
            gameInputConfig.atLimit = jSONObject2.optInt("limit", 50);
            gameInputConfig.maxInputCharsCount = jSONObject2.optInt("maxInputCharsCount", 1000);
            gameInputConfig.returnKeyType = jSONObject2.optString("returnKeyType", "send");
            gameInputConfig.identifier = optString2;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("game_center_input_config", gameInputConfig);
            intent.putExtra("game_center_input_view_type", optString);
            j45.l.j(context, "game", ".luggage.ui.circle.PostCommentDialogUI", intent, null);
            m33.y0 y0Var = m33.x0.f323344a;
            y0Var.f323345a.put(optString2, new com.tencent.mm.plugin.game.luggage.jsapi.i5(this, bVar, optString2));
        } catch (org.json.JSONException unused) {
            bVar.c("configdict is not json obj", null);
        }
    }
}
