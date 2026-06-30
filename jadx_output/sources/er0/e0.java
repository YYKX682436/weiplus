package er0;

/* loaded from: classes12.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats) {
        super(0);
        this.f255957d = accProcLifeStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255957d;
        accProcLifeStats.setAccStartsCount(accProcLifeStats.getAccStartsCount() + 1);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        accProcLifeStats.setLastAppExpFgState(new jz5.l(bool, java.lang.Long.valueOf(currentTimeMillis)));
        accProcLifeStats.setLastNetworkState(new jz5.l(bool, java.lang.Long.valueOf(currentTimeMillis)));
        accProcLifeStats.setLastMarsState(new jz5.l(bool, java.lang.Long.valueOf(currentTimeMillis)));
        return jz5.f0.f302826a;
    }
}
