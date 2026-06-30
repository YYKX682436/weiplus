package q0;

/* loaded from: classes14.dex */
public final class m extends q0.a {

    /* renamed from: f, reason: collision with root package name */
    public int f359243f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object[] f359244g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f359245h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public m(java.lang.Object[] root, int i17, int i18, int i19) {
        super(i17, i18);
        kotlin.jvm.internal.o.g(root, "root");
        this.f359243f = i19;
        java.lang.Object[] objArr = new java.lang.Object[i19];
        this.f359244g = objArr;
        ?? r57 = i17 == i18 ? 1 : 0;
        this.f359245h = r57;
        objArr[0] = root;
        c(i17 - r57, 1);
    }

    public final java.lang.Object b() {
        int i17 = this.f359216d & 31;
        java.lang.Object obj = this.f359244g[this.f359243f - 1];
        if (obj != null) {
            return ((java.lang.Object[]) obj)[i17];
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
    }

    public final void c(int i17, int i18) {
        int i19 = (this.f359243f - i18) * 5;
        while (i18 < this.f359243f) {
            java.lang.Object[] objArr = this.f359244g;
            java.lang.Object obj = objArr[i18 - 1];
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr[i18] = ((java.lang.Object[]) obj)[(i17 >> i19) & 31];
            i19 -= 5;
            i18++;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        int i17;
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object b17 = b();
        int i18 = this.f359216d + 1;
        this.f359216d = i18;
        if (i18 == this.f359217e) {
            this.f359245h = true;
            return b17;
        }
        int i19 = 0;
        while (true) {
            i17 = this.f359216d;
            if (((i17 >> i19) & 31) != 0) {
                break;
            }
            i19 += 5;
        }
        if (i19 > 0) {
            c(i17, ((this.f359243f - 1) - (i19 / 5)) + 1);
        }
        return b17;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        int i17;
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        this.f359216d--;
        int i18 = 0;
        if (this.f359245h) {
            this.f359245h = false;
            return b();
        }
        while (true) {
            i17 = this.f359216d;
            if (((i17 >> i18) & 31) != 31) {
                break;
            }
            i18 += 5;
        }
        if (i18 > 0) {
            c(i17, ((this.f359243f - 1) - (i18 / 5)) + 1);
        }
        return b();
    }
}
