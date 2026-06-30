package r45;

/* loaded from: classes9.dex */
public class pp0 extends com.tencent.mm.protobuf.f {
    public boolean A;
    public java.lang.String C;
    public java.lang.String E;

    /* renamed from: d, reason: collision with root package name */
    public double f383266d;

    /* renamed from: f, reason: collision with root package name */
    public double f383268f;

    /* renamed from: h, reason: collision with root package name */
    public int f383270h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383272m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f383274o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f383276q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f383278s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f383280u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f383282w;

    /* renamed from: y, reason: collision with root package name */
    public float f383284y;

    /* renamed from: e, reason: collision with root package name */
    public boolean f383267e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f383269g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f383271i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f383273n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f383275p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f383277r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f383279t = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f383281v = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f383283x = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f383285z = false;
    public boolean B = false;
    public boolean D = false;
    public boolean F = false;

    public final r45.pp0 A(float f17) {
        this.f383284y = f17;
        this.f383285z = true;
        return this;
    }

    public final r45.pp0 B(java.lang.String str) {
        this.f383276q = str;
        this.f383277r = true;
        return this;
    }

    public final r45.pp0 C(java.lang.String str) {
        this.f383274o = str;
        this.f383275p = true;
        return this;
    }

    public final r45.pp0 E(int i17) {
        this.f383270h = i17;
        this.f383271i = true;
        return this;
    }

    public final java.lang.String b() {
        return this.C;
    }

