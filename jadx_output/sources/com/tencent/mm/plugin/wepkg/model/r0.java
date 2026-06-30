package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class r0 extends com.tencent.mm.plugin.wepkg.model.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f188459c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.p0 f188461e;

    public r0(com.tencent.mm.plugin.wepkg.model.p0 p0Var, com.tencent.mm.plugin.wepkg.model.a aVar, boolean z17, java.lang.String str) {
        this.f188461e = p0Var;
        this.f188458b = aVar;
        this.f188459c = z17;
        this.f188460d = str;
    }

    @Override // com.tencent.mm.plugin.wepkg.model.a
    public void a(com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask baseWepkgProcessTask) {
        boolean z17 = baseWepkgProcessTask instanceof com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask;
        java.lang.String str = this.f188460d;
        boolean z18 = this.f188459c;
        com.tencent.mm.plugin.wepkg.model.p0 p0Var = this.f188461e;
        if (!z17) {
            p0Var.f(z18, str, 2);
            return;
        }
        com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask wepkgDownloadProcessTask = (com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask) baseWepkgProcessTask;
        com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode wePkgDownloader$IWepkgUpdateCallback$RetCode = wepkgDownloadProcessTask.f188360t;
        com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode wePkgDownloader$IWepkgUpdateCallback$RetCode2 = com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader$IWepkgUpdateCallback$RetCode.OK;
        com.tencent.mm.plugin.wepkg.model.a aVar = this.f188458b;
        if (wePkgDownloader$IWepkgUpdateCallback$RetCode == wePkgDownloader$IWepkgUpdateCallback$RetCode2 && !com.tencent.mm.sdk.platformtools.t8.K0(wepkgDownloadProcessTask.f188352i) && !com.tencent.mm.sdk.platformtools.t8.K0(wepkgDownloadProcessTask.f188359s)) {
            com.tencent.mm.plugin.wepkg.model.o0.h(wepkgDownloadProcessTask.f188352i, wepkgDownloadProcessTask.f188359s, true, aVar);
            return;
        }
        if (aVar != null) {
            com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
            wepkgCrossProcessTask.f188333f = false;
            aVar.a(wepkgCrossProcessTask);
        }
        p0Var.f(z18, str, 1);
    }
}
