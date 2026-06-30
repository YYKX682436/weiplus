package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class y40 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136527d;

    public y40(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f136527d = f50Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17;
        g92.b bVar = g92.b.f269769e;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f136527d;
        m92.b j37 = g92.a.j3(bVar, f50Var.f134338d, false, 2, null);
        int i17 = (!(((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("PersonalCenterActionSheetPost") != null && ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("PersonalCenterActionSheetPost") != null && ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true)) || (j37 != null ? j37.w0() : false)) ? 0 : 1;
        if (g4Var.z()) {
            db5.h4 h4Var = (db5.h4) g4Var.a(1001, com.tencent.mm.R.string.f490407u4);
            if (i17 != 0) {
                r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("PersonalCenterActionSheetPost");
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("PersonalCenterActionSheetPost");
                if (I0 != null && I0.f373887d == 6) {
                    h4Var.f228363d = true;
                } else {
                    if (I0 != null && I0.f373887d == 17) {
                        h4Var.f228373q = I0.f373889f;
                        h4Var.f228374r = com.tencent.mm.R.color.Orange_100;
                    } else {
                        z17 = true;
                        if (I0 != null && L0 != null) {
                            com.tencent.mm.plugin.finder.report.x2.f125429a.e("4", L0, I0, 1, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
                        }
                    }
                }
                z17 = false;
                if (I0 != null) {
                    com.tencent.mm.plugin.finder.report.x2.f125429a.e("4", L0, I0, 1, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
                }
            } else {
                z17 = true;
            }
            if (z17) {
                java.lang.String Vi = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Vi();
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127922s0).getValue()).r()).intValue() == 1;
                boolean z19 = !(Vi == null || r26.n0.N(Vi));
                boolean z27 = (r26.n0.N(f50Var.f134338d) ^ true) && bVar.G2(f50Var.f134338d);
                if (z18 && z19 && z27) {
                    h4Var.f228373q = Vi;
                    h4Var.f228374r = com.tencent.mm.R.color.Orange_100;
                }
            }
            g4Var.a(1002, com.tencent.mm.R.string.f490415uc);
            ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
            boolean z28 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_finder_maas_show_post_entry, bm5.h0.RepairerConfig_Maas_ShowMainEntry_Int, 0) == 1;
            com.tencent.mars.xlog.Log.i("FinderMaasXConfigImpl", "showMainPostEntry: " + z28);
            if (py0.b.f358971a.a() & z28) {
                g4Var.a(1031, com.tencent.mm.R.string.f9t);
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.i1.f460495a.b(1010, f50Var.f134346n, g4Var, f50Var.getContext());
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("is_red_dot", i17);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        android.app.Activity context = f50Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 0, "post_acionsheet_camera", jSONObject2, nyVar != null ? nyVar.V6() : null, null, 16, null);
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c18;
        android.app.Activity context2 = f50Var.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.o3.ij(o3Var2, 0, "post_actionsheet_album", "", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
    }
}
