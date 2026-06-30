package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class am extends com.tencent.mm.ui.chatting.viewitems.a0 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488528w2);
        com.tencent.mm.ui.chatting.viewitems.zl zlVar = new com.tencent.mm.ui.chatting.viewitems.zl(this);
        zlVar.a(xgVar);
        xgVar.setTag(zlVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        menuItem.getItemId();
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        g4Var.c(((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d(), 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.ui.chatting.viewitems.zl zlVar = (com.tencent.mm.ui.chatting.viewitems.zl) g0Var;
        ot0.q v17 = ot0.q.v(dVar2.f394254d.f445300b.U1());
        com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), g0Var, null);
        if (v17 != null && (v17.f348634J == 3 || v17.B0 == 3)) {
            zlVar.f206165b.setImageResource(com.tencent.mm.R.drawable.bj7);
            zlVar.f206166c.setText(v17.G0);
        }
        g0Var.clickArea.setOnLongClickListener(u(dVar));
        g0Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
        g0Var.clickArea.setTag(erVar);
    }
}
