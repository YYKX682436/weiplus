package com.tencent.mm.plugin.websearch.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/websearch/view/CircleToSearchImageView;", "Lcom/tencent/mm/ui/base/WxImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class CircleToSearchImageView extends com.tencent.mm.ui.base.WxImageView {
    public CircleToSearchImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.tencent.mm.graphics.ui.WxBaseImageView
    public void k(android.view.View.OnTouchListener onTouchListener) {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    public CircleToSearchImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
