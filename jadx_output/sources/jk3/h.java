package jk3;

/* loaded from: classes8.dex */
public final class h extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f300083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jk3.v f300084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f300085f;

    public h(boolean z17, jk3.v vVar, android.graphics.Bitmap bitmap) {
        this.f300083d = z17;
        this.f300084e = vVar;
        this.f300085f = bitmap;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap P;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "hideFloatBallContainer onAnimationCancel");
        boolean z17 = this.f300083d;
        jk3.v vVar = this.f300084e;
        if (!z17) {
            if (vVar.E()) {
                ak3.c cVar = vVar.f300111d;
                if (cVar == null || (P = ((ak3.i) cVar).f5588m) == null) {
                    P = vVar.P(this.f300085f, vVar.f300124q);
                }
                bitmap = P;
            } else {
                bitmap = null;
            }
            jk3.v vVar2 = this.f300084e;
            vVar2.X(bitmap, true, true, true, vVar2.f300128u);
        }
        kk3.d dVar = vVar.f300117j;
        if (dVar != null) {
            kk3.d.f(dVar, 0, 1, null);
        }
        jk3.v.M(vVar);
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap P;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "hideFloatBallContainer onAnimationEnd");
        boolean z17 = this.f300083d;
        android.graphics.Bitmap bitmap2 = this.f300085f;
        jk3.v vVar = this.f300084e;
        if (!z17) {
            if (vVar.E()) {
                ak3.c cVar = vVar.f300111d;
                if (cVar == null || (P = ((ak3.i) cVar).f5588m) == null) {
                    P = vVar.P(bitmap2, vVar.f300124q);
                }
                bitmap = P;
            } else {
                bitmap = null;
            }
            jk3.v vVar2 = this.f300084e;
            vVar2.X(bitmap, true, true, true, vVar2.f300128u);
        }
        kk3.d dVar = vVar.f300117j;
        if (dVar != null) {
            kk3.d.a(dVar, bitmap2, 0, 2, null);
        }
        jk3.v.M(vVar);
    }
}
