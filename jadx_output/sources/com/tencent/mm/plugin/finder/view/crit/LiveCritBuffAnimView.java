package com.tencent.mm.plugin.finder.view.crit;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/crit/LiveCritBuffAnimView;", "Landroid/widget/LinearLayout;", "", "f", "Ljz5/g;", "getTRAN_Y", "()F", "TRAN_Y", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LiveCritBuffAnimView extends android.widget.LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f131803g = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f131804d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f131805e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g TRAN_Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveCritBuffAnimView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131805e = "LiveCritBuffAnimView";
        this.TRAN_Y = jz5.h.b(ax2.a.f15029d);
        b();
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "str");
        androidx.transition.TransitionSet transitionSet = new androidx.transition.TransitionSet();
        transitionSet.b0(0);
        transitionSet.X(new androidx.transition.Slide());
        transitionSet.X(new androidx.transition.Fade(1));
        transitionSet.X(new androidx.transition.ChangeBounds());
        android.widget.LinearLayout linearLayout = this.f131804d;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        u4.g1.a(linearLayout, transitionSet);
        android.widget.LinearLayout linearLayout2 = this.f131804d;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        int childCount = linearLayout2.getChildCount();
        if (childCount > 0) {
            for (int i17 = 0; i17 < childCount; i17++) {
                android.widget.LinearLayout linearLayout3 = this.f131804d;
                if (linearLayout3 == null) {
                    kotlin.jvm.internal.o.o("root");
                    throw null;
                }
                android.view.View childAt = linearLayout3.getChildAt(i17);
                kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
                java.lang.Object tag = childAt.getTag();
                if (!kotlin.jvm.internal.o.b(tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null, java.lang.Boolean.TRUE)) {
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(childAt, "alpha", 1.0f, 0.2f);
                    android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(childAt, "scaleX", 1.0f, 0.8f);
                    android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(childAt, "scaleY", 1.0f, 0.8f);
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
                    animatorSet.setDuration(600L);
                    animatorSet.addListener(new ax2.c(this, childAt));
                    animatorSet.start();
                }
            }
        }
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        com.tencent.mm.ui.fk.a(textView);
        textView.setShadowLayer(1.0f, 0.0f, 1.0f, android.graphics.Color.parseColor("#FF6146"));
        textView.setTextColor(textView.getContext().getColor(com.tencent.mm.R.color.f478553an));
        textView.invalidate();
        android.widget.LinearLayout linearLayout4 = this.f131804d;
        if (linearLayout4 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        linearLayout4.addView(textView, linearLayout4.getChildCount());
    }

    public final void b() {
        android.view.View findViewById = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.awy, this).findViewById(com.tencent.mm.R.id.i98);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        this.f131804d = linearLayout;
        linearLayout.setGravity(80);
        android.widget.LinearLayout linearLayout2 = this.f131804d;
        if (linearLayout2 != null) {
            ym5.a1.h(linearLayout2, new ax2.b(this));
        } else {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
    }

    public final float getTRAN_Y() {
        return ((java.lang.Number) this.TRAN_Y.getValue()).floatValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.widget.LinearLayout linearLayout = this.f131804d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        } else {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveCritBuffAnimView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131805e = "LiveCritBuffAnimView";
        this.TRAN_Y = jz5.h.b(ax2.a.f15029d);
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveCritBuffAnimView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131805e = "LiveCritBuffAnimView";
        this.TRAN_Y = jz5.h.b(ax2.a.f15029d);
        b();
    }
}
