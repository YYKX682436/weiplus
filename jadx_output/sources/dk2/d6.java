package dk2;

/* loaded from: classes3.dex */
public final class d6 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f233320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f233321e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(zy2.i5 i5Var, gk2.e eVar) {
        super(4);
        this.f233320d = i5Var;
        this.f233321e = eVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        zy2.i5 i5Var = this.f233320d;
        if (intValue2 == 0 && intValue == 0) {
            java.util.ArrayList arrayList = ((mm2.f5) ((mm2.c1) this.f233321e.a(mm2.c1.class)).business(mm2.f5.class)).f329024f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.xn1 xn1Var = (r45.xn1) it.next();
                r45.rz1 rz1Var = new r45.rz1();
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
                rz1Var.set(0, finderContact != null ? finderContact.getNickname() : null);
                rz1Var.set(1, java.lang.Integer.valueOf((int) xn1Var.getLong(15)));
                arrayList2.add(rz1Var);
            }
            i5Var.a(arrayList2);
        } else {
            i5Var.a(kz5.p0.f313996d);
        }
        return jz5.f0.f302826a;
    }
}
