package p05;

/* loaded from: classes14.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.l4 f350465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(p05.l4 l4Var) {
        super(2);
        this.f350465d = l4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        p05.l4 l4Var = this.f350465d;
        l4Var.f350604q[intValue] = intValue2;
        l4Var.D(intValue, intValue2);
        return jz5.f0.f302826a;
    }
}
