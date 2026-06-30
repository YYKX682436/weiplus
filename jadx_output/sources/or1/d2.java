package or1;

/* loaded from: classes12.dex */
public class d2 extends or1.m {

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f347473t;

    /* renamed from: u, reason: collision with root package name */
    public final android.util.SparseArray f347474u;

    /* renamed from: v, reason: collision with root package name */
    public int f347475v;

    public d2(android.content.Context context) {
        super(context);
        this.f347473t = null;
        this.f347474u = new android.util.SparseArray();
        this.f347536s = new or1.c2(this);
    }

    @Override // or1.m, fb5.e
    public java.lang.Object[] a(int i17) {
        or1.k l17 = l(i17);
        r45.qp j17 = j(i17);
        if (l17 == null) {
            return super.a(i17);
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this;
        objArr[1] = l17.f347517d;
        objArr[2] = java.lang.Integer.valueOf(i17 < this.f347475v ? 39 : 56);
        objArr[3] = j17 != null ? j17.f384160m : "";
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb5.e, android.widget.Adapter
    /* renamed from: c */
    public fb5.c getItem(int i17) {
        java.lang.Object obj;
        java.lang.String str;
        r45.fx5 fx5Var;
        int i18 = this.f347528h;
        if (i18 != 0) {
            return super.getItem(i17);
        }
        android.util.SparseArray sparseArray = this.f347474u;
        pr1.a aVar = (pr1.a) sparseArray.get(i17);
        if (aVar != null || this.f347473t.size() <= 0) {
            return aVar;
        }
        java.util.Iterator it = this.f347473t.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = 0;
                break;
            }
            r45.cl5 cl5Var = (r45.cl5) it.next();
            if (i18 == i17) {
                r45.du5 du5Var = cl5Var.f371656d;
                obj = du5Var != null ? du5Var.f372756d : null;
                fx5Var = (r45.fx5) cl5Var.f371658f.get(0);
            } else {
                int size = cl5Var.f371658f.size() + i18;
                java.util.LinkedList linkedList = cl5Var.f371658f;
                if (i17 < size) {
                    fx5Var = (r45.fx5) linkedList.get(i17 - i18);
                    break;
                }
                i18 += linkedList.size();
            }
        }
        java.lang.Object obj2 = obj;
        obj = fx5Var;
        str = obj2;
        or1.f fVar = new or1.f(obj, str);
        fVar.f357932f = i17;
        fVar.f357931e = i17;
        sparseArray.put(i17, fVar);
        return fVar;
    }

    @Override // or1.m
    public void f(r45.qp qpVar, boolean z17) {
        super.f(qpVar, z17);
        if (this.f347475v == 0) {
            this.f347475v = this.f347528h;
        }
    }

    @Override // or1.m
    public void g() {
        super.g();
    }

    @Override // or1.m, fb5.e, android.widget.Adapter
    public int getCount() {
        java.util.List<r45.cl5> list;
        java.util.LinkedList linkedList;
        int i17 = this.f347528h;
        if (i17 == 0 && (list = this.f347473t) != null) {
            for (r45.cl5 cl5Var : list) {
                if (cl5Var != null && (linkedList = cl5Var.f371658f) != null) {
                    i17 += linkedList.size();
                }
            }
        }
        return i17;
    }

    @Override // or1.m
    public void n(java.lang.String str, java.util.List list) {
        super.n(str, list);
        this.f347475v = this.f347528h;
    }
}
