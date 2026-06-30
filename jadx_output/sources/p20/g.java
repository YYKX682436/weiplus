package p20;

/* loaded from: classes12.dex */
public final class g extends qz5.l implements yz5.p {
    public g(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new p20.g(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new p20.g((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = p20.i.f351421g.get();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "Preloader is paused, not processing waiting queue");
            return f0Var;
        }
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = p20.i.f351419e;
        p20.a aVar2 = (p20.a) concurrentLinkedQueue.poll();
        if (aVar2 != null) {
            java.util.Set set = p20.i.f351420f;
            ((java.util.concurrent.ConcurrentHashMap.KeySetView) set).remove(aVar2.a());
            if (((kotlinx.coroutines.sync.o) p20.i.f351417c).d()) {
                com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "Processing next task from waiting queue: " + aVar2.a() + ", remaining in queue: " + concurrentLinkedQueue.size());
                p20.i.f351415a.a(aVar2);
            } else {
                concurrentLinkedQueue.offer(aVar2);
                ((java.util.concurrent.ConcurrentHashMap.KeySetView) set).add(aVar2.a());
                com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "No permit available, task returned to queue: " + aVar2.a());
            }
        }
        return f0Var;
    }
}
