package jq4;

/* loaded from: classes5.dex */
public final class d0 implements android.view.ViewManager {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager f301136d;

    public d0(android.view.WindowManager windowManager) {
        kotlin.jvm.internal.o.g(windowManager, "windowManager");
        this.f301136d = windowManager;
    }

    @Override // android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "addView() called with: view = " + view + ", params = " + layoutParams);
        try {
            this.f301136d.addView(view, layoutParams);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("VoipBaseFloatCardManager", "addView: ", e17);
        }
    }

    @Override // android.view.ViewManager
    public void removeView(android.view.View view) {
        com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "removeView() called with: view = " + view);
        try {
            this.f301136d.removeView(view);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("VoipBaseFloatCardManager", "updateViewLayout: ", e17);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "updateViewLayout() called with: view = " + view + ", params = " + layoutParams);
        try {
            this.f301136d.updateViewLayout(view, layoutParams);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("VoipBaseFloatCardManager", "updateViewLayout: ", e17);
        }
    }
}
