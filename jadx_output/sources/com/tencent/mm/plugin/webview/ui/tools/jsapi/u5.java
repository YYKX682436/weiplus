package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class u5 implements com.tencent.mm.ui.widget.snackbar.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185436a;

    public u5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var) {
        this.f185436a = c1Var;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void a() {
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onHide() {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185436a;
        c1Var.i5(c1Var.f184976e, "send_fav_msg:ok", null);
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onShow() {
    }
}
