package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes8.dex */
public class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.ResultReceiver f183561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubTempUI f183562e;

    public p0(com.tencent.mm.plugin.webview.stub.WebViewStubTempUI webViewStubTempUI, android.os.ResultReceiver resultReceiver) {
        this.f183562e = webViewStubTempUI;
        this.f183561d = resultReceiver;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f183561d.send(1, null);
        this.f183562e.finish();
    }
}
