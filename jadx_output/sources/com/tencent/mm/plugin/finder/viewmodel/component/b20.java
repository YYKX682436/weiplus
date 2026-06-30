package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class b20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.z9 f133829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f133830e;

    public b20(com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var, com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f133829d = z9Var;
        this.f133830e = f50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        r45.xs2 xs2Var;
        com.tencent.mm.protobuf.g byteString;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("CreateFinderEntrance");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("CreateFinderEntrance");
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f133830e;
        if (L0 != null && I0 != null) {
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            androidx.appcompat.app.AppCompatActivity context = f50Var.getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", L0, I0, 2, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
        }
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = this.f133829d;
        if (z9Var != null && (jbVar = z9Var.f105329c) != null && (xs2Var = jbVar.N) != null && (byteString = xs2Var.getByteString(11)) != null) {
            i95.m c17 = i95.n0.c(c61.t8.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((c61.t8) c17).Bi(f50Var.getActivity(), byteString, "FinderMpCardEntry", xy2.c.e(f50Var.getActivity()));
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).yk(5, 2, "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
