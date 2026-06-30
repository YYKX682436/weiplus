package kn;

/* loaded from: classes4.dex */
public class m extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, m65.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309419d;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f309421f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f309422g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f309423h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f309424i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f309425m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f309426n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f309427o;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f309429q;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309420e = null;

    /* renamed from: p, reason: collision with root package name */
    public int f309428p = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f309430r = "";

    public m(java.lang.String str, java.util.List list, java.lang.String str2, java.lang.Object obj) {
        this.f309429q = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.z3();
        lVar.f70665b = new r45.a4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/addchatroommember";
        lVar.f70667d = 120;
        lVar.f70668e = 36;
        lVar.f70669f = 1000000036;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309419d = a17;
        r45.z3 z3Var = (r45.z3) a17.f70710a.f70684a;
        z3Var.f391657f = x51.j1.i(str);
        this.f309429q = str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            r45.kk4 kk4Var = new r45.kk4();
            kk4Var.f378780d = x51.j1.i(str3);
            linkedList.add(kk4Var);
        }
        z3Var.f391656e = linkedList;
        z3Var.f391655d = linkedList.size();
        this.f309421f = new java.util.ArrayList();
        this.f309422g = new java.util.LinkedList();
        this.f309423h = new java.util.LinkedList();
        this.f309424i = new java.util.LinkedList();
        this.f309425m = new java.util.LinkedList();
        this.f309426n = new java.util.ArrayList();
        this.f309427o = new java.util.ArrayList();
        z3Var.f391659h = str2;
        if (obj instanceof com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAddChatRoomMember", "localHistoryInfo:%s", obj.toString());
            r45.rw3 rw3Var = new r45.rw3();
            z3Var.f391660i = rw3Var;
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
        this.f309420e = u0Var;
        return dispatch(sVar, this.f309419d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 120;
    }

    @Override // m65.a
    public o65.b l(o65.b bVar) {
        if (!(bVar instanceof o65.d)) {
            return bVar;
        }
        o65.d dVar = (o65.d) bVar;
        dVar.f343218i = this.f309429q;
        dVar.f343211b = this.f309422g;
        dVar.f343217h = this.f309428p;
        dVar.f343212c = this.f309423h;
        dVar.f343210a = this.f309421f;
        dVar.f343213d = this.f309424i;
        dVar.f343215f = this.f309426n;
        dVar.f343214e = this.f309425m;
        dVar.f343216g = this.f309427o;
        dVar.f343220k = this.f309430r;
        return dVar;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        com.tencent.mm.modelbase.o oVar = this.f309419d;
        r45.z3 z3Var = (r45.z3) oVar.f70710a.f70684a;
        r45.a4 a4Var = (r45.a4) oVar.f70711b.f70700a;
        this.f309428p = a4Var.f369709d;
        this.f309430r = a4Var.f369711f;
        java.util.LinkedList linkedList = a4Var.f369710e;
        for (int i27 = 0; i27 < linkedList.size(); i27++) {
            int i28 = ((r45.lk4) linkedList.get(i27)).f379544e;
            if (i28 == 0) {
                ((java.util.ArrayList) this.f309421f).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f379543d));
            } else if (i28 == 3) {
                r45.du5 du5Var = ((r45.lk4) linkedList.get(i27)).f379543d;
                ((java.util.LinkedList) this.f309423h).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f379543d));
            } else if (i28 == 1) {
                r45.du5 du5Var2 = ((r45.lk4) linkedList.get(i27)).f379543d;
                ((java.util.LinkedList) this.f309424i).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f379543d));
            } else if (i28 == 2) {
                r45.du5 du5Var3 = ((r45.lk4) linkedList.get(i27)).f379543d;
                ((java.util.LinkedList) this.f309422g).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f379543d));
            } else if (i28 == 4) {
                r45.du5 du5Var4 = ((r45.lk4) linkedList.get(i27)).f379543d;
                ((java.util.LinkedList) this.f309425m).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f379543d));
            } else if (i28 != 5) {
                if (i28 == 6) {
                    ((java.util.ArrayList) this.f309426n).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f379543d));
                } else if (i28 == 10) {
                    r45.du5 du5Var5 = ((r45.lk4) linkedList.get(i27)).f379543d;
                    ((java.util.ArrayList) this.f309427o).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f379543d));
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneAddChatRoomMember", "unknown member status : status = " + i28);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAddChatRoomMember", "onSceneEnd: errType = " + i18 + " errCode = " + i19 + " errMsg = " + str + " memberCount = " + this.f309428p + " tips = " + this.f309430r);
        this.f309420e.onSceneEnd(i18, i19, str, this);
        if (i18 == 0 && i19 == 0) {
            java.lang.String g17 = x51.j1.g(z3Var.f391657f);
            if (!c01.v1.B(g17) || a4Var.f369709d == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "AddChatroomMember: room:[" + g17 + "] listCnt:" + a4Var.f369709d);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            for (int i29 = 0; i29 < a4Var.f369709d; i29++) {
                java.lang.String g18 = x51.j1.g(((r45.lk4) linkedList.get(i29)).f379543d);
                if (((r45.lk4) linkedList.get(i29)).f379544e == 0) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(g18)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "this member name is null! chatRoomName : %s", g17);
                    } else {
                        com.tencent.mm.storage.z3 n17 = Bi.n(g18, true);
                        if (((int) n17.E2) != 0) {
                            n17.G2();
                            Bi.p0(n17.d1(), n17);
                        } else {
                            c01.v1.H(n17, (r45.lk4) linkedList.get(i29));
                            Bi.h0(n17);
                        }
                        arrayList.add(n17.d1());
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            c01.v1.t(g17, arrayList, null);
        }
    }
}
