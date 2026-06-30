package rx2;

/* loaded from: classes10.dex */
public final class o extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx2.p f400981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f400982e;

    public o(rx2.p pVar, int i17) {
        this.f400981d = pVar;
        this.f400982e = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        rx2.p pVar = this.f400981d;
        android.view.ViewGroup.LayoutParams layoutParams = pVar.f400986g.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = (int) (this.f400982e * f17);
        pVar.f400986g.setLayoutParams(layoutParams2);
    }
}
