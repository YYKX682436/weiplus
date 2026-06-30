package r45;

/* loaded from: classes4.dex */
public class hs4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376426d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376427e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f376428f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hs4)) {
            return false;
        }
        r45.hs4 hs4Var = (r45.hs4) fVar;
        return n51.f.a(this.f376426d, hs4Var.f376426d) && n51.f.a(this.f376427e, hs4Var.f376427e) && n51.f.a(java.lang.Boolean.valueOf(this.f376428f), java.lang.Boolean.valueOf(hs4Var.f376428f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376426d;
            if (str != null) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f376427e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.a(3, this.f376428f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f376426d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f376427e;
            if (gVar2 != null) {
                j17 += b36.f.b(2, gVar2);
            }
            return j17 + b36.f.a(3, this.f376428f);
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
        r45.hs4 hs4Var = (r45.hs4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hs4Var.f376426d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            hs4Var.f376427e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        hs4Var.f376428f = aVar2.c(intValue);
        return 0;
    }
}
