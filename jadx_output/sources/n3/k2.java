package n3;

/* loaded from: classes14.dex */
public class k2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n3.s2 f334353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n3.g3 f334354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n3.g3 f334355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f334356g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f334357h;

    public k2(n3.n2 n2Var, n3.s2 s2Var, n3.g3 g3Var, n3.g3 g3Var2, int i17, android.view.View view) {
        this.f334353d = s2Var;
        this.f334354e = g3Var;
        this.f334355f = g3Var2;
        this.f334356g = i17;
        this.f334357h = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float f17;
        n3.s2 s2Var;
        n3.g3 g3Var;
        n3.k2 k2Var = this;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        n3.s2 s2Var2 = k2Var.f334353d;
        s2Var2.f334406a.d(animatedFraction);
        float b17 = s2Var2.f334406a.b();
        android.view.animation.Interpolator interpolator = n3.o2.f334379e;
        int i17 = android.os.Build.VERSION.SDK_INT;
        n3.g3 g3Var2 = k2Var.f334354e;
        n3.x2 w2Var = i17 >= 30 ? new n3.w2(g3Var2) : i17 >= 29 ? new n3.v2(g3Var2) : new n3.u2(g3Var2);
        int i18 = 1;
        while (i18 <= 256) {
            if ((k2Var.f334356g & i18) == 0) {
                w2Var.c(i18, g3Var2.a(i18));
                f17 = b17;
                s2Var = s2Var2;
                g3Var = g3Var2;
            } else {
                e3.d a17 = g3Var2.a(i18);
                e3.d a18 = k2Var.f334355f.a(i18);
                int i19 = a17.f247044a;
                float f18 = 1.0f - b17;
                int i27 = (int) (((i19 - a18.f247044a) * f18) + 0.5d);
                int i28 = a18.f247045b;
                int i29 = a17.f247045b;
                f17 = b17;
                int i37 = (int) (((i29 - i28) * f18) + 0.5d);
                int i38 = a18.f247046c;
                int i39 = a17.f247046c;
                s2Var = s2Var2;
                int i47 = (int) (((i39 - i38) * f18) + 0.5d);
                int i48 = a18.f247047d;
                int i49 = a17.f247047d;
                float f19 = (i49 - i48) * f18;
                g3Var = g3Var2;
                int i57 = (int) (f19 + 0.5d);
                int max = java.lang.Math.max(0, i19 - i27);
                int max2 = java.lang.Math.max(0, i29 - i37);
                int max3 = java.lang.Math.max(0, i39 - i47);
                int max4 = java.lang.Math.max(0, i49 - i57);
                w2Var.c(i18, (max == i27 && max2 == i37 && max3 == i47 && max4 == i57) ? a17 : e3.d.b(max, max2, max3, max4));
            }
            i18 <<= 1;
            k2Var = this;
            b17 = f17;
            g3Var2 = g3Var;
            s2Var2 = s2Var;
        }
        n3.o2.g(this.f334357h, w2Var.b(), java.util.Collections.singletonList(s2Var2));
    }
}
