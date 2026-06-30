package r45;

/* loaded from: classes4.dex */
public class bh5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370767d;

    /* renamed from: e, reason: collision with root package name */
    public int f370768e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bh5)) {
            return false;
        }
        r45.bh5 bh5Var = (r45.bh5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370767d), java.lang.Integer.valueOf(bh5Var.f370767d)) && n51.f.a(java.lang.Integer.valueOf(this.f370768e), java.lang.Integer.valueOf(bh5Var.f370768e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370767d);
            fVar.e(2, this.f370768e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f370767d) + 0 + b36.f.e(2, this.f370768e);
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
        r45.bh5 bh5Var = (r45.bh5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bh5Var.f370767d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        bh5Var.f370768e = aVar2.g(intValue);
        return 0;
    }
}
