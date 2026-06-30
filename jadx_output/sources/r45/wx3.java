package r45;

/* loaded from: classes9.dex */
public class wx3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f389553d;

    /* renamed from: e, reason: collision with root package name */
    public double f389554e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wx3)) {
            return false;
        }
        r45.wx3 wx3Var = (r45.wx3) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f389553d), java.lang.Double.valueOf(wx3Var.f389553d)) && n51.f.a(java.lang.Double.valueOf(this.f389554e), java.lang.Double.valueOf(wx3Var.f389554e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f389553d);
            fVar.c(2, this.f389554e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.c(1, this.f389553d) + 0 + b36.f.c(2, this.f389554e);
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
        r45.wx3 wx3Var = (r45.wx3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wx3Var.f389553d = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        wx3Var.f389554e = aVar2.e(intValue);
        return 0;
    }
}
