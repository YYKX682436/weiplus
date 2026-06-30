package d04;

/* loaded from: classes8.dex */
public final class c implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f225385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView f225386e;

    public c(yz5.a aVar, com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView baseScrollTabView) {
        this.f225385d = aVar;
        this.f225386e = baseScrollTabView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f225385d.invoke();
        com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView baseScrollTabView = this.f225386e;
        baseScrollTabView.f159672m = -1;
        baseScrollTabView.f159673n = false;
        android.widget.LinearLayout linearLayout = baseScrollTabView.f159666d;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        linearLayout.getTranslationX();
        if (baseScrollTabView.f159679t != 1) {
            baseScrollTabView.f159679t = 1;
            d04.i3 i3Var = baseScrollTabView.f159678s;
            if (i3Var != null) {
                i3Var.a(1);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
