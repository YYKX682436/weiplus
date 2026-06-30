package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class gm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f199115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.im f199116e;

    public gm(com.tencent.mm.ui.chatting.component.im imVar, java.lang.Boolean bool) {
        this.f199116e = imVar;
        this.f199115d = bool;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/TipsBubbleComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean booleanValue = this.f199115d.booleanValue();
        com.tencent.mm.ui.chatting.component.im imVar = this.f199116e;
        if (booleanValue) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            imVar.m0(bool, bool);
            ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) imVar.f198580d.f460708c.a(sb5.s0.class))).f199263e.v(null);
        } else {
            imVar.m0(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
            ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) imVar.f198580d.f460708c.a(sb5.s0.class))).f199263e.setMode(2);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/TipsBubbleComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
