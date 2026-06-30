package r45;

/* loaded from: classes2.dex */
public class tx5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.nv3 f386856d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386857e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tx5)) {
            return false;
        }
        r45.tx5 tx5Var = (r45.tx5) fVar;
        return n51.f.a(this.BaseRequest, tx5Var.BaseRequest) && n51.f.a(this.f386856d, tx5Var.f386856d) && n51.f.a(this.f386857e, tx5Var.f386857e);
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
            r45.nv3 nv3Var = this.f386856d;
            if (nv3Var != null) {
                fVar.i(2, nv3Var.computeSize());
                this.f386856d.writeFields(fVar);
            }
            java.lang.String str = this.f386857e;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.nv3 nv3Var2 = this.f386856d;
            if (nv3Var2 != null) {
                i18 += b36.f.i(2, nv3Var2.computeSize());
            }
            java.lang.String str2 = this.f386857e;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        r45.tx5 tx5Var = (r45.tx5) objArr[1];
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
                tx5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            tx5Var.f386857e = aVar2.k(intValue);
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
            tx5Var.f386856d = nv3Var3;
        }
        return 0;
    }
}
