package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class b0 implements xz4.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.c0 f188398a;

    public b0(com.tencent.mm.plugin.wepkg.model.c0 c0Var) {
        this.f188398a = c0Var;
    }

    @Override // xz4.h
    public void a(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode wePkgDownloader$IWepkgUpdateCallback$RetCode) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgProcessTaskPerformer", "onPkgUpdatingCallback errCode:%s", wePkgDownloader$IWepkgUpdateCallback$RetCode);
        com.tencent.mm.plugin.wepkg.model.c0 c0Var = this.f188398a;
        com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask wepkgDownloadProcessTask = c0Var.f188400d;
        wepkgDownloadProcessTask.f188352i = str;
        wepkgDownloadProcessTask.f188359s = str2;
        wepkgDownloadProcessTask.f188360t = wePkgDownloader$IWepkgUpdateCallback$RetCode;
        com.tencent.mm.plugin.wepkg.model.a aVar = c0Var.f188401e;
        if (aVar != null) {
            aVar.a(wepkgDownloadProcessTask);
        }
    }
}
