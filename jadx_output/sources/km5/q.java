package km5;

/* loaded from: classes16.dex */
public class q implements km5.d {

    /* renamed from: g, reason: collision with root package name */
    public volatile lm5.d f309348g;

    /* renamed from: h, reason: collision with root package name */
    public volatile lm5.d f309349h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f309350i;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.Object f309351m;

    /* renamed from: n, reason: collision with root package name */
    public volatile java.lang.Object f309352n;

    /* renamed from: o, reason: collision with root package name */
    public km5.m f309353o;

    /* renamed from: s, reason: collision with root package name */
    public lm5.d f309357s;

    /* renamed from: t, reason: collision with root package name */
    public final lm5.h f309358t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f309359u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f309360v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f309361w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f309362x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Object f309363y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Object f309364z;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f309345d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile km5.p f309346e = km5.p.Idle;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Queue f309347f = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public long f309354p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f309355q = false;

    /* renamed from: r, reason: collision with root package name */
    public final km5.b f309356r = new km5.n(this);

    public q() {
        km5.h hVar = new km5.h(this);
        this.f309361w = false;
        this.f309362x = false;
        this.f309349h = lm5.i.a();
        this.f309348g = this.f309349h;
        this.f309358t = new lm5.h(this.f309349h, hVar);
    }

    public final synchronized void A(java.lang.Object obj) {
        this.f309351m = obj;
        this.f309350i = true;
        if (obj != null) {
            java.lang.String.valueOf(obj.hashCode());
        }
        jm5.a aVar = jm5.b.f300456a;
    }

    public synchronized km5.g B() {
        this.f309345d = true;
        return this;
    }

    public final void C(android.util.Pair pair, java.lang.Object obj) {
        new lm5.h((lm5.d) pair.second, null).a(new km5.k(this, pair, obj, new java.lang.RuntimeException("object is not right: " + obj)), null, this.f309355q);
    }

    @Override // km5.g
    public synchronized km5.g a(km5.f fVar) {
        v(fVar, this.f309349h);
        return this;
    }

    @Override // km5.g
    public synchronized km5.g b(lm5.d dVar, km5.f fVar) {
        v(fVar, dVar);
        return this;
    }

    public km5.d c(java.lang.String str) {
        if (str == null) {
            iz5.a.d("schedulerTypeString should not be null!", str);
            return this;
        }
        this.f309348g = lm5.i.d(str);
        iz5.a.d("mCurrentScheduler should not be null!", this.f309348g);
        return this;
    }

