package kz5;

/* loaded from: classes14.dex */
public abstract class l extends java.util.AbstractList implements java.util.List, zz5.d {
    public abstract int d();

    public abstract java.lang.Object e(int i17);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ java.lang.Object remove(int i17) {
        return e(i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return d();
    }
}
