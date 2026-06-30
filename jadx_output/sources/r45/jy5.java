package r45;

/* loaded from: classes9.dex */
public class jy5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f378218d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f378219e;

    /* renamed from: f, reason: collision with root package name */
    public long f378220f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jy5)) {
            return false;
        }
        r45.jy5 jy5Var = (r45.jy5) fVar;
        return n51.f.a(this.f378218d, jy5Var.f378218d) && n51.f.a(this.f378219e, jy5Var.f378219e) && n51.f.a(java.lang.Long.valueOf(this.f378220f), java.lang.Long.valueOf(jy5Var.f378220f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f378218d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f378219e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            fVar.h(3, this.f378220f);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.f378218d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            com.tencent.mm.protobuf.g gVar4 = this.f378219e;
            if (gVar4 != null) {
                b17 += b36.f.b(2, gVar4);
            }
            return b17 + b36.f.h(3, this.f378220f);
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
        r45.jy5 jy5Var = (r45.jy5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jy5Var.f378218d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            jy5Var.f378219e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        jy5Var.f378220f = aVar2.i(intValue);
        return 0;
    }
}
