package df3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f232015d = 0;

    public b(df3.c cVar, df3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f232015d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f232015d;
        this.f232015d = i17 + 1;
        if (i17 == 0) {
            return df3.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
