package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class fn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ao f203985e;

    public fn(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.ao aoVar) {
        this.f203984d = dVar;
        this.f203985e = aoVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) view.getTag();
        final com.tencent.mm.ui.chatting.viewitems.ao aoVar = this.f203985e;
        final yb5.d dVar = this.f203984d;
        com.tencent.mm.ui.chatting.viewitems.j1.m(f9Var, dVar, 1, new r.a() { // from class: com.tencent.mm.ui.chatting.viewitems.fn$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.mm.ui.chatting.viewitems.bo.h(((java.lang.Boolean) obj).booleanValue(), com.tencent.mm.ui.chatting.viewitems.ao.this, dVar);
                return null;
            }
        });
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
