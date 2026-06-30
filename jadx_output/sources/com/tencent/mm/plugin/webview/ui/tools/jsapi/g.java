package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem f185112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f185114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f185115g;

    public g(com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem webViewJSSDKFileItem, com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, int i17, boolean z17) {
        this.f185112d = webViewJSSDKFileItem;
        this.f185113e = c1Var;
        this.f185114f = i17;
        this.f185115g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f185112d.f182736e);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_pic_source_type", "camera");
        intent.putExtra("key_pick_local_media_local_ids", this.f185115g ? com.tencent.mm.plugin.webview.model.o5.g(arrayList) : com.tencent.mm.plugin.webview.model.o5.h(arrayList));
        this.f185113e.mmOnActivityResult(this.f185114f, -1, intent);
    }
}
