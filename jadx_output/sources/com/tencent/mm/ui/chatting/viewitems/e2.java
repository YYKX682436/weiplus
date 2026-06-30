package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.v1 f203840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203841e;

    public e2(com.tencent.mm.ui.chatting.viewitems.c2 c2Var, com.tencent.mm.ui.chatting.viewitems.v1 v1Var, yb5.d dVar) {
        this.f203840d = v1Var;
        this.f203841e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgFrom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) view.getTag();
        com.tencent.mm.ui.chatting.viewitems.v1 v1Var = this.f203840d;
        yb5.d dVar = this.f203841e;
        com.tencent.mm.ui.chatting.viewitems.j1.m(f9Var, dVar, 0, new com.tencent.mm.ui.chatting.viewitems.j1$$b(v1Var, dVar));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgFrom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
