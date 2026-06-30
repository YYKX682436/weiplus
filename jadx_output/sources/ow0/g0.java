package ow0;

/* loaded from: classes5.dex */
public final class g0 implements fy0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f349310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f349311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView f349312c;

    public g0(gx0.u2 u2Var, ex0.a0 a0Var, com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView captionTimelineView) {
        this.f349310a = u2Var;
        this.f349311b = a0Var;
        this.f349312c = captionTimelineView;
    }

    @Override // fy0.b
    public void a(double d17, fy0.q source) {
        kotlin.jvm.internal.o.g(source, "source");
        int ordinal = source.ordinal();
        gx0.u2 u2Var = this.f349310a;
        if (ordinal == 1 || ordinal == 2) {
            kotlinx.coroutines.l.d(u2Var.getMainScope(), null, null, new ow0.e0(this.f349310a, d17, this.f349311b, this.f349312c, null), 3, null);
        } else if (ordinal == 3) {
            kotlinx.coroutines.l.d(u2Var.getMainScope(), null, null, new ow0.f0(d17, this.f349311b, this.f349312c, this.f349310a, null), 3, null);
        }
        kotlin.jvm.internal.o.g(u2Var, "<this>");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView o76 = u2Var.o7();
        if (o76 != null) {
            android.view.View view = o76.f69322f;
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = ((int) d17) + o76.f69330q;
            view.setLayoutParams(layoutParams2);
        }
        ow0.q0.h(u2Var);
    }
}
