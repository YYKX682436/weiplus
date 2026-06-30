package df2;

/* loaded from: classes3.dex */
public final class sj implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f231342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f231343e;

    public sj(df2.pk pkVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f231342d = pkVar;
        this.f231343e = z2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        if (com.tencent.mm.ui.w9.c(this.f231342d.O6()) || com.tencent.mm.ui.bk.g0() || com.tencent.mm.ui.bk.f0() || !fp.h.a(30)) {
            return;
        }
        android.view.View view = this.f231343e.f212058g;
        java.lang.Object animatedValue = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setPadding(0, 0, 0, ((java.lang.Integer) animatedValue).intValue());
    }
}
