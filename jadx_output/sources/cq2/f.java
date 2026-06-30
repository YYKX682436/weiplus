package cq2;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f221379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f221380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f221381f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ys5.e f221382g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f221383h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i17, int i18, com.tencent.mm.protobuf.g gVar, ys5.e eVar, r45.fa2 fa2Var) {
        super(0);
        this.f221379d = i17;
        this.f221380e = i18;
        this.f221381f = gVar;
        this.f221382g = eVar;
        this.f221383h = fa2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f221379d;
        int i18 = this.f221380e;
        com.tencent.mm.protobuf.g gVar = this.f221381f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.u80 u80Var = new r45.u80();
        u80Var.set(0, java.lang.Integer.valueOf(this.f221380e));
        r45.fa2 fa2Var = this.f221383h;
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
        linkedList.add(u80Var);
        return new aq2.b(new aq2.a(i17, i18, gVar, "", linkedList, 135, 0L, null, null, 0, 0.0f, this.f221382g == ys5.e.f465257e, null, null, null, false, null, 128960, null), null, null, 6, null);
    }
}
