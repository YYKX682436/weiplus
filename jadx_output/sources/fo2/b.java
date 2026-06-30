package fo2;

/* loaded from: classes2.dex */
public final class b implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo2.e f264896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f264897e;

    public b(fo2.e eVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f264896d = eVar;
        this.f264897e = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            fo2.e eVar = this.f264896d;
            boolean z17 = eVar.z();
            androidx.appcompat.app.AppCompatActivity context = eVar.f434158a;
            if (z17) {
                g4Var.l(20008, context.getResources().getString(com.tencent.mm.R.string.f491911m43), com.tencent.mm.R.raw.vip_filled_new, false);
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127773jc).getValue()).r()).intValue();
            java.lang.String str = eVar.f264900c;
            if (intValue == 1 && ya2.h.f460484a.b(str) != null) {
                g4Var.l(20002, context.getString(com.tencent.mm.R.string.ezy), com.tencent.mm.R.raw.finder_icons_filled_share, false);
            }
            if (!eVar.o()) {
                g4Var.l(20005, context.getResources().getString(com.tencent.mm.R.string.f491699dy4), com.tencent.mm.R.raw.icons_outlined_report_problem, false);
            }
            if (eVar.A()) {
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                pm0.v.T(new ho2.c(nyVar != null ? nyVar.V6() : null, str, 1).l(), new fo2.a(this.f264897e, g4Var, eVar));
            }
        }
    }
}
