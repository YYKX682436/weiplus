package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class k3 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w3 f182548d;

    public k3(com.tencent.mm.plugin.webview.luggage.w3 w3Var) {
        this.f182548d = w3Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mm.plugin.webview.luggage.w3 w3Var = this.f182548d;
        w3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWebViewLongClickHelper", "onFetchQrCodeResp");
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) w3Var.f182668i).o(bundle.getInt("key_resp_ret", -1), bundle.getByteArray("key_resp_item_bytes"));
    }
}
