package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask f188424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188425e;

    public h0(com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask, com.tencent.mm.plugin.wepkg.model.a aVar) {
        this.f188424d = wepkgCrossProcessTask;
        this.f188425e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = this.f188424d;
        wepkgCrossProcessTask.z();
        com.tencent.mm.plugin.wepkg.model.a aVar = this.f188425e;
        if (aVar != null) {
            aVar.a(wepkgCrossProcessTask);
        }
    }
}
