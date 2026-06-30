package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.v1 f205481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205482e;

    public s2(com.tencent.mm.ui.chatting.viewitems.o2 o2Var, com.tencent.mm.ui.chatting.viewitems.v1 v1Var, yb5.d dVar) {
        this.f205481d = v1Var;
        this.f205482e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) view.getTag();
        com.tencent.mm.ui.chatting.viewitems.v1 v1Var = this.f205481d;
        yb5.d dVar = this.f205482e;
        com.tencent.mm.ui.chatting.viewitems.j1.m(f9Var, dVar, 0, new com.tencent.mm.ui.chatting.viewitems.j1$$b(v1Var, dVar));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
