package jz5;

/* loaded from: classes12.dex */
public final class w implements java.util.Collection, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f302851d;

    public /* synthetic */ w(int[] iArr) {
        this.f302851d = iArr;
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
        if (!(obj instanceof jz5.u)) {
            return false;
        }
        return kz5.z.F(this.f302851d, ((jz5.u) obj).f302848d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[LOOP:0: B:4:0x0016->B:17:?, LOOP_END, SYNTHETIC] */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean containsAll(java.util.Collection r5) {
        /*
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            goto L37
        L12:
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof jz5.u
            r3 = 0
            if (r2 == 0) goto L33
            jz5.u r0 = (jz5.u) r0
            int r0 = r0.f302848d
            int[] r2 = r4.f302851d
            boolean r0 = kz5.z.F(r2, r0)
            if (r0 == 0) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r3
        L34:
            if (r0 != 0) goto L16
            r1 = r3
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jz5.w.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof jz5.w) {
            return kotlin.jvm.internal.o.b(this.f302851d, ((jz5.w) obj).f302851d);
        }
        return false;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return java.util.Arrays.hashCode(this.f302851d);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f302851d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new jz5.v(this.f302851d);
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
        return this.f302851d.length;
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    public java.lang.String toString() {
        return "UIntArray(storage=" + java.util.Arrays.toString(this.f302851d) + ')';
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }
}
