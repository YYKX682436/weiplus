package hf2;

/* loaded from: classes3.dex */
public final class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.x f281024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f281025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f281026f;

    public c(hf2.x xVar, float f17, float f18) {
        this.f281024d = xVar;
        this.f281025e = f17;
        this.f281026f = f18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i(this.f281024d.f281181m, "modifyPluginAlpha fromAlpha:" + this.f281025e + " toAlpha:" + this.f281026f + " onAnimationEnd");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i(this.f281024d.f281181m, "modifyPluginAlpha fromAlpha:" + this.f281025e + " toAlpha:" + this.f281026f + " onAnimationStart");
    }
}
