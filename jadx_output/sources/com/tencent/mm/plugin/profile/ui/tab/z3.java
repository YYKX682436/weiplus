package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154711d;

    public z3(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154711d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.plugin.profile.ui.tab.u0) this.f154711d.f154549c).f154603a.e(null);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
