package h21;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f278276d;

    public i(int i17) {
        this.f278276d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f278276d + 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.recovery.reporter", "report crash count = " + i17);
        if (i17 < 0 || i17 > 10) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CompatReporter", "#reportRecoveryCrashCnt: recCrashCnt");
        ap.c.a(1, 0, "recCrashCnt", ap.d.a(), "", "crash-" + i17, "", "", "", "");
        jx3.f.INSTANCE.idkeyStat(1341L, i17 + 0, 1L, false);
    }
}
