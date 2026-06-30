package uv0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f431338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(uv0.u uVar) {
        super(2);
        this.f431338d = uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        vv0.k filter = (vv0.k) obj2;
        kotlin.jvm.internal.o.g(filter, "filter");
        uv0.u.L(this.f431338d, intValue, filter);
        return jz5.f0.f302826a;
    }
}
