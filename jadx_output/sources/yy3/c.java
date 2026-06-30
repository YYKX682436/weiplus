package yy3;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: l, reason: collision with root package name */
    public static final yy3.c f468448l = new yy3.c();

    /* renamed from: m, reason: collision with root package name */
    public static final float f468449m = 1.15f;

    /* renamed from: e, reason: collision with root package name */
    public long f468454e;

    /* renamed from: f, reason: collision with root package name */
    public yy3.a f468455f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f468456g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f468457h;

    /* renamed from: k, reason: collision with root package name */
    public int f468460k;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f468450a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f468451b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f468452c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f468453d = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f468458i = new android.graphics.Rect();

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Rect f468459j = new android.graphics.Rect();

    public static void a(yy3.c cVar) {
        if (!((java.util.HashMap) cVar.f468450a).isEmpty()) {
            long j17 = cVar.f468454e;
            if (j17 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BankCardDetectQueue", "%d decode hit cache", java.lang.Long.valueOf(j17));
                s75.d.b(new yy3.b(cVar, cVar.f468454e), "BankCardDetectQueue_detect_task");
                return;
            }
        }
        yy3.a aVar = cVar.f468455f;
        if (aVar != null) {
            long j18 = cVar.f468454e;
            com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = ((com.tencent.mm.plugin.scanner.view.i) aVar).f159941a;
            if (j18 == scanCardRectView.f159889q) {
                scanCardRectView.k(0L);
            }
        }
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankCardDetectQueue", "release");
        long j17 = this.f468454e;
        synchronized (this.f468451b) {
            if (this.f468454e == j17) {
                this.f468454e = 0L;
                this.f468460k = 0;
                this.f468455f = null;
                ((java.util.HashMap) this.f468450a).clear();
            }
        }
        synchronized (this.f468452c) {
            if (this.f468456g) {
                boolean z17 = et5.h.f256676a;
                com.tencent.wechat.aff.iam_scan.c.f216974b.e();
            }
            this.f468456g = false;
        }
    }
}
