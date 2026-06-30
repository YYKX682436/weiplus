package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class q implements xz4.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask f188454a;

    public q(com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask wepkgDownloadProcessTask) {
        this.f188454a = wepkgDownloadProcessTask;
    }

    @Override // xz4.h
    public void a(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode wePkgDownloader$IWepkgUpdateCallback$RetCode) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgDownloadProcessTask", "onPkgUpdatingCallback errCode:%s", wePkgDownloader$IWepkgUpdateCallback$RetCode);
        com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask wepkgDownloadProcessTask = this.f188454a;
        wepkgDownloadProcessTask.f188352i = str;
        wepkgDownloadProcessTask.f188359s = str2;
        wepkgDownloadProcessTask.f188360t = wePkgDownloader$IWepkgUpdateCallback$RetCode;
        wepkgDownloadProcessTask.x();
        wepkgDownloadProcessTask.c();
    }
}
