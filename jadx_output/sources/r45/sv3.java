package r45;

/* loaded from: classes8.dex */
public class sv3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f385980d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f385981e;

    /* renamed from: f, reason: collision with root package name */
    public int f385982f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sv3)) {
            return false;
        }
        r45.sv3 sv3Var = (r45.sv3) fVar;
        return n51.f.a(this.f385980d, sv3Var.f385980d) && n51.f.a(this.f385981e, sv3Var.f385981e) && n51.f.a(java.lang.Integer.valueOf(this.f385982f), java.lang.Integer.valueOf(sv3Var.f385982f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f385980d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f385981e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            fVar.e(3, this.f385982f);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.f385980d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            com.tencent.mm.protobuf.g gVar4 = this.f385981e;
            if (gVar4 != null) {
                b17 += b36.f.b(2, gVar4);
            }
            return b17 + b36.f.e(3, this.f385982f);
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
        r45.sv3 sv3Var = (r45.sv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sv3Var.f385980d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            sv3Var.f385981e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        sv3Var.f385982f = aVar2.g(intValue);
        return 0;
    }
}
