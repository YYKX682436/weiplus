package er0;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f255971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f255973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f255974g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j17, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats, long j18, long j19) {
        super(0);
        this.f255971d = j17;
        this.f255972e = accProcLifeStats;
        this.f255973f = j18;
        this.f255974g = j19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List asMutable;
        long j17 = 0;
        if (this.f255971d > 0) {
            com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255972e;
            asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccProcSate());
            long j18 = this.f255973f;
            java.lang.Long valueOf = java.lang.Long.valueOf(j18);
            long j19 = this.f255974g;
            asMutable.add(new jz5.l(valueOf, java.lang.Long.valueOf(j19)));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("push recover: last=");
            sb6.append(j18);
            sb6.append(", curr=");
            sb6.append(j19);
            sb6.append(", gapMin=");
            long j27 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            sb6.append((j19 - j18) / j27);
            sb6.append(", totalGapMin=");
            for (jz5.l lVar : accProcLifeStats.getAccProcSate()) {
                j17 += (((java.lang.Number) lVar.f302834e).longValue() - ((java.lang.Number) lVar.f302833d).longValue()) / j27;
            }
            sb6.append(j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccProcLifeStats", sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
