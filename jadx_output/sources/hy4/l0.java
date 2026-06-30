package hy4;

/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f286149q = true;

    /* renamed from: r, reason: collision with root package name */
    public static int f286150r;

    /* renamed from: a, reason: collision with root package name */
    public long f286151a;

    /* renamed from: b, reason: collision with root package name */
    public final int f286152b;

    /* renamed from: c, reason: collision with root package name */
    public final int f286153c;

    /* renamed from: d, reason: collision with root package name */
    public long f286154d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f286155e;

    /* renamed from: f, reason: collision with root package name */
    public long f286156f;

    /* renamed from: g, reason: collision with root package name */
    public long f286157g;

    /* renamed from: h, reason: collision with root package name */
    public long f286158h;

    /* renamed from: i, reason: collision with root package name */
    public long f286159i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f286160j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f286161k;

    /* renamed from: l, reason: collision with root package name */
    public long f286162l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f286163m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f286164n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f286165o;

    /* renamed from: p, reason: collision with root package name */
    public int f286166p;

    public l0() {
        int i17;
        if (com.tencent.mm.pluginsdk.model.g4.f189323b >= 0) {
            com.tencent.mars.xlog.Log.i("XWeb.MM.WebViewKernelTestSwitcher", "webViewKernelMode, value:" + com.tencent.mm.pluginsdk.model.g4.f189323b + " (0-render&gpu/1-origin/2-render)");
            i17 = com.tencent.mm.pluginsdk.model.g4.f189323b;
        } else {
            com.tencent.xweb.z2 i18 = com.tencent.xweb.a3.i();
            com.tencent.mars.xlog.Log.i("XWeb.MM.WebViewKernelTestSwitcher", "webViewKernelMode, webviewMode:" + i18);
            if (i18 == com.tencent.xweb.z2.RENDER_SANDBOX || i18 == com.tencent.xweb.z2.RENDER_UNSANDBOX) {
                i17 = 2;
                com.tencent.mm.pluginsdk.model.g4.f189323b = 2;
            } else if (i18 == com.tencent.xweb.z2.GPU_RENDER_SANDBOX || i18 == com.tencent.xweb.z2.GPU_RENDER_UNSANDBOX) {
                i17 = 0;
                com.tencent.mm.pluginsdk.model.g4.f189323b = 0;
            } else {
                i17 = 1;
                com.tencent.mm.pluginsdk.model.g4.f189323b = 1;
            }
        }
        this.f286152b = i17;
        this.f286153c = com.tencent.mm.pluginsdk.model.g4.d();
    }
}
