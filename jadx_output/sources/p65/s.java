package p65;

/* loaded from: classes12.dex */
public class s extends p65.a {

    /* renamed from: c, reason: collision with root package name */
    public final android.app.Application f352450c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f352451d;

    /* renamed from: e, reason: collision with root package name */
    public final long f352452e = java.lang.System.currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f352453f = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public s() {
        long j17 = com.tencent.mm.app.x.f53907b;
        int[] iArr = nm.a.f338400a;
        gm0.c2.f273171a = j17;
        this.f352450c = com.tencent.mm.sdk.platformtools.i.a();
        this.f352451d = bm5.f1.a();
    }

    public static void h(p65.s sVar) {
        java.util.Map map = sVar.f352453f;
        try {
            if (!map.containsKey("guestCrashInfo")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.IsolatedStartupRoutine", "onWVAGuestProcessCrash: Skip updating crashInfo");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.IsolatedStartupRoutine", "onWVAGuestProcessCrash: Updating crashInfo");
            android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) map.get("guestCrashInfo");
            java.util.Objects.requireNonNull(parcelFileDescriptor);
            java.io.FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileDescriptor);
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileDescriptor);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, 0, fileInputStream.read(bArr)));
                    jSONObject.getJSONArray("crashTimes").put(java.lang.System.currentTimeMillis() / 1000);
                    fileOutputStream.getChannel().truncate(0L);
                    fileOutputStream.write(jSONObject.toString().getBytes());
                    fileOutputStream.close();
                    fileInputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.XWeb.IsolatedStartupRoutine", e17, "onWVAGuestProcessCrash: failed", new java.lang.Object[0]);
        }
    }

    @Override // p65.a
    public void d() {
        boolean equals = android.os.Build.MANUFACTURER.equals("samsung");
        android.app.Application application = this.f352450c;
        if (equals && android.os.Build.VERSION.SDK_INT <= 24) {
            application.registerActivityLifecycleCallbacks(new um0.d(application));
        }
        com.tencent.mm.legacy.app.WeChatSplash.a();
        ku5.u.a(application.getApplicationContext(), new com.tencent.mm.booter.p3());
    }

    @Override // p65.a
    public void e(android.app.Application application) {
        im0.a.f292163b = android.os.SystemClock.elapsedRealtime();
        java.lang.System.currentTimeMillis();
        fs.k2 k2Var = fs.k2.INSTANCE;
        com.tencent.mm.app.q0 q0Var = com.tencent.mm.app.q0.INSTANCE;
        fs.h[] hVarArr = fs.g.f266084a;
        if (hVarArr[0] == null) {
            synchronized (hVarArr) {
                if (hVarArr[0] == null) {
                    fs.g.f266086c = application;
                    hVarArr[0] = k2Var;
                    fs.g.f266085b = q0Var;
                }
            }
        }
        i95.n0.d(application, (i95.y) com.tencent.mm.app.p0.f53568d.b(), q0Var);
        java.lang.String str = this.f352451d;
        km0.c cVar = new km0.c(str, application);
        km0.a aVar = cVar.f308991e;
        long j17 = this.f352452e;
        aVar.f308981a = j17;
        if (str.contains("isolated_process2")) {
            ix5.h.f295631b.f(this.f352450c);
            com.tencent.mm.minigame.m1 loggerFactory = com.tencent.mm.minigame.m1.f69109c;
            kotlin.jvm.internal.o.g(loggerFactory, "loggerFactory");
            com.tencent.shadow.core.common.LoggerFactory.setILoggerFactory(loggerFactory);
            com.tencent.shadow.dynamic.host.HostOpenPathDelegator.setCallback(new p65.p(this));
            com.tencent.mm.app.i4.a(new p65.q(this));
            return;
        }
        com.tencent.xweb.b3.f220214b = j17;
        vx5.n0.f441383a = new p65.r(this);
        by5.s0.f36595c = com.tencent.mm.xwebutil.i0.f214842b;
        com.tencent.xweb.b0.f220211a = com.tencent.mm.xwebutil.i0.f214845e;
        android.content.Context context = cVar.f308989c;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        com.tencent.mm.vfs.b3.E = context;
        application.getClassLoader();
        fp.d0.n("stlport_shared");
        application.getClassLoader();
        fp.d0.n("c++_shared");
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.IsolatedStartupRoutine", "is plain process. load nothing");
        com.tencent.mm.legacy.app.WeChatSplash.b(cVar, null);
        com.tencent.mm.app.e6.f53408a = null;
        com.tencent.mm.app.e6.f53409b = "com.tencent.mm.boot";
    }
}
