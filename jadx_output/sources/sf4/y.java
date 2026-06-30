package sf4;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f407616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(yz5.q qVar) {
        super(3);
        this.f407616d = qVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        this.f407616d.invoke(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
