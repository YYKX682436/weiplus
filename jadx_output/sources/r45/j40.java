package r45;

/* loaded from: classes9.dex */
public class j40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377571d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377572e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377573f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377574g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j40)) {
            return false;
        }
        r45.j40 j40Var = (r45.j40) fVar;
        return n51.f.a(this.f377571d, j40Var.f377571d) && n51.f.a(this.f377572e, j40Var.f377572e) && n51.f.a(this.f377573f, j40Var.f377573f) && n51.f.a(this.f377574g, j40Var.f377574g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f377571d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f377572e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f377573f;
            if (gVar3 != null) {
                fVar.b(3, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f377574g;
            if (gVar4 != null) {
                fVar.b(4, gVar4);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar5 = this.f377571d;
            int b17 = gVar5 != null ? 0 + b36.f.b(1, gVar5) : 0;
            com.tencent.mm.protobuf.g gVar6 = this.f377572e;
            if (gVar6 != null) {
                b17 += b36.f.b(2, gVar6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.f377573f;
            if (gVar7 != null) {
                b17 += b36.f.b(3, gVar7);
            }
            com.tencent.mm.protobuf.g gVar8 = this.f377574g;
            return gVar8 != null ? b17 + b36.f.b(4, gVar8) : b17;
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
        r45.j40 j40Var = (r45.j40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j40Var.f377571d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            j40Var.f377572e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            j40Var.f377573f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        j40Var.f377574g = aVar2.d(intValue);
        return 0;
    }
}
