package x6;

/* loaded from: classes13.dex */
public final class s implements x6.q {

    /* renamed from: a, reason: collision with root package name */
    public final x6.t f452170a;

    /* renamed from: b, reason: collision with root package name */
    public int f452171b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Bitmap.Config f452172c;

    public s(x6.t tVar) {
        this.f452170a = tVar;
    }

    @Override // x6.q
    public void a() {
        this.f452170a.c(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof x6.s)) {
            return false;
        }
        x6.s sVar = (x6.s) obj;
        return this.f452171b == sVar.f452171b && q7.p.a(this.f452172c, sVar.f452172c);
    }

    public int hashCode() {
        int i17 = this.f452171b * 31;
        android.graphics.Bitmap.Config config = this.f452172c;
        return i17 + (config != null ? config.hashCode() : 0);
    }

    public java.lang.String toString() {
        return x6.u.c(this.f452171b, this.f452172c);
    }
}
