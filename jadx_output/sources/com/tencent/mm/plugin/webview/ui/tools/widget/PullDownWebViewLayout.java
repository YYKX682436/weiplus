package com.tencent.mm.plugin.webview.ui.tools.widget;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/widget/PullDownWebViewLayout;", "Landroid/widget/RelativeLayout;", "", "s", "Z", "isSupportHorizontalDrag", "()Z", "setSupportHorizontalDrag", "(Z)V", "t", "isJustPassTouch", "setJustPassTouch", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "webview-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class PullDownWebViewLayout extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f187066d;

    /* renamed from: e, reason: collision with root package name */
    public float f187067e;

    /* renamed from: f, reason: collision with root package name */
    public float f187068f;

    /* renamed from: g, reason: collision with root package name */
    public float f187069g;

    /* renamed from: h, reason: collision with root package name */
    public float f187070h;

    /* renamed from: i, reason: collision with root package name */
    public float f187071i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.VelocityTracker f187072m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f187073n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f187074o;

    /* renamed from: p, reason: collision with root package name */
    public hg5.j f187075p;

    /* renamed from: q, reason: collision with root package name */
    public int f187076q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f187077r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean isSupportHorizontalDrag;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean isJustPassTouch;

    /* renamed from: u, reason: collision with root package name */
    public boolean f187080u;

    /* renamed from: v, reason: collision with root package name */
    public final al5.o2 f187081v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullDownWebViewLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f187080u = true;
        this.f187081v = new com.tencent.mm.plugin.webview.ui.tools.widget.n6(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent) {
            return onInterceptTouchEvent;
        }
        if (!this.f187077r || motionEvent == null) {
            return false;
        }
        if (this.f187072m == null) {
            this.f187072m = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.f187072m;
        kotlin.jvm.internal.o.d(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        android.view.VelocityTracker velocityTracker2 = this.f187072m;
        kotlin.jvm.internal.o.d(velocityTracker2);
        velocityTracker2.computeCurrentVelocity(1000);
        android.view.VelocityTracker velocityTracker3 = this.f187072m;
        kotlin.jvm.internal.o.d(velocityTracker3);
        int xVelocity = (int) velocityTracker3.getXVelocity();
        android.view.VelocityTracker velocityTracker4 = this.f187072m;
        kotlin.jvm.internal.o.d(velocityTracker4);
        int yVelocity = (int) velocityTracker4.getYVelocity();
        this.isJustPassTouch = false;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f187070h = motionEvent.getRawX();
            this.f187071i = motionEvent.getRawY();
            this.f187067e = motionEvent.getRawY();
            this.f187066d = motionEvent.getRawX();
            return false;
        }
        if (action == 1 || action != 2) {
            return false;
        }
        float rawX = motionEvent.getRawX() - this.f187070h;
        float rawY = motionEvent.getRawY() - this.f187071i;
        if (this.isSupportHorizontalDrag) {
            if (this.f187080u && rawY > 0.0f) {
                this.isJustPassTouch = true;
            } else if (java.lang.Math.abs(rawX) < 5.0f || java.lang.Math.abs(rawY) > 250.0f || java.lang.Math.abs(xVelocity) <= java.lang.Math.abs(yVelocity) || java.lang.Math.abs(xVelocity) <= 0 || java.lang.Math.abs(rawX) <= java.lang.Math.abs(rawY)) {
                return false;
            }
        } else if (java.lang.Math.abs(rawY) < 5.0f || java.lang.Math.abs(rawX) > 250.0f || java.lang.Math.abs(yVelocity) <= java.lang.Math.abs(xVelocity) || java.lang.Math.abs(rawY) <= java.lang.Math.abs(rawX) || !this.f187080u || rawY < 0.0f) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        float f17;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f187077r || this.isJustPassTouch) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                hg5.j jVar = this.f187075p;
                if (jVar == null) {
                    kotlin.jvm.internal.o.o("dragHelper");
                    throw null;
                }
                android.view.View view = this.f187073n;
                if (view == null) {
                    kotlin.jvm.internal.o.o("toDragView");
                    throw null;
                }
                jVar.b(view, this.f187076q);
                this.f187067e = 0.0f;
                this.f187066d = 0.0f;
            } else if (action == 2) {
                this.f187068f = motionEvent.getRawY();
                float rawX = motionEvent.getRawX();
                this.f187069g = rawX;
                float f18 = this.f187068f - this.f187067e;
                float f19 = rawX - this.f187066d;
                if (this.isSupportHorizontalDrag) {
                    hg5.j jVar2 = this.f187075p;
                    if (jVar2 == null) {
                        kotlin.jvm.internal.o.o("dragHelper");
                        throw null;
                    }
                    float f27 = jVar2.f281427g;
                    float f28 = f19 + f27;
                    f17 = f28 >= 0.0f ? f28 : 0.0f;
                    if (jVar2 == null) {
                        kotlin.jvm.internal.o.o("dragHelper");
                        throw null;
                    }
                    if (!(f17 == f27)) {
                        if (jVar2 == null) {
                            kotlin.jvm.internal.o.o("dragHelper");
                            throw null;
                        }
                        jVar2.f281427g = f17;
                        android.view.View view2 = this.f187073n;
                        if (view2 == null) {
                            kotlin.jvm.internal.o.o("toDragView");
                            throw null;
                        }
                        view2.setTranslationX(f17);
                    }
                } else {
                    hg5.j jVar3 = this.f187075p;
                    if (jVar3 == null) {
                        kotlin.jvm.internal.o.o("dragHelper");
                        throw null;
                    }
                    float f29 = jVar3.f281426f;
                    float f37 = f18 + f29;
                    f17 = f37 >= 0.0f ? f37 : 0.0f;
                    if (jVar3 == null) {
                        kotlin.jvm.internal.o.o("dragHelper");
                        throw null;
                    }
                    if (!(f17 == f29)) {
                        if (jVar3 == null) {
                            kotlin.jvm.internal.o.o("dragHelper");
                            throw null;
                        }
                        jVar3.f281426f = f17;
                        android.view.View view3 = this.f187073n;
                        if (view3 == null) {
                            kotlin.jvm.internal.o.o("toDragView");
                            throw null;
                        }
                        view3.setTranslationY(f17);
                    }
                }
                this.f187067e = this.f187068f;
                this.f187066d = this.f187069g;
            }
        } else {
            this.f187067e = motionEvent.getRawY();
            this.f187066d = motionEvent.getRawX();
        }
        return true;
    }

    public final void setJustPassTouch(boolean z17) {
        this.isJustPassTouch = z17;
    }

    public final void setSupportHorizontalDrag(boolean z17) {
        this.isSupportHorizontalDrag = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullDownWebViewLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f187080u = true;
        this.f187081v = new com.tencent.mm.plugin.webview.ui.tools.widget.n6(this);
    }
}
