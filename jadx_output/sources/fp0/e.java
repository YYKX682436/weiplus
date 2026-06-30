package fp0;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.o f265248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.d f265249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f265250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fp0.p f265251g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fp0.o oVar, fp0.d dVar, boolean z17, fp0.p pVar) {
        super(0);
        this.f265248d = oVar;
        this.f265249e = dVar;
        this.f265250f = z17;
        this.f265251g = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        fp0.d dVar;
        java.lang.Object obj2;
        fp0.o oVar = this.f265248d;
        java.util.Iterator it = oVar.f265273e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            obj = null;
            dVar = this.f265249e;
            if (!hasNext) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.o.b(((fp0.d) ((fp0.q) obj2).f265275a).d(), dVar.d())) {
                break;
            }
        }
        fp0.q qVar = (fp0.q) obj2;
        fp0.p pVar = this.f265251g;
        if (qVar != null) {
            boolean c17 = ((fp0.d) qVar.f265275a).c(dVar);
            java.util.Queue queue = qVar.f265276b;
            if (c17) {
                queue.clear();
            }
            if (pVar != null) {
                queue.add(pVar);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Loader.DefaultTaskLoader", oVar.f() + "this task already in task in mPendingQueue " + dVar + ' ' + dVar.d() + " callback=" + pVar + " callback size=" + queue.size());
            oVar.c();
        } else {
            java.util.LinkedList linkedList = oVar.f265274f;
            java.util.Iterator it6 = linkedList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (kotlin.jvm.internal.o.b(((fp0.d) ((fp0.q) next).f265275a).d(), dVar.d())) {
                    obj = next;
                    break;
                }
            }
            fp0.q qVar2 = (fp0.q) obj;
            if (qVar2 != null) {
                boolean c18 = ((fp0.d) qVar2.f265275a).c(dVar);
                java.util.Queue queue2 = qVar2.f265276b;
                if (c18) {
                    queue2.clear();
                }
                if (pVar != null) {
                    queue2.add(pVar);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Loader.DefaultTaskLoader", oVar.f() + "this task already in task in mRunningQueue " + dVar + ' ' + dVar.d() + " callback=" + pVar + " callback size=" + queue2.size());
                oVar.c();
            } else {
                java.lang.String str = oVar.f() + " task in mRunningQueue %s %s, %d, %d";
                java.lang.String d17 = dVar.d();
                java.util.LinkedList linkedList2 = oVar.f265273e;
                com.tencent.mars.xlog.Log.i("MicroMsg.Loader.DefaultTaskLoader", str, dVar, d17, java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(linkedList.size()));
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
                if (pVar != null) {
                    concurrentLinkedQueue.add(pVar);
                }
                if (this.f265250f) {
                    linkedList2.addFirst(new fp0.q(dVar, concurrentLinkedQueue));
                } else {
                    linkedList2.add(new fp0.q(dVar, concurrentLinkedQueue));
                }
                oVar.c();
            }
        }
        return jz5.f0.f302826a;
    }
}
