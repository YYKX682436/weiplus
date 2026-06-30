package g75;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g75.f f269351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j75.b f269352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g75.f fVar, j75.b bVar) {
        super(0);
        this.f269351d = fVar;
        this.f269352e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = g75.f.f269362c;
        g75.f fVar = this.f269351d;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) concurrentHashMap.get(fVar.i());
        if (copyOnWriteArrayList != null) {
            if (!copyOnWriteArrayList.isEmpty()) {
                concurrentHashMap.put(fVar.i(), new java.util.concurrent.CopyOnWriteArrayList());
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    g75.f fVar2 = (g75.f) ((java.lang.ref.WeakReference) it.next()).get();
                    if (fVar2 != null) {
                        g75.z zVar = (g75.z) ((g75.v) this.f269352e).f269402b.c();
                        g75.r rVar = fVar2.f269401a;
                        rVar.e(-1, zVar);
                        rVar.c();
                    }
                }
            }
            fVar.i();
            copyOnWriteArrayList.size();
        }
        return jz5.f0.f302826a;
    }
}
