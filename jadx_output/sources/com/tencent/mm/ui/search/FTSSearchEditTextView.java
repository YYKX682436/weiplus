package com.tencent.mm.ui.search;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/ui/search/FTSSearchEditTextView;", "Lcom/tencent/mm/ui/search/FTSEditTextView;", "", "inFlutter", "Ljz5/f0;", "setIsInFlutter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FTSSearchEditTextView extends com.tencent.mm.ui.search.FTSEditTextView {

    /* renamed from: J, reason: collision with root package name */
    public boolean f209833J;
    public boolean K;

    public FTSSearchEditTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        this.f209833J = true;
        return super.dispatchTouchEvent(ev6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i17, android.graphics.Rect rect) {
        if (this.K && !this.f209833J) {
            return false;
        }
        this.f209833J = false;
        return super.requestFocus(i17, rect);
    }

    public final void setIsInFlutter(boolean z17) {
        this.K = z17;
    }

    public FTSSearchEditTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
