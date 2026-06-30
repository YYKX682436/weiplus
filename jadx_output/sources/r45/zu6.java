package r45;

/* loaded from: classes4.dex */
public class zu6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f392378d;

    /* renamed from: e, reason: collision with root package name */
    public int f392379e;

    /* renamed from: f, reason: collision with root package name */
    public int f392380f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zu6)) {
            return false;
        }
        r45.zu6 zu6Var = (r45.zu6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f392378d), java.lang.Integer.valueOf(zu6Var.f392378d)) && n51.f.a(java.lang.Integer.valueOf(this.f392379e), java.lang.Integer.valueOf(zu6Var.f392379e)) && n51.f.a(java.lang.Integer.valueOf(this.f392380f), java.lang.Integer.valueOf(zu6Var.f392380f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f392378d);
            fVar.e(2, this.f392379e);
            fVar.e(3, this.f392380f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f392378d) + 0 + b36.f.e(2, this.f392379e) + b36.f.e(3, this.f392380f);
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
        r45.zu6 zu6Var = (r45.zu6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zu6Var.f392378d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            zu6Var.f392379e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        zu6Var.f392380f = aVar2.g(intValue);
        return 0;
    }
}
