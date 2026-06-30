package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f183549f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f183550g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.o f183551h;

    public n(com.tencent.mm.plugin.webview.stub.o oVar, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f183551h = oVar;
        this.f183547d = str;
        this.f183548e = str2;
        this.f183549f = bundle;
        this.f183550g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.stub.o oVar = this.f183551h;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(oVar.f183557d.f183472g).W6(null, null, null);
        oVar.f183557d.finish();
        try {
            oVar.f183557d.f183470e.aj(this.f183547d, this.f183548e, this.f183549f, this.f183550g);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.callbackerWrapper", "wrapper onHandleEnd, ex = " + e17.getMessage());
        }
    }
}
