package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class y0 implements kd0.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.n1 f136937a;

    public y0(com.tencent.mm.plugin.finder.webview.n1 n1Var) {
        this.f136937a = n1Var;
    }

    @Override // kd0.n2
    public void a() {
        com.tencent.mm.plugin.finder.webview.n1 n1Var = this.f136937a;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = n1Var.f136902f;
        if (k0Var == null || !k0Var.i()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.finder.webview.z0(n1Var));
    }
}
