package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes8.dex */
public class o0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.ResultReceiver f183558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubTempUI f183559e;

    public o0(com.tencent.mm.plugin.webview.stub.WebViewStubTempUI webViewStubTempUI, android.os.ResultReceiver resultReceiver) {
        this.f183559e = webViewStubTempUI;
        this.f183558d = resultReceiver;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f183558d.send(0, null);
        this.f183559e.finish();
    }
}
