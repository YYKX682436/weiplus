package my3;

/* loaded from: classes13.dex */
public final class c0 {

    /* renamed from: k, reason: collision with root package name */
    public static final my3.u f332784k = new my3.u(null);

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f332785l = jz5.h.b(my3.t.f332844d);

    /* renamed from: a, reason: collision with root package name */
    public gy3.a f332786a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.wechat.rtos.WeChatApi f332787b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f332788c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f332789d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f332790e;

    /* renamed from: f, reason: collision with root package name */
    public my3.x f332791f;

    /* renamed from: g, reason: collision with root package name */
    public my3.v f332792g;

    /* renamed from: h, reason: collision with root package name */
    public my3.w f332793h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f332794i = "";

    /* renamed from: j, reason: collision with root package name */
    public boolean f332795j;

    public c0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "init service");
        java.lang.String valueOf = java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.o4.L().getString("patch_id", ""));
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "load so patchId".concat(valueOf));
        ly3.m mVar = ly3.m.f322273a;
        java.lang.String str = ly3.g.f322254a;
        fp.d0.c(mVar.b("wechat_rtos_service", valueOf));
        fp.d0.o("wechat_rtos_service");
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "finish load so");
    }

    public final synchronized void a() {
        gy3.d dVar;
        android.content.BroadcastReceiver broadcastReceiver;
        if (!this.f332789d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "already close");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onClose");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f332788c;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f332788c = null;
        gy3.a aVar = this.f332786a;
        if (aVar != null) {
            gy3.d dVar2 = (gy3.d) aVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "close");
            dVar2.a();
            dVar2.f277558f = 0L;
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "uninit");
            gy3.j jVar = dVar2.f277555c;
            if (jVar != null) {
                jVar.a();
            }
        }
        gy3.a aVar2 = this.f332786a;
        if (aVar2 != null && (broadcastReceiver = (dVar = (gy3.d) aVar2).f277563k) != null) {
            dVar.f277553a.unregisterReceiver(broadcastReceiver);
            dVar.f277563k = null;
        }
        this.f332786a = null;
        this.f332791f = null;
        this.f332792g = null;
        this.f332793h = null;
        this.f332789d = false;
        this.f332790e = false;
        this.f332795j = false;
        g32.c.c(g32.b.RTOS_SERVICE_DESTROY);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onClose end");
    }

    public final synchronized void b() {
        if (this.f332789d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "already init");
            return;
        }
        this.f332789d = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onInit");
        g32.c.c(g32.b.RTOS_SERVICE_CREATE);
        d();
        c();
        this.f332788c = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new my3.y(this), false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "init done");
    }

    public final void c() {
        if (this.f332787b == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "initAlita");
            com.tencent.wechat.rtos.WeChatApi weChatApi = new com.tencent.wechat.rtos.WeChatApi();
            this.f332787b = weChatApi;
            weChatApi.setCallback(new my3.a0(this));
            java.lang.String concat = "RTOS_".concat(wo.w0.k());
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(concat);
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "rtosDeviceId = " + concat + " hw_device_id = " + a17);
            com.tencent.mm.booter.s b17 = com.tencent.mm.booter.s.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.K0(b17.d(".com.tencent.mm.debug.log.mmlog")) && com.tencent.mm.sdk.platformtools.t8.m1(b17.a(".com.tencent.mm.debug.test.uploadLog"), false);
            java.lang.String g07 = lp0.b.g0();
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "xlog_path = " + g07);
            jy3.f fVar = new jy3.f();
            fVar.f302507e = "";
            fVar.f302506d = "";
            fVar.f302517r = "";
            fVar.f302518s = "";
            java.lang.String absolutePath = com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir().getAbsolutePath();
            java.lang.String absolutePath2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getAbsolutePath();
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "alita dir " + absolutePath2 + ' ' + absolutePath);
            fVar.f302507e = absolutePath;
            fVar.f302506d = absolutePath2;
            java.lang.String externalStorageState = android.os.Environment.getExternalStorageState();
            if (kotlin.jvm.internal.o.b("mounted", externalStorageState) || kotlin.jvm.internal.o.b("mounted_ro", externalStorageState)) {
                java.io.File externalFilesDir = com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalFilesDir("");
                java.io.File externalCacheDir = com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir();
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "external " + externalFilesDir + ' ' + externalCacheDir);
                if (externalFilesDir != null && externalCacheDir != null) {
                    fVar.f302517r = externalFilesDir.getAbsolutePath();
                    fVar.f302518s = externalCacheDir.getAbsolutePath();
                }
            }
            fVar.f302519t = g07;
            fVar.f302508f = a17;
            fVar.f302509g = "RtosWatch";
            fVar.f302510h = android.os.Build.BRAND;
            fVar.f302511i = wo.w0.m();
            fVar.f302512m = android.os.Build.VERSION.RELEASE;
            fVar.f302513n = 0;
            fVar.f302514o = z17;
            fVar.f302515p = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "begin start alita, isLogcatOpen " + z17);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.wechat.rtos.WeChatApi weChatApi2 = this.f332787b;
            if (weChatApi2 != null) {
                weChatApi2.start(fVar.toByteArray());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "initAlita end, consume " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public final void d() {
        if (this.f332786a == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "initChannel");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            gy3.d dVar = new gy3.d(context);
            this.f332786a = dVar;
            dVar.f277557e = new my3.b0(this);
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "initChannel end");
        }
    }
}
