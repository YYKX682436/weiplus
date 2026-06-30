package w11;

/* loaded from: classes12.dex */
public class z0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {
    public static boolean A = false;
    public static int B = 0;

    /* renamed from: z, reason: collision with root package name */
    public static int f442181z = 7;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f442182d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442183e;

    /* renamed from: f, reason: collision with root package name */
    public int f442184f;

    /* renamed from: g, reason: collision with root package name */
    public int f442185g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f442186h;

    /* renamed from: i, reason: collision with root package name */
    public w11.i2 f442187i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f442188m;

    /* renamed from: n, reason: collision with root package name */
    public final int f442189n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f442190o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f442191p;

    /* renamed from: q, reason: collision with root package name */
    public final fp.j f442192q;

    /* renamed from: r, reason: collision with root package name */
    public int f442193r;

    /* renamed from: s, reason: collision with root package name */
    public final long f442194s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f442195t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f442196u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f442197v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f442198w;

    /* renamed from: x, reason: collision with root package name */
    public o45.yh f442199x;

    /* renamed from: y, reason: collision with root package name */
    public long f442200y;

    public z0(int i17) {
        this.f442182d = "MicroMsg.NetSceneSync";
        this.f442184f = 0;
        this.f442185g = 0;
        this.f442186h = "";
        this.f442187i = null;
        this.f442188m = false;
        this.f442189n = 0;
        this.f442190o = null;
        this.f442191p = null;
        this.f442194s = -1L;
        this.f442195t = false;
        this.f442196u = false;
        this.f442197v = false;
        this.f442198w = "";
        this.f442199x = null;
        this.f442200y = 0L;
        java.lang.String str = "MicroMsg.NetSceneSync[" + hashCode() + "]";
        this.f442182d = str;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(str, "dkpush NetSceneSync scene:%d stack:%s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        this.f442198w = com.tencent.mm.sdk.platformtools.z3.a();
        this.f442192q = new fp.j();
        if (this.f442187i == null) {
            this.f442187i = new w11.i2();
        }
        this.f442187i.f442058a = i17;
        gm0.j1.i();
        if (gm0.j1.u() != null && gm0.j1.a()) {
            gm0.j1.i();
            if (gm0.j1.u().c() != null && !gm0.m.r()) {
                gm0.j1.i();
                long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) gm0.j1.u().c().l(8196, null), 0L);
                if (k17 != 0) {
                    gm0.j1.i();
                    gm0.j1.u().c().w(8196, 0L);
                    f442181z = ((int) (f442181z | k17)) & 95;
                }
            }
        }
        if (i17 == 1) {
            A = true;
        }
        if (i17 == 1010) {
            f442181z |= 16;
            A = true;
            this.f442193r = 7;
        } else if (i17 == 1011) {
            f442181z |= 64;
            A = true;
            this.f442193r = 7;
        } else if (i17 == 3) {
            f442181z |= 262144;
            A = true;
            this.f442193r = 3;
            com.tencent.mars.xlog.Log.i(str, "summerbadcr NetSceneSync aiScene[%d], selector[%d], syncScene[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(f442181z), java.lang.Integer.valueOf(this.f442193r));
        } else {
            this.f442193r = i17;
        }
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(99L, this.f442193r, 1L, false);
        fVar.idkeyStat(99L, 0L, 1L, false);
        fVar.idkeyStat(99L, z65.c.f470455a ? 241L : 242L, 1L, false);
        if (B == 0) {
            H();
        }
    }

