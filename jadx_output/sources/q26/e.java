package q26;

/* loaded from: classes14.dex */
public final class e implements q26.n, q26.f {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f359836a;

    /* renamed from: b, reason: collision with root package name */
    public final int f359837b;

    public e(q26.n sequence, int i17) {
        kotlin.jvm.internal.o.g(sequence, "sequence");
        this.f359836a = sequence;
        this.f359837b = i17;
        if (i17 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("count must be non-negative, but was " + i17 + '.').toString());
    }

    @Override // q26.f
    public q26.n a(int i17) {
        int i18 = this.f359837b + i17;
        return i18 < 0 ? new q26.e(this, i17) : new q26.e(this.f359836a, i18);
    }

    @Override // q26.f
    public q26.n b(int i17) {
        int i18 = this.f359837b;
        int i19 = i18 + i17;
        return i19 < 0 ? new q26.l0(this, i17) : new q26.j0(this.f359836a, i18, i19);
    }

    @Override // q26.n
    public java.util.Iterator iterator() {
        return new q26.d(this);
    }
}
