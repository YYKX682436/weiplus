package kn4;

/* loaded from: classes12.dex */
public class r extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.g f309747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309748e;

    public r(dn.g gVar, java.lang.String str) {
        this.f309747d = gVar;
        this.f309748e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f309748e;
        dn.g gVar = this.f309747d;
        if (gVar == null) {
            kn4.p pVar = (kn4.p) ((java.util.concurrent.ConcurrentHashMap) kn4.q.f309743a).remove(str);
            long p17 = com.tencent.mm.sdk.platformtools.o4.L().p("FileTransportStats_accumulateSize");
            if (pVar != null) {
                long j17 = pVar.f309741c;
                long j18 = pVar.f309740b;
                if (j18 >= j17) {
                    p17 += j18 - j17;
                    com.tencent.mm.sdk.platformtools.o4.L().B("FileTransportStats_accumulateSize", p17);
                    com.tencent.mars.xlog.Log.i("FileTransportStats", pVar.toString());
                } else {
                    com.tencent.mars.xlog.Log.i("FileTransportStats", "error: total len < finished len, fileInfo=%s", pVar.toString());
                }
            }
            com.tencent.mars.xlog.Log.i("FileTransportStats", "accumulate size = %d", java.lang.Long.valueOf(p17));
            return;
        }
        java.util.Map map = kn4.q.f309743a;
        kn4.p pVar2 = (kn4.p) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        long p18 = com.tencent.mm.sdk.platformtools.o4.L().p("FileTransportStats_accumulateSize");
        if (pVar2 != null) {
            long j19 = gVar.field_finishedLength;
            long j27 = pVar2.f309741c;
            if (j19 < j27) {
                com.tencent.mars.xlog.Log.i("FileTransportStats", "error: current finished len(%d) < last finished len(%d)", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(pVar2.f309741c));
                return;
            } else {
                com.tencent.mm.sdk.platformtools.o4.L().B("FileTransportStats_accumulateSize", p18 + (j19 - j27));
                pVar2.f309741c = gVar.field_finishedLength;
                return;
            }
        }
        com.tencent.mm.sdk.platformtools.o4.L().B("FileTransportStats_accumulateSize", p18 + gVar.field_finishedLength);
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, new kn4.p(this.f309748e, gVar.field_toltalLength, gVar.field_finishedLength, gVar.field_isUploadTask));
        java.util.Map map2 = com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver.f175344a;
        if (java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver.f175346c <= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            return;
        }
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) kn4.o0.b().f309735a).values().iterator();
        while (it.hasNext()) {
            ((kn4.g0) it.next()).f309669e = str;
        }
        com.tencent.mars.xlog.Log.w("FileTransportStats", "abnormal file transport: mediaId=%s, info=[%s]", str, gVar.toString());
    }
}
