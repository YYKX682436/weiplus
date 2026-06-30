package d13;

/* loaded from: classes14.dex */
public final class e implements com.tencent.mm.plugin.voip.ui.f {

    /* renamed from: d, reason: collision with root package name */
    public final b13.m f225727d;

    /* renamed from: e, reason: collision with root package name */
    public cv.v0 f225728e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f225729f;

    public e(b13.m voipMgr) {
        kotlin.jvm.internal.o.g(voipMgr, "voipMgr");
        this.f225727d = voipMgr;
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void H5(int i17, java.lang.String str) {
        if (i17 == 233) {
            gq4.v.Bi().f176558a.f176411a.f176532x.M1.f176726m = 1;
        }
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public android.content.Context J4() {
        android.app.Activity activity = this.f225727d.H1;
        if (activity != null) {
            return activity;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void K(int i17) {
        i2(i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? new cv.v0(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6p), 0, 4, null) : new cv.v0(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6m), 0, 4, null) : new cv.v0(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6o), 0, 4, null) : new cv.v0(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6n), 0, 4, null) : new cv.v0(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6p), 0, 4, null));
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void M4(boolean z17) {
        a();
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void Q2(boolean z17) {
        if (z17) {
            c13.b0.f37860d.h(z03.g.f469231d, null);
        } else {
            c13.b0.f37860d.h(z03.g.f469232e, null);
        }
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void W2() {
        c13.b0.f37860d.h(z03.g.f469233f, null);
    }

    public final synchronized void a() {
        android.os.PowerManager.WakeLock wakeLock = this.f225729f;
        if (wakeLock == null || !wakeLock.isHeld()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterVoipUI", "repeatedly release screen off wakelock from object: %s, drop this call.", toString());
        } else {
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/flutter/voip/ui/FlutterVoipUI", "turnOnScreen", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/flutter/voip/ui/FlutterVoipUI", "turnOnScreen", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipUI", "after release screen off wakelock from object: %s, isHeld: %s", toString(), java.lang.Boolean.valueOf(wakeLock.isHeld()));
            this.f225729f = null;
            this.f225727d.getClass();
            c13.b0 b0Var = c13.b0.f37860d;
            ((ku5.t0) ku5.t0.f312615d).B(new c13.o(true));
        }
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void e4(java.lang.String str) {
        if (str != null) {
            c13.b0.f37860d.h(z03.g.f469236i, str);
        }
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void i2(cv.v0 device) {
        int i17;
        kotlin.jvm.internal.o.g(device, "device");
        if (this.f225728e != null && (i17 = device.f222516a) != 2) {
            if (i17 != 4) {
                if (!this.f225727d.f176388s) {
                    setScreenEnable(true);
                }
            } else if (!this.f225727d.f176388s) {
                setScreenEnable(true);
            }
        }
        b13.m mVar = this.f225727d;
        cv.v0 v0Var = mVar.A;
        if (v0Var != null && device.f222516a != v0Var.f222516a) {
            mVar.z0(device.c(), 20);
        }
        mVar.B0(device);
        c13.b0 b0Var = c13.b0.f37860d;
        int i18 = device.f222516a;
        com.tencent.pigeon.flutter_voip.AudioDevice audioDevice = i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? com.tencent.pigeon.flutter_voip.AudioDevice.SPEAKER : com.tencent.pigeon.flutter_voip.AudioDevice.BLUETOOTH : com.tencent.pigeon.flutter_voip.AudioDevice.HEADSET : com.tencent.pigeon.flutter_voip.AudioDevice.EARPIECE : com.tencent.pigeon.flutter_voip.AudioDevice.SPEAKER;
        java.lang.String str = device.f222517b;
        if (str == null) {
            str = "";
        }
        ((ku5.t0) ku5.t0.f312615d).B(new c13.g(new com.tencent.pigeon.flutter_voip.AudioRouteInfo(audioDevice, str), device));
        this.f225728e = device;
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void k() {
        boolean z17;
        gq4.v.Bi().getClass();
        if (com.tencent.mm.plugin.voip.model.v2protocal.f176819f2 < 900 || com.tencent.mm.plugin.voip.model.v2protocal.f176818e2) {
            z17 = false;
        } else {
            z17 = true;
            com.tencent.mm.plugin.voip.model.v2protocal.f176818e2 = true;
        }
        if (z17) {
            c13.b0.f37860d.h(z03.g.f469234g, null);
        }
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void o5(long j17) {
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void q2(java.util.List devices) {
        kotlin.jvm.internal.o.g(devices, "devices");
        c13.b0 b0Var = c13.b0.f37860d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = devices.iterator();
        while (it.hasNext()) {
            cv.v0 v0Var = (cv.v0) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", "onExternalAudioOutputDeviceChanged is " + v0Var.f222516a);
            if (v0Var.f222517b != null) {
                int i17 = v0Var.f222516a;
                com.tencent.pigeon.flutter_voip.AudioDevice audioDevice = i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.tencent.pigeon.flutter_voip.AudioDevice.SPEAKER : com.tencent.pigeon.flutter_voip.AudioDevice.BLUETOOTH : com.tencent.pigeon.flutter_voip.AudioDevice.HEADSET : com.tencent.pigeon.flutter_voip.AudioDevice.EARPIECE : com.tencent.pigeon.flutter_voip.AudioDevice.SPEAKER;
                java.lang.String str = v0Var.f222517b;
                kotlin.jvm.internal.o.d(str);
                arrayList.add(new com.tencent.pigeon.flutter_voip.AudioRouteInfo(audioDevice, str));
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new c13.k(arrayList));
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void setScreenEnable(boolean z17) {
        if (z17) {
            a();
            return;
        }
        synchronized (this) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            android.os.PowerManager powerManager = (android.os.PowerManager) systemService;
            android.os.PowerManager.WakeLock wakeLock = this.f225729f;
            if (wakeLock == null) {
                wakeLock = powerManager.newWakeLock(32, "wechat:screen flutter-Lock");
                this.f225729f = wakeLock;
            }
            android.os.PowerManager.WakeLock wakeLock2 = wakeLock;
            if (wakeLock2.isHeld()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FlutterVoipUI", "repeatedly acquire screen off wakelock from object: %s, drop this call.", toString());
            } else {
                yj0.a.c(wakeLock2, "com/tencent/mm/plugin/flutter/voip/ui/FlutterVoipUI", "turnOffScreen", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                wakeLock2.acquire();
                yj0.a.f(wakeLock2, "com/tencent/mm/plugin/flutter/voip/ui/FlutterVoipUI", "turnOffScreen", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipUI", "after acquire screen off wakelock from object: %s, isHeld: %s", toString(), java.lang.Boolean.valueOf(wakeLock2.isHeld()));
                this.f225727d.getClass();
                c13.b0 b0Var = c13.b0.f37860d;
                ((ku5.t0) ku5.t0.f312615d).B(new c13.o(false));
            }
        }
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void u() {
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void v1() {
        c13.b0.f37860d.h(z03.g.f469235h, null);
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void y(int i17) {
        ((ku5.t0) ku5.t0.f312615d).B(new d13.d(this, i17));
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void z(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void z1(int i17, int i18) {
        c13.b0.f37860d.i(i17, i18);
    }
}
