package r45;

/* loaded from: classes4.dex */
public class l80 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379219d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379220e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379221f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l80)) {
            return false;
        }
        r45.l80 l80Var = (r45.l80) fVar;
        return n51.f.a(this.BaseRequest, l80Var.BaseRequest) && n51.f.a(this.f379219d, l80Var.f379219d) && n51.f.a(this.f379220e, l80Var.f379220e) && n51.f.a(this.f379221f, l80Var.f379221f);
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
            com.tencent.mm.protobuf.g gVar = this.f379219d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f379220e;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            java.lang.String str = this.f379221f;
            if (str != null) {
                fVar.j(101, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar3 = this.f379219d;
            if (gVar3 != null) {
                i18 += b36.f.b(2, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f379220e;
            if (gVar4 != null) {
                i18 += b36.f.b(3, gVar4);
            }
            java.lang.String str2 = this.f379221f;
            return str2 != null ? i18 + b36.f.j(101, str2) : i18;
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
        r45.l80 l80Var = (r45.l80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                l80Var.f379219d = aVar2.d(intValue);
                return 0;
            }
            if (intValue == 3) {
                l80Var.f379220e = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 101) {
                return -1;
            }
            l80Var.f379221f = aVar2.k(intValue);
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
            l80Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
