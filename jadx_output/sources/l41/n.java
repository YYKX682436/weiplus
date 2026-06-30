package l41;

/* loaded from: classes4.dex */
public class n extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, m65.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315870d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315871e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315872f;

    public n(java.lang.String str, java.util.LinkedList linkedList, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.o4();
        lVar.f70665b = new r45.p4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/addopenimchatroommember";
        lVar.f70667d = gd1.u.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315871e = a17;
        this.f315872f = str;
        r45.o4 o4Var = (r45.o4) a17.f70710a.f70684a;
        o4Var.f381895d = str;
        o4Var.f381896e = linkedList;
        o4Var.f381897f = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneAddOpenIMChatRoomMember", "roomname: %s, size:%s, desc:%s", str, java.lang.Integer.valueOf(linkedList.size()), str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315870d = u0Var;
        return dispatch(sVar, this.f315871e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return gd1.u.CTRL_INDEX;
    }

    @Override // m65.a
    public o65.b l(o65.b bVar) {
        r45.p4 p4Var;
        if (bVar == null || !(bVar instanceof o65.d) || (p4Var = (r45.p4) this.f315871e.f70711b.f70700a) == null) {
            return bVar;
        }
        t41.e eVar = new t41.e();
        eVar.a(p4Var.f382724d);
        o65.d dVar = (o65.d) bVar;
        dVar.f343218i = this.f315872f;
        java.util.List list = eVar.f415488a;
        dVar.f343217h = ((java.util.ArrayList) list).size();
        dVar.f343210a = list;
        dVar.f343211b = eVar.f415489b;
        dVar.f343212c = eVar.f415490c;
        dVar.f343213d = eVar.f415491d;
        dVar.f343215f = eVar.f415493f;
        dVar.f343214e = eVar.f415492e;
        dVar.f343216g = eVar.f415494g;
        dVar.f343219j = p4Var.f382725e;
        return dVar;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        java.lang.String str2 = this.f315872f;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneAddOpenIMChatRoomMember", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname = %s", valueOf, valueOf2, str, str2);
        if (v0Var.getRespObj().getRetCode() == 0) {
            r45.p4 p4Var = (r45.p4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            if (!str2.toLowerCase().endsWith("@im.chatroom") || p4Var.f382724d.isEmpty()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Openim.NetSceneAddOpenIMChatRoomMember", "AddChatroomMember: bad room:[" + str2 + "] listCnt:" + p4Var.f382724d.size());
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                java.util.Iterator it = p4Var.f382724d.iterator();
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
                if (!arrayList.isEmpty()) {
                    ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
                    c01.v1.t(str2, arrayList, null);
                }
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f315870d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
