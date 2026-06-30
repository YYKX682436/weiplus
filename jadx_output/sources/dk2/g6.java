package dk2;

/* loaded from: classes3.dex */
public final class g6 extends kotlin.jvm.internal.q implements yz5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f233505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.xf f233506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f233507f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.t f233508g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(gk2.e eVar, dk2.xf xfVar, dk2.k6 k6Var, yz5.t tVar) {
        super(7);
        this.f233505d = eVar;
        this.f233506e = xfVar;
        this.f233507f = k6Var;
        this.f233508g = tVar;
    }

    @Override // yz5.u
    public java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.String verifyUrl = (java.lang.String) obj3;
        int intValue = ((java.lang.Number) obj4).intValue();
        int intValue2 = ((java.lang.Number) obj5).intValue();
        java.lang.String errMsg = (java.lang.String) obj6;
        r45.l01 resp = (r45.l01) obj7;
        kotlin.jvm.internal.o.g(verifyUrl, "verifyUrl");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g(resp, "resp");
        pm0.v.X(new dk2.f6(booleanValue, intValue2, booleanValue2, verifyUrl, this.f233505d, this.f233506e, this.f233507f, resp, this.f233508g, intValue, errMsg));
        return jz5.f0.f302826a;
    }
}
