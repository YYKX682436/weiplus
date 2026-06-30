package m7;

/* loaded from: classes13.dex */
public final class h implements m7.b, n7.g, m7.f {
    public static final boolean A = android.util.Log.isLoggable("Request", 2);

    /* renamed from: a, reason: collision with root package name */
    public final r7.k f324436a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f324437b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f324438c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.f f324439d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f324440e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f324441f;

    /* renamed from: g, reason: collision with root package name */
    public final m7.a f324442g;

    /* renamed from: h, reason: collision with root package name */
    public final int f324443h;

    /* renamed from: i, reason: collision with root package name */
    public final int f324444i;

    /* renamed from: j, reason: collision with root package name */
    public final com.bumptech.glide.g f324445j;

    /* renamed from: k, reason: collision with root package name */
    public final n7.h f324446k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f324447l;

    /* renamed from: m, reason: collision with root package name */
    public final o7.d f324448m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.Executor f324449n;

    /* renamed from: o, reason: collision with root package name */
    public w6.z0 f324450o;

    /* renamed from: p, reason: collision with root package name */
    public w6.f0 f324451p;

    /* renamed from: q, reason: collision with root package name */
    public long f324452q;

    /* renamed from: r, reason: collision with root package name */
    public volatile w6.g0 f324453r;

    /* renamed from: s, reason: collision with root package name */
    public m7.g f324454s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.drawable.Drawable f324455t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.drawable.Drawable f324456u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.Drawable f324457v;

    /* renamed from: w, reason: collision with root package name */
    public int f324458w;

    /* renamed from: x, reason: collision with root package name */
    public int f324459x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f324460y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.RuntimeException f324461z;

    public h(android.content.Context context, com.bumptech.glide.f fVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Class cls, m7.a aVar, int i17, int i18, com.bumptech.glide.g gVar, n7.h hVar, m7.d dVar, java.util.List list, m7.c cVar, w6.g0 g0Var, o7.d dVar2, java.util.concurrent.Executor executor) {
        if (A) {
            java.lang.String.valueOf(hashCode());
        }
        this.f324436a = new r7.j();
        this.f324437b = obj;
        this.f324438c = context;
        this.f324439d = fVar;
        this.f324440e = obj2;
        this.f324441f = cls;
        this.f324442g = aVar;
        this.f324443h = i17;
        this.f324444i = i18;
        this.f324445j = gVar;
        this.f324446k = hVar;
        this.f324447l = list;
        this.f324453r = g0Var;
        this.f324448m = dVar2;
        this.f324449n = executor;
        this.f324454s = m7.g.PENDING;
        if (this.f324461z == null && fVar.f43952h) {
            this.f324461z = new java.lang.RuntimeException("Glide request origin trace");
        }
    }

