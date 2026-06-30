package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask f188415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188416e;

    public e0(com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask, com.tencent.mm.plugin.wepkg.model.a aVar) {
        this.f188415d = wepkgCrossProcessTask;
        this.f188416e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = this.f188415d;
        wepkgCrossProcessTask.z();
        com.tencent.mm.plugin.wepkg.model.a aVar = this.f188416e;
        if (aVar != null) {
            aVar.a(wepkgCrossProcessTask);
        }
    }
}
