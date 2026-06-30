package ze5;

/* loaded from: classes9.dex */
public abstract class f5 {
    public static final void a(db5.g4 g4Var, android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        java.lang.Object tag = view.getTag();
        com.tencent.mm.ui.chatting.viewitems.er erVar = tag instanceof com.tencent.mm.ui.chatting.viewitems.er ? (com.tencent.mm.ui.chatting.viewitems.er) tag : null;
        if (erVar == null) {
            return;
        }
        int d17 = erVar.d();
        ot0.q v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        if (v17 == null) {
            return;
        }
        if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var) && !com.tencent.mm.ui.chatting.n3.j(f9Var) && (v17.f348666i != 19 || f9Var.P0() != 1)) {
            g4Var.c(d17, 111, 0, dVar.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        if ((f9Var.K1() || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, dVar) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !dVar.A()) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        if (!c01.ia.A(f9Var)) {
            j45.l.g("favorite");
            if (com.tencent.mm.ui.chatting.component.z4.b(f9Var)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgRecordMvvm", "canShowFav false");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgRecordMvvm", "canShowFav true");
                g4Var.c(d17, 116, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            }
        }
        if (dVar.F()) {
            return;
        }
        g4Var.c(d17, 100, 0, dVar.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
    }

    public static final boolean b(android.view.MenuItem menuItem, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (menuItem.getItemId() != 111) {
            return true;
        }
        if (!com.tencent.mm.ui.chatting.la.a(f9Var)) {
            db5.e1.y(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.c96), "", dVar.g().getString(com.tencent.mm.R.string.l_e), null);
            return false;
        }
        ze5.e5 e5Var = new ze5.e5(dVar, f9Var);
        android.app.Activity g17 = dVar.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        com.tencent.mm.ui.chatting.manager.t.a(f9Var, g17, e5Var);
        return false;
    }
}
