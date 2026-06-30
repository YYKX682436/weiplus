package dm1;

/* loaded from: classes5.dex */
public final class n implements android.view.ViewManager {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager f241660d;

    public n(android.view.WindowManager windowManager) {
        kotlin.jvm.internal.o.g(windowManager, "windowManager");
        this.f241660d = windowManager;
    }

    @Override // android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WindowManagerProxy", "addView() called with: view = " + view + ", params = " + layoutParams);
        try {
            this.f241660d.addView(view, layoutParams);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WMPFVoip.WindowManagerProxy", "addView: ", e17);
        }
    }

    @Override // android.view.ViewManager
    public void removeView(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WindowManagerProxy", "removeView() called with: view = " + view);
        try {
            this.f241660d.removeView(view);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WMPFVoip.WindowManagerProxy", "updateViewLayout: ", e17);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WindowManagerProxy", "updateViewLayout() called with: view = " + view + ", params = " + layoutParams);
        try {
            this.f241660d.updateViewLayout(view, layoutParams);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WMPFVoip.WindowManagerProxy", "updateViewLayout: ", e17);
        }
    }
}
