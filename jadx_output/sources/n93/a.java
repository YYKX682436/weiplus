package n93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln93/a;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class a extends com.tencent.mm.plugin.lite.api.p {
    public final void A(boolean z17, java.lang.String str) {
        if (z17) {
            this.f143442e.d();
            com.tencent.mars.xlog.Log.i("ChatBot.LiteAppJsApiBrandJoinChatBotRoom", "invoke success");
        } else {
            this.f143442e.b(str);
            com.tencent.mars.xlog.Log.e("ChatBot.LiteAppJsApiBrandJoinChatBotRoom", str);
        }
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("ChatBot.LiteAppJsApiBrandJoinChatBotRoom", "invoke appId: " + str + ", data: " + jSONObject + ", isFromView: " + z17);
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("roominfo");
            if (android.text.TextUtils.isEmpty(optString)) {
                A(false, "roomInfo is empty");
                return;
            }
            java.lang.String optString2 = jSONObject.optString("extinfo");
            if (android.text.TextUtils.isEmpty(optString2)) {
                A(false, "extInfoBase64Str is empty");
                return;
            }
            try {
                com.tencent.wechat.aff.chatbot.d0 parseFrom = new com.tencent.wechat.aff.chatbot.d0().parseFrom(android.util.Base64.decode(optString, 0));
                com.tencent.mars.xlog.Log.i("ChatBot.LiteAppJsApiBrandJoinChatBotRoom", "roomInfoPB parse result success");
                com.tencent.wechat.aff.chatbot.w1 parseFrom2 = new com.tencent.wechat.aff.chatbot.w1().parseFrom(android.util.Base64.decode(optString2, 0));
                com.tencent.mars.xlog.Log.i("ChatBot.LiteAppJsApiBrandJoinChatBotRoom", "extInfoPB parse result success");
                wx.e1 e1Var = (wx.e1) i95.n0.c(wx.e1.class);
                if (e1Var == null) {
                    A(false, "IChatBotUIService is null");
                    return;
                }
                java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
                android.content.Context context = k17 != null ? (android.app.Activity) k17.get() : null;
                android.app.Activity activity = (android.app.Activity) com.tencent.mm.app.w.INSTANCE.f53886h.get();
                if (context == null) {
                    context = activity != null ? activity : com.tencent.mm.sdk.platformtools.x2.f193071a;
                }
                kotlin.jvm.internal.o.d(context);
                kotlin.jvm.internal.o.d(parseFrom);
                ((wx.u) e1Var).wi(context, parseFrom, parseFrom2);
                A(true, null);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("ChatBot.LiteAppJsApiBrandJoinChatBotRoom", "fail:" + e17.getMessage(), e17);
                A(false, "ChatBotVoIPRoomInfoPB parse fail");
            }
        }
    }
}
