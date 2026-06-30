package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class w30 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136295d;

    public w30(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f136295d = f50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f136295d;
        f50Var.V6();
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.assist.i0) c17).yk(f50Var.getActivity(), null);
        long h76 = f50Var.h7();
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c18).Jj(f50Var.getActivity(), f50Var.G, f50Var.E, 2L, 7L, (r30 & 32) != 0 ? false : h76 > 0, (r30 & 64) != 0 ? 0L : h76, (r30 & 128) != 0 ? "" : null, (r30 & 256) != 0 ? "" : xy2.c.e(f50Var.getContext()));
        com.tencent.mm.plugin.finder.report.p.f125223b.c(1L, 0L, "");
        com.tencent.mm.plugin.finder.report.p.f125227f.f125145g = f50Var.h7();
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("finder_wx_private_msg_entrance");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("finder_wx_private_msg_entrance");
        if (I0 != null && L0 != null) {
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            androidx.appcompat.app.AppCompatActivity context = f50Var.getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", L0, I0, 3, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
