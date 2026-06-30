package pb4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final pb4.e f353196a = new pb4.e();

    /* renamed from: b, reason: collision with root package name */
    public static int f353197b;

    public static void b(pb4.e eVar, java.lang.String userName, long j17, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteStarSnsInfo$default", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        kotlin.jvm.internal.o.g(userName, "userName");
        if (cc4.b.f40482a.c()) {
            l75.k0 f17 = eVar.f();
            p75.n0 n0Var = dm.ab.f235716y;
            n0Var.getClass();
            p75.m c17 = dm.ab.B.j(userName).c(dm.ab.A.i(java.lang.Long.valueOf(j17)));
            if (n0Var instanceof p75.z) {
                throw new java.lang.IllegalArgumentException("Not support multi table delete");
            }
            java.lang.String table = n0Var.b();
            p75.y yVar = (p75.y) c17;
            java.lang.String b17 = yVar.b();
            java.lang.String[] e17 = yVar.e();
            kotlin.jvm.internal.o.g(table, "table");
            int delete = f17.delete(table, b17, e17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "deleteStarSnsInfo >> " + userName + ' ' + j17 + " result: " + delete);
            if (z17 && delete > 0) {
                com.tencent.mm.autogen.events.SnsStarFeedOperateEvent snsStarFeedOperateEvent = new com.tencent.mm.autogen.events.SnsStarFeedOperateEvent();
                java.lang.String j18 = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", j17);
                am.yw ywVar = snsStarFeedOperateEvent.f54842g;
                ywVar.f8486b = j18;
                ywVar.f8485a = 3;
                ywVar.f8487c = userName;
                snsStarFeedOperateEvent.e();
                com.tencent.mm.autogen.events.SnsUserUINotifyEvent snsUserUINotifyEvent = new com.tencent.mm.autogen.events.SnsUserUINotifyEvent();
                java.lang.String j19 = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", j17);
                am.hx hxVar = snsUserUINotifyEvent.f54851g;
                hxVar.f6877b = j19;
                hxVar.f6876a = 2;
                snsUserUINotifyEvent.e();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteStarSnsInfo$default", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public static void i(pb4.e eVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertStarSnsInfo$default", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        if (cc4.b.f40482a.c()) {
            long a17 = dm.ab.t0(eVar.l(snsInfo), false).a(eVar.f());
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "insertStarSnsInfo >> " + snsInfo.getSnsId() + ' ' + a17);
            if (z17 && a17 > 0) {
                com.tencent.mm.autogen.events.SnsStarFeedOperateEvent snsStarFeedOperateEvent = new com.tencent.mm.autogen.events.SnsStarFeedOperateEvent();
                java.lang.String snsId = snsInfo.getSnsId();
                am.yw ywVar = snsStarFeedOperateEvent.f54842g;
                ywVar.f8486b = snsId;
                ywVar.f8485a = 1;
                ywVar.f8487c = snsInfo.getUserName();
                snsStarFeedOperateEvent.e();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertStarSnsInfo$default", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public final void a(java.lang.String userName) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteAllStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        kotlin.jvm.internal.o.g(userName, "userName");
        l75.k0 f17 = f();
        p75.n0 n0Var = dm.ab.f235716y;
        p75.m0 j17 = dm.ab.B.j(userName);
        p75.n0 n0Var2 = dm.ab.f235716y;
        n0Var2.getClass();
        if (n0Var2 instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var2.b();
        java.lang.String b17 = j17.b();
        java.lang.String[] e17 = j17.e();
        kotlin.jvm.internal.o.g(table, "table");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "deleteAllStarSnsInfo >> " + userName + ", result: " + f17.delete(table, b17, e17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteAllStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public final void c(java.lang.String userName, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteStarSnsInfoAfterTime", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        kotlin.jvm.internal.o.g(userName, "userName");
        l75.k0 f17 = f();
        p75.n0 n0Var = dm.ab.f235716y;
        n0Var.getClass();
        p75.m c17 = dm.ab.B.j(userName).c(dm.ab.C.n(java.lang.Integer.valueOf(i17)));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "deleteStarSnsInfoAfterTime >> " + userName + ", " + i17 + " result: " + new p75.i(n0Var.b(), c17.b(), c17.e()).f(f17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteStarSnsInfoAfterTime", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public final void d(java.lang.String userName, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteStarSnsInfoBeforeTime", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        kotlin.jvm.internal.o.g(userName, "userName");
        l75.k0 f17 = f();
        p75.n0 n0Var = dm.ab.f235716y;
        n0Var.getClass();
        p75.m c17 = dm.ab.B.j(userName).c(dm.ab.C.w(java.lang.Integer.valueOf(i17)));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "deleteStarSnsInfoBeforeTime >> " + userName + ", " + i17 + ' ' + new p75.i(n0Var.b(), c17.b(), c17.e()).f(f17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteStarSnsInfoBeforeTime", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public final void e(java.lang.String userName, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteStartInfoInRange", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        kotlin.jvm.internal.o.g(userName, "userName");
        l75.k0 f17 = f();
        p75.n0 n0Var = dm.ab.f235716y;
        n0Var.getClass();
        p75.m0 j17 = dm.ab.B.j(userName);
        p75.d dVar = dm.ab.C;
        p75.y yVar = (p75.y) j17.c(dVar.x(java.lang.Integer.valueOf(i17)));
        yVar.f(dVar.n(java.lang.Integer.valueOf(i18)));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "deleteStartInfoInRange >> " + userName + ", " + i17 + ", " + i18 + ", " + new p75.i(n0Var.b(), yVar.b(), yVar.e()).f(f17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteStartInfoInRange", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public final l75.k0 f() {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInitDB", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        jm0.i iVar = jm0.k.f300269h;
        l75.k0 Q4 = ((pb4.a) iVar.a(pb4.a.class)).Q4();
        if (Q4 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInitDB", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return Q4;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        java.lang.String str = gm0.j1.u().h() + "sns_star_info.db";
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(pb4.a.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(pb4.a.class);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "init >> " + str + ' ' + ((pb4.a) a17).O6(str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        l75.k0 Q42 = ((pb4.a) iVar.a(pb4.a.class)).Q4();
        kotlin.jvm.internal.o.d(Q42);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInitDB", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return Q42;
    }

    public final com.tencent.mm.plugin.sns.storage.SnsInfo g(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfoBySnsId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        l75.k0 f17 = f();
        p75.i0 i17 = dm.ab.f235716y.i();
        i17.f352657d = dm.ab.A.i(java.lang.Long.valueOf(j17));
        dm.ab abVar = (dm.ab) i17.a().o(f17, dm.ab.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSnsInfoBySnsId >> snsId: ");
        sb6.append(j17);
        sb6.append(", ");
        sb6.append(abVar != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", sb6.toString());
        com.tencent.mm.plugin.sns.storage.SnsInfo n17 = n(abVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfoBySnsId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return n17;
    }

    public final java.util.ArrayList h(java.lang.String userName, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarSnsInfoByLimit", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        kotlin.jvm.internal.o.g(userName, "userName");
        l75.k0 f17 = f();
        p75.i0 i18 = dm.ab.f235716y.i();
        i18.f352657d = dm.ab.B.j(userName);
        i18.f352659f = kz5.b0.c(dm.ab.C.u());
        i18.c(i17, 0);
        java.util.List k17 = i18.a().k(f17, dm.ab.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "getStarSnsInfoByLimit >> " + userName + ", " + i17 + ", " + ((java.util.ArrayList) k17).size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.storage.SnsInfo n17 = f353196a.n((dm.ab) it.next());
            kotlin.jvm.internal.o.d(n17);
            arrayList.add(n17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarSnsInfoByLimit", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return arrayList;
    }

    public final int j(com.tencent.mm.plugin.sns.storage.SnsInfo info) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insetInfoToSnsInfoStorageReturnLocalId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        kotlin.jvm.internal.o.g(info, "info");
        if (!com.tencent.mm.plugin.sns.model.l4.Fj().O2(info.field_snsId)) {
            int t37 = com.tencent.mm.plugin.sns.model.l4.Fj().t3(info);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "insetInfoToSnsInfoStorageReturnLocalId >> isNotExist " + ca4.z0.t0(info.field_snsId) + ' ' + t37);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insetInfoToSnsInfoStorageReturnLocalId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return t37;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "insetInfoToSnsInfoStorageReturnLocalId >> isExist " + ca4.z0.t0(info.field_snsId));
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(info.field_snsId);
        info.localid = W0.localid;
        com.tencent.mm.plugin.sns.model.l4.Fj().v3(info.field_snsId, info);
        int i17 = W0.localid;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insetInfoToSnsInfoStorageReturnLocalId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return i17;
    }

    public final void k(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        if (cc4.b.f40482a.c()) {
            dm.ab l17 = l(snsInfo);
            l75.k0 f17 = f();
            p75.n0 n0Var = dm.ab.f235716y;
            n0Var.getClass();
            android.content.ContentValues convertTo = l17.convertTo();
            p75.m0 i17 = dm.ab.A.i(java.lang.Long.valueOf(l17.field_snsId));
            if (n0Var instanceof p75.z) {
                throw new java.lang.IllegalArgumentException("Not support multi table delete");
            }
            int f18 = new p75.i1(n0Var.b(), convertTo, i17.b(), i17.e()).f(f17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "replaceInfo >> " + snsInfo.getSnsId() + ", " + f18);
            if (z17 && f18 > 0) {
                com.tencent.mm.autogen.events.SnsStarFeedOperateEvent snsStarFeedOperateEvent = new com.tencent.mm.autogen.events.SnsStarFeedOperateEvent();
                java.lang.String snsId = snsInfo.getSnsId();
                am.yw ywVar = snsStarFeedOperateEvent.f54842g;
                ywVar.f8486b = snsId;
                ywVar.f8485a = 2;
                ywVar.f8487c = snsInfo.getUserName();
                snsStarFeedOperateEvent.e();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public final dm.ab l(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snsInfoToSnsStarInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        dm.ab abVar = new dm.ab();
        abVar.field_snsId = snsInfo.field_snsId;
        abVar.field_content = snsInfo.field_content;
        abVar.field_head = snsInfo.field_head;
        abVar.field_attrBuf = snsInfo.field_attrBuf;
        abVar.field_createTime = snsInfo.field_createTime;
        abVar.field_likeFlag = snsInfo.field_likeFlag;
        abVar.field_localFlag = snsInfo.field_localFlag;
        abVar.field_localPrivate = snsInfo.field_localPrivate;
        abVar.field_postBuf = snsInfo.field_postBuf;
        abVar.field_serverExtFlag = snsInfo.field_serverExtFlag;
        abVar.field_withTa = snsInfo.field_withTa;
        abVar.field_withTaHasOther = snsInfo.field_withTaHasOther;
        abVar.field_sourceType = snsInfo.field_sourceType;
        abVar.field_stringSeq = snsInfo.field_stringSeq;
        abVar.field_type = snsInfo.field_type;
        abVar.field_subType = snsInfo.field_subType;
        abVar.field_pravited = snsInfo.field_pravited;
        abVar.field_userName = snsInfo.field_userName;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsInfoToSnsStarInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return abVar;
    }

    public final com.tencent.mm.plugin.sns.storage.SnsInfo m(com.tencent.mm.protocal.protobuf.SnsObject snsObj, java.lang.String userName, int i17) {
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snsObjectToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        kotlin.jvm.internal.o.g(snsObj, "snsObj");
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "snsObjectToSnsInfo >> " + snsObj.Id + ", " + userName);
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(snsObj.Id);
        if (W0 == null) {
            W0 = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        }
        r45.cu5 cu5Var = snsObj.ObjectDesc;
        if (cu5Var == null || (gVar = cu5Var.f371841f) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsStarSnsInfoStorage", "object desc is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsObjectToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return null;
        }
        java.lang.String str = new java.lang.String(gVar.g(), r26.c.f368865a);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsObjectToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return null;
        }
        if (!W0.setContent(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsObjectToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return null;
        }
        snsObj.ObjectOperations = com.tencent.mm.plugin.sns.model.s5.l(snsObj.ObjectOperations, W0.field_attrBuf);
        boolean z17 = false;
        snsObj.ObjectDesc.d(new byte[0]);
        W0.setUserName(snsObj.Username);
        W0.setCreateTime(snsObj.CreateTime);
        W0.setLikeFlag(snsObj.LikeFlag);
        W0.setSnsId(snsObj.Id);
        W0.setStringSeq(snsObj.Id);
        W0.field_serverExtFlag = snsObj.ExtFlag;
        W0.addSourceFlag(i17);
        try {
            if (!W0.isAd()) {
                com.tencent.mm.plugin.sns.model.s5.a(W0, snsObj);
            }
            W0.setAttrBuf(snsObj.toByteArray());
            com.tencent.mm.plugin.sns.model.s5.m(W0, snsObj);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsStarSnsInfoStorage", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = W0.getTimeLine();
        kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
        timeLine.UserName = snsObj.Username;
        int i18 = timeLine.Privated;
        W0.setPravited(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "ext flag %s  extflag %s", java.lang.Long.valueOf(snsObj.Id), java.lang.Integer.valueOf(snsObj.ExtFlag));
        int i19 = snsObj.ExtFlag;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBIDIRFRIEND", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        boolean z18 = (i19 & 1) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBIDIRFRIEND", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (z18) {
            W0.setExtFlag();
        } else {
            W0.unSetExtFlag();
        }
        if (snsObj.WeiShangFeedType != 0) {
            W0.setWsFeedTypeFlag();
        } else {
            W0.clearWsFeedTypeFlag();
        }
        if (com.tencent.mm.plugin.sns.model.s5.j(snsObj.ExtFlag)) {
            W0.addSourceFlag(128);
            com.tencent.mm.plugin.sns.storage.s2 y07 = com.tencent.mm.plugin.sns.model.l4.Qj().y0(snsObj.Id);
            if (y07 != null && !com.tencent.mm.sdk.platformtools.t8.M0(y07.field_groupStrcut)) {
                r45.qb6 qb6Var = new r45.qb6();
                try {
                    qb6Var.parseFrom(y07.field_groupStrcut);
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(qb6Var.f383810d)) {
                        z17 = true;
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SnsStarSnsInfoStorage", "parse SnsWsGroupStruct fail:%s", e18.getMessage());
                }
            }
            if (y07 == null || !z17) {
                W0.cleanWsFoldFlag();
            } else {
                W0.setWsFoldFlag();
            }
        } else {
            W0.cleanWsFoldFlag();
        }
        if (i18 == 1 && i17 != 4 && i17 != 16) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsStarSnsInfoStorage", "svr error push me the private pic in timelnie or others");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsObjectToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return null;
        }
        if (i18 == 1 || (!kotlin.jvm.internal.o.b(userName, snsObj.Username) && i17 == 4)) {
            W0.setLocalPrivate();
        }
        W0.setTimeLine(timeLine);
        W0.setTypeFlag(timeLine.ContentObj.f369837e);
        W0.setSubTypeFlag(timeLine.ContentObj.f369841i);
        if (j62.e.g().c(new com.tencent.mm.plugin.sns.config.RCSnsCmtEmoticonAutoLoad()) == 1) {
            java.util.Iterator<r45.e86> it = snsObj.CommentUserList.iterator();
            while (it.hasNext()) {
                java.util.Iterator it6 = it.next().f373140u.iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.storage.emotion.EmojiInfo b17 = com.tencent.mm.plugin.sns.model.s5.b((r45.l86) it6.next());
                    if (com.tencent.mm.storage.n5.f().c().u1(b17.field_md5) == null) {
                        com.tencent.mm.storage.n5.f().c().insert(b17);
                        zq.h.f474972a.e(b17, null);
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsObjectToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return W0;
    }

    public final com.tencent.mm.plugin.sns.storage.SnsInfo n(dm.ab abVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snsStarInfoToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        if (abVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsStarInfoToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        snsInfo.field_snsId = abVar.field_snsId;
        snsInfo.field_content = abVar.field_content;
        snsInfo.field_head = abVar.field_head;
        snsInfo.field_attrBuf = abVar.field_attrBuf;
        snsInfo.field_createTime = abVar.field_createTime;
        snsInfo.field_likeFlag = abVar.field_likeFlag;
        snsInfo.field_localFlag = abVar.field_localFlag;
        snsInfo.field_localPrivate = abVar.field_localPrivate;
        snsInfo.field_postBuf = abVar.field_postBuf;
        snsInfo.field_serverExtFlag = abVar.field_serverExtFlag;
        snsInfo.field_withTa = abVar.field_withTa;
        snsInfo.field_withTaHasOther = abVar.field_withTaHasOther;
        snsInfo.field_sourceType = abVar.field_sourceType;
        snsInfo.field_stringSeq = abVar.field_stringSeq;
        snsInfo.field_type = abVar.field_type;
        snsInfo.field_subType = abVar.field_subType;
        snsInfo.field_pravited = abVar.field_pravited;
        snsInfo.field_userName = abVar.field_userName;
        snsInfo.localid = (int) abVar.systemRowid;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsStarInfoToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return snsInfo;
    }

    public final void o(dm.ab snsStarInfo, java.lang.String userName) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateOrInsetSnsStarInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        kotlin.jvm.internal.o.g(snsStarInfo, "snsStarInfo");
        kotlin.jvm.internal.o.g(userName, "userName");
        l75.k0 f17 = f();
        p75.n0 n0Var = dm.ab.f235716y;
        n0Var.getClass();
        android.content.ContentValues convertTo = snsStarInfo.convertTo();
        p75.m c17 = dm.ab.A.i(java.lang.Long.valueOf(snsStarInfo.field_snsId)).c(dm.ab.B.j(userName));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        int f18 = new p75.i1(n0Var.b(), convertTo, c17.b(), c17.e()).f(f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "updateOrInsetSnsStarInfo >> " + f18 + ' ' + snsStarInfo.field_snsId);
        if (f18 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "data is no in db go to inset");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", "insetSnsStarInfo >> " + dm.ab.t0(snsStarInfo, false).a(f17) + ' ' + snsStarInfo.field_snsId);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateOrInsetSnsStarInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }
}
