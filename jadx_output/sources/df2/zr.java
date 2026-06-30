package df2;

/* loaded from: classes3.dex */
public final class zr implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f231988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f231989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f231990f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231991g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f231992h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f231993i;

    public zr(android.view.ViewGroup viewGroup, int[] iArr, int[] iArr2, df2.lt ltVar, int i17, int i18) {
        this.f231988d = viewGroup;
        this.f231989e = iArr;
        this.f231990f = iArr2;
        this.f231991g = ltVar;
        this.f231992h = i17;
        this.f231993i = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        int[] iArr;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.view.ViewGroup viewGroup = this.f231988d;
        if (viewGroup != null) {
            android.view.ViewGroup viewGroup2 = this.f231991g.f230704J;
            if (this.f231989e != null && (iArr = this.f231990f) != null && viewGroup2 != null) {
                float f17 = 1 - floatValue;
                viewGroup.setTranslationX((((r2[0] + (viewGroup2.getWidth() / 2)) - iArr[0]) - (this.f231992h / 2)) * f17);
                viewGroup.setTranslationY(-(f17 * (((iArr[1] + (this.f231993i / 2)) - r2[1]) - (viewGroup2.getHeight() / 2))));
            }
            viewGroup.setScaleX(floatValue);
            viewGroup.setScaleY(floatValue);
            viewGroup.setAlpha(floatValue);
            viewGroup.requestLayout();
        }
    }
}
