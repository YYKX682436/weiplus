package lt0;

/* loaded from: classes15.dex */
public abstract class f implements kk.j {

    /* renamed from: a, reason: collision with root package name */
    public final lt0.a f321166a;

    /* renamed from: b, reason: collision with root package name */
    public kk.j f321167b;

    /* renamed from: c, reason: collision with root package name */
    public lt0.c f321168c;

    /* renamed from: d, reason: collision with root package name */
    public final int f321169d;

    /* renamed from: e, reason: collision with root package name */
    public final kk.h f321170e;

    public f(int i17) {
        this.f321167b = null;
        this.f321168c = null;
        this.f321170e = null;
        this.f321169d = i17;
        p();
    }

    @Override // kk.j
    public int a() {
        int a17 = this.f321167b.a();
        lt0.c cVar = this.f321168c;
        if (cVar != null) {
            ((lt0.i) cVar).f321173a.a();
        }
        return a17;
    }

    @Override // kk.j
    public int b() {
        int b17 = this.f321167b.b();
        lt0.c cVar = this.f321168c;
        if (cVar != null) {
            ((lt0.i) cVar).f321173a.b();
        }
        return b17;
    }

    @Override // kk.j
    public void c(kk.g gVar) {
        this.f321167b.c(new lt0.e(this, gVar));
    }

    @Override // kk.j
    public void clear() {
        this.f321167b.clear();
    }

    @Override // kk.j
    public void d(int i17) {
        this.f321167b.d(i17);
    }

    @Override // kk.j
    public int e() {
        int e17 = this.f321167b.e();
        lt0.c cVar = this.f321168c;
        if (cVar != null) {
            ((lt0.i) cVar).f321173a.e();
        }
        return e17;
    }

    @Override // kk.j
    public int f() {
        int f17 = this.f321167b.f();
        lt0.c cVar = this.f321168c;
        if (cVar != null) {
            ((lt0.i) cVar).f321173a.f();
        }
        return f17;
    }

    @Override // kk.j
    public int g(java.lang.Object obj, java.lang.Object obj2) {
        return this.f321167b.g(obj, q(obj, obj2));
    }

    @Override // kk.j
    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Object s17 = s(this.f321167b.get(obj));
        lt0.c cVar = this.f321168c;
        if (cVar != null) {
            lt0.i iVar = (lt0.i) cVar;
        }
        return s17;
    }

    @Override // kk.j
    public int h() {
        int h17 = this.f321167b.h();
        lt0.c cVar = this.f321168c;
        if (cVar != null) {
            ((lt0.i) cVar).f321173a.h();
        }
        return h17;
    }

    @Override // kk.j
    public java.lang.Object i(java.lang.Object obj) {
        java.lang.Object s17 = s(this.f321167b.i(obj));
        lt0.c cVar = this.f321168c;
        if (cVar != null) {
            lt0.i iVar = (lt0.i) cVar;
        }
        return s17;
    }

    @Override // kk.j
    public void j(java.lang.Object obj, java.lang.Object obj2) {
        this.f321167b.j(obj, q(obj, obj2));
        if (this.f321168c != null) {
            java.lang.Object m17 = m();
            lt0.c cVar = this.f321168c;
            java.lang.Object r17 = r(obj, obj2);
            lt0.i iVar = (lt0.i) cVar;
            iVar.getClass();
            lt0.a aVar = lt0.a.f321162c;
            java.lang.Object b17 = iVar.b(m17, obj);
            iVar.f321173a.j(b17, (lt0.b) r17);
        }
    }

    @Override // kk.j
    public boolean k(java.lang.Object obj) {
        boolean k17 = this.f321167b.k(obj);
        lt0.c cVar = this.f321168c;
        if (cVar != null) {
            lt0.i iVar = (lt0.i) cVar;
            iVar.f321173a.k(iVar.b(m(), obj));
        }
        return k17;
    }

    @Override // kk.j
    public java.util.Set keySet() {
        return this.f321167b.keySet();
    }

    public abstract java.lang.Object m();

    public kk.j n() {
        return new kk.l(this.f321169d, new lt0.d(this));
    }

    public lt0.c o(lt0.a aVar) {
        return null;
    }

    public void p() {
        this.f321167b = n();
        this.f321168c = o(this.f321166a);
    }

    @Override // kk.j
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object s17 = s(this.f321167b.put(obj, q(obj, obj2)));
        if (this.f321168c != null) {
            java.lang.Object m17 = m();
            lt0.c cVar = this.f321168c;
            java.lang.Object r17 = r(obj, obj2);
            lt0.i iVar = (lt0.i) cVar;
            iVar.getClass();
            lt0.a aVar = lt0.a.f321162c;
            java.lang.Object b17 = iVar.b(m17, obj);
        }
        return s17;
    }

    public abstract java.lang.Object q(java.lang.Object obj, java.lang.Object obj2);

    public abstract java.lang.Object r(java.lang.Object obj, java.lang.Object obj2);

    @Override // kk.j
    public java.lang.Object remove(java.lang.Object obj) {
        java.lang.Object s17 = s(this.f321167b.remove(obj));
        lt0.c cVar = this.f321168c;
        if (cVar != null) {
            lt0.i iVar = (lt0.i) cVar;
        }
        return s17;
    }

    public abstract java.lang.Object s(java.lang.Object obj);

    @Override // kk.j
    public int size() {
        int size = this.f321167b.size();
        lt0.c cVar = this.f321168c;
        if (cVar != null) {
            ((lt0.i) cVar).f321173a.size();
        }
        return size;
    }

    public f(int i17, kk.h hVar) {
        this.f321167b = null;
        this.f321168c = null;
        this.f321170e = null;
        this.f321170e = hVar;
        this.f321169d = i17;
        p();
    }

    public f(int i17, kk.h hVar, lt0.a aVar) {
        this.f321167b = null;
        this.f321168c = null;
        this.f321170e = null;
        this.f321170e = hVar;
        this.f321169d = i17;
        this.f321166a = aVar;
        p();
    }
}
