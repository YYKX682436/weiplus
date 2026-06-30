package r45;

/* loaded from: classes9.dex */
public class dd5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372326d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372327e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372328f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dd5)) {
            return false;
        }
        r45.dd5 dd5Var = (r45.dd5) fVar;
        return n51.f.a(this.f372326d, dd5Var.f372326d) && n51.f.a(this.f372327e, dd5Var.f372327e) && n51.f.a(this.f372328f, dd5Var.f372328f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372326d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372327e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f372328f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f372326d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f372327e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f372328f;
            return gVar2 != null ? j17 + b36.f.b(3, gVar2) : j17;
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
        r45.dd5 dd5Var = (r45.dd5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dd5Var.f372326d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            dd5Var.f372327e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        dd5Var.f372328f = aVar2.d(intValue);
        return 0;
    }
}
