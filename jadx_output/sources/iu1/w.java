package iu1;

/* loaded from: classes9.dex */
public final class w implements vl1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294970a;

    public w(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI) {
        this.f294970a = cardHomePageNewUI;
    }

    @Override // vl1.o
    public final boolean a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294970a;
        iu1.c cVar = cardHomePageNewUI.f95184m;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mHomePageAdapter");
            throw null;
        }
        iu1.a x17 = cVar.x(i17);
        if (x17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "long click type: %s", java.lang.Integer.valueOf(x17.f294832b));
            if (x17.f294832b == 2) {
                androidx.appcompat.app.AppCompatActivity context = cardHomePageNewUI.getContext();
                android.view.LayoutInflater.from(context);
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, false);
                db5.g4 g4Var = new db5.g4(context);
                new db5.g4(context);
                iu1.t tVar = new iu1.t(cardHomePageNewUI);
                iu1.v vVar = new iu1.v(cardHomePageNewUI, x17, i17);
                g4Var.clear();
                db5.g4 g4Var2 = new db5.g4(context);
                tVar.onCreateMMMenu(g4Var2);
                if (g4Var2.z()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                } else {
                    k0Var.f211872n = tVar;
                    k0Var.f211881s = vVar;
                    k0Var.f211854d = null;
                    k0Var.G = null;
                    k0Var.v();
                }
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                r45.wt wtVar = x17.f294831a;
                kotlin.jvm.internal.o.d(wtVar);
                g0Var.d(16324, 2, wtVar.f389427d, 0, 0, 7, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(cardHomePageNewUI.E));
            }
        }
        return false;
    }
}
