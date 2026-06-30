package ze5;

/* loaded from: classes9.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.y1 f472198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(ze5.y1 y1Var, com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f472198d = y1Var;
        this.f472199e = f9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.g1 holder = (ze5.g1) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f472198d.Z(holder, this.f472199e.P0() < 2, true);
        return jz5.f0.f302826a;
    }
}
