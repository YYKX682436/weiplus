package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class y3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190759d;

    public y3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190759d = chatFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$77", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.e5 e5Var = this.f190759d.f190097y0;
        if (e5Var != null) {
            e5Var.a(false);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$77", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
