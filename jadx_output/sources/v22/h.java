package v22;

/* loaded from: classes10.dex */
public final class h implements fp0.p {
    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        v22.g gVar;
        v22.m task = (v22.m) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        java.util.List<v22.g> list = v22.j.f432828e;
        kotlin.jvm.internal.o.f(list, "access$getMixTasks$p(...)");
        synchronized (list) {
            gVar = null;
            for (v22.g gVar2 : list) {
                if (gVar2.f432814b == task.f432834h) {
                    gVar = gVar2;
                }
            }
        }
        if (gVar != null) {
            v22.j.f432828e.remove(gVar);
        }
        java.util.List list2 = v22.j.f432828e;
        if (list2.isEmpty()) {
            pm0.v.V(1000L, v22.j.f432827d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiMixManager", "onLoaderFin: " + status + ", " + list2.size());
    }
}
