package sr2;

/* loaded from: classes10.dex */
public final class q extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.r f411676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411677e;

    public q(sr2.r rVar, int i17) {
        this.f411676d = rVar;
        this.f411677e = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        sr2.r rVar = this.f411676d;
        android.view.View view = rVar.f411689a;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        int i17 = this.f411677e;
        layoutParams2.bottomMargin = (int) (i17 > 0 ? i17 * f17 : java.lang.Math.abs(i17) * (1 - f17));
        rVar.f411689a.setLayoutParams(layoutParams2);
    }
}
