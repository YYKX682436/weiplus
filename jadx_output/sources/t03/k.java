package t03;

/* loaded from: classes11.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f414461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t03.k0 k0Var) {
        super(2);
        this.f414461d = k0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        yz5.p pVar = this.f414461d.A;
        if (pVar != null) {
            ((t03.e0) pVar).invoke(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
        }
        return jz5.f0.f302826a;
    }
}
