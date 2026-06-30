package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask f188428e;

    public i0(com.tencent.mm.plugin.wepkg.model.a aVar, com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask) {
        this.f188427d = aVar;
        this.f188428e = wepkgCrossProcessTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = this.f188428e;
        com.tencent.mm.plugin.wepkg.model.a aVar = this.f188427d;
        if (aVar != null) {
            aVar.a(wepkgCrossProcessTask);
        }
        wepkgCrossProcessTask.x();
    }
}
