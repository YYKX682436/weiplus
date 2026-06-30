package r45;

/* loaded from: classes4.dex */
public class j06 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377473d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377474e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377475f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377476g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j06)) {
            return false;
        }
        r45.j06 j06Var = (r45.j06) fVar;
        return n51.f.a(this.f377473d, j06Var.f377473d) && n51.f.a(this.f377474e, j06Var.f377474e) && n51.f.a(this.f377475f, j06Var.f377475f) && n51.f.a(this.f377476g, j06Var.f377476g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f377473d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            java.lang.String str = this.f377474e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f377475f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f377476g;
            if (gVar3 != null) {
                fVar.b(4, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar4 = this.f377473d;
            int b17 = gVar4 != null ? 0 + b36.f.b(1, gVar4) : 0;
            java.lang.String str2 = this.f377474e;
            if (str2 != null) {
                b17 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f377475f;
            if (gVar5 != null) {
                b17 += b36.f.b(3, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f377476g;
            return gVar6 != null ? b17 + b36.f.b(4, gVar6) : b17;
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
        r45.j06 j06Var = (r45.j06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j06Var.f377473d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            j06Var.f377474e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            j06Var.f377475f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        j06Var.f377476g = aVar2.d(intValue);
        return 0;
    }
}
