package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class i3 implements m02.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185189b;

    public i3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185189b = c1Var;
        this.f185188a = y2Var;
    }

    @Override // m02.c
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        nw4.y2 y2Var = this.f185188a;
        sb6.append(y2Var.f341019i);
        sb6.append(":ok");
        this.f185189b.i5(y2Var, sb6.toString(), null);
    }
}
