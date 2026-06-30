package r45;

/* loaded from: classes2.dex */
public class ar6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370231d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370232e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370233f;

    /* renamed from: g, reason: collision with root package name */
    public int f370234g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ar6)) {
            return false;
        }
        r45.ar6 ar6Var = (r45.ar6) fVar;
        return n51.f.a(this.f370231d, ar6Var.f370231d) && n51.f.a(this.f370232e, ar6Var.f370232e) && n51.f.a(this.f370233f, ar6Var.f370233f) && n51.f.a(java.lang.Integer.valueOf(this.f370234g), java.lang.Integer.valueOf(ar6Var.f370234g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f370231d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            java.lang.String str = this.f370232e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f370233f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            fVar.e(4, this.f370234g);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.f370231d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            java.lang.String str2 = this.f370232e;
            if (str2 != null) {
                b17 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f370233f;
            if (gVar4 != null) {
                b17 += b36.f.b(3, gVar4);
            }
            return b17 + b36.f.e(4, this.f370234g);
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
        r45.ar6 ar6Var = (r45.ar6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ar6Var.f370231d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            ar6Var.f370232e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ar6Var.f370233f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ar6Var.f370234g = aVar2.g(intValue);
        return 0;
    }
}
