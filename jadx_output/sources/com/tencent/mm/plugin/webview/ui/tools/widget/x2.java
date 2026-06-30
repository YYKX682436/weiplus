package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f187597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p3 f187598e;

    public x2(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, java.util.Map map) {
        this.f187598e = p3Var;
        this.f187597d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f187598e.f187495f.f187554g;
        if (nVar != null) {
            nVar.r0(this.f187597d);
        }
    }
}
