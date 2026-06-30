package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes7.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f186698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186700f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(android.app.Activity activity, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f186698d = activity;
        this.f186699e = kVar;
        this.f186700f = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Rect m17;
        pw4.c cVar;
        yz5.a aVar;
        nw4.k env = this.f186699e;
        kotlin.jvm.internal.o.g(env, "env");
        android.app.Activity activity = this.f186698d;
        if (activity == null) {
            m17 = null;
        } else {
            zg0.q2 a17 = env.a();
            com.tencent.mm.plugin.webview.core.r0 r0Var = a17 instanceof com.tencent.mm.plugin.webview.core.r0 ? (com.tencent.mm.plugin.webview.core.r0) a17 : null;
            if (((r0Var == null || (cVar = r0Var.f181938l) == null || (aVar = cVar.f358729r) == null) ? null : (java.lang.Boolean) aVar.invoke()) == java.lang.Boolean.TRUE) {
                android.util.DisplayMetrics A = com.tencent.mm.plugin.appbrand.platform.window.activity.r0.A(activity, false);
                android.view.View decorView = activity.getWindow().getDecorView();
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.g3 a18 = n3.b1.a(decorView);
                if (a18 != null) {
                    m17 = new android.graphics.Rect(0, 0, A.widthPixels, A.heightPixels);
                    e3.d a19 = a18.a(7);
                    kotlin.jvm.internal.o.f(a19, "getInsets(...)");
                    m17.top = a19.f247045b;
                    m17.bottom -= a19.f247047d;
                }
            }
            m17 = com.tencent.mm.ui.bk.m(activity);
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = env.f340864e;
        kotlin.jvm.internal.o.d(mMWebView);
        float mMDensity = mMWebView.getMMDensity();
        nw4.g gVar = env.f340863d;
        nw4.y2 y2Var = this.f186700f;
        if (m17 == null || mMDensity <= 0.0f) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSafeAreaInsets fail, rect is null");
            sb6.append(m17 == null);
            sb6.append(", density=");
            sb6.append(mMDensity);
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleDeviceInfo", sb6.toString());
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail invalid params", null);
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("left", java.lang.Float.valueOf(m17.left / mMDensity));
            hashMap.put("top", java.lang.Float.valueOf(m17.top / mMDensity));
            hashMap.put("right", java.lang.Float.valueOf(m17.right / mMDensity));
            hashMap.put("bottom", java.lang.Float.valueOf(m17.bottom / mMDensity));
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleDeviceInfo", "getSafeAreaInsets, rect=" + m17.toShortString() + ", density:" + mMDensity);
        }
        return jz5.f0.f302826a;
    }
}
