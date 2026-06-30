package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class p5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.s5 f190559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190560e;

    public p5(com.tencent.mm.pluginsdk.ui.chat.s5 s5Var, com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190559d = s5Var;
        this.f190560e = chatFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/CustomFullScreenEditHelper$chatFooterEnterFullScreenBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.s5 s5Var = this.f190559d;
        s5Var.p();
        u35.c.f424434a.a(2, this.f190560e.getChattingContext() != null ? s5Var.e() : null);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/CustomFullScreenEditHelper$chatFooterEnterFullScreenBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
