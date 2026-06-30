package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f183536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubService f183537e;

    public i0(com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService, android.content.Intent intent) {
        this.f183537e = webViewStubService;
        this.f183536d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService = this.f183537e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f183536d);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(webViewStubService, arrayList.toArray(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$16", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        webViewStubService.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(webViewStubService, "com/tencent/mm/plugin/webview/stub/WebViewStubService$16", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
