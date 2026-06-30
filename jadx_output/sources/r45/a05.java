package r45;

/* loaded from: classes11.dex */
public class a05 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369581d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369582e;

    /* renamed from: f, reason: collision with root package name */
    public int f369583f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369584g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369585h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f369586i;

    /* renamed from: m, reason: collision with root package name */
    public int f369587m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f369588n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f369589o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f369590p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f369591q;

    /* renamed from: r, reason: collision with root package name */
    public r45.b05 f369592r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f369593s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f369594t;

    /* renamed from: u, reason: collision with root package name */
    public int f369595u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f369596v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f369597w;

    /* renamed from: x, reason: collision with root package name */
    public long f369598x;

    /* renamed from: y, reason: collision with root package name */
    public long f369599y;

    /* renamed from: z, reason: collision with root package name */
    public int f369600z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a05)) {
            return false;
        }
        r45.a05 a05Var = (r45.a05) fVar;
        return n51.f.a(this.f369581d, a05Var.f369581d) && n51.f.a(this.f369582e, a05Var.f369582e) && n51.f.a(java.lang.Integer.valueOf(this.f369583f), java.lang.Integer.valueOf(a05Var.f369583f)) && n51.f.a(this.f369584g, a05Var.f369584g) && n51.f.a(this.f369585h, a05Var.f369585h) && n51.f.a(this.f369586i, a05Var.f369586i) && n51.f.a(java.lang.Integer.valueOf(this.f369587m), java.lang.Integer.valueOf(a05Var.f369587m)) && n51.f.a(this.f369588n, a05Var.f369588n) && n51.f.a(this.f369589o, a05Var.f369589o) && n51.f.a(this.f369590p, a05Var.f369590p) && n51.f.a(this.f369591q, a05Var.f369591q) && n51.f.a(this.f369592r, a05Var.f369592r) && n51.f.a(this.f369593s, a05Var.f369593s) && n51.f.a(this.f369594t, a05Var.f369594t) && n51.f.a(java.lang.Integer.valueOf(this.f369595u), java.lang.Integer.valueOf(a05Var.f369595u)) && n51.f.a(this.f369596v, a05Var.f369596v) && n51.f.a(this.f369597w, a05Var.f369597w) && n51.f.a(java.lang.Long.valueOf(this.f369598x), java.lang.Long.valueOf(a05Var.f369598x)) && n51.f.a(java.lang.Long.valueOf(this.f369599y), java.lang.Long.valueOf(a05Var.f369599y)) && n51.f.a(java.lang.Integer.valueOf(this.f369600z), java.lang.Integer.valueOf(a05Var.f369600z));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f369581d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f369582e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f369583f);
            java.lang.String str3 = this.f369584g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f369585h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f369586i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f369587m);
            java.lang.String str6 = this.f369588n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f369589o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f369590p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f369591q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            r45.b05 b05Var = this.f369592r;
            if (b05Var != null) {
                fVar.i(12, b05Var.computeSize());
                this.f369592r.writeFields(fVar);
            }
            java.lang.String str10 = this.f369593s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f369594t;
            if (str11 != null) {
                fVar.j(14, str11);
            }
            fVar.e(15, this.f369595u);
            java.lang.String str12 = this.f369596v;
            if (str12 != null) {
                fVar.j(16, str12);
            }
            java.lang.String str13 = this.f369597w;
            if (str13 != null) {
                fVar.j(17, str13);
            }
            fVar.h(18, this.f369598x);
            fVar.h(21, this.f369599y);
            fVar.e(22, this.f369600z);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.f369581d;
            int j17 = str14 != null ? b36.f.j(1, str14) + 0 : 0;
            java.lang.String str15 = this.f369582e;
            if (str15 != null) {
                j17 += b36.f.j(2, str15);
            }
            int e17 = j17 + b36.f.e(3, this.f369583f);
            java.lang.String str16 = this.f369584g;
            if (str16 != null) {
                e17 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f369585h;
            if (str17 != null) {
                e17 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.f369586i;
            if (str18 != null) {
                e17 += b36.f.j(6, str18);
            }
            int e18 = e17 + b36.f.e(7, this.f369587m);
            java.lang.String str19 = this.f369588n;
            if (str19 != null) {
                e18 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f369589o;
            if (str20 != null) {
                e18 += b36.f.j(9, str20);
            }
            java.lang.String str21 = this.f369590p;
            if (str21 != null) {
                e18 += b36.f.j(10, str21);
            }
            java.lang.String str22 = this.f369591q;
            if (str22 != null) {
                e18 += b36.f.j(11, str22);
            }
            r45.b05 b05Var2 = this.f369592r;
            if (b05Var2 != null) {
                e18 += b36.f.i(12, b05Var2.computeSize());
            }
            java.lang.String str23 = this.f369593s;
            if (str23 != null) {
                e18 += b36.f.j(13, str23);
            }
            java.lang.String str24 = this.f369594t;
            if (str24 != null) {
                e18 += b36.f.j(14, str24);
            }
            int e19 = e18 + b36.f.e(15, this.f369595u);
            java.lang.String str25 = this.f369596v;
            if (str25 != null) {
                e19 += b36.f.j(16, str25);
            }
            java.lang.String str26 = this.f369597w;
            if (str26 != null) {
                e19 += b36.f.j(17, str26);
            }
            return e19 + b36.f.h(18, this.f369598x) + b36.f.h(21, this.f369599y) + b36.f.e(22, this.f369600z);
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
        r45.a05 a05Var = (r45.a05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a05Var.f369581d = aVar2.k(intValue);
                return 0;
            case 2:
                a05Var.f369582e = aVar2.k(intValue);
                return 0;
            case 3:
                a05Var.f369583f = aVar2.g(intValue);
                return 0;
            case 4:
                a05Var.f369584g = aVar2.k(intValue);
                return 0;
            case 5:
                a05Var.f369585h = aVar2.k(intValue);
                return 0;
            case 6:
                a05Var.f369586i = aVar2.k(intValue);
                return 0;
            case 7:
                a05Var.f369587m = aVar2.g(intValue);
                return 0;
            case 8:
                a05Var.f369588n = aVar2.k(intValue);
                return 0;
            case 9:
                a05Var.f369589o = aVar2.k(intValue);
                return 0;
            case 10:
                a05Var.f369590p = aVar2.k(intValue);
                return 0;
            case 11:
                a05Var.f369591q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.b05 b05Var3 = new r45.b05();
                    if (bArr != null && bArr.length > 0) {
                        b05Var3.parseFrom(bArr);
                    }
                    a05Var.f369592r = b05Var3;
                }
                return 0;
            case 13:
                a05Var.f369593s = aVar2.k(intValue);
                return 0;
            case 14:
                a05Var.f369594t = aVar2.k(intValue);
                return 0;
            case 15:
                a05Var.f369595u = aVar2.g(intValue);
                return 0;
            case 16:
                a05Var.f369596v = aVar2.k(intValue);
                return 0;
            case 17:
                a05Var.f369597w = aVar2.k(intValue);
                return 0;
            case 18:
                a05Var.f369598x = aVar2.i(intValue);
                return 0;
            case 19:
            case 20:
            default:
                return -1;
            case 21:
                a05Var.f369599y = aVar2.i(intValue);
                return 0;
            case 22:
                a05Var.f369600z = aVar2.g(intValue);
                return 0;
        }
    }
}
