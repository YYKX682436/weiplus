package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class z2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190769d;

    public z2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190769d = chatFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$56", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter.c(this.f190769d);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$56", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