    public void a() {
        int i17;
        synchronized (this.f324437b) {
            try {
                if (this.f324460y) {
                    throw new java.lang.IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f324436a.a();
                int i18 = q7.j.f360301b;
                this.f324452q = android.os.SystemClock.elapsedRealtimeNanos();
                if (this.f324440e == null) {
                    if (q7.p.f(this.f324443h, this.f324444i)) {
                        this.f324458w = this.f324443h;
                        this.f324459x = this.f324444i;
                    }
                    if (this.f324457v == null) {
                        m7.a aVar = this.f324442g;
                        android.graphics.drawable.Drawable drawable = aVar.f324423u;
                        this.f324457v = drawable;
                        if (drawable == null && (i17 = aVar.f324424v) > 0) {
                            this.f324457v = h(i17);
                        }
                    }
                    i(new w6.t0("Received null model"), this.f324457v == null ? 5 : 3);
                    return;
                }
                m7.g gVar = this.f324454s;
                m7.g gVar2 = m7.g.RUNNING;
                if (gVar == gVar2) {
                    throw new java.lang.IllegalArgumentException("Cannot restart a running request");
                }
                if (gVar == m7.g.COMPLETE) {
                    k(this.f324450o, t6.a.MEMORY_CACHE);
                    return;
                }
                m7.g gVar3 = m7.g.WAITING_FOR_SIZE;
                this.f324454s = gVar3;
                if (q7.p.f(this.f324443h, this.f324444i)) {
                    l(this.f324443h, this.f324444i);
                } else {
                    this.f324446k.f(this);
                }
                m7.g gVar4 = this.f324454s;
                if (gVar4 == gVar2 || gVar4 == gVar3) {
                    this.f324446k.g(d());
                }
                if (A) {
                    q7.j.a(this.f324452q);
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    public final void b() {
        if (this.f324460y) {
            throw new java.lang.IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f324436a.a();
        this.f324446k.e(this);
        w6.f0 f0Var = this.f324451p;
        if (f0Var != null) {
            synchronized (f0Var.f443104c) {
                f0Var.f443102a.g(f0Var.f443103b);
            }
            this.f324451p = null;
        }
    }

    public void c() {
        synchronized (this.f324437b) {
            if (this.f324460y) {
                throw new java.lang.IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            this.f324436a.a();
            m7.g gVar = this.f324454s;
            m7.g gVar2 = m7.g.CLEARED;
            if (gVar == gVar2) {
                return;
            }
            b();
            w6.z0 z0Var = this.f324450o;
            if (z0Var != null) {
                this.f324450o = null;
            } else {
                z0Var = null;
            }
            this.f324446k.b(d());
            this.f324454s = gVar2;
            if (z0Var != null) {
                this.f324453r.d(z0Var);
            }
        }
    }

    public final android.graphics.drawable.Drawable d() {
        int i17;
        if (this.f324456u == null) {
            m7.a aVar = this.f324442g;
            android.graphics.drawable.Drawable drawable = aVar.f324415m;
            this.f324456u = drawable;
            if (drawable == null && (i17 = aVar.f324416n) > 0) {
                this.f324456u = h(i17);
            }
        }
        return this.f324456u;
    }

    public boolean e() {
        boolean z17;
        synchronized (this.f324437b) {
            z17 = this.f324454s == m7.g.COMPLETE;
        }
        return z17;
    }

    public boolean f(m7.b bVar) {
        int i17;
        int i18;
        java.lang.Object obj;
        java.lang.Class cls;
        m7.a aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i19;
        int i27;
        java.lang.Object obj2;
        java.lang.Class cls2;
        m7.a aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(bVar instanceof m7.h)) {
            return false;
        }
        synchronized (this.f324437b) {
            i17 = this.f324443h;
            i18 = this.f324444i;
            obj = this.f324440e;
            cls = this.f324441f;
            aVar = this.f324442g;
            gVar = this.f324445j;
            java.util.List list = this.f324447l;
            size = list != null ? list.size() : 0;
        }
        m7.h hVar = (m7.h) bVar;
        synchronized (hVar.f324437b) {
            i19 = hVar.f324443h;
            i27 = hVar.f324444i;
            obj2 = hVar.f324440e;
            cls2 = hVar.f324441f;
            aVar2 = hVar.f324442g;
            gVar2 = hVar.f324445j;
            java.util.List list2 = hVar.f324447l;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i17 == i19 && i18 == i27) {
            char[] cArr = q7.p.f360310a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        boolean z17;
        synchronized (this.f324437b) {
            m7.g gVar = this.f324454s;
            z17 = gVar == m7.g.RUNNING || gVar == m7.g.WAITING_FOR_SIZE;
        }
        return z17;
    }

    public final android.graphics.drawable.Drawable h(int i17) {
        android.content.res.Resources.Theme theme = this.f324442g.A;
        if (theme == null) {
            theme = this.f324438c.getTheme();
        }
        com.bumptech.glide.f fVar = this.f324439d;
        return f7.a.a(fVar, fVar, i17, theme);
    }

    public final void i(w6.t0 t0Var, int i17) {
        int i18;
        int i19;
        this.f324436a.a();
        synchronized (this.f324437b) {
            t0Var.getClass();
            int i27 = this.f324439d.f43953i;
            if (i27 <= i17) {
                java.util.Objects.toString(this.f324440e);
                if (i27 <= 4) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    t0Var.a(t0Var, arrayList);
                    int size = arrayList.size();
                    int i28 = 0;
                    while (i28 < size) {
                        int i29 = i28 + 1;
                        i28 = i29;
                    }
                }
            }
            android.graphics.drawable.Drawable drawable = null;
            this.f324451p = null;
            this.f324454s = m7.g.FAILED;
            this.f324460y = true;
            try {
                java.util.List list = this.f324447l;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    if (it.hasNext()) {
                        android.support.v4.media.f.a(it.next());
                        throw null;
                    }
                }
                if (this.f324440e == null) {
                    if (this.f324457v == null) {
                        m7.a aVar = this.f324442g;
                        android.graphics.drawable.Drawable drawable2 = aVar.f324423u;
                        this.f324457v = drawable2;
                        if (drawable2 == null && (i19 = aVar.f324424v) > 0) {
                            this.f324457v = h(i19);
                        }
                    }
                    drawable = this.f324457v;
                }
                if (drawable == null) {
                    if (this.f324455t == null) {
                        m7.a aVar2 = this.f324442g;
                        android.graphics.drawable.Drawable drawable3 = aVar2.f324413h;
                        this.f324455t = drawable3;
                        if (drawable3 == null && (i18 = aVar2.f324414i) > 0) {
                            this.f324455t = h(i18);
                        }
                    }
                    drawable = this.f324455t;
                }
                if (drawable == null) {
                    drawable = d();
                }
                this.f324446k.h(drawable);
                this.f324460y = false;
            } finally {
                this.f324460y = false;
            }
        }
    }

    public final void j(w6.z0 z0Var, java.lang.Object obj, t6.a aVar) {
        this.f324454s = m7.g.COMPLETE;
        this.f324450o = z0Var;
        if (this.f324439d.f43953i <= 3) {
            obj.getClass();
            java.util.Objects.toString(aVar);
            java.util.Objects.toString(this.f324440e);
            q7.j.a(this.f324452q);
        }
        this.f324460y = true;
        try {
            java.util.List list = this.f324447l;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.f.a(it.next());
                    throw null;
                }
            }
            this.f324448m.getClass();
            this.f324446k.c(obj, o7.b.f343226a);
        } finally {
            this.f324460y = false;
        }
    }

    public void k(w6.z0 z0Var, t6.a aVar) {
        this.f324436a.a();
        w6.z0 z0Var2 = null;
        try {
            synchronized (this.f324437b) {
                try {
                    this.f324451p = null;
                    if (z0Var == null) {
                        i(new w6.t0("Expected to receive a Resource<R> with an object of " + this.f324441f + " inside, but instead got null."), 5);
                        return;
                    }
                    java.lang.Object obj = z0Var.get();
                    if (obj != null && this.f324441f.isAssignableFrom(obj.getClass())) {
                        j(z0Var, obj, aVar);
                        return;
                    }
                    try {
                        this.f324450o = null;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Expected to receive an object of ");
                        sb6.append(this.f324441f);
                        sb6.append(" but instead got ");
                        sb6.append(obj != null ? obj.getClass() : "");
                        sb6.append("{");
                        sb6.append(obj);
                        sb6.append("} inside Resource{");
                        sb6.append(z0Var);
                        sb6.append("}.");
                        sb6.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        i(new w6.t0(sb6.toString()), 5);
                        this.f324453r.d(z0Var);
                    } catch (java.lang.Throwable th6) {
                        z0Var2 = z0Var;
                        th = th6;
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                }
            }
        } catch (java.lang.Throwable th8) {
            if (z0Var2 != null) {
                this.f324453r.d(z0Var2);
            }
            throw th8;
        }
    }

    public void l(int i17, int i18) {
        java.lang.Object obj;
        int i19 = i17;
        this.f324436a.a();
        java.lang.Object obj2 = this.f324437b;
        synchronized (obj2) {
            try {
                boolean z17 = A;
                if (z17) {
                    q7.j.a(this.f324452q);
                }
                if (this.f324454s == m7.g.WAITING_FOR_SIZE) {
                    m7.g gVar = m7.g.RUNNING;
                    this.f324454s = gVar;
                    float f17 = this.f324442g.f324410e;
                    if (i19 != Integer.MIN_VALUE) {
                        i19 = java.lang.Math.round(i19 * f17);
                    }
                    this.f324458w = i19;
                    this.f324459x = i18 == Integer.MIN_VALUE ? i18 : java.lang.Math.round(f17 * i18);
                    if (z17) {
                        q7.j.a(this.f324452q);
                    }
                    w6.g0 g0Var = this.f324453r;
                    com.bumptech.glide.f fVar = this.f324439d;
                    java.lang.Object obj3 = this.f324440e;
                    m7.a aVar = this.f324442g;
                    try {
                        obj = obj2;
                        try {
                            try {
                                this.f324451p = g0Var.a(fVar, obj3, aVar.f324420r, this.f324458w, this.f324459x, aVar.f324427y, this.f324441f, this.f324445j, aVar.f324411f, aVar.f324426x, aVar.f324421s, aVar.E, aVar.f324425w, aVar.f324417o, aVar.C, aVar.F, aVar.D, this, this.f324449n);
                                if (this.f324454s != gVar) {
                                    this.f324451p = null;
                                }
                                if (z17) {
                                    q7.j.a(this.f324452q);
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                while (true) {
                                    try {
                                        break;
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                    }
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                        }
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        obj = obj2;
                    }
                }
            } catch (java.lang.Throwable th10) {
                th = th10;
                obj = obj2;
            }
        }
    }
}
