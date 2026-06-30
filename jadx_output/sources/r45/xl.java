package r45;

/* loaded from: classes2.dex */
public class xl extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public java.lang.String B;

    /* renamed from: d, reason: collision with root package name */
    public int f390189d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390190e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390191f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390192g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390193h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390194i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390195m;

    /* renamed from: n, reason: collision with root package name */
    public int f390196n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f390197o;

    /* renamed from: p, reason: collision with root package name */
    public int f390198p;

    /* renamed from: q, reason: collision with root package name */
    public int f390199q;

    /* renamed from: r, reason: collision with root package name */
    public int f390200r;

    /* renamed from: s, reason: collision with root package name */
    public int f390201s;

    /* renamed from: t, reason: collision with root package name */
    public long f390202t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f390203u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public int f390204v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f390205w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f390206x;

    /* renamed from: y, reason: collision with root package name */
    public int f390207y;

    /* renamed from: z, reason: collision with root package name */
    public int f390208z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xl)) {
            return false;
        }
        r45.xl xlVar = (r45.xl) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390189d), java.lang.Integer.valueOf(xlVar.f390189d)) && n51.f.a(this.f390190e, xlVar.f390190e) && n51.f.a(this.f390191f, xlVar.f390191f) && n51.f.a(this.f390192g, xlVar.f390192g) && n51.f.a(this.f390193h, xlVar.f390193h) && n51.f.a(this.f390194i, xlVar.f390194i) && n51.f.a(this.f390195m, xlVar.f390195m) && n51.f.a(java.lang.Integer.valueOf(this.f390196n), java.lang.Integer.valueOf(xlVar.f390196n)) && n51.f.a(this.f390197o, xlVar.f390197o) && n51.f.a(java.lang.Integer.valueOf(this.f390198p), java.lang.Integer.valueOf(xlVar.f390198p)) && n51.f.a(java.lang.Integer.valueOf(this.f390199q), java.lang.Integer.valueOf(xlVar.f390199q)) && n51.f.a(java.lang.Integer.valueOf(this.f390200r), java.lang.Integer.valueOf(xlVar.f390200r)) && n51.f.a(java.lang.Integer.valueOf(this.f390201s), java.lang.Integer.valueOf(xlVar.f390201s)) && n51.f.a(java.lang.Long.valueOf(this.f390202t), java.lang.Long.valueOf(xlVar.f390202t)) && n51.f.a(this.f390203u, xlVar.f390203u) && n51.f.a(java.lang.Integer.valueOf(this.f390204v), java.lang.Integer.valueOf(xlVar.f390204v)) && n51.f.a(this.f390205w, xlVar.f390205w) && n51.f.a(this.f390206x, xlVar.f390206x) && n51.f.a(java.lang.Integer.valueOf(this.f390207y), java.lang.Integer.valueOf(xlVar.f390207y)) && n51.f.a(java.lang.Integer.valueOf(this.f390208z), java.lang.Integer.valueOf(xlVar.f390208z)) && n51.f.a(this.A, xlVar.A) && n51.f.a(this.B, xlVar.B);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390203u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390189d);
            java.lang.String str = this.f390190e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f390191f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f390192g;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f390193h;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f390194i;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f390195m;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            fVar.e(11, this.f390196n);
            java.lang.String str7 = this.f390197o;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            fVar.e(16, this.f390198p);
            fVar.e(17, this.f390199q);
            fVar.e(18, this.f390200r);
            fVar.e(19, this.f390201s);
            fVar.h(20, this.f390202t);
            fVar.g(21, 1, linkedList);
            fVar.e(22, this.f390204v);
            java.lang.String str8 = this.f390205w;
            if (str8 != null) {
                fVar.j(23, str8);
            }
            java.lang.String str9 = this.f390206x;
            if (str9 != null) {
                fVar.j(24, str9);
            }
            fVar.e(25, this.f390207y);
            fVar.e(26, this.f390208z);
            java.lang.String str10 = this.A;
            if (str10 != null) {
                fVar.j(27, str10);
            }
            java.lang.String str11 = this.B;
            if (str11 != null) {
                fVar.j(33, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f390189d) + 0;
            java.lang.String str12 = this.f390190e;
            if (str12 != null) {
                e17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f390191f;
            if (str13 != null) {
                e17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f390192g;
            if (str14 != null) {
                e17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f390193h;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f390194i;
            if (str16 != null) {
                e17 += b36.f.j(9, str16);
            }
            java.lang.String str17 = this.f390195m;
            if (str17 != null) {
                e17 += b36.f.j(10, str17);
            }
            int e18 = e17 + b36.f.e(11, this.f390196n);
            java.lang.String str18 = this.f390197o;
            if (str18 != null) {
                e18 += b36.f.j(15, str18);
            }
            int e19 = e18 + b36.f.e(16, this.f390198p) + b36.f.e(17, this.f390199q) + b36.f.e(18, this.f390200r) + b36.f.e(19, this.f390201s) + b36.f.h(20, this.f390202t) + b36.f.g(21, 1, linkedList) + b36.f.e(22, this.f390204v);
            java.lang.String str19 = this.f390205w;
            if (str19 != null) {
                e19 += b36.f.j(23, str19);
            }
            java.lang.String str20 = this.f390206x;
            if (str20 != null) {
                e19 += b36.f.j(24, str20);
            }
            int e27 = e19 + b36.f.e(25, this.f390207y) + b36.f.e(26, this.f390208z);
            java.lang.String str21 = this.A;
            if (str21 != null) {
                e27 += b36.f.j(27, str21);
            }
            java.lang.String str22 = this.B;
            return str22 != null ? e27 + b36.f.j(33, str22) : e27;
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
        r45.xl xlVar = (r45.xl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xlVar.f390189d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            xlVar.f390190e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            xlVar.f390191f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 6) {
            xlVar.f390192g = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 33) {
            xlVar.B = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 8:
                xlVar.f390193h = aVar2.k(intValue);
                return 0;
            case 9:
                xlVar.f390194i = aVar2.k(intValue);
                return 0;
            case 10:
                xlVar.f390195m = aVar2.k(intValue);
                return 0;
            case 11:
                xlVar.f390196n = aVar2.g(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 15:
                        xlVar.f390197o = aVar2.k(intValue);
                        return 0;
                    case 16:
                        xlVar.f390198p = aVar2.g(intValue);
                        return 0;
                    case 17:
                        xlVar.f390199q = aVar2.g(intValue);
                        return 0;
                    case 18:
                        xlVar.f390200r = aVar2.g(intValue);
                        return 0;
                    case 19:
                        xlVar.f390201s = aVar2.g(intValue);
                        return 0;
                    case 20:
                        xlVar.f390202t = aVar2.i(intValue);
                        return 0;
                    case 21:
                        xlVar.f390203u.add(aVar2.k(intValue));
                        return 0;
                    case 22:
                        xlVar.f390204v = aVar2.g(intValue);
                        return 0;
                    case 23:
                        xlVar.f390205w = aVar2.k(intValue);
                        return 0;
                    case 24:
                        xlVar.f390206x = aVar2.k(intValue);
                        return 0;
                    case 25:
                        xlVar.f390207y = aVar2.g(intValue);
                        return 0;
                    case 26:
                        xlVar.f390208z = aVar2.g(intValue);
                        return 0;
                    case 27:
                        xlVar.A = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
