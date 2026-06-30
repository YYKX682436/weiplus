package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class i4 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185191e;

    public i4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185191e = c1Var;
        this.f185190d = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        nw4.y2 y2Var = this.f185190d;
        sb6.append(y2Var.f341019i);
        sb6.append(":cancel");
        this.f185191e.i5(y2Var, sb6.toString(), null);
        return null;
    }
}
