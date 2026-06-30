package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f192946a;

    /* renamed from: b, reason: collision with root package name */
    public int f192947b;

    /* renamed from: c, reason: collision with root package name */
    public int f192948c;

    /* renamed from: d, reason: collision with root package name */
    public int f192949d;

    /* renamed from: e, reason: collision with root package name */
    public int f192950e;

    /* renamed from: f, reason: collision with root package name */
    public int f192951f;

    /* renamed from: g, reason: collision with root package name */
    public int f192952g;

    /* renamed from: h, reason: collision with root package name */
    public int f192953h;

    public r2(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.f192948c = i17;
        this.f192946a = new java.util.LinkedHashMap(0, 0.75f, true);
    }

    public final synchronized int a() {
        return this.f192953h;
    }

    public final synchronized int b() {
        return this.f192950e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f192947b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap r0 = r4.f192946a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f192947b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f192947b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap r0 = r4.f192946a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap r0 = r4.f192946a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap r2 = r4.f192946a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f192947b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.r(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f192947b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f192951f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f192951f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.o(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.platformtools.r2.d(int):void");
    }

    public final synchronized int e() {
        return this.f192952g;
    }

    public final synchronized int f() {
        return this.f192949d;
    }

    public int g(java.lang.Object obj, java.lang.Object obj2) {
        return 1;
    }

    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object put;
        if (obj == null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.LruMap", "key == null %s", com.tencent.mm.sdk.platformtools.z3.b(true));
            return null;
        }
        synchronized (this) {
            java.lang.Object obj2 = this.f192946a.get(obj);
            if (obj2 != null) {
                this.f192952g++;
                return obj2;
            }
            this.f192953h++;
            java.lang.Object n17 = n(obj);
            if (n17 == null) {
                return null;
            }
            synchronized (this) {
                this.f192950e++;
                put = this.f192946a.put(obj, n17);
                if (put != null) {
                    this.f192946a.put(obj, put);
                } else {
                    this.f192947b += r(obj, n17);
                }
            }
            if (put != null) {
                o(false, obj, n17, put);
                return put;
            }
            d(this.f192948c);
            return n17;
        }
    }

    public final synchronized int h() {
        return this.f192951f;
    }

    public java.lang.Object i(java.lang.Object obj) {
        return get(obj);
    }

    public synchronized boolean k(java.lang.Object obj) {
        return this.f192946a.containsKey(obj);
    }

    public java.util.Set keySet() {
        return this.f192946a.keySet();
    }

    public final synchronized java.util.Map l() {
        return new java.util.LinkedHashMap(this.f192946a);
    }

    public synchronized boolean m(java.lang.Object obj) {
        return get(obj) != null;
    }

    public java.lang.Object n(java.lang.Object obj) {
        return null;
    }

    public void o(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
    }

    public java.util.Set p() {
        return this.f192946a.entrySet();
    }

    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object put;
        if (obj == null || obj2 == null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.LruMap", "put key == null or value == null [%s, %s], %s", obj, obj2, com.tencent.mm.sdk.platformtools.z3.b(true));
        }
        synchronized (this) {
            this.f192949d++;
            this.f192947b += r(obj, obj2);
            put = this.f192946a.put(obj, obj2);
            if (put != null) {
                this.f192947b -= r(obj, put);
            }
        }
        if (put != null) {
            o(false, obj, put, obj2);
        }
        d(this.f192948c);
        return put;
    }

    public final synchronized int q() {
        return this.f192948c;
    }

    public final int r(java.lang.Object obj, java.lang.Object obj2) {
        int g17 = g(obj, obj2);
        if (g17 >= 0) {
            return g17;
        }
        throw new java.lang.IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    public final java.lang.Object remove(java.lang.Object obj) {
        java.lang.Object remove;
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.f192946a.remove(obj);
            if (remove != null) {
                this.f192947b -= r(obj, remove);
            }
        }
        if (remove != null) {
            o(false, obj, remove, null);
        }
        return remove;
    }

    public synchronized void s(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        com.tencent.mars.xlog.Log.i("LruCache", "setMaxSize %s", java.lang.Integer.valueOf(i17));
        this.f192948c = i17;
    }

    public final synchronized int size() {
        return this.f192947b;
    }

    public final synchronized java.lang.String toString() {
        int i17;
        int i18;
        i17 = this.f192952g;
        i18 = this.f192953h + i17;
        return java.lang.String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", java.lang.Integer.valueOf(this.f192948c), java.lang.Integer.valueOf(this.f192952g), java.lang.Integer.valueOf(this.f192953h), java.lang.Integer.valueOf(i18 != 0 ? (i17 * 100) / i18 : 0));
    }

    public java.util.Collection values() {
        return this.f192946a.values();
    }
}
