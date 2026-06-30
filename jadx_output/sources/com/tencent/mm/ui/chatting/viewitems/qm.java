package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class qm extends com.tencent.mm.ui.chatting.viewitems.nn {

    /* renamed from: x, reason: collision with root package name */
    public yb5.d f205385x;

    @Override // com.tencent.mm.ui.chatting.viewitems.nn, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (!f9Var.u2()) {
            return true;
        }
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        if (f9Var.P0() == 5) {
            g4Var.c(d17, 103, 0, view.getContext().getString(com.tencent.mm.R.string.b5i), com.tencent.mm.R.raw.icons_filled_refresh);
        }
        if (this.f205385x.F()) {
            return true;
        }
        g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f205385x = dVar;
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = (com.tencent.mm.ui.chatting.viewitems.ao) g0Var;
        x01.a a17 = x01.a.a(f9Var.j());
        Z(aoVar, f9Var.P0() < 2, true);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).rj(aoVar.f203379b.getContext(), x01.b.a(a17), (int) aoVar.f203379b.getTextSize(), 1, null, "");
        aoVar.f203379b.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), aoVar, null));
        aoVar.f203379b.setOnLongClickListener(u(dVar));
        V(aoVar, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
