package ht2;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.r6 f284839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f284841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284842g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284843h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(zy2.r6 r6Var, ht2.y0 y0Var, yz5.l lVar, android.view.View view, android.view.View view2) {
        super(2);
        this.f284839d = r6Var;
        this.f284840e = y0Var;
        this.f284841f = lVar;
        this.f284842g = view;
        this.f284843h = view2;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yz5.l lVar;
        android.widget.TextView textView = (android.widget.TextView) obj;
        com.tencent.mm.view.MMPAGView floatPagView = (com.tencent.mm.view.MMPAGView) obj2;
        kotlin.jvm.internal.o.g(floatPagView, "floatPagView");
        if (textView != null) {
            textView.setAlpha(0.0f);
        }
        zy2.r6 r6Var = this.f284839d;
        r6Var.getClass();
        ht2.y0 y0Var = this.f284840e;
        y0Var.tj(floatPagView, r6Var);
        uw2.h0 h0Var = uw2.h0.f431674a;
        java.lang.CharSequence charSequence = r6Var.f477561l;
        android.animation.Animator m17 = uw2.h0.m(h0Var, floatPagView, charSequence == null || r26.n0.N(charSequence) ? r6Var.f477559j : null, 0.0f, 300L, 4, null);
        m17.addListener(new ht2.g0(floatPagView));
        java.lang.CharSequence charSequence2 = r6Var.f477561l;
        android.animation.Animator l17 = uw2.h0.l(h0Var, floatPagView, false, charSequence2 == null || r26.n0.N(charSequence2) ? 400L : 1200L, 300L, 2, null);
        yz5.l lVar2 = ht2.h0.f284835d;
        java.lang.CharSequence charSequence3 = r6Var.f477561l;
        if (charSequence3 == null || r26.n0.N(charSequence3)) {
            lVar = new ht2.z(floatPagView);
        } else {
            ht2.b0 b0Var = new ht2.b0(textView, floatPagView);
            yz5.l c0Var = new ht2.c0(textView);
            l17.addListener(new ht2.d0(textView));
            lVar = b0Var;
            lVar2 = c0Var;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.addListener(new ht2.e0(lVar, lVar, lVar2));
        animatorSet.playSequentially(m17, l17);
        animatorSet.addListener(new ht2.f0(y0Var, this.f284842g, this.f284843h));
        this.f284841f.invoke(animatorSet);
        return jz5.f0.f302826a;
    }
}
