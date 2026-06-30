package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.n f187352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187354f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187355g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f187356h;

    public j6(nw4.n nVar, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f187352d = nVar;
        this.f187353e = str;
        this.f187354f = str2;
        this.f187355g = bundle;
        this.f187356h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            nw4.n nVar = this.f187352d;
            if (nVar != null) {
                nVar.O(this.f187353e, this.f187354f, nw4.a.a(this.f187355g), this.f187356h);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PreloadWebViewStubCallback", "In jsapi onHandleEnd method, it happens something unwanted!");
        }
    }
}
