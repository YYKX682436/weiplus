package g75;

/* loaded from: classes10.dex */
public abstract class f extends g75.t {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f269362c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f269363b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
        this.f269363b = jz5.h.b(g75.a.f269346d);
    }

    public static /* synthetic */ void k(g75.f fVar, j75.b bVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleReturnAction");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        fVar.j(bVar, z17);
    }

    @Override // g75.t
    public void c() {
        f(new g75.d(this));
        b(new g75.e(this));
    }

    @Override // g75.t
    public void d() {
        j75.b l17 = l(h());
        if ((l17 instanceof g75.a0) || (l17 instanceof g75.v)) {
            j(l17, true);
            return;
        }
        java.lang.String i17 = i();
        if (!(!r26.n0.N(i17))) {
            k(this, new g75.w(l17), false, 2, null);
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f269362c;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) concurrentHashMap.get(i17);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        }
        if (true ^ copyOnWriteArrayList.isEmpty()) {
            copyOnWriteArrayList.add(new java.lang.ref.WeakReference(this));
            concurrentHashMap.put(i17, copyOnWriteArrayList);
            i();
            hashCode();
            return;
        }
        copyOnWriteArrayList.add(new java.lang.ref.WeakReference(this));
        concurrentHashMap.put(i17, copyOnWriteArrayList);
        i();
        hashCode();
        k(this, new g75.w(l17), false, 2, null);
    }

    @Override // g75.t
    public void e() {
        if (!r26.n0.N(i())) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f269362c;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) concurrentHashMap.get(i());
            if (copyOnWriteArrayList == null || !(!copyOnWriteArrayList.isEmpty())) {
                return;
            }
            concurrentHashMap.put(i(), new java.util.concurrent.CopyOnWriteArrayList());
            i();
            copyOnWriteArrayList.size();
        }
    }

    public java.lang.String i() {
        return "";
    }

    public final void j(j75.b bVar, boolean z17) {
        i();
        hashCode();
        bVar.getClass();
        java.lang.String i17 = i();
        boolean z18 = bVar instanceof g75.a0;
        g75.r rVar = this.f269401a;
        if (z18) {
            if ((!r26.n0.N(i17)) && !z17) {
                g(new g75.b(this, bVar));
                return;
            }
            g75.z data = ((g75.a0) bVar).f269347b;
            kotlin.jvm.internal.o.g(data, "data");
            rVar.e(0, data);
            rVar.c();
            return;
        }
        if (!(bVar instanceof g75.v)) {
            a(bVar);
            return;
        }
        if ((!r26.n0.N(i17)) && !z17) {
            g(new g75.c(this, bVar));
            return;
        }
        g75.z data2 = ((g75.v) bVar).f269402b;
        kotlin.jvm.internal.o.g(data2, "data");
        rVar.e(-1, data2);
        rVar.c();
    }

    public abstract j75.b l(g75.z zVar);
}
