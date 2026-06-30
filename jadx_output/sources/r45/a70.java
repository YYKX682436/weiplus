package r45;

/* loaded from: classes4.dex */
public class a70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f369800d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f369801e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a70)) {
            return false;
        }
        r45.a70 a70Var = (r45.a70) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f369800d), java.lang.Integer.valueOf(a70Var.f369800d)) && n51.f.a(this.f369801e, a70Var.f369801e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f369800d);
            com.tencent.mm.protobuf.g gVar = this.f369801e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f369800d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f369801e;
            return gVar2 != null ? e17 + b36.f.b(2, gVar2) : e17;
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
        r45.a70 a70Var = (r45.a70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a70Var.f369800d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        a70Var.f369801e = aVar2.d(intValue);
        return 0;
    }
}
