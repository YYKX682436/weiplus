package r45;

/* loaded from: classes4.dex */
public class l26 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.td5 f379100d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379101e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l26)) {
            return false;
        }
        r45.l26 l26Var = (r45.l26) fVar;
        return n51.f.a(this.BaseRequest, l26Var.BaseRequest) && n51.f.a(this.f379100d, l26Var.f379100d) && n51.f.a(this.f379101e, l26Var.f379101e);
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
            r45.td5 td5Var = this.f379100d;
            if (td5Var != null) {
                fVar.i(2, td5Var.computeSize());
                this.f379100d.writeFields(fVar);
            }
            java.lang.String str = this.f379101e;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.td5 td5Var2 = this.f379100d;
            if (td5Var2 != null) {
                i18 += b36.f.i(2, td5Var2.computeSize());
            }
            java.lang.String str2 = this.f379101e;
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
        r45.l26 l26Var = (r45.l26) objArr[1];
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
                l26Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            l26Var.f379101e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.td5 td5Var3 = new r45.td5();
            if (bArr2 != null && bArr2.length > 0) {
                td5Var3.parseFrom(bArr2);
            }
            l26Var.f379100d = td5Var3;
        }
        return 0;
    }
}
