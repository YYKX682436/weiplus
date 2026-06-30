package zx2;

/* loaded from: classes14.dex */
public class s extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f477069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx2.t f477070e;

    public s(zx2.t tVar, int i17) {
        this.f477070e = tVar;
        this.f477069d = i17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        int i17 = this.f477069d;
        zx2.t tVar = this.f477070e;
        tVar.f477074g = i17;
        tVar.f477075h = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator, boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.CustomTabLayout", "onAnimationStart : " + z17);
    }
}
