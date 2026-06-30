package ho1;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ho1.c f282632a = new ho1.c();

    /* renamed from: b, reason: collision with root package name */
    public static volatile int f282633b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f282634c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f282635d;

    public final synchronized void a() {
        com.tencent.mars.xlog.Log.i("MM.RoamBackup.GlobalHolder", "[initialize] isInitialized=" + f282635d);
        if (f282635d) {
            return;
        }
        f282635d = true;
        com.tencent.wechat.aff.affroam.r0.f215973a = ho1.a.f282618a;
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.d();
    }
}
