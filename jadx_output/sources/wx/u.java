package wx;

@j95.b
/* loaded from: classes8.dex */
public final class u extends i95.w implements wx.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f450439d = "ChatBotUIService";

    public void wi(android.content.Context context, com.tencent.wechat.aff.chatbot.d0 roomInfo, com.tencent.wechat.aff.chatbot.w1 w1Var) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(roomInfo, "roomInfo");
        boolean F = iq.b.F(context, true);
        java.lang.String str = this.f450439d;
        if (F) {
            com.tencent.mars.xlog.Log.i(str, "voip conflict");
            return;
        }
        roomInfo.f216142i = com.tencent.wechat.aff.chatbot.g0.ChatbotBizType_MPChat;
        roomInfo.f216144n[6] = true;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmbiz_ai_live_open, 0) == 1) {
            intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity.class);
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            if (w1Var != null) {
                intent.putExtra("reportAiChatExtInfo", w1Var.toByteArray());
            }
            intent.putExtra("room_info", roomInfo.toByteArray());
            intent.putExtra("open_screen", 20);
            intent.putExtra("room_screen", 1);
        } else {
            intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.feature.chatbot.brand.ui.ChatBotBrandActivity.class);
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            if (w1Var != null) {
                intent.putExtra("reportAiChatExtInfo", w1Var.toByteArray());
            }
            intent.putExtra("room_info", roomInfo.toByteArray());
            intent.putExtra("open_screen", 11);
            intent.putExtra("room_screen", 1);
        }
        com.tencent.mars.xlog.Log.i(str, "startChatBotBrandAsstVoipUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/chatbot/ChatBotUIService", "startChatBotBrandAsstVoipUI", "(Landroid/content/Context;Lcom/tencent/wechat/aff/chatbot/ChatBotVoIPRoomInfoPB;Lcom/tencent/wechat/aff/chatbot/ReportAiChatExtInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/chatbot/ChatBotUIService", "startChatBotBrandAsstVoipUI", "(Landroid/content/Context;Lcom/tencent/wechat/aff/chatbot/ChatBotVoIPRoomInfoPB;Lcom/tencent/wechat/aff/chatbot/ReportAiChatExtInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
