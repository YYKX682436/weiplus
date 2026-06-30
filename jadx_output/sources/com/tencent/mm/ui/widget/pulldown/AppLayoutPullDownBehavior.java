package com.tencent.mm.ui.widget.pulldown;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/widget/pulldown/AppLayoutPullDownBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class AppLayoutPullDownBehavior extends com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.OverScroller f212404m;

    /* renamed from: n, reason: collision with root package name */
    public int f212405n;

    /* renamed from: o, reason: collision with root package name */
    public int f212406o;

    /* renamed from: p, reason: collision with root package name */
    public int f212407p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.ValueAnimator f212408q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.animation.Interpolator f212409r;

    public AppLayoutPullDownBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212409r = new android.view.animation.DecelerateInterpolator(0.8f);
    }

    public final int F(android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        return (i17 == 2 || i17 == 8) ? child.getHeight() / 3 : (-child.getHeight()) / 3;
    }

    public final int G(android.view.View child) {
        kotlin.jvm.internal.o.g(child, "child");
        return (int) child.getTranslationY();
    }

    public final int H(android.view.View view, int i17, int i18, int i19) {
        int b17;
        float abs = 1 + (4 * ((java.lang.Math.abs(G(view)) * 1.0f) / view.getHeight()));
        int G = G(view) - ((int) ((i17 / (abs == 0.0f ? 1.0f : abs)) + 0.5f));
        int G2 = G(view);
        if (G2 < i18 || G2 > i19 || G2 == (b17 = h3.a.b(G, i18, i19))) {
            return 0;
        }
        view.setTranslationY(b17);
        return G2 - b17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r1.isStarted() == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(android.view.View r6) {
        /*
            r5 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.o.g(r6, r0)
            int r0 = r5.G(r6)
            if (r0 != 0) goto Lc
            return
        Lc:
            android.animation.ValueAnimator r1 = r5.f212408q
            r2 = 0
            if (r1 != 0) goto L23
            int[] r1 = new int[r2]
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
            r5.f212408q = r1
            if (r1 == 0) goto L23
            ul5.a r3 = new ul5.a
            r3.<init>(r5, r6)
            r1.addUpdateListener(r3)
        L23:
            android.animation.ValueAnimator r1 = r5.f212408q
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStarted()
            r3 = 1
            if (r1 != r3) goto L2f
            goto L30
        L2f:
            r3 = r2
        L30:
            if (r3 == 0) goto L33
            return
        L33:
            int r1 = java.lang.Math.abs(r0)
            float r1 = (float) r1
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r3
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r1 = r1 / r6
            r6 = 300(0x12c, float:4.2E-43)
            float r6 = (float) r6
            float r1 = r1 * r6
            android.animation.ValueAnimator r6 = r5.f212408q
            if (r6 == 0) goto L54
            int r1 = (int) r1
            r3 = 150(0x96, float:2.1E-43)
            int r1 = java.lang.Math.max(r1, r3)
            long r3 = (long) r1
            r6.setDuration(r3)
        L54:
            android.animation.ValueAnimator r6 = r5.f212408q
            if (r6 == 0) goto L5d
            android.view.animation.Interpolator r1 = r5.f212409r
            r6.setInterpolator(r1)
        L5d:
            android.animation.ValueAnimator r6 = r5.f212408q
            if (r6 == 0) goto L68
            int[] r0 = new int[]{r0, r2}
            r6.setIntValues(r0)
        L68:
            android.animation.ValueAnimator r6 = r5.f212408q
            if (r6 == 0) goto L6f
            r6.start()
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.pulldown.AppLayoutPullDownBehavior.I(android.view.View):void");
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout parent, android.view.View child, android.view.View dependency) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(dependency, "dependency");
        return dependency instanceof com.google.android.material.appbar.AppBarLayout;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout parent, android.view.View child, android.view.View dependency) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(dependency, "dependency");
        super.d(parent, child, dependency);
        return false;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout parent, android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(child, "child");
        java.lang.Integer.TYPE.getName();
        super.g(parent, child, i17);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean i(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View child, android.view.View target, float f17, float f18, boolean z17) {
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        target.toString();
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View child, android.view.View target, float f17, float f18) {
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        if (this.f212404m == null) {
            this.f212404m = new android.widget.OverScroller(coordinatorLayout.getContext());
        }
        android.widget.OverScroller overScroller = this.f212404m;
        if (overScroller == null) {
            return false;
        }
        overScroller.fling(0, 0, 0, (int) f18, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View child, android.view.View target, int i17, int i18, int[] consumed, int i19) {
        int G;
        int i27;
        int b17;
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(consumed, "consumed");
        child.getClass().toString();
        target.getClass().toString();
        int i28 = 0;
        if (i18 != 0) {
            if (i18 < 0) {
                i27 = G(coordinatorLayout);
                G = 0;
            } else {
                G = G(coordinatorLayout);
                i27 = 0;
            }
            if (i27 != G) {
                int G2 = G(coordinatorLayout) - i18;
                int G3 = G(coordinatorLayout);
                if (G3 >= i27 && G3 <= G && G3 != (b17 = h3.a.b(G2, i27, G))) {
                    coordinatorLayout.setTranslationY(b17);
                    i28 = G3 - b17;
                }
            }
        }
        consumed[1] = i28;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void o(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View child, android.view.View target, int i17, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        if (i18 != 0 || i27 == 0) {
            super.o(coordinatorLayout, child, target, i17, i18, i19, i27, i28);
            return;
        }
        if (i27 < 0) {
            if (i28 == 0) {
                H(coordinatorLayout, i27, 0, coordinatorLayout.getHeight());
                return;
            }
            android.widget.OverScroller overScroller = this.f212404m;
            if (overScroller != null && overScroller.computeScrollOffset()) {
                float abs = java.lang.Math.abs(overScroller.getCurrVelocity());
                if (this.f212407p <= 0) {
                    this.f212407p = android.view.ViewConfiguration.get(coordinatorLayout.getContext()).getScaledMinimumFlingVelocity() * 15;
                }
                if (abs >= java.lang.Math.abs(this.f212407p) && G(coordinatorLayout) < F(coordinatorLayout, this.f212405n)) {
                    H(coordinatorLayout, i27, G(coordinatorLayout), F(coordinatorLayout, this.f212405n));
                    return;
                }
            }
            n3.l1.p(target, 1);
            return;
        }
        if (i27 > 0) {
            if (i28 == 0) {
                H(coordinatorLayout, i27, -coordinatorLayout.getHeight(), 0);
                return;
            }
            android.widget.OverScroller overScroller2 = this.f212404m;
            if (overScroller2 != null && overScroller2.computeScrollOffset()) {
                float abs2 = java.lang.Math.abs(overScroller2.getCurrVelocity());
                if (this.f212407p <= 0) {
                    this.f212407p = android.view.ViewConfiguration.get(coordinatorLayout.getContext()).getScaledMinimumFlingVelocity() * 15;
                }
                if (abs2 >= java.lang.Math.abs(this.f212407p) && G(coordinatorLayout) > F(coordinatorLayout, this.f212406o)) {
                    H(coordinatorLayout, i27, F(coordinatorLayout, this.f212406o), G(coordinatorLayout));
                    return;
                }
            }
            n3.l1.p(target, 1);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void p(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View child, android.view.View directTargetChild, android.view.View target, int i17, int i18) {
        android.widget.OverScroller overScroller;
        android.animation.ValueAnimator valueAnimator;
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(directTargetChild, "directTargetChild");
        kotlin.jvm.internal.o.g(target, "target");
        directTargetChild.toString();
        if (i18 == 0 && (valueAnimator = this.f212408q) != null && valueAnimator.isRunning()) {
            android.animation.ValueAnimator valueAnimator2 = this.f212408q;
            kotlin.jvm.internal.o.d(valueAnimator2);
            valueAnimator2.cancel();
        }
        if (i18 == 0 && (overScroller = this.f212404m) != null) {
            overScroller.forceFinished(true);
        }
        if ((i17 & 2) != 0) {
            this.f212405n = 2;
            this.f212406o = 1;
        } else {
            this.f212405n = 8;
            this.f212406o = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean u(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View child, android.view.View directTargetChild, android.view.View target, int i17, int i18) {
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(directTargetChild, "directTargetChild");
        kotlin.jvm.internal.o.g(target, "target");
        return (i17 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void w(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View child, android.view.View target, int i17) {
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        child.getClass().toString();
        target.toString();
        if (i17 != 0) {
            if (G(coordinatorLayout) != 0) {
                I(coordinatorLayout);
            }
        } else if (G(coordinatorLayout) != 0) {
            android.widget.OverScroller overScroller = this.f212404m;
            if (overScroller == null || !overScroller.computeScrollOffset()) {
                I(coordinatorLayout);
            }
        }
    }
}
