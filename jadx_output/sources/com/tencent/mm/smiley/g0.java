package com.tencent.mm.smiley;

/* loaded from: classes9.dex */
public class g0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f193256d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f193257e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f193258f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.smiley.g0)) {
            return false;
        }
        com.tencent.mm.smiley.g0 g0Var = (com.tencent.mm.smiley.g0) fVar;
        return n51.f.a(this.f193256d, g0Var.f193256d) && n51.f.a(this.f193257e, g0Var.f193257e) && n51.f.a(this.f193258f, g0Var.f193258f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f193256d);
            fVar.g(2, 8, this.f193257e);
            fVar.g(3, 8, this.f193258f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f193256d) + 0 + b36.f.g(2, 8, this.f193257e) + b36.f.g(3, 8, this.f193258f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f193256d.clear();
            this.f193257e.clear();
            this.f193258f.clear();
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
        com.tencent.mm.smiley.g0 g0Var = (com.tencent.mm.smiley.g0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                com.tencent.mm.smiley.c cVar = new com.tencent.mm.smiley.c();
                if (bArr2 != null && bArr2.length > 0) {
                    cVar.parseFrom(bArr2);
                }
                g0Var.f193256d.add(cVar);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                com.tencent.mm.smiley.a2 a2Var = new com.tencent.mm.smiley.a2();
                if (bArr3 != null && bArr3.length > 0) {
                    a2Var.parseFrom(bArr3);
                }
                g0Var.f193257e.add(a2Var);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            com.tencent.mm.smiley.f1 f1Var = new com.tencent.mm.smiley.f1();
            if (bArr4 != null && bArr4.length > 0) {
                f1Var.parseFrom(bArr4);
            }
            g0Var.f193258f.add(f1Var);
        }
        return 0;
    }
}
