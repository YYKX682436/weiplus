package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class q3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154520d;

    public q3(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154520d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateDesc$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gr3.b bVar = gr3.b.f274847a;
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = this.f154520d;
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = s4Var.f154551d;
        bVar.b(0L, 0L, 403L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, m0Var.f154467v, (r29 & 128) != 0 ? 0 : m0Var.L, (r29 & 256) != 0 ? 0 : 0);
        com.tencent.mm.plugin.profile.ui.tab.d7 d7Var = s4Var.f154549c;
        sr3.a g17 = s4Var.f154551d.f154452d.g();
        com.tencent.mm.plugin.profile.ui.tab.u0 u0Var = (com.tencent.mm.plugin.profile.ui.tab.u0) d7Var;
        u0Var.getClass();
        ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Ni(new com.tencent.mm.plugin.profile.ui.tab.s0(u0Var, g17));
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateDesc$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
