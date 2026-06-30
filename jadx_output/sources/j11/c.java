package j11;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f297098d = 0;

    public c(j11.d dVar, j11.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f297098d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f297098d;
        this.f297098d = i17 + 1;
        if (i17 == 0) {
            return j11.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
