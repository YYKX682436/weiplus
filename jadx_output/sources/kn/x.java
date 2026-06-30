package kn;

/* loaded from: classes4.dex */
public class x extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, m65.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309485d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309486e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f309487f;

    /* renamed from: g, reason: collision with root package name */
    public final int f309488g;

    public x(java.lang.String str, java.util.List list, int i17, java.lang.Object obj) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.j04();
        lVar.f70665b = new r45.k04();
        lVar.f70666c = "/cgi-bin/micromsg-bin/invitechatroommember";
        lVar.f70667d = 610;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309486e = a17;
        r45.j04 j04Var = (r45.j04) a17.f70710a.f70684a;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            r45.kk4 kk4Var = new r45.kk4();
            kk4Var.f378780d = x51.j1.i(str2);
            linkedList.add(kk4Var);
        }
        j04Var.f377468e = linkedList;
        j04Var.f377467d = linkedList.size();
        j04Var.f377469f = x51.j1.i(str);
        j04Var.f377470g = i17;
        if (obj instanceof com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInviteChatRoomMember", "localHistoryInfo:%s", obj.toString());
            r45.rw3 rw3Var = new r45.rw3();
            j04Var.f377472i = rw3Var;
            com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo localHistoryInfo = (com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo) obj;
            rw3Var.f385235d = localHistoryInfo.f63717d;
            rw3Var.f385236e = localHistoryInfo.f63718e;
            rw3Var.f385237f = localHistoryInfo.f63719f;
            rw3Var.f385238g = localHistoryInfo.f63720g;
            rw3Var.f385239h = localHistoryInfo.f63721h;
            rw3Var.f385240i = localHistoryInfo.f63722i;
            rw3Var.f385241m = localHistoryInfo.f63723m;
            rw3Var.f385242n = localHistoryInfo.f63724n;
            rw3Var.f385243o = localHistoryInfo.f63725o;
            rw3Var.f385244p = localHistoryInfo.f63726p;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309485d = u0Var;
        return dispatch(sVar, this.f309486e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 610;
    }

    @Override // m65.a
    public o65.b l(o65.b bVar) {
        if (bVar instanceof o65.a) {
            o65.a aVar = (o65.a) bVar;
            ((o65.e) aVar).f343222b = this.f309488g;
            ((o65.e) aVar).f343221a = this.f309487f;
        }
        return bVar;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f309485d.onSceneEnd(i18, i19, str, this);
    }

    public x(java.lang.String str, java.util.List list, int i17, java.lang.String str2, com.tencent.mm.storage.f9 f9Var) {
        this.f309487f = f9Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.j04();
        lVar.f70665b = new r45.k04();
        lVar.f70666c = "/cgi-bin/micromsg-bin/invitechatroommember";
        lVar.f70667d = 610;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309486e = a17;
        r45.j04 j04Var = (r45.j04) a17.f70710a.f70684a;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            r45.kk4 kk4Var = new r45.kk4();
            kk4Var.f378780d = x51.j1.i(str3);
            linkedList.add(kk4Var);
        }
        this.f309488g = linkedList.size();
        j04Var.f377468e = linkedList;
        j04Var.f377467d = linkedList.size();
        j04Var.f377469f = x51.j1.i(str);
        j04Var.f377470g = i17;
        j04Var.f377471h = str2;
    }
}
