package kz5;

/* loaded from: classes14.dex */
public abstract class j implements java.util.Map, zz5.a {
    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        java.util.Set entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        java.util.Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b(((java.util.Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        return new r0.n((r0.d) this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[LOOP:0: B:17:0x002b->B:27:?, LOOP_END, SYNTHETIC] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            r0.d r1 = (r0.d) r1
            java.util.Map r7 = (java.util.Map) r7
            int r3 = r7.size()
            int r4 = r1.f367964e
            if (r4 == r3) goto L18
            return r2
        L18:
            java.util.Set r7 = r7.entrySet()
            boolean r3 = r7 instanceof java.util.Collection
            if (r3 == 0) goto L27
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L27
            goto L5b
        L27:
            java.util.Iterator r7 = r7.iterator()
        L2b:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 != 0) goto L3b
        L39:
            r3 = r2
            goto L58
        L3b:
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r5 = r1.get(r4)
            boolean r3 = kotlin.jvm.internal.o.b(r3, r5)
            if (r3 != 0) goto L4e
            goto L39
        L4e:
            if (r5 != 0) goto L57
            boolean r3 = r1.containsKey(r4)
            if (r3 != 0) goto L57
            goto L39
        L57:
            r3 = r0
        L58:
            if (r3 != 0) goto L2b
            r0 = r2
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kz5.j.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return ((r0.d) this).f367964e == 0;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        return new r0.p((r0.d) this);
    }

    @Override // java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return ((r0.d) this).f367964e;
    }

    public java.lang.String toString() {
        return kz5.n0.g0(entrySet(), ", ", "{", "}", 0, null, new kz5.i(this), 24, null);
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return new r0.r((r0.d) this);
    }
}
