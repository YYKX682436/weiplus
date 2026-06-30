package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class dl extends com.tencent.mm.ui.chatting.viewitems.a0 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488486uj);
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = new com.tencent.mm.ui.chatting.viewitems.ao();
        aoVar.a(xgVar, false);
        xgVar.setTag(aoVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        ((com.tencent.mm.ui.chatting.viewitems.go) view.getTag()).d();
        g4Var.clear();
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = (com.tencent.mm.ui.chatting.viewitems.ao) g0Var;
        aoVar.f203379b.setTag(com.tencent.mm.R.id.bon, java.lang.Long.valueOf(f9Var.getMsgId()));
        aoVar.f203379b.setTag(com.tencent.mm.R.id.rfh, f9Var.Q0());
        aoVar.f203379b.setTag(com.tencent.mm.R.id.bom, java.lang.Boolean.TRUE);
        aoVar.f203379b.setMaxLines(Integer.MAX_VALUE);
        aoVar.f203379b.setTag(new com.tencent.mm.ui.chatting.viewitems.go(dVar2, dVar.D(), aoVar, str));
        ot0.q v17 = ot0.q.v(f9Var.U1());
        java.util.Objects.requireNonNull(v17);
        java.util.Map map = v17.G2;
        Z(aoVar, f9Var.P0() < 2, true);
        com.tencent.mm.ui.chatting.viewitems.el.a(dVar, aoVar, map, f9Var);
        aoVar.f203379b.setOnLongClickListener(u(dVar));
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = aoVar.f203379b;
        mMNeat7extView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(mMNeat7extView, new com.tencent.mm.pluginsdk.ui.span.y0(aoVar.f203379b.getContext())));
    }
}
