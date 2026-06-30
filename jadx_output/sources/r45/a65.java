package r45;

/* loaded from: classes9.dex */
public class a65 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369778d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369779e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369780f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369781g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369782h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f369783i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f369784m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f369785n;

    /* renamed from: o, reason: collision with root package name */
    public long f369786o;

    /* renamed from: p, reason: collision with root package name */
    public long f369787p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f369788q;

    /* renamed from: r, reason: collision with root package name */
    public long f369789r;

    /* renamed from: s, reason: collision with root package name */
    public int f369790s;

    /* renamed from: t, reason: collision with root package name */
    public int f369791t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f369792u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f369793v;

    /* renamed from: w, reason: collision with root package name */
    public long f369794w;

    /* renamed from: x, reason: collision with root package name */
    public int f369795x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a65)) {
            return false;
        }
        r45.a65 a65Var = (r45.a65) fVar;
        return n51.f.a(this.f369778d, a65Var.f369778d) && n51.f.a(this.f369779e, a65Var.f369779e) && n51.f.a(this.f369780f, a65Var.f369780f) && n51.f.a(this.f369781g, a65Var.f369781g) && n51.f.a(this.f369782h, a65Var.f369782h) && n51.f.a(this.f369783i, a65Var.f369783i) && n51.f.a(this.f369784m, a65Var.f369784m) && n51.f.a(this.f369785n, a65Var.f369785n) && n51.f.a(java.lang.Long.valueOf(this.f369786o), java.lang.Long.valueOf(a65Var.f369786o)) && n51.f.a(java.lang.Long.valueOf(this.f369787p), java.lang.Long.valueOf(a65Var.f369787p)) && n51.f.a(this.f369788q, a65Var.f369788q) && n51.f.a(java.lang.Long.valueOf(this.f369789r), java.lang.Long.valueOf(a65Var.f369789r)) && n51.f.a(java.lang.Integer.valueOf(this.f369790s), java.lang.Integer.valueOf(a65Var.f369790s)) && n51.f.a(java.lang.Integer.valueOf(this.f369791t), java.lang.Integer.valueOf(a65Var.f369791t)) && n51.f.a(this.f369792u, a65Var.f369792u) && n51.f.a(this.f369793v, a65Var.f369793v) && n51.f.a(java.lang.Long.valueOf(this.f369794w), java.lang.Long.valueOf(a65Var.f369794w)) && n51.f.a(java.lang.Integer.valueOf(this.f369795x), java.lang.Integer.valueOf(a65Var.f369795x));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f369778d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f369779e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f369780f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f369781g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f369782h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f369783i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f369784m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f369785n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            fVar.h(9, this.f369786o);
            fVar.h(10, this.f369787p);
            java.lang.String str9 = this.f369788q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            fVar.h(12, this.f369789r);
            fVar.e(13, this.f369790s);
            fVar.e(14, this.f369791t);
            java.lang.String str10 = this.f369792u;
            if (str10 != null) {
                fVar.j(15, str10);
            }
            java.lang.String str11 = this.f369793v;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            fVar.h(17, this.f369794w);
            fVar.e(18, this.f369795x);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f369778d;
            int j17 = str12 != null ? b36.f.j(1, str12) + 0 : 0;
            java.lang.String str13 = this.f369779e;
            if (str13 != null) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f369780f;
            if (str14 != null) {
                j17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f369781g;
            if (str15 != null) {
                j17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f369782h;
            if (str16 != null) {
                j17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f369783i;
            if (str17 != null) {
                j17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f369784m;
            if (str18 != null) {
                j17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f369785n;
            if (str19 != null) {
                j17 += b36.f.j(8, str19);
            }
            int h17 = j17 + b36.f.h(9, this.f369786o) + b36.f.h(10, this.f369787p);
            java.lang.String str20 = this.f369788q;
            if (str20 != null) {
                h17 += b36.f.j(11, str20);
            }
            int h18 = h17 + b36.f.h(12, this.f369789r) + b36.f.e(13, this.f369790s) + b36.f.e(14, this.f369791t);
            java.lang.String str21 = this.f369792u;
            if (str21 != null) {
                h18 += b36.f.j(15, str21);
            }
            java.lang.String str22 = this.f369793v;
            if (str22 != null) {
                h18 += b36.f.j(16, str22);
            }
            return h18 + b36.f.h(17, this.f369794w) + b36.f.e(18, this.f369795x);
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
        r45.a65 a65Var = (r45.a65) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a65Var.f369778d = aVar2.k(intValue);
                return 0;
            case 2:
                a65Var.f369779e = aVar2.k(intValue);
                return 0;
            case 3:
                a65Var.f369780f = aVar2.k(intValue);
                return 0;
            case 4:
                a65Var.f369781g = aVar2.k(intValue);
                return 0;
            case 5:
                a65Var.f369782h = aVar2.k(intValue);
                return 0;
            case 6:
                a65Var.f369783i = aVar2.k(intValue);
                return 0;
            case 7:
                a65Var.f369784m = aVar2.k(intValue);
                return 0;
            case 8:
                a65Var.f369785n = aVar2.k(intValue);
                return 0;
            case 9:
                a65Var.f369786o = aVar2.i(intValue);
                return 0;
            case 10:
                a65Var.f369787p = aVar2.i(intValue);
                return 0;
            case 11:
                a65Var.f369788q = aVar2.k(intValue);
                return 0;
            case 12:
                a65Var.f369789r = aVar2.i(intValue);
                return 0;
            case 13:
                a65Var.f369790s = aVar2.g(intValue);
                return 0;
            case 14:
                a65Var.f369791t = aVar2.g(intValue);
                return 0;
            case 15:
                a65Var.f369792u = aVar2.k(intValue);
                return 0;
            case 16:
                a65Var.f369793v = aVar2.k(intValue);
                return 0;
            case 17:
                a65Var.f369794w = aVar2.i(intValue);
                return 0;
            case 18:
                a65Var.f369795x = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
