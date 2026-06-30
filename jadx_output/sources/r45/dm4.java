package r45;

/* loaded from: classes10.dex */
public class dm4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372569d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372570e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372571f;

    /* renamed from: g, reason: collision with root package name */
    public int f372572g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372573h;

    /* renamed from: i, reason: collision with root package name */
    public int f372574i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372575m;

    /* renamed from: n, reason: collision with root package name */
    public int f372576n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dm4)) {
            return false;
        }
        r45.dm4 dm4Var = (r45.dm4) fVar;
        return n51.f.a(this.f372569d, dm4Var.f372569d) && n51.f.a(this.f372570e, dm4Var.f372570e) && n51.f.a(this.f372571f, dm4Var.f372571f) && n51.f.a(java.lang.Integer.valueOf(this.f372572g), java.lang.Integer.valueOf(dm4Var.f372572g)) && n51.f.a(this.f372573h, dm4Var.f372573h) && n51.f.a(java.lang.Integer.valueOf(this.f372574i), java.lang.Integer.valueOf(dm4Var.f372574i)) && n51.f.a(this.f372575m, dm4Var.f372575m) && n51.f.a(java.lang.Integer.valueOf(this.f372576n), java.lang.Integer.valueOf(dm4Var.f372576n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372569d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372570e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f372571f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f372572g);
            java.lang.String str4 = this.f372573h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f372574i);
            java.lang.String str5 = this.f372575m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f372576n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f372569d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f372570e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f372571f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f372572g);
            java.lang.String str9 = this.f372573h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            int e18 = e17 + b36.f.e(6, this.f372574i);
            java.lang.String str10 = this.f372575m;
            if (str10 != null) {
                e18 += b36.f.j(7, str10);
            }
            return e18 + b36.f.e(8, this.f372576n);
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
        r45.dm4 dm4Var = (r45.dm4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dm4Var.f372569d = aVar2.k(intValue);
                return 0;
            case 2:
                dm4Var.f372570e = aVar2.k(intValue);
                return 0;
            case 3:
                dm4Var.f372571f = aVar2.k(intValue);
                return 0;
            case 4:
                dm4Var.f372572g = aVar2.g(intValue);
                return 0;
            case 5:
                dm4Var.f372573h = aVar2.k(intValue);
                return 0;
            case 6:
                dm4Var.f372574i = aVar2.g(intValue);
                return 0;
            case 7:
                dm4Var.f372575m = aVar2.k(intValue);
                return 0;
            case 8:
                dm4Var.f372576n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
