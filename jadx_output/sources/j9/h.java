package j9;

/* loaded from: classes15.dex */
public abstract class h implements i9.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f298330a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f298331b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.PriorityQueue f298332c;

    /* renamed from: d, reason: collision with root package name */
    public i9.i f298333d;

    /* renamed from: e, reason: collision with root package name */
    public long f298334e;

    public h() {
        for (int i17 = 0; i17 < 10; i17++) {
            this.f298330a.add(new i9.i());
        }
        this.f298331b = new java.util.LinkedList();
        for (int i18 = 0; i18 < 2; i18++) {
            this.f298331b.add(new j9.i(this));
        }
        this.f298332c = new java.util.PriorityQueue();
    }

    @Override // o8.e
    public java.lang.Object a() {
        t9.a.d(this.f298333d == null);
        java.util.LinkedList linkedList = this.f298330a;
        if (linkedList.isEmpty()) {
            return null;
        }
        i9.i iVar = (i9.i) linkedList.pollFirst();
        this.f298333d = iVar;
        return iVar;
    }

    @Override // i9.e
    public void b(long j17) {
        this.f298334e = j17;
    }

    @Override // o8.e
    public void c(java.lang.Object obj) {
        i9.i iVar = (i9.i) obj;
        t9.a.a(iVar == this.f298333d);
        if (iVar.k()) {
            iVar.l();
            this.f298330a.add(iVar);
        } else {
            this.f298332c.add(iVar);
        }
        this.f298333d = null;
    }

    public abstract i9.d d();

    @Override // o8.e
    public java.lang.Object dequeueOutputBuffer() {
        java.util.LinkedList linkedList = this.f298331b;
        if (!linkedList.isEmpty()) {
            while (true) {
                java.util.PriorityQueue priorityQueue = this.f298332c;
                if (priorityQueue.isEmpty() || ((i9.i) priorityQueue.peek()).f343611g > this.f298334e) {
                    break;
                }
                i9.i iVar = (i9.i) priorityQueue.poll();
                boolean b17 = iVar.b(4);
                java.util.LinkedList linkedList2 = this.f298330a;
                if (b17) {
                    i9.j jVar = (i9.j) linkedList.pollFirst();
                    jVar.f343594d = 4 | jVar.f343594d;
                    iVar.l();
                    linkedList2.add(iVar);
                    return jVar;
                }
                e(iVar);
                if (f()) {
                    i9.d d17 = d();
                    if (!iVar.k()) {
                        i9.j jVar2 = (i9.j) linkedList.pollFirst();
                        long j17 = iVar.f343611g;
                        jVar2.f343613e = j17;
                        jVar2.f289671f = d17;
                        jVar2.f289672g = j17;
                        iVar.l();
                        linkedList2.add(iVar);
                        return jVar2;
                    }
                }
                iVar.l();
                linkedList2.add(iVar);
            }
        }
        return null;
    }

    public abstract void e(i9.i iVar);

    public abstract boolean f();

    @Override // o8.e
    public void flush() {
        java.util.LinkedList linkedList;
        this.f298334e = 0L;
        while (true) {
            java.util.PriorityQueue priorityQueue = this.f298332c;
            boolean isEmpty = priorityQueue.isEmpty();
            linkedList = this.f298330a;
            if (isEmpty) {
                break;
            }
            i9.i iVar = (i9.i) priorityQueue.poll();
            iVar.l();
            linkedList.add(iVar);
        }
        i9.i iVar2 = this.f298333d;
        if (iVar2 != null) {
            iVar2.l();
            linkedList.add(iVar2);
            this.f298333d = null;
        }
    }

    @Override // o8.e
    public void release() {
    }
}
