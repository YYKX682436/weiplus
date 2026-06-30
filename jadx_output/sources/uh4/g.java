package uh4;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f427979d = 0;

    public g(uh4.h hVar, uh4.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f427979d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f427979d;
        this.f427979d = i17 + 1;
        if (i17 == 0) {
            return th4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
