package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class pm extends com.tencent.mm.ui.chatting.viewitems.gn {

    /* renamed from: x, reason: collision with root package name */
    public yb5.d f205279x;

    @Override // com.tencent.mm.ui.chatting.viewitems.gn, com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488531w5);
        com.tencent.mm.ui.chatting.viewitems.rm rmVar = new com.tencent.mm.ui.chatting.viewitems.rm();
        rmVar.a(xgVar, true);
        xgVar.setTag(rmVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.gn, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (!f9Var.u2()) {
            return true;
        }
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        if (f9Var.P0() == 5) {
            g4Var.c(d17, 103, 0, view.getContext().getString(com.tencent.mm.R.string.b5i), com.tencent.mm.R.raw.icons_filled_refresh);
        }
        if (this.f205279x.F()) {
            return true;
        }
        g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f205279x = dVar;
        com.tencent.mm.ui.chatting.viewitems.rm rmVar = (com.tencent.mm.ui.chatting.viewitems.rm) g0Var;
        x01.a a17 = x01.a.a(f9Var.j());
        if (a17 == null) {
            return;
        }
        java.lang.String str2 = a17.f450972a;
        n(rmVar, dVar, f9Var, str2);
        m(rmVar, dVar, str2, f9Var);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).rj(rmVar.f205466b.getContext(), x01.b.a(a17), (int) rmVar.f205466b.getTextSize(), 1, null, "");
        rmVar.f205466b.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), rmVar, null));
        rmVar.f205466b.setOnLongClickListener(u(dVar));
    }
}
