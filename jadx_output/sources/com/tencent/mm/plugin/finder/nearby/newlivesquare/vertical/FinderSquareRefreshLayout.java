package com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/FinderSquareRefreshLayout;", "Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/FinderFixedRefreshLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderSquareRefreshLayout extends com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.FinderFixedRefreshLayout {
    public com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.LiveVerticalParentRecyclerView L;

    public FinderSquareRefreshLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.view.refreshLayout.WxRefreshLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.L == null) {
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = getChildAt(i17);
                if (childAt instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.LiveVerticalParentRecyclerView) {
                    this.L = (com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.LiveVerticalParentRecyclerView) childAt;
                    return;
                }
            }
        }
    }

    @Override // com.tencent.mm.view.refreshLayout.WxRefreshLayout
    public boolean q() {
        com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.LiveVerticalParentRecyclerView liveVerticalParentRecyclerView = this.L;
        if (liveVerticalParentRecyclerView == null) {
            return false;
        }
        com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView g17 = liveVerticalParentRecyclerView.g1();
        return !((g17 != null && !g17.g1()) ^ true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderSquareRefreshLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
