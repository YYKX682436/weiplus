package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f183573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f183574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.s f183575f;

    public u(com.tencent.mm.plugin.webview.stub.s sVar, android.os.Bundle bundle, android.os.Bundle bundle2) {
        this.f183575f = sVar;
        this.f183573d = bundle;
        this.f183574e = bundle2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        intent.putExtras(this.f183573d);
        intent.putExtra("isFromWebView", true);
        intent.putExtra("_stat_obj", this.f183574e);
        ((com.tencent.mm.app.y7) dw4.a.f244297a).t(intent, this.f183575f.f183566d);
    }
}
