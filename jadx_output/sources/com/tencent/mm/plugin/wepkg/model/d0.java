package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask f188412e;

    public d0(com.tencent.mm.plugin.wepkg.model.a aVar, com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask wepkgDownloadProcessTask) {
        this.f188411d = aVar;
        this.f188412e = wepkgDownloadProcessTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask wepkgDownloadProcessTask = this.f188412e;
        com.tencent.mm.plugin.wepkg.model.a aVar = this.f188411d;
        if (aVar != null) {
            aVar.a(wepkgDownloadProcessTask);
        }
        wepkgDownloadProcessTask.x();
    }
}
