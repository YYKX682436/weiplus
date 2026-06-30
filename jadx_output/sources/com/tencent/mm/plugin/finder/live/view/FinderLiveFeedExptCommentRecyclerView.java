package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveFeedExptCommentRecyclerView;", "Lcom/tencent/mm/view/recyclerview/MaxHeightWxRecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderLiveFeedExptCommentRecyclerView extends com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFeedExptCommentRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }
}
