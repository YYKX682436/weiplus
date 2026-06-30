package sh2;

/* loaded from: classes3.dex */
public final class e implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sh2.g f408017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sh2.a f408018b;

    public e(sh2.g gVar, sh2.a aVar) {
        this.f408017a = gVar;
        this.f408018b = aVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        sh2.j task = (sh2.j) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        sh2.g gVar = sh2.g.f408020e;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveLikeActionMgr", "task callback " + status);
        fp0.u uVar = fp0.u.f265290f;
        sh2.g gVar2 = this.f408017a;
        if (status != uVar) {
            com.tencent.mm.sdk.platformtools.u3.l(gVar2.f408024d);
            com.tencent.mm.sdk.platformtools.u3.i(gVar2.f408024d, nv2.a.f340431a);
            return;
        }
        gVar2.getClass();
        sh2.a aVar = this.f408018b;
        boolean z17 = aVar instanceof sh2.c;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = gVar2.f408022b;
        java.util.ArrayList<sh2.a> arrayList = null;
        if (z17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                sh2.a aVar2 = (sh2.a) next;
                if ((aVar2 instanceof sh2.c ? (sh2.c) aVar2 : null) != null && aVar.f408010c > aVar2.f408010c) {
                    arrayList2.add(next);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            for (sh2.a aVar3 : arrayList) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveLikeActionMgr", "drop action now action " + aVar + ' ' + aVar3);
                concurrentLinkedQueue.remove(aVar3);
            }
        }
        gVar2.a();
    }
}
