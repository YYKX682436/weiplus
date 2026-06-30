package er0;

/* loaded from: classes12.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f256003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f256004e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.util.Map map, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats) {
        super(0);
        this.f256003d = map;
        this.f256004e = accProcLifeStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map asMutable;
        for (java.util.Map.Entry entry : this.f256003d.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            int intValue = ((java.lang.Number) entry.getValue()).intValue();
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f256004e;
            asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccNetRunningGroup());
            java.lang.Integer num = accProcLifeStats.getAccNetRunningGroup().get(str);
            if (num == null) {
                num = 0;
            }
            asMutable.put(str, java.lang.Integer.valueOf(num.intValue() + intValue));
        }
        return jz5.f0.f302826a;
    }
}
