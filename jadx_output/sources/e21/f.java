package e21;

/* loaded from: classes5.dex */
public class f implements xg3.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f246514d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f246515e = new android.util.SparseArray();

    public void a(int i17, xg3.d0 d0Var, boolean z17) {
        android.util.SparseArray sparseArray = this.f246514d;
        if (sparseArray.indexOfKey(i17) < 0) {
            sparseArray.put(i17, new java.util.LinkedList());
        }
        if (z17) {
            ((java.util.LinkedList) sparseArray.get(i17)).add(d0Var);
        } else {
            if (((java.util.LinkedList) sparseArray.get(i17)).contains(d0Var)) {
                return;
            }
            ((java.util.LinkedList) sparseArray.get(i17)).add(d0Var);
        }
    }

    public void b(xg3.q0 q0Var) {
        if (gm0.j1.n().f273288b == null || gm0.j1.n().f273288b.f70764d == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(q0Var);
        c(arrayList);
    }

    public void c(java.util.ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        e21.j jVar = new e21.j(arrayList);
        gm0.j1.i();
        jVar.doScene(gm0.j1.n().f273288b.f70764d, new e21.e(this, arrayList));
    }
}
