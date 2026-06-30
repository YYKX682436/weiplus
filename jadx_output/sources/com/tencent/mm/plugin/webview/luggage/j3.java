package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class j3 implements kd0.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w3 f182241a;

    public j3(com.tencent.mm.plugin.webview.luggage.w3 w3Var) {
        this.f182241a = w3Var;
    }

    @Override // kd0.n2
    public void a() {
        com.tencent.mm.plugin.webview.luggage.w3 w3Var = this.f182241a;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = w3Var.f182667h;
        if (k0Var == null || !k0Var.i()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.luggage.l3(w3Var));
    }
}
