package sf4;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f407622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yz5.p pVar) {
        super(2);
        this.f407622d = pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        this.f407622d.invoke(java.lang.Integer.valueOf(intValue), java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
