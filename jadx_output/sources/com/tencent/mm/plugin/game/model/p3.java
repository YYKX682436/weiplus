package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class p3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f140406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent f140407e;

    public p3(com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener notifyGameWebviewOperationListener, android.content.Context context, com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent) {
        this.f140406d = context;
        this.f140407e = notifyGameWebviewOperationEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        j45.l.j(this.f140406d, "webview", ".ui.tools.WebViewUI", this.f140407e.f54542g.f7435c, null);
    }
}
