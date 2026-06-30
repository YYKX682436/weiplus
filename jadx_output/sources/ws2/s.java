package ws2;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.y f449131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f449132e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ws2.y yVar, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(0);
        this.f449131d = yVar;
        this.f449132e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f449132e;
        android.view.View findViewById = k0Var.findViewById(com.tencent.mm.R.id.lyc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        at2.u0 u0Var = new at2.u0((android.view.ViewGroup) findViewById, k0Var);
        this.f449131d.getClass();
        return u0Var;
    }
}
