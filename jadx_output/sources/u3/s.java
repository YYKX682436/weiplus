package u3;

/* loaded from: classes13.dex */
public abstract class s implements u3.b {

    /* renamed from: l, reason: collision with root package name */
    public static final u3.r f424217l = new u3.h("translationX");

    /* renamed from: m, reason: collision with root package name */
    public static final u3.r f424218m = new u3.i("translationY");

    /* renamed from: n, reason: collision with root package name */
    public static final u3.r f424219n = new u3.j("scaleX");

    /* renamed from: o, reason: collision with root package name */
    public static final u3.r f424220o = new u3.k("scaleY");

    /* renamed from: p, reason: collision with root package name */
    public static final u3.r f424221p = new u3.l("rotation");

    /* renamed from: q, reason: collision with root package name */
    public static final u3.r f424222q = new u3.m("rotationX");

    /* renamed from: r, reason: collision with root package name */
    public static final u3.r f424223r = new u3.n("rotationY");

    /* renamed from: s, reason: collision with root package name */
    public static final u3.r f424224s = new u3.g("alpha");

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f424228d;

    /* renamed from: e, reason: collision with root package name */
    public final u3.t f424229e;

    /* renamed from: i, reason: collision with root package name */
    public float f424233i;

    /* renamed from: a, reason: collision with root package name */
    public float f424225a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f424226b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f424227c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f424230f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float f424231g = -3.4028235E38f;

    /* renamed from: h, reason: collision with root package name */
    public long f424232h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f424234j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f424235k = new java.util.ArrayList();

    public s(java.lang.Object obj, u3.t tVar) {
        this.f424228d = obj;
        this.f424229e = tVar;
        if (tVar == f424221p || tVar == f424222q || tVar == f424223r) {
            this.f424233i = 0.1f;
            return;
        }
        if (tVar == f424224s) {
            this.f424233i = 0.00390625f;
        } else if (tVar == f424219n || tVar == f424220o) {
            this.f424233i = 0.00390625f;
        } else {
            this.f424233i = 1.0f;
        }
    }

    public u3.s a(u3.p pVar) {
        java.util.ArrayList arrayList = this.f424234j;
        if (!arrayList.contains(pVar)) {
            arrayList.add(pVar);
        }
        return this;
    }

    public abstract void b();

    public final void c(boolean z17) {
        java.util.ArrayList arrayList;
        int i17 = 0;
        this.f424230f = false;
        java.lang.ThreadLocal threadLocal = u3.f.f424209f;
        if (threadLocal.get() == null) {
            threadLocal.set(new u3.f());
        }
        u3.f fVar = (u3.f) threadLocal.get();
        fVar.f424210a.remove(this);
        java.util.ArrayList arrayList2 = fVar.f424211b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            fVar.f424214e = true;
        }
        this.f424232h = 0L;
        this.f424227c = false;
        while (true) {
            arrayList = this.f424234j;
            if (i17 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i17) != null) {
                ((u3.p) arrayList.get(i17)).a(this, z17, this.f424226b, this.f424225a);
            }
            i17++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public void d(float f17) {
        java.util.ArrayList arrayList;
        this.f424229e.b(this.f424228d, f17);
        int i17 = 0;
        while (true) {
            arrayList = this.f424235k;
            if (i17 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i17) != null) {
                ((u3.q) arrayList.get(i17)).a(this, this.f424226b, this.f424225a);
            }
            i17++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
