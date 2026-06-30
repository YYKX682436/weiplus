package lz5;

/* loaded from: classes14.dex */
public final class l extends lz5.j implements java.util.Iterator, zz5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(lz5.m map) {
        super(map);
        kotlin.jvm.internal.o.g(map, "map");
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        b();
        int i17 = this.f322401e;
        lz5.m mVar = this.f322400d;
        if (i17 >= mVar.f322410i) {
            throw new java.util.NoSuchElementException();
        }
        this.f322401e = i17 + 1;
        this.f322402f = i17;
        java.lang.Object[] objArr = mVar.f322406e;
        kotlin.jvm.internal.o.d(objArr);
        java.lang.Object obj = objArr[this.f322402f];
        c();
        return obj;
    }
}
