package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class a3 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w3 f182144d;

    public a3(com.tencent.mm.plugin.webview.luggage.w3 w3Var) {
        this.f182144d = w3Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.webview.luggage.w3 w3Var = this.f182144d;
        if (w3Var.f182666g != null) {
            try {
                w3Var.f182662c = 0;
                w3Var.f182660a = null;
                ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) w3Var.f182668i).n();
                java.lang.String str = w3Var.f182666g.f286196c;
                w3Var.getClass();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("type", 2);
                bundle.putString("img_path", str);
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask.class, null);
                w3Var.f182666g.b();
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuggageWebViewLongClickHelper", "cancel capture failed");
            }
        }
    }
}
