package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class l3 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent f140359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener f140360e;

    public l3(com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener notifyGameWebviewOperationListener, com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent) {
        this.f140360e = notifyGameWebviewOperationListener;
        this.f140359d = notifyGameWebviewOperationEvent;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload complete. total time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.f140181g));
        if (bundle == null) {
            return;
        }
        this.f140360e.f(this.f140359d, bundle);
    }
}
