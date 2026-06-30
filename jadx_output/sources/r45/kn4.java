package r45;

/* loaded from: classes11.dex */
public class kn4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378845d;

    /* renamed from: e, reason: collision with root package name */
    public int f378846e;

    /* renamed from: f, reason: collision with root package name */
    public int f378847f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378848g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378849h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378850i;

    /* renamed from: m, reason: collision with root package name */
    public int f378851m;

    /* renamed from: n, reason: collision with root package name */
    public int f378852n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f378853o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f378854p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f378855q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kn4)) {
            return false;
        }
        r45.kn4 kn4Var = (r45.kn4) fVar;
        return n51.f.a(this.f378845d, kn4Var.f378845d) && n51.f.a(java.lang.Integer.valueOf(this.f378846e), java.lang.Integer.valueOf(kn4Var.f378846e)) && n51.f.a(java.lang.Integer.valueOf(this.f378847f), java.lang.Integer.valueOf(kn4Var.f378847f)) && n51.f.a(this.f378848g, kn4Var.f378848g) && n51.f.a(this.f378849h, kn4Var.f378849h) && n51.f.a(this.f378850i, kn4Var.f378850i) && n51.f.a(java.lang.Integer.valueOf(this.f378851m), java.lang.Integer.valueOf(kn4Var.f378851m)) && n51.f.a(java.lang.Integer.valueOf(this.f378852n), java.lang.Integer.valueOf(kn4Var.f378852n)) && n51.f.a(this.f378853o, kn4Var.f378853o) && n51.f.a(this.f378854p, kn4Var.f378854p) && n51.f.a(this.f378855q, kn4Var.f378855q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378845d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f378846e);
            fVar.e(3, this.f378847f);
            java.lang.String str2 = this.f378848g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f378849h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f378850i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f378851m);
            fVar.e(8, this.f378852n);
            java.lang.String str5 = this.f378853o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f378854p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f378855q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f378845d;
            int j17 = (str8 != null ? 0 + b36.f.j(1, str8) : 0) + b36.f.e(2, this.f378846e) + b36.f.e(3, this.f378847f);
            java.lang.String str9 = this.f378848g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f378849h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f378850i;
            if (str11 != null) {
                j17 += b36.f.j(6, str11);
            }
            int e17 = j17 + b36.f.e(7, this.f378851m) + b36.f.e(8, this.f378852n);
            java.lang.String str12 = this.f378853o;
            if (str12 != null) {
                e17 += b36.f.j(9, str12);
            }
            java.lang.String str13 = this.f378854p;
            if (str13 != null) {
                e17 += b36.f.j(10, str13);
            }
            java.lang.String str14 = this.f378855q;
            return str14 != null ? e17 + b36.f.j(11, str14) : e17;
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
        r45.kn4 kn4Var = (r45.kn4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kn4Var.f378845d = aVar2.k(intValue);
                return 0;
            case 2:
                kn4Var.f378846e = aVar2.g(intValue);
                return 0;
            case 3:
                kn4Var.f378847f = aVar2.g(intValue);
                return 0;
            case 4:
                kn4Var.f378848g = aVar2.k(intValue);
                return 0;
            case 5:
                kn4Var.f378849h = aVar2.k(intValue);
                return 0;
            case 6:
                kn4Var.f378850i = aVar2.k(intValue);
                return 0;
            case 7:
                kn4Var.f378851m = aVar2.g(intValue);
                return 0;
            case 8:
                kn4Var.f378852n = aVar2.g(intValue);
                return 0;
            case 9:
                kn4Var.f378853o = aVar2.k(intValue);
                return 0;
            case 10:
                kn4Var.f378854p = aVar2.k(intValue);
                return 0;
            case 11:
                kn4Var.f378855q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
