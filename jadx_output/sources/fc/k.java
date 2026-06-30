package fc;

/* loaded from: classes16.dex */
public class k extends fc.s implements java.util.Map {

    /* renamed from: p, reason: collision with root package name */
    public transient java.lang.Object[] f260916p;

    @Override // fc.b, java.util.Map
    public void clear() {
        if (this.f260900d == 0) {
            return;
        }
        super.clear();
        java.lang.Object[] objArr = this.f260928i;
        java.lang.Object[] objArr2 = this.f260916p;
        int length = objArr.length;
        while (true) {
            int i17 = length - 1;
            if (length <= 0) {
                return;
            }
            objArr[i17] = null;
            objArr2[i17] = null;
            length = i17;
        }
    }

    @Override // fc.s, fc.b
    public java.lang.Object clone() {
        fc.k kVar = (fc.k) super.clone();
        kVar.f260916p = (java.lang.Object[]) this.f260916p.clone();
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0030, code lost:
    
        return true;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean containsValue(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object[] r0 = r6.f260928i
            java.lang.Object[] r1 = r6.f260916p
            r2 = 1
            java.lang.Object r3 = fc.s.f260926n
            if (r7 != 0) goto L1b
            int r4 = r1.length
        La:
            int r5 = r4 + (-1)
            if (r4 <= 0) goto L33
            r4 = r0[r5]
            if (r4 == 0) goto L19
            if (r4 == r3) goto L19
            r4 = r1[r5]
            if (r7 != r4) goto L19
            return r2
        L19:
            r4 = r5
            goto La
        L1b:
            int r4 = r1.length
        L1c:
            int r5 = r4 + (-1)
            if (r4 <= 0) goto L33
            r4 = r0[r5]
            if (r4 == 0) goto L31
            if (r4 == r3) goto L31
            r4 = r1[r5]
            if (r7 == r4) goto L30
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L31
        L30:
            return r2
        L31:
            r4 = r5
            goto L1c
        L33:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.k.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
        return new fc.f(this);
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (map.size() != this.f260900d) {
            return false;
        }
        java.lang.Object[] objArr = this.f260928i;
        java.lang.Object[] objArr2 = this.f260916p;
        int length = objArr.length;
        while (true) {
            int i17 = length - 1;
            boolean z17 = true;
            if (length <= 0) {
                return true;
            }
            java.lang.Object obj2 = objArr[i17];
            if (obj2 != null && obj2 != fc.s.f260926n) {
                java.lang.Object obj3 = objArr2[i17];
                java.lang.Object obj4 = map.get(obj2);
                if (obj4 != obj3 && (obj4 == null || !obj4.equals(obj3))) {
                    z17 = false;
                }
                if (!z17) {
                    return false;
                }
            }
            length = i17;
        }
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        int r17 = r(obj);
        if (r17 < 0) {
            return null;
        }
        return this.f260916p[r17];
    }

    @Override // java.util.Map
    public int hashCode() {
        java.lang.Object[] objArr = this.f260928i;
        java.lang.Object[] objArr2 = this.f260916p;
        int length = objArr.length;
        int i17 = 0;
        while (true) {
            int i18 = length - 1;
            if (length <= 0) {
                return i17;
            }
            java.lang.Object obj = objArr[i18];
            if (obj != null && obj != fc.s.f260926n) {
                java.lang.Object obj2 = objArr2[i18];
                i17 += ((fc.s) this.f260929m).o(obj) ^ (obj2 == null ? 0 : obj2.hashCode());
            }
            length = i18;
        }
    }

    @Override // fc.b
    public void k(int i17) {
        java.lang.Object[] objArr = this.f260928i;
        int length = objArr.length;
        java.lang.Object[] objArr2 = this.f260916p;
        this.f260928i = new java.lang.Object[i17];
        this.f260916p = new java.lang.Object[i17];
        while (true) {
            int i18 = length - 1;
            if (length <= 0) {
                return;
            }
            java.lang.Object obj = objArr[i18];
            if (obj != null && obj != fc.s.f260926n) {
                int s17 = s(obj);
                if (s17 < 0) {
                    t(this.f260928i[(-s17) - 1], obj);
                    throw null;
                }
                this.f260928i[s17] = obj;
                this.f260916p[s17] = objArr2[i18];
            }
            length = i18;
        }
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
        return new fc.g(this);
    }

    @Override // fc.s, fc.b
    public void l(int i17) {
        this.f260916p[i17] = null;
        super.l(i17);
    }

    @Override // fc.s, fc.b
    public int m(int i17) {
        int m17 = super.m(i17);
        this.f260916p = new java.lang.Object[m17];
        return m17;
    }

    @Override // fc.s
    /* renamed from: n */
    public fc.s clone() {
        fc.k kVar = (fc.k) super.clone();
        kVar.f260916p = (java.lang.Object[]) this.f260916p.clone();
        return kVar;
    }

    @Override // java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        if (obj == null) {
            throw new java.lang.NullPointerException("null keys not supported");
        }
        int s17 = s(obj);
        boolean z17 = s17 < 0;
        if (z17) {
            s17 = (-s17) - 1;
            obj3 = this.f260916p[s17];
        } else {
            obj3 = null;
        }
        java.lang.Object[] objArr = this.f260928i;
        java.lang.Object obj4 = objArr[s17];
        objArr[s17] = obj;
        this.f260916p[s17] = obj2;
        if (!z17) {
            j(obj4 == null);
        }
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        h(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        int r17 = r(obj);
        if (r17 < 0) {
            return null;
        }
        java.lang.Object obj2 = this.f260916p[r17];
        l(r17);
        return obj2;
    }

    @Override // java.util.Map
    public java.util.Collection values() {
        return new fc.j(this);
    }
}
