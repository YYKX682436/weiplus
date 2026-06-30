package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class s0 extends com.tencent.mm.plugin.wepkg.model.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f188467c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f188468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.p0 f188469e;

    public s0(com.tencent.mm.plugin.wepkg.model.p0 p0Var, java.lang.String str, java.util.List list, boolean z17) {
        this.f188469e = p0Var;
        this.f188466b = str;
        this.f188467c = list;
        this.f188468d = z17;
    }

    @Override // com.tencent.mm.plugin.wepkg.model.a
    public void a(com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask baseWepkgProcessTask) {
        java.lang.Object obj = this.f188394a;
        boolean z17 = obj instanceof com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile;
        boolean z18 = this.f188468d;
        java.util.List list = this.f188467c;
        java.lang.String str = this.f188466b;
        com.tencent.mm.plugin.wepkg.model.p0 p0Var = this.f188469e;
        if (!z17 || !(baseWepkgProcessTask instanceof com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "object instanceof  WepkgPreloadFile is false");
            p0Var.c(str, list, z18);
            return;
        }
        com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask wepkgDownloadProcessTask = (com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask) baseWepkgProcessTask;
        com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile wepkgPreloadFile = (com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile) obj;
        if (wepkgDownloadProcessTask.f188360t != com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode.OK || com.tencent.mm.sdk.platformtools.t8.K0(wepkgDownloadProcessTask.f188359s)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "download, errCode:%s,  to loop", wepkgDownloadProcessTask.f188360t);
            p0Var.c(str, list, z18);
            return;
        }
        java.lang.String str2 = wepkgPreloadFile.f188363e;
        java.lang.String str3 = wepkgPreloadFile.f188366h;
        java.lang.String str4 = wepkgDownloadProcessTask.f188359s;
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 4002;
        com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile wepkgPreloadFile2 = wepkgCrossProcessTask.f188347o;
        wepkgPreloadFile2.f188363e = str2;
        wepkgPreloadFile2.f188366h = str3;
        wepkgPreloadFile2.f188365g = str4;
        wepkgPreloadFile2.f188372q = true;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wepkgCrossProcessTask.z();
        } else {
            wepkgCrossProcessTask.s();
        }
        p0Var.c(str, list, z18);
    }
}
