package com.tencent.mm.plugin.wepkg.utils;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f188498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask f188500f;

    public m(long j17, com.tencent.mm.plugin.wepkg.model.a aVar, com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask) {
        this.f188498d = j17;
        this.f188499e = aVar;
        this.f188500f = wepkgCrossProcessTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUtil", "bind service time:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f188498d));
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = this.f188500f;
        com.tencent.mm.plugin.wepkg.model.a aVar = this.f188499e;
        if (aVar != null) {
            aVar.a(wepkgCrossProcessTask);
        }
        wepkgCrossProcessTask.x();
    }
}
