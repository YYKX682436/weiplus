package gi;

/* loaded from: classes12.dex */
public class a1 extends java.util.ArrayList {
    public a1(gi.b1 b1Var) {
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        m3.d dVar = (m3.d) obj;
        if (size() >= 10) {
            remove(0);
        }
        super.add(i17, dVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        m3.d dVar = (m3.d) obj;
        if (size() >= 10) {
            remove(0);
        }
        return super.add(dVar);
    }
}
