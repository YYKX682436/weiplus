package rj5;

/* loaded from: classes10.dex */
public final class k extends rj5.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ScrollView f396393d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetWrapper scrollViewWidgetWrapper, android.widget.ScrollView scrollView) {
        super(scrollViewWidgetWrapper);
        kotlin.jvm.internal.o.g(scrollView, "scrollView");
        this.f396393d = scrollView;
    }

    @Override // rj5.l
    public void a(float f17, boolean z17) {
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        android.widget.ScrollView scrollView = this.f396393d;
        android.view.View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return;
        }
        int i17 = (int) (e17 * (((childAt.getHeight() + scrollView.getPaddingTop()) + scrollView.getPaddingBottom()) - scrollView.getHeight() >= 0 ? r2 : 0));
        if (z17) {
            scrollView.smoothScrollTo(scrollView.getScrollX(), i17);
        } else {
            scrollView.scrollTo(scrollView.getScrollX(), i17);
        }
    }

    @Override // rj5.l
    public boolean b() {
        android.widget.ScrollView scrollView = this.f396393d;
        android.view.View childAt = scrollView.getChildAt(0);
        return childAt != null && (childAt.getHeight() + scrollView.getPaddingTop()) + scrollView.getPaddingBottom() > scrollView.getHeight();
    }

    @Override // rj5.l
    public float getCurrentPosition() {
        android.widget.ScrollView scrollView = this.f396393d;
        android.view.View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return 0.0f;
        }
        int height = childAt.getHeight() + scrollView.getPaddingTop() + scrollView.getPaddingBottom();
        int height2 = scrollView.getHeight();
        int scrollY = scrollView.getScrollY();
        int i17 = height - height2;
        int i18 = i17 >= 0 ? i17 : 0;
        if (i18 == 0) {
            return 0.0f;
        }
        return e06.p.e(scrollY / i18, 0.0f, 1.0f);
    }
}
