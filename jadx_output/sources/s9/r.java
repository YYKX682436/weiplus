package s9;

/* loaded from: classes13.dex */
public final class r implements s9.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f404974a;

    /* renamed from: b, reason: collision with root package name */
    public final s9.j f404975b;

    /* renamed from: d, reason: collision with root package name */
    public final s9.o f404977d;

    /* renamed from: g, reason: collision with root package name */
    public s9.a f404980g;

    /* renamed from: f, reason: collision with root package name */
    public long f404979f = 0;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f404976c = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f404978e = new java.util.HashMap();

    public r(java.io.File file, s9.j jVar, s9.o oVar) {
        this.f404974a = file;
        this.f404975b = jVar;
        this.f404977d = oVar;
        android.os.ConditionVariable conditionVariable = new android.os.ConditionVariable();
        new s9.q(this, "SimpleCache.initialize()", conditionVariable).start();
        conditionVariable.block();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c3, code lost:
    
        if (r10 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bf, code lost:
    
        if (r10 == null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(s9.r r18) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.r.l(s9.r):void");
    }

    @Override // s9.c
    public synchronized java.util.NavigableSet a(java.lang.String str, s9.b bVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f404978e.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.f404978e.put(str, arrayList);
        }
        arrayList.add(bVar);
        return k(str);
    }

    @Override // s9.c
    public synchronized long b(java.lang.String str) {
        s9.n b17;
        b17 = this.f404977d.b(str);
        return b17 == null ? -1L : b17.f404961d;
    }

    @Override // s9.c
    public synchronized void c(s9.k kVar) {
        t9.a.d(kVar == this.f404976c.remove(kVar.f404951d));
        notifyAll();
    }

    @Override // s9.c
    public s9.k d(java.lang.String str, long j17) {
        s9.s i17;
        synchronized (this) {
            while (true) {
                i17 = i(str, j17);
                if (i17 == null) {
                    wait();
                }
            }
        }
        return i17;
    }

    @Override // s9.c
    public synchronized java.io.File e(java.lang.String str, long j17, long j18) {
        java.io.File file;
        s9.n nVar;
        t9.a.d(this.f404976c.containsKey(str));
        if (!this.f404974a.exists()) {
            p();
            this.f404974a.mkdirs();
        }
        s9.p pVar = (s9.p) this.f404975b;
        while (pVar.f404971e + j18 > 536870912) {
            java.util.TreeSet treeSet = pVar.f404970d;
            if (treeSet.isEmpty()) {
                break;
            }
            try {
                g((s9.k) treeSet.first());
            } catch (s9.a unused) {
            }
        }
        file = this.f404974a;
        s9.o oVar = this.f404977d;
        nVar = (s9.n) oVar.f404962a.get(str);
        if (nVar == null) {
            nVar = oVar.a(str, -1L);
        }
        return s9.s.d(file, nVar.f404958a, j17, java.lang.System.currentTimeMillis());
    }

    @Override // s9.c
    public synchronized void f(java.lang.String str, long j17) {
        s9.o oVar = this.f404977d;
        s9.n b17 = oVar.b(str);
        if (b17 == null) {
            oVar.a(str, j17);
        } else if (b17.f404961d != j17) {
            b17.f404961d = j17;
            oVar.f404968g = true;
        }
        this.f404977d.d();
    }

    @Override // s9.c
    public synchronized void g(s9.k kVar) {
        o(kVar, true);
    }

    @Override // s9.c
    public synchronized long h() {
        return this.f404979f;
    }

    @Override // s9.c
    public synchronized void j(java.io.File file) {
        s9.s b17 = s9.s.b(file, this.f404977d);
        boolean z17 = true;
        t9.a.d(b17 != null);
        t9.a.d(this.f404976c.containsKey(b17.f404951d));
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(b(b17.f404951d));
            if (valueOf.longValue() != -1) {
                if (b17.f404952e + b17.f404953f > valueOf.longValue()) {
                    z17 = false;
                }
                t9.a.d(z17);
            }
            m(b17);
            this.f404977d.d();
            notifyAll();
        }
    }

    @Override // s9.c
    public synchronized java.util.NavigableSet k(java.lang.String str) {
        s9.n b17;
        b17 = this.f404977d.b(str);
        return (b17 == null || b17.f404960c.isEmpty()) ? null : new java.util.TreeSet((java.util.Collection) b17.f404960c);
    }

    public final void m(s9.s sVar) {
        java.lang.String str = sVar.f404951d;
        s9.o oVar = this.f404977d;
        s9.n nVar = (s9.n) oVar.f404962a.get(str);
        if (nVar == null) {
            nVar = oVar.a(str, -1L);
        }
        nVar.f404960c.add(sVar);
        this.f404979f += sVar.f404953f;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f404978e.get(sVar.f404951d);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((s9.b) arrayList.get(size)).b(this, sVar);
                }
            }
        }
        ((s9.p) this.f404975b).b(this, sVar);
    }

    public final void n(s9.k kVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f404978e.get(kVar.f404951d);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s9.b) arrayList.get(size)).c(this, kVar);
            }
        }
        ((s9.p) this.f404975b).c(this, kVar);
    }

    public final void o(s9.k kVar, boolean z17) {
        boolean z18;
        java.lang.String str = kVar.f404951d;
        s9.o oVar = this.f404977d;
        s9.n b17 = oVar.b(str);
        if (b17 != null) {
            java.util.TreeSet treeSet = b17.f404960c;
            if (treeSet.remove(kVar)) {
                kVar.f404955h.delete();
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                this.f404979f -= kVar.f404953f;
                if (z17) {
                    try {
                        if (treeSet.isEmpty()) {
                            s9.n nVar = (s9.n) oVar.f404962a.remove(b17.f404959b);
                            if (nVar != null) {
                                t9.a.d(nVar.f404960c.isEmpty());
                                oVar.f404963b.remove(nVar.f404958a);
                                oVar.f404968g = true;
                            }
                            oVar.d();
                        }
                    } finally {
                        n(kVar);
                    }
                }
            }
        }
    }

    public final void p() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        s9.o oVar = this.f404977d;
        java.util.Iterator it = oVar.f404962a.values().iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((s9.n) it.next()).f404960c.iterator();
            while (it6.hasNext()) {
                s9.k kVar = (s9.k) it6.next();
                if (!kVar.f404955h.exists()) {
                    linkedList.add(kVar);
                }
            }
        }
        java.util.Iterator it7 = linkedList.iterator();
        while (it7.hasNext()) {
            o((s9.k) it7.next(), false);
        }
        oVar.c();
        oVar.d();
    }

    @Override // s9.c
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public synchronized s9.s i(java.lang.String str, long j17) {
        s9.s b17;
        s9.s sVar;
        s9.a aVar = this.f404980g;
        if (aVar != null) {
            throw aVar;
        }
        s9.n b18 = this.f404977d.b(str);
        if (b18 == null) {
            sVar = new s9.s(str, j17, -1L, -9223372036854775807L, null);
        } else {
            while (true) {
                b17 = b18.b(j17);
                if (!b17.f404954g || b17.f404955h.exists()) {
                    break;
                }
                p();
            }
            sVar = b17;
        }
        if (!sVar.f404954g) {
            if (this.f404976c.containsKey(str)) {
                return null;
            }
            this.f404976c.put(str, sVar);
            return sVar;
        }
        s9.s c17 = this.f404977d.b(str).c(sVar);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f404978e.get(sVar.f404951d);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((s9.b) arrayList.get(size)).a(this, sVar, c17);
            }
        }
        ((s9.p) this.f404975b).a(this, sVar, c17);
        return c17;
    }

    @Override // s9.c
    public synchronized long q0(java.lang.String str, long j17, long j18) {
        s9.n b17;
        b17 = this.f404977d.b(str);
        return b17 != null ? b17.a(j17, j18) : -j18;
    }
}
