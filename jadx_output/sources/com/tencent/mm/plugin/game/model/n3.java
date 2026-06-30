package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f140387d;

    public n3(com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener notifyGameWebviewOperationListener, java.lang.String str) {
        this.f140387d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set = com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.f140184m;
        java.lang.String str = this.f140387d;
        if (((java.util.HashSet) set).contains(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload webcore, time out");
            ((java.util.HashSet) set).remove(str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(939L, 3L, 1L);
        }
    }
}
