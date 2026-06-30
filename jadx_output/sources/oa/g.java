package oa;

/* loaded from: classes15.dex */
public class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f343767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oa.h f343768e;

    public g(oa.h hVar, int i17) {
        this.f343768e = hVar;
        this.f343767d = i17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        int i17 = this.f343767d;
        oa.h hVar = this.f343768e;
        hVar.f343772g = i17;
        hVar.f343773h = 0.0f;
    }
}
