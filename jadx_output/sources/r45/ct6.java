package r45;

/* loaded from: classes2.dex */
public class ct6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371829d;

    /* renamed from: e, reason: collision with root package name */
    public int f371830e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ct6)) {
            return false;
        }
        r45.ct6 ct6Var = (r45.ct6) fVar;
        return n51.f.a(this.BaseRequest, ct6Var.BaseRequest) && n51.f.a(this.f371829d, ct6Var.f371829d) && n51.f.a(java.lang.Integer.valueOf(this.f371830e), java.lang.Integer.valueOf(ct6Var.f371830e));
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
            java.lang.String str = this.f371829d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f371830e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f371829d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f371830e);
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
        r45.ct6 ct6Var = (r45.ct6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                ct6Var.f371829d = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            ct6Var.f371830e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            ct6Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
