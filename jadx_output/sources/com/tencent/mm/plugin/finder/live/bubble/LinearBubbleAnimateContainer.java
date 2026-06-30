package com.tencent.mm.plugin.finder.live.bubble;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/bubble/LinearBubbleAnimateContainer;", "Landroid/widget/LinearLayout;", "Lkotlinx/coroutines/y0;", "getScope", "", "getDelayTime", "", "isNeedAnimate", "Ljz5/f0;", "setIsNeedAnimateShow", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class LinearBubbleAnimateContainer extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f111515d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f111516e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.y0 f111517f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f111518g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f111519h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinearBubbleAnimateContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void c(com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer linearBubbleAnimateContainer) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runBubbleShow size = ");
        java.util.LinkedList linkedList = linearBubbleAnimateContainer.f111515d;
        sb6.append(linkedList.size());
        com.tencent.mars.xlog.Log.i("LinearBubbleAnimateContainer", sb6.toString());
        if (linkedList.size() == 0) {
            return;
        }
        pm0.v.X(new ie2.l(linearBubbleAnimateContainer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getDelayTime() {
        return this.f111515d.size() >= 1 ? 3000L : 5000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r1 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.y0 getScope() {
        /*
            r2 = this;
            kotlinx.coroutines.y0 r0 = r2.f111517f
            if (r0 == 0) goto L10
            r1 = 0
            if (r0 == 0) goto Le
            boolean r0 = kotlinx.coroutines.z0.h(r0)
            if (r0 != 0) goto Le
            r1 = 1
        Le:
            if (r1 == 0) goto L16
        L10:
            kotlinx.coroutines.y0 r0 = kotlinx.coroutines.z0.b()
            r2.f111517f = r0
        L16:
            kotlinx.coroutines.y0 r0 = r2.f111517f
            if (r0 != 0) goto L1e
            kotlinx.coroutines.y0 r0 = kotlinx.coroutines.z0.b()
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer.getScope():kotlinx.coroutines.y0");
    }

    public final void d() {
        if (getOrientation() != 0) {
            return;
        }
        int childCount = getChildCount();
        int i17 = -1;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = getChildAt(i18);
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout = childAt instanceof com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout ? (com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout) childAt : null;
            if (frameBubbleContentLayout != null && frameBubbleContentLayout.getVisibility() == 0) {
                int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
                if (i17 == -1) {
                    dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
                    i17 = i18;
                }
                android.view.ViewGroup.LayoutParams layoutParams = frameBubbleContentLayout.getTargetLayout().getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = dimensionPixelOffset;
                }
                frameBubbleContentLayout.requestLayout();
            }
        }
    }

    public final void e(boolean z17, com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout) {
        if (getOrientation() == 0) {
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = getChildAt(i17);
                com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout2 = childAt instanceof com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout ? (com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout) childAt : null;
                if (frameBubbleContentLayout2 != null && frameBubbleContentLayout2.getVisibility() == 0) {
                    android.view.ViewGroup.LayoutParams layoutParams = frameBubbleContentLayout2.getTargetLayout().getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.leftMargin = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
                    }
                }
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = frameBubbleContentLayout.getTargetLayout().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.leftMargin = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
            }
            removeView(frameBubbleContentLayout);
            addView(frameBubbleContentLayout, 0);
        } else {
            int childCount2 = getChildCount();
            for (int i18 = 0; i18 < childCount2; i18++) {
                android.view.View childAt2 = getChildAt(i18);
                if (childAt2 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.leftMargin = 0;
                    }
                }
            }
            bringChildToFront(frameBubbleContentLayout);
        }
        if (z17) {
            f(frameBubbleContentLayout, 0);
        } else {
            frameBubbleContentLayout.setVisibility(0);
        }
        ie2.h hVar = frameBubbleContentLayout.sceneStateListener;
        if (hVar != null) {
            hVar.j();
        }
    }

    public final void f(com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout, int i17) {
        if (frameBubbleContentLayout.getParent() != null) {
            androidx.transition.AutoTransition autoTransition = new androidx.transition.AutoTransition();
            autoTransition.W(com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout.class);
            u4.g1.a(this, autoTransition);
        } else {
            pm0.z.b(xy2.b.f458155b, "frameBubbleContentLayout_parent_null", false, null, null, false, false, null, 124, null);
        }
        frameBubbleContentLayout.setVisibility(i17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromWindow currentJob: ");
        kotlinx.coroutines.r2 r2Var = this.f111518g;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
        com.tencent.mars.xlog.Log.i("LinearBubbleAnimateContainer", sb6.toString());
        kotlinx.coroutines.r2 r2Var2 = this.f111518g;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        kotlinx.coroutines.y0 y0Var = this.f111517f;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        this.f111517f = null;
    }

    public final void setIsNeedAnimateShow(boolean z17) {
        this.f111519h = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearBubbleAnimateContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f111515d = new java.util.LinkedList();
        this.f111516e = new java.util.LinkedList();
        this.f111519h = true;
    }
}
