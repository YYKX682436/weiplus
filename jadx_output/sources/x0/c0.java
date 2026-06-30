package x0;

/* loaded from: classes14.dex */
public abstract class c0 implements java.util.Set, zz5.g {

    /* renamed from: d, reason: collision with root package name */
    public final x0.l0 f450868d;

    public c0(x0.l0 map) {
        kotlin.jvm.internal.o.g(map, "map");
        this.f450868d = map;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f450868d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f450868d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f450868d.size();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }
}
