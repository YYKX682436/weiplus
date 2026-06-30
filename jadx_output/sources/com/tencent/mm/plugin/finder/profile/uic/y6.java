package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class y6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f124383e;

    public y6(com.tencent.mm.plugin.finder.profile.uic.ob obVar, ya2.b2 b2Var) {
        this.f124382d = obVar;
        this.f124383e = b2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ec2.d e27;
        if (menuItem.getItemId() == 10021) {
            ya2.b2 b2Var = this.f124383e;
            com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124382d;
            com.tencent.mm.plugin.finder.profile.uic.ob.O6(obVar, b2Var);
            if (lk5.s.b(obVar.getActivity())) {
                androidx.appcompat.app.AppCompatActivity activity = obVar.getActivity();
                com.tencent.mm.ui.vas.VASActivity vASActivity = activity instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) activity : null;
                if (vASActivity != null && vASActivity.getParentActivity() != null) {
                    android.app.Activity context = obVar.getContext();
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                    if (nyVar != null && (e27 = zy2.ra.e2(nyVar, 0, 1, null)) != null) {
                        e27.a(new ec2.a(26, obVar.P1, obVar.R1));
                    }
                }
            }
            obVar.S1 = null;
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[4];
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(obVar.getActivity());
            lVarArr[0] = new jz5.l("behaviour_session_id", e17 != null ? e17.f135385q : null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(obVar.getActivity());
            lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(obVar.getActivity());
            lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f135386r : null);
            com.tencent.mm.plugin.finder.viewmodel.component.ny e28 = iyVar.e(obVar.getActivity());
            lVarArr[3] = new jz5.l("comment_scene", e28 != null ? java.lang.Integer.valueOf(e28.f135380n) : null);
            ((cy1.a) rVar).Cj("un_follow_click", null, kz5.c1.k(lVarArr), 24617);
        }
    }
}
