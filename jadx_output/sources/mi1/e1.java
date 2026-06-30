package mi1;

/* loaded from: classes7.dex */
public final class e1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.q1 f326543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f326544e;

    public e1(mi1.q1 q1Var, kotlinx.coroutines.q qVar) {
        this.f326543d = q1Var;
        this.f326544e = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f326543d.f326665f.f326567a = 2;
        kotlinx.coroutines.q qVar = this.f326544e;
        if (((kotlinx.coroutines.r) qVar).n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
    }
}
