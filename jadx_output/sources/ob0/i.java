package ob0;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343909d = 0;

    public i(ob0.j jVar, ob0.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343909d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343909d;
        this.f343909d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.adpf.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
