package r45;

/* loaded from: classes4.dex */
public class r70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384583d;

    /* renamed from: e, reason: collision with root package name */
    public int f384584e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r70)) {
            return false;
        }
        r45.r70 r70Var = (r45.r70) fVar;
        return n51.f.a(this.f384583d, r70Var.f384583d) && n51.f.a(java.lang.Integer.valueOf(this.f384584e), java.lang.Integer.valueOf(r70Var.f384584e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f384583d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.f384584e);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.f384583d;
            return (gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0) + b36.f.e(2, this.f384584e);
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
        r45.r70 r70Var = (r45.r70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r70Var.f384583d = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        r70Var.f384584e = aVar2.g(intValue);
        return 0;
    }
}
