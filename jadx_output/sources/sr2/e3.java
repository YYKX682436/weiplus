package sr2;

/* loaded from: classes10.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411546d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        super(0);
        this.f411546d = postMainUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411546d;
        if (((dv2.m0) ((jz5.n) postMainUIC.Q).getValue()).f243897m) {
            com.tencent.mm.plugin.finder.post.PostMainUIC.O6(postMainUIC);
        } else {
            aw2.m0 m0Var = postMainUIC.f122528t;
            if (m0Var == null) {
                kotlin.jvm.internal.o.o("postOriginWidget");
                throw null;
            }
            m0Var.f14773e.b(new sr2.o3(postMainUIC));
        }
        return jz5.f0.f302826a;
    }
}
