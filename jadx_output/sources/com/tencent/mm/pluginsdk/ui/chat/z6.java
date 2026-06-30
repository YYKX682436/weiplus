package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class z6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190772d;

    public z6(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        this.f190772d = c8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$chatFooterEnterFullScreenBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190772d;
        c8Var.p();
        u35.c.f424434a.a(2, c8Var.f190220b.getChattingContext() != null ? c8Var.e() : null);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$chatFooterEnterFullScreenBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
