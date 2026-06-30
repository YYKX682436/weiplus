package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class q20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f135652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f135653e;

    public q20(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f135652d = f50Var;
        this.f135653e = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initLiveRewardGainCell$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("FinderLiveIncomeEntrance");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderLiveIncomeEntrance");
        jz5.f0 f0Var = null;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f135652d;
        if (I0 != null && L0 != null) {
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            androidx.appcompat.app.AppCompatActivity context = f50Var.getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", L0, I0, 2, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
        }
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("FinderLiveIncomeEntrance");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f135653e;
        if (finderJumpInfo != null) {
            xc2.y2.i(xc2.y2.f453343a, f50Var.getContext(), new xc2.p0(finderJumpInfo), 0, null, 12, null);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).h(f50Var.getActivity(), null, "", 1, false, "");
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c17).Jj(f50Var.getActivity(), f50Var.G, false, 2L, 9L, (r30 & 32) != 0 ? false : false, (r30 & 64) != 0 ? 0L : 0L, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initLiveRewardGainCell$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
