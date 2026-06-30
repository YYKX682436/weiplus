package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class q2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164587d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164588e;

    /* renamed from: f, reason: collision with root package name */
    public final int f164589f;

    /* renamed from: g, reason: collision with root package name */
    public final long f164590g;

    /* renamed from: h, reason: collision with root package name */
    public final int f164591h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.e86 f164592i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f164593m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.p96 f164594n;

    /* renamed from: o, reason: collision with root package name */
    public int f164595o;

    public q2(long j17, r45.p96 p96Var) {
        this.f164589f = -1;
        this.f164590g = 0L;
        this.f164591h = -1;
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f164590g = j17;
        this.f164589f = 15;
        this.f164594n = p96Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.s96();
        lVar.f70665b = new r45.t96();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsobjectop";
        lVar.f70667d = 218;
        lVar.f70668e = 104;
        lVar.f70669f = 1000000104;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164588e = a17;
        r45.s96 s96Var = (r45.s96) a17.f70710a.f70684a;
        r45.o96 o96Var = new r45.o96();
        o96Var.f382051d = j17;
        o96Var.f382052e = 15;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("debugPrintSnsObjectOpVisibility", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "debugPrintSnsObjectOpVisibility:\n OpType=%d\n GroupUserCount=%d\n GroupContactTagIdList=[%s]\n GroupContactTagIdListCount=%d\n BlackListCount=%d\n BlackContactTagIdList=[%s]\n BlackContactTagIdListCount=%d,", java.lang.Integer.valueOf(p96Var.f382899o), java.lang.Integer.valueOf(p96Var.f382895h), com.tencent.mm.sdk.platformtools.t8.v0(p96Var.f382898n), java.lang.Integer.valueOf(p96Var.f382897m), java.lang.Integer.valueOf(p96Var.f382891d), com.tencent.mm.sdk.platformtools.t8.v0(p96Var.f382894g), java.lang.Integer.valueOf(p96Var.f382893f));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("debugPrintSnsObjectOpVisibility", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        try {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(p96Var.toByteArray());
            o96Var.f382053f = cu5Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsObjectOp", "opSwitch error " + e17.getMessage());
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(o96Var);
        s96Var.f385583e = linkedList;
        s96Var.f385582d = linkedList.size();
    }

    public final void H(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearSnsObjectExcludeBlackList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        snsObject.BlackList.clear();
        snsObject.BlackListCount = 0;
        snsObject.BlackContactTagIdList.clear();
        snsObject.BlackContactTagIdListCount = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearSnsObjectExcludeBlackList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
    }

    public final void I(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearSnsObjectIncludeContactList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        snsObject.GroupUser.clear();
        snsObject.GroupUserCount = 0;
        snsObject.GroupContactTagIdList.clear();
        snsObject.GroupContactTagIdListCount = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearSnsObjectIncludeContactList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
    }

    public long J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        r45.e86 e86Var = this.f164592i;
        if (e86Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
            return 0L;
        }
        if (this.f164589f == 6) {
            long j17 = e86Var.f373137r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
            return j17;
        }
        long j18 = e86Var.f373132m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return j18;
    }

    public int K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLoalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLoalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return this.f164591h;
    }

    public int L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return this.f164589f;
    }

    public long M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return this.f164590g;
    }

    public final void N(java.lang.Long l17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetLikeFlag", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        try {
            com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(l17.longValue());
            if (W0 != null) {
                boolean z17 = true;
                W0.setLikeFlag(1);
                com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(W0.field_attrBuf);
                java.lang.String r17 = c01.z1.r();
                java.util.Iterator<r45.e86> it = snsObject.LikeUserList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    } else if (it.next().f373126d.equals(r17)) {
                        break;
                    }
                }
                if (!z17) {
                    r45.e86 e86Var = new r45.e86();
                    e86Var.f373126d = r17;
                    snsObject.LikeUserList.add(e86Var);
                    snsObject.LikeCount = snsObject.LikeUserList.size();
                    W0.field_attrBuf = snsObject.toByteArray();
                }
                com.tencent.mm.plugin.sns.storage.l1.c(W0);
            }
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetLikeFlag", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        this.f164587d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "doScene: ");
        int dispatch = dispatch(sVar, this.f164588e, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return 218;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        androidx.lifecycle.c1 a17;
        androidx.lifecycle.c1 a18;
        androidx.lifecycle.c1 a19;
        int i27;
        androidx.lifecycle.c1 a27;
        androidx.lifecycle.c1 a28;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        if (i18 != 0 || i19 != 0) {
            this.f164595o = (int) com.tencent.mm.sdk.platformtools.t8.i1();
            if (i18 == 4) {
                int i28 = this.f164589f;
                if (i28 == 1) {
                    com.tencent.mm.plugin.sns.model.l4.xj().w(this.f164590g);
                } else if (i28 == 5) {
                    com.tencent.mm.plugin.sns.model.l4.xj().k(this.f164590g, 20, this.f164595o, null);
                    com.tencent.mm.plugin.sns.model.l4.xj().x(this.f164590g);
                    N(java.lang.Long.valueOf(this.f164590g));
                } else if (i28 == 7) {
                    com.tencent.mm.plugin.sns.model.l4.xj().k(this.f164590g, 21, this.f164595o, null);
                    com.tencent.mm.plugin.sns.model.l4.xj().x(this.f164590g);
                    N(java.lang.Long.valueOf(this.f164590g));
                }
            }
            this.f164587d.onSceneEnd(i18, i19, str, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
            return;
        }
        switch (this.f164589f) {
            case 1:
                com.tencent.mm.plugin.sns.model.l4.xj().w(this.f164590g);
                com.tencent.mm.plugin.sns.model.l4.Fj().delete(this.f164590g);
                r45.t96 t96Var = (r45.t96) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
                if (t96Var.f386219f == 1) {
                    com.tencent.mm.plugin.sns.model.l4.Ej().P1(com.tencent.mm.plugin.sns.model.l4.sj(), t96Var.f386221h);
                }
                pb4.e eVar = pb4.e.f353196a;
                long j17 = this.f164590g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
                if (cc4.b.f40482a.c()) {
                    l75.k0 f17 = eVar.f();
                    p75.n0 n0Var = dm.ab.f235716y;
                    n0Var.getClass();
                    p75.m0 i29 = dm.ab.A.i(java.lang.Long.valueOf(j17));
                    if (n0Var instanceof p75.z) {
                        throw new java.lang.IllegalArgumentException("Not support multi table delete");
                    }
                    java.lang.String table = n0Var.b();
                    p75.h hVar = (p75.h) i29;
                    java.lang.String b17 = hVar.b();
                    java.lang.String[] e17 = hVar.e();
                    kotlin.jvm.internal.o.g(table, "table");
                    int delete = f17.delete(table, b17, e17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "deleteStarSnsInfo >>  " + j17 + " result: " + delete);
                    if (delete > 0) {
                        com.tencent.mm.autogen.events.SnsStarFeedOperateEvent snsStarFeedOperateEvent = new com.tencent.mm.autogen.events.SnsStarFeedOperateEvent();
                        java.lang.String j18 = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", j17);
                        am.yw ywVar = snsStarFeedOperateEvent.f54842g;
                        ywVar.f8486b = j18;
                        ywVar.f8485a = 3;
                        ywVar.f8487c = c01.z1.r();
                        snsStarFeedOperateEvent.e();
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
                break;
            case 2:
                com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(this.f164590g);
                if (W0 != null) {
                    W0.setPravited(1);
                    W0.setLocalPrivate();
                    com.tencent.mm.protocal.protobuf.SnsObject f18 = com.tencent.mm.plugin.sns.model.s5.f(W0);
                    f18.ExtFlag &= -1543;
                    H(f18);
                    I(f18);
                    try {
                        W0.field_attrBuf = f18.toByteArray();
                    } catch (java.io.IOException e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", e18, "", new java.lang.Object[0]);
                    }
                    com.tencent.mm.plugin.sns.model.l4.Fj().v3(this.f164590g, W0);
                    synchronized (jm0.k.f300270i) {
                        gm0.j1.b().c();
                        if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                            throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                        a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
                    }
                    zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
                    long j19 = this.f164590g;
                    o75.b bVar = o75.b.f343581b;
                    gVar.i7(j19, o75.b.f343583d);
                    break;
                }
                break;
            case 3:
                com.tencent.mm.plugin.sns.storage.SnsInfo W02 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(this.f164590g);
                if (W02 != null) {
                    W02.setPravited(0);
                    W02.unLocalPrivate();
                    W02.setExtFlag();
                    com.tencent.mm.plugin.sns.model.l4.Fj().v3(this.f164590g, W02);
                    synchronized (jm0.k.f300270i) {
                        gm0.j1.b().c();
                        if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                            throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                        a18 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
                    }
                    zc4.g gVar2 = (zc4.g) ((zc4.h) a18).P6(zc4.g.class);
                    long j27 = this.f164590g;
                    o75.b bVar2 = o75.b.f343581b;
                    gVar2.i7(j27, o75.b.f343583d);
                    break;
                }
                break;
            case 4:
                com.tencent.mm.plugin.sns.storage.SnsInfo W03 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(this.f164590g);
                if (W03 != null) {
                    try {
                        com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(W03.field_attrBuf);
                        java.util.Iterator<r45.e86> it = snsObject.CommentUserList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                r45.e86 next = it.next();
                                r45.e86 e86Var = this.f164592i;
                                if (e86Var != null && next.f373132m == e86Var.f373132m) {
                                    r8 = next;
                                }
                            }
                        }
                        if (r8 != null) {
                            snsObject.CommentUserList.remove(r8);
                        }
                        W03.setAttrBuf(snsObject.toByteArray());
                        com.tencent.mm.plugin.sns.model.l4.Fj().V2(W03);
                        synchronized (jm0.k.f300270i) {
                            gm0.j1.b().c();
                            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                            }
                            a19 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
                        }
                        zc4.g gVar3 = (zc4.g) ((zc4.h) a19).P6(zc4.g.class);
                        long j28 = this.f164590g;
                        o75.b bVar3 = o75.b.f343581b;
                        gVar3.i7(j28, o75.b.f343583d);
                        com.tencent.mm.plugin.sns.model.l4.Aj().z0(W03.field_snsId, r0.f373132m, this.f164592i.f373129g);
                        break;
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", e19, "", new java.lang.Object[0]);
                        break;
                    }
                }
                break;
            case 5:
                com.tencent.mm.plugin.sns.model.l4.xj().x(this.f164590g);
                break;
            case 6:
                com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(this.f164590g);
                if (y07 != null) {
                    try {
                        com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(y07.field_attrBuf);
                        java.util.Iterator<r45.e86> it6 = snsObject2.CommentUserList.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                r45.e86 next2 = it6.next();
                                r45.e86 e86Var2 = this.f164592i;
                                if (e86Var2 != null && next2.f373137r == e86Var2.f373137r) {
                                    r8 = next2;
                                }
                            }
                        }
                        if (r8 != null) {
                            snsObject2.CommentUserList.remove(r8);
                        }
                        y07.setAttrBuf(snsObject2.toByteArray());
                        com.tencent.mm.plugin.sns.model.l4.Vi().replace(y07);
                        com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
                        long j29 = y07.field_snsId;
                        r45.e86 e86Var3 = this.f164592i;
                        Aj.z0(j29, e86Var3.f373137r, e86Var3.f373129g);
                        break;
                    } catch (java.lang.Exception e27) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", e27, "", new java.lang.Object[0]);
                        break;
                    }
                }
                break;
            case 7:
                com.tencent.mm.plugin.sns.model.l4.xj().x(this.f164590g);
                break;
            case 8:
                java.lang.Object obj = this.f164593m;
                r8 = obj != null && (obj instanceof com.tencent.mm.plugin.sns.storage.c) ? (com.tencent.mm.plugin.sns.storage.c) obj : null;
                if (r8 != null && (i27 = r8.f165946e) > 0) {
                    if (i27 != 1 || ((java.lang.Integer) r8.f165947f.get(0)).intValue() != 101) {
                        a84.n.d(this.f164590g);
                        i64.u1.b(22, 1, 103);
                        new com.tencent.mm.autogen.events.CheckSnsAutoPlayEvent().e();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "onGYNetEnd, reasonIdCount = " + r8.f165946e);
                    break;
                } else if (obj == null || !(obj instanceof com.tencent.mm.plugin.sns.storage.c) || ((com.tencent.mm.plugin.sns.storage.c) obj).f165945d != 101) {
                    a84.n.d(this.f164590g);
                    i64.u1.b(22, 1, 103);
                    new com.tencent.mm.autogen.events.CheckSnsAutoPlayEvent().e();
                    break;
                }
                break;
            case 9:
                com.tencent.mm.plugin.sns.storage.SnsInfo W04 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(this.f164590g);
                if (W04 != null) {
                    W04.removeSourceFlag(2);
                    com.tencent.mm.plugin.sns.model.l4.Fj().v3(this.f164590g, W04);
                    synchronized (jm0.k.f300270i) {
                        gm0.j1.b().c();
                        if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                            throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                        a27 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
                    }
                    zc4.g gVar4 = (zc4.g) ((zc4.h) a27).P6(zc4.g.class);
                    long j37 = this.f164590g;
                    o75.b bVar4 = o75.b.f343581b;
                    gVar4.i7(j37, o75.b.f343584e);
                    break;
                }
                break;
            case 11:
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "scene end switch 0");
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYOPEN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                gm0.j1.i();
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYCOUNT_INT_SYNC;
                int intValue = ((java.lang.Integer) c17.m(u3Var, 0)).intValue();
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(intValue + 1));
                gm0.j1.i();
                com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYCOUNT2_INT_SYNC;
                int intValue2 = ((java.lang.Integer) c18.m(u3Var2, 0)).intValue() + 1;
                int i37 = (intValue2 * 2) + nd1.d1.CTRL_INDEX;
                if (i37 >= 216) {
                    i37 = 216;
                }
                if (i37 >= 200) {
                    ha4.b.a(i37);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "opcount open " + i37 + " " + intValue2);
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(intValue2));
                break;
            case 12:
                java.lang.Object obj2 = this.f164593m;
                if (obj2 != null && (obj2 instanceof r45.j96)) {
                    boolean z17 = ((r45.j96) obj2).f377675d == 1;
                    com.tencent.mm.plugin.sns.model.l4.Aj().o1(this.f164590g, z17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "remind  update [snsId:%d] ->isSilence: %b", java.lang.Long.valueOf(this.f164590g), java.lang.Boolean.valueOf(z17));
                    break;
                }
                break;
            case 15:
                com.tencent.mm.plugin.sns.storage.SnsInfo W05 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(this.f164590g);
                if (W05 != null && this.f164594n != null) {
                    com.tencent.mm.protocal.protobuf.SnsObject f19 = com.tencent.mm.plugin.sns.model.s5.f(W05);
                    r45.p96 p96Var = this.f164594n;
                    int i38 = p96Var.f382899o;
                    if (i38 == 3 && (p96Var.f382895h > 0 || p96Var.f382897m > 0)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "[onGYNetEnd] CHANGE_VISIBILITY -> INCLUDE");
                        r45.p96 p96Var2 = this.f164594n;
                        int i39 = p96Var2.f382895h;
                        if (i39 > 0) {
                            f19.ExtFlag = 4 | f19.ExtFlag;
                        }
                        int i47 = p96Var2.f382897m;
                        if (i47 > 0) {
                            f19.ExtFlag |= 512;
                        }
                        f19.GroupUser = p96Var2.f382896i;
                        f19.GroupUserCount = i39;
                        f19.GroupContactTagIdList = p96Var2.f382898n;
                        f19.GroupContactTagIdListCount = i47;
                        H(f19);
                        W05.setPravited(0);
                        W05.unLocalPrivate();
                    } else if (i38 == 4 && (p96Var.f382891d > 0 || p96Var.f382893f > 0)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "[onGYNetEnd] CHANGE_VISIBILITY -> EXCLUDE");
                        r45.p96 p96Var3 = this.f164594n;
                        int i48 = p96Var3.f382891d;
                        if (i48 > 0) {
                            f19.ExtFlag |= 2;
                        }
                        int i49 = p96Var3.f382893f;
                        if (i49 > 0) {
                            f19.ExtFlag |= 1024;
                        }
                        f19.BlackList = p96Var3.f382892e;
                        f19.BlackListCount = i48;
                        f19.BlackContactTagIdList = p96Var3.f382894g;
                        f19.BlackContactTagIdListCount = i49;
                        I(f19);
                        W05.setPravited(0);
                        W05.unLocalPrivate();
                    } else if (i38 == 1 || i38 == 2) {
                        if (i38 == 1) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "[onGYNetEnd] CHANGE_VISIBILITY -> PUBLIC");
                            W05.setPravited(0);
                            W05.unLocalPrivate();
                            W05.setExtFlag();
                        }
                        if (this.f164594n.f382899o == 2) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "[onGYNetEnd] CHANGE_VISIBILITY -> PRIVATE");
                            W05.setPravited(1);
                            W05.setLocalPrivate();
                        }
                        f19.ExtFlag &= -1543;
                        H(f19);
                        I(f19);
                    }
                    try {
                        W05.field_attrBuf = f19.toByteArray();
                    } catch (java.io.IOException e28) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", e28, "", new java.lang.Object[0]);
                    }
                    com.tencent.mm.plugin.sns.model.l4.Fj().v3(this.f164590g, W05);
                    synchronized (jm0.k.f300270i) {
                        gm0.j1.b().c();
                        if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                            throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                        a28 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
                    }
                    zc4.g gVar5 = (zc4.g) ((zc4.h) a28).P6(zc4.g.class);
                    long j38 = this.f164590g;
                    o75.b bVar5 = o75.b.f343581b;
                    gVar5.i7(j38, o75.b.f343583d);
                    break;
                }
                break;
        }
        com.tencent.mm.plugin.sns.model.l4.xj().g();
        this.f164587d.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
    }

    public q2(long j17, int i17) {
        this(j17, i17, (r45.e86) null, (java.lang.Object) null);
    }

    public q2(long j17, int i17, java.lang.Object obj) {
        this(j17, i17, (r45.e86) null, obj);
    }

    public q2(long j17, int i17, r45.e86 e86Var) {
        this(j17, i17, e86Var, (java.lang.Object) null);
    }

    public q2(long j17, int i17, r45.e86 e86Var, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2;
        java.lang.String str3;
        int i18;
        java.lang.String str4;
        this.f164589f = -1;
        this.f164590g = 0L;
        this.f164591h = -1;
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f164592i = e86Var;
        this.f164589f = i17;
        this.f164590g = j17;
        this.f164593m = obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "snsId : " + j17 + "  op : " + i17);
        if (e86Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", e86Var.f373132m + " " + e86Var.f373137r);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.s96();
        lVar.f70665b = new r45.t96();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsobjectop";
        lVar.f70667d = 218;
        lVar.f70668e = 104;
        lVar.f70669f = 1000000104;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164588e = a17;
        r45.s96 s96Var = (r45.s96) a17.f70710a.f70684a;
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17);
        if (W0 != null) {
            this.f164591h = W0.localid;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        r45.o96 o96Var = new r45.o96();
        o96Var.f382053f = new r45.cu5();
        o96Var.f382051d = j17;
        o96Var.f382052e = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSnsObjectOp ");
        sb6.append(i17);
        sb6.append(" ");
        sb6.append(obj == null ? "" : obj.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", sb6.toString());
        if (i17 == 8 || i17 == 10 || i17 == 7 || i17 == 8 || i17 == 6) {
            com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(j17);
            com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo = y07 != null ? y07.convertToSnsInfo() : null;
            if (convertToSnsInfo == null || !convertToSnsInfo.isAd()) {
                snsInfo = convertToSnsInfo;
                str = "";
            } else {
                com.tencent.mm.plugin.sns.storage.ADInfo adInfo = convertToSnsInfo.getAdInfo();
                str = adInfo == null ? "" : adInfo.uxInfo;
                snsInfo = convertToSnsInfo;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "aduxinfo " + str);
            }
            if (i17 == 7) {
                l44.b3 b3Var = l44.b3.f316041a;
                java.lang.String j18 = com.tencent.mm.plugin.sns.storage.w2.j("ad_table_", j17);
                str2 = str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdUnlikeResponse", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                com.tencent.mars.xlog.Log.i("AdInteractHelper", "onAdUnlikeResponse() called with: snsId = " + j18);
                ((kotlinx.coroutines.flow.q2) l44.b3.f316054n).e(j18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdUnlikeResponse", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            } else {
                str2 = str;
            }
            snsInfo2 = snsInfo;
            str3 = str2;
        } else {
            str3 = "";
            snsInfo2 = null;
        }
        if (i17 == 6) {
            if (e86Var != null && (e86Var.f373132m != 0 || e86Var.f373137r != 0)) {
                r45.j76 j76Var = new r45.j76();
                j76Var.f377630d = e86Var.f373137r;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                j76Var.f377631e = x51.j1.i(str3 == null ? "" : str3);
                try {
                    byte[] byteArray = j76Var.toByteArray();
                    r45.cu5 cu5Var = new r45.cu5();
                    cu5Var.d(byteArray);
                    o96Var.f382053f = cu5Var;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", e17, "", new java.lang.Object[0]);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
            }
        } else {
            if (i17 == 7) {
                r45.b76 b76Var = new r45.b76();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                b76Var.f370619d = x51.j1.i(str3 == null ? "" : str3);
                try {
                    byte[] byteArray2 = b76Var.toByteArray();
                    r45.cu5 cu5Var2 = new r45.cu5();
                    cu5Var2.d(byteArray2);
                    o96Var.f382053f = cu5Var2;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", e18, "", new java.lang.Object[0]);
                }
            } else if (i17 == 8) {
                boolean z19 = obj != null && (obj instanceof com.tencent.mm.plugin.sns.storage.c);
                if (z19) {
                    com.tencent.mm.plugin.sns.storage.c cVar = (com.tencent.mm.plugin.sns.storage.c) obj;
                    boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    str3 = str3 == null ? "" : str3;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(str3);
                    sb7.append("&" + cVar.f165948g + "|" + cVar.f165949h);
                    str3 = sb7.toString();
                }
                r45.e76 e76Var = new r45.e76();
                boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                e76Var.f373078d = x51.j1.i(str3 == null ? "" : str3);
                if (snsInfo2 != null) {
                    e76Var.f373079e = snsInfo2.getAdRecSrc();
                    java.lang.String snsId = snsInfo2.getSnsId();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
                    com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(snsId);
                    if (b17 != null) {
                        str4 = i64.q0.d(b17.getTimeLine());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
                        str4 = "";
                    }
                    e76Var.f373080f = x51.j1.i(str4 == null ? "" : str4);
                }
                com.tencent.mm.plugin.sns.storage.c cVar2 = z19 ? (com.tencent.mm.plugin.sns.storage.c) obj : null;
                if (cVar2 != null && (i18 = cVar2.f165946e) > 0) {
                    e76Var.f373082h = i18;
                    java.util.LinkedList linkedList = e76Var.f373083i;
                    java.util.LinkedList linkedList2 = cVar2.f165947f;
                    if (linkedList != null) {
                        linkedList.addAll(linkedList2);
                    }
                    if (cVar2.f165946e != 1 || ((java.lang.Integer) linkedList2.get(0)).intValue() != 101) {
                        a84.n.d(j17);
                        i64.u1.b(22, 1, 102);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "getSnsObjectOp, reasonIdCount = " + cVar2.f165946e);
                } else if (z19 && ((com.tencent.mm.plugin.sns.storage.c) obj).f165945d == 101) {
                    e76Var.f373081g = 101;
                } else {
                    a84.n.d(j17);
                    i64.u1.b(22, 1, 102);
                    if (z19) {
                        e76Var.f373081g = ((com.tencent.mm.plugin.sns.storage.c) obj).f165945d;
                    }
                }
                try {
                    byte[] byteArray3 = e76Var.toByteArray();
                    r45.cu5 cu5Var3 = new r45.cu5();
                    cu5Var3.d(byteArray3);
                    o96Var.f382053f = cu5Var3;
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", e19, "", new java.lang.Object[0]);
                }
            } else if (i17 == 4) {
                if (e86Var != null && (e86Var.f373132m != 0 || e86Var.f373137r != 0)) {
                    r45.q96 q96Var = new r45.q96();
                    q96Var.f383784d = e86Var.f373132m;
                    try {
                        byte[] byteArray4 = q96Var.toByteArray();
                        r45.cu5 cu5Var4 = new r45.cu5();
                        cu5Var4.d(byteArray4);
                        o96Var.f382053f = cu5Var4;
                    } catch (java.lang.Exception e27) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", e27, "", new java.lang.Object[0]);
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                }
            } else if (i17 == 10) {
                r45.ba6 ba6Var = new r45.ba6();
                if (obj instanceof com.tencent.mm.protobuf.g) {
                    com.tencent.mm.protobuf.g gVar = (com.tencent.mm.protobuf.g) obj;
                    ba6Var.f370652d = x51.j1.a(gVar.f192156a);
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "NetSceneSnsObjectOpticket " + gVar.f192156a.length);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsObjectOp", "error ticket");
                }
                try {
                    byte[] byteArray5 = ba6Var.toByteArray();
                    r45.cu5 cu5Var5 = new r45.cu5();
                    cu5Var5.d(byteArray5);
                    o96Var.f382053f = cu5Var5;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "opFree " + byteArray5.length);
                } catch (java.lang.Exception e28) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsObjectOp", "error ticket " + e28.getMessage());
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", e28, "", new java.lang.Object[0]);
                }
            } else if (i17 == 12) {
                if (obj instanceof r45.j96) {
                    r45.j96 j96Var = (r45.j96) obj;
                    try {
                        o96Var.f382053f = x51.j1.a(j96Var.toByteArray());
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "snsMetionBlockOp, switch:%d " + j96Var.f377675d);
                    } catch (java.lang.Exception e29) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsObjectOp", "error snsMetionBlockOp " + e29.getMessage());
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsObjectOp", "error snsMetionBlockOp");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        }
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList3.add(o96Var);
        s96Var.f385583e = linkedList3;
        s96Var.f385582d = linkedList3.size();
        if (i17 == 1) {
            try {
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var6 = new r45.cu5();
                cu5Var6.d(fo3.s.INSTANCE.h());
                k57Var.f378396f = cu5Var6;
                r45.cu5 cu5Var7 = new r45.cu5();
                cu5Var7.d(k57Var.toByteArray());
                s96Var.f385584f = cu5Var7;
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.NetSceneSnsObjectOp", "snsId:" + j17 + " type:" + i17, new java.lang.Object[0]);
    }

    public q2(long j17, int i17, int i18, java.lang.String str) {
        this.f164589f = -1;
        this.f164590g = 0L;
        this.f164591h = -1;
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f164592i = null;
        this.f164589f = 9;
        this.f164590g = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsObjectOp", "snsId : " + j17 + "  op : 9");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.s96();
        lVar.f70665b = new r45.t96();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsobjectop";
        lVar.f70667d = 218;
        lVar.f70668e = 104;
        lVar.f70669f = 1000000104;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164588e = a17;
        r45.s96 s96Var = (r45.s96) a17.f70710a.f70684a;
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17);
        if (W0 != null) {
            this.f164591h = W0.localid;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        r45.o96 o96Var = new r45.o96();
        o96Var.f382053f = new r45.cu5();
        o96Var.f382051d = j17;
        o96Var.f382052e = 9;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        r45.r96 r96Var = new r45.r96();
        r96Var.f384662f = i17;
        r96Var.f384660d = i18;
        r96Var.f384661e = x51.j1.i(str);
        try {
            byte[] byteArray = r96Var.toByteArray();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(byteArray);
            o96Var.f382053f = cu5Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", e17, "", new java.lang.Object[0]);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(o96Var);
        s96Var.f385583e = linkedList;
        s96Var.f385582d = linkedList.size();
    }
}
