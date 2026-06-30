package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p3 f187444f;

    public n3(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, java.lang.String str, int i17) {
        this.f187444f = p3Var;
        this.f187442d = str;
        this.f187443e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f187444f.f187495f.f187554g;
        if (nVar != null) {
            nVar.p0(this.f187442d, this.f187443e);
        }
    }
}
