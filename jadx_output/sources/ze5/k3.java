package ze5;

/* loaded from: classes5.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.q3 f472044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472045e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(ze5.q3 q3Var, com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f472044d = q3Var;
        this.f472045e = f9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.y2 holder = (ze5.y2) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f472044d.Z(holder, this.f472045e.P0() < 2, true);
        return jz5.f0.f302826a;
    }
}
