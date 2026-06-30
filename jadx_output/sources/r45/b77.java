package r45;

/* loaded from: classes8.dex */
public class b77 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370620d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370621e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b77)) {
            return false;
        }
        r45.b77 b77Var = (r45.b77) fVar;
        return n51.f.a(this.f370620d, b77Var.f370620d) && n51.f.a(this.f370621e, b77Var.f370621e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f370620d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f370621e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.f370620d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            com.tencent.mm.protobuf.g gVar4 = this.f370621e;
            return gVar4 != null ? b17 + b36.f.b(2, gVar4) : b17;
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
        r45.b77 b77Var = (r45.b77) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b77Var.f370620d = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        b77Var.f370621e = aVar2.d(intValue);
        return 0;
    }
}
