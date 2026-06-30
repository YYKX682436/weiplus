package v43;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f433237d = 0;

    public f(v43.g gVar, v43.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f433237d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f433237d;
        this.f433237d = i17 + 1;
        if (i17 == 0) {
            return v43.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
