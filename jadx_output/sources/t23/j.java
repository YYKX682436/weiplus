package t23;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final t23.o0 f415186a = new t23.o0();

    /* renamed from: b, reason: collision with root package name */
    public int f415187b = t23.y0.f415299k;

    /* renamed from: c, reason: collision with root package name */
    public final t23.f1 f415188c = new t23.f1();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f415189d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f415190e = t23.y0.f415299k / 2;

    /* renamed from: f, reason: collision with root package name */
    public final t23.f1 f415191f = new t23.f1();

    /* renamed from: g, reason: collision with root package name */
    public final t23.f1 f415192g = new t23.f1();

    public void a(t23.n0 n0Var) {
        t23.o0 o0Var = this.f415186a;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = o0Var.f415213d;
        int size = copyOnWriteArrayList.size();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = o0Var.f415214e;
        if (size > 256) {
            copyOnWriteArrayList.size();
            for (int i17 = 0; i17 < 128; i17++) {
                java.lang.String str = (java.lang.String) copyOnWriteArrayList.get(i17);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    concurrentHashMap.remove(str);
                }
            }
            copyOnWriteArrayList.subList(0, 128).clear();
            copyOnWriteArrayList.size();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(n0Var.a())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GalleryCache", "error! fileKey is invalid!!!");
            return;
        }
        if (!concurrentHashMap.containsKey(n0Var.a())) {
            copyOnWriteArrayList.add(n0Var.a());
            concurrentHashMap.put(n0Var.a(), n0Var);
        } else {
            copyOnWriteArrayList.remove(n0Var.a());
            copyOnWriteArrayList.add(n0Var.a());
            concurrentHashMap.put(n0Var.a(), n0Var);
        }
    }

    public void b() {
        java.util.Iterator<E> it = this.f415192g.iterator();
        while (it.hasNext()) {
            t23.h hVar = (t23.h) it.next();
            if (hVar != null) {
                hVar.f415162h = true;
            }
        }
        this.f415192g.clear();
        this.f415191f.clear();
    }

    public void c() {
        java.util.HashMap hashMap = this.f415189d;
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        java.util.Iterator it = this.f415189d.entrySet().iterator();
        while (it.hasNext()) {
            t23.i iVar = (t23.i) ((java.util.Map.Entry) it.next()).getValue();
            if (iVar != null) {
                iVar.f415181o = true;
            }
        }
        t23.f1 f1Var = this.f415188c;
        if (f1Var != null) {
            f1Var.clear();
        }
        java.util.HashMap hashMap2 = this.f415189d;
        if (hashMap2 != null && !hashMap2.isEmpty()) {
            hashMap2.clear();
        }
        t23.o0 o0Var = this.f415186a;
        o0Var.f415213d.clear();
        o0Var.f415214e.clear();
    }

    public void d(java.util.List list) {
        boolean contains;
        java.util.HashMap hashMap = this.f415189d;
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : this.f415189d.entrySet()) {
            if (!list.contains(entry.getKey())) {
                t23.i iVar = (t23.i) entry.getValue();
                if (iVar != null) {
                    iVar.f415181o = true;
                }
                entry.getKey();
                arrayList.add((java.lang.String) entry.getKey());
            }
        }
        arrayList.size();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            t23.f1 f1Var = this.f415188c;
            synchronized (f1Var.f415146d) {
                synchronized (f1Var.f415146d) {
                    contains = f1Var.contains(str);
                }
                if (contains) {
                    f1Var.remove(str);
                }
            }
            this.f415189d.remove(str);
        }
    }

    public android.graphics.Bitmap e(java.lang.String str, int i17, java.lang.String str2, long j17, long j18) {
        return f(str, i17, str2, j17, null, -1, j18);
    }

    public android.graphics.Bitmap f(java.lang.String str, int i17, java.lang.String str2, long j17, t23.j2 j2Var, int i18, long j18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CacheService", "file path is invalid.");
            return null;
        }
        java.lang.String d17 = j33.d0.d(str, j2Var, i18);
        android.graphics.Bitmap a17 = this.f415186a.a(j33.d0.c(str, j2Var, j18));
        if (a17 != null) {
            return a17;
        }
        java.util.HashMap hashMap = this.f415189d;
        hashMap.size();
        if (hashMap.containsKey(d17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CacheService", "%s has already getting bitmap from file, %s.", d17, str);
            return null;
        }
        t23.f1 f1Var = this.f415188c;
        f1Var.add(d17);
        hashMap.put(d17, new t23.i(this, str, i17, str2, j17, j2Var, i18, j18));
        f1Var.size();
        hashMap.size();
        i();
        return null;
    }

    public android.graphics.Bitmap g(java.lang.String str, java.lang.String str2, long j17, t23.j2 j2Var, long j18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = str2;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CacheService", "file path is null or nil.");
            return null;
        }
        android.graphics.Bitmap a17 = this.f415186a.a(j33.d0.c(str, j2Var, j18));
        if (a17 != null) {
            return a17;
        }
        return null;
    }

    public void h(t23.n0 n0Var) {
        t23.o0 o0Var = this.f415186a;
        if (n0Var == null) {
            o0Var.f415213d.clear();
            o0Var.f415214e.clear();
            l75.v0 v0Var = o0Var.f415212c;
            synchronized (v0Var) {
                v0Var.f316971b.clear();
            }
            return;
        }
        o0Var.getClass();
        java.lang.String a17 = n0Var.a();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = o0Var.f415214e;
        if (concurrentHashMap.containsKey(n0Var.a())) {
            concurrentHashMap.remove(a17);
            o0Var.f415213d.remove(a17);
        }
    }

    public final void i() {
        t23.i iVar;
        t23.y0 n17 = t23.p0.n();
        t23.f1 f1Var = this.f415188c;
        java.util.HashMap hashMap = this.f415189d;
        n17.getClass();
        if (f1Var == null || hashMap == null || n17.f415306g == null) {
            return;
        }
        while (true) {
            if (!(t23.p0.h().f415187b > 0) || f1Var.isEmpty()) {
                return;
            }
            java.lang.String str = (java.lang.String) f1Var.d();
            if (hashMap.containsKey(str) && (iVar = (t23.i) hashMap.get(str)) != null && !iVar.f415181o) {
                t23.j h17 = t23.p0.h();
                h17.f415187b--;
                ((ku5.f) n17.f415306g).execute(new t23.v0(n17, iVar, str));
            }
        }
    }

    public void j() {
        this.f415191f.size();
        this.f415192g.size();
        t23.y0 n17 = t23.p0.n();
        t23.f1 f1Var = this.f415191f;
        t23.f1 f1Var2 = this.f415192g;
        n17.getClass();
        if (f1Var == null || f1Var2 == null || n17.f415307h == null) {
            return;
        }
        while (true) {
            if (!(t23.p0.h().f415190e > 0) || f1Var.isEmpty()) {
                return;
            }
            t23.h hVar = (t23.h) f1Var.d();
            if (hVar != null && !hVar.f415162h) {
                f1Var2.add(hVar);
                t23.j h17 = t23.p0.h();
                h17.f415190e--;
                ((ku5.f) n17.f415307h).execute(new t23.x0(n17, hVar));
            }
        }
    }
}
