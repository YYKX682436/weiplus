package u81;

/* loaded from: classes7.dex */
public abstract class i0 extends u81.j0 implements android.content.ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f425437e;

    /* renamed from: f, reason: collision with root package name */
    public int f425438f;

    public i0(u81.k0 k0Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super(k0Var);
        this.f425438f = 0;
        this.f425437e = appBrandRuntime;
    }

    @Override // u81.j0, k75.c
    public void a() {
        boolean z17;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var;
        this.f425438f = 0;
        java.lang.String str = this.f425437e.f74803n;
        u81.a aVar = (u81.a) this.f425437e.b(u81.a.class);
        if (!(aVar != null && aVar.f425398d)) {
            com.tencent.mm.plugin.appbrand.media.music.d.f85757c.c(str);
        } else if (com.tencent.mm.plugin.appbrand.media.music.d.a(str)) {
            d(1);
        }
        boolean z18 = ((u81.a) this.f425437e.b(u81.a.class)).f425399e;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagLocationIfNeed, canKeepAliveLocation:%s", java.lang.Boolean.valueOf(z18));
        if (z18 && (j1Var = (com.tencent.mm.plugin.appbrand.jsapi.lbs.j1) this.f425437e.k(com.tencent.mm.plugin.appbrand.jsapi.lbs.j1.class)) != null) {
            boolean z19 = j1Var.f81441q && j1Var.f81440p;
            com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagLocationIfNeed, isBackgroundMode:%s, isListening:%s", java.lang.Boolean.valueOf(j1Var.f81441q), java.lang.Boolean.valueOf(j1Var.f81440p));
            if (z19) {
                d(32);
            }
        }
        com.tencent.mm.plugin.appbrand.backgroundrunning.h1 h1Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.h1) this.f425437e.k(com.tencent.mm.plugin.appbrand.backgroundrunning.h1.class);
        if (h1Var != null) {
            boolean a17 = h1Var.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagAppBrandLiveVOIPIfNeed, isVOIPing:%s", java.lang.Boolean.valueOf(a17));
            if (a17) {
                d(64);
            }
        }
        com.tencent.mm.plugin.appbrand.backgroundrunning.g1 g1Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.g1) this.f425437e.k(com.tencent.mm.plugin.appbrand.backgroundrunning.g1.class);
        if (g1Var != null) {
            tf1.f fVar = (tf1.f) g1Var;
            synchronized (fVar.f418866o) {
                z17 = !fVar.f418873v.isEmpty();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagAppBrandAudioBackgroundPlayIfNeed, isNeedKeepAlive:%b", java.lang.Boolean.valueOf(z17));
            if (z17) {
                d(128);
            }
        }
        if (((com.tencent.mm.plugin.appbrand.backgroundrunning.i1) this.f425437e.k(com.tencent.mm.plugin.appbrand.backgroundrunning.i1.class)) != null) {
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            boolean z27 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.T;
            boolean wi6 = ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).wi();
            com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagAppBrandVOIP1vIfNeed, isVOIPing:%b, isWaitingVoip:%b", java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(wi6));
            if (z27 || wi6) {
                d(256);
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s c17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b.c(this.f425437e);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagBluetoothIfNeed, client is null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagBluetoothIfNeed, client: " + c17.N6());
            boolean H6 = c17.H6();
            com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagBluetoothIfNeed, isNeedKeepAlive: " + H6);
            if (H6) {
                d(512);
            }
        }
        if (this.f425437e.R0()) {
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagForForegroundService processInfo.importance:%d, importanceReasonCode:%d, importanceReasonComponent:%s", java.lang.Integer.valueOf(runningAppProcessInfo.importance), java.lang.Integer.valueOf(runningAppProcessInfo.importanceReasonCode), runningAppProcessInfo.importanceReasonComponent);
            if (100 == runningAppProcessInfo.importance) {
                d(1024);
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerComponentCallbacks(this);
            }
        }
        java.lang.String str2 = this.f425437e.f74803n;
        com.tencent.mm.plugin.appbrand.w0 d17 = com.tencent.mm.plugin.appbrand.x0.d(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "addKeepFlagAdjustByPauseType, appId:%s, pauseType:%s", str2, d17);
        int ordinal = d17.ordinal();
        if (ordinal == 4) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f425437e;
            com.tencent.mm.plugin.appbrand.hc hcVar = appBrandRuntime.f74796e;
            if (hcVar != null && hcVar.getWindowAndroid().q5()) {
                try {
                    appBrandRuntime.B0();
                } catch (java.lang.Throwable unused) {
                }
            }
        } else if (ordinal == 6) {
            d(4);
        } else if (ordinal == 7) {
            d(16);
        }
        this.f425438f = this.f425438f;
        super.a();
        f(0);
    }

    public final void d(int i17) {
        this.f425438f |= i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "addFlag, appId:%s, flag: %d, result: %d", this.f425437e.f74803n, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f425438f));
    }

    public final void e(java.lang.String str) {
        int i17;
        android.content.ComponentName componentName;
        int i18;
        boolean z17 = (this.f425438f & 1024) != 0;
        if (z17) {
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
            i17 = runningAppProcessInfo.importance;
            i18 = runningAppProcessInfo.importanceReasonCode;
            android.content.ComponentName componentName2 = runningAppProcessInfo.importanceReasonComponent;
            if (100 != i17) {
                f(1024);
            }
            componentName = componentName2;
        } else {
            i17 = -1;
            componentName = null;
            i18 = -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "checkRemoveFlagForForegroundService(%s), hasFlag?:%b, importance:%d, importanceReasonCode:%d, importanceReasonComponent:%s, currentPauseType:%s", str, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), componentName, com.tencent.mm.plugin.appbrand.x0.d(this.f425437e.f74803n));
    }

    public final void f(int i17) {
        android.os.Message message;
        this.f425438f &= ~i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "removeFlag, appId:%s, flag: %d, result: %d", this.f425437e.f74803n, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f425438f));
        if (this.f425438f == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "onKeepFlagsCleared, appId:%s", this.f425437e.f74803n);
            u81.x xVar = (u81.x) this;
            if (xVar.f425487h.d() != null) {
                message = android.os.Message.obtain(xVar.f425487h.f304847e);
                message.copyFrom(xVar.f425487h.d());
            } else {
                message = null;
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = "|Background";
            objArr[1] = java.lang.Integer.valueOf(message == null ? -1 : message.what);
            objArr[2] = java.lang.Boolean.valueOf(xVar.f425486g);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "onKeepFlagsCleared %s, currentMsg.what:%d, mIsSystemScreenOff:%b", objArr);
            if (xVar.f425486g) {
                xVar.f425487h.s(u81.u.ON_SYSTEM_SCREEN_OFF, null);
            } else {
                xVar.f425487h.s(u81.u.ON_BACKGROUND_KEEP_FLAGS_CLEARED, message);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        e("onLowMemory");
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultipleConditionBackgroundState", "onTrimMemory level:%d", java.lang.Integer.valueOf(i17));
        e("onTrimMemory");
    }
}
