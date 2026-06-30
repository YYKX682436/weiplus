package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes2.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190527d;

    public o0(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190527d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190527d;
        android.view.View view = chatFooter.T4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$109", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$109", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        chatFooter.U4.setTextColor(chatFooter.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        chatFooter.U4.setText(chatFooter.getResources().getString(com.tencent.mm.R.string.h8z));
        chatFooter.U4.setTextSize(0, i65.a.f(chatFooter.getContext(), com.tencent.mm.R.dimen.f479575r));
    }
}
