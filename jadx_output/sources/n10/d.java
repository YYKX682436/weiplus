package n10;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n10.e f334037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n10.e eVar) {
        super(3);
        this.f334037d = eVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        java.util.Map map = (java.util.HashMap) obj3;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        rk0.c.c("MBJsApiGetBizPreloadData", "getBizPreloadData: " + intValue + ", " + errMsg + ", " + map, new java.lang.Object[0]);
        n10.e eVar = this.f334037d;
        if (intValue == 0) {
            yz5.l s17 = eVar.s();
            if (map == null) {
                map = kz5.q0.f314001d;
            }
            lc3.a0 a0Var = new lc3.a0(map);
            eVar.m(a0Var);
            s17.invoke(a0Var);
        } else {
            eVar.s().invoke(eVar.h(intValue, errMsg));
        }
        return jz5.f0.f302826a;
    }
}
