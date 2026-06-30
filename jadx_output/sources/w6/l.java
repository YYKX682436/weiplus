package w6;

/* loaded from: classes13.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f443133a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f443134b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.f f443135c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f443136d;

    /* renamed from: e, reason: collision with root package name */
    public int f443137e;

    /* renamed from: f, reason: collision with root package name */
    public int f443138f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Class f443139g;

    /* renamed from: h, reason: collision with root package name */
    public w6.p f443140h;

    /* renamed from: i, reason: collision with root package name */
    public t6.l f443141i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.Map f443142j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Class f443143k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f443144l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f443145m;

    /* renamed from: n, reason: collision with root package name */
    public t6.h f443146n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.g f443147o;

    /* renamed from: p, reason: collision with root package name */
    public w6.z f443148p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f443149q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f443150r;

    public java.util.List a() {
        boolean z17 = this.f443145m;
        java.util.List list = this.f443134b;
        if (!z17) {
            this.f443145m = true;
            ((java.util.ArrayList) list).clear();
            java.util.ArrayList arrayList = (java.util.ArrayList) b();
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                a7.o0 o0Var = (a7.o0) arrayList.get(i17);
                if (!((java.util.ArrayList) list).contains(o0Var.f1846a)) {
                    ((java.util.ArrayList) list).add(o0Var.f1846a);
                }
                int i18 = 0;
                while (true) {
                    java.util.List list2 = o0Var.f1847b;
                    if (i18 < list2.size()) {
                        if (!((java.util.ArrayList) list).contains(list2.get(i18))) {
                            ((java.util.ArrayList) list).add(list2.get(i18));
                        }
                        i18++;
                    }
                }
            }
        }
        return list;
    }

    public java.util.List b() {
        boolean z17 = this.f443144l;
        java.util.List list = this.f443133a;
        if (!z17) {
            this.f443144l = true;
            ((java.util.ArrayList) list).clear();
            java.util.List e17 = this.f443135c.f43946b.e(this.f443136d);
            int size = e17.size();
            for (int i17 = 0; i17 < size; i17++) {
                a7.o0 b17 = ((a7.p0) e17.get(i17)).b(this.f443136d, this.f443137e, this.f443138f, this.f443141i);
                if (b17 != null) {
                    ((java.util.ArrayList) list).add(b17);
                }
            }
        }
        return list;
    }

    public w6.w0 c(java.lang.Class cls) {
        w6.w0 w0Var;
        java.util.ArrayList arrayList;
        i7.e eVar;
        com.bumptech.glide.m mVar = this.f443135c.f43946b;
        java.lang.Class cls2 = this.f443139g;
        java.lang.Class cls3 = this.f443143k;
        l7.d dVar = mVar.f43967i;
        q7.m mVar2 = (q7.m) dVar.f316783b.getAndSet(null);
        if (mVar2 == null) {
            mVar2 = new q7.m();
        }
        mVar2.f360306a = cls;
        mVar2.f360307b = cls2;
        mVar2.f360308c = cls3;
        synchronized (dVar.f316782a) {
            w0Var = (w6.w0) dVar.f316782a.getOrDefault(mVar2, null);
        }
        dVar.f316783b.set(mVar2);
        mVar.f43967i.getClass();
        if (l7.d.f316781c.equals(w0Var)) {
            return null;
        }
        if (w0Var != null) {
            return w0Var;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) mVar.f43961c.b(cls, cls2)).iterator();
        while (it.hasNext()) {
            java.lang.Class<?> cls4 = (java.lang.Class) it.next();
            java.util.Iterator it6 = ((java.util.ArrayList) mVar.f43964f.a(cls4, cls3)).iterator();
            while (it6.hasNext()) {
                java.lang.Class cls5 = (java.lang.Class) it6.next();
                l7.g gVar = mVar.f43961c;
                synchronized (gVar) {
                    arrayList = new java.util.ArrayList();
                    java.util.Iterator it7 = ((java.util.ArrayList) gVar.f316789a).iterator();
                    while (it7.hasNext()) {
                        java.util.List<l7.f> list = (java.util.List) ((java.util.HashMap) gVar.f316790b).get((java.lang.String) it7.next());
                        if (list != null) {
                            for (l7.f fVar : list) {
                                if (fVar.f316786a.isAssignableFrom(cls) && cls4.isAssignableFrom(fVar.f316787b)) {
                                    arrayList.add(fVar.f316788c);
                                }
                            }
                        }
                    }
                }
                i7.g gVar2 = mVar.f43964f;
                synchronized (gVar2) {
                    if (!cls5.isAssignableFrom(cls4)) {
                        java.util.Iterator it8 = ((java.util.ArrayList) gVar2.f289397a).iterator();
                        while (it8.hasNext()) {
                            i7.f fVar2 = (i7.f) it8.next();
                            if (fVar2.f289394a.isAssignableFrom(cls4) && cls5.isAssignableFrom(fVar2.f289395b)) {
                                eVar = fVar2.f289396c;
                            }
                        }
                        throw new java.lang.IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                    }
                    eVar = i7.h.f289398a;
                }
                arrayList2.add(new w6.v(cls, cls4, cls5, arrayList, eVar, mVar.f43968j));
            }
        }
        w6.w0 w0Var2 = arrayList2.isEmpty() ? null : new w6.w0(cls, cls2, cls3, arrayList2, mVar.f43968j);
        l7.d dVar2 = mVar.f43967i;
        synchronized (dVar2.f316782a) {
            dVar2.f316782a.put(new q7.m(cls, cls2, cls3), w0Var2 != null ? w0Var2 : l7.d.f316781c);
        }
        return w0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = r3.f316778b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t6.d d(java.lang.Object r6) {
        /*
            r5 = this;
            com.bumptech.glide.f r0 = r5.f443135c
            com.bumptech.glide.m r0 = r0.f43946b
            l7.b r0 = r0.f43960b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.List r2 = r0.f316779a     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3a
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3a
            l7.a r3 = (l7.a) r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Class r4 = r3.f316777a     // Catch: java.lang.Throwable -> L3a
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L13
            t6.d r1 = r3.f316778b     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)
            goto L2d
        L2b:
            monitor-exit(r0)
            r1 = 0
        L2d:
            if (r1 == 0) goto L30
            return r1
        L30:
            com.bumptech.glide.l r0 = new com.bumptech.glide.l
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L3a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.l.d(java.lang.Object):t6.d");
    }

    public t6.p e(java.lang.Class cls) {
        t6.p pVar = (t6.p) this.f443142j.get(cls);
        if (pVar == null) {
            java.util.Iterator it = this.f443142j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (((java.lang.Class) entry.getKey()).isAssignableFrom(cls)) {
                    pVar = (t6.p) entry.getValue();
                    break;
                }
            }
        }
        if (pVar != null) {
            return pVar;
        }
        if (!this.f443142j.isEmpty() || !this.f443149q) {
            return (c7.e) c7.e.f39518b;
        }
        throw new java.lang.IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
