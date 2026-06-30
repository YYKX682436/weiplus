package er0;

/* loaded from: classes12.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f255962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f255963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f255964h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats, java.lang.String str, long j17, long j18, long j19) {
        super(0);
        this.f255960d = accProcLifeStats;
        this.f255961e = str;
        this.f255962f = j17;
        this.f255963g = j18;
        this.f255964h = j19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map asMutable;
        java.util.List asMutable2;
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255960d;
        asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccExitGroup());
        java.util.Map<java.lang.String, java.lang.Long> accExitGroup = accProcLifeStats.getAccExitGroup();
        java.lang.String str = this.f255961e;
        java.lang.Long l17 = accExitGroup.get(str);
        long j17 = 0;
        if (l17 == null) {
            l17 = 0L;
        }
        long longValue = l17.longValue();
        long j18 = this.f255962f;
        asMutable.put(str, java.lang.Long.valueOf(longValue + j18));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("proc exit ago: ");
        long j19 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        sb6.append(j18 / j19);
        sb6.append(", acc=");
        sb6.append(accProcLifeStats.getAccExitDuringMs() / j19);
        sb6.append(", type=");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccProcLifeStats", sb6.toString());
        if (j18 > 0) {
            asMutable2 = accProcLifeStats.asMutable(accProcLifeStats.getAccProcSate());
            long j27 = this.f255963g;
            java.lang.Long valueOf = java.lang.Long.valueOf(j27);
            long j28 = this.f255964h;
            asMutable2.add(new jz5.l(valueOf, java.lang.Long.valueOf(j28)));
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("push recover: last=");
            sb7.append(j27);
            sb7.append(", curr=");
            sb7.append(j28);
            sb7.append(", gapMin=");
            sb7.append((j28 - j27) / j19);
            sb7.append(", totalGapMin=");
            for (jz5.l lVar : accProcLifeStats.getAccProcSate()) {
                j17 += (((java.lang.Number) lVar.f302834e).longValue() - ((java.lang.Number) lVar.f302833d).longValue()) / j19;
            }
            sb7.append(j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccProcLifeStats", sb7.toString());
        }
        return jz5.f0.f302826a;
    }
}
