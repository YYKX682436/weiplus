package el2;

/* loaded from: classes3.dex */
public final class k2 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ el2.r2 f253842a;

    public k2(el2.r2 r2Var) {
        this.f253842a = r2Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            el2.r2 r2Var = this.f253842a;
            r2Var.f253899d.postDelayed(new el2.j2(r2Var), 3000L);
        }
    }
}
