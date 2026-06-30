package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class w6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190707d;

    public w6(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        this.f190707d = c8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$btnSmileyOrKeyboard$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.pluginsdk.ui.chat.c8.B;
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190707d;
        c8Var.f().findViewById(com.tencent.mm.R.id.bqr).performClick();
        c8Var.v();
        view.postDelayed(new com.tencent.mm.pluginsdk.ui.chat.v6(c8Var), 20L);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$btnSmileyOrKeyboard$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
