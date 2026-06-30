package jo4;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f300901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yz5.p pVar) {
        super(3);
        this.f300901d = pVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g((java.util.ArrayList) obj3, "<anonymous parameter 2>");
        this.f300901d.invoke(java.lang.Boolean.valueOf(booleanValue), java.lang.Integer.valueOf(intValue));
        return jz5.f0.f302826a;
    }
}
