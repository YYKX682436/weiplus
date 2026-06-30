package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.a1 f200194d;

    public x0(com.tencent.mm.ui.chatting.component.a1 a1Var) {
        this.f200194d = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChatItemQuickSelectComponent$onEnterEditMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.ui.chatting.component.b5) ((sb5.d0) this.f200194d.f198580d.f460708c.a(sb5.d0.class))).o0();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChatItemQuickSelectComponent$onEnterEditMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
