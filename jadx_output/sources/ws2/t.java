package ws2;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.y f449140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f449141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ws2.y yVar, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(0);
        this.f449140d = yVar;
        this.f449141e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ws2.y yVar = this.f449140d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(yVar.f449092b);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f449141e;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.ayb, (android.view.ViewGroup) k0Var, false);
        k0Var.addView(inflate);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        at2.n1 n1Var = new at2.n1((android.view.ViewGroup) inflate, k0Var);
        yVar.f449167o = n1Var;
        return n1Var;
    }
}
