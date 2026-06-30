package yq3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f464503d = 0;

    public b(yq3.c cVar, yq3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f464503d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f464503d;
        this.f464503d = i17 + 1;
        if (i17 == 0) {
            return yq3.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
