package m53;

/* loaded from: classes4.dex */
public class j1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323808d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323809e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f323810f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.j1)) {
            return false;
        }
        m53.j1 j1Var = (m53.j1) fVar;
        return n51.f.a(this.BaseRequest, j1Var.BaseRequest) && n51.f.a(this.f323808d, j1Var.f323808d) && n51.f.a(this.f323809e, j1Var.f323809e) && n51.f.a(this.f323810f, j1Var.f323810f);
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
            java.lang.String str = this.f323808d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f323809e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f323810f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f323808d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f323809e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f323810f;
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
        m53.j1 j1Var = (m53.j1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                j1Var.f323808d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                j1Var.f323809e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            j1Var.f323810f = aVar2.d(intValue);
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
            j1Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
