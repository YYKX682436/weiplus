package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p3 f187379f;

    public l3(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, java.lang.String str, int i17) {
        this.f187379f = p3Var;
        this.f187377d = str;
        this.f187378e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f187379f.f187495f.f187554g;
        if (nVar != null) {
            nVar.P(this.f187377d, this.f187378e);
        }
    }
}
