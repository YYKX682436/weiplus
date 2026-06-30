package ht2;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.r6 f284914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f284916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284917g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284918h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(zy2.r6 r6Var, ht2.y0 y0Var, yz5.l lVar, android.view.View view, android.view.View view2) {
        super(2);
        this.f284914d = r6Var;
        this.f284915e = y0Var;
        this.f284916f = lVar;
        this.f284917g = view;
        this.f284918h = view2;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ht2.y0 y0Var;
        int i17;
        android.animation.Animator animator;
        android.animation.AnimatorSet animatorSet;
        android.widget.TextView textView = (android.widget.TextView) obj;
        com.tencent.mm.ui.widget.imageview.WeImageView floatIv = (com.tencent.mm.ui.widget.imageview.WeImageView) obj2;
        kotlin.jvm.internal.o.g(floatIv, "floatIv");
        if (textView != null) {
            textView.setAlpha(0.0f);
        }
        zy2.r6 r6Var = this.f284914d;
        r6Var.getClass();
        ht2.y0 y0Var2 = this.f284915e;
        y0Var2.Di(floatIv, r6Var);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127654d6).getValue()).r()).booleanValue();
        java.lang.CharSequence charSequence = r6Var.f477561l;
        boolean z17 = charSequence == null || r26.n0.N(charSequence);
        uw2.h0 h0Var = uw2.h0.f431674a;
        if (!z17) {
            y0Var = y0Var2;
            android.animation.Animator j17 = booleanValue ? uw2.h0.j(h0Var, floatIv, 1.4f, null, 0.0f, 300L, 8, null) : uw2.h0.j(h0Var, floatIv, 1.4f, null, 0.0f, 0L, 24, null);
            if (booleanValue) {
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new uw2.s(floatIv));
                ofFloat.setStartDelay(1200L);
                ofFloat.setDuration(300L);
                ofFloat.addListener(new uw2.r(floatIv, false, false, floatIv));
                i17 = 2;
                animator = ofFloat;
            } else {
                i17 = 2;
                animator = uw2.h0.l(h0Var, floatIv, false, 0L, 0L, 12, null);
            }
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            ht2.u uVar = new ht2.u(textView, floatIv);
            animatorSet2.addListener(new ht2.q(uVar, uVar, textView));
            animator.addListener(new ht2.r(textView));
            android.animation.Animator[] animatorArr = new android.animation.Animator[i17];
            animatorArr[0] = j17;
            animatorArr[1] = animator;
            animatorSet2.playSequentially(animatorArr);
            animatorSet = animatorSet2;
        } else if (booleanValue) {
            y0Var = y0Var2;
            animatorSet = uw2.h0.f(h0Var, floatIv, 1.4f, r6Var.f477559j, true, 0.0f, 300L, 400L, 300L, 16, null);
        } else {
            y0Var = y0Var2;
            animatorSet = uw2.h0.f(h0Var, floatIv, 1.4f, r6Var.f477559j, true, 0.0f, 0L, 0L, 0L, 240, null);
        }
        animatorSet.addListener(new ht2.s(y0Var, this.f284917g, this.f284918h));
        this.f284916f.invoke(animatorSet);
        return jz5.f0.f302826a;
    }
}
