package r45;

/* loaded from: classes4.dex */
public class i90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f376837d;

    /* renamed from: e, reason: collision with root package name */
    public double f376838e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i90)) {
            return false;
        }
        r45.i90 i90Var = (r45.i90) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f376837d), java.lang.Double.valueOf(i90Var.f376837d)) && n51.f.a(java.lang.Double.valueOf(this.f376838e), java.lang.Double.valueOf(i90Var.f376838e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f376837d);
            fVar.c(2, this.f376838e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.c(1, this.f376837d) + 0 + b36.f.c(2, this.f376838e);
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
        r45.i90 i90Var = (r45.i90) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i90Var.f376837d = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        i90Var.f376838e = aVar2.e(intValue);
        return 0;
    }
}
