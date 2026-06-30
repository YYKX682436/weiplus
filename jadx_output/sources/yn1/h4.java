package yn1;

@j95.b
/* loaded from: classes11.dex */
public final class h4 extends i95.w implements mv.w {

    /* renamed from: i */
    public static final yn1.b4 f463691i = new yn1.b4(null);

    /* renamed from: d */
    public volatile pi0.l1 f463692d;

    /* renamed from: e */
    public java.lang.Integer f463693e;

    /* renamed from: f */
    public java.lang.Integer f463694f;

    /* renamed from: g */
    public java.lang.Boolean f463695g;

    /* renamed from: h */
    public java.lang.Boolean f463696h;

    public static /* synthetic */ void Ai(yn1.h4 h4Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        h4Var.wi(z17, z18);
    }

    public void Bi(int i17) {
        yn1.z0 z0Var = yn1.z0.f463933a;
        if (!z0Var.n()) {
            com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "[handleStatusNotify] GlobalHolder is not initialized");
            return;
        }
        if (i17 != 19) {
            if (i17 != 20) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "Pause migration task");
            com.tencent.wechat.aff.migration.f.f217390b.h(yn1.f4.f463670a);
            return;
        }
        bw5.bj0 i18 = z0Var.i();
        com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "Stop migration task, curStatus=" + i18);
        int ordinal = i18.ordinal();
        if (ordinal == 2 || ordinal == 8 || ordinal == 9) {
            return;
        }
        com.tencent.wechat.aff.migration.f.f217390b.p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r0 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (com.tencent.mm.sdk.platformtools.o4.L().o("aoa_migration_expt_val", 0) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Di() {
        /*
            r5 = this;
            java.lang.Boolean r0 = r5.f463695g
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            goto L5e
        L9:
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.n()
            r1 = 1
            java.lang.String r2 = "aoa_migration_expt_val"
            r3 = 0
            if (r0 == 0) goto L38
            j62.e r0 = j62.e.g()
            com.tencent.mm.repairer.config.migration.RepairerConfigEnableAoaMigration r4 = new com.tencent.mm.repairer.config.migration.RepairerConfigEnableAoaMigration
            r4.<init>()
            int r0 = r0.c(r4)
            com.tencent.mm.sdk.platformtools.o4 r4 = com.tencent.mm.sdk.platformtools.o4.L()
            int r4 = r4.o(r2, r3)
            if (r0 == r4) goto L35
            com.tencent.mm.sdk.platformtools.o4 r4 = com.tencent.mm.sdk.platformtools.o4.L()
            r4.A(r2, r0)
        L35:
            if (r0 == 0) goto L44
            goto L42
        L38:
            com.tencent.mm.sdk.platformtools.o4 r0 = com.tencent.mm.sdk.platformtools.o4.L()
            int r0 = r0.o(r2, r3)
            if (r0 == 0) goto L44
        L42:
            r0 = r1
            goto L45
        L44:
            r0 = r3
        L45:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[isAoaEnable] isEnable="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MM.Mig.RoamMigrationService"
            com.tencent.mars.xlog.Log.i(r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r5.f463695g = r1
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.h4.Di():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (com.tencent.mm.sdk.platformtools.o4.L().o("cross_near_migration_expt_val", 0) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r0 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Ni() {
        /*
            r5 = this;
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.n()
            r1 = 1
            java.lang.String r2 = "cross_near_migration_expt_val"
            r3 = 0
            if (r0 == 0) goto L2f
            j62.e r0 = j62.e.g()
            com.tencent.mm.repairer.config.migration.RepairerConfigEnableCrossNearMigration r4 = new com.tencent.mm.repairer.config.migration.RepairerConfigEnableCrossNearMigration
            r4.<init>()
            int r0 = r0.c(r4)
            com.tencent.mm.sdk.platformtools.o4 r4 = com.tencent.mm.sdk.platformtools.o4.L()
            int r4 = r4.o(r2, r3)
            if (r0 == r4) goto L2c
            com.tencent.mm.sdk.platformtools.o4 r4 = com.tencent.mm.sdk.platformtools.o4.L()
            r4.A(r2, r0)
        L2c:
            if (r0 == 0) goto L3a
            goto L3b
        L2f:
            com.tencent.mm.sdk.platformtools.o4 r0 = com.tencent.mm.sdk.platformtools.o4.L()
            int r0 = r0.o(r2, r3)
            if (r0 == 0) goto L3a
            goto L3b
        L3a:
            r1 = r3
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[isCrossNearEnable] isEnable="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MM.Mig.RoamMigrationService"
            com.tencent.mars.xlog.Log.i(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.h4.Ni():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (com.tencent.mm.sdk.platformtools.o4.L().o("clicfg_enable_multi_pipeline", 0) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r0 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Ri() {
        /*
            r5 = this;
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.n()
            r1 = 1
            java.lang.String r2 = "clicfg_enable_multi_pipeline"
            r3 = 0
            if (r0 == 0) goto L2f
            j62.e r0 = j62.e.g()
            com.tencent.mm.repairer.config.migration.RepairerConfigEnableMultiPipeline r4 = new com.tencent.mm.repairer.config.migration.RepairerConfigEnableMultiPipeline
            r4.<init>()
            int r0 = r0.c(r4)
            com.tencent.mm.sdk.platformtools.o4 r4 = com.tencent.mm.sdk.platformtools.o4.L()
            int r4 = r4.o(r2, r3)
            if (r0 == r4) goto L2c
            com.tencent.mm.sdk.platformtools.o4 r4 = com.tencent.mm.sdk.platformtools.o4.L()
            r4.A(r2, r0)
        L2c:
            if (r0 == 0) goto L3a
            goto L3b
        L2f:
            com.tencent.mm.sdk.platformtools.o4 r0 = com.tencent.mm.sdk.platformtools.o4.L()
            int r0 = r0.o(r2, r3)
            if (r0 == 0) goto L3a
            goto L3b
        L3a:
            r1 = r3
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[isMultiPipelineEnabled] isEnable="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MM.Mig.RoamMigrationService"
            com.tencent.mars.xlog.Log.i(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.h4.Ri():boolean");
    }

    public boolean Ui() {
        java.lang.Integer num = this.f463693e;
        if (num == null || num.intValue() != 1) {
            com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "Exp value of clicfg_enable_new_migration is 1");
            this.f463693e = 1;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r0 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (com.tencent.mm.sdk.platformtools.o4.L().o("new_migration_task_manage_expt_val", 0) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Vi() {
        /*
            r5 = this;
            java.lang.Boolean r0 = r5.f463696h
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            goto L5e
        L9:
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.n()
            r1 = 1
            java.lang.String r2 = "new_migration_task_manage_expt_val"
            r3 = 0
            if (r0 == 0) goto L38
            j62.e r0 = j62.e.g()
            com.tencent.mm.repairer.config.migration.RepairerConfigEnableNewMigrationTaskManage r4 = new com.tencent.mm.repairer.config.migration.RepairerConfigEnableNewMigrationTaskManage
            r4.<init>()
            int r0 = r0.c(r4)
            com.tencent.mm.sdk.platformtools.o4 r4 = com.tencent.mm.sdk.platformtools.o4.L()
            int r4 = r4.o(r2, r3)
            if (r0 == r4) goto L35
            com.tencent.mm.sdk.platformtools.o4 r4 = com.tencent.mm.sdk.platformtools.o4.L()
            r4.A(r2, r0)
        L35:
            if (r0 == 0) goto L44
            goto L42
        L38:
            com.tencent.mm.sdk.platformtools.o4 r0 = com.tencent.mm.sdk.platformtools.o4.L()
            int r0 = r0.o(r2, r3)
            if (r0 == 0) goto L44
        L42:
            r0 = r1
            goto L45
        L44:
            r0 = r3
        L45:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[isNewTaskManagementLogicEnable] isEnable="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MM.Mig.RoamMigrationService"
            com.tencent.mars.xlog.Log.i(r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r5.f463696h = r1
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.h4.Vi():boolean");
    }

    public boolean Zi() {
        if (!gm0.j1.b().n()) {
            throw new java.lang.IllegalArgumentException("[isPomEnable] Invalid user context.".toString());
        }
        java.lang.Integer num = this.f463694f;
        if (num == null || num.intValue() != 1) {
            com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "Exp value of clicfg_enable_pure_offline_migration is 1");
            this.f463694f = 1;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (com.tencent.mm.sdk.platformtools.o4.L().o("clicfg_migration_enable_verify_userdb", 0) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r0 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean aj() {
        /*
            r5 = this;
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.n()
            r1 = 1
            java.lang.String r2 = "clicfg_migration_enable_verify_userdb"
            r3 = 0
            if (r0 == 0) goto L2f
            j62.e r0 = j62.e.g()
            com.tencent.mm.repairer.config.migration.RepairerConfigEnableVerifyUserDB r4 = new com.tencent.mm.repairer.config.migration.RepairerConfigEnableVerifyUserDB
            r4.<init>()
            int r0 = r0.c(r4)
            com.tencent.mm.sdk.platformtools.o4 r4 = com.tencent.mm.sdk.platformtools.o4.L()
            int r4 = r4.o(r2, r3)
            if (r0 == r4) goto L2c
            com.tencent.mm.sdk.platformtools.o4 r4 = com.tencent.mm.sdk.platformtools.o4.L()
            r4.A(r2, r0)
        L2c:
            if (r0 == 0) goto L3a
            goto L3b
        L2f:
            com.tencent.mm.sdk.platformtools.o4 r0 = com.tencent.mm.sdk.platformtools.o4.L()
            int r0 = r0.o(r2, r3)
            if (r0 == 0) goto L3a
            goto L3b
        L3a:
            r1 = r3
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[isVerificationEnabled] isEnable="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MM.Mig.RoamMigrationService"
            com.tencent.mars.xlog.Log.i(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.h4.aj():boolean");
    }

    public void bj(android.content.Context context, com.tencent.mm.protobuf.f connectInfoResp, mv.a enterScene) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(connectInfoResp, "connectInfoResp");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        Ai(this, false, false, 3, null);
        bw5.bj0 i17 = yn1.z0.f463933a.i();
        com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "[notifyWithConnectInfo] status=" + i17);
        int ordinal = i17.ordinal();
        if (!(ordinal == 0 || ordinal == 3 || ordinal == 6 || ordinal == 14 || ordinal == 15)) {
            com.tencent.mars.xlog.Log.e("MM.Mig.RoamMigrationService", "[notifyWithConnectInfo] Intent denied with status=" + i17);
            return;
        }
        if (connectInfoResp instanceof bw5.ud0) {
            str = "pom";
        } else if (!(connectInfoResp instanceof bw5.s10)) {
            com.tencent.mars.xlog.Log.e("MM.Mig.RoamMigrationService", "[notifyWithConnectInfo] unknown resp type");
            return;
        } else {
            if (((bw5.s10) connectInfoResp).f32760r == 100 && i17 != bw5.bj0.NOTIFY_CODE_UI_WAIT_PC_RESP && i17 != bw5.bj0.NOTIFY_CODE_PAUSE) {
                com.tencent.mars.xlog.Log.e("MM.Mig.RoamMigrationService", "[notifyWithConnectInfo] Migration has cancelled by user");
                return;
            }
            str = "legacy";
        }
        java.util.HashMap i18 = kz5.c1.i(new jz5.l("action", "startWithConnectInfo"), new jz5.l("type", str), new jz5.l("respBuf", connectInfoResp.toByteArray()));
        mv.d0 d0Var = mv.d0.f331487e;
        Ai(this, false, false, 3, null);
        hj(context, d0Var, enterScene, i18);
        if (ih.a.b("clicfg_migration_check_db_size_enable", 0) == 0) {
            return;
        }
        pm0.v.K(null, yn1.c4.f463632d);
    }

    public void cj(android.content.Context context, mv.a enterScene) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        Ai(this, false, false, 3, null);
        bw5.bj0 i17 = yn1.z0.f463933a.i();
        com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "[openHome] status=" + i17);
        if (i17 == bw5.bj0.NOTIFY_CODE_NONE) {
            hj(context, mv.d0.f331488f, enterScene, null);
        } else {
            hj(context, mv.d0.f331487e, enterScene, null);
        }
    }

    public void fj(android.content.Context context) {
        boolean z17;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "openHomeAsGuest, CdnTransportFeatureService.getEngine()");
        if (yn1.z0.f463933a.m()) {
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            try {
                com.tencent.mm.modelcdntran.s1.cj();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MM.Mig.RoamMigrationService", e17, "get cdn engine failed", new java.lang.Object[0]);
                yn1.k4.e(1, false, 3, 0L, "get cdn engine failed", 10, null);
                z17 = true;
            }
        }
        z17 = false;
        wi(false, z17);
        com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "[openHome] status=" + yn1.z0.f463933a.i());
        hj(context, mv.d0.f331489g, mv.a.f331469e, null);
    }

    public final void hj(android.content.Context context, mv.d0 d0Var, mv.a aVar, java.util.Map map) {
        com.tencent.wechat.aff.migration.f.f217390b.m(aVar.f331476d);
        yn1.g4 g4Var = new yn1.g4(this, d0Var, map, context, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var == null || kotlinx.coroutines.l.d(c0Var, c0Var.f463621e, null, g4Var, 2, null) == null) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launchUI] Scope must be initialized", null);
            kotlinx.coroutines.p2.a(kotlinx.coroutines.v2.a(null, 1, null), null, 1, null);
        }
    }

    public void ij(android.content.Context context, bw5.zi0 errorCode, mv.a enterScene) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(errorCode, "errorCode");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "[showErrorDetailPage] errorCode=" + errorCode + ", enterScene=" + enterScene);
        Ai(this, false, false, 3, null);
        com.tencent.wechat.aff.migration.f fVar = com.tencent.wechat.aff.migration.f.f217390b;
        bw5.k0 c17 = fVar.c();
        bw5.q0 q0Var = c17.f29194i[2] ? c17.f29190e : new bw5.q0();
        if (q0Var.b() == bw5.bj0.NOTIFY_CODE_NONE || q0Var.b() == bw5.bj0.NOTIFY_CODE_UI_READY || q0Var.b() == bw5.bj0.NOTIFY_CODE_UI_IMMIGRATION_GUIDE || q0Var.b() == bw5.bj0.NOTIFY_CODE_UI_DIRECT_CONNECT_GUIDE) {
            q0Var.f31876d = bw5.bj0.NOTIFY_CODE_ERROR;
            boolean[] zArr = q0Var.f31880h;
            zArr[1] = true;
            q0Var.f31877e = java.lang.String.valueOf(errorCode.f36027d);
            zArr[2] = true;
            fVar.g(q0Var);
        }
        hj(context, mv.d0.f331487e, enterScene, null);
    }

    public void mj(android.content.Context context, java.lang.String deviceName, java.lang.String contactName, java.lang.String nickName, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(deviceName, "deviceName");
        kotlin.jvm.internal.o.g(contactName, "contactName");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "[showExportToPcOnDemand] deviceName=" + deviceName + ", contactName=" + contactName + ", nickName=" + nickName + ", createTime=" + j17);
        Ai(this, false, false, 3, null);
        bw5.bj0 i17 = yn1.z0.f463933a.i();
        if (i17 != bw5.bj0.NOTIFY_CODE_NONE) {
            com.tencent.mars.xlog.Log.w("MM.Mig.RoamMigrationService", "[showExportToPcOnDemand] status=" + i17);
            return;
        }
        bw5.x0 x0Var = new bw5.x0();
        x0Var.f34885d = deviceName;
        boolean[] zArr = x0Var.f34889h;
        zArr[1] = true;
        x0Var.f34887f = nickName;
        zArr[3] = true;
        x0Var.f34886e = contactName;
        zArr[2] = true;
        x0Var.f34888g = j17 / 1000;
        zArr[4] = true;
        hj(context, mv.d0.f331487e, mv.a.f331474m, kz5.c1.i(new jz5.l("action", "exportPcOnDemand"), new jz5.l("singleExportArgs", x0Var.toByteArray())));
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        java.lang.String k17 = gm0.j1.b().k();
        yn1.z0 z0Var = yn1.z0.f463933a;
        kotlin.jvm.internal.o.d(k17);
        if (z0Var.o(k17)) {
            com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "[MigrationService.onAccountInitialized] Nothing to do.");
            return;
        }
        if (z0Var.n()) {
            com.tencent.mars.xlog.Log.e("MM.Mig.RoamMigrationService", "[onAccountInitialized] Error: preUsername=" + z0Var.j() + ", currentUsername=" + k17);
            z0Var.t(Integer.MAX_VALUE);
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "[onAccountReleased] Uninitialize all if necessary.");
        yn1.z0.f463933a.t(Integer.MAX_VALUE);
    }

    public final void wi(boolean z17, boolean z18) {
        int i17;
        if (z17) {
            requireAccountInitialized();
            if (((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).n0()) {
                c01.w9.a();
            }
        }
        yn1.z0 z0Var = yn1.z0.f463933a;
        synchronized (z0Var) {
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[initialize] accountAware=" + z17 + ", instanceId=" + yn1.z0.f463935c);
            if (yn1.z0.f463935c != 0) {
                yn1.z0.f463935c++;
                return;
            }
            yn1.z0.f463935c++;
            if (z17) {
                java.lang.String k17 = gm0.j1.b().k();
                kotlin.jvm.internal.o.f(k17, "getUserName(...)");
                yn1.z0.f463947o = k17;
                java.lang.String o17 = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.q7.c("roam_backup"), "migration").o(), "cache").o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "[getCachePath] migrationCache=".concat(o17));
                if (!com.tencent.mm.vfs.w6.j(o17)) {
                    com.tencent.mm.vfs.w6.u(o17);
                }
                yn1.z0.f463946n = o17;
                i17 = gm0.j1.b().h();
            } else {
                yn1.z0.f463947o = "";
                java.lang.String o18 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.q7.c("po_migration"), "cache").o();
                kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
                com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "[getCachePath] migrationCache=".concat(o18));
                if (!com.tencent.mm.vfs.w6.j(o18)) {
                    com.tencent.mm.vfs.w6.u(o18);
                }
                yn1.z0.f463946n = o18;
                i17 = 0;
            }
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[initialize] username=" + z0Var.j() + ", path=" + z0Var.g());
            z0Var.e();
            boolean Vi = ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Vi();
            boolean Ri = ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ri();
            com.tencent.wechat.aff.migration.f fVar = com.tencent.wechat.aff.migration.f.f217390b;
            fVar.d(i17, z0Var.j(), z0Var.g(), Vi, Ri);
            fVar.l(((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).aj());
            yn1.z0.f463951s = z0Var.m();
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "isEnableCdnMigration = " + yn1.z0.f463951s + ", disableCdn = " + z18);
            if (yn1.z0.f463951s && !z18) {
                fVar.k(true);
                bw5.he0 f17 = z0Var.f();
                yn1.z0.f463945m = f17;
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "networkStatus = " + f17);
                fVar.n(f17);
            }
            byte[] bytes = (((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Di() ? "true" : "false").getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            fVar.b("expt_aoa", bytes);
            if (z17) {
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[initialize] init backup storage");
                yn1.z0.f463937e = true;
                tn1.f.f().c();
            }
            yn1.d0.f463635a.a();
            bw5.k0 c17 = fVar.c();
            bw5.q0 q0Var = c17.f29194i[2] ? c17.f29190e : new bw5.q0();
            kotlin.jvm.internal.o.f(q0Var, "getStatusModel(...)");
            yn1.z0.f463938f = q0Var;
            bw5.o0 o0Var = c17.f29194i[3] ? c17.f29191f : new bw5.o0();
            kotlin.jvm.internal.o.f(o0Var, "getProgressModel(...)");
            yn1.z0.f463939g = o0Var;
            bw5.p0 p0Var = c17.f29194i[1] ? c17.f29189d : new bw5.p0();
            kotlin.jvm.internal.o.f(p0Var, "getSceneModel(...)");
            yn1.z0.f463940h = p0Var;
            bw5.aj0 aj0Var = c17.f29194i[5] ? c17.f29193h : new bw5.aj0();
            kotlin.jvm.internal.o.f(aj0Var, "getRoamMigInfo(...)");
            yn1.z0.f463941i = aj0Var;
            yn1.z0.f463944l = "";
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(yn1.z0.f463952t);
            if (!((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Vi()) {
                ((kp.i1) z0Var.k()).hj();
            }
        }
    }
}
