package jz5;

/* loaded from: classes12.dex */
public final class z implements java.util.Collection, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final long[] f302855d;

    public /* synthetic */ z(long[] jArr) {
        this.f302855d = jArr;
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
        if (!(obj instanceof jz5.x)) {
            return false;
        }
        long j17 = ((jz5.x) obj).f302852d;
        long[] jArr = this.f302855d;
        kotlin.jvm.internal.o.g(jArr, "<this>");
        return kz5.z.W(jArr, j17) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[LOOP:0: B:4:0x0016->B:19:?, LOOP_END, SYNTHETIC] */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean containsAll(java.util.Collection r7) {
        /*
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            goto L41
        L12:
            java.util.Iterator r7 = r7.iterator()
        L16:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r7.next()
            boolean r2 = r0 instanceof jz5.x
            r3 = 0
            if (r2 == 0) goto L3d
            jz5.x r0 = (jz5.x) r0
            long r4 = r0.f302852d
            java.lang.String r0 = "<this>"
            long[] r2 = r6.f302855d
            kotlin.jvm.internal.o.g(r2, r0)
            int r0 = kz5.z.W(r2, r4)
            if (r0 < 0) goto L38
            r0 = r1
            goto L39
        L38:
            r0 = r3
        L39:
            if (r0 == 0) goto L3d
            r0 = r1
            goto L3e
        L3d:
            r0 = r3
        L3e:
            if (r0 != 0) goto L16
            r1 = r3
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jz5.z.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof jz5.z) {
            return kotlin.jvm.internal.o.b(this.f302855d, ((jz5.z) obj).f302855d);
        }
        return false;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return java.util.Arrays.hashCode(this.f302855d);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f302855d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new jz5.y(this.f302855d);
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
        return this.f302855d.length;
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    public java.lang.String toString() {
        return "ULongArray(storage=" + java.util.Arrays.toString(this.f302855d) + ')';
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }
}
