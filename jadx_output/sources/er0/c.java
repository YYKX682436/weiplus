package er0;

/* loaded from: classes12.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j4 f255948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r45.j4 j4Var, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats) {
        super(0);
        this.f255948d = j4Var;
        this.f255949e = accProcLifeStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map asMutable;
        java.util.List asMutable2;
        r45.j4 j4Var = this.f255948d;
        java.lang.String str = j4Var.f377558e.f372756d;
        kotlin.jvm.internal.o.f(str, "toString(...)");
        if (!android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255949e;
            asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccMainProcStandByAddNsgGroup());
            java.lang.Object obj = asMutable.get(str);
            if (obj == null) {
                obj = new java.util.ArrayList();
                asMutable.put(str, obj);
            }
            asMutable2 = accProcLifeStats.asMutable((java.util.List) obj);
            asMutable2.add(java.lang.Long.valueOf(j4Var.f377568r));
        }
        return jz5.f0.f302826a;
    }
}
