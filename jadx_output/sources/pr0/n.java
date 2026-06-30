package pr0;

/* loaded from: classes14.dex */
public abstract class n extends pr0.g {

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f357896q = "";

    /* renamed from: m, reason: collision with root package name */
    public final android.os.HandlerThread f357897m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f357898n;

    /* renamed from: o, reason: collision with root package name */
    public final android.os.Handler f357899o;

    /* renamed from: p, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f357900p = kotlinx.coroutines.sync.l.a(false, 1, null);

    static {
        ((ku5.t0) ku5.t0.f312615d).g(pr0.h.f357841d);
    }

    public n() {
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("CameraKit-Use", 10);
        this.f357897m = a17;
        a17.start();
        android.os.Handler handler = new android.os.Handler(a17.getLooper());
        this.f357899o = handler;
        this.f357898n = kotlinx.coroutines.z0.a(t26.e.b(handler, null, 1, null));
        this.f357838i.registerDisplayListener(this, handler);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Coroutines", "[" + hashCode() + "]CameraKit new instance,camera thread id:" + a17.getThreadId());
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        l("execute", new pr0.m(runnable, null));
    }

    public kotlinx.coroutines.r2 l(java.lang.String str, yz5.p block) {
        kotlin.jvm.internal.o.g(block, "block");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Coroutines", "Launch Start[" + str + ']');
        return kotlinx.coroutines.l.d(this.f357898n, null, null, new pr0.k(block, str, java.lang.System.currentTimeMillis(), this, null), 3, null);
    }

    public kotlinx.coroutines.r2 m(java.lang.String str, yz5.p block) {
        kotlin.jvm.internal.o.g(block, "block");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Coroutines", "SyncLaunch Start[" + str + ']');
        return kotlinx.coroutines.l.d(this.f357898n, null, null, new pr0.l(str, this, java.lang.System.currentTimeMillis(), block, null), 3, null);
    }

    public final void n(java.lang.String str, long j17) {
        if (qr0.a.f366057c) {
            com.tencent.mm.autogen.mmdata.rpt.CameraKitMethodReportStruct cameraKitMethodReportStruct = new com.tencent.mm.autogen.mmdata.rpt.CameraKitMethodReportStruct();
            cameraKitMethodReportStruct.f55552i = cameraKitMethodReportStruct.b("SessionId", java.lang.String.valueOf(this.f357833d), true);
            if (str == null) {
                str = "";
            }
            cameraKitMethodReportStruct.f55547d = cameraKitMethodReportStruct.b("MethodName", str, true);
            cameraKitMethodReportStruct.f55548e = (int) j17;
            cameraKitMethodReportStruct.f55551h = cameraKitMethodReportStruct.b("CpuInfo", f357896q, true);
            cameraKitMethodReportStruct.k();
        }
    }
}
