package r45;

/* loaded from: classes4.dex */
public class xm4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390236d;

    /* renamed from: e, reason: collision with root package name */
    public int f390237e;

    /* renamed from: f, reason: collision with root package name */
    public int f390238f;

    /* renamed from: g, reason: collision with root package name */
    public int f390239g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390240h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390241i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xm4)) {
            return false;
        }
        r45.xm4 xm4Var = (r45.xm4) fVar;
        return n51.f.a(this.f390236d, xm4Var.f390236d) && n51.f.a(java.lang.Integer.valueOf(this.f390237e), java.lang.Integer.valueOf(xm4Var.f390237e)) && n51.f.a(java.lang.Integer.valueOf(this.f390238f), java.lang.Integer.valueOf(xm4Var.f390238f)) && n51.f.a(java.lang.Integer.valueOf(this.f390239g), java.lang.Integer.valueOf(xm4Var.f390239g)) && n51.f.a(this.f390240h, xm4Var.f390240h) && n51.f.a(this.f390241i, xm4Var.f390241i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390236d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f390237e);
            fVar.e(3, this.f390238f);
            fVar.e(4, this.f390239g);
            com.tencent.mm.protobuf.g gVar = this.f390240h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            java.lang.String str2 = this.f390241i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f390236d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f390237e) + b36.f.e(3, this.f390238f) + b36.f.e(4, this.f390239g);
            com.tencent.mm.protobuf.g gVar2 = this.f390240h;
            if (gVar2 != null) {
                j17 += b36.f.b(5, gVar2);
            }
            java.lang.String str4 = this.f390241i;
            return str4 != null ? j17 + b36.f.j(6, str4) : j17;
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
        r45.xm4 xm4Var = (r45.xm4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xm4Var.f390236d = aVar2.k(intValue);
                return 0;
            case 2:
                xm4Var.f390237e = aVar2.g(intValue);
                return 0;
            case 3:
                xm4Var.f390238f = aVar2.g(intValue);
                return 0;
            case 4:
                xm4Var.f390239g = aVar2.g(intValue);
                return 0;
            case 5:
                xm4Var.f390240h = aVar2.d(intValue);
                return 0;
            case 6:
                xm4Var.f390241i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
