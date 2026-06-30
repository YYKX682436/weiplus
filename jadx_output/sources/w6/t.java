package w6;

/* loaded from: classes13.dex */
public class t implements w6.j, java.lang.Runnable, java.lang.Comparable, r7.f {
    public boolean A;
    public java.lang.Object B;
    public java.lang.Thread C;
    public t6.h D;
    public t6.h E;
    public java.lang.Object F;
    public t6.a G;
    public u6.e H;
    public volatile w6.k I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f443209J;
    public volatile boolean K;

    /* renamed from: g, reason: collision with root package name */
    public final w6.p f443213g;

    /* renamed from: h, reason: collision with root package name */
    public final m3.e f443214h;

    /* renamed from: n, reason: collision with root package name */
    public com.bumptech.glide.f f443217n;

    /* renamed from: o, reason: collision with root package name */
    public t6.h f443218o;

    /* renamed from: p, reason: collision with root package name */
    public com.bumptech.glide.g f443219p;

    /* renamed from: q, reason: collision with root package name */
    public w6.o0 f443220q;

    /* renamed from: r, reason: collision with root package name */
    public int f443221r;

    /* renamed from: s, reason: collision with root package name */
    public int f443222s;

    /* renamed from: t, reason: collision with root package name */
    public w6.z f443223t;

    /* renamed from: u, reason: collision with root package name */
    public t6.l f443224u;

    /* renamed from: v, reason: collision with root package name */
    public w6.m f443225v;

    /* renamed from: w, reason: collision with root package name */
    public int f443226w;

    /* renamed from: x, reason: collision with root package name */
    public w6.s f443227x;

    /* renamed from: y, reason: collision with root package name */
    public w6.r f443228y;

    /* renamed from: z, reason: collision with root package name */
    public long f443229z;

    /* renamed from: d, reason: collision with root package name */
    public final w6.l f443210d = new w6.l();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f443211e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final r7.k f443212f = new r7.j();

    /* renamed from: i, reason: collision with root package name */
    public final w6.o f443215i = new w6.o();

    /* renamed from: m, reason: collision with root package name */
    public final w6.q f443216m = new w6.q();

    public t(w6.p pVar, m3.e eVar) {
        this.f443213g = pVar;
        this.f443214h = eVar;
    }

    public final w6.z0 a(u6.e eVar, java.lang.Object obj, t6.a aVar) {
        if (obj == null) {
            eVar.h();
            return null;
        }
        try {
            int i17 = q7.j.f360301b;
            long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            w6.z0 d17 = d(obj, aVar);
            if (android.util.Log.isLoggable("DecodeJob", 2)) {
                d17.toString();
                q7.j.a(elapsedRealtimeNanos);
                java.util.Objects.toString(this.f443220q);
                java.lang.Thread.currentThread().getName();
            }
            return d17;
        } finally {
            eVar.h();
        }
    }

