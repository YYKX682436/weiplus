package ec3;

/* loaded from: classes9.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f251007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(ec3.g1 g1Var, yz5.a aVar) {
        super(0);
        this.f251006d = g1Var;
        this.f251007e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ec3.g1 g1Var = this.f251006d;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = g1Var.f251012f;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("mSkinAdapter");
            throw null;
        }
        wxRecyclerAdapter.notifyDataSetChanged();
        com.tencent.mm.view.recyclerview.WxRecyclerView X6 = g1Var.X6();
        if (X6 != null) {
            X6.postDelayed(new ec3.e1(g1Var, this.f251007e), 70L);
        }
        return jz5.f0.f302826a;
    }
}