    public final void d() {
        km5.p pVar = this.f309346e;
        km5.p pVar2 = km5.p.Resolved;
        if (pVar != pVar2) {
            return;
        }
        this.f309346e = km5.p.Invoking;
        km5.m mVar = (km5.m) ((java.util.LinkedList) this.f309347f).peek();
        if (mVar == null) {
            if (!this.f309345d) {
                this.f309346e = pVar2;
                return;
            }
            this.f309346e = km5.p.AllDone;
            this.f309363y = w();
            this.f309361w = true;
            java.util.List list = this.f309360v;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    C((android.util.Pair) it.next(), this.f309363y);
                }
                return;
            }
            return;
        }
        gm5.a aVar = mVar.f309333a;
        lm5.d dVar = mVar.f309334b;
        long j17 = mVar.f309335c;
        boolean z17 = mVar.f309336d;
        if (this.f309346e == km5.p.Pausing) {
            jm5.b.b("Vending.Pipeline", "This pipeline is Pausing. We will stop dequeueFunctionAndInvoke and waiting resume() call", new java.lang.Object[0]);
            return;
        }
        this.f309353o = (km5.m) ((java.util.LinkedList) this.f309347f).poll();
        lm5.h hVar = this.f309358t;
        synchronized (hVar) {
            hVar.f319607a = dVar;
        }
        java.lang.Object w17 = w();
        if (j17 < 0) {
            this.f309358t.a(aVar, w17, z17);
            return;
        }
        lm5.d a17 = lm5.i.a();
        this.f309357s = a17;
        a17.b(new km5.l(this, aVar, w17, z17), j17);
    }

    public void dead() {
        j(true);
    }

    @Override // km5.d
    public km5.d f(im5.b bVar) {
        iz5.a.d("keeper should not be null!", bVar);
        bVar.keep(this);
        return this;
    }

    @Override // km5.d
    public synchronized km5.d g(boolean z17) {
        this.f309355q = z17;
        return this;
    }

    @Override // km5.d
    public km5.d h(gm5.a aVar) {
        return c("Vending.UI").n(aVar);
    }

    @Override // km5.d
    public km5.d i(gm5.a aVar) {
        return c("Vending.HEAVY_WORK").n(aVar);
    }

    public final synchronized void j(boolean z17) {
        km5.p pVar = this.f309346e;
        km5.p pVar2 = km5.p.Interrupted;
        if (pVar != pVar2 && this.f309346e != km5.p.AllDone) {
            if (z17 && ((java.util.LinkedList) this.f309347f).size() > 0) {
                jm5.b.c("Vending.Pipeline", "Pipe is not finish and be interrupt! %s pipes did not run", java.lang.Integer.valueOf(((java.util.LinkedList) this.f309347f).size()));
            }
            this.f309346e = pVar2;
            ((java.util.LinkedList) this.f309347f).clear();
            A(null);
            lm5.d dVar = this.f309357s;
            if (dVar != null) {
                dVar.c();
            }
        }
    }

    public final void k(android.util.Pair pair, java.lang.Object obj) {
        lm5.d dVar = (lm5.d) pair.second;
        km5.j jVar = new km5.j(this, pair, obj);
        if (dVar == null) {
            jm5.b.a("Vending.Pipeline", "Default scheduler %s is not available!!!", this.f309349h);
        } else {
            dVar.a(jVar);
        }
    }

    public synchronized km5.d l(long j17) {
        this.f309354p = j17;
        return this;
    }

    @Override // km5.d
    public km5.d m(lm5.d dVar) {
        if (dVar == null) {
            iz5.a.d("scheduler should not be null!", dVar);
            return this;
        }
        this.f309348g = dVar;
        return this;
    }

    @Override // km5.d
    public synchronized km5.d n(gm5.a aVar) {
        p(aVar, this.f309355q);
        return this;
    }

    public final km5.d p(gm5.a aVar, boolean z17) {
        if (this.f309345d) {
            throw new km5.o("This Pipeline(%s) has terminate and do not allow any next().", this);
        }
        ((java.util.LinkedList) this.f309347f).add(new km5.m(aVar, this.f309348g, this.f309354p, z17));
        this.f309354p = -1L;
        if (this.f309346e == km5.p.Idle || this.f309346e != km5.p.Resolved) {
            return this;
        }
        d();
        return this;
    }

    @Override // km5.d
    public km5.d q(gm5.a aVar) {
        return c("Vending.LOGIC").n(aVar);
    }

    public synchronized km5.g s(km5.e eVar) {
        u(eVar, this.f309349h);
        return this;
    }

    public synchronized km5.g t(lm5.d dVar, km5.e eVar) {
        u(eVar, dVar);
        return this;
    }

    public final void u(km5.e eVar, lm5.d dVar) {
        this.f309345d = true;
        if (this.f309359u == null) {
            this.f309359u = new java.util.LinkedList();
        }
        android.util.Pair pair = new android.util.Pair(eVar, dVar);
        if (this.f309362x) {
            k(pair, this.f309364z);
        } else {
            this.f309359u.add(pair);
        }
    }

    public final void v(km5.f fVar, lm5.d dVar) {
        this.f309345d = true;
        d();
        if (this.f309360v == null) {
            this.f309360v = new java.util.LinkedList();
        }
        android.util.Pair pair = new android.util.Pair(fVar, dVar);
        if (this.f309361w) {
            C(pair, this.f309363y);
        } else {
            this.f309360v.add(pair);
        }
    }

    public final synchronized java.lang.Object w() {
        java.lang.Object obj;
        obj = this.f309351m;
        this.f309352n = this.f309351m;
        this.f309351m = null;
        this.f309350i = false;
        if (obj != null) {
            java.lang.String.valueOf(obj.hashCode());
        }
        jm5.a aVar = jm5.b.f300456a;
        return obj;
    }

    public synchronized km5.d x(km5.c cVar) {
        z(new java.lang.Object[0]);
        p(new km5.i(this, cVar), true);
        return this;
    }

    public synchronized km5.d y(java.lang.Object... objArr) {
        z(objArr);
        return this;
    }

    public final km5.d z(java.lang.Object... objArr) {
        java.lang.Object obj;
        if (this.f309346e != km5.p.Idle) {
            return this;
        }
        this.f309346e = km5.p.Resolved;
        if (objArr.length == 0) {
            obj = null;
        } else if (objArr.length == 1) {
            obj = objArr[0];
        } else {
            nm5.k kVar = new nm5.k();
            kVar.f338513a = objArr;
            obj = kVar;
        }
        A(obj);
        d();
        return this;
    }
}
