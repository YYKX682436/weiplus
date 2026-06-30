package com.tencent.mm.view.recyclerview;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001)B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&B#\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010'\u001a\u00020\n¢\u0006\u0004\b%\u0010(J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lcom/tencent/mm/view/x2c/X2CRecyclerView;", "", "Landroidx/recyclerview/widget/f2;", "adapter", "Ljz5/f0;", "setAdapter", "", "frozen", "setLayoutFrozen", "", "b2", "I", "getFlingSpeedFactor", "()I", "setFlingSpeedFactor", "(I)V", "flingSpeedFactor", "c2", "Z", "getRemoveAnimatorWhenDetach", "()Z", "setRemoveAnimatorWhenDetach", "(Z)V", "removeAnimatorWhenDetach", "", "e2", "Ljava/lang/String;", "getSubTag", "()Ljava/lang/String;", "setSubTag", "(Ljava/lang/String;)V", "subTag", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "in5/p1", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class WxRecyclerView extends com.tencent.mm.view.x2c.X2CRecyclerView {

    /* renamed from: g2, reason: collision with root package name */
    public static final in5.p1 f213722g2 = new in5.p1(null);

    /* renamed from: h2, reason: collision with root package name */
    public static final jz5.g f213723h2 = jz5.h.b(in5.o1.f293111d);

    /* renamed from: i2, reason: collision with root package name */
    public static final jz5.g f213724i2 = jz5.h.b(in5.n1.f293110d);

    /* renamed from: b2, reason: collision with root package name and from kotlin metadata */
    public int flingSpeedFactor;

    /* renamed from: c2, reason: collision with root package name and from kotlin metadata */
    public boolean removeAnimatorWhenDetach;

    /* renamed from: d2, reason: collision with root package name */
    public androidx.recyclerview.widget.n2 f213727d2;

    /* renamed from: e2, reason: collision with root package name and from kotlin metadata */
    public java.lang.String subTag;

    /* renamed from: f2, reason: collision with root package name */
    public final in5.q1 f213729f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WxRecyclerView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.flingSpeedFactor = 100;
        this.subTag = "";
        this.f213729f2 = new in5.q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void a1(int i17) {
        super.a1(i17);
        f213722g2.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void b1(int i17, int i18, android.view.animation.Interpolator interpolator) {
        java.lang.Object obj;
        super.b1(i17, i18, interpolator);
        in5.p1 p1Var = f213722g2;
        if (p1Var.b()) {
            java.util.Objects.toString(interpolator);
            if (p1Var.a()) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                obj = new com.tencent.mm.sdk.platformtools.z3();
            } else {
                obj = "";
            }
            obj.toString();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void c1(int i17) {
        java.lang.Object obj;
        super.c1(i17);
        in5.p1 p1Var = f213722g2;
        if (p1Var.b()) {
            if (p1Var.a()) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                obj = new com.tencent.mm.sdk.platformtools.z3();
            } else {
                obj = "";
            }
            obj.toString();
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        boolean canScrollHorizontally = super.canScrollHorizontally(i17);
        if (f213722g2.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxRecyclerView", "[canScrollHorizontally] direction=" + i17 + " result=" + canScrollHorizontally);
        }
        return canScrollHorizontally;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i17) {
        boolean canScrollVertically = super.canScrollVertically(i17);
        if (f213722g2.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxRecyclerView", "[canScrollVertically] direction=" + i17 + " result=" + canScrollVertically);
        }
        return canScrollVertically;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void f1() {
        java.lang.Object obj;
        super.f1();
        in5.p1 p1Var = f213722g2;
        if (p1Var.b()) {
            if (p1Var.a()) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                obj = new com.tencent.mm.sdk.platformtools.z3();
            } else {
                obj = "";
            }
            obj.toString();
        }
    }

    public final int getFlingSpeedFactor() {
        return this.flingSpeedFactor;
    }

    public final boolean getRemoveAnimatorWhenDetach() {
        return this.removeAnimatorWhenDetach;
    }

    public final java.lang.String getSubTag() {
        return this.subTag;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (this.removeAnimatorWhenDetach) {
            if (getItemAnimator() == null) {
                setItemAnimator(this.f213727d2);
            } else {
                this.f213727d2 = null;
            }
        }
        super.onAttachedToWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.removeAnimatorWhenDetach) {
            this.f213727d2 = getItemAnimator();
            setItemAnimator(null);
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.lang.Object obj;
        super.onLayout(z17, i17, i18, i19, i27);
        in5.p1 p1Var = f213722g2;
        if (p1Var.b()) {
            if (p1Var.a()) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                obj = new com.tencent.mm.sdk.platformtools.z3();
            } else {
                obj = "";
            }
            obj.toString();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        java.lang.String str = this.subTag;
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxRecyclerView", this.subTag + ", onMeasure");
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        java.lang.Object obj;
        super.onViewAdded(view);
        in5.p1 p1Var = f213722g2;
        if (p1Var.b()) {
            java.util.Objects.toString(view);
            if (p1Var.a()) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                obj = new com.tencent.mm.sdk.platformtools.z3();
            } else {
                obj = "";
            }
            obj.toString();
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        java.lang.Object obj;
        super.onViewRemoved(view);
        in5.p1 p1Var = f213722g2;
        if (p1Var.b()) {
            java.util.Objects.toString(view);
            if (p1Var.a()) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                obj = new com.tencent.mm.sdk.platformtools.z3();
            } else {
                obj = "";
            }
            obj.toString();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean r0(int i17, int i18) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return super.r0(a06.d.b((i17 * this.flingSpeedFactor) / 100.0f), i18);
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
        return layoutManager2 != null && layoutManager2.getF123307r() ? super.r0(i17, a06.d.b((i18 * this.flingSpeedFactor) / 100.0f)) : super.r0(i17, i18);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        java.lang.Object obj;
        super.requestLayout();
        in5.p1 p1Var = f213722g2;
        if (p1Var.b()) {
            if (p1Var.a()) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                obj = new com.tencent.mm.sdk.platformtools.z3();
            } else {
                obj = "";
            }
            obj.toString();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void scrollBy(int i17, int i18) {
        super.scrollBy(i17, i18);
        f213722g2.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void scrollTo(int i17, int i18) {
        f213722g2.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(androidx.recyclerview.widget.f2 f2Var) {
        super.setAdapter(f2Var);
        if (f2Var instanceof in5.n0) {
            ((in5.n0) f2Var).f293097d = true;
        }
        in5.q1 q1Var = this.f213729f2;
        if (f2Var != null) {
            try {
                f2Var.unregisterAdapterDataObserver(q1Var);
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxRecyclerView", e17.toString());
            }
        }
        if (f2Var != null) {
            f2Var.registerAdapterDataObserver(q1Var);
        }
    }

    public final void setFlingSpeedFactor(int i17) {
        this.flingSpeedFactor = i17;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutFrozen(boolean z17) {
        java.lang.Object obj;
        super.setLayoutFrozen(z17);
        in5.p1 p1Var = f213722g2;
        if (p1Var.b()) {
            if (p1Var.a()) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                obj = new com.tencent.mm.sdk.platformtools.z3();
            } else {
                obj = "";
            }
            obj.toString();
        }
    }

    public final void setRemoveAnimatorWhenDetach(boolean z17) {
        this.removeAnimatorWhenDetach = z17;
    }

    public final void setSubTag(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.subTag = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WxRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.flingSpeedFactor = 100;
        this.subTag = "";
        this.f213729f2 = new in5.q1();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WxRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.flingSpeedFactor = 100;
        this.subTag = "";
        this.f213729f2 = new in5.q1();
    }
}
