package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class y5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.c6 f200282d;

    public y5(com.tencent.mm.ui.chatting.component.c6 c6Var) {
        this.f200282d = c6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity g17;
        int i17;
        android.app.Activity g18;
        int i18;
        com.tencent.mm.storage.f9 f9Var;
        ot0.q v17;
        com.tencent.mm.ui.chatting.component.c6 c6Var = this.f200282d;
        com.tencent.mm.ui.chatting.component.b5 b5Var = c6Var.f198873d;
        b5Var.f198701o = "";
        java.util.List<com.tencent.mm.storage.f9> p07 = b5Var.p0();
        if (com.tencent.mm.ui.chatting.n3.u(p07)) {
            db5.e1.y(b5Var.f198580d.g(), b5Var.f198580d.g().getString(com.tencent.mm.R.string.car), "", b5Var.f198580d.g().getString(com.tencent.mm.R.string.f489708h), new com.tencent.mm.ui.chatting.component.z5(c6Var));
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        b5Var.f198697h.getClass();
        java.util.LinkedList linkedList = (java.util.LinkedList) p07;
        int size = linkedList.size();
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (size == 1 && (f9Var = (com.tencent.mm.storage.f9) linkedList.get(0)) != null && (f9Var.k2() || f9Var.t2())) {
            if (f9Var.n2() && (v17 = ot0.q.v(f9Var.j())) != null && ez.v0.f257777a.k(java.lang.Integer.valueOf(v17.f348666i))) {
                db5.e1.y(b5Var.f198580d.g(), b5Var.f198580d.g().getString(com.tencent.mm.R.string.cez), "", b5Var.f198580d.g().getString(com.tencent.mm.R.string.f489708h), new com.tencent.mm.ui.chatting.component.a6(c6Var));
                return;
            }
            java.lang.String a17 = c01.n2.a("" + f9Var.I0());
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("prePublishId", "msg_" + f9Var.I0());
            c17.i("preUsername", com.tencent.mm.ui.chatting.viewitems.a0.v(f9Var, b5Var.f198698i, ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) b5Var.f198580d.f460708c.a(sb5.f.class))).f198753r));
            c17.i("preChatName", b5Var.f198697h.d1());
            c17.i("preMsgIndex", 0);
            c17.i("sendAppMsgScene", 1);
            ((n34.p4) ((p94.o0) i95.n0.c(p94.o0.class))).wi("adExtStr", c17, f9Var);
            c4Var.f6322h = a17;
        }
        if (com.tencent.mm.pluginsdk.model.e2.j(b5Var.f198580d.g(), doFavoriteEvent, b5Var.f198697h.d1(), p07, false, true, o72.c2.a())) {
            for (com.tencent.mm.storage.f9 f9Var2 : p07) {
                if (f9Var2.k2()) {
                    v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
                    ot0.u.a(f9Var2);
                    ((u90.a) vVar).getClass();
                    com.tencent.mm.modelstat.e.f71505a.getClass();
                } else {
                    ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
                    com.tencent.mm.modelstat.e.f71505a.getClass();
                }
            }
            c6Var.b(doFavoriteEvent);
            java.util.Iterator it = b5Var.p0().iterator();
            while (it.hasNext()) {
                com.tencent.mm.ui.chatting.e.c(com.tencent.mm.ui.chatting.c.Fav, com.tencent.mm.ui.chatting.d.Samll, (com.tencent.mm.storage.f9) it.next(), 0);
            }
            return;
        }
        if (((java.util.LinkedList) b5Var.p0()).size() <= 1) {
            if (c4Var.f6326l == com.tencent.mm.R.string.cds) {
                db5.e1.s(b5Var.f198580d.g(), b5Var.f198580d.g().getString(com.tencent.mm.R.string.cds, java.lang.Integer.valueOf((int) ((((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Bj() / 1024) / 1024))), "");
                return;
            } else {
                db5.e1.i(b5Var.f198580d.g(), c4Var.f6326l, 0);
                return;
            }
        }
        android.app.Activity g19 = b5Var.f198580d.g();
        if (c4Var.f6326l >= 0) {
            g17 = b5Var.f198580d.g();
            i17 = com.tencent.mm.R.string.caq;
        } else {
            g17 = b5Var.f198580d.g();
            i17 = com.tencent.mm.R.string.cap;
        }
        java.lang.String string = g17.getString(i17);
        if (c4Var.f6326l >= 0) {
            g18 = b5Var.f198580d.g();
            i18 = com.tencent.mm.R.string.f490939bb1;
        } else {
            g18 = b5Var.f198580d.g();
            i18 = com.tencent.mm.R.string.hjg;
        }
        db5.e1.A(g19, string, "", g18.getString(i18), b5Var.f198580d.g().getString(com.tencent.mm.R.string.baz), new com.tencent.mm.ui.chatting.component.b6(c6Var, p07, doFavoriteEvent), null);
    }
}
