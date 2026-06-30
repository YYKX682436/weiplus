package r45;

/* loaded from: classes9.dex */
public class lm5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379622d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379623e;

    /* renamed from: f, reason: collision with root package name */
    public long f379624f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f379625g;

    /* renamed from: h, reason: collision with root package name */
    public long f379626h;

    /* renamed from: i, reason: collision with root package name */
    public long f379627i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f379628m;

    /* renamed from: n, reason: collision with root package name */
    public long f379629n;

    /* renamed from: o, reason: collision with root package name */
    public long f379630o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f379631p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f379632q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f379633r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f379634s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f379635t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f379636u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lm5)) {
            return false;
        }
        r45.lm5 lm5Var = (r45.lm5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379622d), java.lang.Integer.valueOf(lm5Var.f379622d)) && n51.f.a(this.f379623e, lm5Var.f379623e) && n51.f.a(java.lang.Long.valueOf(this.f379624f), java.lang.Long.valueOf(lm5Var.f379624f)) && n51.f.a(java.lang.Boolean.valueOf(this.f379625g), java.lang.Boolean.valueOf(lm5Var.f379625g)) && n51.f.a(java.lang.Long.valueOf(this.f379626h), java.lang.Long.valueOf(lm5Var.f379626h)) && n51.f.a(java.lang.Long.valueOf(this.f379627i), java.lang.Long.valueOf(lm5Var.f379627i)) && n51.f.a(java.lang.Boolean.valueOf(this.f379628m), java.lang.Boolean.valueOf(lm5Var.f379628m)) && n51.f.a(java.lang.Long.valueOf(this.f379629n), java.lang.Long.valueOf(lm5Var.f379629n)) && n51.f.a(java.lang.Long.valueOf(this.f379630o), java.lang.Long.valueOf(lm5Var.f379630o)) && n51.f.a(this.f379631p, lm5Var.f379631p) && n51.f.a(this.f379632q, lm5Var.f379632q) && n51.f.a(this.f379633r, lm5Var.f379633r) && n51.f.a(this.f379634s, lm5Var.f379634s) && n51.f.a(this.f379635t, lm5Var.f379635t) && n51.f.a(this.f379636u, lm5Var.f379636u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379622d);
            java.lang.String str = this.f379623e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f379624f);
            fVar.a(4, this.f379625g);
            fVar.h(5, this.f379626h);
            fVar.h(6, this.f379627i);
            fVar.a(7, this.f379628m);
            fVar.h(8, this.f379629n);
            fVar.h(9, this.f379630o);
            java.lang.String str2 = this.f379631p;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f379632q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f379633r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f379634s;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f379635t;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            java.lang.String str7 = this.f379636u;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379622d) + 0;
            java.lang.String str8 = this.f379623e;
            if (str8 != null) {
                e17 += b36.f.j(2, str8);
            }
            int h17 = e17 + b36.f.h(3, this.f379624f) + b36.f.a(4, this.f379625g) + b36.f.h(5, this.f379626h) + b36.f.h(6, this.f379627i) + b36.f.a(7, this.f379628m) + b36.f.h(8, this.f379629n) + b36.f.h(9, this.f379630o);
            java.lang.String str9 = this.f379631p;
            if (str9 != null) {
                h17 += b36.f.j(10, str9);
            }
            java.lang.String str10 = this.f379632q;
            if (str10 != null) {
                h17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f379633r;
            if (str11 != null) {
                h17 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f379634s;
            if (str12 != null) {
                h17 += b36.f.j(13, str12);
            }
            java.lang.String str13 = this.f379635t;
            if (str13 != null) {
                h17 += b36.f.j(14, str13);
            }
            java.lang.String str14 = this.f379636u;
            return str14 != null ? h17 + b36.f.j(15, str14) : h17;
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
        r45.lm5 lm5Var = (r45.lm5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lm5Var.f379622d = aVar2.g(intValue);
                return 0;
            case 2:
                lm5Var.f379623e = aVar2.k(intValue);
                return 0;
            case 3:
                lm5Var.f379624f = aVar2.i(intValue);
                return 0;
            case 4:
                lm5Var.f379625g = aVar2.c(intValue);
                return 0;
            case 5:
                lm5Var.f379626h = aVar2.i(intValue);
                return 0;
            case 6:
                lm5Var.f379627i = aVar2.i(intValue);
                return 0;
            case 7:
                lm5Var.f379628m = aVar2.c(intValue);
                return 0;
            case 8:
                lm5Var.f379629n = aVar2.i(intValue);
                return 0;
            case 9:
                lm5Var.f379630o = aVar2.i(intValue);
                return 0;
            case 10:
                lm5Var.f379631p = aVar2.k(intValue);
                return 0;
            case 11:
                lm5Var.f379632q = aVar2.k(intValue);
                return 0;
            case 12:
                lm5Var.f379633r = aVar2.k(intValue);
                return 0;
            case 13:
                lm5Var.f379634s = aVar2.k(intValue);
                return 0;
            case 14:
                lm5Var.f379635t = aVar2.k(intValue);
                return 0;
            case 15:
                lm5Var.f379636u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
