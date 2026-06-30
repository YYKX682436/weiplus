package com.tencent.mm.ui.base;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012¨\u0006#"}, d2 = {"Lcom/tencent/mm/ui/base/RequestDisallowScrollView;", "Landroidx/core/widget/NestedScrollView;", "", "M", "Z", "getTouchTop", "()Z", "setTouchTop", "(Z)V", "touchTop", "N", "getTouchBotom", "setTouchBotom", "touchBotom", "", "P", "I", "getLastPosY", "()I", "setLastPosY", "(I)V", "lastPosY", "Q", "getLastPosX", "setLastPosX", "lastPosX", "R", "getLimit", "limit", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RequestDisallowScrollView extends androidx.core.widget.NestedScrollView {
    public final java.lang.String K;
    public final int L;

    /* renamed from: M, reason: from kotlin metadata */
    public boolean touchTop;

    /* renamed from: N, reason: from kotlin metadata */
    public boolean touchBotom;

    /* renamed from: P, reason: from kotlin metadata */
    public int lastPosY;

    /* renamed from: Q, reason: from kotlin metadata */
    public int lastPosX;

    /* renamed from: R, reason: from kotlin metadata */
    public final int limit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestDisallowScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.K = "RequestDisallowScrollView";
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration != null ? viewConfiguration.getScaledTouchSlop() : 8;
        this.L = scaledTouchSlop;
        this.limit = scaledTouchSlop;
    }

    public final int getLastPosX() {
        return this.lastPosX;
    }

    public final int getLastPosY() {
        return this.lastPosY;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final boolean getTouchBotom() {
        return this.touchBotom;
    }

    public final boolean getTouchTop() {
        return this.touchTop;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        int action = ev6.getAction();
        java.lang.String str = this.K;
        if (action == 0) {
            android.view.View childAt = getChildAt(0);
            int height = getHeight();
            int scrollY = getScrollY();
            int height2 = childAt.getHeight();
            int i17 = this.limit;
            this.touchTop = scrollY <= i17;
            this.touchBotom = height + scrollY >= height2 - i17;
            this.lastPosY = (int) ev6.getY();
            this.lastPosX = (int) ev6.getX();
            com.tencent.mm.ui.yk.c(str, "intercept down touchTop: " + this.touchTop + ", touchBottom: " + this.touchBotom + ", x: " + this.lastPosX + ", y: " + this.lastPosY, new java.lang.Object[0]);
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            if (action == 2 || action == 3) {
                int y17 = (int) ev6.getY();
                int x17 = (int) ev6.getX();
                int abs = java.lang.Math.abs(x17 - this.lastPosX);
                int abs2 = java.lang.Math.abs(y17 - this.lastPosY);
                boolean z17 = abs > abs2;
                com.tencent.mm.ui.yk.c(str, "intercept move x: " + x17 + ", y: " + y17 + ", dis: " + java.lang.Math.max(abs, abs2), new java.lang.Object[0]);
                return java.lang.Math.abs(java.lang.Math.max(abs, abs2)) < this.L ? super.onInterceptTouchEvent(ev6) : !z17;
            }
        }
        return super.onInterceptTouchEvent(ev6);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        int action = ev6.getAction();
        boolean z17 = true;
        if (action != 2 && action != 3) {
            z17 = false;
        }
        if (z17) {
            int y17 = (int) ev6.getY();
            com.tencent.mm.ui.yk.c(this.K, "move top: " + this.touchTop + ", bottom: " + this.touchBotom + ", dy: " + (y17 - this.lastPosY), new java.lang.Object[0]);
            if (this.touchTop && y17 - this.lastPosY > 0) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            }
            if (this.touchBotom && y17 - this.lastPosY < 0) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            }
        }
        return super.onTouchEvent(ev6);
    }

    public final void setLastPosX(int i17) {
        this.lastPosX = i17;
    }

    public final void setLastPosY(int i17) {
        this.lastPosY = i17;
    }

    public final void setTouchBotom(boolean z17) {
        this.touchBotom = z17;
    }

    public final void setTouchTop(boolean z17) {
        this.touchTop = z17;
    }
}
