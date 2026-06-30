package com.tencent.mm.ui.chatting;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\t¨\u0006 "}, d2 = {"Lcom/tencent/mm/ui/chatting/TapToDismissFrameLayout;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "", "d", "Lyz5/l;", "getOnTapListener", "()Lyz5/l;", "setOnTapListener", "(Lyz5/l;)V", "onTapListener", "Landroid/view/View;", "e", "Landroid/view/View;", "getChildView", "()Landroid/view/View;", "setChildView", "(Landroid/view/View;)V", "childView", "Ljz5/f0;", "f", "getOnDownListener", "setOnDownListener", "onDownListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TapToDismissFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.l onTapListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.view.View childView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public yz5.l onDownListener;

    /* renamed from: g, reason: collision with root package name */
    public float f198322g;

    /* renamed from: h, reason: collision with root package name */
    public float f198323h;

    /* renamed from: i, reason: collision with root package name */
    public long f198324i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TapToDismissFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final boolean a(android.view.View view, float f17, float f18) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (f17 < iArr[0] || f17 > r2 + view.getWidth()) {
            return false;
        }
        int i17 = iArr[1];
        return f18 >= ((float) i17) && f18 <= ((float) (i17 + view.getHeight()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6.getActionMasked() == 0) {
            this.f198322g = ev6.getRawX();
            this.f198323h = ev6.getRawY();
            this.f198324i = ev6.getEventTime();
            android.view.View view = this.childView;
            boolean a17 = view != null ? a(view, ev6.getRawX(), ev6.getRawY()) : false;
            yz5.l lVar = this.onDownListener;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.valueOf(a17));
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(ev6);
        if (ev6.getActionMasked() == 0) {
            return true;
        }
        if (ev6.getActionMasked() == 1) {
            int scaledTouchSlop = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
            float rawX = ev6.getRawX() - this.f198322g;
            float rawY = ev6.getRawY() - this.f198323h;
            float f17 = (rawX * rawX) + (rawY * rawY);
            long j17 = scaledTouchSlop;
            boolean z17 = f17 <= ((float) (j17 * j17));
            boolean z18 = ev6.getEventTime() - this.f198324i < ((long) android.view.ViewConfiguration.getLongPressTimeout());
            if (z17 && z18) {
                android.view.View view2 = this.childView;
                boolean a18 = view2 != null ? a(view2, ev6.getRawX(), ev6.getRawY()) : false;
                yz5.l lVar2 = this.onTapListener;
                if (lVar2 != null ? ((java.lang.Boolean) lVar2.invoke(java.lang.Boolean.valueOf(a18))).booleanValue() : false) {
                    return true;
                }
            }
        }
        return dispatchTouchEvent;
    }

    public final android.view.View getChildView() {
        return this.childView;
    }

    public final yz5.l getOnDownListener() {
        return this.onDownListener;
    }

    public final yz5.l getOnTapListener() {
        return this.onTapListener;
    }

    public final void setChildView(android.view.View view) {
        this.childView = view;
    }

    public final void setOnDownListener(yz5.l lVar) {
        this.onDownListener = lVar;
    }

    public final void setOnTapListener(yz5.l lVar) {
        this.onTapListener = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapToDismissFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
