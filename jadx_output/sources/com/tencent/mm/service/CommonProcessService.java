package com.tencent.mm.service;

/* loaded from: classes12.dex */
public class CommonProcessService extends android.app.Service {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f193198g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.ref.WeakReference f193199h;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Handler f193200d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f193201e;

    /* renamed from: f, reason: collision with root package name */
    public final l85.l0 f193202f = new l85.a(this);

    public static void a(com.tencent.mm.service.CommonProcessService commonProcessService, java.lang.Boolean bool, java.lang.Runnable runnable) {
        commonProcessService.getClass();
        if (!bool.booleanValue()) {
            commonProcessService.f193200d.post(runnable);
            return;
        }
        if (commonProcessService.f193201e == null) {
            synchronized (commonProcessService) {
                if (commonProcessService.f193201e == null) {
                    int i17 = pu5.i.f358473b;
                    android.os.HandlerThread a17 = pu5.f.a("push-worker", 5);
                    a17.start();
                    commonProcessService.f193201e = new android.os.Handler(a17.getLooper());
                }
            }
        }
        commonProcessService.f193201e.post(runnable);
    }

    public static com.tencent.mm.service.MMService b(com.tencent.mm.service.CommonProcessService commonProcessService, java.lang.String str) {
        commonProcessService.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f193198g;
        com.tencent.mm.service.MMService mMService = (com.tencent.mm.service.MMService) concurrentHashMap.get(str);
        if (mMService != null) {
            return mMService;
        }
        com.tencent.mm.service.MMService mMService2 = (com.tencent.mm.service.MMService) java.lang.Class.forName(str).newInstance();
        mMService2.f193205e = concurrentHashMap;
        mMService2.f193206f = commonProcessService;
        concurrentHashMap.put(str, mMService2);
        return mMService2;
    }

    public java.lang.String c() {
        return "MicroMsg.MMProcessService";
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(c(), "onBind()");
        l85.j1.a(intent);
        return this.f193202f;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.tencent.mars.xlog.Log.i(c(), "onCreate()");
        java.lang.System.currentTimeMillis();
        this.f193200d = new android.os.Handler();
        super.onCreate();
        f193199h = new java.lang.ref.WeakReference(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(c(), "onDestroy()");
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(c(), "onRebind()");
        l85.j1.a(intent);
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public void onStart(android.content.Intent intent, int i17) {
        com.tencent.mars.xlog.Log.i(c(), "onStart()");
        l85.j1.a(intent);
        super.onStart(intent, i17);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.tencent.mars.xlog.Log.i(c(), "onStartCommand()");
        l85.j1.a(intent);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(c(), "onUnbind()");
        return super.onUnbind(intent);
    }
}
