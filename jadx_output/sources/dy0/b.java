package dy0;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar f244545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f244546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.HorizontalScrollView f244547f;

    public b(com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar composingBottomToolBar, android.view.View view, android.widget.HorizontalScrollView horizontalScrollView) {
        this.f244545d = composingBottomToolBar;
        this.f244546e = view;
        this.f244547f = horizontalScrollView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        android.view.View view2 = this.f244546e;
        kotlin.jvm.internal.o.d(view2);
        com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar.a(this.f244545d, view2, this.f244547f.canScrollHorizontally(1));
    }
}
