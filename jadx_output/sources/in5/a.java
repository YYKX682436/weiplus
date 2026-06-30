package in5;

/* loaded from: classes10.dex */
public final class a extends androidx.recyclerview.widget.y2 {

    /* renamed from: c, reason: collision with root package name */
    public final int f293000c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f293001d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f293002e = new java.util.LinkedList();

    public a(int i17) {
        this.f293000c = i17;
    }

    @Override // androidx.recyclerview.widget.y2
    public void a() {
        super.a();
        android.util.SparseArray sparseArray = this.f293001d;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            sparseArray.keyAt(i17);
            ((in5.b) sparseArray.valueAt(i17)).f293009a.clear();
        }
        this.f293002e.clear();
    }

    @Override // androidx.recyclerview.widget.y2
    public androidx.recyclerview.widget.k3 b(int i17) {
        in5.b bVar = (in5.b) this.f293001d.get(i17);
        if (bVar == null) {
            return null;
        }
        java.util.LinkedList linkedList = bVar.f293009a;
        if (!(!linkedList.isEmpty())) {
            return null;
        }
        androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) linkedList.removeLast();
        this.f293002e.remove(k3Var);
        return k3Var;
    }

    @Override // androidx.recyclerview.widget.y2
    public void d(androidx.recyclerview.widget.k3 scrap) {
        kotlin.jvm.internal.o.g(scrap, "scrap");
        int itemViewType = scrap.getItemViewType();
        android.util.SparseArray sparseArray = this.f293001d;
        in5.b bVar = (in5.b) sparseArray.get(itemViewType);
        if (bVar == null) {
            bVar = new in5.b();
            sparseArray.put(itemViewType, bVar);
        }
        bVar.f293009a.add(scrap);
        java.util.LinkedList linkedList = this.f293002e;
        linkedList.add(scrap);
        if (linkedList.size() > this.f293000c) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) linkedList.removeFirst();
            ((in5.b) sparseArray.get(k3Var.getItemViewType())).f293009a.remove(k3Var);
        }
    }
}
