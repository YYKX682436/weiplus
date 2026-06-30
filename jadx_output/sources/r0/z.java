package r0;

/* loaded from: classes14.dex */
public final class z extends r0.v {

    /* renamed from: g, reason: collision with root package name */
    public final r0.i f367995g;

    public z(r0.i parentIterator) {
        kotlin.jvm.internal.o.g(parentIterator, "parentIterator");
        this.f367995g = parentIterator;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f367994f + 2;
        this.f367994f = i17;
        java.lang.Object[] objArr = this.f367992d;
        return new r0.c(this.f367995g, objArr[i17 - 2], objArr[i17 - 1]);
    }
}
