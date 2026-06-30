package r45;

/* loaded from: classes4.dex */
public class a25 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369668d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369669e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f369670f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a25)) {
            return false;
        }
        r45.a25 a25Var = (r45.a25) fVar;
        return n51.f.a(this.BaseRequest, a25Var.BaseRequest) && n51.f.a(this.f369668d, a25Var.f369668d) && n51.f.a(this.f369669e, a25Var.f369669e) && n51.f.a(this.f369670f, a25Var.f369670f);
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
            java.lang.String str = this.f369668d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f369669e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f369670f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f369668d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f369669e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f369670f;
            return gVar2 != null ? i18 + b36.f.b(4, gVar2) : i18;
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
        r45.a25 a25Var = (r45.a25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                a25Var.f369668d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                a25Var.f369669e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            a25Var.f369670f = aVar2.d(intValue);
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
            a25Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
