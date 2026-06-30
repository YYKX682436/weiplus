package u71;

/* loaded from: classes13.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final u71.z f425116a = new u71.z();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f425117b;

    public final synchronized void a() {
        if (f425117b) {
            return;
        }
        f425117b = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.URInit", "init ur");
        com.tencent.unit_rc.LibraryLoader.Companion companion = com.tencent.unit_rc.LibraryLoader.INSTANCE;
        companion.setLoader(new u71.u());
        companion.load("unit_rc");
        com.tencent.unit_rc.Executor.INSTANCE.setExecutor(new u71.v());
        com.tencent.unit_rc.ur.ErrorReportCpp.INSTANCE.registerErrorReport(u71.w.f425113d);
        com.tencent.unit_rc.ur.ThreadUtilsCpp.INSTANCE.registerAsyncRun(u71.x.f425114d);
        com.tencent.mars.xlog.Log.i("MicroMsg.URInit", "init ur end");
    }
}
