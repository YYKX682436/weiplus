package er0;

/* loaded from: classes12.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f255952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats f255953e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z17, com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats) {
        super(0);
        this.f255952d = z17;
        this.f255953e = accProcLifeStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List asMutable;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#collectAppExpStat: ");
        boolean z17 = this.f255952d;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccProcLifeStats", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.matrix.battery.accumulate.acc.AccProcLifeStats accProcLifeStats = this.f255953e;
        jz5.l lastAppExpFgState = accProcLifeStats.getLastAppExpFgState();
        if (z17 && lastAppExpFgState != null && !((java.lang.Boolean) lastAppExpFgState.f302833d).booleanValue()) {
            asMutable = accProcLifeStats.asMutable(accProcLifeStats.getAccAppExpFgStat());
            java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis);
            java.lang.Object obj = lastAppExpFgState.f302834e;
            asMutable.add(new jz5.l(obj, valueOf));
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("appExpFg: last=");
            java.lang.Number number = (java.lang.Number) obj;
            sb7.append(number.longValue());
            sb7.append(", curr=");
            sb7.append(currentTimeMillis);
            sb7.append(", gapMin=");
            long longValue = currentTimeMillis - number.longValue();
            long j17 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            sb7.append(longValue / j17);
            sb7.append(", totalGapMin=");
            long j18 = 0;
            for (jz5.l lVar : accProcLifeStats.getAccAppExpFgStat()) {
                j18 += (((java.lang.Number) lVar.f302834e).longValue() - ((java.lang.Number) lVar.f302833d).longValue()) / j17;
            }
            sb7.append(j18);
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccProcLifeStats", sb7.toString());
            accProcLifeStats.setLastAppExpFgState(null);
        }
        if (!z17 && (lastAppExpFgState == null || ((java.lang.Boolean) lastAppExpFgState.f302833d).booleanValue())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccProcLifeStats", "appExpBg: " + currentTimeMillis);
            accProcLifeStats.setLastAppExpFgState(new jz5.l(java.lang.Boolean.FALSE, java.lang.Long.valueOf(currentTimeMillis)));
        }
        return jz5.f0.f302826a;
    }
}
