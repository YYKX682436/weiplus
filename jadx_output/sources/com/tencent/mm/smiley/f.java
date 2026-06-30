package com.tencent.mm.smiley;

/* loaded from: classes2.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f193248d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f193249e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.smiley.f)) {
            return false;
        }
        com.tencent.mm.smiley.f fVar2 = (com.tencent.mm.smiley.f) fVar;
        return n51.f.a(this.f193248d, fVar2.f193248d) && n51.f.a(this.f193249e, fVar2.f193249e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f193249e;
        java.util.LinkedList linkedList2 = this.f193248d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(3, 8, linkedList2) + 0 + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        com.tencent.mm.smiley.f fVar2 = (com.tencent.mm.smiley.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                com.tencent.mm.smiley.d0 d0Var = new com.tencent.mm.smiley.d0();
                if (bArr2 != null && bArr2.length > 0) {
                    d0Var.parseFrom(bArr2);
                }
                fVar2.f193248d.add(d0Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            com.tencent.mm.smiley.k kVar = new com.tencent.mm.smiley.k();
            if (bArr3 != null && bArr3.length > 0) {
                kVar.parseFrom(bArr3);
            }
            fVar2.f193249e.add(kVar);
        }
        return 0;
    }
}
