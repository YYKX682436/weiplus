package or2;

/* loaded from: classes10.dex */
public class i implements android.view.Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f347644a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f347645b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Window f347646c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f347647d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f347648e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f347649f;

    /* renamed from: g, reason: collision with root package name */
    public final int f347650g;

    /* renamed from: h, reason: collision with root package name */
    public final long f347651h;

    /* renamed from: i, reason: collision with root package name */
    public final or2.h f347652i;

    /* renamed from: j, reason: collision with root package name */
    public long f347653j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f347654k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f347655l;

    public i(java.lang.String scene, android.view.View view, android.view.Window window, android.os.Handler handler, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(window, "window");
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f347644a = scene;
        this.f347645b = view;
        this.f347646c = window;
        this.f347647d = handler;
        this.f347648e = z17;
        this.f347649f = z18;
        int a17 = or2.k.a(window);
        this.f347650g = 1000 / a17;
        this.f347651h = java.util.concurrent.TimeUnit.SECONDS.toNanos(1L) / a17;
        this.f347652i = new or2.h(scene, a17);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f347654k = true;
    }

    public boolean a() {
        boolean z17;
        or2.h frameInfo = this.f347652i;
        long j17 = frameInfo.f347634g;
        if (frameInfo.f347635h <= 0) {
            frameInfo.f347635h = java.lang.System.nanoTime();
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17) {
            return false;
        }
        android.content.Context context = this.f347645b.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[scrollToFps] commentScene:");
        sb6.append(V6.getInteger(5));
        sb6.append(" scene:");
        java.lang.String scene = this.f347644a;
        sb6.append(scene);
        sb6.append(' ');
        sb6.append(frameInfo);
        com.tencent.mars.xlog.Log.i("Finder.FpsMonitor", sb6.toString());
        or2.o oVar = or2.o.f347664a;
        V6.getInteger(5);
        int a17 = frameInfo.a();
        kotlin.jvm.internal.o.g(scene, "scene");
        if (or2.u.f347685e) {
            pm0.v.O("Finder.FinderFpsReporter", new or2.n(a17, scene));
        }
        if (this.f347648e) {
            long j18 = frameInfo.f347642o;
            if (j18 != 0) {
                or2.j jVar = or2.j.f347656a;
                or2.j.f347658c.d(java.lang.Long.valueOf(j18), frameInfo);
                kotlin.jvm.internal.o.g(frameInfo, "frameInfo");
                pm0.v.O("Finder.FinderFpsReporter", new or2.m(frameInfo, V6));
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    @Override // android.view.Window.OnFrameMetricsAvailableListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFrameMetricsAvailable(android.view.Window r18, android.view.FrameMetrics r19, int r20) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: or2.i.onFrameMetricsAvailable(android.view.Window, android.view.FrameMetrics, int):void");
    }
}
