package er0;

/* loaded from: classes12.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f255999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f256000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(long j17, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats) {
        super(0);
        this.f255999d = j17;
        this.f256000e = accProcLifeStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List asMutable;
        long j17 = this.f255999d;
        if (j17 > 0) {
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f256000e;
            asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccRecycleCostList());
            asMutable.add(java.lang.Long.valueOf(j17));
        }
        return jz5.f0.f302826a;
    }
}
