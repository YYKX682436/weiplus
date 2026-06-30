package r45;

/* loaded from: classes4.dex */
public class h5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375835d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375836e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375837f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375838g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375839h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375840i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375841m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375842n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f375843o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f375844p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f375845q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f375846r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f375847s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h5)) {
            return false;
        }
        r45.h5 h5Var = (r45.h5) fVar;
        return n51.f.a(this.f375835d, h5Var.f375835d) && n51.f.a(this.f375836e, h5Var.f375836e) && n51.f.a(this.f375837f, h5Var.f375837f) && n51.f.a(this.f375838g, h5Var.f375838g) && n51.f.a(this.f375839h, h5Var.f375839h) && n51.f.a(this.f375840i, h5Var.f375840i) && n51.f.a(this.f375841m, h5Var.f375841m) && n51.f.a(this.f375842n, h5Var.f375842n) && n51.f.a(this.f375843o, h5Var.f375843o) && n51.f.a(java.lang.Boolean.valueOf(this.f375844p), java.lang.Boolean.valueOf(h5Var.f375844p)) && n51.f.a(this.f375845q, h5Var.f375845q) && n51.f.a(this.f375846r, h5Var.f375846r) && n51.f.a(this.f375847s, h5Var.f375847s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375835d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f375836e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f375837f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f375838g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f375839h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f375840i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f375841m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f375842n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f375843o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            fVar.a(10, this.f375844p);
            java.lang.String str10 = this.f375845q;
            if (str10 != null) {
                fVar.j(11, str10);
            }
            java.lang.String str11 = this.f375846r;
            if (str11 != null) {
                fVar.j(12, str11);
            }
            java.lang.String str12 = this.f375847s;
            if (str12 == null) {
                return 0;
            }
            fVar.j(13, str12);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f375835d;
            int j17 = str13 != null ? 0 + b36.f.j(1, str13) : 0;
            java.lang.String str14 = this.f375836e;
            if (str14 != null) {
                j17 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f375837f;
            if (str15 != null) {
                j17 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f375838g;
            if (str16 != null) {
                j17 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f375839h;
            if (str17 != null) {
                j17 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.f375840i;
            if (str18 != null) {
                j17 += b36.f.j(6, str18);
            }
            java.lang.String str19 = this.f375841m;
            if (str19 != null) {
                j17 += b36.f.j(7, str19);
            }
            java.lang.String str20 = this.f375842n;
            if (str20 != null) {
                j17 += b36.f.j(8, str20);
            }
            java.lang.String str21 = this.f375843o;
            if (str21 != null) {
                j17 += b36.f.j(9, str21);
            }
            int a17 = j17 + b36.f.a(10, this.f375844p);
            java.lang.String str22 = this.f375845q;
            if (str22 != null) {
                a17 += b36.f.j(11, str22);
            }
            java.lang.String str23 = this.f375846r;
            if (str23 != null) {
                a17 += b36.f.j(12, str23);
            }
            java.lang.String str24 = this.f375847s;
            return str24 != null ? a17 + b36.f.j(13, str24) : a17;
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
        r45.h5 h5Var = (r45.h5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                h5Var.f375835d = aVar2.k(intValue);
                return 0;
            case 2:
                h5Var.f375836e = aVar2.k(intValue);
                return 0;
            case 3:
                h5Var.f375837f = aVar2.k(intValue);
                return 0;
            case 4:
                h5Var.f375838g = aVar2.k(intValue);
                return 0;
            case 5:
                h5Var.f375839h = aVar2.k(intValue);
                return 0;
            case 6:
                h5Var.f375840i = aVar2.k(intValue);
                return 0;
            case 7:
                h5Var.f375841m = aVar2.k(intValue);
                return 0;
            case 8:
                h5Var.f375842n = aVar2.k(intValue);
                return 0;
            case 9:
                h5Var.f375843o = aVar2.k(intValue);
                return 0;
            case 10:
                h5Var.f375844p = aVar2.c(intValue);
                return 0;
            case 11:
                h5Var.f375845q = aVar2.k(intValue);
                return 0;
            case 12:
                h5Var.f375846r = aVar2.k(intValue);
                return 0;
            case 13:
                h5Var.f375847s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
