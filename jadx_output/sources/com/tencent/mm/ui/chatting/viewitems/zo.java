package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class zo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lp f206170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f206171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f206172f;

    public zo(com.tencent.mm.ui.chatting.viewitems.dp dpVar, com.tencent.mm.ui.chatting.viewitems.lp lpVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f206170d = lpVar;
        this.f206171e = dVar;
        this.f206172f = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.mp.c(view, this.f206170d, this.f206171e, this.f206172f);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
