package com.tencent.mm.plugin.mmsight.segment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015RD\u0010\f\u001a$\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/mmsight/segment/FinderTouchEventLayout;", "Lcom/tencent/mm/ui/widget/cropview/TouchEventLayout;", "Lkotlin/Function4;", "Landroid/view/MotionEvent;", "", "Ljz5/f0;", "n", "Lyz5/r;", "getOnScrollListener", "()Lyz5/r;", "setOnScrollListener", "(Lyz5/r;)V", "onScrollListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mmsightui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderTouchEventLayout extends com.tencent.mm.ui.widget.cropview.TouchEventLayout {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yz5.r onScrollListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderTouchEventLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        setOnTouchListener(this);
    }

    public final yz5.r getOnScrollListener() {
        return this.onScrollListener;
    }

    @Override // com.tencent.mm.ui.widget.cropview.TouchEventLayout, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        yz5.r rVar = this.onScrollListener;
        if (rVar == null) {
            return true;
        }
        rVar.C(motionEvent, e27, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        return true;
    }

    public final void setOnScrollListener(yz5.r rVar) {
        this.onScrollListener = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderTouchEventLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setOnTouchListener(this);
    }
}
