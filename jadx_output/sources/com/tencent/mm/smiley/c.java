package com.tencent.mm.smiley;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f193223d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.smiley.g1 f193224e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.smiley.c)) {
            return false;
        }
        com.tencent.mm.smiley.c cVar = (com.tencent.mm.smiley.c) fVar;
        return n51.f.a(this.f193223d, cVar.f193223d) && n51.f.a(this.f193224e, cVar.f193224e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f193223d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, linkedList);
            com.tencent.mm.smiley.g1 g1Var = this.f193224e;
            if (g1Var != null) {
                fVar.i(2, g1Var.computeSize());
                this.f193224e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 2, linkedList) + 0;
            com.tencent.mm.smiley.g1 g1Var2 = this.f193224e;
            return g1Var2 != null ? g17 + b36.f.i(2, g1Var2.computeSize()) : g17;
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
        com.tencent.mm.smiley.c cVar = (com.tencent.mm.smiley.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cVar.f193223d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.tencent.mm.smiley.g1 g1Var3 = new com.tencent.mm.smiley.g1();
            if (bArr2 != null && bArr2.length > 0) {
                g1Var3.parseFrom(bArr2);
            }
            cVar.f193224e = g1Var3;
        }
        return 0;
    }
}
