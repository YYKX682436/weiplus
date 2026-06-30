package lh;

/* loaded from: classes12.dex */
public final class c implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.battery.accumulate.AccPowerStats f318589a;

    public c(com.tencent.matrix.battery.accumulate.AccPowerStats accPowerStats) {
        this.f318589a = accPowerStats;
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        java.util.Map asMutable;
        java.lang.String input = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(input, "input");
        com.tencent.matrix.battery.accumulate.AccPowerStats accPowerStats = this.f318589a;
        asMutable = accPowerStats.asMutable(accPowerStats.getAccProcStats());
        java.lang.Object obj2 = asMutable.get(input);
        if (obj2 == null) {
            obj2 = new com.tencent.matrix.battery.accumulate.AccProcessStats();
            asMutable.put(input, obj2);
        }
        return (com.tencent.matrix.battery.accumulate.AccProcessStats) obj2;
    }
}
