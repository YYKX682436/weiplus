package nn5;

/* loaded from: classes15.dex */
public final class b extends un5.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // un5.b, on5.b
    public android.animation.ValueAnimator.AnimatorUpdateListener a(int i17) {
        if (i17 == 0) {
            return null;
        }
        if ((i17 >= 0 || !this.f429497i.canScrollHorizontally(1)) && (i17 <= 0 || !this.f429497i.canScrollHorizontally(-1))) {
            return null;
        }
        this.f429494f = i17;
        return this;
    }

    @Override // un5.b
    public tn5.g e() {
        return new nn5.a();
    }

    @Override // un5.b, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        try {
            android.view.View view = this.f429497i;
            if (view instanceof android.widget.AbsListView) {
                kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.AbsListView");
                ((android.widget.AbsListView) view).scrollListBy(intValue - this.f429494f);
            } else {
                view.scrollBy(intValue - this.f429494f, 0);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.c("HRefreshCenterWrapper", "", e17);
        }
        this.f429494f = intValue;
    }
}
