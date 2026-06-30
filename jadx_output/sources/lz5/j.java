package lz5;

/* loaded from: classes14.dex */
public abstract class j {

    /* renamed from: d, reason: collision with root package name */
    public final lz5.m f322400d;

    /* renamed from: e, reason: collision with root package name */
    public int f322401e;

    /* renamed from: f, reason: collision with root package name */
    public int f322402f;

    /* renamed from: g, reason: collision with root package name */
    public int f322403g;

    public j(lz5.m map) {
        kotlin.jvm.internal.o.g(map, "map");
        this.f322400d = map;
        this.f322402f = -1;
        this.f322403g = map.f322412n;
        c();
    }

    public final void b() {
        if (this.f322400d.f322412n != this.f322403g) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final void c() {
        while (true) {
            int i17 = this.f322401e;
            lz5.m mVar = this.f322400d;
            if (i17 >= mVar.f322410i || mVar.f322407f[i17] >= 0) {
                return;
            } else {
                this.f322401e = i17 + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.f322401e < this.f322400d.f322410i;
    }

    public final void remove() {
        b();
        if (!(this.f322402f != -1)) {
            throw new java.lang.IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
        lz5.m mVar = this.f322400d;
        mVar.c();
        mVar.l(this.f322402f);
        this.f322402f = -1;
        this.f322403g = mVar.f322412n;
    }
}
