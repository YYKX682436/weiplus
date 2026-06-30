package com.tencent.mm.ui.vas.launcher;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/ui/vas/launcher/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Ljz5/f0;", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnApplyWindowInsetsListener", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public class FragmentContainerView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f211141d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f211142e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnApplyWindowInsetsListener f211143f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f211144g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(android.view.View view) {
        if (((java.util.ArrayList) this.f211142e).contains(view)) {
            ((java.util.ArrayList) this.f211141d).add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View child, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.o.g(child, "child");
        super.addView(child, i17, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets insets) {
        n3.g3 i17;
        kotlin.jvm.internal.o.g(insets, "insets");
        n3.g3 i18 = n3.g3.i(insets, null);
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f211143f;
        if (onApplyWindowInsetsListener != null) {
            android.view.WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.o.f(onApplyWindowInsets, "onApplyWindowInsets(...)");
            i17 = n3.g3.i(onApplyWindowInsets, null);
        } else {
            i17 = n3.l1.i(this, i18);
        }
        kotlin.jvm.internal.o.d(i17);
        if (!i17.f334338a.n()) {
            int childCount = getChildCount();
            for (int i19 = 0; i19 < childCount; i19++) {
                n3.l1.b(getChildAt(i19), i17);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (this.f211144g) {
            java.util.Iterator it = this.f211141d.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (android.view.View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long j17) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(child, "child");
        if (this.f211144g) {
            java.util.List list = this.f211141d;
            if ((!list.isEmpty()) && ((java.util.ArrayList) list).contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j17);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        ((java.util.ArrayList) this.f211142e).remove(view);
        if (((java.util.ArrayList) this.f211141d).remove(view)) {
            this.f211144g = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets insets) {
        kotlin.jvm.internal.o.g(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                android.view.View childAt = getChildAt(childCount);
                kotlin.jvm.internal.o.d(childAt);
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i17) {
        android.view.View childAt = getChildAt(i17);
        kotlin.jvm.internal.o.d(childAt);
        a(childAt);
        super.removeViewAt(i17);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i17, int i18) {
        int i19 = i17 + i18;
        for (int i27 = i17; i27 < i19; i27++) {
            android.view.View childAt = getChildAt(i27);
            kotlin.jvm.internal.o.d(childAt);
            a(childAt);
        }
        super.removeViews(i17, i18);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i17, int i18) {
        int i19 = i17 + i18;
        for (int i27 = i17; i27 < i19; i27++) {
            android.view.View childAt = getChildAt(i27);
            kotlin.jvm.internal.o.d(childAt);
            a(childAt);
        }
        super.removeViewsInLayout(i17, i18);
    }

    public final void setDrawDisappearingViewsLast(boolean z17) {
        this.f211144g = z17;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        throw new java.lang.UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f211143f = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (view.getParent() == this) {
            ((java.util.ArrayList) this.f211142e).add(view);
        }
        super.startViewTransition(view);
    }

    public /* synthetic */ FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        this.f211141d = new java.util.ArrayList();
        this.f211142e = new java.util.ArrayList();
        this.f211144g = true;
        if (attributeSet != null) {
            java.lang.String classAttribute = attributeSet.getClassAttribute();
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v3.a.f433081b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new java.lang.UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }
}
