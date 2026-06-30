package r45;

/* loaded from: classes2.dex */
public class br5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371008d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371009e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.br5)) {
            return false;
        }
        r45.br5 br5Var = (r45.br5) fVar;
        return n51.f.a(this.BaseRequest, br5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f371008d), java.lang.Integer.valueOf(br5Var.f371008d)) && n51.f.a(this.f371009e, br5Var.f371009e);
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
            fVar.e(2, this.f371008d);
            com.tencent.mm.protobuf.g gVar = this.f371009e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f371008d);
            com.tencent.mm.protobuf.g gVar2 = this.f371009e;
            return gVar2 != null ? i18 + b36.f.b(3, gVar2) : i18;
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
        r45.br5 br5Var = (r45.br5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                br5Var.f371008d = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            br5Var.f371009e = aVar2.d(intValue);
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
            br5Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
