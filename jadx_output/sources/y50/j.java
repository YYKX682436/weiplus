package y50;

/* loaded from: classes3.dex */
public final class j implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f459456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y50.e f459457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f459458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f459459g;

    public j(java.lang.Integer num, y50.e eVar, com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        this.f459456d = num;
        this.f459457e = eVar;
        this.f459458f = mMActivity;
        this.f459459g = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.Integer num = this.f459456d;
        y50.e eVar = this.f459457e;
        if (num == null) {
            eVar.f459447c = null;
        }
        eVar.f459446b.invoke(this.f459458f, java.lang.Integer.valueOf(this.f459459g));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
