package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class gp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hp f118468d;

    public gp(com.tencent.mm.plugin.finder.live.widget.hp hpVar) {
        this.f118468d = hpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$updateButtonByTag$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ml2.i2[] i2VarArr = ml2.i2.f327553d;
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.f118468d;
        hpVar.r0(2, 4);
        hpVar.l0();
        yz5.l lVar = hpVar.N;
        if (lVar != null) {
            r45.xn1 xn1Var = hpVar.P;
            lVar.invoke((xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$updateButtonByTag$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
