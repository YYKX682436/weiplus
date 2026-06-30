package im2;

/* loaded from: classes3.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(im2.z3 z3Var) {
        super(2);
        this.f292615d = z3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj2).intValue();
        im2.z3 z3Var = this.f292615d;
        pf5.e.launchUI$default(z3Var, null, null, new im2.x0(z3Var, intValue, (java.lang.String) obj, null), 3, null);
        return jz5.f0.f302826a;
    }
}
