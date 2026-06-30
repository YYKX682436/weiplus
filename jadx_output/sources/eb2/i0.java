package eb2;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.n3 f250774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f250775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f250776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ db2.c3 f250777g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(db2.n3 n3Var, int i17, java.util.List list, db2.c3 c3Var) {
        super(0);
        this.f250774d = n3Var;
        this.f250775e = i17;
        this.f250776f = list;
        this.f250777g = c3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tabType=");
        sb6.append(this.f250774d.f228079d);
        sb6.append(" pullType=");
        sb6.append(this.f250775e);
        sb6.append(" valid=");
        sb6.append(this.f250776f.size());
        sb6.append(" raw=");
        db2.c3 c3Var = this.f250777g;
        sb6.append(c3Var.getList(1).size());
        sb6.append(' ');
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("invalidFeed=");
        java.util.LinkedList list = c3Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            kotlin.jvm.internal.o.d((com.tencent.mm.protocal.protobuf.FinderObject) obj);
            if (!hc2.o0.C(r6)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(pm0.v.u(finderObject.getId()));
            sb8.append('#');
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
            sb8.append(objectDesc != null ? java.lang.Integer.valueOf(objectDesc.getMediaType()) : null);
            arrayList2.add(sb8.toString());
        }
        sb7.append(arrayList2);
        sb6.append(r26.i0.v(sb7.toString(), ",", ";", false, 4, null));
        return sb6.toString();
    }
}
