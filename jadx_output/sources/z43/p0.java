package z43;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz43/p0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class p0 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        android.content.Context c17 = c();
        if (jSONObject == null || c17 == null) {
            this.f143443f.a("invalid_params");
            return;
        }
        java.lang.String optString = jSONObject.optString("toolViewType");
        java.lang.String optString2 = jSONObject.optString("gamecenter_identifier");
        java.lang.String optString3 = jSONObject.optString("configdict");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString3) || com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            this.f143443f.a("invalid_params");
            return;
        }
        if (kotlin.jvm.internal.o.b(optString, com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE)) {
            this.f143443f.a(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE);
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
            j45.l.j(c17, "game", ".luggage.ui.circle.PostCommentDialogUI", intent, null);
            m33.y0 y0Var = m33.x0.f323344a;
            y0Var.f323345a.put(optString2, new z43.o0(optString2));
        } catch (org.json.JSONException unused) {
            this.f143443f.a("configdict is not json obj");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 0;
    }
}
