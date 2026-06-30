package r45;

/* loaded from: classes2.dex */
public class br6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371010d;

    /* renamed from: e, reason: collision with root package name */
    public int f371011e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371012f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371013g;

    /* renamed from: h, reason: collision with root package name */
    public int f371014h;

    /* renamed from: i, reason: collision with root package name */
    public int f371015i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.br6)) {
            return false;
        }
        r45.br6 br6Var = (r45.br6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371010d), java.lang.Integer.valueOf(br6Var.f371010d)) && n51.f.a(java.lang.Integer.valueOf(this.f371011e), java.lang.Integer.valueOf(br6Var.f371011e)) && n51.f.a(this.f371012f, br6Var.f371012f) && n51.f.a(this.f371013g, br6Var.f371013g) && n51.f.a(java.lang.Integer.valueOf(this.f371014h), java.lang.Integer.valueOf(br6Var.f371014h)) && n51.f.a(java.lang.Integer.valueOf(this.f371015i), java.lang.Integer.valueOf(br6Var.f371015i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371010d);
            fVar.e(2, this.f371011e);
            java.lang.String str = this.f371012f;
            if (str != null) {
                fVar.j(3, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f371013g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f371014h);
            fVar.e(6, this.f371015i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371010d) + 0 + b36.f.e(2, this.f371011e);
            java.lang.String str2 = this.f371012f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f371013g;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            return e17 + b36.f.e(5, this.f371014h) + b36.f.e(6, this.f371015i);
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
        r45.br6 br6Var = (r45.br6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                br6Var.f371010d = aVar2.g(intValue);
                return 0;
            case 2:
                br6Var.f371011e = aVar2.g(intValue);
                return 0;
            case 3:
                br6Var.f371012f = aVar2.k(intValue);
                return 0;
            case 4:
                br6Var.f371013g = aVar2.d(intValue);
                return 0;
            case 5:
                br6Var.f371014h = aVar2.g(intValue);
                return 0;
            case 6:
                br6Var.f371015i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
