package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class xc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186666d;

    public xc(nw4.k kVar) {
        this.f186666d = kVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.CharSequence title = menuItem.getTitle();
        kotlin.jvm.internal.o.d(title);
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, title);
        hashMap.put(dm.i4.COL_ID, java.lang.Integer.valueOf(menuItem.getItemId()));
        nw4.g gVar = this.f186666d.f340863d;
        kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((nw4.n) gVar).o("onShareCustomMenuItemClick", hashMap);
    }
}
