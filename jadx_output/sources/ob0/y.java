package ob0;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343979d = 0;

    public y(ob0.z zVar, ob0.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343979d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343979d;
        this.f343979d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
