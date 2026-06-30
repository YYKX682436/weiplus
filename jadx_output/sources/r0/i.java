package r0;

/* loaded from: classes14.dex */
public final class i implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final r0.g f367979d;

    public i(r0.f builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        r0.v[] vVarArr = new r0.v[8];
        for (int i17 = 0; i17 < 8; i17++) {
            vVarArr[i17] = new r0.z(this);
        }
        this.f367979d = new r0.g(builder, vVarArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f367979d.f367967f;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return (java.util.Map.Entry) this.f367979d.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f367979d.remove();
    }
}
