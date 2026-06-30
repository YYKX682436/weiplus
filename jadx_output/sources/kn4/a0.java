package kn4;

/* loaded from: classes12.dex */
public class a0 extends com.tencent.matrix.lifecycle.g {
    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        java.util.Map map = com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver.f175344a;
        kn4.b0 b0Var = (kn4.b0) ((java.util.concurrent.ConcurrentHashMap) map).get("Background");
        if (b0Var == null) {
            b0Var = new kn4.b0();
            ((java.util.concurrent.ConcurrentHashMap) map).put("Background", b0Var);
        }
        b0Var.f309672a = "Background";
        b0Var.f309673b = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.TrafficClickFlow", "Scene change, background[enter]");
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        java.util.Map map = com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver.f175344a;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey("Background")) {
            kn4.b0 b0Var = (kn4.b0) ((java.util.concurrent.ConcurrentHashMap) map).remove("Background");
            b0Var.f309674c = java.lang.System.currentTimeMillis();
            java.util.Deque deque = com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver.f175345b;
            synchronized (deque) {
                ((java.util.ArrayDeque) deque).addLast(b0Var);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TrafficClickFlow", "Scene change, background[exit]");
    }
}
