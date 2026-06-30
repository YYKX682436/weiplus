package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190429d;

    public j2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190429d = chatFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        sb5.i0 i0Var;
        com.tencent.mm.ui.chatting.component.gp gpVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$41", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        u35.b.f424430b = 0;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190429d;
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
        if (y4Var != null && y4Var.a() != null && (i0Var = (sb5.i0) chatFooter.f189955a3.a().f460708c.a(sb5.i0.class)) != null && (gpVar = ((com.tencent.mm.ui.chatting.component.y8) i0Var).f200305z) != null) {
            gpVar.c();
        }
        if (chatFooter.V1 == 1) {
            chatFooter.setMode(2);
        } else {
            chatFooter.setMode(1);
            com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = chatFooter.f190090x0;
            if (k5Var != null) {
                k5Var.l(true);
                chatFooter.f190090x0.i(null, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$41", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
