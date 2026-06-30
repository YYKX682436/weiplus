package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0011B!\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dB\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rJ\u001a\u0010\u0013\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010J\u001a\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0011¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveFloatContainerV2;", "Landroid/widget/FrameLayout;", "", "getCollapsedLeftX", "getCollapsedRightX", "getExpandedLeftX", "getExpandedRightX", "", "margin", "Ljz5/f0;", "setEdgeMargin", "width", "setCollapsedWidth", "", "duration", "setAnimationDuration", "Lkotlin/Function1;", "Lcom/tencent/mm/plugin/finder/live/view/v4;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnViewClickListener", "setOnStateChangeListener", "setExpandClickWidth", "getCurrentState", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveFloatContainerV2 extends android.widget.FrameLayout {
    public static final /* synthetic */ int D = 0;
    public yz5.l A;
    public yz5.l B;
    public android.view.View.OnLayoutChangeListener C;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.v4 f115873d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f115874e;

    /* renamed from: f, reason: collision with root package name */
    public float f115875f;

    /* renamed from: g, reason: collision with root package name */
    public float f115876g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f115877h;

    /* renamed from: i, reason: collision with root package name */
    public int f115878i;

    /* renamed from: m, reason: collision with root package name */
    public int f115879m;

    /* renamed from: n, reason: collision with root package name */
    public int f115880n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f115881o;

    /* renamed from: p, reason: collision with root package name */
    public long f115882p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f115883q;

    /* renamed from: r, reason: collision with root package name */
    public float f115884r;

    /* renamed from: s, reason: collision with root package name */
    public float f115885s;

    /* renamed from: t, reason: collision with root package name */
    public final int f115886t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.ValueAnimator f115887u;

    /* renamed from: v, reason: collision with root package name */
    public android.animation.ValueAnimator f115888v;

    /* renamed from: w, reason: collision with root package name */
    public long f115889w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewGroup f115890x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f115891y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.ViewGroup f115892z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFloatContainerV2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f115873d = com.tencent.mm.plugin.finder.live.view.v4.f116731d;
        this.f115874e = true;
        this.f115878i = com.tencent.mm.ui.zk.a(context, 16);
        this.f115879m = com.tencent.mm.ui.zk.a(context, 16);
        this.f115880n = com.tencent.mm.ui.zk.a(context, 28);
        this.f115881o = true;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f115886t = viewConfiguration != null ? viewConfiguration.getScaledTouchSlop() : 4;
        this.f115889w = 300L;
        setActivated(true);
        setClickable(true);
    }

    private final float getCollapsedLeftX() {
        return (-getWidth()) + this.f115879m;
    }

    private final float getCollapsedRightX() {
        java.lang.Object parent = getParent();
        if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
            return r0.getWidth() - this.f115879m;
        }
        com.tencent.mars.xlog.Log.e("FinderLiveFloatContainerV2", "getCollapsedRightX: parentView is null");
        return 0.0f;
    }

    private final float getExpandedLeftX() {
        return this.f115878i;
    }

    private final float getExpandedRightX() {
        java.lang.Object parent = getParent();
        if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
            return (r0.getWidth() - getWidth()) - this.f115878i;
        }
        com.tencent.mars.xlog.Log.e("FinderLiveFloatContainerV2", "getExpandedRightX: parentView is null");
        return 0.0f;
    }

    public final void a(float f17, float f18, boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "animateToPosition: targetX:" + f17 + ",targetY:" + f18);
        b();
        if (!z17) {
            j(f17, f18);
            return;
        }
        float x17 = getX();
        float y17 = getY();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.f115889w);
        ofFloat.addListener(new com.tencent.mm.plugin.finder.live.view.w4(this));
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.live.view.x4(x17, f17, y17, f18, this));
        ofFloat.start();
        this.f115888v = ofFloat;
    }

    public final void b() {
        android.animation.ValueAnimator valueAnimator = this.f115888v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f115888v = null;
    }

    public final void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "changeStateFromCollapsed2Expanded: animate:" + z17 + ",isDragging:" + this.f115883q + ",currentState:" + this.f115873d);
        if (this.f115883q) {
            return;
        }
        com.tencent.mm.plugin.finder.live.view.v4 v4Var = this.f115873d;
        if (v4Var == com.tencent.mm.plugin.finder.live.view.v4.f116734g) {
            a(getExpandedLeftX(), getY(), z17);
        } else if (v4Var == com.tencent.mm.plugin.finder.live.view.v4.f116735h) {
            a(getExpandedRightX(), getY(), z17);
        }
    }

    public final void d(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "changeStateFromExpanded2Collapsed: animate:" + z17 + ",isDragging:" + this.f115883q + ",currentState:" + this.f115873d);
        if (!this.f115883q && this.f115873d == com.tencent.mm.plugin.finder.live.view.v4.f116733f) {
            java.lang.Object parent = getParent();
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view != null) {
                if (((int) getX()) + (getWidth() / 2) < view.getWidth() / 2) {
                    a(getCollapsedLeftX(), getY(), z17);
                } else {
                    a(getCollapsedRightX(), getY(), z17);
                }
            }
        }
    }

    public final void e(android.view.ViewGroup viewGroup, float f17, android.view.ViewGroup viewGroup2, float f18) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(viewGroup.getWidth());
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : viewGroup.getMeasuredWidth();
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(viewGroup.getHeight());
        if (!(valueOf2.intValue() > 0)) {
            valueOf2 = null;
        }
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : viewGroup.getMeasuredHeight();
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(viewGroup2.getWidth());
        if (!(valueOf3.intValue() > 0)) {
            valueOf3 = null;
        }
        int intValue3 = valueOf3 != null ? valueOf3.intValue() : viewGroup2.getMeasuredWidth();
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(viewGroup2.getHeight());
        java.lang.Integer num = valueOf4.intValue() > 0 ? valueOf4 : null;
        int intValue4 = num != null ? num.intValue() : viewGroup2.getMeasuredHeight();
        if (intValue <= 0 || intValue2 <= 0 || intValue3 <= 0 || intValue4 <= 0) {
            com.tencent.mars.xlog.Log.w("FinderLiveFloatContainerV2", "Invalid view size, skip scaling.");
            return;
        }
        float f19 = intValue;
        float f27 = intValue3;
        float f28 = (f19 * f17) + (f27 * f18);
        float f29 = intValue2;
        float f37 = intValue4;
        float f38 = (f17 * f29) + (f18 * f37);
        viewGroup.setScaleX(f28 / f19);
        viewGroup.setScaleY(f38 / f29);
        viewGroup2.setScaleX(f28 / f27);
        viewGroup2.setScaleY(f38 / f37);
    }

    public final void f(boolean z17) {
        java.lang.Object parent = getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            int width = view.getWidth();
            int x17 = ((int) getX()) + (getWidth() / 2);
            int i17 = width / 2;
            com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "handleDraggingEnd,centerX:" + x17 + ",parentCenterX:" + i17 + ",parentWidth:" + width);
            if (x17 < 0) {
                a(getCollapsedLeftX(), getY(), z17);
                return;
            }
            if (x17 >= 0 && x17 < i17) {
                a(getExpandedLeftX(), getY(), z17);
                return;
            }
            if (i17 <= x17 && x17 < width) {
                a(getExpandedRightX(), getY(), z17);
            } else {
                a(getCollapsedRightX(), getY(), z17);
            }
        }
    }

    public final void g(android.view.ViewGroup viewGroup, float f17, android.view.ViewGroup viewGroup2, float f18) {
        android.view.ViewGroup[] viewGroupArr = new android.view.ViewGroup[3];
        android.view.ViewGroup viewGroup3 = this.f115890x;
        if (viewGroup3 == null) {
            kotlin.jvm.internal.o.o("expandedView");
            throw null;
        }
        viewGroupArr[0] = viewGroup3;
        android.view.ViewGroup viewGroup4 = this.f115891y;
        if (viewGroup4 == null) {
            kotlin.jvm.internal.o.o("expandedGradientView");
            throw null;
        }
        viewGroupArr[1] = viewGroup4;
        android.view.ViewGroup viewGroup5 = this.f115892z;
        if (viewGroup5 == null) {
            kotlin.jvm.internal.o.o("collapsedView");
            throw null;
        }
        viewGroupArr[2] = viewGroup5;
        java.util.List i17 = kz5.c0.i(viewGroupArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : i17) {
            android.view.ViewGroup viewGroup6 = (android.view.ViewGroup) obj;
            if ((kotlin.jvm.internal.o.b(viewGroup6, viewGroup) || kotlin.jvm.internal.o.b(viewGroup6, viewGroup2)) ? false : true) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.view.ViewGroup) it.next()).setVisibility(8);
        }
        viewGroup.setVisibility(0);
        viewGroup.setAlpha(f17);
        viewGroup.setScaleX(1.0f);
        viewGroup.setScaleY(1.0f);
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(f18);
        }
        if (viewGroup2 != null) {
            viewGroup2.setScaleX(1.0f);
        }
        if (viewGroup2 != null) {
            viewGroup2.setScaleY(1.0f);
        }
        if (viewGroup2 != null) {
            android.view.ViewGroup viewGroup7 = this.f115892z;
            if (viewGroup7 == null) {
                kotlin.jvm.internal.o.o("collapsedView");
                throw null;
            }
            if (kotlin.jvm.internal.o.b(viewGroup, viewGroup7)) {
                e(viewGroup, f17, viewGroup2, f18);
                return;
            }
            android.view.ViewGroup viewGroup8 = this.f115892z;
            if (viewGroup8 == null) {
                kotlin.jvm.internal.o.o("collapsedView");
                throw null;
            }
            if (kotlin.jvm.internal.o.b(viewGroup2, viewGroup8)) {
                e(viewGroup2, f18, viewGroup, f17);
            }
        }
    }

    /* renamed from: getCurrentState, reason: from getter */
    public final com.tencent.mm.plugin.finder.live.view.v4 getF115873d() {
        return this.f115873d;
    }

    public final void h(boolean z17, yz5.a aVar) {
        com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "hideStatePanel: animate:" + z17 + ",currentState:" + this.f115873d);
        com.tencent.mm.plugin.finder.live.view.v4 v4Var = this.f115873d;
        com.tencent.mm.plugin.finder.live.view.v4 v4Var2 = com.tencent.mm.plugin.finder.live.view.v4.f116732e;
        if (v4Var == v4Var2) {
            return;
        }
        k(v4Var2);
        b();
        android.animation.ValueAnimator valueAnimator = this.f115887u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f115887u = null;
        if (!z17) {
            this.f115881o = true;
            setAlpha(0.0f);
            setVisibility(8);
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        setAlpha(1.0f);
        this.f115881o = true;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(this.f115889w);
        ofFloat.addListener(new com.tencent.mm.plugin.finder.live.view.y4(this, aVar));
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.live.view.z4(this));
        ofFloat.start();
        this.f115887u = ofFloat;
    }

    public final void i(boolean z17) {
        java.lang.Object parent = getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            if (((int) getX()) + (getWidth() / 2) < view.getWidth() / 2) {
                com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "refreshExpandedState: left");
                a(getExpandedLeftX(), getY(), z17);
            } else {
                com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "refreshExpandedState: right");
                a(getExpandedRightX(), getY(), z17);
            }
        }
    }

    public final void j(float f17, float f18) {
        setX(f17);
        setY(f18);
        java.lang.Object parent = getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            int width = view.getWidth();
            int x17 = ((int) getX()) + (getWidth() / 2);
            if (x17 >= 0 && x17 < width) {
                int width2 = getWidth() / 2;
                if (width2 <= 0) {
                    com.tencent.mars.xlog.Log.e("FinderLiveFloatContainerV2", "updatePosition: halfWidth <= 0");
                    return;
                }
                if (width2 <= x17 && x17 < width - width2) {
                    android.view.ViewGroup viewGroup = this.f115890x;
                    if (viewGroup == null) {
                        kotlin.jvm.internal.o.o("expandedView");
                        throw null;
                    }
                    g(viewGroup, 1.0f, null, 0.0f);
                } else {
                    float f19 = (x17 < width2 ? x17 : width - x17) / width2;
                    android.view.ViewGroup viewGroup2 = this.f115890x;
                    if (viewGroup2 == null) {
                        kotlin.jvm.internal.o.o("expandedView");
                        throw null;
                    }
                    android.view.ViewGroup viewGroup3 = this.f115891y;
                    if (viewGroup3 == null) {
                        kotlin.jvm.internal.o.o("expandedGradientView");
                        throw null;
                    }
                    g(viewGroup2, f19, viewGroup3, 1.0f - f19);
                }
            } else {
                int width3 = (getWidth() / 2) - this.f115879m;
                if (width3 <= 0) {
                    com.tencent.mars.xlog.Log.e("FinderLiveFloatContainerV2", "updatePosition: displacement <= 0");
                    return;
                }
                if (x17 < (-width3) || x17 > width + width3) {
                    android.view.ViewGroup viewGroup4 = this.f115892z;
                    if (viewGroup4 == null) {
                        kotlin.jvm.internal.o.o("collapsedView");
                        throw null;
                    }
                    g(viewGroup4, 1.0f, null, 0.0f);
                } else {
                    float f27 = (x17 < 0 ? -x17 : x17 - width) / width3;
                    android.view.ViewGroup viewGroup5 = this.f115892z;
                    if (viewGroup5 == null) {
                        kotlin.jvm.internal.o.o("collapsedView");
                        throw null;
                    }
                    android.view.ViewGroup viewGroup6 = this.f115891y;
                    if (viewGroup6 == null) {
                        kotlin.jvm.internal.o.o("expandedGradientView");
                        throw null;
                    }
                    g(viewGroup5, f27, viewGroup6, 1.0f - f27);
                }
            }
            float collapsedLeftX = getCollapsedLeftX();
            float collapsedRightX = getCollapsedRightX();
            if (java.lang.Math.abs(f17 - collapsedLeftX) < 0.1f) {
                k(com.tencent.mm.plugin.finder.live.view.v4.f116734g);
                return;
            }
            if (java.lang.Math.abs(f17 - collapsedRightX) < 0.1f) {
                k(com.tencent.mm.plugin.finder.live.view.v4.f116735h);
            } else {
                k(com.tencent.mm.plugin.finder.live.view.v4.f116733f);
            }
        }
    }

    public final void k(com.tencent.mm.plugin.finder.live.view.v4 v4Var) {
        if (v4Var == com.tencent.mm.plugin.finder.live.view.v4.f116734g || v4Var == com.tencent.mm.plugin.finder.live.view.v4.f116735h) {
            java.lang.Object parent = getParent();
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                getHitRect(rect);
                int i17 = rect.left;
                int i18 = this.f115880n;
                rect.left = i17 - i18;
                rect.right += i18;
                view.setTouchDelegate(new android.view.TouchDelegate(rect, this));
            }
        } else if (!this.f115883q) {
            java.lang.Object parent2 = getParent();
            android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
            if (view2 != null) {
                view2.setTouchDelegate(null);
            }
        }
        if (this.f115873d == v4Var) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "setState: " + v4Var + ",oldState: " + this.f115873d);
        this.f115873d = v4Var;
        yz5.l lVar = this.B;
        if (lVar != null) {
            lVar.invoke(v4Var);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f115881o) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f115881o) {
            return false;
        }
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f115884r = motionEvent.getRawX();
            this.f115885s = motionEvent.getRawY();
            this.f115883q = false;
            this.f115882p = java.lang.System.currentTimeMillis();
            b();
            com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "onTouchEvent: ACTION_DOWN, " + motionEvent + ",touchDownTimestamp:" + this.f115882p);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            float rawX = motionEvent.getRawX() - this.f115884r;
            float rawY = motionEvent.getRawY() - this.f115885s;
            if (!this.f115883q) {
                float abs = java.lang.Math.abs(rawX);
                int i17 = this.f115886t;
                if (abs > i17 || java.lang.Math.abs(rawY) > i17) {
                    this.f115883q = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            if (this.f115883q) {
                float x17 = getX() + rawX;
                float y17 = getY();
                float expandedRightX = getExpandedRightX();
                if (expandedRightX >= x17) {
                    x17 = expandedRightX;
                }
                j(x17, y17);
                this.f115884r = motionEvent.getRawX();
                this.f115885s = motionEvent.getRawY();
            }
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "onTouchEvent: ACTION_UP/CANCEL,isDragging:" + this.f115883q);
                if (this.f115883q) {
                    this.f115883q = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    f(true);
                } else if (java.lang.System.currentTimeMillis() - this.f115882p < android.view.ViewConfiguration.getTapTimeout()) {
                    performClick();
                }
                this.f115882p = 0L;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "performClick，currentState:" + this.f115873d);
        com.tencent.mm.plugin.finder.live.view.v4 v4Var = this.f115873d;
        if (v4Var == com.tencent.mm.plugin.finder.live.view.v4.f116734g || v4Var == com.tencent.mm.plugin.finder.live.view.v4.f116735h) {
            c(true);
        }
        yz5.l lVar = this.A;
        if (lVar != null) {
            lVar.invoke(this.f115873d);
        }
        return super.performClick();
    }

    public final void setAnimationDuration(long j17) {
        this.f115889w = j17;
    }

    public final void setCollapsedWidth(int i17) {
        this.f115879m = i17;
    }

    public final void setEdgeMargin(int i17) {
        this.f115878i = i17;
    }

    public final void setExpandClickWidth(int i17) {
        this.f115880n = i17;
    }

    public final void setOnStateChangeListener(yz5.l listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.B = listener;
    }

    public final void setOnViewClickListener(yz5.l listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.A = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveFloatContainerV2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
