package jz5;

/* loaded from: classes12.dex */
public final class d0 implements java.util.Collection, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final short[] f302820d;

    public /* synthetic */ d0(short[] sArr) {
        this.f302820d = sArr;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof jz5.b0)) {
            return false;
        }
        short s17 = ((jz5.b0) obj).f302816d;
        short[] sArr = this.f302820d;
        kotlin.jvm.internal.o.g(sArr, "<this>");
        int length = sArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                i17 = -1;
                break;
            }
            if (s17 == sArr[i17]) {
                break;
            }
            i17++;
        }
        return i17 >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:4:0x0016->B:24:?, LOOP_END, SYNTHETIC] */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean containsAll(java.util.Collection r8) {
        /*
            r7 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            goto L4a
        L12:
            java.util.Iterator r8 = r8.iterator()
        L16:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r8.next()
            boolean r2 = r0 instanceof jz5.b0
            r3 = 0
            if (r2 == 0) goto L46
            jz5.b0 r0 = (jz5.b0) r0
            short r0 = r0.f302816d
            java.lang.String r2 = "<this>"
            short[] r4 = r7.f302820d
            kotlin.jvm.internal.o.g(r4, r2)
            int r2 = r4.length
            r5 = r3
        L32:
            if (r5 >= r2) goto L3c
            short r6 = r4[r5]
            if (r0 != r6) goto L39
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L32
        L3c:
            r5 = -1
        L3d:
            if (r5 < 0) goto L41
            r0 = r1
            goto L42
        L41:
            r0 = r3
        L42:
            if (r0 == 0) goto L46
            r0 = r1
            goto L47
        L46:
            r0 = r3
        L47:
            if (r0 != 0) goto L16
            r1 = r3
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jz5.d0.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof jz5.d0) {
            return kotlin.jvm.internal.o.b(this.f302820d, ((jz5.d0) obj).f302820d);
        }
        return false;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return java.util.Arrays.hashCode(this.f302820d);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f302820d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new jz5.c0(this.f302820d);
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public int size() {
        return this.f302820d.length;
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    public java.lang.String toString() {
        return "UShortArray(storage=" + java.util.Arrays.toString(this.f302820d) + ')';
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }
}
