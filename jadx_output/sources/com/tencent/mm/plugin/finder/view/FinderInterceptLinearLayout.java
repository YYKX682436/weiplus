package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R2\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderInterceptLinearLayout;", "Landroid/widget/LinearLayout;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "d", "Lyz5/l;", "getInterceptListener", "()Lyz5/l;", "setInterceptListener", "(Lyz5/l;)V", "interceptListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderInterceptLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.l interceptListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderInterceptLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final yz5.l getInterceptListener() {
        return this.interceptListener;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        yz5.l lVar = this.interceptListener;
        if (lVar == null || !((java.lang.Boolean) lVar.invoke(motionEvent)).booleanValue()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setInterceptListener(yz5.l lVar) {
        this.interceptListener = lVar;
    }
}
