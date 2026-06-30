package er0;

/* loaded from: classes12.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f255945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f255946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255947f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(long j17, long j18, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats) {
        super(0);
        this.f255945d = j17;
        this.f255946e = j18;
        this.f255947f = accProcLifeStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List asMutable;
        long j17 = this.f255945d;
        if (0 <= j17 && j17 < 3600001) {
            long j18 = this.f255946e;
            if (0 <= j18 && j18 < 3600001) {
                com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255947f;
                asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccVoipInviteCostList());
                asMutable.add(new jz5.l(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18)));
            }
        }
        return jz5.f0.f302826a;
    }
}
