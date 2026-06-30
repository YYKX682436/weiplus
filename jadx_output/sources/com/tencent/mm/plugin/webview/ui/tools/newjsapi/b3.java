package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f185967d = kVar;
        this.f185968e = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nw4.k kVar = this.f185967d;
        com.tencent.mm.ui.widget.MMWebView mMWebView = kVar.f340864e;
        kotlin.jvm.internal.o.d(mMWebView);
        float mMDensity = mMWebView.getMMDensity();
        nw4.g gVar = kVar.f340863d;
        nw4.y2 y2Var = this.f185968e;
        if (mMDensity <= 0.0f) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleDeviceInfo", "getStatusBarAndActionBarHeight fail, density=" + mMDensity);
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail invalid density", null);
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("statusBarHeight", java.lang.Integer.valueOf(a06.d.b(com.tencent.mm.ui.bl.h(kVar.f340860a) / mMDensity)));
            hashMap.put("actionBarHeight", java.lang.Integer.valueOf(a06.d.b(com.tencent.mm.ui.bl.a(kVar.f340860a) / mMDensity)));
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        }
        return jz5.f0.f302826a;
    }
}
