package q26;

/* loaded from: classes8.dex */
public final class g0 implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q26.n f359841a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f359842b;

    public g0(q26.n nVar, java.util.Comparator comparator) {
        this.f359841a = nVar;
        this.f359842b = comparator;
    }

    @Override // q26.n
    public java.util.Iterator iterator() {
        java.util.List z17 = q26.h0.z(this.f359841a);
        kz5.g0.t(z17, this.f359842b);
        return z17.iterator();
    }
}
