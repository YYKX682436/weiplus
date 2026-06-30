package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class q6 implements l41.j2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f186455a;

    @Override // l41.j2
    public void a(android.os.Bundle bundle) {
        int i17;
        if (bundle != null && (i17 = bundle.getInt("result_key_action", -1)) >= 0) {
            int i18 = bundle.getInt("result_key_err_code", -1);
            java.lang.String string = bundle.getString("result_key_err_msg");
            if (string == null) {
                string = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat startKfConversation onReceiveResult action: " + i17 + ", errCode: " + i18 + ", errMsg: " + string);
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.r6 r6Var = com.tencent.mm.plugin.webview.ui.tools.newjsapi.r6.f186483d;
            if (i17 == 2) {
                r6Var.e(i18, string);
                return;
            }
            if (i17 == 3) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.p6 p6Var = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.p6(i18, string);
                long j17 = this.f186455a ? 0L : 600L;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(p6Var, j17, false);
                return;
            }
            if (i17 == 4) {
                r6Var.e(i18, string);
            } else if (i17 == 5) {
                this.f186455a = true;
            } else {
                if (i17 != 6) {
                    return;
                }
                r6Var.e(i18, string);
            }
        }
    }
}
