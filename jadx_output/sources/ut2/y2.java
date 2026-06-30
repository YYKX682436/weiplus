package ut2;

/* loaded from: classes3.dex */
public final class y2 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f431160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f431161b;

    public y2(cm2.m0 m0Var, ut2.s3 s3Var) {
        this.f431160a = m0Var;
        this.f431161b = s3Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report cart exposed, productId = ");
            cm2.m0 m0Var = this.f431160a;
            sb6.append(m0Var.f43369w);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingViewHolder", sb6.toString());
            ut2.s3.o(this.f431161b, m0Var);
        }
    }
}
