package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask f188441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188442e;

    public m0(com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask, com.tencent.mm.plugin.wepkg.model.a aVar) {
        this.f188441d = wepkgCrossProcessTask;
        this.f188442e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = this.f188441d;
        wepkgCrossProcessTask.z();
        com.tencent.mm.plugin.wepkg.model.a aVar = this.f188442e;
        if (aVar != null) {
            aVar.a(wepkgCrossProcessTask);
        }
    }
}
