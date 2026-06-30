package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask f188423d;

    public g0(com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask) {
        this.f188423d = wepkgCrossProcessTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f188423d.z();
    }
}
