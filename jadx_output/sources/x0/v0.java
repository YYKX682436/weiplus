package x0;

/* loaded from: classes14.dex */
public abstract class v0 {

    /* renamed from: d, reason: collision with root package name */
    public final x0.l0 f450952d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Iterator f450953e;

    /* renamed from: f, reason: collision with root package name */
    public int f450954f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map.Entry f450955g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Map.Entry f450956h;

    public v0(x0.l0 map, java.util.Iterator iterator) {
        kotlin.jvm.internal.o.g(map, "map");
        kotlin.jvm.internal.o.g(iterator, "iterator");
        this.f450952d = map;
        this.f450953e = iterator;
        this.f450954f = map.b().f450902d;
        b();
    }

    public final void b() {
        this.f450955g = this.f450956h;
        java.util.Iterator it = this.f450953e;
        this.f450956h = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
    }

    public final boolean hasNext() {
        return this.f450956h != null;
    }

    public final void remove() {
        x0.l0 l0Var = this.f450952d;
        if (l0Var.b().f450902d != this.f450954f) {
            throw new java.util.ConcurrentModificationException();
        }
        java.util.Map.Entry entry = this.f450955g;
        if (entry == null) {
            throw new java.lang.IllegalStateException();
        }
        l0Var.remove(entry.getKey());
        this.f450955g = null;
        this.f450954f = l0Var.b().f450902d;
    }
}
