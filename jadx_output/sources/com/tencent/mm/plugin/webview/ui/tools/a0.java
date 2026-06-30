package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes10.dex */
public class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b0 f183888d;

    public a0(com.tencent.mm.plugin.webview.ui.tools.b0 b0Var) {
        this.f183888d = b0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.b0 b0Var = this.f183888d;
        b0Var.f183918d.f184166f.setResult(1);
        b0Var.f183918d.f184166f.finish();
    }
}
