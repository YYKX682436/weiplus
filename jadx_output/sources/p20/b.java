package p20;

/* loaded from: classes12.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.v9 f351410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351411e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(bw5.v9 v9Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f351410d = v9Var;
        this.f351411e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new p20.b(this.f351410d, this.f351411e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((p20.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = p20.i.f351421g;
        if (atomicBoolean.get()) {
            com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "Preloader was paused, resuming all tasks");
            if (atomicBoolean.get()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Resuming all preload tasks, active tasks: ");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) p20.i.f351418d;
                sb6.append(concurrentHashMap.size());
                sb6.append(", waiting tasks: ");
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = p20.i.f351419e;
                sb6.append(concurrentLinkedQueue.size());
                com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", sb6.toString());
                atomicBoolean.set(false);
                java.util.List S0 = kz5.n0.S0(concurrentHashMap.values());
                concurrentHashMap.clear();
                java.util.List K0 = kz5.n0.K0(S0, 5);
                java.util.List R = kz5.n0.R(S0, 5);
                for (p20.a aVar2 : kz5.n0.x0(R)) {
                    concurrentLinkedQueue.offer(aVar2);
                    ((java.util.concurrent.ConcurrentHashMap.KeySetView) p20.i.f351420f).add(aVar2.a());
                }
                java.util.Iterator it = K0.iterator();
                while (it.hasNext()) {
                    p20.i.f351415a.a((p20.a) it.next());
                }
                com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "Resumed " + K0.size() + " tasks, " + R.size() + " tasks moved to waiting queue");
            } else {
                com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "Preloader is not paused, no need to resume");
            }
        }
        bw5.v9 v9Var = this.f351410d;
        java.lang.String str = v9Var.f34225m[1] ? v9Var.f34219d : "";
        kotlin.jvm.internal.o.f(str, "getUrl(...)");
        p20.a aVar3 = new p20.a(new p20.j(str), v9Var.f34224i, this.f351411e);
        p20.i iVar = p20.i.f351415a;
        java.lang.String a17 = aVar3.a();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) p20.i.f351418d;
        boolean contains = concurrentHashMap2.containsKey(a17) ? true : ((java.util.concurrent.ConcurrentHashMap.KeySetView) p20.i.f351420f).contains(a17);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (contains) {
            com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "Task already exists, skipping: " + aVar3.a());
            return f0Var;
        }
        if (((kotlinx.coroutines.sync.o) p20.i.f351417c).d()) {
            com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "Acquired semaphore permit, executing task: " + aVar3.a() + ", active tasks: " + concurrentHashMap2.size());
            iVar.a(aVar3);
        } else {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = p20.i.f351419e;
            concurrentLinkedQueue2.offer(aVar3);
            ((java.util.concurrent.ConcurrentHashMap.KeySetView) p20.i.f351420f).add(aVar3.a());
            com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "Preload queue is full, added to waiting queue: " + aVar3.a() + ", waiting queue size: " + concurrentLinkedQueue2.size());
        }
        return f0Var;
    }
}
