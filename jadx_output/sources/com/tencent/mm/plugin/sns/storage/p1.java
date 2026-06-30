package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes.dex */
public final class p1 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166098a;

    public p1(java.lang.String str) {
        this.f166098a = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.PlayState$Companion$preload$1$1");
        com.tencent.mars.xlog.Log.e("PlayState", "tagIcon " + this.f166098a + "  failed!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.PlayState$Companion$preload$1$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.PlayState$Companion$preload$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.PlayState$Companion$preload$1$1");
    }

    @Override // za4.e0
    public void c(java.lang.String path) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.PlayState$Companion$preload$1$1");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("PlayState", "onDownloaded tagIcon " + this.f166098a + "  path " + path);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.PlayState$Companion$preload$1$1");
    }
}
