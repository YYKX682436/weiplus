package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class m6 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204563s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488504v6);
        com.tencent.mm.ui.chatting.viewitems.l6 l6Var = new com.tencent.mm.ui.chatting.viewitems.l6();
        l6Var.a(xgVar, false);
        xgVar.setTag(l6Var);
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
        com.tencent.mm.ui.chatting.viewitems.o6.b(dVar.g(), f9Var);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        boolean z17 = !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        if (f9Var != null) {
            j45.l.g("favorite");
            if (!z17) {
                g4Var.c(d17, 111, 0, this.f204563s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
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

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        java.lang.String string;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f204563s = dVar;
        com.tencent.mm.ui.chatting.viewitems.l6 l6Var = (com.tencent.mm.ui.chatting.viewitems.l6) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            r45.mv2 a17 = com.tencent.mm.ui.chatting.viewitems.o6.a(v17);
            if (a17 != null && ((r45.ht0) a17.getCustom(6)) != null) {
                if (a17.getInteger(1) == 7) {
                    string = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).pj((r45.ht0) a17.getCustom(6));
                    java.lang.String charSequence = com.tencent.mm.sdk.platformtools.x2.f193071a.getText(com.tencent.mm.R.string.cmu).toString();
                    if (!android.text.TextUtils.isEmpty(((r45.ht0) a17.getCustom(6)).getString(5))) {
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
                l6Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, this.f204563s.D(), l6Var, null));
            }
        }
    }
}
