package cw1;

/* loaded from: classes8.dex */
public final class d3 {
    public d3(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talker, "talker");
        android.content.Intent putExtra = new android.content.Intent().setClassName(context, com.tencent.mm.ui.chatting.ChattingUI.class.getName()).putExtra("msg_local_id", j17).putExtra("finish_direct", true).putExtra("show_search_chat_content_result", true).putExtra("need_hight_item", true).putExtra("Chat_User", talker);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$Companion", "jumpToSessionMessage", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$Companion", "jumpToSessionMessage", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void b(android.content.Context context, android.os.Bundle jumpChatArg) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpChatArg, "jumpChatArg");
        java.lang.String[] stringArray = jumpChatArg.getStringArray("u");
        long[] longArray = jumpChatArg.getLongArray("m");
        int i17 = jumpChatArg.getInt("t");
        if (stringArray != null && longArray != null) {
            if (!(stringArray.length == 0) && stringArray.length == longArray.length) {
                if (stringArray.length == 1) {
                    java.lang.String str = stringArray[0];
                    kotlin.jvm.internal.o.f(str, "get(...)");
                    a(context, str, longArray[0]);
                } else {
                    c(context, stringArray, longArray, i17, null);
                }
                mt1.b0.s(27, 0L, 1L);
                return;
            }
        }
        throw new java.lang.IllegalArgumentException(jumpChatArg.toString());
    }

    public final void c(android.content.Context context, java.lang.String[] talkerList, long[] msgIdList, int i17, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talkerList, "talkerList");
        kotlin.jvm.internal.o.g(msgIdList, "msgIdList");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("u", talkerList);
        intent.putExtra("m", msgIdList);
        intent.putExtra("t", i17);
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = context;
        cVar.a(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseConvUI.class.getName());
        cVar.d(intent);
        cVar.b(com.tencent.mm.ui.halfscreen.MMHalfScreenMaxHeightDialogFragment.class);
        cVar.g();
    }
}
