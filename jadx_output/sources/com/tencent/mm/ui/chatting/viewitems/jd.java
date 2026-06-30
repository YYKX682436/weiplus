package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class jd extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204251s;

    public static boolean d0(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || v17.f348666i != 60) {
            return false;
        }
        try {
            ((w80.i) i95.n0.c(w80.i.class)).getClass();
            ((w80.i) i95.n0.c(w80.i.class)).getClass();
            if (!iq.b.g(dVar.g()) && !iq.b.C(dVar.g()) && !iq.b.v(dVar.g()) && !iq.b.e(dVar.g())) {
                no0.o oVar = (no0.o) v17.y(no0.o.class);
                long parseLong = java.lang.Long.parseLong(oVar.f338731b);
                java.lang.String str2 = oVar.f338732c;
                java.lang.String str3 = oVar.f338733d;
                en0.g gVar = new en0.g();
                gVar.f255246a = 0;
                gVar.f255250e = str3;
                gVar.f255247b = dVar.x();
                gVar.f255248c = parseLong;
                gVar.f255249d = str2;
                gVar.f255251f = str;
                gVar.a();
                if (str == null) {
                    str = dVar.u().d1();
                }
                p52.h.f352021f = str;
                n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
                long j17 = (int) dVar.u().E2;
                ((m30.m) rVar).getClass();
                p52.h.f352022g = b52.b.q(j17);
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemAppMsgShareLiveTo", "jump to live fail: %s", e17.getMessage());
            return true;
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean C() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        com.tencent.mm.ui.chatting.viewitems.xg xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488560xb);
        xgVar.setTag(new com.tencent.mm.ui.chatting.viewitems.kd(xgVar, java.lang.Boolean.TRUE));
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
        if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f204251s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !this.f204251s.A()) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return d0(view, dVar, f9Var, A(dVar, f9Var));
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f204251s = dVar;
        if (g0Var instanceof com.tencent.mm.ui.chatting.viewitems.kd) {
            ot0.q v17 = ot0.q.v(f9Var.U1());
            if (v17 != null) {
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = ((com.tencent.mm.ui.chatting.viewitems.kd) g0Var).f204324b;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.lang.String m17 = v17.m();
                ((ke0.e) xVar).getClass();
                mMNeat7extView.b(com.tencent.mm.pluginsdk.ui.span.c0.i(context, m17));
                long parseLong = java.lang.Long.parseLong(((no0.o) v17.y(no0.o.class)).f338731b);
                java.lang.String x17 = dVar.x();
                ((v80.k) ((w80.i) i95.n0.c(w80.i.class))).Bi(parseLong, x17, new com.tencent.mm.ui.chatting.viewitems.id(this, parseLong, g0Var, dVar));
            }
            g0Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), g0Var, null));
            g0Var.clickArea.setOnClickListener(w(dVar));
            g0Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
            g0Var.clickArea.setOnLongClickListener(u(dVar));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgShareLiveTo", "filling");
    }
}
