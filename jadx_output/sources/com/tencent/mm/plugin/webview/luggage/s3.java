package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class s3 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask f182618a;

    public s3(com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask luggageWebViewLongClickHelper$QBarLogicTask) {
        this.f182618a = luggageWebViewLongClickHelper$QBarLogicTask;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.aq3 aq3Var = (r45.aq3) obj;
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask luggageWebViewLongClickHelper$QBarLogicTask = this.f182618a;
        if (aq3Var == null) {
            bundle.putInt("key_resp_ret", -1);
            luggageWebViewLongClickHelper$QBarLogicTask.f182133d.a(bundle);
            return;
        }
        try {
            byte[] byteArray = aq3Var.toByteArray();
            com.tencent.mars.xlog.Log.i("MicroMsg.QBarLogicTask", "response bytes len = %d ", java.lang.Integer.valueOf(byteArray.length));
            bundle.putInt("key_resp_ret", 0);
            bundle.putByteArray("key_resp_item_bytes", byteArray);
            luggageWebViewLongClickHelper$QBarLogicTask.f182133d.a(bundle);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.QBarLogicTask", e17.getMessage());
        }
    }
}
