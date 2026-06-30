package com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/FinderFixedRefreshLayout;", "Lcom/tencent/mm/plugin/finder/view/FinderRefreshLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public class FinderFixedRefreshLayout extends com.tencent.mm.plugin.finder.view.FinderRefreshLayout {
    public static final /* synthetic */ int K = 0;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f122083J;

    public FinderFixedRefreshLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f122083J = "FinderFixedRefreshLayout";
    }

    @Override // com.tencent.mm.view.refreshLayout.WxRefreshLayout, android.view.View
    public void computeScroll() {
        if (getScroller().isFinished() || getScroller().timePassed() >= 0) {
            super.computeScroll();
            return;
        }
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        com.tencent.mars.xlog.Log.e(this.f122083J, "computeScroll error,  timePassed: " + getScroller().timePassed() + " animTime: " + currentAnimationTimeMillis + " duration: " + getScroller().getDuration());
        pm0.z.b(xy2.b.f458155b, "computeScrollError", false, null, null, false, false, new dq2.a(this, currentAnimationTimeMillis), 60, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFixedRefreshLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f122083J = "FinderFixedRefreshLayout";
    }
}
