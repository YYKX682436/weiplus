package q01;

/* loaded from: classes12.dex */
public final class b0 implements q01.b1 {
    public final void a(com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object obj;
        q01.e0 e0Var = q01.e0.f359270a;
        synchronized (e0Var.d()) {
            int size = e0Var.d().size();
            int hashCode = m1Var.hashCode();
            java.util.Iterator it = e0Var.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((java.lang.Number) ((jz5.l) obj).f302833d).intValue() == hashCode) {
                        break;
                    }
                }
            }
            jz5.l lVar = (jz5.l) obj;
            if (lVar != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect watch-removed: " + m1Var.getClass().getName() + '@' + hashCode + ", total=" + size);
                ap.a.a(10001, "errNetScene", new java.lang.Throwable(), null, "WatchRemoved", q01.a1.f359259a.a(m1Var), java.lang.String.valueOf(size), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - ((java.lang.Number) lVar.f302834e).longValue()));
            }
        }
        if (q01.a1.f359259a.b()) {
            m1Var.trackState().g(301);
            synchronized (q01.a1.f359261c) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTracker", "#onDequeueNetScene: " + ((q01.s0) ((java.util.Map) q01.a1.f359262d.getValue()).remove(java.lang.Integer.valueOf(m1Var.hashCode()))) + '@' + m1Var.hashCode());
            }
        }
    }

    public final void b(com.tencent.mm.modelbase.m1 netScene) {
        q01.a1 a1Var = q01.a1.f359259a;
        kotlin.jvm.internal.o.g(netScene, "netScene");
        if (a1Var.b()) {
            netScene.trackState().g(210);
            synchronized (q01.a1.f359261c) {
                q01.s0 c17 = a1Var.c(netScene);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTracker", "#onEnqueueNetScene: " + c17 + '@' + netScene.hashCode());
                ((java.util.Map) q01.a1.f359262d.getValue()).put(java.lang.Integer.valueOf(netScene.hashCode()), c17);
            }
        }
    }
}
