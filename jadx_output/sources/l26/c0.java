package l26;

/* loaded from: classes14.dex */
public final class c0 extends l26.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f315218d;

    /* renamed from: e, reason: collision with root package name */
    public final int f315219e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.lang.Object value, int i17) {
        super(null);
        kotlin.jvm.internal.o.g(value, "value");
        this.f315218d = value;
        this.f315219e = i17;
    }

    @Override // l26.d
    public int d() {
        return 1;
    }

    @Override // l26.d
    public void e(int i17, java.lang.Object value) {
        kotlin.jvm.internal.o.g(value, "value");
        throw new java.lang.IllegalStateException();
    }

    @Override // l26.d
    public java.lang.Object get(int i17) {
        if (i17 == this.f315219e) {
            return this.f315218d;
        }
        return null;
    }

    @Override // l26.d, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new l26.b0(this);
    }
}
