package rb5;

@j95.b
/* loaded from: classes11.dex */
public final class m extends i95.w implements wn.o {
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Class Ai(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.Intent intent2, java.lang.Class cls) {
        java.lang.Class cls2;
        if (com.tencent.mm.storage.z3.p4(str)) {
            intent2.setClass(context, com.tencent.mm.ui.conversation.OpenImKefuServiceChattingUI.class);
            java.io.Serializable serializableExtra = intent2.getSerializableExtra("KHalfScreenUIC");
            cls2 = serializableExtra instanceof java.lang.Class ? (java.lang.Class) serializableExtra : null;
            return cls2 == null ? com.tencent.mm.ui.chatting.zb.class : cls2;
        }
        if (!intent.getBooleanExtra("key_is_expand_half_screen", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingCompactService", "startHalfScreenAct");
            intent2.setClass(context, com.tencent.mm.ui.chatting.ChattingUI.class);
            java.io.Serializable serializableExtra2 = intent2.getSerializableExtra("KHalfScreenUIC");
            cls2 = serializableExtra2 instanceof java.lang.Class ? (java.lang.Class) serializableExtra2 : null;
            return cls2 == null ? com.tencent.mm.ui.chatting.db.class : cls2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingCompactService", "startHalfScreenAct isExpandHalfScreen: true");
        if (cls == null) {
            cls = com.tencent.mm.ui.chatting.ChattingUI.class;
        }
        intent2.setClass(context, cls);
        java.io.Serializable serializableExtra3 = intent2.getSerializableExtra("KHalfScreenUIC");
        cls2 = serializableExtra3 instanceof java.lang.Class ? (java.lang.Class) serializableExtra3 : null;
        return cls2 == null ? com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC.class : cls2;
    }

    public final void Bi(android.content.Intent intent, android.content.Intent intent2, java.lang.Class cls, android.content.Context context) {
        if (kotlin.jvm.internal.o.b(cls, rc5.a.class)) {
            intent.addFlags(4194304);
        }
        if (intent2.getBooleanExtra("kHalfScreenClearTop", true)) {
            intent.addFlags(67108864);
        }
        if (context instanceof android.app.Activity) {
            return;
        }
        intent.addFlags(268435456);
    }

    public void Di(android.content.Context activity, java.lang.String talkerName, android.content.Intent extraData) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(talkerName, "talkerName");
        kotlin.jvm.internal.o.g(extraData, "extraData");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finish_direct", true);
        intent.putExtras(extraData);
        java.lang.Class Ai = Ai(activity, talkerName, extraData, intent, null);
        pf5.j0.a(intent, Ai);
        Bi(intent, extraData, Ai, activity);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/compat/ChattingCompatService", "startHalfChatting", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/chatting/compat/ChattingCompatService", "startHalfChatting", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public java.lang.Class wi(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? com.tencent.mm.ui.chatting.db.class : rc5.a.class : rc5.y.class : rc5.f0.class : rc5.c0.class : com.tencent.mm.ui.chatting.zb.class;
    }
}
