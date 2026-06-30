package vr4;

/* loaded from: classes9.dex */
public class i1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f439734d;

    /* renamed from: e, reason: collision with root package name */
    public int f439735e;

    /* renamed from: f, reason: collision with root package name */
    public long f439736f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f439737g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f439738h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f439739i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f439740m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f439741n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f439742o;

    /* renamed from: p, reason: collision with root package name */
    public double f439743p;

    /* renamed from: q, reason: collision with root package name */
    public double f439744q;

    /* renamed from: r, reason: collision with root package name */
    public int f439745r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f439746s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f439747t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f439748u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f439749v = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.i1)) {
            return false;
        }
        vr4.i1 i1Var = (vr4.i1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f439734d), java.lang.Integer.valueOf(i1Var.f439734d)) && n51.f.a(java.lang.Integer.valueOf(this.f439735e), java.lang.Integer.valueOf(i1Var.f439735e)) && n51.f.a(java.lang.Long.valueOf(this.f439736f), java.lang.Long.valueOf(i1Var.f439736f)) && n51.f.a(this.f439737g, i1Var.f439737g) && n51.f.a(this.f439738h, i1Var.f439738h) && n51.f.a(this.f439739i, i1Var.f439739i) && n51.f.a(this.f439740m, i1Var.f439740m) && n51.f.a(this.f439741n, i1Var.f439741n) && n51.f.a(this.f439742o, i1Var.f439742o) && n51.f.a(java.lang.Double.valueOf(this.f439743p), java.lang.Double.valueOf(i1Var.f439743p)) && n51.f.a(java.lang.Double.valueOf(this.f439744q), java.lang.Double.valueOf(i1Var.f439744q)) && n51.f.a(java.lang.Integer.valueOf(this.f439745r), java.lang.Integer.valueOf(i1Var.f439745r)) && n51.f.a(this.f439746s, i1Var.f439746s) && n51.f.a(this.f439747t, i1Var.f439747t) && n51.f.a(this.f439748u, i1Var.f439748u) && n51.f.a(this.f439749v, i1Var.f439749v);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f439749v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f439734d);
            fVar.e(2, this.f439735e);
            fVar.h(3, this.f439736f);
            java.lang.String str = this.f439737g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f439738h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f439739i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f439740m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f439741n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f439742o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.c(10, this.f439743p);
            fVar.c(11, this.f439744q);
            fVar.e(12, this.f439745r);
            java.lang.String str7 = this.f439746s;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f439747t;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            java.lang.String str9 = this.f439748u;
            if (str9 != null) {
                fVar.j(16, str9);
            }
            fVar.g(17, 6, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f439734d) + 0 + b36.f.e(2, this.f439735e) + b36.f.h(3, this.f439736f);
            java.lang.String str10 = this.f439737g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f439738h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f439739i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f439740m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f439741n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f439742o;
            if (str15 != null) {
                e17 += b36.f.j(9, str15);
            }
            int c17 = e17 + b36.f.c(10, this.f439743p) + b36.f.c(11, this.f439744q) + b36.f.e(12, this.f439745r);
            java.lang.String str16 = this.f439746s;
            if (str16 != null) {
                c17 += b36.f.j(13, str16);
            }
            java.lang.String str17 = this.f439747t;
            if (str17 != null) {
                c17 += b36.f.j(14, str17);
            }
            java.lang.String str18 = this.f439748u;
            if (str18 != null) {
                c17 += b36.f.j(16, str18);
            }
            return c17 + b36.f.g(17, 6, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        vr4.i1 i1Var = (vr4.i1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i1Var.f439734d = aVar2.g(intValue);
                return 0;
            case 2:
                i1Var.f439735e = aVar2.g(intValue);
                return 0;
            case 3:
                i1Var.f439736f = aVar2.i(intValue);
                return 0;
            case 4:
                i1Var.f439737g = aVar2.k(intValue);
                return 0;
            case 5:
                i1Var.f439738h = aVar2.k(intValue);
                return 0;
            case 6:
                i1Var.f439739i = aVar2.k(intValue);
                return 0;
            case 7:
                i1Var.f439740m = aVar2.k(intValue);
                return 0;
            case 8:
                i1Var.f439741n = aVar2.k(intValue);
                return 0;
            case 9:
                i1Var.f439742o = aVar2.k(intValue);
                return 0;
            case 10:
                i1Var.f439743p = aVar2.e(intValue);
                return 0;
            case 11:
                i1Var.f439744q = aVar2.e(intValue);
                return 0;
            case 12:
                i1Var.f439745r = aVar2.g(intValue);
                return 0;
            case 13:
                i1Var.f439746s = aVar2.k(intValue);
                return 0;
            case 14:
                i1Var.f439747t = aVar2.k(intValue);
                return 0;
            case 15:
            default:
                return -1;
            case 16:
                i1Var.f439748u = aVar2.k(intValue);
                return 0;
            case 17:
                i1Var.f439749v.add(aVar2.d(intValue));
                return 0;
        }
    }
}
