package ls4;

/* loaded from: classes8.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls4.u f321093d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ls4.u uVar) {
        super(0);
        this.f321093d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ls4.u uVar = this.f321093d;
        js4.r.f301565a = uVar.f321100a.f358020a;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        js4.r.f301567c = uuid;
        int ordinal = uVar.f321100a.f358025f.ordinal();
        if (ordinal == 0) {
            ls4.u.b(uVar);
        } else if (ordinal == 1) {
            ls4.u.c(uVar);
        } else if (ordinal == 2) {
            com.tencent.mars.xlog.Log.i("WeCoinConsumeLogic", "directIfEnoughCoin");
            uVar.g();
            new ks4.e().l().h(new ls4.g(uVar));
        }
        return jz5.f0.f302826a;
    }
}
