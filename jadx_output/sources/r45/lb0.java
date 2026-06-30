package r45;

/* loaded from: classes4.dex */
public class lb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379285d;

    /* renamed from: e, reason: collision with root package name */
    public int f379286e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379287f;

    /* renamed from: g, reason: collision with root package name */
    public int f379288g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lb0)) {
            return false;
        }
        r45.lb0 lb0Var = (r45.lb0) fVar;
        return n51.f.a(this.f379285d, lb0Var.f379285d) && n51.f.a(java.lang.Integer.valueOf(this.f379286e), java.lang.Integer.valueOf(lb0Var.f379286e)) && n51.f.a(this.f379287f, lb0Var.f379287f) && n51.f.a(java.lang.Integer.valueOf(this.f379288g), java.lang.Integer.valueOf(lb0Var.f379288g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379285d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f379286e);
            com.tencent.mm.protobuf.g gVar = this.f379287f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f379288g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f379285d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f379286e);
            com.tencent.mm.protobuf.g gVar2 = this.f379287f;
            if (gVar2 != null) {
                j17 += b36.f.b(3, gVar2);
            }
            return j17 + b36.f.e(4, this.f379288g);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.lb0 lb0Var = (r45.lb0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lb0Var.f379285d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            lb0Var.f379286e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            lb0Var.f379287f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        lb0Var.f379288g = aVar2.g(intValue);
        return 0;
    }
}
