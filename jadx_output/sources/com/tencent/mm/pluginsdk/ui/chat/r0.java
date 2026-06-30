package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes2.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190593d;

    public r0(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190593d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f190593d.T4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$111", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$111", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
