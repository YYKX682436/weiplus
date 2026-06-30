package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask f188444e;

    public n0(com.tencent.mm.plugin.wepkg.model.a aVar, com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask) {
        this.f188443d = aVar;
        this.f188444e = wepkgCrossProcessTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = this.f188444e;
        com.tencent.mm.plugin.wepkg.model.a aVar = this.f188443d;
        if (aVar != null) {
            aVar.a(wepkgCrossProcessTask);
        }
        wepkgCrossProcessTask.x();
    }
}
