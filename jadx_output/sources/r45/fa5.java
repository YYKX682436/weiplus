package r45;

/* loaded from: classes2.dex */
public class fa5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f374148d;

    /* renamed from: e, reason: collision with root package name */
    public long f374149e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fa5)) {
            return false;
        }
        r45.fa5 fa5Var = (r45.fa5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f374148d), java.lang.Long.valueOf(fa5Var.f374148d)) && n51.f.a(java.lang.Long.valueOf(this.f374149e), java.lang.Long.valueOf(fa5Var.f374149e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f374148d);
            fVar.h(2, this.f374149e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f374148d) + 0 + b36.f.h(2, this.f374149e);
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
        r45.fa5 fa5Var = (r45.fa5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fa5Var.f374148d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        fa5Var.f374149e = aVar2.i(intValue);
        return 0;
    }
}
