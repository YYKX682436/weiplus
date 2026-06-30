package ja2;

/* loaded from: classes9.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f298610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f298611b;

    public b(yz5.l lVar, yz5.a aVar) {
        this.f298610a = lVar;
        this.f298611b = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList<r45.aa5> list;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.ml3 ml3Var = (r45.ml3) fVar.f70618d;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.z95 z95Var = (r45.z95) ml3Var.getCustom(1);
            if (z95Var != null && (list = z95Var.getList(0)) != null) {
                for (r45.aa5 aa5Var : list) {
                    bw5.bh0 bh0Var = new bw5.bh0();
                    bh0Var.f25670d = aa5Var.getString(0);
                    boolean[] zArr = bh0Var.f25673g;
                    zArr[1] = true;
                    bh0Var.f25671e = aa5Var.getString(1);
                    zArr[2] = true;
                    bh0Var.f25672f = aa5Var.getString(2);
                    zArr[3] = true;
                    linkedList.add(bh0Var);
                }
            }
            bw5.ah0 ah0Var = new bw5.ah0();
            ah0Var.f25201d = linkedList;
            ah0Var.f25202e[1] = true;
            this.f298610a.invoke(ah0Var);
        } else {
            this.f298611b.invoke();
        }
        return jz5.f0.f302826a;
    }
}
