package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class x8 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 f185542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185543e;

    public x8(com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var, nw4.y2 y2Var) {
        this.f185542d = e9Var;
        this.f185543e = y2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        nw4.y2 y2Var = this.f185543e;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var = this.f185542d;
        if (i18 == -1) {
            e9Var.f185084a.i5(y2Var, "ok", kz5.b1.e(new jz5.l("err_msg", "ok")));
        } else {
            e9Var.f185084a.i5(y2Var, "cancel", kz5.b1.e(new jz5.l("err_msg", "cancel")));
        }
    }
}
