package r45;

/* loaded from: classes8.dex */
public class r6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384567d;

    /* renamed from: e, reason: collision with root package name */
    public int f384568e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r6)) {
            return false;
        }
        r45.r6 r6Var = (r45.r6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384567d), java.lang.Integer.valueOf(r6Var.f384567d)) && n51.f.a(java.lang.Integer.valueOf(this.f384568e), java.lang.Integer.valueOf(r6Var.f384568e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384567d);
            fVar.e(2, this.f384568e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f384567d) + 0 + b36.f.e(2, this.f384568e);
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
        r45.r6 r6Var = (r45.r6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r6Var.f384567d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        r6Var.f384568e = aVar2.g(intValue);
        return 0;
    }
}
