package r45;

/* loaded from: classes9.dex */
public class jq0 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public java.lang.String B;

    /* renamed from: d, reason: collision with root package name */
    public int f378034d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378036f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378038h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378040m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f378042o;

    /* renamed from: q, reason: collision with root package name */
    public long f378044q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f378046s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f378048u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f378050w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f378052y;

    /* renamed from: e, reason: collision with root package name */
    public boolean f378035e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f378037g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f378039i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f378041n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f378043p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f378045r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f378047t = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f378049v = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f378051x = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f378053z = false;
    public boolean C = false;

    public final r45.jq0 b(java.lang.String str) {
        this.f378050w = str;
        this.f378051x = true;
        return this;
    }

    public final r45.jq0 c(long j17) {
        this.f378044q = j17;
        this.f378045r = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jq0)) {
            return false;
        }
        r45.jq0 jq0Var = (r45.jq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378034d), java.lang.Integer.valueOf(jq0Var.f378034d)) && n51.f.a(this.f378036f, jq0Var.f378036f) && n51.f.a(this.f378038h, jq0Var.f378038h) && n51.f.a(this.f378040m, jq0Var.f378040m) && n51.f.a(this.f378042o, jq0Var.f378042o) && n51.f.a(java.lang.Long.valueOf(this.f378044q), java.lang.Long.valueOf(jq0Var.f378044q)) && n51.f.a(this.f378046s, jq0Var.f378046s) && n51.f.a(this.f378048u, jq0Var.f378048u) && n51.f.a(this.f378050w, jq0Var.f378050w) && n51.f.a(this.f378052y, jq0Var.f378052y) && n51.f.a(this.A, jq0Var.A) && n51.f.a(this.B, jq0Var.B);
    }

    public final r45.jq0 d(java.lang.String str) {
        this.f378048u = str;
        this.f378049v = true;
        return this;
    }

    public final r45.jq0 e(java.lang.String str) {
        this.f378036f = str;
        this.f378037g = true;
        return this;
    }

    public final r45.jq0 f(java.lang.String str) {
        this.f378052y = str;
        this.f378053z = true;
        return this;
    }

    public final r45.jq0 g(int i17) {
        this.f378034d = i17;
        this.f378035e = true;
        return this;
    }

    public final r45.jq0 i(java.lang.String str) {
        this.f378040m = str;
        this.f378041n = true;
        return this;
    }

    public final r45.jq0 j(java.lang.String str) {
        this.f378038h = str;
        this.f378039i = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f378035e) {
                fVar.e(1, this.f378034d);
            }
            java.lang.String str = this.f378036f;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378038h;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f378040m;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f378042o;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            if (this.f378045r) {
                fVar.h(6, this.f378044q);
            }
            java.lang.String str5 = this.f378046s;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f378048u;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f378050w;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f378052y;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.A;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.B;
            if (str10 != null) {
                fVar.j(12, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f378035e ? 0 + b36.f.e(1, this.f378034d) : 0;
            java.lang.String str11 = this.f378036f;
            if (str11 != null) {
                e17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f378038h;
            if (str12 != null) {
                e17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f378040m;
            if (str13 != null) {
                e17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f378042o;
            if (str14 != null) {
                e17 += b36.f.j(5, str14);
            }
            if (this.f378045r) {
                e17 += b36.f.h(6, this.f378044q);
            }
            java.lang.String str15 = this.f378046s;
            if (str15 != null) {
                e17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f378048u;
            if (str16 != null) {
                e17 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f378050w;
            if (str17 != null) {
                e17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f378052y;
            if (str18 != null) {
                e17 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.A;
            if (str19 != null) {
                e17 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.B;
            return str20 != null ? e17 + b36.f.j(12, str20) : e17;
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
        r45.jq0 jq0Var = (r45.jq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jq0Var.f378034d = aVar2.g(intValue);
                jq0Var.f378035e = true;
                return 0;
            case 2:
                jq0Var.f378036f = aVar2.k(intValue);
                jq0Var.f378037g = true;
                return 0;
            case 3:
                jq0Var.f378038h = aVar2.k(intValue);
                jq0Var.f378039i = true;
                return 0;
            case 4:
                jq0Var.f378040m = aVar2.k(intValue);
                jq0Var.f378041n = true;
                return 0;
            case 5:
                jq0Var.f378042o = aVar2.k(intValue);
                jq0Var.f378043p = true;
                return 0;
            case 6:
                jq0Var.f378044q = aVar2.i(intValue);
                jq0Var.f378045r = true;
                return 0;
            case 7:
                jq0Var.f378046s = aVar2.k(intValue);
                jq0Var.f378047t = true;
                return 0;
            case 8:
                jq0Var.f378048u = aVar2.k(intValue);
                jq0Var.f378049v = true;
                return 0;
            case 9:
                jq0Var.f378050w = aVar2.k(intValue);
                jq0Var.f378051x = true;
                return 0;
            case 10:
                jq0Var.f378052y = aVar2.k(intValue);
                jq0Var.f378053z = true;
                return 0;
            case 11:
                jq0Var.A = aVar2.k(intValue);
                return 0;
            case 12:
                jq0Var.B = aVar2.k(intValue);
                jq0Var.C = true;
                return 0;
            default:
                return -1;
        }
    }
}
