package gx4;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag f277421d;

    public j(com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag webViewBag) {
        this.f277421d = webViewBag;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag webViewBag = this.f277421d;
        float f17 = (((float) (currentTimeMillis - webViewBag.f183979r)) * 1.0f) / 200.0f;
        if (f17 > 1.0f) {
            android.graphics.Point point = webViewBag.f183978q;
            webViewBag.c(point.x, point.y);
            webViewBag.onAnimationEnd();
            return;
        }
        webViewBag.f183974m.postDelayed(webViewBag.f183982u, 5L);
        android.graphics.Point point2 = webViewBag.f183977p;
        int i17 = point2.x;
        android.graphics.Point point3 = webViewBag.f183978q;
        int i18 = point2.y;
        webViewBag.c(i17 + ((int) (((point3.x * 1.0f) - i17) * f17)), i18 + ((int) (((point3.y * 1.0f) - i18) * f17)));
    }
}
