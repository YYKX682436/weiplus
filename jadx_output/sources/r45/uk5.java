package r45;

/* loaded from: classes2.dex */
public class uk5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387438d;

    /* renamed from: e, reason: collision with root package name */
    public int f387439e;

    /* renamed from: f, reason: collision with root package name */
    public int f387440f;

    /* renamed from: g, reason: collision with root package name */
    public long f387441g;

    /* renamed from: h, reason: collision with root package name */
    public int f387442h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387443i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387444m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387445n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f387446o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f387447p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f387448q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f387449r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f387450s;

    /* renamed from: t, reason: collision with root package name */
    public int f387451t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uk5)) {
            return false;
        }
        r45.uk5 uk5Var = (r45.uk5) fVar;
        return n51.f.a(this.f387438d, uk5Var.f387438d) && n51.f.a(java.lang.Integer.valueOf(this.f387439e), java.lang.Integer.valueOf(uk5Var.f387439e)) && n51.f.a(java.lang.Integer.valueOf(this.f387440f), java.lang.Integer.valueOf(uk5Var.f387440f)) && n51.f.a(java.lang.Long.valueOf(this.f387441g), java.lang.Long.valueOf(uk5Var.f387441g)) && n51.f.a(java.lang.Integer.valueOf(this.f387442h), java.lang.Integer.valueOf(uk5Var.f387442h)) && n51.f.a(this.f387443i, uk5Var.f387443i) && n51.f.a(this.f387444m, uk5Var.f387444m) && n51.f.a(this.f387445n, uk5Var.f387445n) && n51.f.a(this.f387446o, uk5Var.f387446o) && n51.f.a(this.f387447p, uk5Var.f387447p) && n51.f.a(this.f387448q, uk5Var.f387448q) && n51.f.a(this.f387449r, uk5Var.f387449r) && n51.f.a(this.f387450s, uk5Var.f387450s) && n51.f.a(java.lang.Integer.valueOf(this.f387451t), java.lang.Integer.valueOf(uk5Var.f387451t));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387438d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f387439e);
            fVar.e(3, this.f387440f);
            fVar.h(4, this.f387441g);
            fVar.e(5, this.f387442h);
            java.lang.String str2 = this.f387443i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f387444m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f387445n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f387446o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f387447p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f387448q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f387449r;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f387450s;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            fVar.e(14, this.f387451t);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f387438d;
            int j17 = (str10 != null ? b36.f.j(1, str10) + 0 : 0) + b36.f.e(2, this.f387439e) + b36.f.e(3, this.f387440f) + b36.f.h(4, this.f387441g) + b36.f.e(5, this.f387442h);
            java.lang.String str11 = this.f387443i;
            if (str11 != null) {
                j17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f387444m;
            if (str12 != null) {
                j17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f387445n;
            if (str13 != null) {
                j17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f387446o;
            if (str14 != null) {
                j17 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f387447p;
            if (str15 != null) {
                j17 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f387448q;
            if (str16 != null) {
                j17 += b36.f.j(11, str16);
            }
            java.lang.String str17 = this.f387449r;
            if (str17 != null) {
                j17 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f387450s;
            if (str18 != null) {
                j17 += b36.f.j(13, str18);
            }
            return j17 + b36.f.e(14, this.f387451t);
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
        r45.uk5 uk5Var = (r45.uk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uk5Var.f387438d = aVar2.k(intValue);
                return 0;
            case 2:
                uk5Var.f387439e = aVar2.g(intValue);
                return 0;
            case 3:
                uk5Var.f387440f = aVar2.g(intValue);
                return 0;
            case 4:
                uk5Var.f387441g = aVar2.i(intValue);
                return 0;
            case 5:
                uk5Var.f387442h = aVar2.g(intValue);
                return 0;
            case 6:
                uk5Var.f387443i = aVar2.k(intValue);
                return 0;
            case 7:
                uk5Var.f387444m = aVar2.k(intValue);
                return 0;
            case 8:
                uk5Var.f387445n = aVar2.k(intValue);
                return 0;
            case 9:
                uk5Var.f387446o = aVar2.k(intValue);
                return 0;
            case 10:
                uk5Var.f387447p = aVar2.k(intValue);
                return 0;
            case 11:
                uk5Var.f387448q = aVar2.k(intValue);
                return 0;
            case 12:
                uk5Var.f387449r = aVar2.k(intValue);
                return 0;
            case 13:
                uk5Var.f387450s = aVar2.k(intValue);
                return 0;
            case 14:
                uk5Var.f387451t = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
