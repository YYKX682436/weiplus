package cw4;

/* loaded from: classes8.dex */
public final class e1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.WebViewTransHelper f224214d;

    public e1(com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper) {
        this.f224214d = webViewTransHelper;
    }

    @Override // androidx.lifecycle.k0
    public final void onChanged(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTransHelper", "liveDataMerger -> " + obj);
        boolean z17 = obj instanceof cw4.y;
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper = this.f224214d;
        if (z17) {
            android.content.Context context = webViewTransHelper.f181741d.getContext();
            kotlin.jvm.internal.o.d(context);
            if (obj != cw4.y.f224300e && obj != cw4.y.f224302g) {
                if (webViewTransHelper.c().f224253v.getValue() == cw4.y.f224301f) {
                    db5.e1.C(context, context.getString(com.tencent.mm.R.string.l6t), null, context.getString(com.tencent.mm.R.string.lyh), context.getString(com.tencent.mm.R.string.lyg), true, new cw4.h1(webViewTransHelper), null);
                    return;
                } else {
                    db5.e1.s(context, context.getString(com.tencent.mm.R.string.l6v), "");
                    return;
                }
            }
            webViewTransHelper.h(null);
        }
        com.tencent.mm.plugin.webview.WebViewTransHelper.a(webViewTransHelper);
    }
}
