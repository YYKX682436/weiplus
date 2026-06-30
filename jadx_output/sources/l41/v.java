package l41;

/* loaded from: classes11.dex */
public class v extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315942d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315943e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315944f;

    /* renamed from: g, reason: collision with root package name */
    public final int f315945g;

    public v(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.xj3();
        lVar.f70665b = new r45.yj3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getopenimchatroommemberdetail";
        lVar.f70667d = 942;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315943e = a17;
        this.f315944f = str;
        this.f315945g = i17;
        r45.xj3 xj3Var = (r45.xj3) a17.f70710a.f70684a;
        xj3Var.f390164d = str;
        xj3Var.f390165e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "get roomname:%s, version=%d", str, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315942d = u0Var;
        return dispatch(sVar, this.f315943e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 942;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        boolean z17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        int i27 = this.f315945g;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i27);
        java.lang.String str2 = this.f315944f;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s, %d", valueOf, valueOf2, str, str2, valueOf3);
        if (i19 == 0) {
            r45.yj3 yj3Var = (r45.yj3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            com.tencent.mm.storage.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str2);
            int i28 = yj3Var.f391153d;
            long j17 = i28 & io.flutter.embedding.android.KeyboardMap.kValueMask;
            com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "updateMemberDetail svrVer:%d, localVer:%d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i27));
            if (i27 < j17) {
                W0.W0(yj3Var.f391153d);
                r45.wz4 wz4Var = yj3Var.f391154e;
                java.util.LinkedList linkedList = wz4Var == null ? null : wz4Var.f389601d;
                boolean z18 = 1;
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Integer.valueOf(linkedList == null ? -1 : linkedList.size());
                com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "updateMemberDetail memInfoList size[%d]", objArr);
                W0.R0(c01.z1.r(), t41.f.a(linkedList), null, null);
                ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().replace(W0);
                r45.wz4 wz4Var2 = yj3Var.f391154e;
                t41.h hVar = new t41.h();
                if (wz4Var2 != null) {
                    java.util.LinkedList<r45.zz4> linkedList2 = wz4Var2.f389601d;
                    com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                    com.tencent.mm.modelavatar.s0 Ni = com.tencent.mm.modelavatar.d1.Ni();
                    java.util.LinkedList linkedList3 = new java.util.LinkedList();
                    java.util.LinkedList linkedList4 = new java.util.LinkedList();
                    int size = linkedList2 != null ? linkedList2.size() : -1;
                    com.tencent.mars.xlog.Log.i("OpenIMChatRoomContactLogic", "updateMemberDetail memInfoList size[%d]", java.lang.Integer.valueOf(size));
                    if (size >= 0) {
                        hVar.f415496b = size > com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomMemberCount() ? 0 : com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomThr() ? gm0.j1.e().c() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomTimeout(), 401, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomAction(), "PerfTrace");
                        for (r45.zz4 zz4Var : linkedList2) {
                            if (wz4Var2.f389602e == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(zz4Var.f392484d) && !com.tencent.mm.sdk.platformtools.t8.K0(zz4Var.f392488h)) {
                                com.tencent.mm.modelavatar.r0 n07 = Ni.n0(zz4Var.f392484d);
                                if (n07 == null) {
                                    n07 = new com.tencent.mm.modelavatar.r0();
                                    n07.f70529a = zz4Var.f392484d;
                                }
                                java.lang.String str3 = zz4Var.f392487g;
                                n07.f70533e = str3;
                                n07.f70532d = zz4Var.f392488h;
                                n07.f70530b = 3;
                                n07.f70534f = (com.tencent.mm.sdk.platformtools.t8.K0(str3) ? 1 : 0) ^ z18;
                                linkedList4.add(n07);
                            }
                            com.tencent.mm.storage.z3 n17 = Bi.n(zz4Var.f392484d, z18);
                            if (n17 == null) {
                                com.tencent.mars.xlog.Log.e("OpenIMChatRoomContactLogic", "updateMemberDetail memberlist username is null");
                            } else {
                                if (n17.q2()) {
                                    n17.M1(zz4Var.f392485e);
                                    linkedList3.add(new android.util.Pair(zz4Var.f392484d, n17));
                                }
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(zz4Var.f392490m)) {
                                    n17.P1(zz4Var.f392490m);
                                }
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(zz4Var.f392491n)) {
                                    n17.C1(zz4Var.f392491n);
                                }
                                Bi.l0(n17);
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(zz4Var.f392490m)) {
                                    z17 = false;
                                    ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).wi(zz4Var.f392490m, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), zz4Var.f392491n, 0);
                                    z18 = 1;
                                }
                            }
                            z17 = false;
                            z18 = 1;
                        }
                        linkedList4.size();
                        linkedList3.size();
                        if (!linkedList4.isEmpty()) {
                            hVar.f415495a |= 1;
                            new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new t41.a(linkedList4, hVar, Ni), true).c(100L, 100L);
                        }
                        if (!linkedList3.isEmpty()) {
                            hVar.f415495a |= 2;
                            new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new t41.b(linkedList3, hVar, Bi), true).c(100L, 100L);
                        }
                    }
                }
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f315942d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
