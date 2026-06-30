package r45;

/* loaded from: classes2.dex */
public class uf3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f387320d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f387321e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uf3)) {
            return false;
        }
        r45.uf3 uf3Var = (r45.uf3) fVar;
        return n51.f.a(this.BaseResponse, uf3Var.BaseResponse) && n51.f.a(java.lang.Boolean.valueOf(this.f387320d), java.lang.Boolean.valueOf(uf3Var.f387320d)) && n51.f.a(this.f387321e, uf3Var.f387321e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.a(2, this.f387320d);
            com.tencent.mm.protobuf.g gVar = this.f387321e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.a(2, this.f387320d);
            com.tencent.mm.protobuf.g gVar2 = this.f387321e;
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
        r45.uf3 uf3Var = (r45.uf3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                uf3Var.f387320d = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            uf3Var.f387321e = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            uf3Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
