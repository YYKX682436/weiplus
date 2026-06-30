package og5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f345171d = 0;

    public b(og5.c cVar, og5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f345171d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f345171d;
        this.f345171d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.bb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
