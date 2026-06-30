package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class g implements com.tencent.mm.sdk.platformtools.a4, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final long f156818d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f156819e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.nq4 f156820f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f156821g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f156822h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f156823i;

    public g(long j17, r45.nq4 nq4Var) {
        this.f156820f = null;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f156823i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ReceiveTransferAppMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.remittance.model.MsgCheckTaskMgr$MsgCheckTask$1
            {
                this.__eventId = -85283268;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ReceiveTransferAppMsgEvent receiveTransferAppMsgEvent) {
                com.tencent.mm.autogen.events.ReceiveTransferAppMsgEvent receiveTransferAppMsgEvent2 = receiveTransferAppMsgEvent;
                am.xp xpVar = receiveTransferAppMsgEvent2.f54656g;
                if (xpVar.f8397d == null) {
                    return false;
                }
                com.tencent.mm.plugin.remittance.model.g gVar = com.tencent.mm.plugin.remittance.model.g.this;
                if (!gVar.f156820f.f381598e.equals(xpVar.f8394a)) {
                    return false;
                }
                am.xp xpVar2 = receiveTransferAppMsgEvent2.f54656g;
                if (pt0.f0.Li(xpVar2.f8396c, xpVar2.f8395b).getType() != 419430449) {
                    return false;
                }
                int i17 = xpVar2.f8397d.I0;
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgCheckTaskMgr", "MsgCheck msgID:%s transeferID:%s paySubType:%s", java.lang.Long.valueOf(xpVar2.f8395b), xpVar2.f8394a, java.lang.Integer.valueOf(i17));
                if ((i17 != 3 && i17 != 23 && i17 != 4 && i17 != 24 && i17 != 5 && i17 != 25 && i17 != 6 && i17 != 26) || gVar.f156819e) {
                    return false;
                }
                gVar.b();
                return false;
            }
        };
        this.f156818d = j17;
        this.f156819e = false;
        this.f156820f = nq4Var;
    }

    public void a() {
        gm0.j1.d().a(6230, this);
        gm0.j1.d().a(4895, this);
        this.f156823i.alive();
        java.lang.String str = this.f156820f.f381598e;
        long j17 = this.f156818d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgCheckTaskMgr", "start MsgCheckTask %s after %s", str, java.lang.Long.valueOf(j17));
        this.f156822h = 1;
        if (this.f156821g == null) {
            this.f156821g = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) this, false);
        }
        long j18 = j17 * 1000;
        this.f156821g.c(j18, j18);
    }

    public void b() {
        r45.nq4 nq4Var;
        gm0.j1.d().q(6230, this);
        gm0.j1.d().q(4895, this);
        this.f156823i.dead();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f156821g;
        if (b4Var != null && !b4Var.e()) {
            this.f156821g.d();
            this.f156819e = false;
        }
        com.tencent.mm.plugin.remittance.model.h hVar = com.tencent.mm.plugin.remittance.model.h.f156847b;
        java.lang.String str = this.f156820f.f381598e;
        r45.qq4 qq4Var = hVar.f156848a;
        java.util.Iterator it = qq4Var.f384204d.iterator();
        while (true) {
            if (!it.hasNext()) {
                nq4Var = null;
                break;
            } else {
                nq4Var = (r45.nq4) it.next();
                if (str.equals(nq4Var.f381598e)) {
                    break;
                }
            }
        }
        qq4Var.f384204d.remove(nq4Var);
        hVar.b();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = m1Var instanceof com.tencent.mm.plugin.remittance.model.j0;
        r45.nq4 nq4Var = this.f156820f;
        if (z17) {
            com.tencent.mm.plugin.remittance.model.j0 j0Var = (com.tencent.mm.plugin.remittance.model.j0) m1Var;
            if (j0Var.f156865g.equals(nq4Var.f381598e)) {
                if (i17 == 0 && i18 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgCheckTaskMgr", "MsgCheck retCode:%s retMsg:%s transferID:%s", java.lang.Integer.valueOf(j0Var.f156863e.f383310d), j0Var.f156863e.f383311e, nq4Var.f381598e);
                    if (j0Var.f156863e.f383310d == 0) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23016, 1, nq4Var.f381598e);
                        kw3.p.Ai().Di().e(nq4Var.f381601h, j0Var.f156863e.f383312f, 0L);
                    }
                }
                b();
                return;
            }
            return;
        }
        if (m1Var instanceof com.tencent.mm.plugin.remittance.model.l1) {
            com.tencent.mm.plugin.remittance.model.l1 l1Var = (com.tencent.mm.plugin.remittance.model.l1) m1Var;
            if (l1Var.f156881s.equals(nq4Var.f381598e)) {
                if (i17 == 0 && i18 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgCheckTaskMgr", "UnionMsgCheck retCode:%s retMsg:%s transferID:%s", java.lang.Integer.valueOf(l1Var.f156880r.f392449d), l1Var.f156880r.f392450e, nq4Var.f381598e);
                    if (l1Var.f156880r.f392449d == 0) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23016, 1, nq4Var.f381598e);
                        kw3.p.Ai().Di().e(nq4Var.f381601h, l1Var.f156880r.f392451f, 0L);
                    }
                }
                b();
            }
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17 = this.f156822h;
        if (i17 == 1) {
            r45.nq4 nq4Var = this.f156820f;
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgCheckTaskMgr", "onTimerExpired, do MsgCheck scene, transferID:%s", nq4Var.f381598e);
            this.f156819e = true;
            if (com.tencent.mm.storage.z3.m4(nq4Var.f381601h) || c01.e2.R(nq4Var.f381601h)) {
                gm0.j1.d().g(new com.tencent.mm.plugin.remittance.model.l1(nq4Var.f381598e, nq4Var.f381599f, nq4Var.f381600g));
            } else {
                gm0.j1.d().g(new com.tencent.mm.plugin.remittance.model.j0(nq4Var.f381598e, nq4Var.f381599f, nq4Var.f381600g));
            }
            this.f156822h = 2;
            this.f156821g.c(18000L, 18000L);
        } else if (i17 == 2) {
            b();
        }
        return true;
    }
}
