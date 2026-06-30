package r45;

/* loaded from: classes8.dex */
public class zd3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f391930d;

    /* renamed from: e, reason: collision with root package name */
    public double f391931e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zd3)) {
            return false;
        }
        r45.zd3 zd3Var = (r45.zd3) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f391930d), java.lang.Double.valueOf(zd3Var.f391930d)) && n51.f.a(java.lang.Double.valueOf(this.f391931e), java.lang.Double.valueOf(zd3Var.f391931e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f391930d);
            fVar.c(2, this.f391931e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.c(1, this.f391930d) + 0 + b36.f.c(2, this.f391931e);
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
        r45.zd3 zd3Var = (r45.zd3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zd3Var.f391930d = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        zd3Var.f391931e = aVar2.e(intValue);
        return 0;
    }
}
