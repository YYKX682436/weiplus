package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveBannerScrollView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public class FinderLiveBannerScrollView extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Scroller f117582d;

    public FinderLiveBannerScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117582d = new android.widget.Scroller(getContext());
    }

    @Override // android.widget.ScrollView, android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.f117582d;
        kotlin.jvm.internal.o.d(scroller);
        if (scroller.computeScrollOffset()) {
            android.widget.Scroller scroller2 = this.f117582d;
            kotlin.jvm.internal.o.d(scroller2);
            int currX = scroller2.getCurrX();
            android.widget.Scroller scroller3 = this.f117582d;
            kotlin.jvm.internal.o.d(scroller3);
            scrollTo(currX, scroller3.getCurrY());
            postInvalidate();
        }
        super.computeScroll();
    }

    @Override // android.widget.ScrollView
    public void fling(int i17) {
        super.fling(i17);
    }

    public FinderLiveBannerScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f117582d = new android.widget.Scroller(getContext());
    }
}
