package com.tencent.mm.smiley;

/* loaded from: classes9.dex */
public class a2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f193214d;

    /* renamed from: e, reason: collision with root package name */
    public int f193215e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.smiley.a2)) {
            return false;
        }
        com.tencent.mm.smiley.a2 a2Var = (com.tencent.mm.smiley.a2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f193214d), java.lang.Integer.valueOf(a2Var.f193214d)) && n51.f.a(java.lang.Integer.valueOf(this.f193215e), java.lang.Integer.valueOf(a2Var.f193215e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f193214d);
            fVar.e(3, this.f193215e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f193214d) + 0 + b36.f.e(3, this.f193215e);
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
        com.tencent.mm.smiley.a2 a2Var = (com.tencent.mm.smiley.a2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a2Var.f193214d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        a2Var.f193215e = aVar2.g(intValue);
        return 0;
    }
}
