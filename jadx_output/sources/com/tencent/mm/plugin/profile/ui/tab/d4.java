package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class d4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154273d;

    public d4(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154273d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.tab.u0 u0Var = (com.tencent.mm.plugin.profile.ui.tab.u0) this.f154273d.f154549c;
        u0Var.getClass();
        ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Ni(new com.tencent.mm.plugin.profile.ui.tab.t0(u0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
