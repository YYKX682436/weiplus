package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask f188435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188436e;

    public k0(com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask, com.tencent.mm.plugin.wepkg.model.a aVar) {
        this.f188435d = wepkgCrossProcessTask;
        this.f188436e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = this.f188435d;
        wepkgCrossProcessTask.z();
        com.tencent.mm.plugin.wepkg.model.a aVar = this.f188436e;
        if (aVar != null) {
            aVar.a(wepkgCrossProcessTask);
        }
    }
}
