package ym5;

/* loaded from: classes15.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.m0 f463560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f463561e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ym5.m0 m0Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(0);
        this.f463560d = m0Var;
        this.f463561e = recyclerView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f463561e;
        ym5.m0 m0Var = this.f463560d;
        if (m0Var == null) {
            kotlin.jvm.internal.o.g(recyclerView, "<this>");
            ym5.a1.f(new ym5.y0(null, recyclerView));
            java.lang.Object tag = recyclerView.getTag(com.tencent.mm.R.id.dkl);
            if (tag != null && (tag instanceof androidx.recyclerview.widget.w2)) {
                recyclerView.V0((androidx.recyclerview.widget.w2) tag);
            }
        } else {
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            boolean d17 = m0Var.d();
            java.lang.Object tag2 = recyclerView.getTag(com.tencent.mm.R.id.dkl);
            if (tag2 != null && (tag2 instanceof androidx.recyclerview.widget.w2)) {
                recyclerView.V0((androidx.recyclerview.widget.w2) tag2);
            }
            ym5.v0 v0Var = new ym5.v0(f0Var);
            recyclerView.i(v0Var);
            recyclerView.setTag(com.tencent.mm.R.id.dkl, v0Var);
            ym5.a1.f(new ym5.y0(new ym5.u0(m0Var, recyclerView, d17, f0Var), recyclerView));
        }
        return jz5.f0.f302826a;
    }
}
