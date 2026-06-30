package hd2;

/* loaded from: classes2.dex */
public final class p0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f280513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280515f;

    public p0(android.app.Activity activity, java.lang.String str, com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment) {
        this.f280513d = activity;
        this.f280514e = str;
        this.f280515f = finderProfileCardFragment;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17 = g4Var.z();
        android.app.Activity context = this.f280513d;
        if (z17) {
            db5.h4 h4Var = (db5.h4) g4Var.f(1, i65.a.r(context, com.tencent.mm.R.string.f490407u4));
            java.lang.String Vi = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Vi();
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127922s0).getValue()).r()).intValue() == 1;
            boolean z19 = !(Vi == null || r26.n0.N(Vi));
            java.lang.String str = this.f280514e;
            boolean z27 = (r26.n0.N(str) ^ true) && g92.b.f269769e.G2(str);
            if (z18 && z19 && z27) {
                h4Var.f228373q = Vi;
                h4Var.f228374r = com.tencent.mm.R.color.Orange_100;
            }
            g4Var.a(2, com.tencent.mm.R.string.f490415uc);
            ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
            boolean z28 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_finder_maas_show_post_entry, bm5.h0.RepairerConfig_Maas_ShowMainEntry_Int, 0) == 1;
            com.tencent.mars.xlog.Log.i("FinderMaasXConfigImpl", "showMainPostEntry: " + z28);
            if (py0.b.f358971a.a() & z28) {
                g4Var.a(4, com.tencent.mm.R.string.f9t);
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.i1.f460495a.b(1010, this.f280515f.f110056t, g4Var, context);
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        kotlin.jvm.internal.o.g(context, "context");
        boolean z29 = context instanceof com.tencent.mm.ui.MMFragmentActivity;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = z29 ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 0, "post_acionsheet_camera", "", nyVar != null ? nyVar.V6() : null, null, 16, null);
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c18;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = z29 ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.o3.ij(o3Var2, 0, "post_actionsheet_album", "", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
    }
}
