package ua5;

/* loaded from: classes10.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ua5.a f425979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f425980e;

    public b(ua5.a aVar, android.widget.TextView textView) {
        this.f425979d = aVar;
        this.f425980e = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        int floatValue = (int) (((java.lang.Float) animatedValue).floatValue() * 255);
        ua5.a aVar = this.f425979d;
        aVar.f425978d = floatValue;
        java.lang.CharSequence text = this.f425980e.getText();
        android.text.Spannable spannable = text instanceof android.text.Spannable ? (android.text.Spannable) text : null;
        if (spannable == null) {
            return;
        }
        int spanStart = spannable.getSpanStart(aVar);
        int spanEnd = spannable.getSpanEnd(aVar);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        int spanFlags = spannable.getSpanFlags(aVar);
        spannable.removeSpan(aVar);
        spannable.setSpan(aVar, spanStart, spanEnd, spanFlags);
    }
}
