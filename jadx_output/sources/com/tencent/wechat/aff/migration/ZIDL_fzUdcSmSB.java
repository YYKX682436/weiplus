package com.tencent.wechat.aff.migration;

/* loaded from: classes11.dex */
class ZIDL_fzUdcSmSB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.migration.g {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.migration.h f217383a;

    private native void ZIDL_AX(long j17, long j18, int i17, int i18, byte[] bArr, byte[] bArr2, int i19);

    private native void ZIDL_BX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_CX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_EX(long j17, long j18, boolean z17);

    private native void ZIDL_HBX(long j17, long j18, boolean z17);

    private native void ZIDL_IX(long j17, long j18, byte[] bArr);

    private native void ZIDL_JBI(long j17);

    private native void ZIDL_JX(long j17, long j18, int i17, int i18, int i19, int i27);

    private native void ZIDL_KBX(long j17, long j18, boolean z17);

    private native void ZIDL_KX(long j17, long j18, byte[] bArr);

    private native void ZIDL_LBI(long j17, byte[] bArr, byte[] bArr2, int i17);

    private native void ZIDL_MBI(long j17, byte[] bArr, int i17, byte[] bArr2);

    private native void ZIDL_NBI(long j17, byte[] bArr);

    private native void ZIDL_NX(long j17, long j18, boolean z17);

    private native void ZIDL_OBI(long j17, byte[] bArr);

    private native void ZIDL_OX(long j17, long j18, byte[] bArr);

    private native void ZIDL_PBI(long j17);

    private native void ZIDL_PX(long j17, long j18);

    private native void ZIDL_QBI(long j17);

    private native void ZIDL_QX(long j17, long j18, byte[] bArr, byte[] bArr2);

    private native void ZIDL_RX(long j17, long j18, boolean z17);

    private native void ZIDL_SX(long j17, long j18, boolean z17, byte[] bArr);

    private native void ZIDL_TX(long j17, long j18);

    private native void ZIDL_UX(long j17, long j18, boolean z17);

    private native void ZIDL_VX(long j17, long j18);

    private native void ZIDL_WX(long j17, long j18, boolean z17);

    private native void ZIDL_XX(long j17, long j18, boolean z17);

    private native void ZIDL_YX(long j17, long j18, boolean z17);

    private native void ZIDL_ZX(long j17, long j18, boolean z17);

