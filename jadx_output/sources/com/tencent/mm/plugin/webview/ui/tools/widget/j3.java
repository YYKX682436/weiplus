package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f187343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f187344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f187345g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p3 f187346h;

    public j3(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, java.lang.String str, long j17, int i17, float f17) {
        this.f187346h = p3Var;
        this.f187342d = str;
        this.f187343e = j17;
        this.f187344f = i17;
        this.f187345g = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var = this.f187346h;
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = p3Var.f187495f;
        if (u3Var.f187554g == null || (wVar = u3Var.f187552e) == null || !wVar.c().f(42)) {
            return;
        }
        p3Var.f187495f.f187554g.C(this.f187342d, this.f187343e, this.f187344f, this.f187345g);
    }
}
