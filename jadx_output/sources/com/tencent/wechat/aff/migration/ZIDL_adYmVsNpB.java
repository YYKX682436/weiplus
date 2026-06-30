package com.tencent.wechat.aff.migration;

/* loaded from: classes11.dex */
class ZIDL_adYmVsNpB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.migration.a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.migration.b f217382a;

    private native void ZIDL_AX(long j17, long j18, boolean z17, long j19, byte[] bArr);

    private native void ZIDL_BX(long j17, long j18);

    private native void ZIDL_CBI(long j17, byte[] bArr, byte[] bArr2, int i17);

    private native void ZIDL_CX(long j17, long j18, long j19, byte[][] bArr);

    private native void ZIDL_DBI(long j17, byte[] bArr, int i17, byte[] bArr2);

    private native void ZIDL_DX(long j17, long j18, int i17);

    private native void ZIDL_EBI(long j17, byte[] bArr);

    private native void ZIDL_EX(long j17, long j18, boolean z17);

    private native void ZIDL_FBI(long j17, byte[] bArr);

    private native void ZIDL_FX(long j17, long j18, int i17);

    private native void ZIDL_GBI(long j17);

    private native void ZIDL_HBI(long j17);

    private native void ZIDL_MX(long j17, long j18, byte[] bArr);

    private native void ZIDL_QX(long j17, long j18, boolean z17);

    private native void ZIDL_RX(long j17, long j18, boolean z17, byte[] bArr);

    private native void ZIDL_SX(long j17, long j18);

    private native void ZIDL_TX(long j17, long j18, boolean z17);

    private native void ZIDL_UX(long j17, long j18);

    private native void ZIDL_VX(long j17, long j18, boolean z17);

    private native void ZIDL_WX(long j17, long j18, boolean z17);

    private native void ZIDL_XX(long j17, long j18, boolean z17);

    private native void ZIDL_YX(long j17, long j18, boolean z17);

    @Override // com.tencent.wechat.aff.migration.a
    public void A(java.lang.String str) {
        ZIDL_EBI(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void C(long j17, boolean z17) {
        ZIDL_XX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void G(long j17, boolean z17) {
        ZIDL_WX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void J(java.lang.String str) {
        ZIDL_FBI(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void K(long j17, java.lang.String str) {
        ZIDL_MX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void M1(long j17, bw5.h0 h0Var) {
        ZIDL_DX(this.nativeHandler, j17, h0Var.f28037d);
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void Q0(long j17, boolean z17) {
        ZIDL_EX(this.nativeHandler, j17, z17);
    }

    public void Q1(long j17, int i17) {
        ZIDL_FX(this.nativeHandler, j17, i17);
    }

    public void R1(long j17) {
        ZIDL_SX(this.nativeHandler, j17);
    }

    public void S1(long j17) {
        ZIDL_UX(this.nativeHandler, j17);
    }

    public void ZIDL_AB(byte[] bArr) {
        yn1.a4 a4Var = (yn1.a4) this.f217382a;
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[setBLEAuthKey]");
        a4Var.f463610e = bArr;
    }

    public void ZIDL_AV(long j17, long j18, byte[] bArr, long j19, long j27, long j28, int i17, boolean z17) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.b bVar = this.f217382a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yn1.a4 a4Var = (yn1.a4) bVar;
        a4Var.getClass();
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[getChatPackageAsync] taskId=" + j17 + ", convId=" + str + ", from=" + j19 + ", to=" + j27 + ", offset=" + j28 + ", textOnly=" + z17);
        yn1.e3 e3Var = new yn1.e3(j19, j27, a4Var, j17, j28, z17, str, j18, i17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(e3Var);
        } else {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.f3(a4Var, j17, j28));
    }

    public void ZIDL_BB() {
        yn1.a4 a4Var = (yn1.a4) this.f217382a;
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[cleanupBLE]");
        java.util.Set set = com.tencent.mm.plugin.backup.ble.BluetoothStateReceiver.f92539a;
        yn1.u2 listener = a4Var.f463611f;
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.plugin.backup.ble.BluetoothStateReceiver.f92539a.remove(listener);
        a4Var.b().c();
    }

    public void ZIDL_BV(long j17, long j18, byte[] bArr, byte[] bArr2) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.b bVar = this.f217382a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        bw5.w0 chatPackage = (bw5.w0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.w0.f34545f, bArr2);
        yn1.a4 a4Var = (yn1.a4) bVar;
        a4Var.getClass();
        kotlin.jvm.internal.o.g(chatPackage, "chatPackage");
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[insertChatPackageAsync] taskId=" + j17 + ", convId=" + str);
        yn1.i3 i3Var = new yn1.i3(a4Var, j18, str, chatPackage, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(i3Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.j3(a4Var, j17));
    }

    public void ZIDL_CV(long j17, byte[] bArr, long[] jArr, byte[][] bArr2, int[] iArr) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.b bVar = this.f217382a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.util.ArrayList<java.lang.Long> svrIdList = com.tencent.wechat.zidl2.ZidlUtil.longArrayToList(jArr);
        java.util.ArrayList<java.lang.String> mediaIdList = com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(bArr2);
        java.util.ArrayList<java.lang.Integer> mediaTypeList = com.tencent.wechat.zidl2.ZidlUtil.intArrayToList(iArr);
        yn1.a4 a4Var = (yn1.a4) bVar;
        a4Var.getClass();
        kotlin.jvm.internal.o.g(svrIdList, "svrIdList");
        kotlin.jvm.internal.o.g(mediaIdList, "mediaIdList");
        kotlin.jvm.internal.o.g(mediaTypeList, "mediaTypeList");
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[filterRestoreMediaAsync] taskId=" + j17 + ", convId=" + str + ", svrId.size=" + svrIdList.size() + ", mediaId.size=" + mediaIdList.size());
        yn1.c3 c3Var = new yn1.c3(a4Var, str, j17, svrIdList, mediaIdList, mediaTypeList, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(c3Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.d3(a4Var, j17));
    }

    public void ZIDL_DV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.migration.b bVar = this.f217382a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yn1.a4 a4Var = (yn1.a4) bVar;
        a4Var.getClass();
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[RSEWUA] hashUsername=".concat(str));
        yn1.s3 s3Var = new yn1.s3(str, a4Var, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            c0Var.a(s3Var);
            return;
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
        kotlinx.coroutines.p2.a(kotlinx.coroutines.v2.a(null, 1, null), null, 1, null);
    }

    public void ZIDL_EV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.migration.b bVar = this.f217382a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yn1.a4 a4Var = (yn1.a4) bVar;
        a4Var.getClass();
        yn1.z3 z3Var = new yn1.z3(str, a4Var, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            c0Var.a(z3Var);
            return;
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
        kotlinx.coroutines.p2.a(kotlinx.coroutines.v2.a(null, 1, null), null, 1, null);
    }

    public void ZIDL_FV(long j17) {
        int i17;
        yn1.a4 a4Var = (yn1.a4) this.f217382a;
        a4Var.getClass();
        try {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("batterymanager");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
            i17 = ((android.os.BatteryManager) systemService).getIntProperty(4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(a4Var.f463606a, "[getBatteryLevelAsync] error=" + e17);
            i17 = -1;
        }
        com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
        if (aVar != null) {
            ((com.tencent.wechat.aff.migration.ZIDL_adYmVsNpB) aVar).Q1(j17, i17);
        }
    }

    public byte[] ZIDL_G() {
        yn1.a4 a4Var = (yn1.a4) this.f217382a;
        a4Var.getClass();
        bw5.r0 r0Var = new bw5.r0();
        r0Var.f32349d = oo1.o.f347151a.d();
        boolean[] zArr = r0Var.f32356n;
        zArr[1] = true;
        r0Var.f32350e = yn1.k4.a();
        zArr[2] = true;
        r0Var.f32351f = android.os.Build.MODEL;
        zArr[3] = true;
        r0Var.f32352g = "Android";
        zArr[4] = true;
        r0Var.f32353h = android.os.Build.VERSION.RELEASE;
        zArr[5] = true;
        r0Var.f32354i = com.tencent.mm.sdk.platformtools.z.f193112h;
        zArr[6] = true;
        android.os.StatFs statFs = new android.os.StatFs(yn1.z0.f463933a.g());
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[getDeviceInfo] blockSize=" + statFs.getBlockSizeLong() + ", blockCount=" + statFs.getBlockCountLong() + ", availableBlock=" + statFs.getAvailableBlocksLong());
        r0Var.f32355m = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        zArr[7] = true;
        return r0Var.toByteArrayOrNull();
    }

    public void ZIDL_H(byte[] bArr) {
        com.tencent.wechat.aff.migration.b bVar = this.f217382a;
        bw5.q0 statusModel = (bw5.q0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.q0.f31875i, bArr);
        yn1.a4 a4Var = (yn1.a4) bVar;
        a4Var.getClass();
        kotlin.jvm.internal.o.g(statusModel, "statusModel");
        bw5.bj0 b17 = statusModel.b();
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[notifyTaskCode] status is " + b17);
        if (b17 == bw5.bj0.NOTIFY_CODE_CONV_DONE) {
            java.lang.String str = a4Var.f463606a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notifyTaskCode] status is conv_done, skip notify ui. extra=");
            sb6.append(statusModel.f31880h[2] ? statusModel.f31877e : "");
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            ((ku5.t0) ku5.t0.f312615d).q(new yn1.m3(statusModel, a4Var));
            return;
        }
        bw5.bj0 bj0Var = bw5.bj0.NOTIFY_CODE_FINISH;
        if (b17 == bj0Var || b17 == bw5.bj0.NOTIFY_CODE_CANCEL) {
            ((ku5.t0) ku5.t0.f312615d).q(yn1.n3.f463772d);
        }
        if (b17 == bj0Var) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            yn1.o3 o3Var = yn1.o3.f463783d;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.t(o3Var, 500L, null);
        }
        pm0.v.X(new yn1.p3(statusModel));
        if (a4Var.f463607b || !statusModel.f31878f) {
            return;
        }
        kotlin.jvm.internal.o.d(b17);
        if (yn1.k4.c(b17)) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new yn1.q3(a4Var));
    }

    public void ZIDL_I(byte[] bArr) {
        com.tencent.wechat.aff.migration.b bVar = this.f217382a;
        bw5.p0 sceneModel = (bw5.p0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.p0.f31419h, bArr);
        yn1.a4 a4Var = (yn1.a4) bVar;
        a4Var.getClass();
        kotlin.jvm.internal.o.g(sceneModel, "sceneModel");
        a4Var.f463607b = sceneModel.f31421e;
        yn1.l3 l3Var = new yn1.l3(sceneModel, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var == null || kotlinx.coroutines.l.d(c0Var, c0Var.f463621e, null, l3Var, 2, null) == null) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launchUI] Scope must be initialized", null);
            kotlinx.coroutines.p2.a(kotlinx.coroutines.v2.a(null, 1, null), null, 1, null);
        }
    }

    public void ZIDL_J(byte[] bArr) {
        com.tencent.wechat.aff.migration.b bVar = this.f217382a;
        bw5.o0 progressModel = (bw5.o0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.o0.f30861n, bArr);
        ((yn1.a4) bVar).getClass();
        kotlin.jvm.internal.o.g(progressModel, "progressModel");
        yn1.k3 k3Var = new yn1.k3(progressModel, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var == null || kotlinx.coroutines.l.d(c0Var, c0Var.f463621e, null, k3Var, 2, null) == null) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launchUI] Scope must be initialized", null);
            kotlinx.coroutines.p2.a(kotlinx.coroutines.v2.a(null, 1, null), null, 1, null);
        }
    }

    public boolean ZIDL_K() {
        yn1.a4 a4Var = (yn1.a4) this.f217382a;
        a4Var.getClass();
        try {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext().getSystemService("wifi");
            android.net.wifi.WifiManager wifiManager = systemService instanceof android.net.wifi.WifiManager ? (android.net.wifi.WifiManager) systemService : null;
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    return true;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(a4Var.f463606a, "[isWiFiEnable] error=" + e17);
        }
        return false;
    }

    public boolean ZIDL_L() {
        ((yn1.a4) this.f217382a).getClass();
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
        if (connectivityManager != null) {
            try {
                android.net.Network[] allNetworks = connectivityManager.getAllNetworks();
                kotlin.jvm.internal.o.f(allNetworks, "getAllNetworks(...)");
                for (android.net.Network network : allNetworks) {
                    android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                    if (networkCapabilities == null || !networkCapabilities.hasTransport(1)) {
                    }
                }
                return false;
            } catch (java.lang.Exception unused) {
                return false;
            }
        }
        return true;
    }

    public void ZIDL_MV(long j17) {
        kotlinx.coroutines.r2 r2Var;
        yn1.a4 a4Var = (yn1.a4) this.f217382a;
        a4Var.getClass();
        yn1.g3 g3Var = new yn1.g3(a4Var, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(g3Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.h3(a4Var, j17));
    }

    public byte[] ZIDL_N() {
        this.f217382a.getClass();
        return "".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public boolean ZIDL_O() {
        ((yn1.a4) this.f217382a).getClass();
        return ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ni();
    }

    public boolean ZIDL_P() {
        this.f217382a.getClass();
        return false;
    }

    public void ZIDL_QV(long j17) {
        yn1.a4 a4Var = (yn1.a4) this.f217382a;
        a4Var.getClass();
        yn1.z0 z0Var = yn1.z0.f463933a;
        yn1.x2 x2Var = new yn1.x2(a4Var, j17);
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[checkPermissionAsync]");
        yn1.l0 l0Var = new yn1.l0(x2Var, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            c0Var.a(l0Var);
            return;
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
        kotlinx.coroutines.p2.a(kotlinx.coroutines.v2.a(null, 1, null), null, 1, null);
    }

    public void ZIDL_RV(long j17) {
        kotlinx.coroutines.r2 r2Var;
        yn1.a4 a4Var = (yn1.a4) this.f217382a;
        a4Var.getClass();
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[startBLEAdvertisingAsync] taskId=" + j17);
        yn1.v3 v3Var = new yn1.v3(a4Var, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(v3Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.w3(a4Var, j17));
    }

    public void ZIDL_SV(long j17) {
        yn1.a4 a4Var = (yn1.a4) this.f217382a;
        java.lang.String str = a4Var.f463606a;
        com.tencent.mars.xlog.Log.i(str, "[stopBLEAdvertising]");
        try {
            a4Var.b().i();
            com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
            if (aVar != null) {
                ((com.tencent.wechat.aff.migration.ZIDL_adYmVsNpB) aVar).R1(j17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "[stopBLEAdvertising] error", e17);
        }
    }

    public void ZIDL_TV(long j17, byte[] bArr) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.b bVar = this.f217382a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yn1.a4 a4Var = (yn1.a4) bVar;
        a4Var.getClass();
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[startBLEScanningAsync] taskId=" + j17);
        java.util.Set set = com.tencent.mm.plugin.backup.ble.BluetoothStateReceiver.f92539a;
        yn1.u2 listener = a4Var.f463611f;
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.plugin.backup.ble.BluetoothStateReceiver.f92539a.add(listener);
        yn1.x3 x3Var = new yn1.x3(a4Var, str, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(x3Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.y3(a4Var, j17));
    }

    public void ZIDL_UV(long j17) {
        yn1.a4 a4Var = (yn1.a4) this.f217382a;
        java.lang.String str = a4Var.f463606a;
        com.tencent.mars.xlog.Log.i(str, "[stopBLEScanning]");
        try {
            a4Var.b().j();
            com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
            if (aVar != null) {
                ((com.tencent.wechat.aff.migration.ZIDL_adYmVsNpB) aVar).S1(j17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "[stopBLEScanning] error", e17);
        }
    }

    public void ZIDL_VV(long j17, byte[] bArr, int i17, byte[] data) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.b bVar = this.f217382a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yn1.a4 a4Var = (yn1.a4) bVar;
        a4Var.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String str2 = "[sendBLEMessageAsync] taskId=" + j17 + ", deviceId=" + str + ", dataLength=" + data.length;
        java.lang.String str3 = a4Var.f463606a;
        com.tencent.mars.xlog.Log.i(str3, str2);
        if (a4Var.f463610e == null) {
            com.tencent.mars.xlog.Log.e(str3, "[BLE] bleAuthKey is null");
            com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
            if (aVar != null) {
                ((com.tencent.wechat.aff.migration.ZIDL_adYmVsNpB) aVar).r(j17, false);
                return;
            }
            return;
        }
        yn1.t3 t3Var = new yn1.t3(a4Var, data, i17, str, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(t3Var);
        } else {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.u3(a4Var, j17));
    }

    public void ZIDL_WV(long j17, int i17, byte[] data) {
        kotlinx.coroutines.r2 r2Var;
        yn1.a4 a4Var = (yn1.a4) this.f217382a;
        a4Var.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String str = "[broadcastBLEMessageAsync] taskId=" + j17 + ", dataLength=" + data.length;
        java.lang.String str2 = a4Var.f463606a;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (a4Var.f463610e == null) {
            com.tencent.mars.xlog.Log.e(str2, "[BLE] bleAuthKey is null");
            com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
            if (aVar != null) {
                ((com.tencent.wechat.aff.migration.ZIDL_adYmVsNpB) aVar).r(j17, false);
                return;
            }
            return;
        }
        yn1.v2 v2Var = new yn1.v2(a4Var, data, i17, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(v2Var);
        } else {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.w2(a4Var, j17));
    }

    public void ZIDL_XV(long j17, byte[] bArr) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.b bVar = this.f217382a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yn1.a4 a4Var = (yn1.a4) bVar;
        a4Var.getClass();
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[connectBLEDeviceAsync] taskId=" + j17 + ", deviceId=" + str);
        yn1.y2 y2Var = new yn1.y2(a4Var, str, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(y2Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.z2(a4Var, j17));
    }

    public void ZIDL_YV(long j17, byte[] bArr) {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.wechat.aff.migration.b bVar = this.f217382a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yn1.a4 a4Var = (yn1.a4) bVar;
        a4Var.getClass();
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[disconnectBLEDeviceAsync] taskId=" + j17 + ", deviceId=" + str);
        yn1.a3 a3Var = new yn1.a3(a4Var, str, j17, null);
        yn1.c0 c0Var = yn1.d0.f463636b;
        if (c0Var != null) {
            r2Var = c0Var.a(a3Var);
        } else {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationCoroutineScope", "[launch] Scope must be initialized", null);
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            kotlinx.coroutines.p2.a(a17, null, 1, null);
            r2Var = a17;
        }
        xn1.j.a(r2Var, new yn1.b3(a4Var, j17));
    }

    public boolean ZIDL_Z() {
        return !((yn1.a4) this.f217382a).b().f438223k.isEmpty();
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void a(long j17, boolean z17, long j18, bw5.w0 w0Var) {
        ZIDL_AX(this.nativeHandler, j17, z17, j18, w0Var.toByteArrayOrNull());
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.migration.b bVar = (com.tencent.wechat.aff.migration.b) obj;
        this.f217382a = bVar;
        ((yn1.a4) bVar).f463609d = this;
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void d(java.lang.String str, int i17, byte[] bArr) {
        ZIDL_DBI(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, bArr);
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void i(long j17, boolean z17) {
        ZIDL_YX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void k(long j17, boolean z17, java.lang.String str) {
        ZIDL_RX(this.nativeHandler, j17, z17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void m(long j17, long j18, java.util.ArrayList arrayList) {
        ZIDL_CX(this.nativeHandler, j17, j18, com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList));
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void p() {
        ZIDL_GBI(this.nativeHandler);
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void r(long j17, boolean z17) {
        ZIDL_VX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void r1(long j17, boolean z17) {
        ZIDL_QX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void t() {
        ZIDL_HBI(this.nativeHandler);
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void v(long j17) {
        ZIDL_BX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void w(java.lang.String str, java.lang.String str2, int i17) {
        ZIDL_CBI(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17);
    }

    @Override // com.tencent.wechat.aff.migration.a
    public void x(long j17, boolean z17) {
        ZIDL_TX(this.nativeHandler, j17, z17);
    }
}
