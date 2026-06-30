package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p3 f187364f;

    public k3(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, java.lang.String str, int i17) {
        this.f187364f = p3Var;
        this.f187362d = str;
        this.f187363e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f187364f.f187495f.f187554g;
        if (nVar != null) {
            nVar.Q(this.f187362d, this.f187363e);
        }
    }
}
