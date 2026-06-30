package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class g4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.h4 f184749d;

    public g4(com.tencent.mm.plugin.webview.ui.tools.h4 h4Var) {
        this.f184749d = h4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.webview.ui.tools.h4 h4Var = this.f184749d;
        g0Var.d(14217, h4Var.f184792g, 6, h4Var.f184794i, h4Var.f184789d, java.lang.Integer.valueOf(h4Var.f184797o.D));
        dialogInterface.dismiss();
    }
}