    @Override // w6.j
    public void b(t6.h hVar, java.lang.Object obj, u6.e eVar, t6.a aVar, t6.h hVar2) {
        this.D = hVar;
        this.F = obj;
        this.H = eVar;
        this.G = aVar;
        this.E = hVar2;
        if (java.lang.Thread.currentThread() == this.C) {
            k();
            return;
        }
        this.f443228y = w6.r.DECODE_DATA;
        w6.m0 m0Var = (w6.m0) this.f443225v;
        (m0Var.f443165t ? m0Var.f443160o : m0Var.f443166u ? m0Var.f443161p : m0Var.f443159n).execute(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        w6.t tVar = (w6.t) obj;
        int ordinal = this.f443219p.ordinal() - tVar.f443219p.ordinal();
        return ordinal == 0 ? this.f443226w - tVar.f443226w : ordinal;
    }

    public final w6.z0 d(java.lang.Object obj, t6.a aVar) {
        u6.g b17;
        w6.w0 c17 = this.f443210d.c(obj.getClass());
        t6.l lVar = this.f443224u;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            boolean z17 = aVar == t6.a.RESOURCE_DISK_CACHE || this.f443210d.f443150r;
            t6.k kVar = d7.y.f226854i;
            java.lang.Boolean bool = (java.lang.Boolean) lVar.c(kVar);
            if (bool == null || (bool.booleanValue() && !z17)) {
                lVar = new t6.l();
                lVar.f415973b.i(this.f443224u.f415973b);
                lVar.f415973b.put(kVar, java.lang.Boolean.valueOf(z17));
            }
        }
        t6.l lVar2 = lVar;
        u6.j jVar = this.f443217n.f43946b.f43963e;
        synchronized (jVar) {
            u6.f fVar = (u6.f) ((java.util.HashMap) jVar.f424849a).get(obj.getClass());
            if (fVar == null) {
                java.util.Iterator it = ((java.util.HashMap) jVar.f424849a).values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    u6.f fVar2 = (u6.f) it.next();
                    if (fVar2.a().isAssignableFrom(obj.getClass())) {
                        fVar = fVar2;
                        break;
                    }
                }
            }
            if (fVar == null) {
                fVar = u6.j.f424848b;
            }
            b17 = fVar.b(obj);
        }
        try {
            return c17.a(b17, lVar2, this.f443221r, this.f443222s, new w6.n(this, aVar));
        } finally {
            b17.h();
        }
    }

    @Override // r7.f
    public r7.k h() {
        return this.f443212f;
    }

    @Override // w6.j
    public void i() {
        this.f443228y = w6.r.SWITCH_TO_SOURCE_SERVICE;
        w6.m0 m0Var = (w6.m0) this.f443225v;
        (m0Var.f443165t ? m0Var.f443160o : m0Var.f443166u ? m0Var.f443161p : m0Var.f443159n).execute(this);
    }

    @Override // w6.j
    public void j(t6.h hVar, java.lang.Exception exc, u6.e eVar, t6.a aVar) {
        eVar.h();
        w6.t0 t0Var = new w6.t0("Fetching data failed", java.util.Collections.singletonList(exc));
        java.lang.Class a17 = eVar.a();
        t0Var.f443232e = hVar;
        t0Var.f443233f = aVar;
        t0Var.f443234g = a17;
        ((java.util.ArrayList) this.f443211e).add(t0Var);
        if (java.lang.Thread.currentThread() == this.C) {
            p();
            return;
        }
        this.f443228y = w6.r.SWITCH_TO_SOURCE_SERVICE;
        w6.m0 m0Var = (w6.m0) this.f443225v;
        (m0Var.f443165t ? m0Var.f443160o : m0Var.f443166u ? m0Var.f443161p : m0Var.f443159n).execute(this);
    }

    public final void k() {
        w6.z0 z0Var;
        boolean a17;
        if (android.util.Log.isLoggable("DecodeJob", 2)) {
            long j17 = this.f443229z;
            java.lang.String str = "data: " + this.F + ", cache key: " + this.D + ", fetcher: " + this.H;
            q7.j.a(j17);
            java.util.Objects.toString(this.f443220q);
            if (str != null) {
                ", ".concat(str);
            }
            java.lang.Thread.currentThread().getName();
        }
        w6.y0 y0Var = null;
        try {
            z0Var = a(this.H, this.F, this.G);
        } catch (w6.t0 e17) {
            t6.h hVar = this.E;
            t6.a aVar = this.G;
            e17.f443232e = hVar;
            e17.f443233f = aVar;
            e17.f443234g = null;
            ((java.util.ArrayList) this.f443211e).add(e17);
            z0Var = null;
        }
        if (z0Var == null) {
            p();
            return;
        }
        t6.a aVar2 = this.G;
        if (z0Var instanceof w6.u0) {
            ((w6.u0) z0Var).initialize();
        }
        if (this.f443215i.f443176c != null) {
            y0Var = (w6.y0) ((r7.e) w6.y0.f443246h).a();
            q7.n.b(y0Var);
            y0Var.f443250g = false;
            y0Var.f443249f = true;
            y0Var.f443248e = z0Var;
            z0Var = y0Var;
        }
        s();
        w6.m0 m0Var = (w6.m0) this.f443225v;
        synchronized (m0Var) {
            m0Var.f443168w = z0Var;
            m0Var.f443169x = aVar2;
        }
        synchronized (m0Var) {
            m0Var.f443153e.a();
            if (m0Var.D) {
                m0Var.f443168w.recycle();
                m0Var.f();
            } else {
                if (m0Var.f443152d.f443151d.isEmpty()) {
                    throw new java.lang.IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (m0Var.f443170y) {
                    throw new java.lang.IllegalStateException("Already have resource");
                }
                w6.j0 j0Var = m0Var.f443156h;
                w6.z0 z0Var2 = m0Var.f443168w;
                boolean z17 = m0Var.f443164s;
                t6.h hVar2 = m0Var.f443163r;
                w6.q0 q0Var = m0Var.f443154f;
                j0Var.getClass();
                m0Var.B = new w6.r0(z0Var2, z17, true, hVar2, q0Var);
                m0Var.f443170y = true;
                w6.l0 l0Var = m0Var.f443152d;
                l0Var.getClass();
                java.util.ArrayList<w6.k0> arrayList = new java.util.ArrayList(l0Var.f443151d);
                m0Var.d(arrayList.size() + 1);
                t6.h hVar3 = m0Var.f443163r;
                w6.r0 r0Var = m0Var.B;
                w6.g0 g0Var = (w6.g0) m0Var.f443157i;
                synchronized (g0Var) {
                    if (r0Var != null) {
                        if (r0Var.f443193d) {
                            g0Var.f443121g.a(hVar3, r0Var);
                        }
                    }
                    w6.v0 v0Var = g0Var.f443115a;
                    v0Var.getClass();
                    java.util.Map map = m0Var.f443167v ? v0Var.f443242b : v0Var.f443241a;
                    if (m0Var.equals(map.get(hVar3))) {
                        map.remove(hVar3);
                    }
                }
                for (w6.k0 k0Var : arrayList) {
                    k0Var.f443132b.execute(new w6.i0(m0Var, k0Var.f443131a));
                }
                m0Var.c();
            }
        }
        this.f443227x = w6.s.ENCODE;
        try {
            w6.o oVar = this.f443215i;
            if (oVar.f443176c != null) {
                w6.p pVar = this.f443213g;
                t6.l lVar = this.f443224u;
                oVar.getClass();
                try {
                    ((w6.e0) pVar).a().b(oVar.f443174a, new w6.i(oVar.f443175b, oVar.f443176c, lVar));
                    oVar.f443176c.b();
                } catch (java.lang.Throwable th6) {
                    oVar.f443176c.b();
                    throw th6;
                }
            }
            w6.q qVar = this.f443216m;
            synchronized (qVar) {
                qVar.f443187b = true;
                a17 = qVar.a(false);
            }
            if (a17) {
                o();
            }
        } finally {
            if (y0Var != null) {
                y0Var.b();
            }
        }
    }

    public final w6.k l() {
        int ordinal = this.f443227x.ordinal();
        w6.l lVar = this.f443210d;
        if (ordinal == 1) {
            return new w6.a1(lVar, this);
        }
        if (ordinal == 2) {
            return new w6.g(lVar.a(), lVar, this);
        }
        if (ordinal == 3) {
            return new w6.e1(lVar, this);
        }
        if (ordinal == 5) {
            return null;
        }
        throw new java.lang.IllegalStateException("Unrecognized stage: " + this.f443227x);
    }

    public final w6.s m(w6.s sVar) {
        int ordinal = sVar.ordinal();
        if (ordinal == 0) {
            boolean b17 = this.f443223t.b();
            w6.s sVar2 = w6.s.RESOURCE_CACHE;
            return b17 ? sVar2 : m(sVar2);
        }
        if (ordinal == 1) {
            boolean a17 = this.f443223t.a();
            w6.s sVar3 = w6.s.DATA_CACHE;
            return a17 ? sVar3 : m(sVar3);
        }
        w6.s sVar4 = w6.s.FINISHED;
        if (ordinal == 2) {
            return this.A ? sVar4 : w6.s.SOURCE;
        }
        if (ordinal == 3 || ordinal == 5) {
            return sVar4;
        }
        throw new java.lang.IllegalArgumentException("Unrecognized stage: " + sVar);
    }

    public final void n() {
        boolean a17;
        s();
        w6.t0 t0Var = new w6.t0("Failed to load resource", new java.util.ArrayList(this.f443211e));
        w6.m0 m0Var = (w6.m0) this.f443225v;
        synchronized (m0Var) {
            m0Var.f443171z = t0Var;
        }
        synchronized (m0Var) {
            m0Var.f443153e.a();
            if (m0Var.D) {
                m0Var.f();
            } else {
                if (m0Var.f443152d.f443151d.isEmpty()) {
                    throw new java.lang.IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (m0Var.A) {
                    throw new java.lang.IllegalStateException("Already failed once");
                }
                m0Var.A = true;
                t6.h hVar = m0Var.f443163r;
                w6.l0 l0Var = m0Var.f443152d;
                l0Var.getClass();
                java.util.ArrayList<w6.k0> arrayList = new java.util.ArrayList(l0Var.f443151d);
                m0Var.d(arrayList.size() + 1);
                w6.g0 g0Var = (w6.g0) m0Var.f443157i;
                synchronized (g0Var) {
                    w6.v0 v0Var = g0Var.f443115a;
                    v0Var.getClass();
                    java.util.Map map = m0Var.f443167v ? v0Var.f443242b : v0Var.f443241a;
                    if (m0Var.equals(map.get(hVar))) {
                        map.remove(hVar);
                    }
                }
                for (w6.k0 k0Var : arrayList) {
                    k0Var.f443132b.execute(new w6.h0(m0Var, k0Var.f443131a));
                }
                m0Var.c();
            }
        }
        w6.q qVar = this.f443216m;
        synchronized (qVar) {
            qVar.f443188c = true;
            a17 = qVar.a(false);
        }
        if (a17) {
            o();
        }
    }

    public final void o() {
        w6.q qVar = this.f443216m;
        synchronized (qVar) {
            qVar.f443187b = false;
            qVar.f443186a = false;
            qVar.f443188c = false;
        }
        w6.o oVar = this.f443215i;
        oVar.f443174a = null;
        oVar.f443175b = null;
        oVar.f443176c = null;
        w6.l lVar = this.f443210d;
        lVar.f443135c = null;
        lVar.f443136d = null;
        lVar.f443146n = null;
        lVar.f443139g = null;
        lVar.f443143k = null;
        lVar.f443141i = null;
        lVar.f443147o = null;
        lVar.f443142j = null;
        lVar.f443148p = null;
        ((java.util.ArrayList) lVar.f443133a).clear();
        lVar.f443144l = false;
        ((java.util.ArrayList) lVar.f443134b).clear();
        lVar.f443145m = false;
        this.f443209J = false;
        this.f443217n = null;
        this.f443218o = null;
        this.f443224u = null;
        this.f443219p = null;
        this.f443220q = null;
        this.f443225v = null;
        this.f443227x = null;
        this.I = null;
        this.C = null;
        this.D = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.f443229z = 0L;
        this.K = false;
        this.B = null;
        ((java.util.ArrayList) this.f443211e).clear();
        this.f443214h.b(this);
    }

    public final void p() {
        this.C = java.lang.Thread.currentThread();
        int i17 = q7.j.f360301b;
        this.f443229z = android.os.SystemClock.elapsedRealtimeNanos();
        boolean z17 = false;
        while (!this.K && this.I != null && !(z17 = this.I.a())) {
            this.f443227x = m(this.f443227x);
            this.I = l();
            if (this.f443227x == w6.s.SOURCE) {
                i();
                return;
            }
        }
        if ((this.f443227x == w6.s.FINISHED || this.K) && !z17) {
            n();
        }
    }

    public final void r() {
        int ordinal = this.f443228y.ordinal();
        if (ordinal == 0) {
            this.f443227x = m(w6.s.INITIALIZE);
            this.I = l();
            p();
        } else if (ordinal == 1) {
            p();
        } else if (ordinal == 2) {
            k();
        } else {
            throw new java.lang.IllegalStateException("Unrecognized run reason: " + this.f443228y);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        u6.e eVar = this.H;
        try {
            try {
                if (this.K) {
                    n();
                } else {
                    r();
                    if (eVar != null) {
                        eVar.h();
                    }
                }
            } finally {
                if (eVar != null) {
                    eVar.h();
                }
            }
        } catch (w6.f e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            if (android.util.Log.isLoggable("DecodeJob", 3)) {
                java.util.Objects.toString(this.f443227x);
            }
            if (this.f443227x != w6.s.ENCODE) {
                ((java.util.ArrayList) this.f443211e).add(th6);
                n();
            }
            if (!this.K) {
                throw th6;
            }
            throw th6;
        }
    }

    public final void s() {
        java.lang.Throwable th6;
        this.f443212f.a();
        if (!this.f443209J) {
            this.f443209J = true;
            return;
        }
        if (((java.util.ArrayList) this.f443211e).isEmpty()) {
            th6 = null;
        } else {
            java.util.List list = this.f443211e;
            th6 = (java.lang.Throwable) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1);
        }
        throw new java.lang.IllegalStateException("Already notified", th6);
    }
}
