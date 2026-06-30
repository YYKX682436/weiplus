package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public final class j7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.ChatFooterCustom f201872a;

    public j7(com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom) {
        kotlin.jvm.internal.o.g(chatFooterCustom, "chatFooterCustom");
        this.f201872a = chatFooterCustom;
    }

    public final void a(com.tencent.mm.pluginsdk.ui.chat.e5 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f201872a;
        chatFooterCustom.setOnFooterSwitchListener(listener);
        android.view.View findViewById = chatFooterCustom.findViewById(com.tencent.mm.R.id.blq);
        if (findViewById != null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigScheduleMessageManually()) == 1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler", "initFooter", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler", "initFooter", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (((android.view.View) pm0.v.E(valueOf, findViewById)) == null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Integer.valueOf(intValue2));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler", "initFooter", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler", "initFooter", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View findViewById2 = chatFooterCustom.findViewById(com.tencent.mm.R.id.blk);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler", "initFooter", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler", "initFooter", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById3 = chatFooterCustom.findViewById(com.tencent.mm.R.id.bll);
        android.widget.LinearLayout linearLayout = findViewById3 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) findViewById3 : null;
        if (linearLayout != null) {
            linearLayout.setWeightSum(1.0f);
        }
        android.view.View childAt = linearLayout != null ? linearLayout.getChildAt(0) : null;
        android.widget.FrameLayout frameLayout = childAt instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) childAt : null;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            frameLayout.setOnClickListener(new com.tencent.mm.ui.chatting.i7(frameLayout));
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.bln);
            if (textView != null) {
                android.content.Context context = frameLayout.getContext();
                textView.setText(context != null ? context.getString(com.tencent.mm.R.string.p6w) : null);
            }
            android.view.View findViewById4 = frameLayout.findViewById(com.tencent.mm.R.id.blm);
            if (findViewById4 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler", "initFooter", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler", "initFooter", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            for (int i17 = 1; i17 < 6; i17++) {
                android.view.View childAt2 = linearLayout.getChildAt(i17);
                if (childAt2 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(childAt2, arrayList7.toArray(), "com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler", "initFooter", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(childAt2, "com/tencent/mm/ui/chatting/ChattingScheduleMsgFooterHandler", "initFooter", "(Lcom/tencent/mm/pluginsdk/ui/chat/ChatFooter$OnFooterSwitchListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }
}
