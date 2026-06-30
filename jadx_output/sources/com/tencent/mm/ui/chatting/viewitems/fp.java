package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class fp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lp f203990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203992f;

    public fp(com.tencent.mm.ui.chatting.viewitems.hp hpVar, com.tencent.mm.ui.chatting.viewitems.lp lpVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f203990d = lpVar;
        this.f203991e = dVar;
        this.f203992f = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceTo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.mp.c(view, this.f203990d, this.f203991e, this.f203992f);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceTo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
