package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderFadeScrollView;", "Landroidx/core/widget/NestedScrollView;", "", "getBottomFadingEdgeStrength", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderFadeScrollView extends androidx.core.widget.NestedScrollView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFadeScrollView(android.content.Context context, android.util.AttributeSet attr) {
        super(context, attr);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attr, "attr");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFadeScrollView(android.content.Context context, android.util.AttributeSet attr, int i17) {
        super(context, attr, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attr, "attr");
    }
}
