package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.c1 f175058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wm4.y f175059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f175060f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175061g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f175062h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175063i;

    public o0(com.tencent.mm.plugin.topstory.ui.home.j jVar, com.tencent.mm.plugin.topstory.ui.home.c1 c1Var, wm4.y yVar, int i17, java.lang.String str, boolean z17) {
        this.f175063i = jVar;
        this.f175058d = c1Var;
        this.f175059e = yVar;
        this.f175060f = i17;
        this.f175061g = str;
        this.f175062h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175063i;
        com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView = jVar.f174991i;
        com.tencent.mm.plugin.topstory.ui.home.c1 c1Var = this.f175058d;
        int width = c1Var.f174943b.getWidth();
        int height = c1Var.f174943b.getHeight();
        jVar.getClass();
        try {
            long c17 = c01.id.c();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.RGB_565;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "captureWebView", "(Lcom/tencent/mm/plugin/websearch/webview/WebSearchWebView;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "captureWebView", "(Lcom/tencent/mm/plugin/websearch/webview/WebSearchWebView;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            webSearchWebView.s0(new android.graphics.Canvas(bitmap));
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "captureWebView success, cost:" + (c01.id.c() - c17));
            qm4.a.a(true);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", th6, "captureWebView error", new java.lang.Object[0]);
            qm4.a.a(false);
            bitmap = null;
        }
        jVar.f174986d.runOnUiThread(new com.tencent.mm.plugin.topstory.ui.home.n0(this, bitmap));
    }
}
