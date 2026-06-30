package df5;

/* loaded from: classes15.dex */
public final class r1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f232198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df5.u1 f232199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f232200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f232201g;

    public r1(int i17, df5.u1 u1Var, int i18, int i19) {
        this.f232198d = i17;
        this.f232199e = u1Var;
        this.f232200f = i18;
        this.f232201g = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        df5.u1 u1Var = this.f232199e;
        if (this.f232198d != u1Var.f232222c) {
            anim.cancel();
            return;
        }
        java.lang.Object animatedValue = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.widget.TextView textView = u1Var.f232225f;
        if (textView == null) {
            return;
        }
        java.lang.CharSequence text = textView.getText();
        android.text.Spannable spannable = text instanceof android.text.Spannable ? (android.text.Spannable) text : null;
        if (spannable == null) {
            return;
        }
        int i17 = this.f232200f;
        int i18 = this.f232201g;
        df5.q1[] q1VarArr = u1Var.f232228i;
        if (i18 <= i17) {
            int f17 = e06.p.f((int) ((1.0f - floatValue) * 255), 0, 255);
            for (int i19 = 0; i19 < 3; i19++) {
                df5.q1 q1Var = q1VarArr[i19];
                q1Var.f232195d = f17;
                u1Var.a(spannable, q1Var);
            }
            return;
        }
        int f18 = e06.p.f((int) (floatValue * 255), 0, 255);
        int i27 = 0;
        while (i27 < 3) {
            df5.q1 q1Var2 = q1VarArr[i27];
            q1Var2.f232195d = i27 < i17 ? 255 : i27 == i17 ? f18 : 0;
            u1Var.a(spannable, q1Var2);
            i27++;
        }
    }
}
