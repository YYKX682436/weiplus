package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class i6 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186253a;

    public i6(com.tencent.mm.ipcinvoker.r rVar) {
        this.f186253a = rVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        this.f186253a.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenBizPublishImage$IPCBizPublishImageRet(true, "", new com.tencent.mm.ipcinvoker.type.IPCString((java.lang.String) obj)));
    }
}
