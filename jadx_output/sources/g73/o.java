package g73;

/* loaded from: classes15.dex */
public final class o extends com.tencent.mm.sdk.platformtools.n3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.os.Looper looper) {
        super(looper);
        kotlin.jvm.internal.o.g(looper, "looper");
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        boolean z17;
        g73.o0.f269311d.getClass();
        com.tencent.mars.xlog.Log.i("HandOffService", "do fix handoff");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = g73.o0.f269314g;
        if (!concurrentHashMap.isEmpty()) {
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                if (((com.tencent.mm.plugin.handoff.model.HandOff) entry.getValue()).getHandOffType() == 1 && !(entry.getValue() instanceof com.tencent.mm.plugin.handoff.model.HandOffFinderLive)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry2 : concurrentHashMap.entrySet()) {
                if (((com.tencent.mm.plugin.handoff.model.HandOff) entry2.getValue()).getHandOffType() == 1 && !(entry2.getValue() instanceof com.tencent.mm.plugin.handoff.model.HandOffFinderLive)) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            com.tencent.mars.xlog.Log.i("HandOffService", "in launcherUI, handoff not clear[exist:" + linkedHashMap.size() + "]! try to fix...");
            if (!linkedHashMap.isEmpty()) {
                com.tencent.mars.xlog.Log.i("HandOffService", "in launcherUI, handoff exist, send all list");
                java.util.Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    concurrentHashMap.remove((java.lang.String) it.next());
                }
                java.util.Collection values = concurrentHashMap.values();
                kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                g73.o0.f269320p.e(values);
            }
        }
    }
}
