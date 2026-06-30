package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class x3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154692d;

    public x3(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154692d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = ((com.tencent.mm.plugin.profile.ui.tab.u0) this.f154692d.f154549c).f154603a;
        boolean z17 = m0Var.f154469x;
        com.tencent.mm.ui.MMActivity mMActivity = m0Var.f154456h;
        if (z17) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(mMActivity);
            com.tencent.mm.storage.z3 z3Var = m0Var.f154459n;
            if (z3Var != null && z3Var.d1() != null) {
                ((qk.s6) gm0.j1.s(qk.s6.class)).U6(7, m0Var.f154459n.d1(), m0Var.f154459n.P0());
            }
        } else {
            if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).q()) {
                m0Var.d();
            } else {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).B(mMActivity, new com.tencent.mm.plugin.profile.ui.tab.a1(m0Var));
            }
            int i17 = m0Var.C;
            if (i17 != 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11263, java.lang.Integer.valueOf(i17), m0Var.f154459n.d1());
            }
            gr3.e.c(m0Var.f154459n.d1(), 200, m0Var.D, mMActivity.getIntent(), m0Var.L, m0Var.f154467v);
            gr3.f.f274857a.a(m0Var.M, "follow", "", -1L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
