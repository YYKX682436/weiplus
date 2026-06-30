package r45;

/* loaded from: classes8.dex */
public class vp6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388430d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388431e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388432f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vp6)) {
            return false;
        }
        r45.vp6 vp6Var = (r45.vp6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388430d), java.lang.Integer.valueOf(vp6Var.f388430d)) && n51.f.a(this.f388431e, vp6Var.f388431e) && n51.f.a(this.f388432f, vp6Var.f388432f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388430d);
            com.tencent.mm.protobuf.g gVar = this.f388431e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f388432f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388430d) + 0;
            com.tencent.mm.protobuf.g gVar3 = this.f388431e;
            if (gVar3 != null) {
                e17 += b36.f.b(2, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f388432f;
            return gVar4 != null ? e17 + b36.f.b(3, gVar4) : e17;
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
        r45.vp6 vp6Var = (r45.vp6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vp6Var.f388430d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            vp6Var.f388431e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        vp6Var.f388432f = aVar2.d(intValue);
        return 0;
    }
}
