package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class hd extends com.tencent.mm.ui.chatting.viewitems.a0 {
    public static boolean d0(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || v17.f348666i != 60) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.f9.SessionGroupLive.k(view.getContext(), null)) {
            return true;
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
                gVar.f255246a = 1;
                gVar.f255250e = str3;
                gVar.f255247b = dVar.x();
                gVar.f255248c = parseLong;
                gVar.f255249d = str2;
                gVar.f255253h = 2;
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
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveVisitorIDKeyStat", "markVisitorClickSysMsgEnterLive");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1381L, 0L, 1L);
                ((v80.k) ((w80.i) i95.n0.c(w80.i.class))).Bi(parseLong, dVar.x(), new com.tencent.mm.ui.chatting.viewitems.gd(dVar));
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemAppMsgShareLiveFrom", "jump to live fail: %s", e17.getMessage());
            return false;
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
        com.tencent.mm.ui.chatting.viewitems.xg xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488519vs);
        xgVar.setTag(new com.tencent.mm.ui.chatting.viewitems.kd(xgVar, java.lang.Boolean.TRUE));
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
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
        ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return d0(view, dVar, f9Var, A(dVar, f9Var));
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
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
                ((v80.k) ((w80.i) i95.n0.c(w80.i.class))).Bi(parseLong, x17, new com.tencent.mm.ui.chatting.viewitems.fd(this, parseLong, g0Var, dVar, x17));
            }
            g0Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), g0Var, null));
            g0Var.clickArea.setOnClickListener(w(dVar));
            g0Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
            g0Var.clickArea.setOnLongClickListener(u(dVar));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgShareLiveFrom", "filling");
    }
}
