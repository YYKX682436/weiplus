package r21;

/* loaded from: classes.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368785d = 0;

    public c(r21.d dVar, r21.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368785d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368785d;
        this.f368785d = i17 + 1;
        if (i17 == 0) {
            return r21.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
