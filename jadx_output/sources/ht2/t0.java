package ht2;

/* loaded from: classes2.dex */
public final class t0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f284907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f284908f;

    public t0(ht2.y0 y0Var, boolean z17, yz5.a aVar) {
        this.f284906d = y0Var;
        this.f284907e = z17;
        this.f284908f = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("Finder.DynamicIconResService", "tv onAnimationEnd");
        super.onAnimationEnd(animation, z17);
        ht2.y0 y0Var = this.f284906d;
        kotlinx.coroutines.r2 r2Var = y0Var.f284942f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        y0Var.f284942f = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new ht2.s0(this.f284907e, this.f284908f, null), 3, null);
    }
}
