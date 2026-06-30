package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask f188430e;

    public j0(com.tencent.mm.plugin.wepkg.model.a aVar, com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask) {
        this.f188429d = aVar;
        this.f188430e = wepkgCrossProcessTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = this.f188430e;
        com.tencent.mm.plugin.wepkg.model.a aVar = this.f188429d;
        if (aVar != null) {
            aVar.a(wepkgCrossProcessTask);
        }
        wepkgCrossProcessTask.x();
    }
}
