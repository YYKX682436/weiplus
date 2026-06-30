package lk5;

/* loaded from: classes14.dex */
public final class l0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f319042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASCommonFragment f319043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f319044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f319045g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f319046h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f319047i;

    public l0(int i17, com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment, int i18, kotlin.jvm.internal.f0 f0Var, long j17, android.animation.Animator animator) {
        this.f319042d = i17;
        this.f319043e = vASCommonFragment;
        this.f319044f = i18;
        this.f319045g = f0Var;
        this.f319046h = j17;
        this.f319047i = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        kotlin.jvm.internal.f0 f0Var = this.f319045g;
        int i17 = this.f319044f;
        float max = i17 > 0 ? java.lang.Math.max(1 - (f0Var.f310116d / i17), 0.0f) : 0.0f;
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f319043e;
        com.tencent.mars.xlog.Log.i(vASCommonFragment.getF211120o(), "onAnimationEnd() called with duration:" + this.f319046h + " expectFrames:" + i17 + " realFrames:" + f0Var.f310116d + " dropFrameRate:" + max + " animation = " + animation);
        int i18 = this.f319042d;
        if (i18 == com.tencent.mm.R.anim.f477919f7) {
            vASCommonFragment.onPageEnterAnimEnd();
        } else if (i18 == com.tencent.mm.R.anim.f477920f8) {
            vASCommonFragment.onPageExitAnimEnd();
        } else if (i18 == com.tencent.mm.R.anim.f_) {
            vASCommonFragment.onPagePopExitAnimEnd();
        } else if (i18 == com.tencent.mm.R.anim.f477921f9) {
            vASCommonFragment.onPagePopEnterAnimEnd();
        }
        ((android.animation.ValueAnimator) this.f319047i).removeListener(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f319043e;
        int i17 = this.f319042d;
        if (i17 == com.tencent.mm.R.anim.f477919f7) {
            vASCommonFragment.onPageEnterAnimBegin();
            com.tencent.mars.xlog.Log.i(vASCommonFragment.getF211120o(), "onAnimationStart() called");
        } else if (i17 == com.tencent.mm.R.anim.f477920f8) {
            vASCommonFragment.onPageExitAnimBegin();
        } else if (i17 == com.tencent.mm.R.anim.f477921f9) {
            vASCommonFragment.onPagePopEnterAnimBegin();
        } else if (i17 == com.tencent.mm.R.anim.f_) {
            vASCommonFragment.onPagePopExitAnimBegin();
        }
    }
}
