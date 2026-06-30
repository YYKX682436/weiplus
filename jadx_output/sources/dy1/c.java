package dy1;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f244561d = 0;

    public c(dy1.d dVar, dy1.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f244561d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f244561d;
        this.f244561d = i17 + 1;
        if (i17 == 0) {
            return cy1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
