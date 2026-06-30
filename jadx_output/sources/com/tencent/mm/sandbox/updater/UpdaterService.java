package com.tencent.mm.sandbox.updater;

/* loaded from: classes11.dex */
public class UpdaterService extends com.tencent.mm.service.MMService {

    /* renamed from: p, reason: collision with root package name */
    public static com.tencent.mm.sandbox.updater.UpdaterService f192331p = null;

    /* renamed from: q, reason: collision with root package name */
    public static long f192332q = 1800000;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f192333i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public boolean f192334m = false;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f192335n = new com.tencent.mm.sdk.platformtools.b4(new s65.y0(this), true);

    /* renamed from: o, reason: collision with root package name */
    public s65.a1 f192336o = null;

    @Override // com.tencent.mm.service.MMService
    public java.lang.String b() {
        return "MicroMsg.XWeb.MM.UpdaterService";
    }

    @Override // com.tencent.mm.service.MMService
    public android.os.IBinder c(android.content.Intent intent) {
        return null;
    }

    @Override // com.tencent.mm.service.MMService
    public void d() {
        super.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.UpdaterService", "onCreate");
        q65.d.a(hashCode(), this);
        f192331p = this;
        java.util.Map map = this.f192333i;
        ((java.util.HashMap) map).put(0, s65.w0.f403525a);
        s65.d1 d1Var = s65.c1.f403438a;
        ((java.util.HashMap) map).put(4, d1Var);
        ((java.util.HashMap) map).put(5, d1Var);
        ((java.util.HashMap) map).put(6, d1Var);
        ((java.util.HashMap) map).put(7, d1Var);
        com.tencent.mm.ui.MMActivity.initLanguage(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f192335n;
        long j17 = f192332q;
        b4Var.c(j17, j17);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        s65.a1 a1Var = new s65.a1();
        this.f192336o = a1Var;
        this.f193206f.registerReceiver(a1Var, intentFilter);
    }

    @Override // com.tencent.mm.service.MMService
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.UpdaterService", "onDestroy");
        this.f192335n.d();
        s65.a1 a1Var = this.f192336o;
        if (a1Var != null) {
            try {
                this.f193206f.unregisterReceiver(a1Var);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.XWeb.MM.UpdaterService", "unregisterReceiver(UpdaterService.ConnectivityReceiver) exception = %s", e17.getMessage());
            }
        }
        if (this.f192334m) {
            this.f193206f.stopForeground(true);
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.f192333i;
        java.util.Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((s65.w) it.next()).onDestroy();
        }
        hashMap.clear();
        f192331p = null;
        q65.d.b(hashCode(), this);
        super.e();
    }

    @Override // com.tencent.mm.service.MMService
    public void f(android.content.Intent intent, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.UpdaterService", "onStart intent = %s", intent);
        j(intent);
    }

    @Override // com.tencent.mm.service.MMService
    public int g(android.content.Intent intent, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.UpdaterService", "onStartCommand intent = %s", intent);
        if (intent != null && intent.getBooleanExtra("intent_extra_run_in_foreground", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.UpdaterService", "runServiceInForground");
            android.app.PendingIntent service = android.app.PendingIntent.getService(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, new android.content.Intent(), fp.g0.a(0));
            z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
            k0Var.m("updater service running forground");
            k0Var.D.when = java.lang.System.currentTimeMillis();
            k0Var.f("Updater Service");
            k0Var.e("updater service running forground");
            k0Var.f469463g = service;
            this.f193206f.startForeground(0, k0Var.b());
            this.f192334m = true;
        }
        j(intent);
        return 2;
    }

    public final boolean i() {
        java.util.Map map = this.f192333i;
        if (((java.util.HashMap) map).size() > 0) {
            java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
            while (it.hasNext()) {
                if (((s65.w) it.next()).d()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.UpdaterService", "checkAndTryStopSelf, dont stop, some download mgr still busy");
                    return false;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.UpdaterService", "checkAndTryStopSelf, UpdaterService killed self");
        com.tencent.mm.sdk.platformtools.u3.i(new s65.z0(this), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        return true;
    }

    public final void j(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("intent_extra_download_type", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.UpdaterService", "handleCommand, downloadType = %d", java.lang.Integer.valueOf(intExtra));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sandbox_pss_opt_v2, 1) == 1) {
            if (intExtra == 1 || intExtra == 4 || intExtra == 7) {
                f192332q = 300000L;
            } else {
                f192332q = 1800000L;
            }
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f192335n;
        b4Var.d();
        long j17 = f192332q;
        b4Var.c(j17, j17);
        f192332q = 1800000L;
        s65.w wVar = (s65.w) ((java.util.HashMap) this.f192333i).get(java.lang.Integer.valueOf(intExtra));
        if (wVar != null) {
            boolean e17 = wVar.e(intent);
            com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.UpdaterService", "handleCommand ret = %b", java.lang.Boolean.valueOf(e17));
            if (e17) {
                return;
            }
            i();
        }
    }
}
