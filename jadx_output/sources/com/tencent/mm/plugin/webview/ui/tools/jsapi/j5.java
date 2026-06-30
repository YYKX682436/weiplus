package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class j5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.l5 f185213d;

    public j5(com.tencent.mm.plugin.webview.ui.tools.jsapi.l5 l5Var) {
        this.f185213d = l5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185213d.f185252e;
        c1Var.U = false;
        android.content.Context context = c1Var.f184975d;
        if (context != null) {
            com.tencent.mm.sdk.platformtools.n2.c(context);
        }
    }
}
