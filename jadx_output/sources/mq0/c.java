package mq0;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f330544d = 0;

    public c(mq0.d dVar, mq0.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f330544d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f330544d;
        this.f330544d = i17 + 1;
        if (i17 == 0) {
            return mq0.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
