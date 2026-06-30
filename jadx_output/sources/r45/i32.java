package r45;

/* loaded from: classes9.dex */
public class i32 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376697d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376698e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i32)) {
            return false;
        }
        r45.i32 i32Var = (r45.i32) fVar;
        return n51.f.a(this.f376697d, i32Var.f376697d) && n51.f.a(this.f376698e, i32Var.f376698e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f376697d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f376698e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.f376697d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            com.tencent.mm.protobuf.g gVar4 = this.f376698e;
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
        r45.i32 i32Var = (r45.i32) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i32Var.f376697d = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        i32Var.f376698e = aVar2.d(intValue);
        return 0;
    }
}
