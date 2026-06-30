package qn1;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f364994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f364995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f364996f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qn1.o f364997g;

    public n(qn1.o oVar, int i17, byte[] bArr, int i18) {
        this.f364997g = oVar;
        this.f364994d = i17;
        this.f364995e = bArr;
        this.f364996f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.protobuf.g gVar;
        int i17 = this.f364996f;
        byte[] bArr = this.f364995e;
        qn1.o oVar = this.f364997g;
        int i18 = this.f364994d;
        if (i18 == 3) {
            qn1.t tVar = oVar.f364998a;
            tVar.getClass();
            wn1.q qVar = (wn1.q) kn1.k.C(new wn1.q(), bArr);
            long j17 = qVar.f447458i * 1024 * 1024;
            tVar.f365008b = j17;
            sn1.i.f410019p.f410092i = j17;
            if (!qn1.c.i().f309604b.equals(qVar.f447453d)) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                objArr[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
                objArr[1] = qVar.f447453d;
                objArr[2] = qn1.c.i().f309604b;
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcRecoverServer", "startRequestNotify BackupStartRequest parseBuf:%d failed or wrong id[%s,%s]", objArr);
                tVar.h(1, i17, 0L);
                tVar.d(false, false, -5);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 121L, 1L, false);
                return;
            }
            qn1.c.i().e().f309617i = qVar.f447454e;
            if (qVar.f447459m == 3) {
                tVar.f365020n = true;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 36L, 1L, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "isQuickBackup!!!");
            }
            long j18 = qVar.f447458i;
            com.tencent.mm.pointers.PLong pLong = new com.tencent.mm.pointers.PLong();
            com.tencent.mm.pointers.PLong pLong2 = new com.tencent.mm.pointers.PLong();
            gm0.j1.i();
            kn1.k.d(0L, pLong, pLong2, gm0.j1.u().d());
            long j19 = pLong2.value;
            double d17 = j18 * 0.1d;
            if (d17 > 5.24288E8d) {
                d17 = 5.24288E8d;
            }
            long j27 = j19 - ((long) d17);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            tVar.f365017k = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "startRequestNotify time:%d SessionCount:%d, MsgCount:%d, DataSize:%d validSize:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(qVar.f447455f), java.lang.Long.valueOf(qVar.f447456g), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j27));
            if (j27 >= j18) {
                tVar.h(0, i17, j27);
                sn1.i.V();
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcRecoverServer", "startRequestNotify Not Enough Space:%d < dataSize:%d", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j18));
            tVar.h(2, i17, j27);
            ln1.g h17 = qn1.c.i().h();
            com.tencent.mm.sdk.platformtools.n3 n3Var = h17.f319762g;
            if (n3Var == null) {
                h17.e();
            } else {
                n3Var.postDelayed(new ln1.b(h17), 10);
            }
            qn1.c.i().e().f309609a = -13;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            tVar.a(-13);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(400L, 6L, 1L, false);
            g0Var.d(13736, 5, 0, 0, 2, java.lang.Integer.valueOf(qn1.c.i().j().f364974n));
            return;
        }
        if (i18 == 11) {
            qn1.t tVar2 = oVar.f364998a;
            tVar2.getClass();
            wn1.l lVar = (wn1.l) kn1.k.C(new wn1.l(), bArr);
            if (lVar == null) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                objArr2[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcRecoverServer", "requestSessionListNotify parseBuf failed:%d", objArr2);
                qn1.c.i().e().f309609a = -21;
                tVar2.a(-21);
                return;
            }
            tVar2.f365012f = lVar.f447437d;
            java.util.LinkedList linkedList = lVar.f447438e;
            tVar2.f365013g = linkedList;
            if (linkedList.size() != tVar2.f365012f.size() * 2) {
                tVar2.d(false, false, -21);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 119L, 1L, false);
                return;
            }
            qn1.c.i().e().a(23, 1, tVar2.f365012f.size());
            tVar2.a(23);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            c01.d9.b().i().y0(tVar2.f365012f, tVar2.f365013g, linkedList2, linkedList3);
            wn1.m mVar = new wn1.m();
            mVar.f447439d = linkedList2;
            mVar.f447440e = linkedList3;
            sn1.i.W();
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "requestSessionListNotify send requestsession resp, SessionName size:%d, TimeInterval size:%d", java.lang.Integer.valueOf(tVar2.f365012f.size()), java.lang.Integer.valueOf(linkedList3.size()));
                sn1.i.S(mVar.toByteArray(), 12, i17);
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPcRecoverServer", e17, "BackupRequestSessionResponse to buf err.", new java.lang.Object[0]);
                return;
            }
        }
        if (i18 == 6) {
            qn1.t tVar3 = oVar.f364998a;
            int i19 = this.f364996f;
            tVar3.getClass();
            wn1.v vVar = (wn1.v) kn1.k.C(new wn1.v(), bArr);
            if (vVar == null) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                objArr3[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcRecoverServer", "dataPushNotify parseBuf failed:%d", objArr3);
                tVar3.i("", 0, 0, 0, 1, i19);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "dataPushNotify receive recoverData id:%s, type:%d, start:%d, end:%d, isCancel:%b", vVar.f447491d, java.lang.Integer.valueOf(vVar.f447492e), java.lang.Integer.valueOf(vVar.f447494g), java.lang.Integer.valueOf(vVar.f447495h), java.lang.Boolean.valueOf(tVar3.f365011e));
            if (tVar3.f365011e) {
                return;
            }
            if (qn1.c.i().f309608f != null && (gVar = vVar.f447497m) != null) {
                vVar.f447497m = new com.tencent.mm.protobuf.g(com.tencent.mm.jniinterface.AesEcb.aesCryptEcb(gVar.f192156a, qn1.c.i().f309608f, false, vVar.f447495h == vVar.f447493f));
            }
            if (vVar.f447492e == 1 && vVar.f447497m != null) {
                java.lang.String m17 = kn1.k.m(vVar.f447491d);
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "dataPushNotify receive datapush text dataid:%s, dir:%s", vVar.f447491d, m17);
                kn1.k.c(m17, vVar);
                tVar3.f365009c += vVar.f447497m.f192156a.length;
            }
            if (vVar.f447492e == 2) {
                java.lang.String n17 = kn1.k.n(vVar.f447491d);
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "dataPushNotify receive datapush media dataid:%s, dir:%s", vVar.f447491d, n17);
                kn1.k.H(n17, vVar);
                tVar3.f365009c += vVar.f447497m.f192156a.length;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "dataPushNotify recvSize/convDataSize: %d, %d", java.lang.Long.valueOf(tVar3.f365009c), java.lang.Long.valueOf(tVar3.f365008b));
            long j28 = tVar3.f365008b;
            long j29 = tVar3.f365009c;
            if (j28 < j29) {
                tVar3.f365008b = j29;
                sn1.i.f410019p.f410092i = j29;
            }
            tVar3.i(vVar.f447491d, vVar.f447492e, vVar.f447494g, vVar.f447495h, 0, i19);
            return;
        }
        if (i18 == 13) {
            oVar.f364998a.getClass();
            wn1.b0 b0Var = (wn1.b0) kn1.k.C(new wn1.b0(), bArr);
            if (b0Var == null) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                objArr4[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcRecoverServer", "requestBigFileSvrIdNotify PacketSvrIDRequest parse failed :%d", objArr4);
                return;
            }
            wn1.c0 c0Var = new wn1.c0();
            c0Var.f447410d = b0Var.f447398d;
            c0Var.f447412f = b0Var.f447400f;
            c0Var.f447411e = b0Var.f447399e;
            c0Var.f447413g = b0Var.f447401g;
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "requestBigFileSvrIdNotify send SvrID resp");
                sn1.i.S(c0Var.toByteArray(), 14, i17);
                return;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPcRecoverServer", e18, "PacketSvrIDResponse to buf err.", new java.lang.Object[0]);
                return;
            }
        }
        if (i18 != 15) {
            if (i18 == 8) {
                qn1.t tVar4 = oVar.f364998a;
                tVar4.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "finishReqNotify receive finishReq. hasReceiveFinishReq[%b]", java.lang.Boolean.valueOf(qn1.t.f365006r));
                if (qn1.t.f365006r) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcRecoverServer", "finishReqNotify has receive finishReq, return.");
                    return;
                }
                qn1.t.f365006r = true;
                wn1.g gVar2 = new wn1.g();
                if (kn1.k.C(gVar2, bArr) == null) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    objArr5[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcRecoverServer", "finishReqNotify buf to BackupFinishRequest error, buflen[%d]", objArr5);
                }
                kn1.k.D(gVar2.f447430r);
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_PC_RECOVERING_BOOLEAN, java.lang.Boolean.FALSE);
                sn1.i.Z();
                sn1.i.a0();
                qn1.t.f365005q = true;
                qn1.c.i().e().a(24, tVar4.f365016j.size(), tVar4.f365012f.size());
                tVar4.a(24);
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.idkeyStat(400L, 19L, 1L, false);
                boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                tVar4.f365019m = currentTimeMillis2;
                long j37 = (currentTimeMillis2 - tVar4.f365017k) / 1000;
                g0Var2.idkeyStat(400L, 20L, j37, false);
                g0Var2.idkeyStat(400L, 21L, tVar4.f365008b / 1024, false);
                tVar4.b(13737, 0);
                if (!tVar4.f365021o) {
                    tVar4.b(13737, 21);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "finishReqNotify recover success. hasEnterReconnect[%b], recoverCostTime[%d s], recoverStartTime[%d], recoverEndTime[%d], recoverTotalSize[%d kb]", java.lang.Boolean.valueOf(tVar4.f365021o), java.lang.Long.valueOf(j37), java.lang.Long.valueOf(tVar4.f365017k), java.lang.Long.valueOf(tVar4.f365019m), java.lang.Long.valueOf(tVar4.f365008b / 1024));
                return;
            }
            return;
        }
        qn1.t tVar5 = oVar.f364998a;
        tVar5.getClass();
        wn1.x xVar = (wn1.x) kn1.k.C(new wn1.x(), bArr);
        if (xVar == null) {
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            boolean z38 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr6[0] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcRecoverServer", "SendTagNotify PacketBackupDataTag parse failed:%d", objArr6);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "SendTagNotify receive tagReq, MsgDataID:%s, BakChatName:%s, StartTime:%d, EndTime:%d,  NickName:%s, isCancel:%b", xVar.f447507g, xVar.f447504d, java.lang.Long.valueOf(xVar.f447505e), java.lang.Long.valueOf(xVar.f447506f), xVar.f447508h, java.lang.Boolean.valueOf(tVar5.f365011e));
        java.util.HashSet hashSet = tVar5.f365016j;
        hashSet.add(xVar.f447504d);
        if (tVar5.f365011e) {
            return;
        }
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_PC_RECOVERING_BOOLEAN, java.lang.Boolean.TRUE);
        kn1.g e19 = qn1.c.i().e();
        kn1.g e27 = qn1.c.i().e();
        e19.getClass();
        boolean z39 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        e27.a(e19.f309609a, hashSet.size() < tVar5.f365012f.size() ? hashSet.size() : tVar5.f365012f.size(), tVar5.f365012f.size());
        tVar5.a(e19.f309609a);
        if (c01.d9.b().h().y0(xVar.f447507g) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "SendTagNotify the same tag has received, ignore. MsgDataID:%s", xVar.f447507g);
        } else {
            com.tencent.mm.storage.n nVar = new com.tencent.mm.storage.n();
            nVar.field_msgListDataId = xVar.f447507g;
            nVar.field_sessionName = xVar.f447504d;
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "SendTagNotify insert BackupRecoverMsgListDataIdStorage ret[%b], systemRowid[%d]", java.lang.Boolean.valueOf(c01.d9.b().h().insert(nVar)), java.lang.Long.valueOf(nVar.systemRowid));
            com.tencent.mm.storage.p pVar = new com.tencent.mm.storage.p();
            pVar.field_sessionName = xVar.f447504d;
            pVar.field_startTime = xVar.f447505e;
            pVar.field_endTime = xVar.f447506f;
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "SendTagNotify insert BackupTempMoveTimeStorage ret[%b], systemRowid[%d]", java.lang.Boolean.valueOf(c01.d9.b().i().insert(pVar)), java.lang.Long.valueOf(pVar.systemRowid));
        }
        wn1.y yVar = new wn1.y();
        yVar.f447510d = xVar.f447504d;
        yVar.f447511e = xVar.f447505e;
        yVar.f447512f = xVar.f447506f;
        yVar.f447513g = xVar.f447507g;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcRecoverServer", "tagReqNotify send tag resp");
            sn1.i.S(yVar.toByteArray(), 16, i17);
        } catch (java.lang.Exception e28) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPcRecoverServer", e28, "tagReqNotify buf to PacketBackupDataTagResponse err.", new java.lang.Object[0]);
        }
    }
}
