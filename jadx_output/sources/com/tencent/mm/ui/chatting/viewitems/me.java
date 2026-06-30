package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes4.dex */
public final class me implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.nb0 f204577e;

    public me(yb5.d dVar, bw5.nb0 nb0Var) {
        this.f204576d = dVar;
        this.f204577e = nb0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgTingMusic$TingMusicItemHolder$Companion$updateMusicSource$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.oe oeVar = com.tencent.mm.ui.chatting.viewitems.pe.f205255h;
        android.app.Activity g17 = this.f204576d.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        java.lang.String finderUsername = this.f204577e.getFinderUsername();
        kotlin.jvm.internal.o.f(finderUsername, "getFinderUsername(...)");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.ui.chatting.viewitems.ke(g17, finderUsername, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgTingMusic$TingMusicItemHolder$Companion$updateMusicSource$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
