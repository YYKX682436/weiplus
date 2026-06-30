package xj5;

/* loaded from: classes5.dex */
public final class b extends xj5.a {

    /* renamed from: u, reason: collision with root package name */
    public final int f454899u;

    public b(int i17) {
        this.f454899u = i17;
    }

    @Override // xj5.a
    public int c() {
        return 6;
    }

    @Override // xj5.a
    public boolean d(xj5.a aVar) {
        xj5.b other = (xj5.b) aVar;
        kotlin.jvm.internal.o.g(other, "other");
        return this.f454899u == other.f454899u;
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return xj5.a.f454889n;
    }

    @Override // xj5.e
    public int m(java.lang.Object obj) {
        xj5.b other = (xj5.b) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return 0;
    }
}
