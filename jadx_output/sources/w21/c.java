package w21;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442303d = 0;

    public c(w21.d dVar, w21.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442303d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442303d;
        this.f442303d = i17 + 1;
        if (i17 == 0) {
            return w21.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
