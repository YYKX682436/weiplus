package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185806d;

    public n(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f185806d = mPVideoPlayFullScreenView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ProgressBar progressBar;
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185806d;
        android.widget.ProgressBar progressBar2 = mPVideoPlayFullScreenView.B;
        if ((progressBar2 != null && progressBar2.getVisibility() == 0) && (progressBar = mPVideoPlayFullScreenView.B) != null) {
            progressBar.setVisibility(8);
        }
        if (mPVideoPlayFullScreenView.E) {
            return;
        }
        android.view.View view = mPVideoPlayFullScreenView.f185718q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$hideLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$hideLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
