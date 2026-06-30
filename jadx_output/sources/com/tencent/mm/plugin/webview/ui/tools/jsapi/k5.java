package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class k5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.l5 f185232d;

    public k5(com.tencent.mm.plugin.webview.ui.tools.jsapi.l5 l5Var) {
        this.f185232d = l5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.l5 l5Var = this.f185232d;
        l5Var.f185252e.S.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = l5Var.f185252e;
        c1Var.R = null;
        c1Var.U = true;
        c1Var.i5(c1Var.f184976e, "geo_location:fail_gps_closed", null);
    }
}
