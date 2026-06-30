package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class r extends android.widget.RelativeLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f182603n = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.xweb.WebView f182604d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.y1 f182605e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f182606f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.GestureDetector f182607g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f182608h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f182609i;

    /* renamed from: m, reason: collision with root package name */
    public int f182610m;

    public r(android.content.Context context) {
        super(context);
        this.f182606f = true;
        this.f182609i = new com.tencent.mm.plugin.webview.luggage.o(this);
        this.f182607g = new android.view.GestureDetector(getContext(), new com.tencent.mm.plugin.webview.luggage.q(this), null);
    }

    public final void a() {
        int webScrollY = this.f182604d.getWebScrollY();
        if (webScrollY < 300) {
            this.f182605e.g();
        } else if (webScrollY > 450) {
            this.f182605e.setAlpha(1.0f);
        } else {
            this.f182605e.setAlpha((webScrollY + org.chromium.net.NetError.ERR_INVALID_URL) / 150.0f);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImmersivePageView", "setActionBarAlpha, scrollY : %d", java.lang.Integer.valueOf(webScrollY));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        this.f182608h = false;
        if (this.f182606f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        android.view.GestureDetector gestureDetector = this.f182607g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/ImmersivePageView", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/webview/luggage/ImmersivePageView", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        int action = motionEvent.getAction();
        if (action == 2 || action == 1) {
            a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setActionBar(com.tencent.mm.plugin.webview.luggage.y1 y1Var) {
        this.f182605e = y1Var;
    }

    public void setDisable(boolean z17) {
        this.f182606f = z17;
    }

    public void setWebView(com.tencent.xweb.WebView webView) {
        this.f182604d = webView;
    }
}
