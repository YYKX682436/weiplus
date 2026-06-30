package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class of implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pe f199642d;

    public of(com.tencent.mm.ui.chatting.component.pe peVar) {
        this.f199642d = peVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HeaderComponent$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        com.tencent.mm.ui.chatting.component.pe peVar = this.f199642d;
        if (((we0.j1) l0Var).aj(peVar.f198580d.u().d1())) {
            com.tencent.mm.ui.chatting.component.pe.m0(peVar);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HeaderComponent$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
