package r45;

/* loaded from: classes2.dex */
public class u11 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f386925d;

    /* renamed from: e, reason: collision with root package name */
    public r45.qb1 f386926e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u11)) {
            return false;
        }
        r45.u11 u11Var = (r45.u11) fVar;
        return n51.f.a(this.f386925d, u11Var.f386925d) && n51.f.a(this.f386926e, u11Var.f386926e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f386925d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            r45.qb1 qb1Var = this.f386926e;
            if (qb1Var != null) {
                fVar.i(2, qb1Var.computeSize());
                this.f386926e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.f386925d;
            int b17 = gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0;
            r45.qb1 qb1Var2 = this.f386926e;
            return qb1Var2 != null ? b17 + b36.f.i(2, qb1Var2.computeSize()) : b17;
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
        r45.u11 u11Var = (r45.u11) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u11Var.f386925d = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.qb1 qb1Var3 = new r45.qb1();
            if (bArr != null && bArr.length > 0) {
                qb1Var3.parseFrom(bArr);
            }
            u11Var.f386926e = qb1Var3;
        }
        return 0;
    }
}
