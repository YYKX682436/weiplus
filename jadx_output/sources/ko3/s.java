package ko3;

/* loaded from: classes13.dex */
public final class s extends android.util.SparseArray {
    public s(ko3.t tVar, ko3.f fVar) {
    }

    @Override // android.util.SparseArray
    public void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.util.SparseArray
    public void put(int i17, java.lang.Object obj) {
        if (get(i17) != null) {
            throw new java.lang.UnsupportedOperationException();
        }
        super.put(i17, obj);
    }
}
