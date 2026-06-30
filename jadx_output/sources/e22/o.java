package e22;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f246691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f246692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f246693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f246694g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z0.t tVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17, int i18) {
        super(2);
        this.f246691d = tVar;
        this.f246692e = finderObject;
        this.f246693f = i17;
        this.f246694g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f246693f | 1;
        e22.a1.h(this.f246691d, this.f246692e, (n0.o) obj, i17, this.f246694g);
        return jz5.f0.f302826a;
    }
}
