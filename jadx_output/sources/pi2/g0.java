package pi2;

/* loaded from: classes10.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi2.q0 f354778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(pi2.q0 q0Var) {
        super(2);
        this.f354778d = q0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String focusId = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(focusId, "focusId");
        this.f354778d.f0(booleanValue, focusId);
        return jz5.f0.f302826a;
    }
}
