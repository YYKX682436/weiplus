package go2;

/* loaded from: classes2.dex */
public final class t implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f274065d;

    public t(go2.z zVar) {
        this.f274065d = zVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17 = g4Var.z();
        go2.z zVar = this.f274065d;
        if (z17) {
            g4Var.a(1, com.tencent.mm.R.string.f490407u4);
            g4Var.a(2, com.tencent.mm.R.string.f490415uc);
            ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_finder_maas_show_post_entry, bm5.h0.RepairerConfig_Maas_ShowMainEntry_Int, 0) == 1;
            com.tencent.mars.xlog.Log.i("FinderMaasXConfigImpl", "showMainPostEntry: " + z18);
            if (py0.b.f358971a.a() & z18) {
                g4Var.a(4, com.tencent.mm.R.string.f9t);
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.i1.f460495a.b(1010, zVar.F, g4Var, zVar.getContext());
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        android.app.Activity context = zVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 0, "post_acionsheet_camera", "", nyVar != null ? nyVar.V6() : null, null, 16, null);
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c18;
        android.app.Activity context2 = zVar.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.o3.ij(o3Var2, 0, "post_actionsheet_album", "", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
    }
}
