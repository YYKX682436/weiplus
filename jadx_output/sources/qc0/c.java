package qc0;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361359d = 0;

    public c(qc0.d dVar, qc0.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361359d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361359d;
        this.f361359d = i17 + 1;
        if (i17 == 0) {
            return pc0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
