package tt2;

/* loaded from: classes3.dex */
public final class o extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f421972b;

    public o(tt2.e1 e1Var, ut2.s3 s3Var) {
        this.f421971a = e1Var;
        this.f421972b = s3Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            ut2.s3 s3Var = this.f421972b;
            tt2.e1.J(this.f421971a, s3Var.getAdapterPosition(), s3Var, ml2.f4.f327436l1);
        }
    }
}
