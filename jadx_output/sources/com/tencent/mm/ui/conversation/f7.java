package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class f7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.MainUI f207676d;

    public f7(com.tencent.mm.ui.conversation.MainUI mainUI) {
        this.f207676d = mainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.MainUI mainUI = this.f207676d;
        com.tencent.mm.ui.conversation.q qVar = mainUI.f207380w;
        android.app.Activity context = mainUI.getContext();
        com.tencent.mm.ui.conversation.MainUI mainUI2 = this.f207676d;
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = mainUI2.f207372o;
        android.widget.TextView textView = mainUI2.f207377t;
        qVar.f207989s = false;
        qVar.f207985o = context;
        qVar.f207986p = conversationListView;
        qVar.f207987q = textView;
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.conversation.l(qVar, context));
    }
}
