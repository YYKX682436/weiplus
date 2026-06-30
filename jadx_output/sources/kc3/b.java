package kc3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f306553d = 0;

    public b(kc3.c cVar, kc3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f306553d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f306553d;
        this.f306553d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.u5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
