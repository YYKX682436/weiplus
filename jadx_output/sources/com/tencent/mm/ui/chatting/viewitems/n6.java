package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class n6 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204904s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488547wq);
        com.tencent.mm.ui.chatting.viewitems.l6 l6Var = new com.tencent.mm.ui.chatting.viewitems.l6();
        l6Var.a(xgVar, true);
        xgVar.setTag(l6Var);
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
        com.tencent.mm.ui.chatting.viewitems.o6.b(dVar.g(), f9Var);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        boolean z17 = !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        if (f9Var != null && !z17) {
            if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 111, 0, this.f204904s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
            j45.l.g("favorite");
            if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f204904s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !this.f204904s.A()) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        r45.mv2 a17;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || (a17 = com.tencent.mm.ui.chatting.viewitems.o6.a(v17)) == null) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.o6.c(dVar.g(), f9Var, a17);
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
        java.lang.String string;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f204904s = dVar;
        com.tencent.mm.ui.chatting.viewitems.l6 l6Var = (com.tencent.mm.ui.chatting.viewitems.l6) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            r45.mv2 a17 = com.tencent.mm.ui.chatting.viewitems.o6.a(v17);
            if (a17 != null && ((r45.ht0) a17.getCustom(6)) != null) {
                if (a17.getInteger(1) == 7) {
                    string = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).pj((r45.ht0) a17.getCustom(6));
                    java.lang.String charSequence = com.tencent.mm.sdk.platformtools.x2.f193071a.getText(com.tencent.mm.R.string.cmu).toString();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(((r45.ht0) a17.getCustom(6)).getString(5))) {
                        charSequence = ((r45.ht0) a17.getCustom(6)).getString(5);
                    }
                    l6Var.f204402f.setText(charSequence);
                } else {
                    string = a17.getString(0);
                }
                android.widget.TextView textView = l6Var.f204398b;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = dVar.g();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g17, string));
                if (com.tencent.mm.sdk.platformtools.t8.K0(a17.getString(2))) {
                    l6Var.f204399c.setVisibility(4);
                } else {
                    l6Var.f204399c.setVisibility(0);
                    vo0.e eVar = vo0.e.f438467a;
                    vo0.e.f438468b.c(a17.getString(2), l6Var.f204399c, com.tencent.mm.ui.chatting.viewitems.o6.f205138a);
                }
                l6Var.f204400d.setText(a17.getString(3));
            }
            android.view.View view = l6Var.clickArea;
            if (view != null) {
                view.setOnClickListener(w(dVar));
                l6Var.clickArea.setOnLongClickListener(u(dVar));
                l6Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
                l6Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, this.f204904s.D(), l6Var, null));
            }
        }
        android.widget.ImageView imageView = l6Var.f204401e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        Z(l6Var, f9Var.P0() < 2, true);
        V(l6Var, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
