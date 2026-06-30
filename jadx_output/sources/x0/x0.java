package x0;

/* loaded from: classes14.dex */
public final class x0 extends x0.v0 implements java.util.Iterator, zz5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(x0.l0 map, java.util.Iterator iterator) {
        super(map, iterator);
        kotlin.jvm.internal.o.g(map, "map");
        kotlin.jvm.internal.o.g(iterator, "iterator");
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.util.Map.Entry entry = this.f450956h;
        if (entry == null) {
            throw new java.lang.IllegalStateException();
        }
        b();
        return entry.getValue();
    }
}
