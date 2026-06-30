package e06;

/* loaded from: classes2.dex */
public final class k extends e06.i implements e06.h {

    /* renamed from: g, reason: collision with root package name */
    public static final e06.k f246216g = new e06.k(1, 0);

    public k(int i17, int i18) {
        super(i17, i18, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e06.h
    public /* bridge */ /* synthetic */ boolean e(java.lang.Comparable comparable) {
        return m(((java.lang.Number) comparable).intValue());
    }

    @Override // e06.i
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof e06.k) {
            if (!isEmpty() || !((e06.k) obj).isEmpty()) {
                e06.k kVar = (e06.k) obj;
                if (this.f246209d == kVar.f246209d) {
                    if (this.f246210e == kVar.f246210e) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // e06.i
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f246209d * 31) + this.f246210e;
    }

    @Override // e06.i, e06.h
    public boolean isEmpty() {
        return this.f246209d > this.f246210e;
    }

    public boolean m(int i17) {
        return this.f246209d <= i17 && i17 <= this.f246210e;
    }

    @Override // e06.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer g() {
        return java.lang.Integer.valueOf(this.f246210e);
    }

    @Override // e06.h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer h() {
        return java.lang.Integer.valueOf(this.f246209d);
    }

    @Override // e06.i
    public java.lang.String toString() {
        return this.f246209d + ".." + this.f246210e;
    }
}
