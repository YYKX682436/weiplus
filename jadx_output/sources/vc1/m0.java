package vc1;

/* loaded from: classes13.dex */
public class m0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.j2 f435008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435010f;

    public m0(vc1.p1 p1Var, vc1.j2 j2Var, java.lang.String str) {
        this.f435010f = p1Var;
        this.f435008d = j2Var;
        this.f435009e = str;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "MarkerTranslateAnimator onAnimationCancel");
        vc1.j2 j2Var = this.f435008d;
        if (j2Var != null) {
            j2Var.b();
        }
        synchronized (this.f435010f.f435092q) {
            this.f435010f.f435092q.remove(this.f435009e);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "MarkerTranslateAnimator onAnimationEnd");
        vc1.j2 j2Var = this.f435008d;
        if (j2Var != null) {
            j2Var.a(true);
        }
        synchronized (this.f435010f.f435092q) {
            this.f435010f.f435092q.remove(this.f435009e);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "MarkerTranslateAnimator onAnimationStart");
    }
}
