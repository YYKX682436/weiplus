package kn4;

@j95.b
/* loaded from: classes12.dex */
public class t extends i95.w implements pf0.q {
    public void Ai(java.lang.String str, dn.g gVar, dn.h hVar) {
        if (kn4.q.f309744b || str == null) {
            return;
        }
        if (gVar == null && hVar == null) {
            return;
        }
        if (gVar == null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) kn4.q.f309746d;
            kn4.s sVar = (kn4.s) concurrentHashMap.get(str);
            if (sVar == null) {
                sVar = new kn4.s();
                concurrentHashMap.put(str, sVar);
            }
            sVar.f309749a++;
            sVar.f309750b = java.lang.System.currentTimeMillis();
        }
        if (str.startsWith("finder")) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new kn4.r(gVar, str));
    }

    public void wi(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FileTransportStatsService", "A download event from " + str + " is occurred.");
        java.util.Map map = com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver.f175344a;
        com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver.f175346c = java.lang.System.currentTimeMillis();
    }
}
