package sg3;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407967d = 0;

    public e(sg3.f fVar, sg3.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407967d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407967d;
        this.f407967d = i17 + 1;
        if (i17 == 0) {
            return sg3.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
