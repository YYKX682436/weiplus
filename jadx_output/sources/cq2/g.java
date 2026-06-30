package cq2;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f221384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f221385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f221386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f221387g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ aq2.k f221388h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, int i18, com.tencent.mm.protobuf.g gVar, r45.fa2 fa2Var, aq2.k kVar) {
        super(0);
        this.f221384d = i17;
        this.f221385e = i18;
        this.f221386f = gVar;
        this.f221387g = fa2Var;
        this.f221388h = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        r45.dk2 dk2Var;
        java.util.LinkedList list;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.LinkedList linkedList;
        r45.na2 na2Var;
        r45.dd2 dd2Var;
        int i18 = this.f221384d;
        int i19 = this.f221385e;
        com.tencent.mm.protobuf.g gVar = this.f221386f;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.u80 u80Var = new r45.u80();
        u80Var.set(0, java.lang.Integer.valueOf(this.f221385e));
        r45.fa2 fa2Var = this.f221387g;
        u80Var.set(1, fa2Var.f374132n);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList card_list = fa2Var.f374129h;
        kotlin.jvm.internal.o.f(card_list, "card_list");
        java.util.Iterator it = card_list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.ea2) it.next()).getCustom(2);
            if (finderObject != null && finderObject.getId() != 0) {
                arrayList.add(java.lang.Long.valueOf(finderObject.getId()));
            }
        }
        u80Var.getList(2).addAll(arrayList);
        u80Var.set(3, java.lang.Integer.valueOf(card_list.size()));
        linkedList2.add(u80Var);
        r45.dd2 dd2Var2 = new r45.dd2();
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) this.f221388h.f36361b;
        if (fVar != null && (dk2Var = (r45.dk2) fVar.f70618d) != null && (list = dk2Var.getList(1)) != null) {
            java.util.Iterator it6 = list.iterator();
            while (true) {
                obj = null;
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it6.next();
                if (((r45.fa2) obj2).f374126e == 12) {
                    break;
                }
            }
            r45.fa2 fa2Var2 = (r45.fa2) obj2;
            if (fa2Var2 != null && (linkedList = fa2Var2.f374129h) != null) {
                java.util.Iterator it7 = linkedList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it7.next();
                    if (((r45.ea2) next).getInteger(1) == 7) {
                        obj = next;
                        break;
                    }
                }
                r45.ea2 ea2Var = (r45.ea2) obj;
                if (ea2Var != null && (na2Var = (r45.na2) ea2Var.getCustom(6)) != null && (dd2Var = (r45.dd2) na2Var.getCustom(0)) != null) {
                    i17 = dd2Var.getInteger(0);
                    dd2Var2.set(0, java.lang.Integer.valueOf(i17));
                    aq2.a aVar = new aq2.a(i18, i19, gVar, "", linkedList2, 135, 0L, null, dd2Var2, 0, 0.0f, false, null, null, null, false, null, 130624, null);
                    com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", "checkEnterLoadMore: req=" + aVar);
                    return new aq2.c(aVar, null, null, 2, null);
                }
            }
        }
        i17 = 0;
        dd2Var2.set(0, java.lang.Integer.valueOf(i17));
        aq2.a aVar2 = new aq2.a(i18, i19, gVar, "", linkedList2, 135, 0L, null, dd2Var2, 0, 0.0f, false, null, null, null, false, null, 130624, null);
        com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", "checkEnterLoadMore: req=" + aVar2);
        return new aq2.c(aVar2, null, null, 2, null);
    }
}
