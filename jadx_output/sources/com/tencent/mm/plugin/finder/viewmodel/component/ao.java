package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ao implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f133788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f133790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.eo f133791g;

    public ao(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, android.view.View view, boolean z17, com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar) {
        this.f133788d = finderJumpInfo;
        this.f133789e = view;
        this.f133790f = z17;
        this.f133791g = eoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$refreshAnnouncement$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click announcement, ");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo info = this.f133788d;
        sb6.append(info.getJump_id());
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveIncomeListUIC", sb6.toString());
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_INCOME_ANNOUNCEMENT_CLICK_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        android.view.View view2 = this.f133789e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$refreshAnnouncement$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$refreshAnnouncement$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f133790f) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            androidx.appcompat.app.AppCompatActivity context = this.f133791g.getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(info, "info");
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(info);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$refreshAnnouncement$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
