package w6;

/* loaded from: classes13.dex */
public class a1 implements w6.k, u6.d {

    /* renamed from: d, reason: collision with root package name */
    public final w6.j f443052d;

    /* renamed from: e, reason: collision with root package name */
    public final w6.l f443053e;

    /* renamed from: f, reason: collision with root package name */
    public int f443054f;

    /* renamed from: g, reason: collision with root package name */
    public int f443055g = -1;

    /* renamed from: h, reason: collision with root package name */
    public t6.h f443056h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f443057i;

    /* renamed from: m, reason: collision with root package name */
    public int f443058m;

    /* renamed from: n, reason: collision with root package name */
    public volatile a7.o0 f443059n;

    /* renamed from: o, reason: collision with root package name */
    public java.io.File f443060o;

    /* renamed from: p, reason: collision with root package name */
    public w6.b1 f443061p;

    public a1(w6.l lVar, w6.j jVar) {
        this.f443053e = lVar;
        this.f443052d = jVar;
    }

    @Override // w6.k
    public boolean a() {
        java.util.List list;
        java.util.List d17;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f443053e.a();
        if (arrayList.isEmpty()) {
            return false;
        }
        w6.l lVar = this.f443053e;
        com.bumptech.glide.m mVar = lVar.f443135c.f43946b;
        java.lang.Class<?> cls = lVar.f443136d.getClass();
        java.lang.Class cls2 = lVar.f443139g;
        java.lang.Class cls3 = lVar.f443143k;
        l7.e eVar = mVar.f43966h;
        q7.m mVar2 = (q7.m) eVar.f316784a.getAndSet(null);
        if (mVar2 == null) {
            mVar2 = new q7.m(cls, cls2, cls3);
        } else {
            mVar2.f360306a = cls;
            mVar2.f360307b = cls2;
            mVar2.f360308c = cls3;
        }
        synchronized (eVar.f316785b) {
            list = (java.util.List) eVar.f316785b.getOrDefault(mVar2, null);
        }
        eVar.f316784a.set(mVar2);
        java.util.List list2 = list;
        if (list == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            a7.t0 t0Var = mVar.f43959a;
            synchronized (t0Var) {
                d17 = t0Var.f1860a.d(cls);
            }
            java.util.Iterator it = ((java.util.ArrayList) d17).iterator();
            while (it.hasNext()) {
                java.util.Iterator it6 = ((java.util.ArrayList) mVar.f43961c.b((java.lang.Class) it.next(), cls2)).iterator();
                while (it6.hasNext()) {
                    java.lang.Class cls4 = (java.lang.Class) it6.next();
                    if (!((java.util.ArrayList) mVar.f43964f.a(cls4, cls3)).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            l7.e eVar2 = mVar.f43966h;
            java.util.List unmodifiableList = java.util.Collections.unmodifiableList(arrayList2);
            synchronized (eVar2.f316785b) {
                eVar2.f316785b.put(new q7.m(cls, cls2, cls3), unmodifiableList);
            }
            list2 = arrayList2;
        }
        if (list2.isEmpty()) {
            if (java.io.File.class.equals(this.f443053e.f443143k)) {
                return false;
            }
            throw new java.lang.IllegalStateException("Failed to find any load path from " + this.f443053e.f443136d.getClass() + " to " + this.f443053e.f443143k);
        }
        while (true) {
            java.util.List list3 = this.f443057i;
            if (list3 != null) {
                if (this.f443058m < list3.size()) {
                    this.f443059n = null;
                    boolean z17 = false;
                    while (!z17) {
                        if (!(this.f443058m < this.f443057i.size())) {
                            break;
                        }
                        java.util.List list4 = this.f443057i;
                        int i17 = this.f443058m;
                        this.f443058m = i17 + 1;
                        a7.p0 p0Var = (a7.p0) list4.get(i17);
                        java.io.File file = this.f443060o;
                        w6.l lVar2 = this.f443053e;
                        this.f443059n = p0Var.b(file, lVar2.f443137e, lVar2.f443138f, lVar2.f443141i);
                        if (this.f443059n != null) {
                            if (this.f443053e.c(this.f443059n.f1848c.a()) != null) {
                                this.f443059n.f1848c.e(this.f443053e.f443147o, this);
                                z17 = true;
                            }
                        }
                    }
                    return z17;
                }
            }
            int i18 = this.f443055g + 1;
            this.f443055g = i18;
            if (i18 >= list2.size()) {
                int i19 = this.f443054f + 1;
                this.f443054f = i19;
                if (i19 >= arrayList.size()) {
                    return false;
                }
                this.f443055g = 0;
            }
            t6.h hVar = (t6.h) arrayList.get(this.f443054f);
            java.lang.Class cls5 = (java.lang.Class) list2.get(this.f443055g);
            t6.p e17 = this.f443053e.e(cls5);
            w6.l lVar3 = this.f443053e;
            this.f443061p = new w6.b1(lVar3.f443135c.f43945a, hVar, lVar3.f443146n, lVar3.f443137e, lVar3.f443138f, e17, cls5, lVar3.f443141i);
            java.io.File a17 = ((w6.e0) lVar3.f443140h).a().a(this.f443061p);
            this.f443060o = a17;
            if (a17 != null) {
                this.f443056h = hVar;
                this.f443057i = this.f443053e.f443135c.f43946b.e(a17);
                this.f443058m = 0;
            }
        }
    }

    @Override // u6.d
    public void c(java.lang.Object obj) {
        this.f443052d.b(this.f443056h, obj, this.f443059n.f1848c, t6.a.RESOURCE_DISK_CACHE, this.f443061p);
    }

    @Override // w6.k
    public void cancel() {
        a7.o0 o0Var = this.f443059n;
        if (o0Var != null) {
            o0Var.f1848c.cancel();
        }
    }

    @Override // u6.d
    public void d(java.lang.Exception exc) {
        this.f443052d.j(this.f443061p, exc, this.f443059n.f1848c, t6.a.RESOURCE_DISK_CACHE);
    }
}
