package l26;

/* loaded from: classes14.dex */
public final class f extends l26.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f315224d;

    /* renamed from: e, reason: collision with root package name */
    public int f315225e;

    public f() {
        super(null);
        this.f315224d = new java.lang.Object[20];
        this.f315225e = 0;
    }

    @Override // l26.d
    public int d() {
        return this.f315225e;
    }

    @Override // l26.d
    public void e(int i17, java.lang.Object value) {
        kotlin.jvm.internal.o.g(value, "value");
        java.lang.Object[] objArr = this.f315224d;
        if (objArr.length <= i17) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i17);
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.f315224d, length);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
            this.f315224d = copyOf;
        }
        java.lang.Object[] objArr2 = this.f315224d;
        if (objArr2[i17] == null) {
            this.f315225e++;
        }
        objArr2[i17] = value;
    }

    @Override // l26.d
    public java.lang.Object get(int i17) {
        return kz5.z.U(this.f315224d, i17);
    }

    @Override // l26.d, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new l26.e(this);
    }
}
