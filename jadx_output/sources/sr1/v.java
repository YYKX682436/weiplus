package sr1;

/* loaded from: classes.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f411492d = 0;

    public v(sr1.w wVar, sr1.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f411492d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f411492d;
        this.f411492d = i17 + 1;
        if (i17 == 0) {
            return sr1.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
