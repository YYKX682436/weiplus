package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.f5 f190737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190738e;

    public x3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, com.tencent.mm.pluginsdk.ui.chat.f5 f5Var) {
        this.f190738e = chatFooter;
        this.f190737d = f5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190738e;
        chatFooter.f190039p.setBackgroundResource(com.tencent.mm.R.drawable.ahj);
        chatFooter.f190039p.setText(com.tencent.mm.R.string.azr);
        if (chatFooter.S3) {
            int ordinal = this.f190737d.ordinal();
            if ((ordinal == 0 || ordinal == 5 || ordinal == 2 || ordinal == 3) && chatFooter.X3 != null) {
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter.p(chatFooter);
                return;
            }
            return;
        }
        db5.d5 d5Var = chatFooter.L1;
        if (d5Var != null) {
            d5Var.dismiss();
            db5.d5 d5Var2 = chatFooter.M3;
            if (d5Var2 != null) {
                d5Var2.getContentView().animate().alpha(0.0f).setDuration(300L).withEndAction(chatFooter.U5).start();
            }
            chatFooter.M1.setVisibility(0);
            android.view.View view = chatFooter.R1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = chatFooter.S1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = chatFooter.Q1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = chatFooter.A3;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = chatFooter.N1;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$76", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        chatFooter.getClass();
        chatFooter.getClass();
    }
}
