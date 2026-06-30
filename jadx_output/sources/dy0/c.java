package dy0;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar f244548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f244549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.HorizontalScrollView f244550c;

    public c(com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar composingBottomToolBar, android.view.View view, android.widget.HorizontalScrollView horizontalScrollView) {
        this.f244548a = composingBottomToolBar;
        this.f244549b = view;
        this.f244550c = horizontalScrollView;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar$initViews$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        android.view.View sideShadow = this.f244549b;
        kotlin.jvm.internal.o.f(sideShadow, "$sideShadow");
        com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar.a(this.f244548a, sideShadow, this.f244550c.canScrollHorizontally(1));
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar$initViews$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}
