package rj5;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f396374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetBaseView f396375e;

    public b(android.view.View view, com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetBaseView scrollViewWidgetBaseView) {
        this.f396374d = view;
        this.f396375e = scrollViewWidgetBaseView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f396374d.removeOnAttachStateChangeListener(this);
        com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetBaseView scrollViewWidgetBaseView = this.f396375e;
        scrollViewWidgetBaseView.addView(scrollViewWidgetBaseView.a());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
