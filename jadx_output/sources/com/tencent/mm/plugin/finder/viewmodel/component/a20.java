package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class a20 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f133708a;

    public a20(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f133708a = f50Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).yk(5, 1, "");
            r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("CreateFinderEntrance");
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("CreateFinderEntrance");
            if (L0 != null && I0 != null) {
                com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
                androidx.appcompat.app.AppCompatActivity context = this.f133708a.getActivity();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", L0, I0, 1, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
            }
        }
    }
}
