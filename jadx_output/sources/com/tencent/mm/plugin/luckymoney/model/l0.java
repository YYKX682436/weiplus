package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes4.dex */
public class l0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145401d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145402e;

    /* renamed from: f, reason: collision with root package name */
    public int f145403f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.l0)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.l0 l0Var = (com.tencent.mm.plugin.luckymoney.model.l0) fVar;
        return n51.f.a(this.BaseRequest, l0Var.BaseRequest) && n51.f.a(this.f145401d, l0Var.f145401d) && n51.f.a(this.f145402e, l0Var.f145402e) && n51.f.a(java.lang.Integer.valueOf(this.f145403f), java.lang.Integer.valueOf(l0Var.f145403f));
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
            java.lang.String str = this.f145401d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f145402e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f145403f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f145401d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f145402e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f145403f);
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
        com.tencent.mm.plugin.luckymoney.model.l0 l0Var = (com.tencent.mm.plugin.luckymoney.model.l0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                l0Var.f145401d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                l0Var.f145402e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            l0Var.f145403f = aVar2.g(intValue);
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
            l0Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
