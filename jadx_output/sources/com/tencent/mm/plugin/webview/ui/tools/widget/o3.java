package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p3 f187460f;

    public o3(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, java.lang.String str, int i17) {
        this.f187460f = p3Var;
        this.f187458d = str;
        this.f187459e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f187460f.f187495f.f187554g;
        if (nVar != null) {
            nVar.o0(this.f187458d, this.f187459e);
        }
    }
}
