package r45;

/* loaded from: classes2.dex */
public class i06 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376629d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376630e;

    /* renamed from: f, reason: collision with root package name */
    public int f376631f;

    /* renamed from: g, reason: collision with root package name */
    public int f376632g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i06)) {
            return false;
        }
        r45.i06 i06Var = (r45.i06) fVar;
        return n51.f.a(this.f376629d, i06Var.f376629d) && n51.f.a(this.f376630e, i06Var.f376630e) && n51.f.a(java.lang.Integer.valueOf(this.f376631f), java.lang.Integer.valueOf(i06Var.f376631f)) && n51.f.a(java.lang.Integer.valueOf(this.f376632g), java.lang.Integer.valueOf(i06Var.f376632g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f376629d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            java.lang.String str = this.f376630e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f376631f);
            fVar.e(4, this.f376632g);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.f376629d;
            int b17 = gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0;
            java.lang.String str2 = this.f376630e;
            if (str2 != null) {
                b17 += b36.f.j(2, str2);
            }
            return b17 + b36.f.e(3, this.f376631f) + b36.f.e(4, this.f376632g);
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
        r45.i06 i06Var = (r45.i06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i06Var.f376629d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            i06Var.f376630e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            i06Var.f376631f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        i06Var.f376632g = aVar2.g(intValue);
        return 0;
    }
}
