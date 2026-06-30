package sj5;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView f408920d;

    public g(com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView scrollViewWidgetQuickScrollBarView) {
        this.f408920d = scrollViewWidgetQuickScrollBarView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView scrollViewWidgetQuickScrollBarView = this.f408920d;
        if (scrollViewWidgetQuickScrollBarView.isDragging || scrollViewWidgetQuickScrollBarView.getVisibility() == 8) {
            return;
        }
        scrollViewWidgetQuickScrollBarView.animate().cancel();
        scrollViewWidgetQuickScrollBarView.animate().withStartAction(new sj5.e(scrollViewWidgetQuickScrollBarView)).alpha(0.0f).setDuration(100L).setInterpolator(new android.view.animation.LinearInterpolator()).withEndAction(new sj5.f(scrollViewWidgetQuickScrollBarView)).start();
    }
}
