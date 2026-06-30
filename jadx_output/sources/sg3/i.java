package sg3;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407970d = 0;

    public i(sg3.j jVar, sg3.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407970d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407970d;
        this.f407970d = i17 + 1;
        if (i17 == 0) {
            return sg3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
