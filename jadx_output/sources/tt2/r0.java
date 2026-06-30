package tt2;

/* loaded from: classes3.dex */
public final class r0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f421988b;

    public r0(tt2.e1 e1Var, ut2.s3 s3Var) {
        this.f421987a = e1Var;
        this.f421988b = s3Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
            tt2.e1.J(this.f421987a, ((java.lang.Integer) tag).intValue(), this.f421988b, ml2.f4.f327438n);
        }
    }
}
