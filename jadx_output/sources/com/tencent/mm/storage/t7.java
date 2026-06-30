package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public class t7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f195328d;

    /* renamed from: e, reason: collision with root package name */
    public long f195329e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.storage.t7)) {
            return false;
        }
        com.tencent.mm.storage.t7 t7Var = (com.tencent.mm.storage.t7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f195328d), java.lang.Integer.valueOf(t7Var.f195328d)) && n51.f.a(java.lang.Long.valueOf(this.f195329e), java.lang.Long.valueOf(t7Var.f195329e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f195328d);
            fVar.h(2, this.f195329e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f195328d) + 0 + b36.f.h(2, this.f195329e);
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
        com.tencent.mm.storage.t7 t7Var = (com.tencent.mm.storage.t7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t7Var.f195328d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        t7Var.f195329e = aVar2.i(intValue);
        return 0;
    }
}
