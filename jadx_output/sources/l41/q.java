package l41;

/* loaded from: classes4.dex */
public class q extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, m65.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315899d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315900e;

    public q(java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ba0();
        lVar.f70665b = new r45.ca0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/createopenimchatroom";
        lVar.f70667d = 371;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315900e = a17;
        ((r45.ba0) a17.f70710a.f70684a).f370646d = linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "create size:%d", java.lang.Integer.valueOf(linkedList.size()));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315899d = u0Var;
        return dispatch(sVar, this.f315900e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 371;
    }

    @Override // m65.a
    public o65.b l(o65.b bVar) {
        r45.ca0 ca0Var;
        if (bVar == null || !(bVar instanceof o65.d) || (ca0Var = (r45.ca0) this.f315900e.f70711b.f70700a) == null) {
            return bVar;
        }
        t41.e eVar = new t41.e();
        eVar.a(ca0Var.f371392e);
        o65.d dVar = (o65.d) bVar;
        dVar.f343218i = ca0Var.f371391d;
        java.util.List list = eVar.f415488a;
        dVar.f343217h = ((java.util.ArrayList) list).size();
        dVar.f343210a = list;
        dVar.f343211b = eVar.f415489b;
        dVar.f343212c = eVar.f415490c;
        dVar.f343213d = eVar.f415491d;
        dVar.f343215f = eVar.f415493f;
        dVar.f343216g = eVar.f415494g;
        dVar.f343214e = eVar.f415492e;
        return dVar;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (v0Var.getRespObj().getRetCode() == 0) {
            r45.ca0 ca0Var = (r45.ca0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(ca0Var.f371391d)) {
                if (ca0Var.f371391d.toLowerCase().endsWith("@im.chatroom")) {
                    com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                    z3Var.X1(ca0Var.f371391d);
                    com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                    if (!Bi.j0(z3Var.d1())) {
                        Bi.h0(z3Var);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(z3Var.d1()) && !com.tencent.mm.sdk.platformtools.t8.K0(ca0Var.f371394g)) {
                        com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
                        r0Var.f70529a = z3Var.d1();
                        r0Var.f70533e = ca0Var.f371393f;
                        r0Var.f70532d = ca0Var.f371394g;
                        r0Var.f70530b = 3;
                        r0Var.f70534f = 0;
                        r0Var.f70537i = -1;
                        com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = ca0Var.f371392e.iterator();
                    while (it.hasNext()) {
                        r45.yz4 yz4Var = (r45.yz4) it.next();
                        if (yz4Var.f391536e == 0) {
                            com.tencent.mm.storage.z3 n17 = Bi.n(yz4Var.f391535d, true);
                            if (((int) n17.E2) != 0) {
                                n17.G2();
                                Bi.p0(n17.d1(), n17);
                            } else {
                                n17.X1(yz4Var.f391535d);
                                n17.M1(yz4Var.f391537f);
                                Bi.h0(n17);
                            }
                            arrayList.add(n17.d1());
                        }
                    }
                    if (!arrayList.contains(c01.z1.r())) {
                        arrayList.add(c01.z1.r());
                        arrayList.contains(c01.z1.r());
                    }
                    rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
                    java.lang.String d17 = z3Var.d1();
                    java.lang.String r17 = c01.z1.r();
                    ((c01.w1) eVar).getClass();
                    c01.v1.t(d17, arrayList, r17);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "createChatroom: bad room:[" + ca0Var.f371391d + "]");
                }
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f315899d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
