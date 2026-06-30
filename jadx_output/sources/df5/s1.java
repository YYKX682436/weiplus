package df5;

/* loaded from: classes15.dex */
public final class s1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.u1 f232205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f232207f;

    public s1(df5.u1 u1Var, int i17, int i18) {
        this.f232205d = u1Var;
        this.f232206e = i17;
        this.f232207f = i18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        df5.u1 u1Var = this.f232205d;
        if (u1Var.f232224e == animation) {
            u1Var.f232224e = null;
        }
        if (this.f232206e != u1Var.f232222c) {
            return;
        }
        int i17 = this.f232207f;
        u1Var.f232227h = i17;
        android.widget.TextView textView = u1Var.f232225f;
        if (textView != null) {
            java.lang.CharSequence text = textView.getText();
            android.text.Spannable spannable = text instanceof android.text.Spannable ? (android.text.Spannable) text : null;
            if (spannable != null) {
                int i18 = 0;
                while (i18 < 3) {
                    df5.q1 q1Var = u1Var.f232228i[i18];
                    q1Var.f232195d = i18 < i17 ? 255 : 0;
                    u1Var.a(spannable, q1Var);
                    i18++;
                }
            }
        }
        java.lang.Runnable runnable = u1Var.f232223d;
        android.os.Handler handler = u1Var.f232220a;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        df5.t1 t1Var = new df5.t1(u1Var, u1Var.f232222c);
        u1Var.f232223d = t1Var;
        handler.postDelayed(t1Var, 150L);
    }
}
