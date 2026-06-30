package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.o f141285d;

    public k(com.tencent.mm.plugin.game.ui.chat_tab.o oVar) {
        this.f141285d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141285d;
        if (oVar.f141295a.isDestroyed() || oVar.f141295a.isFinishing()) {
            return;
        }
        java.lang.String str = oVar.f141297c;
        oVar.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "preload url: %s", str);
        com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent = new com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent();
        am.nl nlVar = notifyGameWebviewOperationEvent.f54542g;
        nlVar.f7433a = 3;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        nlVar.f7435c = intent;
        notifyGameWebviewOperationEvent.e();
    }
}
