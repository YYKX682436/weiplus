package z53;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f470256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yz5.p pVar) {
        super(2);
        this.f470256d = pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List result = (java.util.List) obj2;
        kotlin.jvm.internal.o.g(result, "result");
        this.f470256d.invoke(java.lang.Boolean.valueOf(booleanValue), result.get(0));
        return jz5.f0.f302826a;
    }
}
