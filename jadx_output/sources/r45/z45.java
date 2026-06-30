package r45;

/* loaded from: classes12.dex */
public class z45 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f391698d;

    /* renamed from: e, reason: collision with root package name */
    public int f391699e;

    /* renamed from: f, reason: collision with root package name */
    public int f391700f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391701g;

    /* renamed from: h, reason: collision with root package name */
    public int f391702h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391703i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f391704m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f391705n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f391706o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f391707p;

    /* renamed from: q, reason: collision with root package name */
    public int f391708q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f391709r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f391710s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f391711t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f391712u;

    /* renamed from: v, reason: collision with root package name */
    public int f391713v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z45)) {
            return false;
        }
        r45.z45 z45Var = (r45.z45) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f391698d), java.lang.Integer.valueOf(z45Var.f391698d)) && n51.f.a(java.lang.Integer.valueOf(this.f391699e), java.lang.Integer.valueOf(z45Var.f391699e)) && n51.f.a(java.lang.Integer.valueOf(this.f391700f), java.lang.Integer.valueOf(z45Var.f391700f)) && n51.f.a(this.f391701g, z45Var.f391701g) && n51.f.a(java.lang.Integer.valueOf(this.f391702h), java.lang.Integer.valueOf(z45Var.f391702h)) && n51.f.a(this.f391703i, z45Var.f391703i) && n51.f.a(this.f391704m, z45Var.f391704m) && n51.f.a(this.f391705n, z45Var.f391705n) && n51.f.a(this.f391706o, z45Var.f391706o) && n51.f.a(this.f391707p, z45Var.f391707p) && n51.f.a(java.lang.Integer.valueOf(this.f391708q), java.lang.Integer.valueOf(z45Var.f391708q)) && n51.f.a(this.f391709r, z45Var.f391709r) && n51.f.a(this.f391710s, z45Var.f391710s) && n51.f.a(this.f391711t, z45Var.f391711t) && n51.f.a(this.f391712u, z45Var.f391712u) && n51.f.a(java.lang.Integer.valueOf(this.f391713v), java.lang.Integer.valueOf(z45Var.f391713v));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f391698d);
            fVar.e(2, this.f391699e);
            fVar.e(3, this.f391700f);
            java.lang.String str = this.f391701g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f391702h);
            java.lang.String str2 = this.f391703i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f391704m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f391705n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f391706o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f391707p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.e(12, this.f391708q);
            java.lang.String str7 = this.f391709r;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f391710s;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            java.lang.String str9 = this.f391711t;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            java.lang.String str10 = this.f391712u;
            if (str10 != null) {
                fVar.j(18, str10);
            }
            fVar.e(19, this.f391713v);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f391698d) + 0 + b36.f.e(2, this.f391699e) + b36.f.e(3, this.f391700f);
            java.lang.String str11 = this.f391701g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            int e18 = e17 + b36.f.e(5, this.f391702h);
            java.lang.String str12 = this.f391703i;
            if (str12 != null) {
                e18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f391704m;
            if (str13 != null) {
                e18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f391705n;
            if (str14 != null) {
                e18 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f391706o;
            if (str15 != null) {
                e18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f391707p;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            int e19 = e18 + b36.f.e(12, this.f391708q);
            java.lang.String str17 = this.f391709r;
            if (str17 != null) {
                e19 += b36.f.j(13, str17);
            }
            java.lang.String str18 = this.f391710s;
            if (str18 != null) {
                e19 += b36.f.j(14, str18);
            }
            java.lang.String str19 = this.f391711t;
            if (str19 != null) {
                e19 += b36.f.j(15, str19);
            }
            java.lang.String str20 = this.f391712u;
            if (str20 != null) {
                e19 += b36.f.j(18, str20);
            }
            return e19 + b36.f.e(19, this.f391713v);
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
        r45.z45 z45Var = (r45.z45) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z45Var.f391698d = aVar2.g(intValue);
                return 0;
            case 2:
                z45Var.f391699e = aVar2.g(intValue);
                return 0;
            case 3:
                z45Var.f391700f = aVar2.g(intValue);
                return 0;
            case 4:
                z45Var.f391701g = aVar2.k(intValue);
                return 0;
            case 5:
                z45Var.f391702h = aVar2.g(intValue);
                return 0;
            case 6:
                z45Var.f391703i = aVar2.k(intValue);
                return 0;
            case 7:
                z45Var.f391704m = aVar2.k(intValue);
                return 0;
            case 8:
                z45Var.f391705n = aVar2.k(intValue);
                return 0;
            case 9:
            case 16:
            case 17:
            default:
                return -1;
            case 10:
                z45Var.f391706o = aVar2.k(intValue);
                return 0;
            case 11:
                z45Var.f391707p = aVar2.k(intValue);
                return 0;
            case 12:
                z45Var.f391708q = aVar2.g(intValue);
                return 0;
            case 13:
                z45Var.f391709r = aVar2.k(intValue);
                return 0;
            case 14:
                z45Var.f391710s = aVar2.k(intValue);
                return 0;
            case 15:
                z45Var.f391711t = aVar2.k(intValue);
                return 0;
            case 18:
                z45Var.f391712u = aVar2.k(intValue);
                return 0;
            case 19:
                z45Var.f391713v = aVar2.g(intValue);
                return 0;
        }
    }
}
