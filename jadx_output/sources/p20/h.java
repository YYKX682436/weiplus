package p20;

/* loaded from: classes12.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f351414d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new p20.h(this.f351414d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        p20.h hVar = (p20.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Stopping preload tasks for group: ");
        java.lang.String str = this.f351414d;
        sb6.append(str);
        sb6.append(", current preloading: ");
        java.util.Map map = p20.i.f351418d;
        sb6.append(((java.util.concurrent.ConcurrentHashMap) map).size());
        com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", sb6.toString());
        sx.a0 a0Var = (sx.a0) i95.n0.c(sx.a0.class);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) map).entrySet()) {
            if (kotlin.jvm.internal.o.b(((p20.a) entry.getValue()).f351409c, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry2.getKey();
            try {
                ((rx.a) a0Var).aj(str2, new dn.h());
                com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "Stopped preload task: " + str2 + " from group: " + str);
                ((kotlinx.coroutines.sync.o) p20.i.f351417c).c();
                ((java.util.concurrent.ConcurrentHashMap) p20.i.f351418d).remove(str2);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("EcsPlayerPreloadMgr", "Failed to stop preload task: " + str2 + " from group: " + str, e17);
            }
        }
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = p20.i.f351419e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : concurrentLinkedQueue) {
            if (kotlin.jvm.internal.o.b(((p20.a) obj2).f351409c, str)) {
                arrayList.add(obj2);
            }
        }
        p20.i.f351419e.removeAll(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.util.concurrent.ConcurrentHashMap.KeySetView) p20.i.f351420f).remove(((p20.a) it.next()).a());
        }
        com.tencent.mars.xlog.Log.i("EcsPlayerPreloadMgr", "Stopped " + linkedHashMap.size() + " active tasks and " + arrayList.size() + " waiting tasks for group: " + str);
        return jz5.f0.f302826a;
    }
}
