package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class n2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185285e;

    public n2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str) {
        this.f185285e = c1Var;
        this.f185284d = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).aj(this.f185284d);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185285e;
        c1Var.i5(c1Var.f184976e, "send_app_msg:cancel", null);
    }
}
