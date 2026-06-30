package q26;

/* loaded from: classes14.dex */
public final class j0 implements q26.n, q26.f {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f359857a;

    /* renamed from: b, reason: collision with root package name */
    public final int f359858b;

    /* renamed from: c, reason: collision with root package name */
    public final int f359859c;

    public j0(q26.n sequence, int i17, int i18) {
        kotlin.jvm.internal.o.g(sequence, "sequence");
        this.f359857a = sequence;
        this.f359858b = i17;
        this.f359859c = i18;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("startIndex should be non-negative, but is " + i17).toString());
        }
        if (!(i18 >= 0)) {
            throw new java.lang.IllegalArgumentException(("endIndex should be non-negative, but is " + i18).toString());
        }
        if (i18 >= i17) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i18 + " < " + i17).toString());
    }

    @Override // q26.f
    public q26.n a(int i17) {
        int i18 = this.f359859c;
        int i19 = this.f359858b;
        return i17 >= i18 - i19 ? q26.g.f359840a : new q26.j0(this.f359857a, i19 + i17, i18);
    }

    @Override // q26.f
    public q26.n b(int i17) {
        int i18 = this.f359859c;
        int i19 = this.f359858b;
        return i17 >= i18 - i19 ? this : new q26.j0(this.f359857a, i19, i17 + i19);
    }

    @Override // q26.n
    public java.util.Iterator iterator() {
        return new q26.i0(this);
    }
}
