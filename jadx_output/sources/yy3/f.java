package yy3;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: m, reason: collision with root package name */
    public static final yy3.f f468467m = new yy3.f();

    /* renamed from: e, reason: collision with root package name */
    public long f468472e;

    /* renamed from: f, reason: collision with root package name */
    public yy3.e f468473f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f468474g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f468475h;

    /* renamed from: i, reason: collision with root package name */
    public int f468476i;

    /* renamed from: j, reason: collision with root package name */
    public int f468477j;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f468468a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f468469b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f468470c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f468471d = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.Rect f468478k = new android.graphics.Rect();

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.Rect f468479l = new android.graphics.Rect();

    public static void a(yy3.f fVar) {
        if (!((java.util.HashMap) fVar.f468468a).isEmpty()) {
            long j17 = fVar.f468472e;
            if (j17 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LicenseCardDecodeQueue", "%d decode hit cache", java.lang.Long.valueOf(j17));
                s75.d.b(new yy3.d(fVar, fVar.f468472e), "BankCardDecodeQueue_decode_task");
                return;
            }
        }
        yy3.e eVar = fVar.f468473f;
        if (eVar != null) {
            long j18 = fVar.f468472e;
            com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = ((com.tencent.mm.plugin.scanner.view.n) eVar).f159963e;
            if (j18 == scanCardRectView.f159889q) {
                scanCardRectView.k(0L);
            }
        }
    }

    public void b(byte[] bArr, android.graphics.Point point, int i17, android.graphics.Rect rect) {
        synchronized (this.f468469b) {
            if (rect.width() != this.f468478k.width() || rect.height() != this.f468478k.height()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LicenseCardDecodeQueue", "release");
                synchronized (this.f468470c) {
                    if (this.f468474g) {
                        com.tencent.mm.plugin.licence.model.LibCardRecog.recognizeCardRelease();
                    }
                    this.f468474g = false;
                }
                this.f468474g = false;
            }
        }
        if (!this.f468474g) {
            synchronized (this.f468470c) {
                this.f468478k = rect;
                int width = (((int) (rect.width() * 1.05d)) / 4) * 4;
                int height = (((int) (rect.height() * 1.05d)) / 4) * 4;
                this.f468479l.left = rect.left - ((width - rect.width()) / 2);
                this.f468479l.top = rect.top - ((height - rect.height()) / 2);
                android.graphics.Rect rect2 = this.f468479l;
                rect2.right = rect2.left + width;
                rect2.bottom = rect2.top + height;
                if (i17 % 180 != 0) {
                    int height2 = (point.y - rect2.height()) / 2;
                    int width2 = (point.x - this.f468479l.width()) / 2;
                    if (c()) {
                        width2 = rect.left;
                    }
                    this.f468479l = new android.graphics.Rect(height2, width2, this.f468479l.height() + height2, this.f468479l.width() + width2);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LicenseCardDecodeQueue", "init cropRect %s", this.f468479l);
                int recognizeCardInit = com.tencent.mm.plugin.licence.model.LibCardRecog.recognizeCardInit(this.f468479l.width(), this.f468479l.height(), this.f468476i);
                this.f468479l.width();
                this.f468479l.height();
                this.f468474g = recognizeCardInit == 0;
            }
        }
        if (this.f468474g) {
            synchronized (this.f468469b) {
                ((java.util.HashMap) this.f468468a).clear();
                ((java.util.HashMap) this.f468468a).put("param_preview_data", bArr);
                ((java.util.HashMap) this.f468468a).put("param_camera_resolution", point);
                ((java.util.HashMap) this.f468468a).put("param_camera_rotation", java.lang.Integer.valueOf(i17));
                if (!this.f468475h) {
                    long j17 = this.f468472e;
                    if (j17 != 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LicenseCardDecodeQueue", "%d submit decode license card", java.lang.Long.valueOf(j17));
                        this.f468471d.execute(new yy3.d(this, this.f468472e));
                    }
                }
            }
        }
    }

    public final boolean c() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_id_card_scan_v2, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.LicenseCardDecodeQueue", "id_card_scan_v2: %s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public void d(long j17) {
        synchronized (this.f468469b) {
            if (this.f468472e == j17) {
                this.f468472e = 0L;
                this.f468477j = 0;
                this.f468473f = null;
                ((java.util.HashMap) this.f468468a).clear();
            }
        }
    }
}
