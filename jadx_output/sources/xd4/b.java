package xd4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public fk4.k f453626a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f453627b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f453628c;

    public b(fk4.k downloader) {
        kotlin.jvm.internal.o.g(downloader, "downloader");
        this.f453626a = downloader;
        this.f453627b = kotlinx.coroutines.z0.b();
        this.f453628c = this.f453626a.f263633u;
    }

    public final fk4.k a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloader", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper");
        fk4.k kVar = this.f453626a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloader", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper");
        return kVar;
    }
}
