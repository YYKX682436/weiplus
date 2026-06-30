package r45;

/* loaded from: classes4.dex */
public class id4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376951d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376952e;

    /* renamed from: f, reason: collision with root package name */
    public int f376953f;

    /* renamed from: g, reason: collision with root package name */
    public int f376954g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.id4)) {
            return false;
        }
        r45.id4 id4Var = (r45.id4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376951d), java.lang.Integer.valueOf(id4Var.f376951d)) && n51.f.a(this.f376952e, id4Var.f376952e) && n51.f.a(java.lang.Integer.valueOf(this.f376953f), java.lang.Integer.valueOf(id4Var.f376953f)) && n51.f.a(java.lang.Integer.valueOf(this.f376954g), java.lang.Integer.valueOf(id4Var.f376954g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376951d);
            java.lang.String str = this.f376952e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f376953f);
            fVar.e(4, this.f376954g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376951d) + 0;
            java.lang.String str2 = this.f376952e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f376953f) + b36.f.e(4, this.f376954g);
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
        r45.id4 id4Var = (r45.id4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            id4Var.f376951d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            id4Var.f376952e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            id4Var.f376953f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        id4Var.f376954g = aVar2.g(intValue);
        return 0;
    }
}
