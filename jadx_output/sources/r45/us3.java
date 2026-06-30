package r45;

/* loaded from: classes2.dex */
public class us3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public double f387611d;

    /* renamed from: e, reason: collision with root package name */
    public double f387612e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.us3)) {
            return false;
        }
        r45.us3 us3Var = (r45.us3) fVar;
        return n51.f.a(this.BaseRequest, us3Var.BaseRequest) && n51.f.a(java.lang.Double.valueOf(this.f387611d), java.lang.Double.valueOf(us3Var.f387611d)) && n51.f.a(java.lang.Double.valueOf(this.f387612e), java.lang.Double.valueOf(us3Var.f387612e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.c(2, this.f387611d);
            fVar.c(3, this.f387612e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.c(2, this.f387611d) + b36.f.c(3, this.f387612e);
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
        r45.us3 us3Var = (r45.us3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                us3Var.f387611d = aVar2.e(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            us3Var.f387612e = aVar2.e(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            us3Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
