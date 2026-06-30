package dt;

/* loaded from: classes9.dex */
public class s4 extends com.tencent.mm.sdk.event.n {
    public s4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        com.tencent.mm.storage.f9 f9Var = ((com.tencent.mm.autogen.events.ResendMsgEvent) iEvent).f54704g.f8032a;
        if (f9Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "resend msg, type:%d", java.lang.Integer.valueOf(f9Var.getType()));
            if (f9Var.g3()) {
                com.tencent.mm.ui.chatting.ic.f(f9Var);
            } else if (f9Var.J2()) {
                com.tencent.mm.ui.chatting.ic.e(f9Var);
            } else if (f9Var.C2()) {
                com.tencent.mm.ui.chatting.ic.c(f9Var);
            } else if (f9Var.b3()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ResendMsgLogic", "resendTextMsg, msgId:%d", java.lang.Long.valueOf(f9Var.getMsgId()));
                com.tencent.mm.ui.chatting.ic.g(f9Var);
            } else if (f9Var.L2()) {
                com.tencent.mm.ui.chatting.ic.d(f9Var);
            } else if (f9Var.m2()) {
                com.tencent.mm.ui.chatting.ic.a(f9Var);
            } else if (f9Var.k2()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ResendMsgLogic", "resendAppMsg, msgId:%d", java.lang.Long.valueOf(f9Var.getMsgId()));
                java.lang.String j17 = f9Var.j();
                int A0 = f9Var.A0();
                java.lang.String Q0 = f9Var.Q0();
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                if (c01.v1.x(Q0, false) && j17 != null && A0 == 0) {
                    j17 = c01.w9.u(j17);
                }
                ot0.q v17 = ot0.q.v(j17);
                if ((v17 == null || 19 != v17.f348666i) && (v17 == null || 24 != v17.f348666i)) {
                    long o17 = c01.w9.o(f9Var.Q0());
                    if (o17 == f9Var.getCreateTime()) {
                        o17++;
                    }
                    f9Var.e1(o17);
                    ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
                    if (v17 == null || !ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i))) {
                        android.util.Pair z17 = com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
                        if (z17 == null || z17.second != null) {
                            c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
                        }
                    } else {
                        dk5.w.f234966a.b(f9Var, "file_resend_from_event");
                    }
                } else {
                    dk5.m2.f234731a.a(f9Var.Q0(), f9Var, true);
                }
            } else if (f9Var.E2()) {
                com.tencent.mm.ui.chatting.ic.b(f9Var);
            } else if (f9Var.isVideo() || f9Var.Y2()) {
                long o18 = c01.w9.o(f9Var.Q0());
                if (o18 == f9Var.getCreateTime()) {
                    o18++;
                }
                f9Var.e1(o18);
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
                if (g17 != null) {
                    g17.n(f9Var.Q0());
                    g17.f415012j = f9Var.getCreateTime();
                    g17.U = 128;
                    ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                    t21.o2.Ui().C(g17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ResendMsgLogic", "resendVideoMsg, msgId:%d, msgtime: %d, infotime:%d", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.getCreateTime()), java.lang.Long.valueOf(g17.f415012j));
                }
                if (c01.d9.b().E()) {
                    t21.d3.C(f9Var.z0());
                } else {
                    db5.t7.l(com.tencent.mm.sdk.platformtools.x2.f193071a);
                }
            } else {
                f9Var.r1(5);
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
                com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "resendMsg, unknown msg type");
            }
        }
        return false;
    }
}
