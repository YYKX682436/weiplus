package er0;

/* loaded from: classes12.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f256001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f256002e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats, int i17) {
        super(0);
        this.f256001d = accProcLifeStats;
        this.f256002e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map asMutable;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f256001d;
        accProcLifeStats.setAccDeadCount(accProcLifeStats.getAccDeadCount() + 1);
        int i17 = this.f256002e;
        if (i17 == 1) {
            accProcLifeStats.setAccContinuousRecycleCount(accProcLifeStats.getAccContinuousRecycleCount() + 1);
        }
        asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccRecycleGroup());
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Long l17 = accProcLifeStats.getAccRecycleGroup().get(java.lang.Integer.valueOf(i17));
        if (l17 == null) {
            l17 = 0L;
        }
        asMutable.put(valueOf, java.lang.Long.valueOf(l17.longValue() + 1));
        return jz5.f0.f302826a;
    }
}
