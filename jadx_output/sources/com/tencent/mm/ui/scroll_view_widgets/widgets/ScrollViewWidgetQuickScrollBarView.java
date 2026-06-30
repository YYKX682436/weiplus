package com.tencent.mm.ui.scroll_view_widgets.widgets;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001)B'\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR$\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/tencent/mm/ui/scroll_view_widgets/widgets/ScrollViewWidgetQuickScrollBarView;", "Lcom/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetBaseView;", "Lkotlin/Function1;", "", "Ljz5/f0;", "e", "Lyz5/l;", "getOnDragCallback", "()Lyz5/l;", "setOnDragCallback", "(Lyz5/l;)V", "onDragCallback", "", "f", "getOnScrollCallback", "setOnScrollCallback", "onScrollCallback", "value", "r", "Z", "setDragging", "(Z)V", "isDragging", "<set-?>", "t", "getWasLastGestureQuickTap", "()Z", "wasLastGestureQuickTap", "u", "Ljz5/g;", "getTouchSlop", "()F", "touchSlop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sj5/a", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class ScrollViewWidgetQuickScrollBarView extends com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetBaseView {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public yz5.l onDragCallback;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public yz5.l onScrollCallback;

    /* renamed from: g, reason: collision with root package name */
    public em.v3 f209796g;

    /* renamed from: h, reason: collision with root package name */
    public n3.g3 f209797h;

    /* renamed from: i, reason: collision with root package name */
    public float f209798i;

    /* renamed from: m, reason: collision with root package name */
    public float f209799m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f209800n;

    /* renamed from: o, reason: collision with root package name */
    public float f209801o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f209802p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.Choreographer.FrameCallback f209803q;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean isDragging;

    /* renamed from: s, reason: collision with root package name */
    public sj5.a f209805s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean wasLastGestureQuickTap;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final jz5.g touchSlop;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f209808v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f209790w = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479646bl);

    /* renamed from: x, reason: collision with root package name */
    public static final int f209791x = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479714d7);

    /* renamed from: y, reason: collision with root package name */
    public static final int f209792y = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479727dj);

    /* renamed from: z, reason: collision with root package name */
    public static final int f209793z = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479688cn);
    public static final int A = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479714d7);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollViewWidgetQuickScrollBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void d(com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView scrollViewWidgetQuickScrollBarView) {
        em.v3 v3Var = scrollViewWidgetQuickScrollBarView.f209796g;
        if (v3Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        android.widget.FrameLayout a17 = v3Var.a();
        if (scrollViewWidgetQuickScrollBarView.f209796g == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        a17.setPivotX(r3.a().getWidth());
        em.v3 v3Var2 = scrollViewWidgetQuickScrollBarView.f209796g;
        if (v3Var2 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        android.widget.FrameLayout a18 = v3Var2.a();
        if (scrollViewWidgetQuickScrollBarView.f209796g != null) {
            a18.setPivotY(r4.a().getHeight() / 2.0f);
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }

    private final float getTouchSlop() {
        return ((java.lang.Number) ((jz5.n) this.touchSlop).getValue()).floatValue();
    }

    private final void setDragging(boolean z17) {
        if (this.isDragging == z17) {
            return;
        }
        this.isDragging = z17;
        yz5.l lVar = this.onDragCallback;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z17));
        }
        boolean z18 = this.isDragging;
        java.lang.Runnable runnable = this.f209808v;
        if (!z18) {
            em.v3 v3Var = this.f209796g;
            if (v3Var == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            v3Var.a().animate().cancel();
            em.v3 v3Var2 = this.f209796g;
            if (v3Var2 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            v3Var2.a().animate().scaleX(1.0f).scaleY(1.0f).setStartDelay(300L).setDuration(150L).setInterpolator(new y3.b()).withStartAction(new sj5.j(this)).withEndAction(new sj5.k(this)).start();
            removeCallbacks(runnable);
            postDelayed(runnable, 3000L);
            return;
        }
        float f17 = f209791x / f209793z;
        float f18 = f209792y / A;
        em.v3 v3Var3 = this.f209796g;
        if (v3Var3 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        v3Var3.a().animate().cancel();
        em.v3 v3Var4 = this.f209796g;
        if (v3Var4 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        v3Var4.a().animate().scaleX(f17).scaleY(f18).setStartDelay(0L).setDuration(150L).setInterpolator(new y3.b()).withStartAction(new sj5.l(this)).start();
        removeCallbacks(runnable);
    }

    @Override // com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetBaseView
    public android.view.View a() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489434en4, (android.view.ViewGroup) this, false);
        em.v3 v3Var = new em.v3(inflate);
        this.f209796g = v3Var;
        if (v3Var.f254874c == null) {
            v3Var.f254874c = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.v1b);
        }
        android.widget.FrameLayout frameLayout = v3Var.f254874c;
        sj5.b bVar = new sj5.b(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.u(frameLayout, bVar);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        addOnLayoutChangeListener(new sj5.c(this));
        return inflate;
    }

    @Override // com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetBaseView
    public void b(float f17) {
        if (isLaidOut()) {
            this.f209801o = f17;
            yz5.l lVar = this.onScrollCallback;
            if (lVar != null) {
                lVar.invoke(java.lang.Float.valueOf(f17));
            }
            if (this.isDragging) {
                e();
                float f18 = this.f209799m;
                float f19 = this.f209798i;
                setTranslationY(f19 + ((f18 - f19) * e06.p.e(this.f209801o, 0.0f, 1.0f)));
                return;
            }
            if (this.f209802p) {
                return;
            }
            this.f209802p = true;
            android.view.Choreographer.getInstance().postFrameCallback(this.f209803q);
        }
    }

    @Override // com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetBaseView
    public void c(rj5.a scrollState) {
        kotlin.jvm.internal.o.g(scrollState, "scrollState");
        int ordinal = scrollState.ordinal();
        java.lang.Runnable runnable = this.f209808v;
        if (ordinal == 0) {
            removeCallbacks(runnable);
            postDelayed(runnable, 3000L);
        } else if (ordinal == 1 && getWidgetController().b()) {
            removeCallbacks(runnable);
            if (getVisibility() == 0) {
                return;
            }
            animate().cancel();
            animate().withStartAction(new sj5.h(this)).alpha(1.0f).setDuration(100L).setInterpolator(new android.view.animation.LinearInterpolator()).start();
        }
    }

    public final void e() {
        if (this.f209800n) {
            this.f209800n = false;
            n3.g3 g3Var = this.f209797h;
            e3.d a17 = g3Var != null ? g3Var.a(7) : null;
            int i17 = a17 != null ? a17.f247045b : 0;
            int i18 = a17 != null ? a17.f247047d : 0;
            int i19 = f209790w;
            this.f209798i = i17 + i19;
            float height = ((((rj5.c) getWidgetController()).f396376a.getHeight() - i18) - i19) - getHeight();
            this.f209799m = height;
            if (this.f209798i >= height) {
                this.f209798i = 0.0f;
                this.f209799m = 0.0f;
            }
        }
    }

    public final void f() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        sj5.a aVar = this.f209805s;
        this.wasLastGestureQuickTap = uptimeMillis - aVar.f408912c <= 180 && aVar.f408913d <= getTouchSlop();
        if (this.isDragging) {
            setDragging(false);
        }
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.f209805s = new sj5.a(0.0f, 0.0f, 0L, 0.0f, 0.0f, 31, null);
    }

    public final yz5.l getOnDragCallback() {
        return this.onDragCallback;
    }

    public final yz5.l getOnScrollCallback() {
        return this.onScrollCallback;
    }

    public final boolean getWasLastGestureQuickTap() {
        return this.wasLastGestureQuickTap;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.f209802p) {
            android.view.Choreographer.getInstance().removeFrameCallback(this.f209803q);
            this.f209802p = false;
        }
        f();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            android.view.ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.wasLastGestureQuickTap = false;
            float rawY = motionEvent.getRawY();
            getLocationOnScreen(new int[2]);
            this.f209805s = new sj5.a(rawY, getWidgetController().getCurrentPosition(), android.os.SystemClock.uptimeMillis(), 0.0f, rawY - r14[1]);
            setDragging(true);
            getWidgetController().a(e06.p.e(this.f209805s.f408911b, 0.0f, 1.0f), false);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float rawY2 = motionEvent.getRawY();
                sj5.a aVar = this.f209805s;
                aVar.f408913d = java.lang.Math.max(aVar.f408913d, java.lang.Math.abs(rawY2 - aVar.f408910a));
                e();
                java.lang.Float valueOf = java.lang.Float.valueOf(this.f209799m - this.f209798i);
                if (!(valueOf.floatValue() > 0.0f)) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    return false;
                }
                float floatValue = valueOf.floatValue();
                ((rj5.c) getWidgetController()).f396376a.getLocationOnScreen(new int[2]);
                getWidgetController().a(e06.p.e((((motionEvent.getRawY() - this.f209805s.f408914e) - r4[1]) - this.f209798i) / floatValue, 0.0f, 1.0f), false);
                return true;
            }
            if (actionMasked != 3) {
                return super.onTouchEvent(motionEvent);
            }
        }
        f();
        return true;
    }

    public final void setOnDragCallback(yz5.l lVar) {
        this.onDragCallback = lVar;
    }

    public final void setOnScrollCallback(yz5.l lVar) {
        this.onScrollCallback = lVar;
    }

    public /* synthetic */ ScrollViewWidgetQuickScrollBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollViewWidgetQuickScrollBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/ui/scroll_view_widgets/widgets/ScrollViewWidgetQuickScrollBarView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(this, "com/tencent/mm/ui/scroll_view_widgets/widgets/ScrollViewWidgetQuickScrollBarView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(this, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setClipChildren(false);
        setClipToPadding(false);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 53;
        setLayoutParams(layoutParams);
        this.f209800n = true;
        this.f209803q = new sj5.d(this);
        this.f209805s = new sj5.a(0.0f, 0.0f, 0L, 0.0f, 0.0f, 31, null);
        this.touchSlop = jz5.h.b(new sj5.i(context));
        this.f209808v = new sj5.g(this);
    }
}
