package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vz implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f120111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.q63 f120112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f120113f;

    public vz(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, r45.q63 q63Var, java.lang.Runnable runnable) {
        this.f120111d = m10Var;
        this.f120112e = q63Var;
        this.f120113f = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$PayGameTeamLogic$setupForNeedPayStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f120111d;
        m10Var.r();
        int integer = this.f120112e.getInteger(5);
        java.lang.Runnable runnable = this.f120113f;
        boolean z17 = false;
        if (integer > 0) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(view.getContext());
            u1Var.g(view.getContext().getResources().getString(com.tencent.mm.R.string.czc));
            u1Var.n(view.getContext().getResources().getString(com.tencent.mm.R.string.f490358sq));
            u1Var.j(view.getContext().getResources().getString(com.tencent.mm.R.string.f490347sg));
            u1Var.l(new com.tencent.mm.plugin.finder.live.widget.uz(runnable));
            u1Var.q(false);
        } else {
            m10Var.getClass();
            java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
            java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
            if (!android.text.TextUtils.isEmpty(str) && !r26.i0.p("CN", str, true)) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "is Wechat user");
                m10Var.getClass();
                pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.k10(m10Var));
            } else {
                runnable.run();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$PayGameTeamLogic$setupForNeedPayStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
