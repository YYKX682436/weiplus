package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.n0 f208890d;

    public i0(com.tencent.mm.ui.n0 n0Var, com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI) {
        this.f208890d = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.o0 o0Var = (com.tencent.mm.ui.o0) view.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.AllRemindMsgUI", "[onClick] :%s", o0Var);
        com.tencent.mm.ui.n0 n0Var = this.f208890d;
        com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI = n0Var.f209395i;
        java.lang.String str = o0Var.f209434a;
        long j17 = o0Var.f209439f;
        n0Var.getClass();
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] username is null");
        } else {
            com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).o2(str, j17);
            if (o27 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] msg is null");
            }
            long msgId = o27 == null ? -1L : o27.getMsgId();
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] msgLocalId:%s", java.lang.Long.valueOf(msgId));
            if (com.tencent.mm.storage.z3.R4(str)) {
                if (((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(str) == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] member is null! username:%s", str);
                    db5.e1.t(allRemindMsgUI, allRemindMsgUI.getString(com.tencent.mm.R.string.hy6), allRemindMsgUI.getString(com.tencent.mm.R.string.jz9), null);
                }
                android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("need_hight_item", true).putExtra("msg_local_id", msgId);
                putExtra.setClass(allRemindMsgUI, com.tencent.mm.ui.chatting.ChattingUI.class);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(putExtra);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(allRemindMsgUI, arrayList2.toArray(), "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                allRemindMsgUI.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(allRemindMsgUI, "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (n17 == null || !n17.r2()) {
                    if (n17 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] contact is null! username:%s", str);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] isContact not ! username:%s", str);
                    }
                    db5.e1.t(allRemindMsgUI, allRemindMsgUI.getString(com.tencent.mm.R.string.hy6), allRemindMsgUI.getString(com.tencent.mm.R.string.jz9), null);
                }
                android.content.Intent putExtra2 = new android.content.Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("need_hight_item", true).putExtra("msg_local_id", msgId);
                putExtra2.setClass(allRemindMsgUI, com.tencent.mm.ui.chatting.ChattingUI.class);
                java.util.ArrayList arrayList22 = new java.util.ArrayList();
                arrayList22.add(putExtra2);
                java.util.Collections.reverse(arrayList22);
                yj0.a.d(allRemindMsgUI, arrayList22.toArray(), "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                allRemindMsgUI.startActivity((android.content.Intent) arrayList22.get(0));
                yj0.a.f(allRemindMsgUI, "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
