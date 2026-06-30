package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent f140506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener f140507e;

    public w3(com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener notifyGameWebviewOperationListener, com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent) {
        this.f140507e = notifyGameWebviewOperationListener;
        this.f140506d = notifyGameWebviewOperationEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "time out, turn page");
        java.lang.String str = com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.f140182h;
        this.f140507e.f(this.f140506d, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(939L, 2L, 1L);
    }
}
