package er0;

/* loaded from: classes12.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f255975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255976e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j17, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats) {
        super(0);
        this.f255975d = j17;
        this.f255976e = accProcLifeStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List asMutable;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f255975d;
        long j18 = currentTimeMillis - j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccProcLifeStats", "#collectHibernateTime: " + j17);
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255976e;
        asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccHibernateList());
        asMutable.add(new jz5.l(java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis)));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mars recover: last=");
        sb6.append(j18);
        sb6.append(", curr=");
        sb6.append(currentTimeMillis);
        sb6.append(", gapMin=");
        long j19 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        sb6.append(j17 / j19);
        sb6.append(", totalGapMin=");
        long j27 = 0;
        for (jz5.l lVar : accProcLifeStats.getAccHibernateList()) {
            j27 += (((java.lang.Number) lVar.f302834e).longValue() - ((java.lang.Number) lVar.f302833d).longValue()) / j19;
        }
        sb6.append(j27);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccProcLifeStats", sb6.toString());
        return jz5.f0.f302826a;
    }
}