    @Override // com.tencent.wechat.aff.migration.g
    public void A(java.lang.String str) {
        ZIDL_NBI(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void C(long j17, boolean z17) {
        ZIDL_YX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void G(long j17, boolean z17) {
        ZIDL_XX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void J(java.lang.String str) {
        ZIDL_OBI(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void K(long j17, java.lang.String str) {
        ZIDL_OX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void K0(long j17, int i17, int i18, java.lang.String str, byte[] bArr, int i19) {
        ZIDL_AX(this.nativeHandler, j17, i17, i18, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), bArr, i19);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void L(long j17, boolean z17) {
        ZIDL_EX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void O() {
        ZIDL_JBI(this.nativeHandler);
    }

    public void Q1(long j17, boolean z17) {
        ZIDL_NX(this.nativeHandler, j17, z17);
    }

    public void R1(long j17, boolean z17) {
        ZIDL_KBX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void S(long j17, java.util.ArrayList arrayList) {
        ZIDL_CX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }

    public void S1(long j17) {
        ZIDL_TX(this.nativeHandler, j17);
    }

    public void T1(long j17) {
        ZIDL_VX(this.nativeHandler, j17);
    }

    public boolean ZIDL_AB() {
        this.f217383a.getClass();
        return true;
    }

    public void ZIDL_AV(long j17, int i17, byte[] bArr, byte[] reqBuf, byte[] bArr2) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.h hVar = this.f217383a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yn1.r2 r2Var2 = (yn1.r2) hVar;
        r2Var2.getClass();
        kotlin.jvm.internal.o.g(reqBuf, "reqBuf");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doOfflineCgiAsync] taskId=");
        sb6.append(j17);
        sb6.append(", funcId=");
        sb6.append(i17);
        sb6.append(", uri=");
        sb6.append(str);
        sb6.append(", reqBuf=");
        sb6.append(reqBuf.length);
        sb6.append(", extra=");
        sb6.append(bArr2 != null ? java.lang.Integer.valueOf(bArr2.length) : null);
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", sb6.toString());
        yn1.s1 s1Var = new yn1.s1(i17, reqBuf, bArr2, str, r2Var2, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(s1Var);
        } else {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.t1(i17, r2Var2, j17));
    }

    public void ZIDL_BB(byte[] bArr) {
        yn1.r2 r2Var = (yn1.r2) this.f217383a;
        r2Var.getClass();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[setBLEAuthKey]");
        r2Var.f463812c = bArr;
    }

    public void ZIDL_BV(long j17, long j18, long j19, boolean z17) {
        kotlinx.coroutines.r2 r2Var;
        yn1.r2 r2Var2 = (yn1.r2) this.f217383a;
        r2Var2.getClass();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[getAllConversationAsync] taskId=" + j17 + ", start=" + j18 + ", end=" + j19 + ", excludeMedia=" + z17);
        yn1.u1 u1Var = new yn1.u1(j19, j18, z17, r2Var2, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(u1Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.v1(r2Var2, j17));
    }

    public void ZIDL_CB() {
        yn1.r2 r2Var = (yn1.r2) this.f217383a;
        r2Var.getClass();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[cleanupBLE]");
        java.util.Set set = com.tencent.mm.plugin.backup.ble.BluetoothStateReceiver.f92539a;
        yn1.d1 listener = r2Var.f463813d;
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.plugin.backup.ble.BluetoothStateReceiver.f92539a.remove(listener);
        r2Var.a().c();
    }

    public void ZIDL_CV(long j17, long j18, long j19, boolean z17, byte[][] bArr) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.h hVar = this.f217383a;
        java.util.ArrayList<java.lang.String> userName = com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(bArr);
        yn1.r2 r2Var2 = (yn1.r2) hVar;
        r2Var2.getClass();
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[getAllConversationForUserNameAsync] taskId=" + j17 + ", start=" + j18 + ", end=" + j19 + ", excludeMedia=" + z17 + ", userName=" + userName);
        yn1.w1 w1Var = new yn1.w1(j19, j18, z17, userName, r2Var2, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(w1Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.x1(r2Var2, j17));
    }

    public void ZIDL_D(int i17, byte[] bArr) {
        int i18;
        jz5.l lVar;
        com.tencent.wechat.aff.migration.h hVar = this.f217383a;
        bw5.n0 notify = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? null : bw5.n0.NOTIFY_SINGLE_EXPORT_TO_PC : bw5.n0.NOTIFY_MIG_PAUSE : bw5.n0.NOTIFY_MIG_CLOSE : bw5.n0.NOTIFY_MIG_TO_MOBILE : bw5.n0.NOTIFY_MIG_TO_PC;
        ((yn1.r2) hVar).getClass();
        kotlin.jvm.internal.o.g(notify, "notify");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notifyToPc] notify=");
        sb6.append(notify);
        sb6.append(", argBuf.size=");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", sb6.toString());
        int ordinal = notify.ordinal();
        if (ordinal == 0) {
            java.lang.String b17 = yn1.k4.b();
            com.tencent.mm.modelsimple.g1.K("weixin", 17, "local_ip", b17 != null ? b17 : "");
            return;
        }
        if (ordinal == 1) {
            i18 = 18;
        } else if (ordinal == 2) {
            i18 = 19;
        } else {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    throw new jz5.j();
                }
                java.lang.String b18 = yn1.k4.b();
                if (bArr == null || bArr.length == 0) {
                    com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "argBuf is null or empty");
                    lVar = new jz5.l("local_ip", b18 != null ? b18 : "");
                } else {
                    cl0.g gVar = new cl0.g();
                    bw5.x0 parseFrom = new bw5.x0().parseFrom(bArr);
                    if (b18 == null) {
                        b18 = "";
                    }
                    gVar.h("local_ip", b18);
                    gVar.h("deviceName", parseFrom.f34889h[1] ? parseFrom.f34885d : "");
                    boolean[] zArr = parseFrom.f34889h;
                    gVar.h("contactName", zArr[2] ? parseFrom.f34886e : "");
                    gVar.h("nickName", zArr[3] ? parseFrom.f34887f : "");
                    gVar.p("createTime", parseFrom.f34888g);
                    gVar.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 102);
                    lVar = new jz5.l("startExportToPC", gVar.toString());
                }
                com.tencent.mm.modelsimple.g1.K("weixin", 17, (java.lang.String) lVar.f302833d, (java.lang.String) lVar.f302834e);
                return;
            }
            i18 = 20;
        }
        com.tencent.mm.modelsimple.g1.K("weixin", i18, "", "");
    }

    public byte[] ZIDL_DB() {
        this.f217383a.getClass();
        return "".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public byte[] ZIDL_EB() {
        ((yn1.r2) this.f217383a).getClass();
        return yn1.k4.a().getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public void ZIDL_EV(long j17) {
        kotlinx.coroutines.r2 r2Var;
        yn1.r2 r2Var2 = (yn1.r2) this.f217383a;
        r2Var2.getClass();
        yn1.e2 e2Var = new yn1.e2(r2Var2, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(e2Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.f2(r2Var2, j17));
    }

    public boolean ZIDL_F() {
        ((yn1.r2) this.f217383a).getClass();
        return c01.z1.x();
    }

    public boolean ZIDL_FB() {
        return ((yn1.r2) this.f217383a).b();
    }

    public boolean ZIDL_G() {
        ((yn1.r2) this.f217383a).getClass();
        boolean z17 = yn1.z0.f463943k != null;
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "isLogout=" + z17);
        return z17;
    }

    public boolean ZIDL_GB() {
        if (!((yn1.r2) this.f217383a).b()) {
            return false;
        }
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("bluetooth");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        android.bluetooth.BluetoothAdapter adapter = ((android.bluetooth.BluetoothManager) systemService).getAdapter();
        if (adapter == null) {
            return false;
        }
        return adapter.isEnabled();
    }

    public byte[] ZIDL_H(byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.migration.h hVar = this.f217383a;
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((yn1.r2) hVar).getClass();
        return new byte[0];
    }

    public void ZIDL_HBV(long j17) {
        yn1.r2 r2Var = (yn1.r2) this.f217383a;
        r2Var.getClass();
        yn1.i2 i2Var = new yn1.i2(r2Var, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            c0Var.a(i2Var);
            return;
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
        kotlinx.coroutines.p2.a(kotlinx.coroutines.v2.a(null, 1, null), null, 1, null);
    }

    public void ZIDL_IB(boolean z17) {
        kotlinx.coroutines.r2 a17;
        yn1.r2 r2Var = (yn1.r2) this.f217383a;
        r2Var.getClass();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[toggleFlutterPage] isEnter=" + z17);
        kotlinx.coroutines.r2 r2Var2 = r2Var.f463811b;
        kotlinx.coroutines.r2 r2Var3 = null;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        if (z17) {
            yn1.q2 q2Var = new yn1.q2(r2Var, null);
            yn1.c0 c0Var = yn1.d0.f463636b;
            if (c0Var != null) {
                a17 = c0Var.a(q2Var);
            } else {
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
                a17 = kotlinx.coroutines.v2.a(null, 1, null);
                kotlinx.coroutines.p2.a(a17, null, 1, null);
            }
            r2Var3 = a17;
        }
        r2Var.f463811b = r2Var3;
    }

    public void ZIDL_IV(long j17, byte[] bArr, byte[] rpcReq) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.h hVar = this.f217383a;
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yn1.r2 r2Var2 = (yn1.r2) hVar;
        r2Var2.getClass();
        kotlin.jvm.internal.o.g(rpcReq, "rpcReq");
        yn1.g1 g1Var = new yn1.g1(r2Var2, j17, rpcReq, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(g1Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.h1(r2Var2, j17));
    }

    public void ZIDL_JV(long j17) {
        kotlinx.coroutines.r2 r2Var;
        yn1.r2 r2Var2 = (yn1.r2) this.f217383a;
        r2Var2.getClass();
        yn1.a2 a2Var = new yn1.a2(r2Var2, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(a2Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.b2(r2Var2, j17));
    }

    public void ZIDL_KBV(long j17) {
        com.tencent.wechat.aff.migration.g gVar = ((yn1.r2) this.f217383a).f463810a;
        if (gVar != null) {
            ((com.tencent.wechat.aff.migration.ZIDL_fzUdcSmSB) gVar).R1(j17, false);
        } else {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
    }

    public void ZIDL_KV(long j17) {
        kotlinx.coroutines.r2 r2Var;
        yn1.r2 r2Var2 = (yn1.r2) this.f217383a;
        r2Var2.getClass();
        yn1.y1 y1Var = new yn1.y1(r2Var2, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(y1Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.z1(r2Var2, j17));
    }

    public boolean ZIDL_L() {
        ((yn1.r2) this.f217383a).getClass();
        return ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ni();
    }

    public boolean ZIDL_M() {
        ((yn1.r2) this.f217383a).getClass();
        return ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Vi();
    }

    public void ZIDL_NV(long j17) {
        com.tencent.wechat.aff.migration.g gVar = ((yn1.r2) this.f217383a).f463810a;
        if (gVar != null) {
            ((com.tencent.wechat.aff.migration.ZIDL_fzUdcSmSB) gVar).Q1(j17, true);
        } else {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
    }

    public void ZIDL_OV(long j17) {
        kotlinx.coroutines.r2 r2Var;
        yn1.r2 r2Var2 = (yn1.r2) this.f217383a;
        r2Var2.getClass();
        yn1.c2 c2Var = new yn1.c2(r2Var2, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(c2Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.d2(r2Var2, j17));
    }

    public void ZIDL_PV(long j17) {
        ((yn1.r2) this.f217383a).getClass();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[startDeviceDiscoveryAsync] taskId=" + j17);
    }

    public void ZIDL_QV(long j17) {
        kotlinx.coroutines.r2 r2Var;
        yn1.r2 r2Var2 = (yn1.r2) this.f217383a;
        r2Var2.getClass();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[createGroupAsync] taskId=" + j17);
        yn1.m1 m1Var = new yn1.m1(r2Var2, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(m1Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.n1(r2Var2, j17));
    }

    public void ZIDL_RV(long j17, byte[] bArr, byte[] bArr2) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.h hVar = this.f217383a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        yn1.r2 r2Var2 = (yn1.r2) hVar;
        r2Var2.getClass();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[connectAsync] taskId=" + j17 + ", networkName=" + str + ", passphrase=" + str2);
        yn1.k1 k1Var = new yn1.k1(str, str2, r2Var2, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(k1Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.l1(r2Var2, j17));
    }

    public void ZIDL_SV(long j17) {
        kotlinx.coroutines.r2 r2Var;
        yn1.r2 r2Var2 = (yn1.r2) this.f217383a;
        r2Var2.getClass();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[startBLEAdvertisingAsync] taskId=" + j17);
        yn1.l2 l2Var = new yn1.l2(r2Var2, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(l2Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.m2(r2Var2, j17));
    }

    public void ZIDL_TV(long j17) {
        yn1.r2 r2Var = (yn1.r2) this.f217383a;
        r2Var.getClass();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[stopBLEAdvertising]");
        try {
            r2Var.a().i();
            com.tencent.wechat.aff.migration.g gVar = r2Var.f463810a;
            if (gVar != null) {
                ((com.tencent.wechat.aff.migration.ZIDL_fzUdcSmSB) gVar).S1(j17);
            } else {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "[stopBLEAdvertising] error", e17);
        }
    }

    public void ZIDL_UV(long j17, byte[] bArr) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.h hVar = this.f217383a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yn1.r2 r2Var2 = (yn1.r2) hVar;
        r2Var2.getClass();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[startBLEScanningAsync] taskId=" + j17);
        java.util.Set set = com.tencent.mm.plugin.backup.ble.BluetoothStateReceiver.f92539a;
        yn1.d1 listener = r2Var2.f463813d;
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.plugin.backup.ble.BluetoothStateReceiver.f92539a.add(listener);
        yn1.n2 n2Var = new yn1.n2(r2Var2, str, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(n2Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.o2(r2Var2, j17));
    }

    public void ZIDL_VV(long j17) {
        yn1.r2 r2Var = (yn1.r2) this.f217383a;
        r2Var.getClass();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[stopBLEScanning]");
        try {
            r2Var.a().j();
            com.tencent.wechat.aff.migration.g gVar = r2Var.f463810a;
            if (gVar != null) {
                ((com.tencent.wechat.aff.migration.ZIDL_fzUdcSmSB) gVar).T1(j17);
            } else {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "[stopBLEScanning] error", e17);
        }
    }

    public void ZIDL_WV(long j17, byte[] bArr, int i17, byte[] data) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.h hVar = this.f217383a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yn1.r2 r2Var2 = (yn1.r2) hVar;
        r2Var2.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[sendBLEMessageAsync] taskId=" + j17 + ", deviceId=" + str + ", dataLength=" + data.length);
        if (r2Var2.f463812c == null) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "[BLE] bleAuthKey is null");
            com.tencent.wechat.aff.migration.g gVar = r2Var2.f463810a;
            if (gVar != null) {
                ((com.tencent.wechat.aff.migration.ZIDL_fzUdcSmSB) gVar).r(j17, false);
                return;
            } else {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
        }
        yn1.j2 j2Var = new yn1.j2(r2Var2, data, i17, str, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(j2Var);
        } else {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.k2(r2Var2, j17));
    }

    public void ZIDL_XV(long j17, int i17, byte[] data) {
        kotlinx.coroutines.r2 r2Var;
        yn1.r2 r2Var2 = (yn1.r2) this.f217383a;
        r2Var2.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[broadcastBLEMessageAsync] taskId=" + j17 + ", dataLength=" + data.length);
        if (r2Var2.f463812c == null) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "[BLE] bleAuthKey is null");
            com.tencent.wechat.aff.migration.g gVar = r2Var2.f463810a;
            if (gVar != null) {
                ((com.tencent.wechat.aff.migration.ZIDL_fzUdcSmSB) gVar).r(j17, false);
                return;
            } else {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
        }
        yn1.e1 e1Var = new yn1.e1(r2Var2, data, i17, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(e1Var);
        } else {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.f1(r2Var2, j17));
    }

    public void ZIDL_YV(long j17, byte[] bArr) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.h hVar = this.f217383a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yn1.r2 r2Var2 = (yn1.r2) hVar;
        r2Var2.getClass();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[connectBLEDeviceAsync] taskId=" + j17 + ", deviceId=" + str);
        yn1.i1 i1Var = new yn1.i1(r2Var2, str, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(i1Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.j1(r2Var2, j17));
    }

    public void ZIDL_ZV(long j17, byte[] bArr) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.h hVar = this.f217383a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yn1.r2 r2Var2 = (yn1.r2) hVar;
        r2Var2.getClass();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[disconnectBLEDeviceAsync] taskId=" + j17 + ", deviceId=" + str);
        yn1.o1 o1Var = new yn1.o1(r2Var2, str, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(o1Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.p1(r2Var2, j17));
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void a0(long j17, boolean z17) {
        ZIDL_RX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void a1(long j17, byte[] bArr) {
        ZIDL_IX(this.nativeHandler, j17, bArr);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.migration.h hVar = (com.tencent.wechat.aff.migration.h) obj;
        this.f217383a = hVar;
        yn1.r2 r2Var = (yn1.r2) hVar;
        r2Var.getClass();
        r2Var.f463810a = this;
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void d(java.lang.String str, int i17, byte[] bArr) {
        ZIDL_MBI(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, bArr);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void d1(long j17, java.util.ArrayList arrayList) {
        ZIDL_BX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void g1(long j17, java.lang.String str) {
        ZIDL_KX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void i(long j17, boolean z17) {
        ZIDL_ZX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void i1(long j17, java.lang.String str, java.lang.String str2) {
        ZIDL_QX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void j1(long j17, int i17, int i18, int i19, int i27) {
        ZIDL_JX(this.nativeHandler, j17, i17, i18, i19, i27);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void k(long j17, boolean z17, java.lang.String str) {
        ZIDL_SX(this.nativeHandler, j17, z17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void p() {
        ZIDL_PBI(this.nativeHandler);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void r(long j17, boolean z17) {
        ZIDL_WX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void s1(long j17, boolean z17) {
        ZIDL_HBX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void t() {
        ZIDL_QBI(this.nativeHandler);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void w(java.lang.String str, java.lang.String str2, int i17) {
        ZIDL_LBI(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17);
    }

    @Override // com.tencent.wechat.aff.migration.g
    public void x(long j17, boolean z17) {
        ZIDL_UX(this.nativeHandler, j17, z17);
    }
}
