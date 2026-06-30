package com.tencent.mm.plugin.voip.model;

/* loaded from: classes12.dex */
public class y extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f176916g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f176917h = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f176918d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f176919e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f176920f = new java.util.LinkedList();

    public y(java.lang.String str, java.lang.String str2, int i17, int i18) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.r1(1);
        f9Var.u1(str);
        f9Var.e1(c01.w9.o(str));
        f9Var.j1(1);
        f9Var.d1(str2);
        f9Var.setType(i17);
        long M9 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        iz5.a.g(null, M9 != -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + M9);
        if ((i18 & 4) != 0) {
            ((java.util.HashSet) f176917h).add(java.lang.Long.valueOf(M9));
        }
    }

    public final void H(int i17) {
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) ((java.util.LinkedList) this.f176920f).get(i17);
        f9Var.r1(5);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), f9Var, true);
        java.util.Iterator it = ((java.util.ArrayList) f176916g).iterator();
        while (it.hasNext()) {
            c01.w8 w8Var = (c01.w8) it.next();
            f9Var.j();
            w8Var.getClass();
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f176918d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ez5();
        lVar.f70665b = new r45.fz5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/newsendmsg";
        lVar.f70667d = 522;
        lVar.f70668e = 237;
        lVar.f70669f = 1000000237;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f176919e = a17;
        r45.ez5 ez5Var = (r45.ez5) a17.f70710a.f70684a;
        java.util.List c67 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().c6(Integer.MAX_VALUE);
        if (c67.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "no sending message");
            return -2;
        }
        java.util.List list = this.f176920f;
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.clear();
        for (int i17 = 0; i17 < c67.size(); i17++) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) c67.get(i17);
            if (f9Var.A0() == 1) {
                r45.ll4 ll4Var = new r45.ll4();
                r45.du5 du5Var = new r45.du5();
                du5Var.f372756d = f9Var.Q0();
                du5Var.f372757e = true;
                ll4Var.f379572d = du5Var;
                ll4Var.f379575g = (int) (f9Var.getCreateTime() / 1000);
                ll4Var.f379574f = f9Var.getType();
                ll4Var.f379573e = f9Var.j();
                ll4Var.f379576h = c01.y1.a(c01.z1.r(), f9Var.getCreateTime()).hashCode();
                ll4Var.f379577i = c01.ia.f(null);
                if (((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(f9Var.Q0())) {
                    ll4Var.f379578m = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(f9Var.Q0());
                }
                ez5Var.f373851e.add(ll4Var);
                ez5Var.f373850d = ez5Var.f373851e.size();
                linkedList.add(f9Var);
            }
        }
        int dispatch = dispatch(sVar, this.f176919e, this);
        if (dispatch < 0) {
            for (int i18 = 0; i18 < ((java.util.LinkedList) list).size(); i18++) {
                H(i18);
            }
        }
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 522;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "onGYNetEnd errtype:" + i18 + " errcode:" + i19);
        r45.fz5 fz5Var = (r45.fz5) this.f176919e.f70711b.f70700a;
        if (fz5Var != null && (i18 == 4 || (i18 == 0 && i19 == 0))) {
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Di(fz5Var.f374752f);
        }
        java.util.List list = this.f176920f;
        if (i18 != 0 || i19 != 0) {
            for (int i27 = 0; i27 < ((java.util.LinkedList) list).size(); i27++) {
                H(i27);
            }
            this.f176918d.onSceneEnd(i18, i19, str, this);
            return;
        }
        java.util.LinkedList linkedList = fz5Var.f374751e;
        java.util.LinkedList linkedList2 = (java.util.LinkedList) list;
        if (linkedList2.size() == linkedList.size()) {
            int i28 = 0;
            while (i28 < linkedList.size()) {
                r45.ml4 ml4Var = (r45.ml4) linkedList.get(i28);
                if (ml4Var.f380626d != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendMsg", "send msg failed: item ret code=" + ml4Var.f380626d);
                    H(i28);
                    this.f176918d.onSceneEnd(4, ml4Var.f380626d, str, this);
                    return;
                }
                long msgId = ((com.tencent.mm.storage.f9) linkedList2.get(i28)).getMsgId();
                java.lang.String Q0 = ((com.tencent.mm.storage.f9) linkedList2.get(i28)).Q0();
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "msg local id = " + msgId + ", SvrId = " + ml4Var.f380633n + " sent successfully!");
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(Q0, msgId);
                Li.o1(ml4Var.f380633n);
                Li.r1(2);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(msgId, Li, true);
                i28++;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "total " + i28 + " msgs sent successfully");
        }
        int doScene = doScene(dispatcher(), this.f176918d);
        if (doScene == -2) {
            this.f176918d.onSceneEnd(0, 0, str, this);
        } else if (doScene < 0) {
            this.f176918d.onSceneEnd(3, -1, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 10;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return ((java.util.LinkedList) this.f176920f).size() > 0 ? com.tencent.mm.modelbase.o1.EOk : com.tencent.mm.modelbase.o1.EFailed;
    }
}
