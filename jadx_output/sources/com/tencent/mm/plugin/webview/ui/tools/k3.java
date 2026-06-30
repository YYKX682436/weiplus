package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public final class k3 implements o05.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.l3 f185602a;

    public k3(com.tencent.mm.plugin.webview.ui.tools.l3 l3Var) {
        this.f185602a = l3Var;
    }

    @Override // o05.j
    public void a(float f17) {
        com.tencent.mm.plugin.webview.ui.tools.l3 l3Var = this.f185602a;
        if (l3Var.c().f183844p0 == null) {
            com.tencent.mars.xlog.Log.e(l3Var.f185628b, "WalletKeyboard onShowKeyboard error, jsapi is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("state", "height");
        hashMap.put("extData", "" + f17);
        l3Var.c().f183844p0.i0("wxpay:keyboard_event", hashMap, null);
    }

    @Override // o05.j
    public void b(int i17, java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mm.plugin.webview.ui.tools.l3 l3Var = this.f185602a;
        if (l3Var.c().f183844p0 == null) {
            com.tencent.mars.xlog.Log.e(l3Var.f185628b, "WalletKeyboard onTextChange error, jsapi is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (i17 == 66) {
            android.app.Dialog dialog = l3Var.f185633g;
            if (dialog != null) {
                dialog.show();
            } else {
                l3Var.f185633g = db5.e1.Q(l3Var.c(), "", l3Var.c().getString(com.tencent.mm.R.string.ba7), false, false, null);
            }
            hashMap.put("state", "enter");
        } else if (text.equals("#outtime")) {
            hashMap.put("state", "outtime");
            android.app.Dialog dialog2 = l3Var.f185633g;
            if (dialog2 != null && dialog2.isShowing()) {
                android.app.Dialog dialog3 = l3Var.f185633g;
                kotlin.jvm.internal.o.d(dialog3);
                dialog3.dismiss();
            }
        } else {
            if (text.equals("#callpay")) {
                android.app.Dialog dialog4 = l3Var.f185633g;
                if (dialog4 == null || !dialog4.isShowing()) {
                    return;
                }
                android.app.Dialog dialog5 = l3Var.f185633g;
                kotlin.jvm.internal.o.d(dialog5);
                dialog5.dismiss();
                return;
            }
            hashMap.put("state", "input");
        }
        hashMap.put("extData", text);
        l3Var.c().f183844p0.i0("wxpay:keyboard_event", hashMap, null);
    }
}
