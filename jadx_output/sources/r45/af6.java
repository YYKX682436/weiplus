package r45;

/* loaded from: classes4.dex */
public class af6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f369983d;

    /* renamed from: e, reason: collision with root package name */
    public int f369984e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.af6)) {
            return false;
        }
        r45.af6 af6Var = (r45.af6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f369983d), java.lang.Long.valueOf(af6Var.f369983d)) && n51.f.a(java.lang.Integer.valueOf(this.f369984e), java.lang.Integer.valueOf(af6Var.f369984e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f369983d);
            fVar.e(2, this.f369984e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f369983d) + 0 + b36.f.e(2, this.f369984e);
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
        r45.af6 af6Var = (r45.af6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            af6Var.f369983d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        af6Var.f369984e = aVar2.g(intValue);
        return 0;
    }
}
