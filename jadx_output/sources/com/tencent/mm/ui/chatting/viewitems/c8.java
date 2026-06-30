package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class c8 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203703s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488502v2);
        com.tencent.mm.ui.chatting.viewitems.b8 b8Var = new com.tencent.mm.ui.chatting.viewitems.b8();
        b8Var.a(xgVar, false);
        xgVar.setTag(b8Var);
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
        com.tencent.mm.ui.chatting.viewitems.e8.a(dVar.g(), f9Var);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (c01.ia.A(f9Var) || c01.ia.x(f9Var)) {
            return true;
        }
        g4Var.c(0, 111, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.viewitems.e8.b(dVar, f9Var);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f203703s = dVar;
        com.tencent.mm.ui.chatting.viewitems.b8 b8Var = (com.tencent.mm.ui.chatting.viewitems.b8) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            zy2.h hVar = (zy2.h) v17.y(zy2.h.class);
            if (hVar != null) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d a17 = g1Var.a();
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                ya2.l lVar = ya2.l.f460502a;
                a17.c(lVar.e(hVar.f477393d, com.tencent.mm.plugin.finder.storage.y90.f128356f), b8Var.f203464b, g1Var.h(mn2.f1.f329962p));
                android.widget.TextView textView = b8Var.f203465c;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = dVar.g();
                java.lang.String str2 = hVar.f477394e;
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g17, str2));
                int i17 = hVar.f477396g;
                if (i17 > 0) {
                    b8Var.f203466d.setVisibility(0);
                    if (i17 != 1) {
                        if (i17 == 2) {
                            b8Var.f203466d.setImageResource(com.tencent.mm.R.raw.icons_filled_star_identify_enterprise);
                        } else if (i17 == 100) {
                            b8Var.f203466d.setVisibility(8);
                        }
                    } else if (hVar.f477397h.isEmpty()) {
                        b8Var.f203466d.setImageDrawable(com.tencent.mm.ui.uk.e(dVar.g(), com.tencent.mm.R.raw.icons_filled_star_identify, dVar.s().getColor(com.tencent.mm.R.color.f478526a7)));
                    } else {
                        vo0.d e17 = g1Var.e();
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        e17.c(lVar.e(hVar.f477397h, com.tencent.mm.plugin.finder.storage.y90.f128355e), b8Var.f203466d, g1Var.h(mn2.f1.B));
                    }
                } else {
                    b8Var.f203466d.setVisibility(8);
                }
                if (i17 != 1 || com.tencent.mm.sdk.platformtools.t8.K0(hVar.f477395f)) {
                    b8Var.f203467e.setVisibility(8);
                } else {
                    b8Var.f203467e.setVisibility(0);
                    b8Var.f203467e.setText(hVar.f477395f);
                }
            }
            b8Var.clickArea.setOnClickListener(w(dVar));
            b8Var.clickArea.setOnLongClickListener(u(dVar));
            b8Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
            b8Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, this.f203703s.D(), b8Var, null));
        }
    }
}
