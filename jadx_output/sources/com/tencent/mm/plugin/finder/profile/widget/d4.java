package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class d4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124519d;

    public d4(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var) {
        this.f124519d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$updateSectionHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124519d;
        if (s4Var.f124771y) {
            yz5.a aVar = s4Var.A;
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            r45.j32 j32Var = s4Var.f124764r;
            if (j32Var != null && j32Var.getInteger(2) == j32Var.getInteger(3)) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(s4Var.f124748b, 1, false);
                s4Var.f124768v = k0Var;
                k0Var.f211872n = new com.tencent.mm.plugin.finder.profile.widget.p4(s4Var);
                k0Var.f211881s = new com.tencent.mm.plugin.finder.profile.widget.q4(s4Var);
                k0Var.v();
            } else {
                s4Var.c(null, 3, -1);
                com.tencent.mm.plugin.finder.profile.widget.s4.b(s4Var);
                s4Var.e();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$updateSectionHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
