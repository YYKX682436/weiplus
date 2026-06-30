package w11;

/* loaded from: classes12.dex */
public class r0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.List f442114r = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442115d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f442116e;

    /* renamed from: f, reason: collision with root package name */
    public final long f442117f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f442118g;

    /* renamed from: h, reason: collision with root package name */
    public int f442119h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f442120i;

    /* renamed from: m, reason: collision with root package name */
    public int f442121m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f442122n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f442123o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f442124p;

    /* renamed from: q, reason: collision with root package name */
    public vg3.a4 f442125q;

    public r0(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.Object obj) {
        java.lang.String str3;
        boolean z17;
        this.f442119h = 15;
        this.f442120i = new java.util.LinkedList();
        this.f442121m = 3;
        this.f442122n = false;
        this.f442123o = new java.util.ArrayList();
        this.f442124p = null;
        this.f442125q = null;
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        }
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
        java.lang.String wi6 = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).wi(f9Var);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = wi6;
        objArr[1] = java.lang.Boolean.valueOf(obj == null);
        objArr[2] = java.lang.Integer.valueOf(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "[mergeMsgSource] rawSource:%s args is null:%s flag:%s", objArr);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(wi6) && !wi6.startsWith("<msgsource>")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneSendMsg", "[mergeMsgSource] the msgsource is right? %s", wi6);
        } else if ((i18 & 1) != 0 && (obj instanceof java.util.HashMap)) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            if (com.tencent.mm.sdk.platformtools.t8.K0(wi6)) {
                stringBuffer.append("<msgsource>");
            }
            for (java.util.Map.Entry entry : ((java.util.HashMap) obj).entrySet()) {
                java.lang.String str4 = (java.lang.String) entry.getValue();
                java.lang.String str5 = (java.lang.String) entry.getKey();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str4) && !com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    if (!"similar_paste_seq".equalsIgnoreCase(str5)) {
                        stringBuffer.append("<");
                        stringBuffer.append(str5);
                        stringBuffer.append(">");
                        stringBuffer.append(str4);
                        stringBuffer.append("</");
                        stringBuffer.append(str5);
                        stringBuffer.append(">");
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneSendMsg", "%s %s", str5, str4);
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(wi6)) {
                stringBuffer.append("</msgsource>");
                wi6 = stringBuffer.toString();
            } else {
                wi6 = wi6.replace("<msgsource>", "<msgsource>" + stringBuffer.toString());
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(wi6)) {
            f9Var.u3(wi6);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "NetSceneSendMsg:MsgSource:%s", f9Var.G);
        }
        int i19 = i18 & 4;
        if (i19 == 0 && (i18 & 8) == 0) {
            int i27 = i18 & 16;
            if (i27 != 0 || (i18 & 32) != 0) {
                int i28 = i27 != 0 ? 4 : 5;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "has paste similar change flag, %d", java.lang.Integer.valueOf(i28));
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(".msgsource.alnode.cf", java.lang.String.valueOf(i28));
                if (obj instanceof java.util.HashMap) {
                    hashMap.put(".msgsource.alnode.inlenlist", (java.lang.String) ((java.util.HashMap) obj).get("similar_paste_seq"));
                }
                c01.ia.N(f9Var, c01.ia.F(hashMap), false);
            }
        } else {
            int i29 = i19 != 0 ? 2 : 3;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "has paste fully flag, %d", java.lang.Integer.valueOf(i29));
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(".msgsource.alnode.cf", java.lang.String.valueOf(i29));
            if (obj instanceof java.util.HashMap) {
                hashMap2.put(".msgsource.alnode.inlenlist", (java.lang.String) ((java.util.HashMap) obj).get("similar_paste_seq"));
            }
            c01.ia.N(f9Var, c01.ia.F(hashMap2), false);
        }
        try {
            this.f442117f = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N9(f9Var, true);
        } catch (com.tencent.wcdb.database.SQLiteException e17) {
            jx3.f.INSTANCE.idkeyStat(111L, 255L, 1L, false);
            if (e17.toString().contains("UNIQUE constraint failed")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendMsg", "fallback to insert");
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().tb();
                this.f442117f = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N9(f9Var, true);
            } else {
                throw e17;
            }
        } catch (java.lang.IllegalStateException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSendMsg", e18, "", new java.lang.Object[0]);
        }
        if (this.f442117f == -1) {
            jx3.f.INSTANCE.idkeyStat(111L, 255L, 1L, false);
        } else if (((u63.e) ((vg3.v3) i95.n0.c(vg3.v3.class))).wi(str)) {
            vg3.v3 v3Var = (vg3.v3) i95.n0.c(vg3.v3.class);
            java.lang.String r17 = c01.z1.r();
            long j17 = this.f442117f;
            java.lang.String Q0 = f9Var.Q0();
            u63.e eVar = (u63.e) v3Var;
            eVar.getClass();
            eVar.Bi(str, r17, str2, j17, c01.id.e(), Q0);
        }
        if (this.f442117f != -1) {
            z17 = true;
            str3 = null;
        } else {
            str3 = null;
            z17 = false;
        }
        iz5.a.g(str3, z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.f442117f);
    }

    public final void H(java.lang.String str) {
        int doScene = doScene(dispatcher(), this.f442115d);
        if (doScene == -2) {
            this.f442115d.onSceneEnd(0, 0, str, this);
        } else if (doScene < 0) {
            this.f442115d.onSceneEnd(3, -1, str, this);
        }
    }

    public final void I(int i17) {
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) this.f442120i.get(i17);
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneSendMsg", "markMsgFailed for id:%d", java.lang.Long.valueOf(f9Var.getMsgId()));
        J(f9Var);
    }

    public final void J(com.tencent.mm.storage.f9 f9Var) {
        f9Var.r1(5);
        jx3.f.INSTANCE.idkeyStat(111L, 30L, 1L, true);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), f9Var, true);
        java.util.Iterator it = ((java.util.ArrayList) f442114r).iterator();
        while (it.hasNext()) {
            c01.w8 w8Var = (c01.w8) it.next();
            f9Var.j();
            w8Var.getClass();
        }
    }

    public final void K(int i17) {
        java.util.List list = this.f442120i;
        if (list == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent, sendingList is null");
            return;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        if (i17 >= linkedList.size() || i17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent, index:%d, sendingList.size:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(linkedList.size()));
            return;
        }
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) linkedList.get(i17);
        com.tencent.mm.autogen.events.SendMsgFailEvent sendMsgFailEvent = new com.tencent.mm.autogen.events.SendMsgFailEvent();
        sendMsgFailEvent.f54753g.f7461a = f9Var;
        sendMsgFailEvent.e();
        f9Var.getMsgId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.List] */
    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        java.util.ArrayList arrayList;
        this.f442115d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ez5();
        lVar.f70665b = new r45.fz5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/newsendmsg";
        lVar.f70667d = 522;
        lVar.f70668e = 237;
        lVar.f70669f = 1000000237;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f442116e = a17;
        r45.ez5 ez5Var = (r45.ez5) a17.f70710a.f70684a;
        com.tencent.mm.storage.f9 f9Var = this.f442124p;
        if (f9Var == null) {
            arrayList = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().c6(this.f442119h);
        } else {
            if (f9Var.P0() != 5) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneSendMsg", "msg:%d status:%d should not be resend !", java.lang.Long.valueOf(this.f442124p.getMsgId()), java.lang.Integer.valueOf(this.f442124p.P0()));
            }
            this.f442124p.r1(1);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.f442117f, this.f442124p);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(this.f442124p);
            this.f442124p = null;
            arrayList = arrayList2;
        }
        if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneSendMsg", "no sending message");
            return -2;
        }
        java.util.List list = this.f442120i;
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.clear();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) arrayList.get(i17);
            if (f9Var2.A0() == 1) {
                r45.ll4 ll4Var = new r45.ll4();
                r45.du5 du5Var = new r45.du5();
                du5Var.f372756d = f9Var2.Q0();
                du5Var.f372757e = true;
                ll4Var.f379572d = du5Var;
                ll4Var.f379575g = (int) (f9Var2.getCreateTime() / 1000);
                ll4Var.f379574f = f9Var2.getType();
                ll4Var.f379573e = f9Var2.j();
                ll4Var.f379576h = c01.y1.a(c01.z1.r(), f9Var2.getCreateTime()).hashCode();
                if (((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(f9Var2.Q0())) {
                    ll4Var.f379578m = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(f9Var2.Q0());
                }
                if (this.f442125q == null) {
                    this.f442125q = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).f442064d;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "using message source assembler %s", this.f442125q);
                this.f442125q.j(ll4Var, f9Var2);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "reqCmd.MsgSource:%s", ll4Var.f379577i);
                ez5Var.f373851e.add(ll4Var);
                ez5Var.f373850d = ez5Var.f373851e.size();
                linkedList.add(f9Var2);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "Req MsgSource %s", ll4Var.f379577i);
            }
        }
        int dispatch = dispatch(sVar, this.f442116e, this);
        if (dispatch < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "mark all failed. do scene %d", java.lang.Integer.valueOf(dispatch));
            for (int i18 = 0; i18 < ((java.util.LinkedList) list).size(); i18++) {
                I(i18);
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
        boolean z17;
        int i27;
        java.util.List list = this.f442120i;
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "mark all failed. onGYNetEnd. errType:%d errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(111L, i18 + 40, 1L, true);
            fVar.idkeyStat(111L, 253L, 1L, false);
            if (i19 == 413) {
                int computeSize = this.f442116e.f70710a.f70684a.computeSize();
                int i28 = this.f442119h / 2;
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendMsg", "send msgs req exceed max limit, size %s, sendMsgMaxNum %s, newSendMsgMaxNum %s", java.lang.Integer.valueOf(computeSize), java.lang.Integer.valueOf(this.f442119h), java.lang.Integer.valueOf(i28));
                if (this.f442119h != 1) {
                    this.f442119h = i28;
                    H(str);
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendMsg", "one msg exceed?????");
                for (int i29 = 0; i29 < ((java.util.LinkedList) list).size(); i29++) {
                    I(i29);
                }
                this.f442115d.onSceneEnd(i18, i19, str, this);
                for (int i37 = 0; i37 < ((java.util.LinkedList) list).size(); i37++) {
                    K(i37);
                }
                return;
            }
            if (i18 == 3 || i18 == 9 || i18 == 7 || i18 == 8 || i18 == 1) {
                this.f442115d.onSceneEnd(i18, i19, str, this);
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendMsg", "Message delivery failed due to network reasons.");
                return;
            }
            for (int i38 = 0; i38 < ((java.util.LinkedList) list).size(); i38++) {
                I(i38);
            }
            this.f442115d.onSceneEnd(i18, i19, str, this);
            for (int i39 = 0; i39 < ((java.util.LinkedList) list).size(); i39++) {
                K(i39);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "send fail, continue send SENDING msg");
            H(str);
            return;
        }
        r45.fz5 fz5Var = (r45.fz5) this.f442116e.f70711b.f70700a;
        java.util.LinkedList linkedList = fz5Var.f374751e;
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Di(fz5Var.f374752f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList2 = (java.util.LinkedList) list;
        if (linkedList2.size() == linkedList.size()) {
            int i47 = 0;
            while (true) {
                int size = linkedList.size();
                java.util.List list2 = this.f442123o;
                if (i47 >= size) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "summerdktext total  [%d]msgs sent successfully, [%d]msgs need verifypsw", java.lang.Integer.valueOf(i47 - arrayList2.size()), java.lang.Integer.valueOf(arrayList2.size()));
                    break;
                }
                r45.ml4 ml4Var = (r45.ml4) linkedList.get(i47);
                if (ml4Var.f380626d != 0 || x51.o1.K) {
                    jx3.f.INSTANCE.idkeyStat(111L, 252L, 1L, false);
                    int i48 = ml4Var.f380626d;
                    if (i48 == -49 || x51.o1.K) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "summerdktext send msg failed: item ret code[%d], index[%d], testVerifyPsw[%b], retryVerifyCount[%d]", java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i47), java.lang.Boolean.valueOf(x51.o1.K), java.lang.Integer.valueOf(this.f442121m));
                        if (this.f442122n) {
                            ((java.util.ArrayList) list2).add((com.tencent.mm.storage.f9) linkedList2.get(i47));
                        } else {
                            int i49 = this.f442121m;
                            if (i49 < 0) {
                                I(i47);
                                this.f442115d.onSceneEnd(4, ml4Var.f380626d, str, this);
                                K(i47);
                                return;
                            } else {
                                this.f442122n = true;
                                this.f442121m = i49 - 1;
                                ((java.util.ArrayList) list2).add((com.tencent.mm.storage.f9) linkedList2.get(i47));
                                gm0.j1.e().j(new w11.q0(this, str));
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "send msg fail ret = %s MsgId=%s MsgSource=%s", java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(ml4Var.f380628f), ml4Var.f380634o);
                        I(i47);
                        this.f442115d.onSceneEnd(4, ml4Var.f380626d, str, this);
                        K(i47);
                    }
                } else {
                    long msgId = ((com.tencent.mm.storage.f9) linkedList2.get(i47)).getMsgId();
                    java.lang.String Q0 = ((com.tencent.mm.storage.f9) linkedList2.get(i47)).Q0();
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "msg local id = " + msgId + ", SvrId = " + ml4Var.f380633n + " sent successfully!");
                    com.tencent.mm.storage.f9 Li = pt0.f0.Li(Q0, msgId);
                    Li.o1(ml4Var.f380633n);
                    c01.ia.P(Li, ml4Var.f380634o, false);
                    if (10007 == x51.o1.f452064q && (i27 = x51.o1.f452065r) != 0) {
                        Li.o1(i27);
                        x51.o1.f452065r = 0;
                    }
                    if (((Li.F & 512) > 0) && Li.getType() == 42) {
                        ((ce0.e) ((xg3.t0) i95.n0.c(xg3.t0.class))).getClass();
                        z17 = true;
                        com.tencent.mm.modelsimple.g1.L(Li, 21, 1);
                    } else {
                        z17 = true;
                    }
                    Li.r1(2);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(msgId, Li, z17);
                    if (list == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendMsg", "publishMsgSendSuccessEvent, sendingList is null");
                    } else {
                        java.util.LinkedList linkedList3 = (java.util.LinkedList) list;
                        if (i47 >= linkedList3.size() || i47 < 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendMsg", "publishMsgSendSuccessEvent, index:%d, sendingList.size:%d", java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(linkedList3.size()));
                        } else {
                            com.tencent.mm.storage.f9 Li2 = pt0.f0.Li(((com.tencent.mm.storage.f9) linkedList3.get(i47)).Q0(), ((com.tencent.mm.storage.f9) linkedList3.get(i47)).getMsgId());
                            com.tencent.mm.autogen.events.SendMsgSuccessEvent sendMsgSuccessEvent = new com.tencent.mm.autogen.events.SendMsgSuccessEvent();
                            sendMsgSuccessEvent.f54755g.f7659a = Li2;
                            sendMsgSuccessEvent.e();
                        }
                    }
                    arrayList.add(java.lang.Integer.valueOf(i47));
                    if (1 == ml4Var.f380632m) {
                        jx3.f fVar2 = jx3.f.INSTANCE;
                        fVar2.r(11942, true, false, java.lang.Long.valueOf(ml4Var.f380633n));
                        fVar2.r(11945, false, true, java.lang.Long.valueOf(ml4Var.f380633n));
                        fVar2.r(11946, false, false, java.lang.Long.valueOf(ml4Var.f380633n));
                        fVar2.idkeyStat(90L, 0L, 1L, false);
                        fVar2.idkeyStat(90L, 1L, 1L, true);
                    }
                }
                i47++;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "summerdktext send finish, continue send SENDING msg verifyingPsw[%b]", java.lang.Boolean.valueOf(this.f442122n));
        if (this.f442122n) {
            this.f442115d.onSceneEnd(i18, i19, str, this);
        } else {
            H(str);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 10;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean securityLimitCountReach() {
        boolean securityLimitCountReach = super.securityLimitCountReach();
        if (securityLimitCountReach) {
            jx3.f.INSTANCE.idkeyStat(111L, 254L, 1L, false);
        }
        return securityLimitCountReach;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return this.f442120i.size() > 0 ? com.tencent.mm.modelbase.o1.EOk : com.tencent.mm.modelbase.o1.EFailed;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean uniqueInNetsceneQueue() {
        return true;
    }

    public r0(java.lang.String str, java.lang.String str2, int i17, int i18, long j17) {
        java.lang.String str3;
        this.f442119h = 15;
        this.f442120i = new java.util.LinkedList();
        this.f442121m = 3;
        this.f442122n = false;
        this.f442123o = new java.util.ArrayList();
        this.f442124p = null;
        this.f442125q = null;
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        }
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
        if (i18 == 1 && i17 == 42) {
            f9Var.t3();
        }
        java.lang.String wi6 = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).wi(f9Var);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(wi6)) {
            f9Var.u3(wi6);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "NetSceneSendMsg:MsgSource:%s", f9Var.G);
        }
        try {
            this.f442117f = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N9(f9Var, true);
            this.f442118g = str;
        } catch (com.tencent.wcdb.database.SQLiteException e17) {
            jx3.f.INSTANCE.idkeyStat(111L, 255L, 1L, false);
            if (e17.toString().contains("UNIQUE constraint failed")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendMsg", "fallback to insert");
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().tb();
                this.f442117f = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N9(f9Var, true);
            } else {
                throw e17;
            }
        } catch (java.lang.IllegalStateException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSendMsg", e18, "", new java.lang.Object[0]);
        }
        if (this.f442117f == -1 || !((u63.e) ((vg3.v3) i95.n0.c(vg3.v3.class))).wi(str)) {
            str3 = "MicroMsg.NetSceneSendMsg";
        } else {
            vg3.v3 v3Var = (vg3.v3) i95.n0.c(vg3.v3.class);
            java.lang.String r17 = c01.z1.r();
            long j18 = this.f442117f;
            java.lang.String Q0 = f9Var.Q0();
            u63.e eVar = (u63.e) v3Var;
            eVar.getClass();
            str3 = "MicroMsg.NetSceneSendMsg";
            eVar.Bi(str, r17, str2, j18, c01.id.e(), Q0);
        }
        iz5.a.g(null, this.f442117f != -1);
        com.tencent.mars.xlog.Log.i(str3, "new msg inserted to db , local id = " + this.f442117f);
    }

    public r0(long j17, int i17, java.lang.String str) {
        this.f442119h = 15;
        this.f442120i = new java.util.LinkedList();
        this.f442121m = 3;
        this.f442122n = false;
        this.f442123o = new java.util.ArrayList();
        this.f442124p = null;
        this.f442125q = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "resend msg , local id = " + j17);
        this.f442117f = j17;
        this.f442118g = str;
        this.f442124p = pt0.f0.Li(str, j17);
    }

    public r0() {
        this.f442119h = 15;
        this.f442120i = new java.util.LinkedList();
        this.f442121m = 3;
        this.f442122n = false;
        this.f442123o = new java.util.ArrayList();
        this.f442124p = null;
        this.f442125q = null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "empty msg sender created");
    }
}
