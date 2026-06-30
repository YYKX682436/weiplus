package jt0;

/* loaded from: classes15.dex */
public final class i extends jt0.b {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f301601j;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301602f;

    /* renamed from: g, reason: collision with root package name */
    public kk.j f301603g;

    /* renamed from: h, reason: collision with root package name */
    public final kk.h f301604h;

    /* renamed from: i, reason: collision with root package name */
    public final kk.i f301605i;

    static {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        f301601j = concurrentHashMap;
        concurrentHashMap.put(android.graphics.Bitmap.class, new jt0.c());
        concurrentHashMap.put(java.lang.ref.WeakReference.class, new jt0.d());
    }

    public i(int i17, kk.h hVar, java.lang.Class cls) {
        this(i17, hVar, lt0.a.f321162c, cls);
        v(cls);
    }

    @Override // lt0.f, kk.j
    public java.lang.Object i(java.lang.Object obj) {
        kk.j jVar;
        java.lang.String str = (java.lang.String) obj;
        java.lang.Object i17 = this.f321167b.i(str);
        if (i17 == null && (jVar = this.f301603g) != null) {
            i17 = ((lt0.f) jVar).get(str);
        }
        lt0.c cVar = this.f321168c;
        if (cVar != null) {
            lt0.i iVar = (lt0.i) cVar;
            lt0.b bVar = (lt0.b) iVar.f321173a.i(iVar.b(this.f301602f, str));
            if (bVar == null) {
                bVar = null;
            }
        }
        lt0.a aVar = lt0.a.f321162c;
        return i17;
    }

    @Override // lt0.f, kk.j
    public void j(java.lang.Object obj, java.lang.Object obj2) {
        kk.j jVar;
        java.lang.String str = (java.lang.String) obj;
        if (!t(obj2) || (jVar = this.f301603g) == null) {
            super.j(str, obj2);
        } else {
            ((lt0.f) jVar).put(str, obj2);
        }
    }

    @Override // kk.j
    public java.util.Map l() {
        return this.f321167b.l();
    }

    @Override // lt0.f
    public java.lang.Object m() {
        return this.f301602f;
    }

    @Override // lt0.f
    public kk.j n() {
        return new kk.l(this.f321169d, new jt0.e(this));
    }

    @Override // lt0.f
    public lt0.c o(lt0.a aVar) {
        return kt0.g.a(aVar);
    }

    @Override // lt0.f
    public void p() {
        super.p();
    }

    @Override // lt0.f
    public java.lang.Object q(java.lang.Object obj, java.lang.Object obj2) {
        return obj2;
    }

    @Override // lt0.f
    public java.lang.Object r(java.lang.Object obj, java.lang.Object obj2) {
        return new kt0.a((java.lang.String) obj, this.f301602f, obj2, y(obj2), this.f301604h, this.f301605i);
    }

    @Override // lt0.f
    public java.lang.Object s(java.lang.Object obj) {
        return obj;
    }

    public final boolean t(java.lang.Object obj) {
        int i17;
        int y17 = y(obj) * 2;
        kt0.g gVar = kt0.g.f311912c;
        lt0.a aVar = this.f321166a;
        if (aVar == null || aVar.equals("")) {
            i17 = Integer.MAX_VALUE;
        } else if (kt0.g.f311913d.equals(aVar)) {
            i17 = ((kt0.e) kt0.g.b().f311914a).f311911c.f321163a;
        } else {
            kt0.g.b().getClass();
            i17 = ((kt0.e) ((kt0.f) kt0.g.b().f311915b.get(aVar.f321164b))).f311911c.f321163a;
        }
        return y17 >= i17;
    }

    @Override // lt0.f, kk.j
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public java.lang.Object get(java.lang.String str) {
        kk.j jVar;
        java.lang.Object obj = this.f321167b.get(str);
        if (obj == null && (jVar = this.f301603g) != null) {
            obj = ((lt0.f) jVar).get(str);
        }
        lt0.c cVar = this.f321168c;
        if (cVar != null) {
            lt0.i iVar = (lt0.i) cVar;
        }
        lt0.a aVar = lt0.a.f321162c;
        return obj;
    }

    public final void v(java.lang.Class cls) {
        lt0.l lVar;
        this.f301602f = cls.getName();
        kt0.g gVar = kt0.g.f311912c;
        lt0.a aVar = this.f321166a;
        if (aVar == null || aVar.equals("")) {
            lVar = null;
        } else if (kt0.g.f311913d.equals(aVar)) {
            lVar = ((kt0.e) kt0.g.b().f311914a).f311910b;
        } else {
            kt0.g.b().getClass();
            lVar = ((kt0.e) ((kt0.f) kt0.g.b().f311915b.get(aVar.f321164b))).f311910b;
        }
        this.f301603g = lVar;
    }

    @Override // kk.j
    public java.util.Collection values() {
        return this.f321167b.values();
    }

    @Override // lt0.f, kk.j
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public java.lang.Object put(java.lang.String str, java.lang.Object obj) {
        kk.j jVar;
        if (!t(obj) || (jVar = this.f301603g) == null) {
            return super.put(str, obj);
        }
        ((lt0.f) jVar).put(str, obj);
        return null;
    }

    @Override // lt0.f, kk.j
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public java.lang.Object remove(java.lang.String str) {
        kk.j jVar = this.f301603g;
        if (jVar != null) {
            ((lt0.f) jVar).remove(str);
        }
        return super.remove(str);
    }

    public final int y(java.lang.Object obj) {
        jt0.h hVar;
        return (obj == null || (hVar = (jt0.h) f301601j.get(obj.getClass())) == null) ? this.f321167b.g("", obj) : hVar.a(obj);
    }

    public i(int i17, java.lang.Class cls) {
        this(i17, null, cls);
        v(cls);
    }

    public i(int i17, kk.h hVar, lt0.a aVar, java.lang.Class cls) {
        super(i17, hVar, aVar);
        this.f301602f = "";
        this.f301603g = null;
        this.f301604h = new jt0.f(this);
        this.f301605i = new jt0.g(this);
        v(cls);
    }
}
