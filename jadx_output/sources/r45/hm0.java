package r45;

/* loaded from: classes9.dex */
public class hm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376283d;

    /* renamed from: e, reason: collision with root package name */
    public int f376284e;

    /* renamed from: f, reason: collision with root package name */
    public int f376285f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376286g;

    /* renamed from: h, reason: collision with root package name */
    public int f376287h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376288i;

    /* renamed from: m, reason: collision with root package name */
    public int f376289m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hm0)) {
            return false;
        }
        r45.hm0 hm0Var = (r45.hm0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376283d), java.lang.Integer.valueOf(hm0Var.f376283d)) && n51.f.a(java.lang.Integer.valueOf(this.f376284e), java.lang.Integer.valueOf(hm0Var.f376284e)) && n51.f.a(java.lang.Integer.valueOf(this.f376285f), java.lang.Integer.valueOf(hm0Var.f376285f)) && n51.f.a(this.f376286g, hm0Var.f376286g) && n51.f.a(java.lang.Integer.valueOf(this.f376287h), java.lang.Integer.valueOf(hm0Var.f376287h)) && n51.f.a(this.f376288i, hm0Var.f376288i) && n51.f.a(java.lang.Integer.valueOf(this.f376289m), java.lang.Integer.valueOf(hm0Var.f376289m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376283d);
            fVar.e(2, this.f376284e);
            fVar.e(3, this.f376285f);
            java.lang.String str = this.f376286g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f376287h);
            java.lang.String str2 = this.f376288i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f376289m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376283d) + 0 + b36.f.e(2, this.f376284e) + b36.f.e(3, this.f376285f);
            java.lang.String str3 = this.f376286g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            int e18 = e17 + b36.f.e(5, this.f376287h);
            java.lang.String str4 = this.f376288i;
            if (str4 != null) {
                e18 += b36.f.j(6, str4);
            }
            return e18 + b36.f.e(7, this.f376289m);
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
        r45.hm0 hm0Var = (r45.hm0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hm0Var.f376283d = aVar2.g(intValue);
                return 0;
            case 2:
                hm0Var.f376284e = aVar2.g(intValue);
                return 0;
            case 3:
                hm0Var.f376285f = aVar2.g(intValue);
                return 0;
            case 4:
                hm0Var.f376286g = aVar2.k(intValue);
                return 0;
            case 5:
                hm0Var.f376287h = aVar2.g(intValue);
                return 0;
            case 6:
                hm0Var.f376288i = aVar2.k(intValue);
                return 0;
            case 7:
                hm0Var.f376289m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
