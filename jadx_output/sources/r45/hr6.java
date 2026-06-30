package r45;

/* loaded from: classes2.dex */
public class hr6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.nv3 f376401d;

    /* renamed from: e, reason: collision with root package name */
    public int f376402e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hr6)) {
            return false;
        }
        r45.hr6 hr6Var = (r45.hr6) fVar;
        return n51.f.a(this.BaseRequest, hr6Var.BaseRequest) && n51.f.a(this.f376401d, hr6Var.f376401d) && n51.f.a(java.lang.Integer.valueOf(this.f376402e), java.lang.Integer.valueOf(hr6Var.f376402e));
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
            r45.nv3 nv3Var = this.f376401d;
            if (nv3Var != null) {
                fVar.i(2, nv3Var.computeSize());
                this.f376401d.writeFields(fVar);
            }
            fVar.e(4, this.f376402e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.nv3 nv3Var2 = this.f376401d;
            if (nv3Var2 != null) {
                i18 += b36.f.i(2, nv3Var2.computeSize());
            }
            return i18 + b36.f.e(4, this.f376402e);
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
        r45.hr6 hr6Var = (r45.hr6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                hr6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 4) {
                return -1;
            }
            hr6Var.f376402e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.nv3 nv3Var3 = new r45.nv3();
            if (bArr2 != null && bArr2.length > 0) {
                nv3Var3.parseFrom(bArr2);
            }
            hr6Var.f376401d = nv3Var3;
        }
        return 0;
    }
}
