package o05;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f341923d = 0;

    public f(o05.g gVar, o05.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f341923d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f341923d;
        this.f341923d = i17 + 1;
        if (i17 == 0) {
            return ps4.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
