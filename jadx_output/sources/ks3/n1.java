package ks3;

/* loaded from: classes4.dex */
public class n1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f311725d;

    /* renamed from: e, reason: collision with root package name */
    public long f311726e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.n1)) {
            return false;
        }
        ks3.n1 n1Var = (ks3.n1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f311725d), java.lang.Long.valueOf(n1Var.f311725d)) && n51.f.a(java.lang.Long.valueOf(this.f311726e), java.lang.Long.valueOf(n1Var.f311726e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f311725d);
            fVar.h(2, this.f311726e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f311725d) + 0 + b36.f.h(2, this.f311726e);
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
        ks3.n1 n1Var = (ks3.n1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            n1Var.f311725d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        n1Var.f311726e = aVar2.i(intValue);
        return 0;
    }
}
