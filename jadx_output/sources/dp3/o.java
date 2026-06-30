package dp3;

/* loaded from: classes9.dex */
public class o extends com.tencent.mm.protobuf.f {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f242224d;

    /* renamed from: e, reason: collision with root package name */
    public double f242225e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f242226f;

    /* renamed from: g, reason: collision with root package name */
    public int f242227g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f242228h;

    /* renamed from: i, reason: collision with root package name */
    public int f242229i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f242230m;

    /* renamed from: n, reason: collision with root package name */
    public int f242231n;

    /* renamed from: o, reason: collision with root package name */
    public int f242232o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f242233p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f242234q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f242235r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f242236s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f242237t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f242238u;

    /* renamed from: v, reason: collision with root package name */
    public int f242239v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f242240w = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f242241x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f242242y;

    /* renamed from: z, reason: collision with root package name */
    public double f242243z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof dp3.o)) {
            return false;
        }
        dp3.o oVar = (dp3.o) fVar;
        return n51.f.a(this.f242224d, oVar.f242224d) && n51.f.a(java.lang.Double.valueOf(this.f242225e), java.lang.Double.valueOf(oVar.f242225e)) && n51.f.a(this.f242226f, oVar.f242226f) && n51.f.a(java.lang.Integer.valueOf(this.f242227g), java.lang.Integer.valueOf(oVar.f242227g)) && n51.f.a(this.f242228h, oVar.f242228h) && n51.f.a(java.lang.Integer.valueOf(this.f242229i), java.lang.Integer.valueOf(oVar.f242229i)) && n51.f.a(this.f242230m, oVar.f242230m) && n51.f.a(java.lang.Integer.valueOf(this.f242231n), java.lang.Integer.valueOf(oVar.f242231n)) && n51.f.a(java.lang.Integer.valueOf(this.f242232o), java.lang.Integer.valueOf(oVar.f242232o)) && n51.f.a(this.f242233p, oVar.f242233p) && n51.f.a(this.f242234q, oVar.f242234q) && n51.f.a(this.f242235r, oVar.f242235r) && n51.f.a(this.f242236s, oVar.f242236s) && n51.f.a(this.f242237t, oVar.f242237t) && n51.f.a(this.f242238u, oVar.f242238u) && n51.f.a(java.lang.Integer.valueOf(this.f242239v), java.lang.Integer.valueOf(oVar.f242239v)) && n51.f.a(this.f242240w, oVar.f242240w) && n51.f.a(this.f242241x, oVar.f242241x) && n51.f.a(this.f242242y, oVar.f242242y) && n51.f.a(java.lang.Double.valueOf(this.f242243z), java.lang.Double.valueOf(oVar.f242243z)) && n51.f.a(this.A, oVar.A);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f242240w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f242224d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.c(2, this.f242225e);
            java.lang.String str2 = this.f242226f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f242227g);
            java.lang.String str3 = this.f242228h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f242229i);
            java.lang.String str4 = this.f242230m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f242231n);
            fVar.e(9, this.f242232o);
            java.lang.String str5 = this.f242233p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f242234q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f242235r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            java.lang.String str8 = this.f242236s;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            java.lang.String str9 = this.f242237t;
            if (str9 != null) {
                fVar.j(14, str9);
            }
            java.lang.String str10 = this.f242238u;
            if (str10 != null) {
                fVar.j(15, str10);
            }
            fVar.e(16, this.f242239v);
            fVar.g(17, 8, linkedList);
            java.lang.String str11 = this.f242241x;
            if (str11 != null) {
                fVar.j(18, str11);
            }
            java.lang.String str12 = this.f242242y;
            if (str12 != null) {
                fVar.j(19, str12);
            }
            fVar.c(20, this.f242243z);
            java.lang.String str13 = this.A;
            if (str13 != null) {
                fVar.j(21, str13);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.f242224d;
            int j17 = (str14 != null ? b36.f.j(1, str14) + 0 : 0) + b36.f.c(2, this.f242225e);
            java.lang.String str15 = this.f242226f;
            if (str15 != null) {
                j17 += b36.f.j(3, str15);
            }
            int e17 = j17 + b36.f.e(4, this.f242227g);
            java.lang.String str16 = this.f242228h;
            if (str16 != null) {
                e17 += b36.f.j(5, str16);
            }
            int e18 = e17 + b36.f.e(6, this.f242229i);
            java.lang.String str17 = this.f242230m;
            if (str17 != null) {
                e18 += b36.f.j(7, str17);
            }
            int e19 = e18 + b36.f.e(8, this.f242231n) + b36.f.e(9, this.f242232o);
            java.lang.String str18 = this.f242233p;
            if (str18 != null) {
                e19 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.f242234q;
            if (str19 != null) {
                e19 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.f242235r;
            if (str20 != null) {
                e19 += b36.f.j(12, str20);
            }
            java.lang.String str21 = this.f242236s;
            if (str21 != null) {
                e19 += b36.f.j(13, str21);
            }
            java.lang.String str22 = this.f242237t;
            if (str22 != null) {
                e19 += b36.f.j(14, str22);
            }
            java.lang.String str23 = this.f242238u;
            if (str23 != null) {
                e19 += b36.f.j(15, str23);
            }
            int e27 = e19 + b36.f.e(16, this.f242239v) + b36.f.g(17, 8, linkedList);
            java.lang.String str24 = this.f242241x;
            if (str24 != null) {
                e27 += b36.f.j(18, str24);
            }
            java.lang.String str25 = this.f242242y;
            if (str25 != null) {
                e27 += b36.f.j(19, str25);
            }
            int c17 = e27 + b36.f.c(20, this.f242243z);
            java.lang.String str26 = this.A;
            return str26 != null ? c17 + b36.f.j(21, str26) : c17;
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
        dp3.o oVar = (dp3.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oVar.f242224d = aVar2.k(intValue);
                return 0;
            case 2:
                oVar.f242225e = aVar2.e(intValue);
                return 0;
            case 3:
                oVar.f242226f = aVar2.k(intValue);
                return 0;
            case 4:
                oVar.f242227g = aVar2.g(intValue);
                return 0;
            case 5:
                oVar.f242228h = aVar2.k(intValue);
                return 0;
            case 6:
                oVar.f242229i = aVar2.g(intValue);
                return 0;
            case 7:
                oVar.f242230m = aVar2.k(intValue);
                return 0;
            case 8:
                oVar.f242231n = aVar2.g(intValue);
                return 0;
            case 9:
                oVar.f242232o = aVar2.g(intValue);
                return 0;
            case 10:
                oVar.f242233p = aVar2.k(intValue);
                return 0;
            case 11:
                oVar.f242234q = aVar2.k(intValue);
                return 0;
            case 12:
                oVar.f242235r = aVar2.k(intValue);
                return 0;
            case 13:
                oVar.f242236s = aVar2.k(intValue);
                return 0;
            case 14:
                oVar.f242237t = aVar2.k(intValue);
                return 0;
            case 15:
                oVar.f242238u = aVar2.k(intValue);
                return 0;
            case 16:
                oVar.f242239v = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    dp3.t tVar = new dp3.t();
                    if (bArr2 != null && bArr2.length > 0) {
                        tVar.parseFrom(bArr2);
                    }
                    oVar.f242240w.add(tVar);
                }
                return 0;
            case 18:
                oVar.f242241x = aVar2.k(intValue);
                return 0;
            case 19:
                oVar.f242242y = aVar2.k(intValue);
                return 0;
            case 20:
                oVar.f242243z = aVar2.e(intValue);
                return 0;
            case 21:
                oVar.A = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
