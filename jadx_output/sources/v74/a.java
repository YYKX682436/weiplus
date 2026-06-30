package v74;

/* loaded from: classes2.dex */
public final class a extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f433758d;

    public a(int i17) {
        this.f433758d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$HorizontalSpaceItemDecoration");
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        if (parent.u0(view) != (parent.getAdapter() != null ? r6.getItemCount() - 1 : -1)) {
            outRect.right = this.f433758d;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$HorizontalSpaceItemDecoration");
    }
}
