package ra3;

/* loaded from: classes8.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f393496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f393497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ra3.g0 f393498g;

    public f0(ra3.g0 g0Var, android.content.Context context, java.lang.String str, long j17, long j18) {
        this.f393498g = g0Var;
        this.f393495d = str;
        this.f393496e = j17;
        this.f393497f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f393495d;
        ra3.g0 g0Var = this.f393498g;
        g0Var.getClass();
        long j17 = this.f393497f;
        long j18 = this.f393496e;
        try {
            if (java.lang.Math.abs(j17 - j18) > 10 || j17 - g0Var.f393500a <= 1 || com.tencent.mm.sdk.platformtools.t8.K0(str) || (!(str.toLowerCase().contains("screenshot") || str.contains("截屏") || str.contains("截图")) || str.equals(g0Var.f393501b))) {
                str = null;
                j18 = 0;
            } else {
                g0Var.f393500a = j17;
                g0Var.f393501b = str;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("LiteAppUtils", "summerscreenshot added path: " + str + ", time: " + j18);
            ((com.tencent.mm.sdk.platformtools.f7) g0Var.f393503d.get()).z0(str, j18, false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("LiteAppUtils", "summerscreenshot fail e:" + th6.getMessage());
        }
    }
}
