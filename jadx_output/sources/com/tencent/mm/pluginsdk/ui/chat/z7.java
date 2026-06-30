package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class z7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190773d;

    public z7(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        this.f190773d = c8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$voiceInputRecording$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("ChatFooterKt", "voiceInputRecording clicked");
        int i17 = com.tencent.mm.pluginsdk.ui.chat.c8.B;
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190773d;
        c8Var.k().setVisibility(0);
        c8Var.m();
        if (c8Var.f190220b.getChattingContext() != null) {
            ((com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) c8Var.e().f460708c.a(sb5.i0.class))).P0(2);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$voiceInputRecording$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
