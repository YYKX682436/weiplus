package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class t8 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205568s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488504v6);
        com.tencent.mm.ui.chatting.viewitems.s8 s8Var = new com.tencent.mm.ui.chatting.viewitems.s8();
        s8Var.a(xgVar, false);
        xgVar.setTag(s8Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        if (menuItem.getItemId() != 111) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.v8.a(dVar.g(), f9Var);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        boolean z17 = !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        if (f9Var != null) {
            j45.l.g("favorite");
            if (!z17 && !c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 111, 0, this.f205568s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        r45.mv2 c17;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || (c17 = com.tencent.mm.ui.chatting.viewitems.v8.c(v17)) == null) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.v8.b(dVar.g(), f9Var, c17);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f205568s = dVar;
        com.tencent.mm.ui.chatting.viewitems.s8 s8Var = (com.tencent.mm.ui.chatting.viewitems.s8) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            r45.mv2 c17 = com.tencent.mm.ui.chatting.viewitems.v8.c(v17);
            if (c17 != null) {
                java.lang.String string = c17.getInteger(1) == 1 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f8m, c17.getString(0)) : c17.getString(0);
                android.widget.TextView textView = s8Var.f205495b;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = dVar.g();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g17, string));
                vo0.e eVar = vo0.e.f438467a;
                vo0.e.f438468b.c(c17.getString(2), s8Var.f205496c, com.tencent.mm.ui.chatting.viewitems.v8.f205841a);
                s8Var.f205497d.setText(c17.getString(3));
            }
            android.view.View view = s8Var.clickArea;
            if (view != null) {
                view.setOnClickListener(w(dVar));
                s8Var.clickArea.setOnLongClickListener(u(dVar));
                s8Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
                s8Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, this.f205568s.D(), s8Var, null));
            }
        }
    }
}
