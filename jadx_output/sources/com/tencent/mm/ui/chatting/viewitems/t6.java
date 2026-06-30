package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class t6 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205564s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488538wf);
        com.tencent.mm.ui.chatting.viewitems.p6 p6Var = new com.tencent.mm.ui.chatting.viewitems.p6();
        p6Var.a(xgVar, true);
        xgVar.setTag(p6Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        if (menuItem.getItemId() != 111) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.u6.c(dVar.g(), f9Var);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        boolean z17 = !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        if (f9Var != null && !z17) {
            if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 111, 0, this.f205564s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
            j45.l.g("favorite");
            if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f205564s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !this.f205564s.A()) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        r45.dv2 a17;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || (a17 = com.tencent.mm.ui.chatting.viewitems.u6.a(v17)) == null) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.u6.b(dVar.g(), f9Var, a17);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.k2()) {
            com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
            c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
            dVar.L(true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f205564s = dVar;
        com.tencent.mm.ui.chatting.viewitems.p6 p6Var = (com.tencent.mm.ui.chatting.viewitems.p6) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            r45.dv2 a17 = com.tencent.mm.ui.chatting.viewitems.u6.a(v17);
            if (a17 != null) {
                android.widget.TextView textView = p6Var.f205235b;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = dVar.g();
                java.lang.String string = a17.getString(1);
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g17, string));
                java.util.ArrayList arrayList = new java.util.ArrayList(a17.getList(3).size() + 2);
                for (int i17 = 0; i17 < a17.getList(3).size() && i17 < 4; i17++) {
                    r45.mb4 mb4Var = new r45.mb4();
                    mb4Var.set(0, (java.lang.String) a17.getList(3).get(i17));
                    mb4Var.set(18, (java.lang.String) a17.getList(4).get(i17));
                    mb4Var.set(19, mb4Var.getString(18));
                    mb4Var.set(1, mb4Var.getString(0));
                    arrayList.add(mb4Var);
                }
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                tw2.e eVar = new tw2.e(arrayList, false);
                p6Var.f205236c.setAdapter(eVar);
                eVar.f422466c = new com.tencent.mm.ui.chatting.viewitems.s6(this, f9Var, a17);
            }
            android.view.View view = p6Var.clickArea;
            if (view != null) {
                view.setOnClickListener(w(dVar));
                p6Var.clickArea.setOnLongClickListener(u(dVar));
                p6Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
                p6Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, this.f205564s.D(), p6Var, null));
            }
        }
        android.widget.ImageView imageView = p6Var.f205237d;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        Z(p6Var, f9Var.P0() < 2, true);
        V(p6Var, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
