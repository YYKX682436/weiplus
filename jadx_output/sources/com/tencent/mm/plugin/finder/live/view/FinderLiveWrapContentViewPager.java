package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveWrapContentViewPager;", "Landroidx/viewpager/widget/ViewPager;", "", "widthMeasureSpec", "heightMeasureSpec", "Ljz5/f0;", "onMeasure", "position", "reMeasureCurrentPage", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "com/tencent/mm/plugin/finder/live/view/pb", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class FinderLiveWrapContentViewPager extends androidx.viewpager.widget.ViewPager {
    public static final com.tencent.mm.plugin.finder.live.view.pb Companion = new com.tencent.mm.plugin.finder.live.view.pb(null);
    public static final java.lang.String TAG = "FinderLiveWrapContentViewPager";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveWrapContentViewPager(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i17, int i18) {
        jz5.f0 f0Var;
        android.view.View childAt = getChildAt(getCurrentItem());
        if (childAt != null) {
            measureChild(childAt, i17, i18);
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.onMeasure(i17, i18);
        }
    }

    public void reMeasureCurrentPage(int i17) {
        setCurrentItem(i17);
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveWrapContentViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
