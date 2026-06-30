package gl;

@j95.b
/* loaded from: classes14.dex */
public final class i extends i95.w implements cv.w0, gl.q {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.HashSet f272752p = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f272754e;

    /* renamed from: f, reason: collision with root package name */
    public cv.v0 f272755f;

    /* renamed from: g, reason: collision with root package name */
    public final gl.a f272756g;

    /* renamed from: i, reason: collision with root package name */
    public cv.u0 f272758i;

    /* renamed from: m, reason: collision with root package name */
    public int f272759m;

    /* renamed from: o, reason: collision with root package name */
    public android.bluetooth.BluetoothHeadset f272761o;

    /* renamed from: h, reason: collision with root package name */
    public final gl.k f272757h = new gl.k();

    /* renamed from: n, reason: collision with root package name */
    public int f272760n = 3;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f272753d = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    public i() {
        gl.a yVar = fp.h.c(31) ? new gl.y() : new gl.l();
        this.f272756g = yVar;
        yVar.j(this);
        Ni(1);
    }

    public final java.lang.Object Ai(int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 4) {
            if (Ri()) {
                this.f272759m = 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.AudioRouteManager", "onAudioRouteSucc deviceClass: 4 deviceName: " + str);
                this.f272759m = 0;
                gl.a aVar = this.f272756g;
                if (aVar != null) {
                    aVar.g(4, str);
                }
            } else {
                java.lang.Object cj6 = cj(4, str, continuation);
                if (cj6 == pz5.a.f359186d) {
                    return cj6;
                }
            }
        }
        return f0Var;
    }

    public cv.v0 Bi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRouteManager", "checkCurrentOutputInfo cur " + this.f272755f + " and " + Vi());
        cv.v0 v0Var = this.f272755f;
        if (v0Var == null) {
            return Ui() ? new cv.v0(4, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6m), 0, 4, null) : aj() ? new cv.v0(3, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6o), 0, 4, null) : Vi() ? new cv.v0(1, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6p), 0, 4, null) : new cv.v0(2, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6n), 0, 4, null);
        }
        kotlin.jvm.internal.o.d(v0Var);
        return v0Var;
    }

    public boolean Di(java.util.List devices) {
        kotlin.jvm.internal.o.g(devices, "devices");
        java.util.Iterator it = devices.iterator();
        while (it.hasNext()) {
            int i17 = ((cv.v0) it.next()).f222516a;
            if (i17 != 2 && i17 != 1) {
                return true;
            }
        }
        return false;
    }

    public android.bluetooth.BluetoothHeadset Ni(int i17) {
        if (this.f272761o == null) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("bluetooth");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
            android.bluetooth.BluetoothAdapter adapter = ((android.bluetooth.BluetoothManager) systemService).getAdapter();
            if (adapter != null) {
                try {
                    adapter.getProfileProxy(com.tencent.mm.sdk.platformtools.x2.f193071a, new gl.e(this, adapter), 1);
                } catch (java.lang.SecurityException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AudioRouteManager", "getProfileProxy error: " + e17.getMessage());
                }
            }
        }
        return this.f272761o;
    }

    public boolean Ri() {
        gl.a aVar = this.f272756g;
        if (aVar != null) {
            return aVar.i();
        }
        return false;
    }

    public boolean Ui() {
        gl.a aVar = this.f272756g;
        if (aVar != null ? aVar.k() : false) {
            return !(this.f272759m >= 2);
        }
        return false;
    }

    public boolean Vi() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return mm1.g.b((android.media.AudioManager) systemService);
    }

    public boolean Zi() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return ((android.media.AudioManager) systemService).getRingerMode() != 2;
    }

    public boolean aj() {
        gl.a aVar = this.f272756g;
        if (aVar != null) {
            return aVar.a();
        }
        return false;
    }

    public final void bj(cv.v0 v0Var, boolean z17) {
        this.f272755f = v0Var;
        cv.u0 u0Var = this.f272758i;
        if (u0Var != null) {
            this.f272757h.b(u0Var.f222514b, v0Var, !(this.f272756g instanceof gl.l) ? 1 : 0, z17);
            m3.a aVar = u0Var.f222513a;
            if (aVar != null) {
                cv.v0 v0Var2 = new cv.v0(v0Var.f222516a, v0Var.f222517b, 1);
                java.lang.String str = v0Var.f222519d;
                kotlin.jvm.internal.o.g(str, "<set-?>");
                v0Var2.f222519d = str;
                aVar.accept(v0Var2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f2 A[LOOP:0: B:19:0x00ec->B:21:0x00f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cj(int r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.i.cj(int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void fj(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        boolean z17 = false;
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_bluetooth_limited_in_background, false) && this.f272758i == null) ? false : true) {
            if (kotlin.jvm.internal.o.b(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 12) {
                z17 = true;
            }
            if ((z17 ? intent : null) != null) {
                android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
                android.bluetooth.BluetoothHeadset bluetoothHeadset = this.f272761o;
                if (defaultAdapter != null && bluetoothHeadset != null) {
                    defaultAdapter.closeProfileProxy(1, bluetoothHeadset);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AudioRouteManager", "bt closeProfileProxy " + bluetoothHeadset);
                }
                this.f272761o = null;
                Ni(1);
            }
            gl.a aVar = this.f272756g;
            if (aVar != null) {
                aVar.e(intent);
            }
        }
    }

    public void hj(int i17, java.lang.String str) {
        cv.u0 u0Var = this.f272758i;
        if (u0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioRouteManager", "onAudioDeviceActive deviceClass: " + i17 + " deviceName: " + str);
            this.f272757h.b(u0Var.f222514b, new cv.v0(i17, str, 4), !(this.f272756g instanceof gl.l) ? 1 : 0, false);
            m3.a aVar = u0Var.f222513a;
            if (aVar != null) {
                aVar.accept(new cv.v0(i17, str, 4));
            }
        }
    }

    public void ij(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 4) {
            this.f272759m = 0;
        }
        cv.v0 v0Var = new cv.v0(i17, str, 0, 4, null);
        if (str2 == null) {
            str2 = "";
        }
        v0Var.f222519d = str2;
        v0Var.f222518c = 1;
        bj(v0Var, false);
    }

    public void mj(int i17, java.lang.String str) {
        cv.u0 u0Var = this.f272758i;
        if (u0Var != null) {
            if (i17 == 4) {
                this.f272759m = 0;
            }
            m3.a aVar = u0Var.f222513a;
            if (aVar != null) {
                aVar.accept(new cv.v0(i17, str, 3));
            }
        }
    }

    public void nj(int i17, java.lang.String str) {
        m3.a aVar;
        cv.u0 u0Var = this.f272758i;
        if (u0Var != null && (aVar = u0Var.f222513a) != null) {
            aVar.accept(new cv.v0(i17, str, 2));
        }
        cv.v0 v0Var = this.f272755f;
        if (v0Var != null && i17 == v0Var.f222516a) {
            this.f272755f = null;
            if (i17 == 4) {
                this.f272759m = 0;
            }
        }
    }

    public void oj(cv.u0 consumer) {
        kotlin.jvm.internal.o.g(consumer, "consumer");
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRouteManager", "remove listener " + consumer);
        this.f272758i = null;
    }

    public final void pj() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("notification");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        boolean isNotificationPolicyAccessGranted = ((android.app.NotificationManager) systemService).isNotificationPolicyAccessGranted();
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRouteManager", "requestPermission() result:%s", java.lang.Boolean.valueOf(isNotificationPolicyAccessGranted));
        if (isNotificationPolicyAccessGranted) {
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", com.tencent.mm.sdk.platformtools.x2.f193072b);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/audio/manager/AudioRouteManager", "requestPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/audio/manager/AudioRouteManager", "requestPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AudioRouteManager", "requestPermission() Exception:%s", e17.getMessage());
        }
    }

    public boolean qj(int i17, boolean z17) {
        oz5.l lVar;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.AudioRouteManager", "route to Device " + i17, new java.lang.Object[0]);
        kotlinx.coroutines.y0 y0Var = this.f272753d;
        if (y0Var != null && (lVar = ((kotlinx.coroutines.internal.h) y0Var).f310496d) != null) {
            kotlinx.coroutines.v2.e(lVar, null, 1, null);
        }
        this.f272754e = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new gl.h(i17, this, z17, null), 3, null) : null;
        return true;
    }

    public void release() {
        oz5.l f11582e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRouteManager", "release audio route manager ");
        kotlinx.coroutines.r2 r2Var = this.f272754e;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.y0 y0Var = this.f272753d;
        if (y0Var != null && (f11582e = y0Var.getF11582e()) != null) {
            kotlinx.coroutines.v2.e(f11582e, null, 1, null);
        }
        gl.a aVar = this.f272756g;
        if (aVar != null) {
            aVar.release();
        }
        this.f272759m = 0;
        this.f272760n = 3;
        cv.u0 u0Var = this.f272758i;
        if (u0Var != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AudioRouteManager", "registeredListeners not null,must be leak ");
            this.f272757h.a(u0Var.f222514b, 1, -1);
            this.f272758i = null;
        }
        this.f272755f = null;
    }

    public java.util.List rj() {
        cv.v0 v0Var;
        cv.v0 v0Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean Ui = Ui();
        gl.a aVar = this.f272756g;
        if (Ui) {
            if (aVar == null || (v0Var2 = aVar.f272732b) == null) {
                v0Var2 = new cv.v0(4, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6m), 0, 4, null);
            }
            arrayList.add(v0Var2);
        }
        boolean z17 = true;
        if (aVar != null && aVar.a()) {
            if (aVar == null || (v0Var = aVar.f272731a) == null) {
                v0Var = new cv.v0(3, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6o), 0, 4, null);
            }
            arrayList.add(v0Var);
        }
        gl.b bVar = new gl.b();
        bVar.a();
        if (!bVar.f272733a && !bVar.f272734b) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioRouteManager", "push earPiece Menu Item to AvailableDevicesList");
            arrayList.add(new cv.v0(2, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6n), 0, 4, null));
        }
        arrayList.add(new cv.v0(1, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6p), 0, 4, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRouteManager", "current available devices " + arrayList.size());
        return arrayList;
    }

    public void sj() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        try {
            ((android.media.AudioManager) systemService).adjustVolume(-1, 5);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AudioRouteManager", "adjustStreamVolume() Exception: %s", e17.getMessage());
            pj();
        }
    }

    public void tj() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        try {
            ((android.media.AudioManager) systemService).adjustVolume(1, 5);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AudioRouteManager", "adjustStreamVolume() Exception: %s", e17.getMessage());
            pj();
        }
    }

    public void wi(cv.u0 consumer) {
        kotlin.jvm.internal.o.g(consumer, "consumer");
        int i17 = gl.c.f272736b;
        gl.c.f272735a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_android_bluetooth_sco_retry_timeout, 2500L);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRouteManager", "add listener " + consumer);
        this.f272758i = consumer;
    }
}
