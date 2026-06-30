package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes8.dex */
public class q0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubTempUI f183564d;

    public q0(com.tencent.mm.plugin.webview.stub.WebViewStubTempUI webViewStubTempUI) {
        this.f183564d = webViewStubTempUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f183564d.finish();
    }
}
