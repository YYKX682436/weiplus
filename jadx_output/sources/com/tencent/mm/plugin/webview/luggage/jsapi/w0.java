package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class w0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.x0 f182492a;

    public w0(com.tencent.mm.plugin.webview.luggage.jsapi.x0 x0Var) {
        this.f182492a = x0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent != null && "com.tencent.mm.ACTION_LOCATION_FROM_JSAPI".equals(intent.getAction()) && intent.getIntExtra("key_permission_request_code", 0) == 75) {
            int intExtra = intent.getIntExtra("key_result_code", 0);
            com.tencent.mm.plugin.webview.luggage.jsapi.x0 x0Var = this.f182492a;
            if (intExtra == -1) {
                x0Var.f(x0Var.f182504f);
            } else {
                x0Var.g(x0Var.f182504f, "fail");
            }
        }
    }
}
