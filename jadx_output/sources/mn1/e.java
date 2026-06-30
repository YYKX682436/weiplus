package mn1;

/* loaded from: classes12.dex */
public class e implements sn1.h, kn1.e {
    public static boolean N;
    public static boolean O;
    public static int P;
    public java.lang.String B;
    public int C;
    public java.lang.String D;
    public java.lang.String E;
    public int F;
    public com.tencent.mm.sdk.platformtools.b4 G;
    public int K;

    /* renamed from: a, reason: collision with root package name */
    public ln1.x f329838a;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f329850m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f329851n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f329852o;

    /* renamed from: b, reason: collision with root package name */
    public long f329839b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f329840c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f329841d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f329842e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f329843f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f329844g = false;

    /* renamed from: h, reason: collision with root package name */
    public long f329845h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f329846i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Object f329847j = new java.lang.Object();

    /* renamed from: k, reason: collision with root package name */
    public boolean f329848k = false;

    /* renamed from: l, reason: collision with root package name */
    public java.util.LinkedList f329849l = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashSet f329853p = new java.util.HashSet();

    /* renamed from: q, reason: collision with root package name */
    public long f329854q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f329855r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f329856s = true;

    /* renamed from: t, reason: collision with root package name */
    public int f329857t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f329858u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f329859v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f329860w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f329861x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f329862y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f329863z = 0;
    public java.lang.String A = "";
    public final java.util.Set H = new java.util.HashSet();
    public final com.tencent.mm.modelbase.u0 I = new mn1.o(this);

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f329837J = new mn1.p(this);
    public final sn1.g L = new mn1.g(this);
    public final sn1.r0 M = new mn1.h(this);

