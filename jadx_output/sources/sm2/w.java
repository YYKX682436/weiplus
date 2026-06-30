package sm2;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(sm2.o4 o4Var) {
        super(7);
        this.f409761d = o4Var;
    }

    @Override // yz5.u
    public java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        yg2.b activityScope;
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
        sm2.o4 o4Var = this.f409761d;
        kotlinx.coroutines.r2 r2Var = ((mm2.c1) o4Var.f19609a.a(mm2.c1.class)).F5;
        kotlinx.coroutines.r2 r2Var2 = null;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        mm2.c1 c1Var = (mm2.c1) o4Var.f19609a.a(mm2.c1.class);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (activityScope = k0Var.getActivityScope()) != null) {
            r2Var2 = kotlinx.coroutines.l.d(activityScope, null, null, new sm2.v(this.f409761d, booleanValue, intValue2, resp, booleanValue2, verifyUrl, intValue, errMsg, null), 3, null);
        }
        c1Var.F5 = r2Var2;
        return jz5.f0.f302826a;
    }
}
