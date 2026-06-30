package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes12.dex */
public class m7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.n7 f185280d;

    public m7(com.tencent.mm.plugin.webview.ui.tools.jsapi.n7 n7Var) {
        this.f185280d = n7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.n7 n7Var = this.f185280d;
        n7Var.f185297e.i5(n7Var.f185296d, "nfcCheckState:nfc_wechat_setting_off", null);
    }
}
