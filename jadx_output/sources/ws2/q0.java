package ws2;

/* loaded from: classes3.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.s0 f449123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ws2.s0 s0Var) {
        super(1);
        this.f449123d = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ws2.s0 s0Var = this.f449123d;
        s0Var.getClass();
        pm0.v.X(new ws2.r0(it, "FinderProfileLiveUserPageLoader", s0Var));
        return jz5.f0.f302826a;
    }
}
