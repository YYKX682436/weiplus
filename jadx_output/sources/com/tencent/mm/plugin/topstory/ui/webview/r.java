package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes5.dex */
public class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f175245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175247f;

    public r(com.tencent.mm.plugin.topstory.ui.webview.l lVar, android.content.Context context, java.lang.String str) {
        this.f175247f = lVar;
        this.f175245d = context;
        this.f175246e = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl shareImage ItemId click:%s", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        java.lang.String str = this.f175246e;
        android.content.Context context = this.f175245d;
        com.tencent.mm.plugin.topstory.ui.webview.l lVar = this.f175247f;
        if (itemId == 1) {
            lVar.getClass();
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, new com.tencent.mm.plugin.topstory.ui.webview.t(lVar, weakReference));
            return;
        }
        if (menuItem.getItemId() == 0) {
            lVar.getClass();
            if (context == null || android.text.TextUtils.isEmpty(str)) {
                return;
            }
            java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(context);
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, new com.tencent.mm.plugin.topstory.ui.webview.w(lVar, weakReference2));
        }
    }
}
