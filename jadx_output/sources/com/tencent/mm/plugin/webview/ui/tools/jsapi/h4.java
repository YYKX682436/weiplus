package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class h4 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185164e;

    public h4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185164e = c1Var;
        this.f185163d = y2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int ordinal = ((pr4.a) obj).f357985a.ordinal();
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185164e;
        nw4.y2 y2Var = this.f185163d;
        if (ordinal == 0) {
            c1Var.i5(y2Var, y2Var.f341019i + ":fail", null);
        } else if (ordinal == 1) {
            c1Var.i5(y2Var, y2Var.f341019i + ":insufficient", null);
        } else if (ordinal == 2) {
            c1Var.i5(y2Var, y2Var.f341019i + ":intercept", null);
        }
        c1Var.getClass();
        return null;
    }
}
