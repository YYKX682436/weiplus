package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class p7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.q7 f185344d;

    public p7(com.tencent.mm.plugin.webview.ui.tools.jsapi.q7 q7Var) {
        this.f185344d = q7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.q7 q7Var = this.f185344d;
        q7Var.f185367e.i5(q7Var.f185366d, "nfcCheckState:nfc_off", null);
    }
}
