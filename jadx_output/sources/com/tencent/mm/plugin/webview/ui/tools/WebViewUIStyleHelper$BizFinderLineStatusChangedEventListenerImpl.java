package com.tencent.mm.plugin.webview.ui.tools;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class WebViewUIStyleHelper$BizFinderLineStatusChangedEventListenerImpl extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BizFinderLineStatusChangedEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f183886d;

    public WebViewUIStyleHelper$BizFinderLineStatusChangedEventListenerImpl(com.tencent.mm.plugin.webview.ui.tools.ld ldVar) {
        super(com.tencent.mm.app.a0.f53288d);
        this.f183886d = new java.lang.ref.WeakReference(ldVar);
        this.__eventId = -1230141771;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.BizFinderLineStatusChangedEvent bizFinderLineStatusChangedEvent) {
        java.lang.ref.WeakReference weakReference = this.f183886d;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "callback");
        ((com.tencent.mm.plugin.webview.ui.tools.ld) weakReference.get()).n();
        return false;
    }
}
