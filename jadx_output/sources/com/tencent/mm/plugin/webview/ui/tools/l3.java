package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public final class l3 extends com.tencent.mm.plugin.webview.ui.tools.a {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f185628b;

    /* renamed from: c, reason: collision with root package name */
    public int f185629c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f185630d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f185631e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f185632f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f185633g;

    public l3(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        super(webViewUI);
        this.f185628b = "MicroMsg.WalletWebViewHelper";
        this.f185630d = true;
    }

    public final void e(com.tencent.mm.sdk.platformtools.o4 mmkv) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(mmkv, "mmkv");
        mmkv.D("key_jsapi_pay_need_close", "");
        if (c().f183844p0 != null && (linkedList = c().f183844p0.f340891e) != null) {
            linkedList.clear();
        }
        c().finish();
    }

    public final boolean f(com.tencent.mm.sdk.platformtools.o4 o4Var) {
        if (o4Var == null) {
            o4Var = com.tencent.mm.sdk.platformtools.o4.L();
            kotlin.jvm.internal.o.f(o4Var, "getSingleDefault(...)");
        }
        java.lang.String u17 = o4Var.u("key_jsapi_pay_need_close", "");
        kotlin.jvm.internal.o.f(u17, "decodeString(...)");
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(u17) && kotlin.jvm.internal.o.b(u17, c().F7());
        com.tencent.mars.xlog.Log.i(this.f185628b, "isSameUrl:" + z17 + ", pay need close url:%s rawUrl:%s", u17, c().F7());
        return z17;
    }

    public final void g(int i17) {
        ((pg0.t1) ((qg0.z) i95.n0.c(qg0.z.class))).wi("7", "1", java.lang.String.valueOf(i17), "");
    }
}
