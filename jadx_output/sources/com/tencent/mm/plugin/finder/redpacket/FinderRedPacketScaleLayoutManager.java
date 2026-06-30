package com.tencent.mm.plugin.finder.redpacket;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/redpacket/FinderRedPacketScaleLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FinderRedPacketScaleLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    public final void W() {
        float width = getWidth() / 2.0f;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null) {
                float abs = 1 - ((java.lang.Math.abs(width - ((getDecoratedLeft(childAt) + getDecoratedRight(childAt)) / 2.0f)) * 0.12f) / width);
                childAt.setScaleX(abs);
                childAt.setScaleY(abs);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutChildren(z2Var, h3Var);
        W();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i17, z2Var, h3Var);
        W();
        return scrollHorizontallyBy;
    }
}
