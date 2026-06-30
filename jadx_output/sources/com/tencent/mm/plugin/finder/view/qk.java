package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class qk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSnsHeaderView f132900d;

    public qk(com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView) {
        this.f132900d = finderSnsHeaderView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$refreshClearBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView = this.f132900d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(finderSnsHeaderView.getContext(), 1, true);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.view.ok(1, finderSnsHeaderView, 2);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.view.pk(1, finderSnsHeaderView, 2);
        k0Var.v();
        java.util.ArrayList a17 = finderSnsHeaderView.getPresenter().a(so2.j1.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",1,");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            r45.nw1 liveInfo = ((so2.j1) it.next()).f410439d.getLiveInfo();
            arrayList2.add(java.lang.Long.valueOf(liveInfo != null ? liveInfo.getLong(0) : 0L));
        }
        sb6.append(kz5.n0.g0(arrayList2, ";", null, null, 0, null, null, 62, null));
        sb6.append(',');
        sb6.append(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(21530, sb6.toString());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$refreshClearBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
