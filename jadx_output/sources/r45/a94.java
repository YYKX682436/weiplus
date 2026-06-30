package r45;

/* loaded from: classes4.dex */
public class a94 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f369857d;

    /* renamed from: e, reason: collision with root package name */
    public int f369858e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a94)) {
            return false;
        }
        r45.a94 a94Var = (r45.a94) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f369857d), java.lang.Long.valueOf(a94Var.f369857d)) && n51.f.a(java.lang.Integer.valueOf(this.f369858e), java.lang.Integer.valueOf(a94Var.f369858e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f369857d);
            fVar.e(2, this.f369858e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f369857d) + 0 + b36.f.e(2, this.f369858e);
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
        r45.a94 a94Var = (r45.a94) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a94Var.f369857d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        a94Var.f369858e = aVar2.g(intValue);
        return 0;
    }
}
