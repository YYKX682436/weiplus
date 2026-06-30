package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class c3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: i, reason: collision with root package name */
    public static wa4.i f164114i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f164116d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164117e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164118f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.b3 f164119g = new com.tencent.mm.plugin.sns.model.b3(this);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f164113h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public static boolean f164115m = true;

    public c3(int i17) {
        this.f164116d = "";
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "NetSceneSnsSync %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ka6();
        lVar.f70665b = new r45.la6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnssync";
        lVar.f70667d = 214;
        lVar.f70668e = 102;
        lVar.f70669f = 1000000102;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164117e = a17;
        ((r45.ka6) a17.f70710a.f70684a).f378566d = i17;
        this.f164116d = c01.z1.r();
        if (f164115m) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.i();
            sb6.append(gm0.j1.u().h());
            sb6.append("ad_1100007");
            java.lang.String sb7 = sb6.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "filepath to list  " + sb7);
            byte[] N = com.tencent.mm.vfs.w6.N(sb7, 0, -1);
            if (N == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            } else {
                try {
                    f164114i = (wa4.i) new wa4.i().parseFrom(N);
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "fileToList " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                    if (f164114i == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "igNoreAbTestId parser error");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "igNoreAbTestId size " + f164114i.f444243d.size());
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", e17, "", new java.lang.Object[0]);
                    com.tencent.mm.vfs.w6.h(sb7);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                }
            }
            f164115m = false;
        }
    }

    public static void H(com.tencent.mm.plugin.sns.model.c3 c3Var, com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        c3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSyncDataCache", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        gm0.j1.u().c().w(68377, snsObject.Username);
        gm0.j1.u().c().w(68400, java.lang.Integer.valueOf(snsObject.CreateTime));
        gm0.j1.u().c().w(68418, ca4.z0.t0(snsObject.Id));
        gm0.j1.u().c().w(68419, 0);
        gm0.j1.u().c().w(68420, 0);
        gm0.j1.u().c().w(68421, java.lang.Integer.valueOf(snsObject.WeiShangFeedType));
        com.tencent.mm.plugin.sns.statistics.t0.a(1, ca4.z0.t0(snsObject.Id), 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSyncDataCache", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
    }

    public static void I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        for (c01.x8 x8Var : f164113h) {
            if (x8Var != null) {
                com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = (com.tencent.mm.ui.FindMoreFriendsUI) x8Var;
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "notify comment change");
                if ((c01.z1.n() & 32768) == 0) {
                    if (p94.w0.a() != null) {
                        findMoreFriendsUI.f196660y = ((com.tencent.mm.plugin.sns.storage.w1) p94.w0.a()).L0();
                    }
                    findMoreFriendsUI.C1();
                    findMoreFriendsUI.f196656w.notifyDataSetChanged();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0177 A[Catch: Exception -> 0x0224, TryCatch #3 {Exception -> 0x0224, blocks: (B:26:0x0132, B:28:0x0177, B:31:0x01ab, B:36:0x01d0, B:41:0x0208, B:44:0x01df, B:46:0x01e9), top: B:25:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0220  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean O(r45.l76 r33) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.c3.O(r45.l76):boolean");
    }

    public final boolean J(r45.l76 l76Var, r45.k76 k76Var, long j17, long j18, java.lang.String str, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processAdCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.tencent.mm.plugin.sns.storage.v1 D0 = com.tencent.mm.plugin.sns.model.l4.Aj().D0(j17, k76Var.f378470s, k76Var.f378462h);
        if (D0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processAdCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return true;
        }
        D0.u0();
        boolean update = com.tencent.mm.plugin.sns.model.l4.Aj().update(D0.systemRowid, D0);
        com.tencent.mm.plugin.sns.model.s5.n(j17, l76Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", " setdel ad flag  " + update);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processAdCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }

    public final boolean K(r45.l76 l76Var, r45.k76 k76Var, long j17, long j18, java.lang.String str, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processAdSnsDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
        java.lang.String str2 = k76Var.f378458d;
        Aj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentDeleted", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" update SnsComment set commentflag = 1 where snsID = ");
        sb6.append(j17);
        sb6.append(" and talker = '");
        com.tencent.mm.sdk.platformtools.t8.n(str2);
        sb6.append(str2);
        sb6.append("'");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentStorage", "set sns del  by username " + sb7);
        boolean A = Aj.f166156d.A("SnsComment", sb7);
        if (A) {
            Aj.doNotify();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentDeleted", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "processAdSnsDelAction " + A);
        com.tencent.mm.plugin.sns.model.s5.n(j17, l76Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processAdSnsDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }

    public final boolean L(r45.l76 l76Var, r45.k76 k76Var, long j17, long j18, java.lang.String str, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.tencent.mm.plugin.sns.storage.v1 D0 = com.tencent.mm.plugin.sns.model.l4.Aj().D0(j17, k76Var.f378467p, k76Var.f378462h);
        if (D0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return false;
        }
        D0.u0();
        boolean update = com.tencent.mm.plugin.sns.model.l4.Aj().update(D0.systemRowid, D0);
        int i17 = com.tencent.mm.plugin.sns.model.s5.f164676d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "deleteComment");
        r45.k76 k76Var2 = l76Var.f379205f;
        if (k76Var2.f378462h != 9) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        } else {
            com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17);
            if (W0 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            } else {
                try {
                    com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(W0.field_attrBuf);
                    snsObject.Id = j17;
                    java.util.Iterator<r45.e86> it = snsObject.CommentUserList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        r45.e86 next = it.next();
                        if (next.f373132m == k76Var2.f378467p && !com.tencent.mm.sdk.platformtools.t8.K0(next.f373126d)) {
                            if (!next.f373126d.equals(k76Var2.f378458d) && next.f373126d.equals(c01.z1.r())) {
                                if (next.f373126d.equals(c01.z1.r())) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "commentUsername:%s, actionUsername:%s, markDeleteFlag:%s", next.f373126d, k76Var2.f378458d, java.lang.Integer.valueOf(next.f373132m));
                                    next.f373138s = 1;
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "commentUsername:%s, actionUsername:%s, removeComment:%s", next.f373126d, k76Var2.f378458d, java.lang.Integer.valueOf(next.f373132m));
                            snsObject.CommentUserList.remove(next);
                        }
                    }
                    W0.setAttrBuf(snsObject.toByteArray());
                    com.tencent.mm.plugin.sns.model.l4.Fj().Y2(snsObject.Id, W0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", " setdel flag  " + update);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }

    public final boolean M(r45.l76 l76Var, r45.k76 k76Var, long j17, long j18, java.lang.String str, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processGrabHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "processGrabHbAction clientId " + str + " snsId: " + j17 + " " + k76Var.f378470s + " " + k76Var.f378467p);
            if (com.tencent.mm.plugin.sns.model.l4.Aj().n1(j17, k76Var.f378458d, k76Var.f378464m, str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processGrabHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                return false;
            }
            r45.k76 k76Var2 = l76Var.f379206g;
            com.tencent.mm.plugin.sns.storage.v1 v1Var = new com.tencent.mm.plugin.sns.storage.v1();
            v1Var.field_snsID = j17;
            v1Var.field_parentID = j18;
            v1Var.field_createTime = k76Var.f378464m;
            v1Var.field_talker = k76Var.f378458d;
            v1Var.field_type = k76Var.f378462h;
            v1Var.field_curActionBuf = k76Var.toByteArray();
            v1Var.field_refActionBuf = k76Var2.toByteArray();
            v1Var.field_clientId = str;
            v1Var.field_commentSvrID = k76Var.f378467p;
            v1Var.field_msgRelevanceType = com.tencent.mm.plugin.sns.ui.widget.t2.g(k76Var, k76Var2);
            r45.vv3 vv3Var = new r45.vv3();
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "curAction.HBBuffer " + k76Var.f378471t);
            vv3Var.parseFrom(x51.j1.d(k76Var.f378471t));
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "hbbuffer  " + vv3Var.f388604d);
            com.tencent.mm.plugin.sns.model.l4.Aj().insert(v1Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processGrabHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneNewSyncAlbum", "error processHbAction " + e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processGrabHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return false;
        }
    }

    public final boolean N(r45.l76 l76Var, r45.k76 k76Var, long j17, long j18, java.lang.String str, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "processHbAction clientId " + str + " snsId: " + j17 + " " + k76Var.f378470s + " " + k76Var.f378467p);
            if (!ha4.h.c()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "passed because close lucky");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                return false;
            }
            if (com.tencent.mm.plugin.sns.model.l4.Aj().n1(j17, k76Var.f378458d, k76Var.f378464m, str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                return false;
            }
            r45.k76 k76Var2 = l76Var.f379206g;
            com.tencent.mm.plugin.sns.storage.v1 v1Var = new com.tencent.mm.plugin.sns.storage.v1();
            v1Var.field_snsID = j17;
            v1Var.field_parentID = j18;
            v1Var.field_createTime = k76Var.f378464m;
            v1Var.field_talker = k76Var.f378458d;
            v1Var.field_type = k76Var.f378462h;
            v1Var.field_curActionBuf = k76Var.toByteArray();
            v1Var.field_refActionBuf = k76Var2.toByteArray();
            v1Var.field_clientId = str;
            v1Var.field_commentSvrID = k76Var.f378467p;
            v1Var.field_msgRelevanceType = com.tencent.mm.plugin.sns.ui.widget.t2.g(k76Var, k76Var2);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "curAction.HBBuffer " + k76Var.f378471t);
            com.tencent.mm.plugin.sns.model.s5.u(j17, l76Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyHbReward", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            for (c01.x8 x8Var : f164113h) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyHbReward", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            com.tencent.mm.plugin.sns.model.l4.Aj().insert(v1Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneNewSyncAlbum", "error processHbAction " + e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return false;
        }
    }

    public final void P(long j17, r45.mo5 mo5Var, r45.l76 l76Var) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        int i18;
        java.lang.Object[] objArr;
        long j18;
        long j19;
        com.tencent.mm.plugin.sns.storage.v1 v1Var;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processSnsAdAtCommentAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        if (com.tencent.mm.plugin.sns.model.k2.H(j17)) {
            com.tencent.mm.plugin.sns.model.k2 k2Var = new com.tencent.mm.plugin.sns.model.k2(j17, 2, mo5Var);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(k2Var);
        }
        try {
            r45.k76 k76Var = l76Var.f379205f;
            java.lang.String str4 = l76Var.f379207h;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str4 == null) {
                str4 = "";
            }
            try {
                long j27 = l76Var.f379204e;
                int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsAdNotifyLimit"), 0);
                int P2 = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsAdNotifyLikeTimeLimit"), 0);
                int P3 = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsAdNotifyCommentTimeLimit"), 0);
                if (mo5Var != null) {
                    try {
                        objArr = new java.lang.Object[6];
                        i18 = 0;
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        i18 = 0;
                    }
                    try {
                        objArr[0] = str4;
                        objArr[1] = java.lang.Long.valueOf(j17);
                        j18 = j27;
                        objArr[2] = java.lang.Long.valueOf(mo5Var.f380718i);
                        objArr[3] = java.lang.Integer.valueOf(mo5Var.f380713d);
                        objArr[4] = java.lang.Integer.valueOf(k76Var.f378467p);
                        objArr[5] = java.lang.Integer.valueOf(P);
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "processAdAtAction clientId %s, snsId %s, aid64 %s, aid %s, commentId %s, actionLimit %s", objArr);
                        if (mo5Var.f380718i == 0 && mo5Var.f380713d == 0) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 4);
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        i17 = i18;
                        str = "";
                        str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", e, str, new java.lang.Object[i17]);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsAdAtCommentAction", str2);
                    }
                } else {
                    j18 = j27;
                    i18 = 0;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "remindFriendsInfo is null!");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 3);
                }
                java.lang.String str5 = str4;
                long j28 = j18;
                if (com.tencent.mm.plugin.sns.model.l4.Aj().n1(j17, k76Var.f378458d, k76Var.f378464m, str5)) {
                    str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
                } else {
                    r45.k76 k76Var2 = l76Var.f379206g;
                    com.tencent.mm.plugin.sns.storage.v1 v1Var2 = new com.tencent.mm.plugin.sns.storage.v1();
                    v1Var2.field_snsID = j17;
                    v1Var2.field_parentID = j28;
                    v1Var2.field_createTime = k76Var.f378464m;
                    v1Var2.field_talker = k76Var.f378458d;
                    v1Var2.field_type = k76Var.f378462h;
                    v1Var2.field_curActionBuf = k76Var.toByteArray();
                    v1Var2.field_refActionBuf = k76Var2.toByteArray();
                    v1Var2.field_clientId = str5;
                    v1Var2.field_isSilence = com.tencent.mm.plugin.sns.ui.widget.t2.i(k76Var.f378472u, 2) ? 1 : 0;
                    v1Var2.field_commentSvrID = k76Var.f378470s;
                    v1Var2.field_msgRelevanceType = com.tencent.mm.plugin.sns.ui.widget.t2.g(k76Var, k76Var2);
                    if (com.tencent.mm.plugin.sns.model.l4.Vi().P0(j17)) {
                        if (P > 0 || P2 > 0 || P3 > 0) {
                            v1Var = v1Var2;
                            str3 = " ";
                            str = "";
                            str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
                            try {
                                if (!com.tencent.mm.plugin.sns.model.x.b(j17, l76Var, P, P2, P3, true)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "check comment fail, pass comment ID " + v1Var.field_snsID + str3 + v1Var.field_commentSvrID);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsAdAtCommentAction", str2);
                                    return;
                                }
                                j19 = j17;
                            } catch (java.lang.Exception e19) {
                                e = e19;
                                i17 = 0;
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", e, str, new java.lang.Object[i17]);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsAdAtCommentAction", str2);
                            }
                        } else {
                            j19 = j17;
                            v1Var = v1Var2;
                            str3 = " ";
                            str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
                        }
                        if (!com.tencent.mm.plugin.sns.model.x.s(j19, l76Var)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "pass comment ID " + v1Var.field_snsID + str3 + v1Var.field_commentSvrID);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsAdAtCommentAction", str2);
                            return;
                        }
                    } else {
                        j19 = j17;
                        v1Var = v1Var2;
                        str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
                    }
                    if (j62.e.g().c(new com.tencent.mm.plugin.sns.config.RCSnsCmtEmoticonAutoLoad()) == 1 && !com.tencent.mm.sdk.platformtools.t8.L0(k76Var.f378474w) && k76Var.f378474w.get(0) != null) {
                        com.tencent.mm.storage.emotion.EmojiInfo b17 = com.tencent.mm.plugin.sns.model.s5.b((r45.l86) k76Var.f378474w.get(0));
                        if (com.tencent.mm.storage.n5.f().c().u1(b17.field_md5) == null) {
                            com.tencent.mm.storage.n5.f().c().insert(b17);
                            zq.h.f474972a.e(b17, null);
                        }
                    }
                    com.tencent.mm.plugin.sns.model.l4.Aj().insert(v1Var);
                    com.tencent.mm.plugin.sns.model.l4.Aj().o1(j19, com.tencent.mm.plugin.sns.ui.widget.t2.i(k76Var.f378472u, 2));
                }
            } catch (java.lang.Exception e27) {
                e = e27;
                str = "";
                str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
            }
        } catch (java.lang.Exception e28) {
            e = e28;
            str = "";
            str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsAdAtCommentAction", str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #1 {all -> 0x009a, blocks: (B:20:0x0090, B:22:0x0095), top: B:19:0x0090 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(long r14) {
        /*
            r13 = this;
            java.lang.String r0 = ", snsId="
            java.lang.String r1 = "MicroMsg.NetSceneNewSyncAlbum"
            java.lang.String r2 = "processSnsAdFeedsForceDelAction snsId="
            java.lang.String r3 = "processSnsAdFeedsForceDelAction"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r5 = 0
            r6 = 0
            java.lang.String r7 = ca4.z0.t0(r14)     // Catch: java.lang.Throwable -> L6e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L6c
            r8.append(r7)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6c
            com.tencent.mars.xlog.Log.i(r1, r8)     // Catch: java.lang.Throwable -> L6c
            com.tencent.mm.plugin.sns.storage.z0 r8 = com.tencent.mm.plugin.sns.model.l4.Vi()     // Catch: java.lang.Throwable -> L6c
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r8 = r8.y0(r14)     // Catch: java.lang.Throwable -> L6c
            if (r8 == 0) goto L3f
            com.tencent.mm.plugin.sns.storage.ADInfo r9 = r8.getAdInfo()     // Catch: java.lang.Throwable -> L6c
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r8.getAdXml()     // Catch: java.lang.Throwable -> L3a
            r12 = r9
            r9 = r5
            r5 = r12
            goto L40
        L3a:
            r2 = move-exception
            r12 = r9
            r9 = r5
            r5 = r12
            goto L72
        L3f:
            r9 = r5
        L40:
            boolean r10 = a84.n.e(r8)     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r11.<init>(r2)     // Catch: java.lang.Throwable -> L67
            r11.append(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = ", delSucc="
            r11.append(r2)     // Catch: java.lang.Throwable -> L67
            r11.append(r10)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = ", adSnsInfo==null?"
            r11.append(r2)     // Catch: java.lang.Throwable -> L67
            if (r8 != 0) goto L5c
            r6 = 1
        L5c:
            r11.append(r6)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = r11.toString()     // Catch: java.lang.Throwable -> L67
            com.tencent.mars.xlog.Log.i(r1, r2)     // Catch: java.lang.Throwable -> L67
            goto L8f
        L67:
            r2 = move-exception
            r6 = r10
            goto L72
        L6a:
            r2 = move-exception
            goto L72
        L6c:
            r2 = move-exception
            goto L71
        L6e:
            r2 = move-exception
            java.lang.String r7 = ""
        L71:
            r9 = r5
        L72:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "processSnsAdFeedsForceDelAction exp="
            r8.<init>(r10)
            java.lang.String r2 = r2.toString()
            r8.append(r2)
            r8.append(r0)
            r8.append(r7)
            java.lang.String r2 = r8.toString()
            com.tencent.mars.xlog.Log.e(r1, r2)
            r10 = r6
        L8f:
            r2 = 3
            ca4.c0.b(r2, r14, r5, r9)     // Catch: java.lang.Throwable -> L9a
            if (r10 == 0) goto Lb7
            r2 = 4
            ca4.c0.b(r2, r14, r5, r9)     // Catch: java.lang.Throwable -> L9a
            goto Lb7
        L9a:
            r14 = move-exception
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r2 = "processSnsAdFeedsForceDelAction report exp="
            r15.<init>(r2)
            java.lang.String r14 = r14.toString()
            r15.append(r14)
            r15.append(r0)
            r15.append(r7)
            java.lang.String r14 = r15.toString()
            com.tencent.mars.xlog.Log.e(r1, r14)
        Lb7:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.c3.Q(long):void");
    }

    public final boolean R(r45.l76 l76Var, r45.k76 k76Var, long j17, long j18, java.lang.String str, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processSnsDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
        Aj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSnsDel", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        java.lang.String str2 = " update SnsComment set commentflag = 2 where snsID = " + j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentStorage", "set sns del " + str2);
        boolean A = Aj.f166156d.A("SnsComment", str2);
        if (A) {
            Aj.doNotify();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsDel", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        lc4.d dVar = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.f168761r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDelayDeleteFeedId", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_delete_feed_resource, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataUIC", "addDelayDeleteFeedId:" + ca4.z0.s0(j17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDelayDeleteFeedList$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            java.util.ArrayList arrayList = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.f168764u;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDelayDeleteFeedList$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            arrayList.add(java.lang.Long.valueOf(j17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDelayDeleteFeedId", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDelayDeleteFeedId", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "processSnsDelAction cmtRet:%b snsid:%s", java.lang.Boolean.valueOf(A), ca4.z0.t0(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        byte[] a17 = w11.c2.f441991a.a();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(a17);
        com.tencent.mm.modelbase.o oVar = this.f164117e;
        ((r45.ka6) oVar.f70710a.f70684a).f378567e = cu5Var;
        this.f164118f = u0Var;
        int dispatch = dispatch(sVar, oVar, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return 214;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        if (i18 != 0 || i19 != 0) {
            this.f164118f.onSceneEnd(i18, i19, str, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return;
        }
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
        r45.la6 la6Var = (r45.la6) oVar.f70711b.f70700a;
        java.util.LinkedList linkedList = la6Var.f379279d.f371295e;
        if (linkedList == null || linkedList.size() <= 0) {
            r45.cu5 cu5Var = la6Var.f379281f;
            if (cu5Var != null && (gVar = cu5Var.f371841f) != null) {
                byte[] c17 = o45.qi.c(((r45.ka6) oVar.f70710a.f70684a).f378567e.f371841f.g(), gVar.g());
                if (c17 != null && c17.length > 0) {
                    w11.c2.f441991a.d(c17, true);
                }
            }
            this.f164118f.onSceneEnd(i18, i19, str, this);
        } else {
            linkedList.size();
            com.tencent.mm.plugin.sns.model.b3 b3Var = this.f164119g;
            b3Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delaWithCmdList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler");
            b3Var.f164089a = linkedList;
            b3Var.f164090b.sendEmptyMessage(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delaWithCmdList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return 10;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.tencent.mm.modelbase.o1 o1Var = com.tencent.mm.modelbase.o1.EOk;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return o1Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean uniqueInNetsceneQueue() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uniqueInNetsceneQueue", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uniqueInNetsceneQueue", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }
}
