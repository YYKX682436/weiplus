package r45;

/* loaded from: classes4.dex */
public class gf4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375194d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375195e;

    /* renamed from: f, reason: collision with root package name */
    public int f375196f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375197g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gf4)) {
            return false;
        }
        r45.gf4 gf4Var = (r45.gf4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375194d), java.lang.Integer.valueOf(gf4Var.f375194d)) && n51.f.a(this.f375195e, gf4Var.f375195e) && n51.f.a(java.lang.Integer.valueOf(this.f375196f), java.lang.Integer.valueOf(gf4Var.f375196f)) && n51.f.a(this.f375197g, gf4Var.f375197g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375194d);
            com.tencent.mm.protobuf.g gVar = this.f375195e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f375196f);
            java.lang.String str = this.f375197g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375194d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f375195e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            int e18 = e17 + b36.f.e(3, this.f375196f);
            java.lang.String str2 = this.f375197g;
            return str2 != null ? e18 + b36.f.j(4, str2) : e18;
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
        r45.gf4 gf4Var = (r45.gf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gf4Var.f375194d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gf4Var.f375195e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            gf4Var.f375196f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        gf4Var.f375197g = aVar2.k(intValue);
        return 0;
    }
}
