package jz5;

/* loaded from: classes9.dex */
public final class f implements java.lang.Comparable {

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.f f302821h = new jz5.f(2, 0, 21);

    /* renamed from: d, reason: collision with root package name */
    public final int f302822d;

    /* renamed from: e, reason: collision with root package name */
    public final int f302823e;

    /* renamed from: f, reason: collision with root package name */
    public final int f302824f;

    /* renamed from: g, reason: collision with root package name */
    public final int f302825g;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if ((r7 >= 0 && r7 < 256) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(int r5, int r6, int r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.f302822d = r5
            r4.f302823e = r6
            r4.f302824f = r7
            r0 = 256(0x100, float:3.59E-43)
            r1 = 1
            r2 = 0
            if (r5 < 0) goto L13
            if (r5 >= r0) goto L13
            r3 = r1
            goto L14
        L13:
            r3 = r2
        L14:
            if (r3 == 0) goto L29
            if (r6 < 0) goto L1c
            if (r6 >= r0) goto L1c
            r3 = r1
            goto L1d
        L1c:
            r3 = r2
        L1d:
            if (r3 == 0) goto L29
            if (r7 < 0) goto L25
            if (r7 >= r0) goto L25
            r0 = r1
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L35
            int r5 = r5 << 16
            int r6 = r6 << 8
            int r5 = r5 + r6
            int r5 = r5 + r7
            r4.f302825g = r5
            return
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Version components are out of range: "
            r0.<init>(r1)
            r0.append(r5)
            r5 = 46
            r0.append(r5)
            r0.append(r6)
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jz5.f.<init>(int, int, int):void");
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        jz5.f other = (jz5.f) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return this.f302825g - other.f302825g;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        jz5.f fVar = obj instanceof jz5.f ? (jz5.f) obj : null;
        return fVar != null && this.f302825g == fVar.f302825g;
    }

    public int hashCode() {
        return this.f302825g;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f302822d);
        sb6.append('.');
        sb6.append(this.f302823e);
        sb6.append('.');
        sb6.append(this.f302824f);
        return sb6.toString();
    }
}
