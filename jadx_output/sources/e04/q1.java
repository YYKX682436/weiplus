package e04;

/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final e04.q1 f246075d = new e04.q1();

    public q1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_scan_camera_task_wx_thread_tag_max_num, 5));
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraThreadPoolManager", "scanConfig threadTagMaxNum " + valueOf.intValue());
        return valueOf;
    }
}
