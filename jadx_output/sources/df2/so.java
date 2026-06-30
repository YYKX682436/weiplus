package df2;

/* loaded from: classes3.dex */
public final class so extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.to f231352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so(df2.to toVar) {
        super(2);
        this.f231352d = toVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.h32 h32Var = (r45.h32) obj2;
        if (h32Var != null) {
            df2.to.a7(this.f231352d, booleanValue, h32Var);
        }
        return jz5.f0.f302826a;
    }
}
