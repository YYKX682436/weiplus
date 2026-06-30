package kn;

/* loaded from: classes4.dex */
public class p extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309444d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309445e;

    public p(java.lang.String str, java.util.List list, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vb0();
        lVar.f70665b = new r45.wb0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/delchatroommember";
        lVar.f70667d = 179;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309445e = a17;
        r45.vb0 vb0Var = (r45.vb0) a17.f70710a.f70684a;
        vb0Var.f388070f = str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            r45.gc0 gc0Var = new r45.gc0();
            gc0Var.f375080d = x51.j1.i(str2);
            linkedList.add(gc0Var);
        }
        vb0Var.f388069e = linkedList;
        vb0Var.f388068d = linkedList.size();
        vb0Var.f388071g = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309444d = u0Var;
        return dispatch(sVar, this.f309445e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 179;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        com.tencent.mm.modelbase.o oVar = this.f309445e;
        r45.vb0 vb0Var = (r45.vb0) oVar.f70710a.f70684a;
        com.tencent.mm.modelbase.n nVar = oVar.f70711b;
        r45.wb0 wb0Var = (r45.wb0) nVar.f70700a;
        if (nVar.getRetCode() != 0) {
            this.f309444d.onSceneEnd(i18, i19, str, this);
            return;
        }
        java.lang.String str2 = vb0Var.f388070f;
        if (!c01.v1.B(str2) || wb0Var.f389026d == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "DelChatroomMember: room:[" + str2 + "] listCnt:" + wb0Var.f389026d);
        } else {
            com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
            com.tencent.mm.storage.a3 z07 = a17.z0(str2);
            java.util.List a18 = com.tencent.mm.storage.a3.a1(z07.field_memberlist);
            java.util.LinkedList linkedList = (java.util.LinkedList) a18;
            linkedList.size();
            java.util.Iterator it = wb0Var.f389027e.iterator();
            while (it.hasNext()) {
                linkedList.remove(x51.j1.g(((r45.hc0) it.next()).f376034d));
            }
            linkedList.size();
            z07.U0(a18);
            z07.field_displayname = c01.v1.j(a18, str2);
            z07.field_memberCount = linkedList.size();
            a17.replace(z07);
        }
        this.f309444d.onSceneEnd(i18, i19, str, this);
    }
}