    public final java.lang.String c() {
        return this.E;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pp0)) {
            return false;
        }
        r45.pp0 pp0Var = (r45.pp0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f383266d), java.lang.Double.valueOf(pp0Var.f383266d)) && n51.f.a(java.lang.Double.valueOf(this.f383268f), java.lang.Double.valueOf(pp0Var.f383268f)) && n51.f.a(java.lang.Integer.valueOf(this.f383270h), java.lang.Integer.valueOf(pp0Var.f383270h)) && n51.f.a(this.f383272m, pp0Var.f383272m) && n51.f.a(this.f383274o, pp0Var.f383274o) && n51.f.a(this.f383276q, pp0Var.f383276q) && n51.f.a(this.f383278s, pp0Var.f383278s) && n51.f.a(this.f383280u, pp0Var.f383280u) && n51.f.a(this.f383282w, pp0Var.f383282w) && n51.f.a(java.lang.Float.valueOf(this.f383284y), java.lang.Float.valueOf(pp0Var.f383284y)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(pp0Var.A)) && n51.f.a(this.C, pp0Var.C) && n51.f.a(this.E, pp0Var.E);
    }

    public final boolean d() {
        return this.A;
    }

    public final java.lang.String e() {
        return this.f383272m;
    }

    public final double f() {
        return this.f383268f;
    }

    public final double g() {
        return this.f383266d;
    }

    public final java.lang.String i() {
        return this.f383280u;
    }

    public final java.lang.String j() {
        return this.f383278s;
    }

    public final java.lang.String k() {
        return this.f383282w;
    }

    public final float l() {
        return this.f383284y;
    }

    public final java.lang.String n() {
        return this.f383276q;
    }

    public final java.lang.String o() {
        return this.f383274o;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f383267e) {
                fVar.c(1, this.f383266d);
            }
            if (this.f383269g) {
                fVar.c(2, this.f383268f);
            }
            if (this.f383271i) {
                fVar.e(3, this.f383270h);
            }
            java.lang.String str = this.f383272m;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f383274o;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f383276q;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f383278s;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f383280u;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f383282w;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            if (this.f383285z) {
                fVar.d(10, this.f383284y);
            }
            if (this.B) {
                fVar.a(11, this.A);
            }
            java.lang.String str7 = this.C;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            java.lang.String str8 = this.E;
            if (str8 == null) {
                return 0;
            }
            fVar.j(13, str8);
            return 0;
        }
        if (i17 == 1) {
            int c17 = this.f383267e ? b36.f.c(1, this.f383266d) + 0 : 0;
            if (this.f383269g) {
                c17 += b36.f.c(2, this.f383268f);
            }
            if (this.f383271i) {
                c17 += b36.f.e(3, this.f383270h);
            }
            java.lang.String str9 = this.f383272m;
            if (str9 != null) {
                c17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f383274o;
            if (str10 != null) {
                c17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f383276q;
            if (str11 != null) {
                c17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f383278s;
            if (str12 != null) {
                c17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f383280u;
            if (str13 != null) {
                c17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f383282w;
            if (str14 != null) {
                c17 += b36.f.j(9, str14);
            }
            if (this.f383285z) {
                c17 += b36.f.d(10, this.f383284y);
            }
            if (this.B) {
                c17 += b36.f.a(11, this.A);
            }
            java.lang.String str15 = this.C;
            if (str15 != null) {
                c17 += b36.f.j(12, str15);
            }
            java.lang.String str16 = this.E;
            return str16 != null ? c17 + b36.f.j(13, str16) : c17;
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
        r45.pp0 pp0Var = (r45.pp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pp0Var.f383266d = aVar2.e(intValue);
                pp0Var.f383267e = true;
                return 0;
            case 2:
                pp0Var.f383268f = aVar2.e(intValue);
                pp0Var.f383269g = true;
                return 0;
            case 3:
                pp0Var.f383270h = aVar2.g(intValue);
                pp0Var.f383271i = true;
                return 0;
            case 4:
                pp0Var.f383272m = aVar2.k(intValue);
                pp0Var.f383273n = true;
                return 0;
            case 5:
                pp0Var.f383274o = aVar2.k(intValue);
                pp0Var.f383275p = true;
                return 0;
            case 6:
                pp0Var.f383276q = aVar2.k(intValue);
                pp0Var.f383277r = true;
                return 0;
            case 7:
                pp0Var.f383278s = aVar2.k(intValue);
                pp0Var.f383279t = true;
                return 0;
            case 8:
                pp0Var.f383280u = aVar2.k(intValue);
                pp0Var.f383281v = true;
                return 0;
            case 9:
                pp0Var.f383282w = aVar2.k(intValue);
                pp0Var.f383283x = true;
                return 0;
            case 10:
                pp0Var.f383284y = aVar2.f(intValue);
                pp0Var.f383285z = true;
                return 0;
            case 11:
                pp0Var.A = aVar2.c(intValue);
                pp0Var.B = true;
                return 0;
            case 12:
                pp0Var.C = aVar2.k(intValue);
                pp0Var.D = true;
                return 0;
            case 13:
                pp0Var.E = aVar2.k(intValue);
                pp0Var.F = true;
                return 0;
            default:
                return -1;
        }
    }

    public final int p() {
        return this.f383270h;
    }

    public final r45.pp0 q(java.lang.String str) {
        this.C = str;
        this.D = true;
        return this;
    }

    public final r45.pp0 r(java.lang.String str) {
        this.E = str;
        this.F = true;
        return this;
    }

    public final r45.pp0 s(boolean z17) {
        this.A = z17;
        this.B = true;
        return this;
    }

    public final r45.pp0 t(java.lang.String str) {
        this.f383272m = str;
        this.f383273n = true;
        return this;
    }

    public final r45.pp0 u(double d17) {
        this.f383268f = d17;
        this.f383269g = true;
        return this;
    }

    public final r45.pp0 w(double d17) {
        this.f383266d = d17;
        this.f383267e = true;
        return this;
    }

    public final r45.pp0 x(java.lang.String str) {
        this.f383280u = str;
        this.f383281v = true;
        return this;
    }

    public final r45.pp0 y(java.lang.String str) {
        this.f383278s = str;
        this.f383279t = true;
        return this;
    }

    public final r45.pp0 z(java.lang.String str) {
        this.f383282w = str;
        this.f383283x = true;
        return this;
    }
}
