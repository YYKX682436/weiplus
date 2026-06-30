package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask f188422e;

    public f0(com.tencent.mm.plugin.wepkg.model.a aVar, com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask) {
        this.f188421d = aVar;
        this.f188422e = wepkgCrossProcessTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = this.f188422e;
        com.tencent.mm.plugin.wepkg.model.a aVar = this.f188421d;
        if (aVar != null) {
            aVar.a(wepkgCrossProcessTask);
        }
        wepkgCrossProcessTask.x();
    }
}
