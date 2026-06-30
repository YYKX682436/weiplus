package y50;

/* loaded from: classes3.dex */
public final class i implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y50.e f459453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f459454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f459455f;

    public i(y50.e eVar, com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        this.f459453d = eVar;
        this.f459454e = mMActivity;
        this.f459455f = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f459453d.f459446b.invoke(this.f459454e, java.lang.Integer.valueOf(this.f459455f));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
