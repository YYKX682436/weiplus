package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class eb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ib f190302d;

    public eb(com.tencent.mm.pluginsdk.ui.chat.ib ibVar) {
        this.f190302d = ibVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f190302d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(ibVar.getContext());
        com.tencent.mm.pluginsdk.ui.chat.cb cbVar = new com.tencent.mm.pluginsdk.ui.chat.cb(this, u1Var);
        u1Var.u(ibVar.getContext().getString(com.tencent.mm.R.string.k97));
        u1Var.t(ibVar.S, cbVar, ibVar.R);
        u1Var.a(true);
        u1Var.i(new com.tencent.mm.pluginsdk.ui.chat.db(this));
        u1Var.q(false);
        ibVar.l(3);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
