package el2;

/* loaded from: classes3.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.n1 f253841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(el2.n1 n1Var) {
        super(2);
        this.f253841d = n1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.y42 y42Var = (r45.y42) obj;
        r45.y42 y42Var2 = (r45.y42) obj2;
        this.f253841d.getClass();
        boolean z17 = true;
        if (y42Var == null || y42Var2 == null ? y42Var != null || y42Var2 != null : y42Var.getLong(0) != y42Var2.getLong(0) || y42Var.getInteger(1) != y42Var2.getInteger(1)) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
