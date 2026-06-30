package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class e6 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f186057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f186058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186059f;

    public e6(java.lang.ref.WeakReference weakReference, int i17, java.lang.String str) {
        this.f186057d = weakReference;
        this.f186058e = i17;
        this.f186059f = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        nw4.g gVar = (nw4.g) this.f186057d.get();
        boolean z17 = bundle.getBoolean("ret");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOnWebPageUrlExposed", "WebPrefetchAsyncTask callback jsapi: %s, ret: %s", gVar, java.lang.Boolean.valueOf(z17));
        if (gVar != null) {
            if (this.f186058e == 0) {
                jx3.f.INSTANCE.w(1454L, 192L, 1L);
            }
            java.lang.String str = this.f186059f;
            if (!z17) {
                gVar.e(str, "onWebPageUrlExposed:fail", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String string = bundle.getString("url_result");
            if (!(string == null || string.length() == 0)) {
                hashMap.put("result_list", string);
            }
            gVar.e(str, "onWebPageUrlExposed:ok", hashMap);
        }
    }
}
