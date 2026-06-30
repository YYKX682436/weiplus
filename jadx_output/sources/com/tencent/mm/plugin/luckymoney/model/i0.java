package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class i0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145328d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f145329e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.i0)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.i0 i0Var = (com.tencent.mm.plugin.luckymoney.model.i0) fVar;
        return n51.f.a(this.f145328d, i0Var.f145328d) && n51.f.a(this.f145329e, i0Var.f145329e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f145329e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f145328d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f145328d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        com.tencent.mm.plugin.luckymoney.model.i0 i0Var = (com.tencent.mm.plugin.luckymoney.model.i0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i0Var.f145328d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.tencent.mm.plugin.luckymoney.model.k kVar = new com.tencent.mm.plugin.luckymoney.model.k();
            if (bArr2 != null && bArr2.length > 0) {
                kVar.parseFrom(bArr2);
            }
            i0Var.f145329e.add(kVar);
        }
        return 0;
    }
}
