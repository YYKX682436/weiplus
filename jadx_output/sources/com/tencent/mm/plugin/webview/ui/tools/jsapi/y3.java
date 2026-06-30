package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class y3 implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185562b;

    public y3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185562b = c1Var;
        this.f185561a = y2Var;
    }

    @Override // r35.n3
    public void a(int i17) {
        nw4.y2 y2Var = this.f185561a;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185562b;
        if (i17 == -2) {
            c1Var.i5(y2Var, "add_contact:added", null);
            return;
        }
        if (i17 == -1) {
            c1Var.i5(y2Var, "add_contact:fail", null);
            return;
        }
        if (i17 == 0) {
            c1Var.i5(y2Var, "add_contact:cancel", null);
        } else if (i17 != 1) {
            c1Var.i5(y2Var, "add_contact:fail", null);
        } else {
            c1Var.i5(y2Var, "add_contact:ok", null);
        }
    }
}
