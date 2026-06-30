package r45;

/* loaded from: classes9.dex */
public class uy4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bn6 f387736d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f387737e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f387738f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387739g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uy4)) {
            return false;
        }
        r45.uy4 uy4Var = (r45.uy4) fVar;
        return n51.f.a(this.f387736d, uy4Var.f387736d) && n51.f.a(java.lang.Boolean.valueOf(this.f387737e), java.lang.Boolean.valueOf(uy4Var.f387737e)) && n51.f.a(java.lang.Boolean.valueOf(this.f387738f), java.lang.Boolean.valueOf(uy4Var.f387738f)) && n51.f.a(this.f387739g, uy4Var.f387739g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bn6 bn6Var = this.f387736d;
            if (bn6Var != null) {
                fVar.i(1, bn6Var.computeSize());
                this.f387736d.writeFields(fVar);
            }
            fVar.a(2, this.f387737e);
            fVar.a(3, this.f387738f);
            java.lang.String str = this.f387739g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.bn6 bn6Var2 = this.f387736d;
            int i18 = (bn6Var2 != null ? 0 + b36.f.i(1, bn6Var2.computeSize()) : 0) + b36.f.a(2, this.f387737e) + b36.f.a(3, this.f387738f);
            java.lang.String str2 = this.f387739g;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        r45.uy4 uy4Var = (r45.uy4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                uy4Var.f387737e = aVar2.c(intValue);
                return 0;
            }
            if (intValue == 3) {
                uy4Var.f387738f = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            uy4Var.f387739g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.bn6 bn6Var3 = new r45.bn6();
            if (bArr != null && bArr.length > 0) {
                bn6Var3.parseFrom(bArr);
            }
            uy4Var.f387736d = bn6Var3;
        }
        return 0;
    }
}
