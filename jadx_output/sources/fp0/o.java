package fp0;

/* loaded from: classes10.dex */
public final class o implements fp0.c {

    /* renamed from: a, reason: collision with root package name */
    public final gp0.e f265269a;

    /* renamed from: b, reason: collision with root package name */
    public fp0.a f265270b;

    /* renamed from: c, reason: collision with root package name */
    public fp0.a f265271c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f265272d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f265273e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f265274f;

    public o(gp0.e configuration) {
        kotlin.jvm.internal.o.g(configuration, "configuration");
        this.f265269a = configuration;
        this.f265272d = new java.util.LinkedList();
        this.f265273e = new java.util.LinkedList();
        this.f265274f = new java.util.LinkedList();
    }

    public final void a(fp0.d t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        b(t17, null);
    }

    public final void b(fp0.d t17, fp0.p pVar) {
        kotlin.jvm.internal.o.g(t17, "t");
        pm0.v.X(new fp0.e(this, t17, false, pVar));
    }

    public final boolean c() {
        java.util.LinkedList linkedList = this.f265273e;
        if (linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Loader.DefaultTaskLoader", f() + "DefaultTaskLoader mPendingQueue is empty");
            return false;
        }
        java.util.LinkedList linkedList2 = this.f265274f;
        int size = linkedList2.size();
        gp0.e eVar = this.f265269a;
        if (size >= ((gp0.g) eVar).f274175d) {
            return false;
        }
        java.lang.Object remove = linkedList.remove(0);
        kotlin.jvm.internal.o.f(remove, "removeAt(...)");
        fp0.q qVar = (fp0.q) remove;
        linkedList2.add(qVar);
        boolean a17 = ((gp0.g) eVar).f274172a.a((fp0.d) qVar.f265275a);
        java.lang.Object obj = qVar.f265275a;
        if (a17) {
            d(new fp0.w((fp0.d) obj, this, new fp0.h(this)));
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f());
        sb6.append(" block retryStrategy ");
        sb6.append(obj);
        sb6.append(" callback size=");
        java.util.Queue<fp0.p> queue = qVar.f265276b;
        sb6.append(queue.size());
        com.tencent.mars.xlog.Log.w("MicroMsg.Loader.DefaultTaskLoader", sb6.toString());
        for (fp0.p pVar : queue) {
            if (pVar != null) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type T of com.tencent.mm.loader.loader.LoaderCore.callPrepareInUI$lambda$1");
                pVar.a((fp0.d) obj, fp0.u.f265289e);
            }
        }
        return true;
    }

    public void d(java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.g(runnable, "runnable");
        if (this.f265270b == null) {
            gp0.g gVar = (gp0.g) this.f265269a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pool light poolSize ");
            gp0.h hVar = gVar.f274173b;
            sb6.append(hVar.f274178a);
            sb6.append(" priority ");
            int i17 = hVar.f274178a;
            sb6.append(i17);
            sb6.append(" name: ");
            java.lang.String str = gVar.f274176e;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i(gVar.f274177f, sb6.toString());
            this.f265270b = new gp0.c(str, i17, i17, new kp0.a());
        }
        fp0.a aVar = this.f265270b;
        if (aVar != null) {
            ((gp0.c) aVar).execute(runnable);
        }
    }

    public final boolean e(fp0.d t17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(t17, "t");
        java.util.Iterator it = this.f265274f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((fp0.d) ((fp0.q) obj).f265275a).d(), t17.d())) {
                break;
            }
        }
        return ((fp0.q) obj) != null;
    }

    public final java.lang.String f() {
        return "name:" + ((gp0.g) this.f265269a).f274176e + "_this:" + hashCode() + '_';
    }

    public final void g(fp0.p callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        pm0.v.X(new fp0.k(this, callback));
    }
}
