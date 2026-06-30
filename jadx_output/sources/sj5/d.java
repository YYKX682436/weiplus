package sj5;

/* loaded from: classes10.dex */
public final class d implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView f408917d;

    public d(com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView scrollViewWidgetQuickScrollBarView) {
        this.f408917d = scrollViewWidgetQuickScrollBarView;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j17) {
        com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView scrollViewWidgetQuickScrollBarView = this.f408917d;
        scrollViewWidgetQuickScrollBarView.f209802p = false;
        scrollViewWidgetQuickScrollBarView.e();
        float f17 = scrollViewWidgetQuickScrollBarView.f209799m;
        float f18 = scrollViewWidgetQuickScrollBarView.f209798i;
        scrollViewWidgetQuickScrollBarView.setTranslationY(f18 + ((f17 - f18) * e06.p.e(scrollViewWidgetQuickScrollBarView.f209801o, 0.0f, 1.0f)));
    }
}
