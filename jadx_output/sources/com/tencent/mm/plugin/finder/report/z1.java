package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f125483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f125483d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        androidx.appcompat.app.AppCompatActivity activity = this.f125483d;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135385q = Ri;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            com.tencent.mm.plugin.finder.report.r0 r0Var = nyVar.T;
            com.tencent.mm.plugin.finder.report.k4 k4Var = r0Var instanceof com.tencent.mm.plugin.finder.report.k4 ? (com.tencent.mm.plugin.finder.report.k4) r0Var : null;
            r45.qt2 qt2Var = k4Var != null ? k4Var.f125284h : null;
            if (qt2Var != null) {
                qt2Var.set(0, Ri);
            }
            com.tencent.mm.plugin.finder.report.l1 l1Var = nyVar.f135394x1;
            if (!(l1Var instanceof com.tencent.mm.plugin.finder.report.k4)) {
                l1Var = null;
            }
            r45.qt2 qt2Var2 = l1Var != null ? l1Var.f125284h : null;
            if (qt2Var2 != null) {
                qt2Var2.set(0, Ri);
            }
            com.tencent.mm.plugin.finder.report.k4 k4Var2 = nyVar.f135393x0;
            if (!(k4Var2 instanceof com.tencent.mm.plugin.finder.report.k4)) {
                k4Var2 = null;
            }
            r45.qt2 qt2Var3 = k4Var2 != null ? k4Var2.f125284h : null;
            if (qt2Var3 != null) {
                qt2Var3.set(0, Ri);
            }
            com.tencent.mm.plugin.finder.report.l1 l1Var2 = nyVar.B1;
            if (!(l1Var2 instanceof com.tencent.mm.plugin.finder.report.k4)) {
                l1Var2 = null;
            }
            r45.qt2 qt2Var4 = l1Var2 != null ? l1Var2.f125284h : null;
            if (qt2Var4 != null) {
                qt2Var4.set(0, Ri);
            }
        }
        com.tencent.mars.xlog.Log.i("FinderMultiTaskReporter", "switch multi task sessionId update: " + ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135385q);
        return jz5.f0.f302826a;
    }
}
