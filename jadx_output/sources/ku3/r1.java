package ku3;

/* loaded from: classes3.dex */
public final class r1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.z1 f312376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f312377e;

    public r1(ku3.z1 z1Var, int i17) {
        this.f312376d = z1Var;
        this.f312377e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation, z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doFrameShaderAni finish >> ");
        ku3.z1 z1Var = this.f312376d;
        sb6.append(z1Var.c().getY());
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordFrameShaderPlugin", sb6.toString());
        jz5.g gVar = z1Var.f312497h;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) value).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = this.f312377e;
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.view.View) value2).setLayoutParams(layoutParams2);
    }
}
