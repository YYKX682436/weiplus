package rc5;

/* loaded from: classes5.dex */
public final /* synthetic */ class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f394195d;

    public w(yz5.l function) {
        kotlin.jvm.internal.o.g(function, "function");
        this.f394195d = function;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final /* synthetic */ void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f394195d.invoke(valueAnimator);
    }
}
