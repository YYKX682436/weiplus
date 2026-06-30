package r45;

/* loaded from: classes8.dex */
public class em6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373611d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f373612e;

    /* renamed from: f, reason: collision with root package name */
    public int f373613f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.em6)) {
            return false;
        }
        r45.em6 em6Var = (r45.em6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373611d), java.lang.Integer.valueOf(em6Var.f373611d)) && n51.f.a(java.lang.Boolean.valueOf(this.f373612e), java.lang.Boolean.valueOf(em6Var.f373612e)) && n51.f.a(java.lang.Integer.valueOf(this.f373613f), java.lang.Integer.valueOf(em6Var.f373613f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373611d);
            fVar.a(2, this.f373612e);
            fVar.e(3, this.f373613f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f373611d) + 0 + b36.f.a(2, this.f373612e) + b36.f.e(3, this.f373613f);
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
        r45.em6 em6Var = (r45.em6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            em6Var.f373611d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            em6Var.f373612e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        em6Var.f373613f = aVar2.g(intValue);
        return 0;
    }
}
