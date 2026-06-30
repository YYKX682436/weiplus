package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class t1 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185411e;

    public t1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185411e = c1Var;
        this.f185410d = y2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        int i17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.I1;
        int i18 = com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.M1;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185411e;
        c1Var.k5(i17, i18);
        c1Var.i5(this.f185410d, "chooseIdCard:cancel", null);
    }
}
