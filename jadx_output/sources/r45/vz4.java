package r45;

/* loaded from: classes11.dex */
public class vz4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388719d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388720e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388721f;

    /* renamed from: g, reason: collision with root package name */
    public int f388722g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388723h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388724i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388725m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388726n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f388727o;

    /* renamed from: p, reason: collision with root package name */
    public int f388728p;

    /* renamed from: q, reason: collision with root package name */
    public int f388729q;

    /* renamed from: r, reason: collision with root package name */
    public int f388730r;

    /* renamed from: s, reason: collision with root package name */
    public long f388731s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vz4)) {
            return false;
        }
        r45.vz4 vz4Var = (r45.vz4) fVar;
        return n51.f.a(this.f388719d, vz4Var.f388719d) && n51.f.a(this.f388720e, vz4Var.f388720e) && n51.f.a(this.f388721f, vz4Var.f388721f) && n51.f.a(java.lang.Integer.valueOf(this.f388722g), java.lang.Integer.valueOf(vz4Var.f388722g)) && n51.f.a(this.f388723h, vz4Var.f388723h) && n51.f.a(this.f388724i, vz4Var.f388724i) && n51.f.a(this.f388725m, vz4Var.f388725m) && n51.f.a(this.f388726n, vz4Var.f388726n) && n51.f.a(this.f388727o, vz4Var.f388727o) && n51.f.a(java.lang.Integer.valueOf(this.f388728p), java.lang.Integer.valueOf(vz4Var.f388728p)) && n51.f.a(java.lang.Integer.valueOf(this.f388729q), java.lang.Integer.valueOf(vz4Var.f388729q)) && n51.f.a(java.lang.Integer.valueOf(this.f388730r), java.lang.Integer.valueOf(vz4Var.f388730r)) && n51.f.a(java.lang.Long.valueOf(this.f388731s), java.lang.Long.valueOf(vz4Var.f388731s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388719d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388720e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f388721f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f388722g);
            java.lang.String str4 = this.f388723h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f388724i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f388725m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f388726n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f388727o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            fVar.e(10, this.f388728p);
            fVar.e(11, this.f388729q);
            fVar.e(12, this.f388730r);
            fVar.h(13, this.f388731s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f388719d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f388720e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f388721f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            int e17 = j17 + b36.f.e(4, this.f388722g);
            java.lang.String str12 = this.f388723h;
            if (str12 != null) {
                e17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f388724i;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f388725m;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f388726n;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f388727o;
            if (str16 != null) {
                e17 += b36.f.j(9, str16);
            }
            return e17 + b36.f.e(10, this.f388728p) + b36.f.e(11, this.f388729q) + b36.f.e(12, this.f388730r) + b36.f.h(13, this.f388731s);
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
        r45.vz4 vz4Var = (r45.vz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vz4Var.f388719d = aVar2.k(intValue);
                return 0;
            case 2:
                vz4Var.f388720e = aVar2.k(intValue);
                return 0;
            case 3:
                vz4Var.f388721f = aVar2.k(intValue);
                return 0;
            case 4:
                vz4Var.f388722g = aVar2.g(intValue);
                return 0;
            case 5:
                vz4Var.f388723h = aVar2.k(intValue);
                return 0;
            case 6:
                vz4Var.f388724i = aVar2.k(intValue);
                return 0;
            case 7:
                vz4Var.f388725m = aVar2.k(intValue);
                return 0;
            case 8:
                vz4Var.f388726n = aVar2.k(intValue);
                return 0;
            case 9:
                vz4Var.f388727o = aVar2.k(intValue);
                return 0;
            case 10:
                vz4Var.f388728p = aVar2.g(intValue);
                return 0;
            case 11:
                vz4Var.f388729q = aVar2.g(intValue);
                return 0;
            case 12:
                vz4Var.f388730r = aVar2.g(intValue);
                return 0;
            case 13:
                vz4Var.f388731s = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
