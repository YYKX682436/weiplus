package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class wc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186613d;

    public wc(nw4.k kVar) {
        this.f186613d = kVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc ycVar = com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.f186685d;
        nw4.k kVar = this.f186613d;
        switch (itemId) {
            case 2147483645:
                java.util.HashMap e17 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.e(ycVar, com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.f186687f);
                android.content.Context context = kVar.f340860a;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).L1.g0().l0(0, e17, 2);
                return;
            case 2147483646:
                java.util.HashMap e18 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.e(ycVar, com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.f186686e);
                android.content.Context context2 = kVar.f340860a;
                kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context2).L1.g0().j0(e18, 3);
                return;
            default:
                java.util.HashMap hashMap = new java.util.HashMap();
                java.lang.CharSequence title = menuItem.getTitle();
                kotlin.jvm.internal.o.d(title);
                hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, title);
                hashMap.put(dm.i4.COL_ID, java.lang.Integer.valueOf(menuItem.getItemId()));
                nw4.g gVar = kVar.f340863d;
                kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                ((nw4.n) gVar).o("onShareCustomMenuItemClick", hashMap);
                return;
        }
    }
}