    public static void d(mn1.e eVar) {
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "move recover init");
        N = false;
        eVar.f329839b = 0L;
        eVar.f329840c = 0L;
        eVar.f329842e = 0L;
        eVar.f329843f = 0L;
        eVar.f329845h = 0L;
        eVar.f329846i = 0L;
        eVar.f329848k = false;
        eVar.f329853p.clear();
        eVar.f329856s = true;
        sn1.i.I(3, eVar.f329837J);
        sn1.t0 t0Var = new sn1.t0(mn1.d.i().f309604b);
        wn1.p r17 = kn1.k.r(0L);
        java.lang.Long valueOf = java.lang.Long.valueOf(mn1.d.i().l().f());
        wn1.q qVar = t0Var.f410100u;
        qVar.f447454e = 0L;
        qVar.f447455f = 0L;
        qVar.f447456g = 0L;
        qVar.f447457h = r17;
        qVar.f447458i = valueOf.longValue();
        qVar.f447459m = 0;
        qVar.f447460n = "";
        xn1.c.b("SessionId", "");
        t0Var.K();
        mn1.d.i().e().f309609a = 22;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        eVar.a(22);
    }

    @Override // kn1.e
    public void a(int i17) {
        com.tencent.mm.sdk.platformtools.u3.h(new mn1.i(this, new java.util.HashSet(this.H), i17));
    }

    @Override // sn1.h
    public void b(boolean z17, int i17, byte[] bArr, int i18) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "onNotify isLocal:%b, type:%d, seq:%d, buf.len:%d", objArr);
        if (!z17 || 10011 != i17) {
            if (i17 != 9) {
                if (i17 != 10) {
                    if (i17 == 5) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(485L, 51L, 1L, false);
                        g(true, false, -100);
                    }
                    gm0.j1.e().j(new mn1.q(this, i17, bArr, i18));
                    return;
                }
                wn1.i iVar = (wn1.i) kn1.k.C(new wn1.i(), bArr);
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                objArr2[0] = iVar;
                objArr2[1] = java.lang.Long.valueOf(iVar != null ? iVar.f447432d : -1L);
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "onNotify receive heartbeat response, resp:%s ack:%d", objArr2);
                return;
            }
            wn1.h hVar = (wn1.h) kn1.k.C(new wn1.h(), bArr);
            if (hVar == null) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                objArr3[0] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "heartBeatRequest parseBuf failed:%d", objArr3);
                return;
            }
            wn1.i iVar2 = new wn1.i();
            iVar2.f447432d = hVar.f447431d;
            try {
                sn1.i.S(iVar2.toByteArray(), 10, i18);
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", e17, "onNotify buf to BackupHeartBeatResponse err.", new java.lang.Object[0]);
                return;
            }
        }
        kn1.g e18 = mn1.d.i().e();
        e18.getClass();
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int i19 = e18.f309609a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "processNetworkNotify local disconnect, backupMoveState:%d", java.lang.Integer.valueOf(i19));
        if (i19 != -21 && i19 != -13) {
            if (i19 == 1) {
                mn1.d.i().h().e();
                if (O) {
                    mn1.d.i().e().f309609a = -4;
                    a(-4);
                    return;
                } else {
                    if (this.G != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "processNetworkNotify stop backupConnectTimerHandler.");
                        this.G.d();
                    }
                    m();
                    return;
                }
            }
            if (i19 != -5) {
                if (i19 == -4) {
                    g(true, false, 0);
                    return;
                }
                if (i19 == 22 || i19 == 23) {
                    g(true, false, -4);
                    mn1.d.i().h().e();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(485L, 43L, 1L, false);
                    e(11789, 4);
                    long j17 = this.f329854q;
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "processNetworkNotify recover transfer disconnect, recoverDataSize:%d, recvSize:%d, recoverCostTime:%d", java.lang.Long.valueOf(this.f329842e), java.lang.Long.valueOf(this.f329843f), java.lang.Long.valueOf(j17 != 0 ? java.lang.System.currentTimeMillis() - j17 : 0L));
                    return;
                }
                return;
            }
        }
        mn1.d.i().h().e();
    }

    @Override // kn1.e
    public void c() {
        java.util.Iterator it;
        java.lang.String str;
        boolean z17;
        long j17 = this.f329855r;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        long j18 = currentTimeMillis / 1000;
        long j19 = mn1.d.i().e().f309620l;
        xn1.b.f455454a.b(7, 3, qn1.c.o().f364969i, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f329843f), 1);
        jx3.f.INSTANCE.d(21019, java.lang.Long.valueOf(j19), java.lang.Long.valueOf(this.f329843f), java.lang.Integer.valueOf(cc1.t.CTRL_INDEX), "Move-onMergeFinish", "true", java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(485L, 49L, 1L, false);
        g0Var.idkeyStat(485L, 50L, j18, false);
        g0Var.idkeyStat(485L, 72L, j19, false);
        g0Var.idkeyStat(485L, 52L, this.f329843f / 1024, false);
        this.f329841d = com.tencent.mm.vfs.w6.k(gm0.j1.u().g());
        kn1.m mVar = kn1.m.f309638n;
        kn1.o oVar = kn1.o.f309649e;
        kn1.q.b(mVar, oVar, "merge success".concat(this.f329844g ? " - full" : " - break"), currentTimeMillis, this.f329843f, this.f329842e, 0L);
        kn1.q.b(mVar, oVar, "transfer and merge".concat(this.f329844g ? " - full" : " - break"), java.lang.System.currentTimeMillis() - this.f329854q, this.f329843f, this.f329842e, 0L);
        g0Var.d(17868, 1, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(this.f329843f / 1024), java.lang.Long.valueOf(this.f329845h / 1024), java.lang.Long.valueOf(this.f329846i / 1024), java.lang.Long.valueOf(this.f329839b / 1024), java.lang.Long.valueOf(this.f329841d / 1024), java.lang.Long.valueOf(this.f329840c), java.lang.Long.valueOf(j19));
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "backupMoveMerge, errcode[%d], mergeTime[%d s], recvSize[%d KB], recvTextSize[%d KB], recvMediaSize[%d KB], originDbSize[%d kb], finishMergeDbSize[%d kb], originMsgCount[%d], mergeMsgCount[%d]", 1, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(this.f329843f / 1024), java.lang.Long.valueOf(this.f329845h / 1024), java.lang.Long.valueOf(this.f329846i / 1024), java.lang.Long.valueOf(this.f329839b / 1024), java.lang.Long.valueOf(this.f329841d / 1024), java.lang.Long.valueOf(this.f329840c), java.lang.Long.valueOf(j19));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_OLD_RECORDS_BOOLEAN, java.lang.Boolean.TRUE);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "move recover finish, make BACKUP_MOVE_RECORDS. mergeTime:%d, totalMsgCount:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19));
        if (kn1.k.f309630a) {
            kn1.k.b(lp0.b.D(), "backupTestInfo.txt", ("\nMerge Info:\nmergeStartTime:" + new java.text.SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new java.util.Date(this.f329855r)) + "\nmergeTime:" + j18 + "\ntotalMsgCount:" + j19 + "\nrecvSize:" + (this.f329843f / 1024) + " kB\n").getBytes());
        }
        if (!this.f329860w) {
            com.tencent.mm.storage.q i17 = c01.d9.b().i();
            i17.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            android.database.Cursor all = i17.getAll();
            if (all == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupTempMoveTimeStorage", "getAllData failed.");
            } else {
                while (all.moveToNext()) {
                    com.tencent.mm.storage.p pVar = new com.tencent.mm.storage.p();
                    pVar.convertFrom(all);
                    linkedList.add(pVar);
                }
                all.close();
            }
            if (linkedList.size() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "merge finish and BackupTempMoveTimeStorage is empty!");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "merge finish and start update BackupMoveTimeStorage!");
                com.tencent.mm.storage.m g17 = c01.d9.b().g();
                java.lang.String str2 = this.B;
                g17.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveTimeStorage", "start mergeDataByDeviceId.");
                java.util.HashMap hashMap = new java.util.HashMap();
                l75.k0 k0Var = g17.f195100d;
                android.database.Cursor B = k0Var.B("SELECT * FROM BackupMoveTime WHERE deviceId = \"" + str2 + "\" ", null);
                if (B == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveTimeStorage", "getAllDataByDevice failed, deviceid:%s", str2);
                } else {
                    while (B.moveToNext()) {
                        com.tencent.mm.storage.l lVar = new com.tencent.mm.storage.l();
                        lVar.convertFrom(B);
                        hashMap.put(lVar.field_sessionName, lVar);
                    }
                    B.close();
                }
                if (k0Var.delete("BackupMoveTime", "deviceId= ? ", new java.lang.String[]{"" + str2}) < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveTimeStorage", "mergeDataByDeviceId delete db failed, deviceid:%s", str2);
                } else {
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        com.tencent.mm.storage.p pVar2 = (com.tencent.mm.storage.p) it6.next();
                        com.tencent.mm.storage.l lVar2 = (com.tencent.mm.storage.l) hashMap.get(pVar2.field_sessionName);
                        if (lVar2 == null) {
                            r45.cd cdVar = new r45.cd();
                            cdVar.f371477d = pVar2.field_startTime;
                            cdVar.f371478e = pVar2.field_endTime;
                            com.tencent.mm.storage.l lVar3 = new com.tencent.mm.storage.l();
                            lVar3.field_deviceId = str2;
                            lVar3.field_sessionName = pVar2.field_sessionName;
                            r45.dd ddVar = new r45.dd();
                            lVar3.field_moveTime = ddVar;
                            ddVar.f372317d = new java.util.LinkedList();
                            lVar3.field_moveTime.f372317d.add(cdVar);
                            hashMap.put(pVar2.field_sessionName, lVar3);
                        } else {
                            java.util.LinkedList linkedList2 = lVar2.field_moveTime.f372317d;
                            if (pVar2.field_startTime <= pVar2.field_endTime) {
                                java.util.Iterator it7 = linkedList2.iterator();
                                while (true) {
                                    if (!it7.hasNext()) {
                                        it = it6;
                                        str = str2;
                                        z17 = false;
                                        break;
                                    }
                                    r45.cd cdVar2 = (r45.cd) it7.next();
                                    long j27 = pVar2.field_startTime;
                                    long j28 = cdVar2.f371478e;
                                    if (j27 < j28) {
                                        long j29 = pVar2.field_endTime;
                                        it = it6;
                                        str = str2;
                                        long j37 = cdVar2.f371477d;
                                        if (j29 < j37) {
                                            r45.cd cdVar3 = new r45.cd();
                                            cdVar3.f371477d = pVar2.field_startTime;
                                            cdVar3.f371478e = pVar2.field_endTime;
                                            linkedList2.add(cdVar3);
                                        } else {
                                            if (j27 < j37) {
                                                cdVar2.f371477d = j27;
                                            }
                                            if (j29 > j28) {
                                                cdVar2.f371478e = j29;
                                                while (true) {
                                                    if (!it7.hasNext()) {
                                                        break;
                                                    }
                                                    r45.cd cdVar4 = (r45.cd) it7.next();
                                                    long j38 = pVar2.field_endTime;
                                                    if (j38 <= cdVar4.f371477d) {
                                                        break;
                                                    }
                                                    long j39 = cdVar4.f371478e;
                                                    if (j38 <= j39) {
                                                        cdVar2.f371478e = j39;
                                                        it7.remove();
                                                        break;
                                                    }
                                                    it7.remove();
                                                }
                                            }
                                        }
                                        z17 = true;
                                    }
                                }
                                if (!z17) {
                                    r45.cd cdVar5 = new r45.cd();
                                    cdVar5.f371477d = pVar2.field_startTime;
                                    cdVar5.f371478e = pVar2.field_endTime;
                                    linkedList2.add(cdVar5);
                                }
                                str2 = str;
                                it6 = it;
                            }
                        }
                        it = it6;
                        str = str2;
                        str2 = str;
                        it6 = it;
                    }
                    for (java.lang.String str3 : hashMap.keySet()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveTimeStorage", "mergeDataByDeviceId insert BackupMoveTimeStorage ret[%b], sessionName:%s", java.lang.Boolean.valueOf(g17.insert((com.tencent.mm.storage.l) hashMap.get(str3))), str3);
                    }
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).g(new mn1.j(this));
        sn1.i.X(22);
        sn1.i.Z();
        sn1.i.a0();
    }

    public void e(int i17, int i18) {
        long j17 = this.f329854q;
        long j18 = 0;
        if (j17 != 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            j18 = java.lang.System.currentTimeMillis() - j17;
        }
        long j19 = j18 / 1000;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(i17, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.C), java.lang.Long.valueOf(this.f329843f / 1024), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(this.f329839b / 1024), java.lang.Integer.valueOf(this.f329863z));
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "backupMoveRecoverKvStat kvNum[%d], errcode[%d], backupDataSize[%d KB], recvSize[%d KB], recoverCostTime[%d s], originDbSize[%d kb]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(this.f329842e / 1024), java.lang.Long.valueOf(this.f329843f / 1024), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(this.f329839b / 1024));
    }

    public void f() {
        wn1.d dVar = new wn1.d();
        dVar.f447414d = mn1.d.i().f309604b;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "send cancel req.");
            sn1.i.R(dVar.toByteArray(), 5);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", e17, "buf to BackupCancelRequest err.", new java.lang.Object[0]);
        }
    }

    public void g(boolean z17, boolean z18, int i17) {
        boolean z19;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "cancel backupMoveRecoverServer cancel isSelf[%b], needClearContinueRecoverData[%b], updateState[%d], caller:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i17), com.tencent.mm.sdk.platformtools.z3.a());
        if (!z17) {
            f();
        }
        synchronized (this.f329847j) {
            z19 = true;
            this.f329848k = true;
            ln1.x xVar = this.f329838a;
            if (xVar != null && xVar.f319849c) {
                xVar.d(z18, i17);
                z19 = false;
            }
            this.f329838a = null;
        }
        if (z19 && i17 != 0) {
            mn1.d.i().e().f309609a = i17;
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            a(i17);
        }
        if (z18) {
            ((ku5.t0) ku5.t0.f312615d).g(new mn1.k(this));
        }
        sn1.i.Z();
        sn1.i.a0();
        mn1.d.i().g();
        mn1.d.i().h().f319763h = null;
        xn1.b bVar = xn1.b.f455454a;
        java.lang.String str = qn1.c.o().f364969i;
        long j17 = this.f329855r;
        boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        xn1.b.c(bVar, 7, 4, str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17), java.lang.Long.valueOf(this.f329843f), null, null, null, 224, null);
    }

    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "recover clearContinueRecoverData");
        this.f329853p.clear();
        if (kn1.k.f309630a) {
            return;
        }
        kn1.k.k(kn1.k.o());
        kn1.k.h();
    }

    public boolean i() {
        return c01.d9.b().h().z0();
    }

    public final void j(java.lang.String str, int i17, int i18, int i19, int i27, int i28) {
        wn1.w wVar = new wn1.w();
        wVar.f447499d = str;
        wVar.f447500e = i17;
        wVar.f447501f = i18;
        wVar.f447502g = i19;
        wVar.f447503h = i27;
        try {
            sn1.i.S(wVar.toByteArray(), 7, i28);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", e17, "sendResp", new java.lang.Object[0]);
        }
    }

    public void k(boolean z17) {
        java.util.Iterator it;
        java.util.Iterator it6;
        com.tencent.mm.storage.m mVar;
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "startSendRequestSessionResponse, isChooseAll:%s, isResumeMove:%s, isQuickBackup:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f329861x), java.lang.Boolean.valueOf(this.f329860w));
        this.f329862y = z17;
        this.f329844g = false;
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        mn1.d.i().h().f319763h = new mn1.r(this, linkedBlockingQueue);
        ((ku5.t0) ku5.t0.f312615d).q(new mn1.s(this, linkedBlockingQueue));
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveTimeStorage", "deleteAllData, result:%b", java.lang.Boolean.valueOf(c01.d9.b().g().f195100d.A("BackupMoveTime", "delete from BackupMoveTime")));
        }
        if (!this.f329861x && !this.f329860w && !z17) {
            java.util.LinkedList linkedList = this.f329851n;
            java.util.LinkedList linkedList2 = this.f329852o;
            this.f329851n = new java.util.LinkedList();
            this.f329852o = new java.util.LinkedList();
            com.tencent.mm.storage.m g17 = c01.d9.b().g();
            java.lang.String str2 = this.B;
            java.util.LinkedList linkedList3 = this.f329851n;
            java.util.LinkedList linkedList4 = this.f329852o;
            g17.getClass();
            java.util.Iterator it7 = linkedList2.iterator();
            java.util.Iterator it8 = linkedList.iterator();
            while (it8.hasNext()) {
                java.lang.String str3 = (java.lang.String) it8.next();
                if (it7.hasNext()) {
                    long longValue = ((java.lang.Long) it7.next()).longValue();
                    if (!it7.hasNext()) {
                        break;
                    }
                    long longValue2 = ((java.lang.Long) it7.next()).longValue();
                    if (longValue2 == 0) {
                        longValue2 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                    }
                    it = it8;
                    r45.dd ddVar = null;
                    android.database.Cursor B = g17.f195100d.B("SELECT * FROM BackupMoveTime WHERE deviceId = \"" + str2 + "\" AND sessionName = \"" + str3 + "\" ", null);
                    if (B == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveTimeStorage", "getMoveTimeByDeviceIdSession failed, deviceid:%s, sessionName:%s ", str2, str3);
                    } else if (B.moveToFirst()) {
                        com.tencent.mm.storage.l lVar = new com.tencent.mm.storage.l();
                        lVar.convertFrom(B);
                        B.close();
                        ddVar = lVar.field_moveTime;
                    } else {
                        B.close();
                    }
                    if (ddVar == null || ddVar.f372317d.size() <= 0) {
                        it6 = it7;
                    } else {
                        it6 = it7;
                        if (longValue2 >= ((r45.cd) ddVar.f372317d.getFirst()).f371477d && longValue <= ((r45.cd) ddVar.f372317d.getLast()).f371478e) {
                            java.util.LinkedList linkedList5 = ddVar.f372317d;
                            boolean z18 = false;
                            int i17 = 0;
                            while (i17 < linkedList5.size() && longValue <= longValue2) {
                                r45.cd cdVar = (r45.cd) linkedList5.get(i17);
                                mVar = g17;
                                str = str2;
                                long j17 = cdVar.f371478e;
                                if (longValue <= j17) {
                                    if (longValue < cdVar.f371477d) {
                                        linkedList3.add(str3);
                                        linkedList4.add(java.lang.Long.valueOf(longValue));
                                        long j18 = cdVar.f371477d;
                                        if (longValue2 < j18) {
                                            linkedList4.add(java.lang.Long.valueOf(longValue2));
                                            longValue = cdVar.f371477d;
                                            z18 = true;
                                            break;
                                        } else {
                                            linkedList4.add(java.lang.Long.valueOf(j18));
                                            longValue = cdVar.f371478e;
                                            z18 = true;
                                        }
                                    } else {
                                        longValue = j17;
                                    }
                                }
                                i17++;
                                g17 = mVar;
                                str2 = str;
                            }
                            mVar = g17;
                            str = str2;
                            if (longValue <= longValue2) {
                                linkedList3.add(str3);
                                linkedList4.add(java.lang.Long.valueOf(longValue));
                                linkedList4.add(java.lang.Long.valueOf(longValue2));
                                z18 = true;
                            }
                            if (!z18) {
                                linkedList3.add(str3);
                                linkedList4.add(java.lang.Long.valueOf(longValue));
                                linkedList4.add(java.lang.Long.valueOf(longValue2));
                            }
                        }
                    }
                    mVar = g17;
                    str = str2;
                    linkedList3.add(str3);
                    linkedList4.add(java.lang.Long.valueOf(longValue));
                    linkedList4.add(java.lang.Long.valueOf(longValue2));
                } else {
                    it = it8;
                    it6 = it7;
                    mVar = g17;
                    str = str2;
                }
                it8 = it;
                it7 = it6;
                g17 = mVar;
                str2 = str;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveTimeStorage", "getSessionRequestTimeInteval, resultSession size:%s, resultTimeInterval:%s", java.lang.Integer.valueOf(linkedList3.size()), java.lang.Integer.valueOf(linkedList4.size()));
        }
        wn1.m mVar2 = new wn1.m();
        java.util.LinkedList linkedList6 = this.f329851n;
        mVar2.f447439d = linkedList6;
        mVar2.f447440e = this.f329852o;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "send requestsession resp, SessionName size:%d, TimeInterval size:%d", java.lang.Integer.valueOf(linkedList6.size()), java.lang.Integer.valueOf(mVar2.f447440e.size()));
            sn1.i.S(mVar2.toByteArray(), 12, this.K);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", e17, "buf to BackupRequestSessionResponse err.", new java.lang.Object[0]);
        }
        try {
            java.util.Iterator it9 = this.f329852o.iterator();
            java.util.Iterator it10 = this.f329851n.iterator();
            while (it10.hasNext()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "session:%s, startTime:%s, endTime:%s", (java.lang.String) it10.next(), it9.next(), it9.next());
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "TimeInterval size error. e:%s", e18);
        }
        sn1.i.W();
        if (this.f329861x) {
            xn1.b.f455454a.a(7, 2, qn1.c.o().f364969i);
            mn1.d.i().e().a(23, 1, this.f329849l.size());
            this.f329842e = mn1.d.i().e().f309616h;
            this.f329843f = mn1.d.i().e().f309613e;
            this.f329845h = mn1.d.i().e().f309614f;
            this.f329846i = mn1.d.i().e().f309615g;
            this.f329839b = mn1.d.i().e().f309618j;
            this.f329840c = mn1.d.i().e().f309619k;
        } else {
            mn1.d.i().e().b(23, 1, this.f329849l.size(), 0L, this.f329842e, 0L, 0L);
            this.f329839b = com.tencent.mm.vfs.w6.k(gm0.j1.u().g());
            mn1.d.i().e().f309618j = this.f329839b;
        }
        tn1.f.f().c();
        this.f329840c = -1L;
        ((ku5.t0) ku5.t0.f312615d).q(new mn1.t(this));
        a(23);
    }

    public void l(java.lang.String str, int i17) {
        ln1.g h17 = mn1.d.i().h();
        h17.f319756a.set(2);
        h17.f319757b = str;
        h17.f319758c = i17;
        sm0.b.f409311a = new ln1.a(h17);
        boolean z17 = true;
        sn1.i.I(1, this.I);
        try {
            if (com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ChattingRecordsKvstatDisable"), 0) != 0) {
                z17 = false;
            }
            this.f329859v = z17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", e17, "getInt", new java.lang.Object[0]);
        }
        sn1.a aVar = new sn1.a(mn1.d.i().f309605c, mn1.d.i().f309606d, kn1.f.f309602h, mn1.d.i().f309604b, 3, 22, i());
        aVar.b0(this.f329859v, true, true, false, false, true);
        aVar.K();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "tryConnect start connect timehandler.");
        if (this.G == null) {
            this.G = new com.tencent.mm.sdk.platformtools.b4(new mn1.l(this), false);
        }
        long Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_backup_connect_overtime_and, 30) * 1000;
        this.G.c(Ni, Ni);
    }

    public final void m() {
        java.lang.String str = this.D;
        java.lang.String str2 = this.E;
        java.lang.String z17 = kn1.k.z(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "connect failed thisWifi:%s, oldPhoneWifiName:%s, oldPhoneIpAddress:%s, tryCount:%d", z17, str, str2, java.lang.Integer.valueOf(P));
        kn1.m mVar = kn1.m.f309634g;
        kn1.o oVar = kn1.o.f309651g;
        kn1.q.a(mVar, oVar, "connect failed: with ip [" + str2 + "]");
        if (z17 == null || z17.equals("")) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(485L, 1L, 1L, false);
            g0Var.d(11787, 1);
            mn1.d.i().e().f309609a = -1;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            a(-1);
            kn1.q.a(mVar, oVar, "connect failed: failed to get wifi name");
            return;
        }
        if (str == null || !str.equals(z17)) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.idkeyStat(485L, 2L, 1L, false);
            g0Var2.d(11787, 2);
            mn1.d.i().e().f309609a = -2;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            a(-2);
            kn1.q.a(mVar, oVar, "connect failed: not same wifi");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || !kn1.k.E(str2)) {
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.idkeyStat(485L, 3L, 1L, false);
            g0Var3.d(11787, 3);
            mn1.d.i().e().f309609a = -3;
            a(-3);
            kn1.q.a(mVar, oVar, "connect failed: not same gateway");
            return;
        }
        int i17 = P;
        if (i17 > 0) {
            P = i17 - 1;
            l(this.E, this.F);
            return;
        }
        mn1.d.i().e().f309609a = -5;
        a(-5);
        com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var4.idkeyStat(485L, 4L, 1L, false);
        g0Var4.d(11787, 6);
    }
}
