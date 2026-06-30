package kn;

/* loaded from: classes11.dex */
public class w extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309479d;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f309481f;

    /* renamed from: g, reason: collision with root package name */
    public final int f309482g;

    /* renamed from: i, reason: collision with root package name */
    public int f309484i;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309480e = null;

    /* renamed from: h, reason: collision with root package name */
    public int f309483h = 0;

    public w(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cd3();
        lVar.f70665b = new r45.dd3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getchatroommemberdetail";
        lVar.f70667d = 551;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309479d = a17;
        this.f309481f = str;
        this.f309482g = i17;
        int D0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str).D0();
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        ((r45.cd3) fVar).f371484d = str;
        ((r45.cd3) fVar).f371485e = D0 < i17 ? i17 : D0;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom chatroomName:%s, oldVer:%d, localVer:%d, stack[%s]", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(D0), new com.tencent.mm.sdk.platformtools.z3());
    }

    public static void H(kn.w wVar, com.tencent.mm.storage.a3 a3Var, int i17, java.lang.String str, int i18, java.util.List list, r45.ya4 ya4Var, java.util.List list2, java.util.List list3) {
        int i19 = (~i17) & wVar.f309483h;
        wVar.f309483h = i19;
        if (i19 == 0) {
            if (ya4Var == null) {
                a3Var.getClass();
                a3Var.field_localChatRoomWatchMembers = new r45.ya4();
            } else {
                a3Var.field_localChatRoomWatchMembers = ya4Var;
            }
            a3Var.W0(i18);
            a3Var.R0(c01.z1.r(), list, list2, list3);
            c01.v1.M(a3Var);
            c01.v1.r(str, a3Var.field_roomowner, a3Var.field_memberCount, a3Var.field_chatroomStatus);
            com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomEnable(), wVar.f309484i);
            wVar.f309484i = 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "updateDone(%s)", str);
        }
    }

    public final java.util.List I(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return null;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(((r45.du5) it.next()).f372756d);
        }
        return linkedList2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309480e = u0Var;
        return dispatch(sVar, this.f309479d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 551;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int startPerformance;
        long j17;
        com.tencent.mm.storage.k4 k4Var;
        java.util.LinkedList linkedList;
        java.lang.Class cls;
        r45.ya4 ya4Var;
        java.lang.String str2;
        java.util.LinkedList linkedList2;
        com.tencent.mm.modelavatar.s0 s0Var;
        java.util.Iterator it;
        boolean z17;
        com.tencent.mm.modelavatar.r0 r0Var;
        java.lang.String str3 = this.f309481f;
        int i27 = this.f309482g;
        java.util.HashMap hashMap = (java.util.HashMap) c01.v1.f37519a;
        if (com.tencent.mm.sdk.platformtools.t8.O(hashMap.get(str3), -1) == i27) {
            hashMap.remove(str3);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMembersLogic", "clearRunningGetChatroomDetailReqItem:(%s, %d)", str3, java.lang.Integer.valueOf(i27));
        }
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetChatroomMemberDetail", "onGYNetEnd errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
            this.f309480e.onSceneEnd(i18, i19, str, this);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "onGYNetEnd errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.dd3 dd3Var = (r45.dd3) this.f309479d.f70711b.f70700a;
        com.tencent.mm.storage.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f309481f);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(dd3Var.f372321g)) {
            W0.field_roomowner = dd3Var.f372321g;
        }
        java.util.LinkedList linkedList3 = dd3Var.f372323i;
        java.lang.String str4 = "";
        if (linkedList3 != null && linkedList3.size() > 0) {
            java.util.List I = I(dd3Var.f372323i);
            W0.U0(I);
            java.util.LinkedList linkedList4 = (java.util.LinkedList) I;
            W0.field_memberCount = linkedList4.size();
            if ((W0.field_chatroomStatus & 2) != 2) {
                W0.field_displayname = c01.v1.i(linkedList4, -1, "");
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(W0.z0(W0.field_chatroomname))) {
                W0.field_selfDisplayName = c01.v1.k();
            }
        }
        long D0 = W0.D0();
        int i28 = dd3Var.f372319e;
        long j18 = i28 & io.flutter.embedding.android.KeyboardMap.kValueMask;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this.f309481f;
        objArr[1] = java.lang.Integer.valueOf(i28);
        r45.vy vyVar = dd3Var.f372320f;
        objArr[2] = java.lang.Integer.valueOf(vyVar == null ? 0 : vyVar.f388657d);
        objArr[3] = java.lang.Long.valueOf(D0);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom chatroomName:%s svrVer:%d, modCnt:%d， localVer:%d", objArr);
        if (D0 >= j18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom localVer[%d] serverVer[%d] is new and return", java.lang.Long.valueOf(D0), java.lang.Long.valueOf(j18));
            this.f309480e.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.vy vyVar2 = dd3Var.f372320f;
        java.util.LinkedList linkedList5 = vyVar2 == null ? null : vyVar2.f388658e;
        int size = linkedList5 == null ? -1 : linkedList5.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom memInfoList size[%d]", java.lang.Integer.valueOf(size));
        r45.ya4 ya4Var2 = new r45.ya4();
        r45.vy vyVar3 = dd3Var.f372320f;
        if (vyVar3 != null) {
            ya4Var2.f390926d = vyVar3.f388661h;
            ya4Var2.f390927e = vyVar3.f388662i;
        }
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.s0 Ni = com.tencent.mm.modelavatar.d1.Ni();
        java.util.LinkedList linkedList6 = new java.util.LinkedList();
        java.util.LinkedList linkedList7 = new java.util.LinkedList();
        if (size > com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomMemberCount()) {
            startPerformance = 0;
        } else {
            startPerformance = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomThr() ? gm0.j1.e().c() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomTimeout(), 401, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomAction(), "MicroMsg.NetSceneGetChatroomMemberDetail");
        }
        this.f309484i = startPerformance;
        java.util.Iterator it6 = linkedList5.iterator();
        while (it6.hasNext()) {
            r45.wy wyVar = (r45.wy) it6.next();
            java.lang.String str5 = str4;
            if (com.tencent.mm.sdk.platformtools.t8.K0(wyVar.f389569h) || com.tencent.mm.sdk.platformtools.t8.K0(wyVar.f389565d)) {
                s0Var = Ni;
                it = it6;
                z17 = true;
            } else {
                com.tencent.mm.modelavatar.r0 n07 = Ni.n0(wyVar.f389565d);
                if (n07 == null) {
                    r0Var = new com.tencent.mm.modelavatar.r0();
                    s0Var = Ni;
                    r0Var.f70529a = wyVar.f389565d;
                } else {
                    s0Var = Ni;
                    n07.d().equals(wyVar.f389569h);
                    r0Var = n07;
                }
                java.lang.String str6 = wyVar.f389568g;
                r0Var.f70533e = str6;
                it = it6;
                r0Var.f70532d = wyVar.f389569h;
                r0Var.f70530b = 3;
                z17 = true;
                r0Var.f70534f = !com.tencent.mm.sdk.platformtools.t8.K0(str6) ? 1 : 0;
                linkedList7.add(r0Var);
            }
            com.tencent.mm.storage.z3 n17 = Bi.n(wyVar.f389565d, z17);
            com.tencent.mm.storage.k4 k4Var2 = Bi;
            if (n17 == null || ((int) n17.E2) == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetChatroomMemberDetail", "NetSceneGetChatroomMemberDetail memberlist username is null");
                com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                z3Var.X1(wyVar.f389565d);
                java.lang.String str7 = wyVar.f389566e;
                if (str7 != null) {
                    z3Var.M1(str7);
                }
                z3Var.P1(wyVar.f389574p);
                z3Var.C1(wyVar.f389575q);
                z3Var.G2();
                linkedList6.add(new android.util.Pair(wyVar.f389565d, z3Var));
            } else if (n17.q2()) {
                n17.M1(wyVar.f389566e);
                linkedList6.add(new android.util.Pair(wyVar.f389565d, n17));
                java.lang.Object[] objArr2 = new java.lang.Object[3];
                java.lang.String str8 = wyVar.f389565d;
                if (str8 == null) {
                    str8 = str5;
                }
                objArr2[0] = str8;
                objArr2[1] = com.tencent.mm.sdk.platformtools.t8.G1(wyVar.f389566e);
                objArr2[2] = java.lang.Integer.valueOf(n17.getType());
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "NetSceneGetChatroomMemberDetail username:%s nickname:%s type:%s", objArr2);
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[3];
                java.lang.String str9 = wyVar.f389565d;
                if (str9 == null) {
                    str9 = str5;
                }
                objArr3[0] = str9;
                java.lang.String str10 = wyVar.f389566e;
                if (str10 == null) {
                    str10 = str5;
                }
                objArr3[1] = str10;
                objArr3[2] = java.lang.Integer.valueOf(n17.getType());
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetChatroomMemberDetail", "NetSceneGetChatroomMemberDetail isChatRoomContact == false, username %s nickname %s type:%s", objArr3);
            }
            Bi = k4Var2;
            str4 = str5;
            Ni = s0Var;
            it6 = it;
        }
        com.tencent.mm.modelavatar.s0 s0Var2 = Ni;
        com.tencent.mm.storage.k4 k4Var3 = Bi;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update newImgFlagList size:%d, updateList size:%d", java.lang.Integer.valueOf(linkedList7.size()), java.lang.Integer.valueOf(linkedList6.size()));
        if (linkedList7.isEmpty()) {
            j17 = 100;
            k4Var = k4Var3;
            linkedList = linkedList7;
            cls = rv1.f.class;
            ya4Var = ya4Var2;
            str2 = "chatroom_member_detail";
            linkedList2 = linkedList6;
        } else {
            this.f309483h |= 1;
            j17 = 100;
            k4Var = k4Var3;
            cls = rv1.f.class;
            ya4Var = ya4Var2;
            str2 = "chatroom_member_detail";
            linkedList2 = linkedList6;
            linkedList = linkedList7;
            ((ku5.t0) ku5.t0.f312615d).l(new kn.u(this, linkedList7, s0Var2, W0, dd3Var, linkedList5, ya4Var), 100L, str2);
        }
        if (!linkedList2.isEmpty()) {
            this.f309483h |= 2;
            ((ku5.t0) ku5.t0.f312615d).l(new kn.v(this, linkedList2, k4Var, W0, dd3Var, linkedList5, ya4Var), j17, str2);
        }
        if (linkedList.isEmpty() && linkedList2.isEmpty()) {
            int i29 = dd3Var.f372319e;
            java.util.List I2 = I(dd3Var.f372323i);
            java.util.List I3 = I(dd3Var.f372325n);
            W0.field_localChatRoomWatchMembers = ya4Var;
            W0.W0(i29);
            W0.R0(c01.z1.r(), linkedList5, I2, I3);
            ((qv1.a) ((rv1.f) gm0.j1.s(cls))).a().replace(W0);
        }
        this.f309480e.onSceneEnd(i18, i19, str, this);
    }
}
