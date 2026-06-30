package dr0;

/* loaded from: classes12.dex */
public final class b0 implements dr0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public long f242411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dr0.t0 f242412b;

    public b0(dr0.t0 t0Var) {
        this.f242412b = t0Var;
    }

    @Override // dr0.i1
    public void a(boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccMonitor", "onMainProcStandByChanged: " + z17);
        dr0.t0 t0Var = this.f242412b;
        if (z17) {
            this.f242411a = currentTimeMillis;
        } else {
            long j17 = this.f242411a;
            if (1 <= j17 && j17 < currentTimeMillis) {
                long j18 = currentTimeMillis - j17;
                t0Var.i().collectMainStandBy(j18);
                t0Var.f242546f.collectMainStandBy(j18);
                if (mm.o.h(false, 1, null) && j18 >= 600000) {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    long accMainProcStandbyMs = t0Var.f242546f.getAccMainProcStandbyMs();
                    long j19 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
                    linkedHashMap.put("standby-minute", java.lang.Long.valueOf(accMainProcStandbyMs / j19));
                    linkedHashMap.put("standby-dataPushCount", java.lang.Long.valueOf(t0Var.f242546f.getAccMainProcStandByMsgCount()));
                    linkedHashMap.put("all-voipCount", java.lang.Long.valueOf(t0Var.f242546f.getAccAllVoipCount()));
                    linkedHashMap.put("standby-voipCount", java.lang.Long.valueOf(t0Var.f242546f.getAccMainProcStandByVoipCount()));
                    long j27 = 0;
                    while (t0Var.f242546f.getAccMainProcStandByAddNsgGroup().values().iterator().hasNext()) {
                        j27 += r6.next().size();
                    }
                    linkedHashMap.put("standby-addMsgGroupCount", java.lang.Integer.valueOf(t0Var.f242546f.getAccMainProcStandByAddNsgGroup().keySet().size()));
                    linkedHashMap.put("standby-addMsgCount", java.lang.Long.valueOf(j27));
                    ap.a.a(1, "accProcStandBy", null, linkedHashMap, java.lang.String.valueOf(t0Var.f242546f.getAccMainProcStandByMsgCount()), java.lang.String.valueOf(j18 / j19));
                }
            }
            this.f242411a = 0L;
        }
        t0Var.f242546f.clear();
    }
}
