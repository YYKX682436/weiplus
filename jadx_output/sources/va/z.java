package va;

/* loaded from: classes16.dex */
public class z extends java.util.AbstractMap implements java.util.concurrent.ConcurrentMap, java.io.Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final va.w f434210p = new va.c();

    /* renamed from: d, reason: collision with root package name */
    public final transient int f434211d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f434212e;

    /* renamed from: f, reason: collision with root package name */
    public final transient va.m[] f434213f;

    /* renamed from: g, reason: collision with root package name */
    public final int f434214g;

    /* renamed from: h, reason: collision with root package name */
    public final ua.c f434215h;

    /* renamed from: i, reason: collision with root package name */
    public final transient va.i f434216i;

    /* renamed from: m, reason: collision with root package name */
    public transient java.util.Set f434217m;

    /* renamed from: n, reason: collision with root package name */
    public transient java.util.Collection f434218n;

    /* renamed from: o, reason: collision with root package name */
    public transient java.util.Set f434219o;

    public z(va.b bVar, va.i iVar) {
        bVar.getClass();
        this.f434214g = java.lang.Math.min(4, 65536);
        ua.a aVar = ua.a.f425892d;
        if (aVar == null) {
            throw new java.lang.NullPointerException("Both parameters are null");
        }
        this.f434215h = aVar;
        this.f434216i = iVar;
        int min = java.lang.Math.min(16, 1073741824);
        int i17 = 1;
        int i18 = 0;
        int i19 = 1;
        int i27 = 0;
        while (i19 < this.f434214g) {
            i27++;
            i19 <<= 1;
        }
        this.f434212e = 32 - i27;
        this.f434211d = i19 - 1;
        this.f434213f = new va.m[i19];
        int i28 = min / i19;
        while (i17 < (i19 * i28 < min ? i28 + 1 : i28)) {
            i17 <<= 1;
        }
        while (true) {
            va.m[] mVarArr = this.f434213f;
            if (i18 >= mVarArr.length) {
                return;
            }
            mVarArr[i18] = this.f434216i.e(this, i17, -1);
            i18++;
        }
    }

    public static java.util.ArrayList a(java.util.Collection collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        java.util.Iterator it = collection.iterator();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public int b(java.lang.Object obj) {
        int b17;
        ua.c cVar = this.f434215h;
        if (obj == null) {
            cVar.getClass();
            b17 = 0;
        } else {
            b17 = cVar.b(obj);
        }
        int i17 = b17 + ((b17 << 15) ^ (-12931));
        int i18 = i17 ^ (i17 >>> 10);
        int i19 = i18 + (i18 << 3);
        int i27 = i19 ^ (i19 >>> 6);
        int i28 = i27 + (i27 << 2) + (i27 << 14);
        return i28 ^ (i28 >>> 16);
    }

    public va.m c(int i17) {
        return this.f434213f[(i17 >>> this.f434212e) & this.f434211d];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        va.m[] mVarArr = this.f434213f;
        int length = mVarArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            va.m mVar = mVarArr[i17];
            if (mVar.f434195e != 0) {
                mVar.lock();
                try {
                    java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = mVar.f434198h;
                    for (int i18 = 0; i18 < atomicReferenceArray.length(); i18++) {
                        atomicReferenceArray.set(i18, null);
                    }
                    mVar.d();
                    mVar.f434199i.set(0);
                    mVar.f434196f++;
                    mVar.f434195e = 0;
                } finally {
                    mVar.unlock();
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        va.h c17;
        boolean z17 = false;
        if (obj == null) {
            return false;
        }
        int b17 = b(obj);
        va.m c18 = c(b17);
        c18.getClass();
        try {
            if (c18.f434195e != 0 && (c17 = c18.c(obj, b17)) != null) {
                if (c17.getValue() != null) {
                    z17 = true;
                }
            }
            return z17;
        } finally {
            c18.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        java.lang.Object value;
        boolean z17 = false;
        if (obj == null) {
            return false;
        }
        va.m[] mVarArr = this.f434213f;
        long j17 = -1;
        int i17 = 0;
        while (i17 < 3) {
            int length = mVarArr.length;
            long j18 = 0;
            for (?? r102 = z17; r102 < length; r102++) {
                va.m mVar = mVarArr[r102];
                int i18 = mVar.f434195e;
                ?? r122 = mVar.f434198h;
                for (?? r132 = z17; r132 < r122.length(); r132++) {
                    for (va.h hVar = (va.h) r122.get(r132); hVar != null; hVar = hVar.b()) {
                        if (hVar.getKey() == null) {
                            mVar.l();
                        } else {
                            value = hVar.getValue();
                            if (value == null) {
                                mVar.l();
                            }
                            if (value == null && this.f434216i.c().h().c(obj, value)) {
                                return true;
                            }
                        }
                        value = null;
                        if (value == null) {
                        }
                    }
                }
                j18 += mVar.f434196f;
                z17 = false;
            }
            if (j18 == j17) {
                return false;
            }
            i17++;
            j17 = j18;
            z17 = false;
        }
        return z17;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        java.util.Set set = this.f434219o;
        if (set != null) {
            return set;
        }
        va.f fVar = new va.f(this);
        this.f434219o = fVar;
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Object obj2 = null;
        if (obj == null) {
            return null;
        }
        int b17 = b(obj);
        va.m c17 = c(b17);
        c17.getClass();
        try {
            va.h c18 = c17.c(obj, b17);
            if (c18 != null && (obj2 = c18.getValue()) == null) {
                c17.l();
            }
            return obj2;
        } finally {
            c17.f();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        va.m[] mVarArr = this.f434213f;
        long j17 = 0;
        for (int i17 = 0; i17 < mVarArr.length; i17++) {
            if (mVarArr[i17].f434195e != 0) {
                return false;
            }
            j17 += mVarArr[i17].f434196f;
        }
        if (j17 == 0) {
            return true;
        }
        for (int i18 = 0; i18 < mVarArr.length; i18++) {
            if (mVarArr[i18].f434195e != 0) {
                return false;
            }
            j17 -= mVarArr[i18].f434196f;
        }
        return j17 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        java.util.Set set = this.f434217m;
        if (set != null) {
            return set;
        }
        va.k kVar = new va.k(this);
        this.f434217m = kVar;
        return kVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        obj.getClass();
        obj2.getClass();
        int b17 = b(obj);
        return c(b17).g(obj, b17, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        obj.getClass();
        obj2.getClass();
        int b17 = b(obj);
        return c(b17).g(obj, b17, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r11 = r7.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r11 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        r2.f434196f++;
        r0 = r2.h(r6, r7);
        r1 = r2.f434195e - 1;
        r3.set(r4, r0);
        r2.f434195e = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r7.getValue() != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r1 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        r1 = false;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object remove(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r10.b(r11)
            va.m r2 = r10.c(r1)
            r2.lock()
            r2.i()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.f434198h     // Catch: java.lang.Throwable -> L6b
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L6b
            r5 = 1
            int r4 = r4 - r5
            r4 = r4 & r1
            java.lang.Object r6 = r3.get(r4)     // Catch: java.lang.Throwable -> L6b
            va.h r6 = (va.h) r6     // Catch: java.lang.Throwable -> L6b
            r7 = r6
        L22:
            if (r7 == 0) goto L67
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L6b
            int r9 = r7.c()     // Catch: java.lang.Throwable -> L6b
            if (r9 != r1) goto L62
            if (r8 == 0) goto L62
            va.z r9 = r2.f434194d     // Catch: java.lang.Throwable -> L6b
            ua.c r9 = r9.f434215h     // Catch: java.lang.Throwable -> L6b
            boolean r8 = r9.c(r11, r8)     // Catch: java.lang.Throwable -> L6b
            if (r8 == 0) goto L62
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L6b
            if (r11 == 0) goto L41
            goto L4c
        L41:
            java.lang.Object r1 = r7.getValue()     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L49
            r1 = r5
            goto L4a
        L49:
            r1 = 0
        L4a:
            if (r1 == 0) goto L67
        L4c:
            int r0 = r2.f434196f     // Catch: java.lang.Throwable -> L6b
            int r0 = r0 + r5
            r2.f434196f = r0     // Catch: java.lang.Throwable -> L6b
            va.h r0 = r2.h(r6, r7)     // Catch: java.lang.Throwable -> L6b
            int r1 = r2.f434195e     // Catch: java.lang.Throwable -> L6b
            int r1 = r1 - r5
            r3.set(r4, r0)     // Catch: java.lang.Throwable -> L6b
            r2.f434195e = r1     // Catch: java.lang.Throwable -> L6b
            r2.unlock()
            r0 = r11
            goto L6a
        L62:
            va.h r7 = r7.b()     // Catch: java.lang.Throwable -> L6b
            goto L22
        L67:
            r2.unlock()
        L6a:
            return r0
        L6b:
            r11 = move-exception
            r2.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: va.z.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object replace(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            r11.getClass()
            r12.getClass()
            int r0 = r10.b(r11)
            va.m r1 = r10.c(r0)
            r1.lock()
            r1.i()     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r1.f434198h     // Catch: java.lang.Throwable -> L76
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L76
            r4 = 1
            int r3 = r3 - r4
            r3 = r3 & r0
            java.lang.Object r5 = r2.get(r3)     // Catch: java.lang.Throwable -> L76
            va.h r5 = (va.h) r5     // Catch: java.lang.Throwable -> L76
            r6 = r5
        L24:
            r7 = 0
            if (r6 == 0) goto L72
            java.lang.Object r8 = r6.getKey()     // Catch: java.lang.Throwable -> L76
            int r9 = r6.c()     // Catch: java.lang.Throwable -> L76
            if (r9 != r0) goto L6d
            if (r8 == 0) goto L6d
            va.z r9 = r1.f434194d     // Catch: java.lang.Throwable -> L76
            ua.c r9 = r9.f434215h     // Catch: java.lang.Throwable -> L76
            boolean r8 = r9.c(r11, r8)     // Catch: java.lang.Throwable -> L76
            if (r8 == 0) goto L6d
            java.lang.Object r11 = r6.getValue()     // Catch: java.lang.Throwable -> L76
            if (r11 != 0) goto L60
            java.lang.Object r11 = r6.getValue()     // Catch: java.lang.Throwable -> L76
            if (r11 != 0) goto L4b
            r11 = r4
            goto L4c
        L4b:
            r11 = 0
        L4c:
            if (r11 == 0) goto L72
            int r11 = r1.f434196f     // Catch: java.lang.Throwable -> L76
            int r11 = r11 + r4
            r1.f434196f = r11     // Catch: java.lang.Throwable -> L76
            va.h r11 = r1.h(r5, r6)     // Catch: java.lang.Throwable -> L76
            int r12 = r1.f434195e     // Catch: java.lang.Throwable -> L76
            int r12 = r12 - r4
            r2.set(r3, r11)     // Catch: java.lang.Throwable -> L76
            r1.f434195e = r12     // Catch: java.lang.Throwable -> L76
            goto L72
        L60:
            int r0 = r1.f434196f     // Catch: java.lang.Throwable -> L76
            int r0 = r0 + r4
            r1.f434196f = r0     // Catch: java.lang.Throwable -> L76
            r1.k(r6, r12)     // Catch: java.lang.Throwable -> L76
            r1.unlock()
            r7 = r11
            goto L75
        L6d:
            va.h r6 = r6.b()     // Catch: java.lang.Throwable -> L76
            goto L24
        L72:
            r1.unlock()
        L75:
            return r7
        L76:
            r11 = move-exception
            r1.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: va.z.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j17 = 0;
        for (int i17 = 0; i17 < this.f434213f.length; i17++) {
            j17 += r0[i17].f434195e;
        }
        if (j17 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j17 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j17;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection values() {
        java.util.Collection collection = this.f434218n;
        if (collection != null) {
            return collection;
        }
        va.u uVar = new va.u(this);
        this.f434218n = uVar;
        return uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r2.f434194d.f434216i.c().h().c(r12, r7.getValue()) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r2.f434196f++;
        r11 = r2.h(r6, r7);
        r12 = r2.f434195e - 1;
        r3.set(r4, r11);
        r2.f434195e = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r7.getValue() != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r11 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r11 = false;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L80
            if (r12 != 0) goto L7
            goto L80
        L7:
            int r1 = r10.b(r11)
            va.m r2 = r10.c(r1)
            r2.lock()
            r2.i()     // Catch: java.lang.Throwable -> L7b
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.f434198h     // Catch: java.lang.Throwable -> L7b
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L7b
            r5 = 1
            int r4 = r4 - r5
            r4 = r4 & r1
            java.lang.Object r6 = r3.get(r4)     // Catch: java.lang.Throwable -> L7b
            va.h r6 = (va.h) r6     // Catch: java.lang.Throwable -> L7b
            r7 = r6
        L25:
            if (r7 == 0) goto L77
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L7b
            int r9 = r7.c()     // Catch: java.lang.Throwable -> L7b
            if (r9 != r1) goto L72
            if (r8 == 0) goto L72
            va.z r9 = r2.f434194d     // Catch: java.lang.Throwable -> L7b
            ua.c r9 = r9.f434215h     // Catch: java.lang.Throwable -> L7b
            boolean r8 = r9.c(r11, r8)     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L72
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L7b
            va.z r1 = r2.f434194d     // Catch: java.lang.Throwable -> L7b
            va.i r1 = r1.f434216i     // Catch: java.lang.Throwable -> L7b
            va.p r1 = r1.c()     // Catch: java.lang.Throwable -> L7b
            ua.c r1 = r1.h()     // Catch: java.lang.Throwable -> L7b
            boolean r11 = r1.c(r12, r11)     // Catch: java.lang.Throwable -> L7b
            if (r11 == 0) goto L55
            r0 = r5
            goto L60
        L55:
            java.lang.Object r11 = r7.getValue()     // Catch: java.lang.Throwable -> L7b
            if (r11 != 0) goto L5d
            r11 = r5
            goto L5e
        L5d:
            r11 = r0
        L5e:
            if (r11 == 0) goto L77
        L60:
            int r11 = r2.f434196f     // Catch: java.lang.Throwable -> L7b
            int r11 = r11 + r5
            r2.f434196f = r11     // Catch: java.lang.Throwable -> L7b
            va.h r11 = r2.h(r6, r7)     // Catch: java.lang.Throwable -> L7b
            int r12 = r2.f434195e     // Catch: java.lang.Throwable -> L7b
            int r12 = r12 - r5
            r3.set(r4, r11)     // Catch: java.lang.Throwable -> L7b
            r2.f434195e = r12     // Catch: java.lang.Throwable -> L7b
            goto L77
        L72:
            va.h r7 = r7.b()     // Catch: java.lang.Throwable -> L7b
            goto L25
        L77:
            r2.unlock()
            return r0
        L7b:
            r11 = move-exception
            r2.unlock()
            throw r11
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: va.z.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int b17 = b(obj);
        va.m c17 = c(b17);
        c17.lock();
        try {
            c17.i();
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = c17.f434198h;
            int length = (atomicReferenceArray.length() - 1) & b17;
            va.h hVar = (va.h) atomicReferenceArray.get(length);
            va.h hVar2 = hVar;
            while (true) {
                if (hVar2 == null) {
                    break;
                }
                java.lang.Object key = hVar2.getKey();
                if (hVar2.c() == b17 && key != null && c17.f434194d.f434215h.c(obj, key)) {
                    java.lang.Object value = hVar2.getValue();
                    if (value == null) {
                        if (hVar2.getValue() == null) {
                            c17.f434196f++;
                            va.h h17 = c17.h(hVar, hVar2);
                            int i17 = c17.f434195e - 1;
                            atomicReferenceArray.set(length, h17);
                            c17.f434195e = i17;
                        }
                    } else if (c17.f434194d.f434216i.c().h().c(obj2, value)) {
                        c17.f434196f++;
                        c17.k(hVar2, obj3);
                        return true;
                    }
                } else {
                    hVar2 = hVar2.b();
                }
            }
            return false;
        } finally {
            c17.unlock();
        }
    }
}
