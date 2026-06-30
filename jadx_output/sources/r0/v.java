package r0;

/* loaded from: classes14.dex */
public abstract class v implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f367992d;

    /* renamed from: e, reason: collision with root package name */
    public int f367993e;

    /* renamed from: f, reason: collision with root package name */
    public int f367994f;

    public v() {
        r0.u uVar = r0.u.f367987e;
        this.f367992d = r0.u.f367987e.f367991d;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f367994f < this.f367993e;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
