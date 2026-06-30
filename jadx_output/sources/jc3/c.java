package jc3;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f298958d = 0;

    public c(jc3.d dVar, jc3.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f298958d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f298958d;
        this.f298958d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.e7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
