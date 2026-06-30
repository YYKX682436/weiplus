package com.tencent.mm.plugin.wepkg.utils;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask f188496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188497e;

    public l(com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask, com.tencent.mm.plugin.wepkg.model.a aVar) {
        this.f188496d = wepkgCrossProcessTask;
        this.f188497e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = this.f188496d;
        wepkgCrossProcessTask.z();
        com.tencent.mm.plugin.wepkg.model.a aVar = this.f188497e;
        if (aVar != null) {
            aVar.a(wepkgCrossProcessTask);
        }
    }
}
