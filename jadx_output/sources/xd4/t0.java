package xd4;

/* loaded from: classes4.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public fk4.u f453707a;

    /* renamed from: b, reason: collision with root package name */
    public final xd4.p0 f453708b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f453709c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f453710d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453711e;

    public t0(fk4.u downloader, xd4.p0 callback) {
        kotlin.jvm.internal.o.g(downloader, "downloader");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f453707a = downloader;
        this.f453708b = callback;
        this.f453709c = kotlinx.coroutines.z0.b();
        this.f453711e = ((fk4.k) this.f453707a).f263633u;
    }

    public static final /* synthetic */ xd4.p0 a(xd4.t0 t0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCallback$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
        xd4.p0 p0Var = t0Var.f453708b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCallback$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
        return p0Var;
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("waitForComplete", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoResourceDownloaderDelegate", "waitForComplete");
        kotlinx.coroutines.l.d(this.f453709c, null, null, new xd4.r0(this, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("waitForComplete", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
    }
}
