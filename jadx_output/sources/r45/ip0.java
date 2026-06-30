package r45;

/* loaded from: classes9.dex */
public class ip0 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String D;

    /* renamed from: d, reason: collision with root package name */
    public int f377229d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377231f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377233h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f377235m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f377237o;

    /* renamed from: q, reason: collision with root package name */
    public long f377239q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f377241s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f377243u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f377245w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f377247y;

    /* renamed from: e, reason: collision with root package name */
    public boolean f377230e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f377232g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f377234i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f377236n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f377238p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f377240r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f377242t = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f377244v = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f377246x = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f377248z = false;
    public boolean C = false;
    public boolean E = false;

    public final java.lang.String b() {
        return this.B;
    }

    public final java.lang.String c() {
        return this.f377231f;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ip0)) {
            return false;
        }
        r45.ip0 ip0Var = (r45.ip0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377229d), java.lang.Integer.valueOf(ip0Var.f377229d)) && n51.f.a(this.f377231f, ip0Var.f377231f) && n51.f.a(this.f377233h, ip0Var.f377233h) && n51.f.a(this.f377235m, ip0Var.f377235m) && n51.f.a(this.f377237o, ip0Var.f377237o) && n51.f.a(java.lang.Long.valueOf(this.f377239q), java.lang.Long.valueOf(ip0Var.f377239q)) && n51.f.a(this.f377241s, ip0Var.f377241s) && n51.f.a(this.f377243u, ip0Var.f377243u) && n51.f.a(this.f377245w, ip0Var.f377245w) && n51.f.a(this.f377247y, ip0Var.f377247y) && n51.f.a(this.A, ip0Var.A) && n51.f.a(this.B, ip0Var.B) && n51.f.a(this.D, ip0Var.D);
    }

    public final java.lang.String d() {
        return this.D;
    }

    public final java.lang.String e() {
        return this.f377237o;
    }

    public final r45.ip0 f(java.lang.String str) {
        this.f377245w = str;
        this.f377246x = true;
        return this;
    }

    public final r45.ip0 g(java.lang.String str) {
        this.B = str;
        this.C = true;
        return this;
    }

    public final java.lang.String getAppId() {
        return this.f377245w;
    }

    public final java.lang.String getLink() {
        return this.f377247y;
    }

    public final r45.ip0 i(java.lang.String str) {
        this.f377231f = str;
        this.f377232g = true;
        return this;
    }

    public final r45.ip0 j(java.lang.String str) {
        this.f377247y = str;
        this.f377248z = true;
        return this;
    }

    public final r45.ip0 k(java.lang.String str) {
        this.f377237o = str;
        this.f377238p = true;
        return this;
    }

    public final r45.ip0 l(int i17) {
        this.f377229d = i17;
        this.f377230e = true;
        return this;
    }

    public final r45.ip0 n(java.lang.String str) {
        this.f377233h = str;
        this.f377234i = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f377230e) {
                fVar.e(1, this.f377229d);
            }
            java.lang.String str = this.f377231f;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f377233h;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f377235m;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f377237o;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            if (this.f377240r) {
                fVar.h(6, this.f377239q);
            }
            java.lang.String str5 = this.f377241s;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f377243u;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f377245w;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f377247y;
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
            java.lang.String str11 = this.D;
            if (str11 == null) {
                return 0;
            }
            fVar.j(13, str11);
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f377230e ? 0 + b36.f.e(1, this.f377229d) : 0;
            java.lang.String str12 = this.f377231f;
            if (str12 != null) {
                e17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f377233h;
            if (str13 != null) {
                e17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f377235m;
            if (str14 != null) {
                e17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f377237o;
            if (str15 != null) {
                e17 += b36.f.j(5, str15);
            }
            if (this.f377240r) {
                e17 += b36.f.h(6, this.f377239q);
            }
            java.lang.String str16 = this.f377241s;
            if (str16 != null) {
                e17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f377243u;
            if (str17 != null) {
                e17 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f377245w;
            if (str18 != null) {
                e17 += b36.f.j(9, str18);
            }
            java.lang.String str19 = this.f377247y;
            if (str19 != null) {
                e17 += b36.f.j(10, str19);
            }
            java.lang.String str20 = this.A;
            if (str20 != null) {
                e17 += b36.f.j(11, str20);
            }
            java.lang.String str21 = this.B;
            if (str21 != null) {
                e17 += b36.f.j(12, str21);
            }
            java.lang.String str22 = this.D;
            return str22 != null ? e17 + b36.f.j(13, str22) : e17;
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
        r45.ip0 ip0Var = (r45.ip0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ip0Var.f377229d = aVar2.g(intValue);
                ip0Var.f377230e = true;
                return 0;
            case 2:
                ip0Var.f377231f = aVar2.k(intValue);
                ip0Var.f377232g = true;
                return 0;
            case 3:
                ip0Var.f377233h = aVar2.k(intValue);
                ip0Var.f377234i = true;
                return 0;
            case 4:
                ip0Var.f377235m = aVar2.k(intValue);
                ip0Var.f377236n = true;
                return 0;
            case 5:
                ip0Var.f377237o = aVar2.k(intValue);
                ip0Var.f377238p = true;
                return 0;
            case 6:
                ip0Var.f377239q = aVar2.i(intValue);
                ip0Var.f377240r = true;
                return 0;
            case 7:
                ip0Var.f377241s = aVar2.k(intValue);
                ip0Var.f377242t = true;
                return 0;
            case 8:
                ip0Var.f377243u = aVar2.k(intValue);
                ip0Var.f377244v = true;
                return 0;
            case 9:
                ip0Var.f377245w = aVar2.k(intValue);
                ip0Var.f377246x = true;
                return 0;
            case 10:
                ip0Var.f377247y = aVar2.k(intValue);
                ip0Var.f377248z = true;
                return 0;
            case 11:
                ip0Var.A = aVar2.k(intValue);
                return 0;
            case 12:
                ip0Var.B = aVar2.k(intValue);
                ip0Var.C = true;
                return 0;
            case 13:
                ip0Var.D = aVar2.k(intValue);
                ip0Var.E = true;
                return 0;
            default:
                return -1;
        }
    }
}
