package r45;

/* loaded from: classes9.dex */
public class wa5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f389011d;

    /* renamed from: e, reason: collision with root package name */
    public double f389012e;

    /* renamed from: f, reason: collision with root package name */
    public double f389013f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wa5)) {
            return false;
        }
        r45.wa5 wa5Var = (r45.wa5) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f389011d), java.lang.Double.valueOf(wa5Var.f389011d)) && n51.f.a(java.lang.Double.valueOf(this.f389012e), java.lang.Double.valueOf(wa5Var.f389012e)) && n51.f.a(java.lang.Double.valueOf(this.f389013f), java.lang.Double.valueOf(wa5Var.f389013f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f389011d);
            fVar.c(2, this.f389012e);
            fVar.c(3, this.f389013f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.c(1, this.f389011d) + 0 + b36.f.c(2, this.f389012e) + b36.f.c(3, this.f389013f);
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
        r45.wa5 wa5Var = (r45.wa5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wa5Var.f389011d = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 2) {
            wa5Var.f389012e = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        wa5Var.f389013f = aVar2.e(intValue);
        return 0;
    }
}
