package u4;

/* loaded from: classes13.dex */
public class q extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f424531d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Matrix f424532e = new android.graphics.Matrix();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f424533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f424534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f424535h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u4.t f424536i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u4.s f424537m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.transition.ChangeTransform f424538n;

    public q(androidx.transition.ChangeTransform changeTransform, boolean z17, android.graphics.Matrix matrix, android.view.View view, u4.t tVar, u4.s sVar) {
        this.f424538n = changeTransform;
        this.f424533f = z17;
        this.f424534g = matrix;
        this.f424535h = view;
        this.f424536i = tVar;
        this.f424537m = sVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f424531d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        boolean z17 = this.f424531d;
        u4.t tVar = this.f424536i;
        android.view.View view = this.f424535h;
        if (!z17) {
            if (this.f424533f && this.f424538n.L) {
                android.graphics.Matrix matrix = this.f424532e;
                matrix.set(this.f424534g);
                view.setTag(com.tencent.mm.R.id.oj9, matrix);
                tVar.getClass();
                java.lang.String[] strArr = androidx.transition.ChangeTransform.P;
                view.setTranslationX(tVar.f424547a);
                view.setTranslationY(tVar.f424548b);
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.a1.w(view, tVar.f424549c);
                view.setScaleX(tVar.f424550d);
                view.setScaleY(tVar.f424551e);
                view.setRotationX(tVar.f424552f);
                view.setRotationY(tVar.f424553g);
                view.setRotation(tVar.f424554h);
            } else {
                view.setTag(com.tencent.mm.R.id.oj9, null);
                view.setTag(com.tencent.mm.R.id.f486262kp3, null);
            }
        }
        u4.w1.a(view, null);
        tVar.getClass();
        java.lang.String[] strArr2 = androidx.transition.ChangeTransform.P;
        view.setTranslationX(tVar.f424547a);
        view.setTranslationY(tVar.f424548b);
        java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
        n3.a1.w(view, tVar.f424549c);
        view.setScaleX(tVar.f424550d);
        view.setScaleY(tVar.f424551e);
        view.setRotationX(tVar.f424552f);
        view.setRotationY(tVar.f424553g);
        view.setRotation(tVar.f424554h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animator) {
        android.graphics.Matrix matrix = this.f424537m.f424542a;
        android.graphics.Matrix matrix2 = this.f424532e;
        matrix2.set(matrix);
        android.view.View view = this.f424535h;
        view.setTag(com.tencent.mm.R.id.oj9, matrix2);
        u4.t tVar = this.f424536i;
        tVar.getClass();
        java.lang.String[] strArr = androidx.transition.ChangeTransform.P;
        view.setTranslationX(tVar.f424547a);
        view.setTranslationY(tVar.f424548b);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.w(view, tVar.f424549c);
        view.setScaleX(tVar.f424550d);
        view.setScaleY(tVar.f424551e);
        view.setRotationX(tVar.f424552f);
        view.setRotationY(tVar.f424553g);
        view.setRotation(tVar.f424554h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(android.animation.Animator animator) {
        java.lang.String[] strArr = androidx.transition.ChangeTransform.P;
        android.view.View view = this.f424535h;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.w(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
