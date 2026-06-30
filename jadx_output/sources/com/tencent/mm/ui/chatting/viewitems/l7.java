package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class l7 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204403s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean C() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        com.tencent.mm.ui.chatting.viewitems.xg xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488543wk);
        xgVar.setTag(new com.tencent.mm.ui.chatting.viewitems.m7(xgVar, java.lang.Boolean.TRUE));
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean N() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f204403s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !this.f204403s.A()) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        r45.g92 g92Var;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || v17.f348666i != 65) {
            return false;
        }
        try {
            zy2.b bVar = (zy2.b) v17.y(zy2.b.class);
            if (bVar != null && (g92Var = bVar.f477350b) != null) {
                long Z = pm0.v.Z(g92Var.getString(2));
                long Z2 = pm0.v.Z(g92Var.getString(0));
                try {
                    java.lang.String A = A(dVar, f9Var);
                    if (A == null) {
                        A = dVar.u().d1();
                    }
                    p52.h.f352021f = A;
                    n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
                    long j17 = (int) dVar.u().E2;
                    ((m30.m) rVar).getClass();
                    p52.h.f352022g = b52.b.q(j17);
                    new android.content.Intent().putExtra("KEY_PARAMS_SOURCE_TYPE", g92Var.getInteger(15));
                    ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).oj(null, com.tencent.mm.sdk.platformtools.x2.f193071a, Z, java.lang.Long.valueOf(Z2), g92Var.getString(12), g92Var.getString(4), "", "", "");
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemAppMsgLiveInviteTo", "jump to live fail: %s", e.getMessage());
                    return true;
                }
            }
            return true;
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        zy2.b bVar;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f204403s = dVar;
        if (g0Var instanceof com.tencent.mm.ui.chatting.viewitems.m7) {
            com.tencent.mm.ui.chatting.viewitems.m7 m7Var = (com.tencent.mm.ui.chatting.viewitems.m7) g0Var;
            ot0.q v17 = ot0.q.v(f9Var.U1());
            if (v17 != null && (bVar = (zy2.b) v17.y(zy2.b.class)) != null) {
                r45.g92 g92Var = bVar.f477350b;
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = m7Var.f204564b;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = dVar.g();
                java.lang.String string = g92Var.getString(3);
                ((ke0.e) xVar).getClass();
                mMNeat7extView.b(com.tencent.mm.pluginsdk.ui.span.c0.i(g17, string));
                if (g92Var.getString(5) != null) {
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    vo0.d e17 = g1Var.e();
                    vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
                    java.lang.String string2 = g92Var.getString(5);
                    if (string2 == null) {
                        string2 = "";
                    }
                    e17.c(((c61.i8) i5Var).Ai(string2, com.tencent.mm.plugin.finder.storage.y90.f128356f), m7Var.f204565c, g1Var.h(mn2.f1.f329963q));
                }
            }
            g0Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), g0Var, null));
            g0Var.clickArea.setOnClickListener(w(dVar));
            g0Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
            g0Var.clickArea.setOnLongClickListener(u(dVar));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgLiveInviteTo", "filling");
    }
}
