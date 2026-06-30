package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f164338a;

    /* renamed from: b, reason: collision with root package name */
    public int f164339b;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f164343f = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public long f164340c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f164341d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f164342e = false;

    public k0(java.lang.String str, int i17) {
        this.f164338a = str;
        this.f164339b = i17;
    }

    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStartTime", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
        if (!this.f164341d) {
            synchronized (this.f164343f) {
                try {
                    if (!this.f164341d) {
                        this.f164341d = true;
                        this.f164340c = j17;
                    }
                } finally {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStartTime", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                }
            }
        }
    }
}