    public final boolean H() {
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        gm0.j1.i();
        byte[] f17 = com.tencent.mm.booter.y1.f(pInt, gm0.j1.b().h());
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(pInt.value);
        objArr[1] = java.lang.Integer.valueOf(hashCode());
        objArr[2] = java.lang.Integer.valueOf(f17 != null ? f17.length : 0);
        java.lang.String str = this.f442182d;
        com.tencent.mars.xlog.Log.i(str, "dealWithRespData index:%d, hashcode:%d, buf.len:%d", objArr);
        int i17 = pInt.value;
        B = i17;
        if (i17 == 0 || com.tencent.mm.sdk.platformtools.t8.M0(f17)) {
            B = 0;
            return false;
        }
        o45.yh yhVar = new o45.yh();
        try {
            yhVar.fromProtoBuf(f17);
            this.f442191p = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new w11.w0(this, new w11.y0(yhVar)), false);
            return true;
        } catch (java.lang.Error unused) {
            long freeMemory = java.lang.Runtime.getRuntime().freeMemory() / 1000;
            long j17 = java.lang.Runtime.getRuntime().totalMemory() / 1000;
            com.tencent.mars.xlog.Log.i(str, "dealWithRespData memoryInfo avail/total, dalvik[%dk, %dk, user:%dk]", java.lang.Long.valueOf(freeMemory), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j17 - freeMemory));
            iz5.a.g("dealWithRespData error", false);
            return false;
        } catch (java.lang.Exception unused2) {
            jx3.f.INSTANCE.idkeyStat(99L, 226L, 1L, false);
            com.tencent.mars.xlog.Log.e(str, "dealWithRespData SyncResp fromProtoBuf failed");
            int i18 = B;
            gm0.j1.i();
            com.tencent.mm.booter.y1.b(i18, gm0.j1.b().h());
            B = 0;
            return false;
        }
    }

    public void I(o45.yh yhVar) {
        w11.b2 b2Var = w11.c2.f441991a;
        b2Var.d(x51.j1.d(yhVar.f343039a.f373761g), true);
        gm0.j1.i();
        gm0.j1.u().c().w(8196, java.lang.Long.valueOf(yhVar.f343039a.f373760f));
        boolean z17 = ((yhVar.f343039a.f373760f & f442181z) == 0 || super.securityLimitCountReach()) ? false : true;
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(yhVar.f343039a.f373760f), java.lang.Integer.valueOf(f442181z), java.lang.Boolean.valueOf(super.securityLimitCountReach())};
        java.lang.String str = this.f442182d;
        com.tencent.mars.xlog.Log.i(str, "canContinue cont:%b ContinueFlag:%d selector:%d securityLimitCountReach:%b", objArr);
        if (!z17 && (yhVar.f343039a.f373760f & 256) != 0) {
            com.tencent.mm.autogen.events.SnsSyncEvent snsSyncEvent = new com.tencent.mm.autogen.events.SnsSyncEvent();
            snsSyncEvent.f54843g.f8611a = 1;
            snsSyncEvent.e();
        }
        if (!z17 && (yhVar.f343039a.f373760f & 2097152) != 0) {
            new com.tencent.mm.autogen.events.OpenIMSyncEvent().e();
        }
        if (!z17 && (yhVar.f343039a.f373760f & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0) {
            new com.tencent.mm.autogen.events.FinderSyncEvent().e();
        }
        if (!z17 && (yhVar.f343039a.f373760f & 32) != 0) {
            new com.tencent.mm.autogen.events.BypNewSyncEvent().e();
        }
        jx3.f.INSTANCE.idkeyStat(99L, z17 ? 234L : 235L, 1L, false);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(yhVar.f343039a.f373760f);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(this.f442195t);
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(A);
        int i17 = this.f442189n;
        com.tencent.mars.xlog.Log.i(str, "onRespHandled continueFlag:%d isNotifyData:%b conCont:%b notifyPending:%b pushSyncFlag:%d isContinueScene:%b respHandler:%s ", valueOf, valueOf2, valueOf3, valueOf4, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f442196u), this.f442191p);
        if (!this.f442195t && z17) {
            this.f442196u = true;
            doScene(dispatcher(), this.f442183e);
            return;
        }
        if (A) {
            com.tencent.mars.xlog.Log.i(str, "dkpush new notify pending, sync now");
            int i18 = B;
            if (i18 != 0) {
                gm0.j1.i();
                com.tencent.mm.booter.y1.b(i18, gm0.j1.b().h());
            }
            B = 0;
            this.f442191p = null;
            A = false;
            this.f442196u = true;
            doScene(dispatcher(), this.f442183e);
            return;
        }
        if (this.f442191p == null) {
            if ((i17 & 1) > 0) {
                gm0.j1.d().g(new w11.n0(this.f442194s, b2Var.a()));
            }
            f442181z = 7;
            this.f442183e.onSceneEnd(this.f442184f, this.f442185g, this.f442186h, this);
            return;
        }
        int i19 = B;
        gm0.j1.i();
        com.tencent.mm.booter.y1.b(i19, gm0.j1.b().h());
        this.f442191p = null;
        H();
        doScene(dispatcher(), this.f442183e);
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean accept(com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof w11.z0)) {
            return false;
        }
        w11.z0 z0Var = (w11.z0) m1Var;
        if (z0Var.f442188m || !A) {
            return false;
        }
        java.lang.Object[] objArr = {java.lang.Long.valueOf(z0Var.lastdispatch)};
        java.lang.String str = this.f442182d;
        com.tencent.mars.xlog.Log.e(str, "old not busy and notified, maybe cancel old scene, last dispatch=%d", objArr);
        long j17 = z0Var.lastdispatch;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        boolean z18 = android.os.SystemClock.elapsedRealtime() - j17 > 360000;
        if (z18) {
            com.tencent.mars.xlog.Log.i(str, "summerworker NetSceneSync timeout");
            android.os.Message runningMessage = gm0.j1.e().d().getRunningMessage();
            if ((runningMessage == null ? null : runningMessage.getCallback()) != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("summerworker worker is just blocked by task: ");
                android.os.Message runningMessage2 = gm0.j1.e().d().getRunningMessage();
                sb6.append(runningMessage2 != null ? runningMessage2.toString() : null);
                com.tencent.mars.xlog.Log.e(str, sb6.toString());
                return false;
            }
        }
        return z18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        super.cancel();
        jx3.f.INSTANCE.idkeyStat(99L, 229L, 1L, false);
        this.f442197v = true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        boolean b17 = w11.a1.b();
        java.lang.String str = this.f442182d;
        if (b17) {
            B = 0;
            com.tencent.mars.xlog.Log.e(str, "dkinit never do sync before init done");
            return -1;
        }
        this.f442183e = u0Var;
        if (this.f442187i == null) {
            this.f442187i = new w11.i2();
        }
        this.f442187i.getClass();
        if (this.f442191p != null) {
            com.tencent.mars.xlog.Log.i(str, "pushSyncRespHandler not null");
            prepareDispatcher(sVar);
            this.f442191p.c(0L, 0L);
            return 0;
        }
        int i17 = B;
        if (i17 > 0) {
            com.tencent.mars.xlog.Log.w(str, "other sync is dealing with resp data :%d", java.lang.Integer.valueOf(i17));
            return -1;
        }
        if (this.f442190o != null) {
            com.tencent.mars.xlog.Log.i(str, "pusher not null");
            prepareDispatcher(sVar);
            this.f442190o.c(0L, 0L);
            return 0;
        }
        w11.y0 y0Var = new w11.y0(false);
        r45.dw4 dw4Var = ((o45.xh) y0Var.getReqObj()).f343036a;
        int i18 = this.f442193r;
        if (i18 == 3) {
            dw4Var.f372782i = 1;
        } else {
            dw4Var.f372782i = 0;
        }
        if (this.f442196u) {
            i18 = 6;
        }
        this.f442193r = i18;
        dw4Var.f372778e = f442181z;
        byte[] a17 = w11.c2.f441991a.a();
        dw4Var.f372779f = x51.j1.a(a17);
        dw4Var.f372780g = this.f442193r;
        dw4Var.f372777d = new r45.c50();
        int i19 = o45.wf.f343023a;
        dw4Var.f372781h = wo.q.f447780a;
        int wi6 = ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi();
        if (wi6 != 0) {
            dw4Var.f372784n = wi6;
        }
        com.tencent.mars.xlog.Log.i(str, "doScene Selector:%d Scene:%d key[%s], SyncFlag[%d]", java.lang.Integer.valueOf(dw4Var.f372778e), java.lang.Integer.valueOf(dw4Var.f372780g), o45.qi.d(a17), java.lang.Integer.valueOf(wi6));
        A = false;
        w11.i2 i2Var = this.f442187i;
        int i27 = i2Var != null ? i2Var.f442058a : 0;
        int i28 = f442181z;
        boolean z17 = mm.w.f328542a;
        mm.w.d("MicroMsg.NotifyPowerInspector", "netSync: scene=" + i27 + ", selector=0x" + java.lang.Integer.toBinaryString(i27));
        if (com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            java.lang.String str2 = i27 + "-" + java.lang.Integer.toBinaryString(i28);
            mm.y yVar = mm.w.f328548g;
            if (yVar.b() || !mm.w.f328543b) {
                yVar.c(str2);
            }
        }
        return dispatch(sVar, y0Var, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 138;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e3  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r26, int r27, int r28, java.lang.String r29, com.tencent.mm.network.v0 r30, byte[] r31) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w11.z0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 100;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean securityLimitCountReach() {
        boolean securityLimitCountReach = super.securityLimitCountReach();
        if (securityLimitCountReach) {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(99L, 228L, 1L, false);
            java.lang.Object[] objArr = new java.lang.Object[9];
            objArr[0] = 0;
            objArr[1] = 0;
            objArr[2] = 0;
            objArr[3] = 0;
            objArr[4] = 0;
            objArr[5] = 0;
            objArr[6] = 0;
            objArr[7] = java.lang.Integer.valueOf(z65.c.f470455a ? 1 : 2);
            objArr[8] = "9999";
            fVar.d(12063, objArr);
        }
        return securityLimitCountReach;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean uniqueInNetsceneQueue() {
        return true;
    }

    public z0(o45.yh yhVar, int i17, long j17) {
        this(8);
        this.f442198w = com.tencent.mm.sdk.platformtools.z3.a();
        com.tencent.mars.xlog.Log.i(this.f442182d, "dkpush NOTIFYDATA resp size:%d pushSyncFlag:%d  recvTime:%d", java.lang.Long.valueOf(yhVar.getBufferSize()), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        this.f442189n = i17;
        this.f442194s = j17;
        this.f442190o = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new w11.v0(this, yhVar), false);
        if (B == 0) {
            H();
        }
    }
}
