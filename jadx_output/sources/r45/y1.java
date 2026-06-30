package r45;

/* loaded from: classes9.dex */
public class y1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390692d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390693e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390694f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390695g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390696h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390697i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390698m;

    /* renamed from: n, reason: collision with root package name */
    public int f390699n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y1)) {
            return false;
        }
        r45.y1 y1Var = (r45.y1) fVar;
        return n51.f.a(this.f390692d, y1Var.f390692d) && n51.f.a(this.f390693e, y1Var.f390693e) && n51.f.a(this.f390694f, y1Var.f390694f) && n51.f.a(this.f390695g, y1Var.f390695g) && n51.f.a(this.f390696h, y1Var.f390696h) && n51.f.a(this.f390697i, y1Var.f390697i) && n51.f.a(this.f390698m, y1Var.f390698m) && n51.f.a(java.lang.Integer.valueOf(this.f390699n), java.lang.Integer.valueOf(y1Var.f390699n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390692d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390693e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f390694f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f390695g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f390696h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f390697i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f390698m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.e(8, this.f390699n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f390692d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f390693e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f390694f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f390695g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f390696h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f390697i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f390698m;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            return j17 + b36.f.e(8, this.f390699n);
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
        r45.y1 y1Var = (r45.y1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y1Var.f390692d = aVar2.k(intValue);
                return 0;
            case 2:
                y1Var.f390693e = aVar2.k(intValue);
                return 0;
            case 3:
                y1Var.f390694f = aVar2.k(intValue);
                return 0;
            case 4:
                y1Var.f390695g = aVar2.k(intValue);
                return 0;
            case 5:
                y1Var.f390696h = aVar2.k(intValue);
                return 0;
            case 6:
                y1Var.f390697i = aVar2.k(intValue);
                return 0;
            case 7:
                y1Var.f390698m = aVar2.k(intValue);
                return 0;
            case 8:
                y1Var.f390699n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
