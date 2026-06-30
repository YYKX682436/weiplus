package r45;

/* loaded from: classes4.dex */
public class u90 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387151d;

    /* renamed from: e, reason: collision with root package name */
    public r45.j53 f387152e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u90)) {
            return false;
        }
        r45.u90 u90Var = (r45.u90) fVar;
        return n51.f.a(this.BaseRequest, u90Var.BaseRequest) && n51.f.a(this.f387151d, u90Var.f387151d) && n51.f.a(this.f387152e, u90Var.f387152e);
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
            java.lang.String str = this.f387151d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.j53 j53Var = this.f387152e;
            if (j53Var != null) {
                fVar.i(3, j53Var.computeSize());
                this.f387152e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f387151d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.j53 j53Var2 = this.f387152e;
            return j53Var2 != null ? i18 + b36.f.i(3, j53Var2.computeSize()) : i18;
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
        r45.u90 u90Var = (r45.u90) objArr[1];
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
                u90Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            u90Var.f387151d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.j53 j53Var3 = new r45.j53();
            if (bArr2 != null && bArr2.length > 0) {
                j53Var3.parseFrom(bArr2);
            }
            u90Var.f387152e = j53Var3;
        }
        return 0;
    }
}
