package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class y1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.g2 f133372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f133373b;

    public y1(com.tencent.mm.plugin.finder.view.g2 g2Var, java.lang.String str) {
        this.f133372a = g2Var;
        this.f133373b = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[8];
        com.tencent.mm.plugin.finder.view.g2 g2Var = this.f133372a;
        lVarArr[0] = new jz5.l("comment_id", pm0.v.u(g2Var.f132133e));
        lVarArr[1] = new jz5.l("report_extra_data", this.f133373b);
        lVarArr[2] = new jz5.l("unexpose_reason", java.lang.Integer.valueOf(kotlin.jvm.internal.o.b(str, "view_unexp") ? g2Var.f132137i : 0));
        lVarArr[3] = new jz5.l("close_ad_comment_reason", r26.i0.t(kz5.n0.g0(g2Var.f132141m, null, null, null, 0, null, com.tencent.mm.plugin.finder.view.x1.f133312d, 31, null), ",", ";", false));
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(g2Var.f132130b);
        lVarArr[4] = new jz5.l("behaviour_session_id", e17 != null ? e17.f135385q : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(g2Var.f132130b);
        lVarArr[5] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(g2Var.f132130b);
        lVarArr[6] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(g2Var.f132130b);
        lVarArr[7] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f135380n) : null);
        return kz5.c1.k(lVarArr);
    }
}
