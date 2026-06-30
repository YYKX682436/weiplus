package mf3;

/* loaded from: classes3.dex */
public final class f extends java.util.ArrayList implements mf3.i {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof mf3.k) {
            return super.contains((mf3.k) obj);
        }
        return false;
    }

    public int d() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof mf3.k) {
            return super.indexOf((mf3.k) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof mf3.k) {
            return super.lastIndexOf((mf3.k) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof mf3.k) {
            return super.remove((mf3.k) obj);
        }
        return false;
    }
}
