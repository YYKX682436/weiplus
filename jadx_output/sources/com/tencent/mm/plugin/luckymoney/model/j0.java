package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes2.dex */
public class j0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f145345d;

    /* renamed from: e, reason: collision with root package name */
    public int f145346e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.j0)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.j0 j0Var = (com.tencent.mm.plugin.luckymoney.model.j0) fVar;
        return n51.f.a(this.BaseRequest, j0Var.BaseRequest) && n51.f.a(this.f145345d, j0Var.f145345d) && n51.f.a(java.lang.Integer.valueOf(this.f145346e), java.lang.Integer.valueOf(j0Var.f145346e));
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
            com.tencent.mm.protobuf.g gVar = this.f145345d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f145346e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f145345d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.e(3, this.f145346e);
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
        com.tencent.mm.plugin.luckymoney.model.j0 j0Var = (com.tencent.mm.plugin.luckymoney.model.j0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                j0Var.f145345d = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            j0Var.f145346e = aVar2.g(intValue);
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
            j0Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
