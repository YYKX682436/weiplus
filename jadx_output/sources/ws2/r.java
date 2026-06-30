package ws2;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.y f449125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f449126e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ws2.y yVar, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(0);
        this.f449125d = yVar;
        this.f449126e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f449126e;
        android.view.View genRootViewByStub = k0Var.genRootViewByStub(com.tencent.mm.R.id.ly_, k0Var);
        kotlin.jvm.internal.o.e(genRootViewByStub, "null cannot be cast to non-null type android.view.ViewGroup");
        at2.i iVar = new at2.i((android.view.ViewGroup) genRootViewByStub, k0Var);
        this.f449125d.f449166n = iVar;
        return iVar;
    }
}
