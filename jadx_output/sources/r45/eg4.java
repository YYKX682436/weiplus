package r45;

/* loaded from: classes2.dex */
public class eg4 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public java.lang.String D;

    /* renamed from: d, reason: collision with root package name */
    public boolean f373444d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f373445e;

    /* renamed from: f, reason: collision with root package name */
    public int f373446f;

    /* renamed from: g, reason: collision with root package name */
    public int f373447g;

    /* renamed from: h, reason: collision with root package name */
    public int f373448h;

    /* renamed from: i, reason: collision with root package name */
    public int f373449i;

    /* renamed from: m, reason: collision with root package name */
    public int f373450m;

    /* renamed from: n, reason: collision with root package name */
    public int f373451n;

    /* renamed from: p, reason: collision with root package name */
    public long f373453p;

    /* renamed from: s, reason: collision with root package name */
    public int f373456s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f373457t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f373458u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f373459v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f373460w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f373461x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f373462y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f373463z;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f373452o = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f373454q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f373455r = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eg4)) {
            return false;
        }
        r45.eg4 eg4Var = (r45.eg4) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f373444d), java.lang.Boolean.valueOf(eg4Var.f373444d)) && n51.f.a(java.lang.Boolean.valueOf(this.f373445e), java.lang.Boolean.valueOf(eg4Var.f373445e)) && n51.f.a(java.lang.Integer.valueOf(this.f373446f), java.lang.Integer.valueOf(eg4Var.f373446f)) && n51.f.a(java.lang.Integer.valueOf(this.f373447g), java.lang.Integer.valueOf(eg4Var.f373447g)) && n51.f.a(java.lang.Integer.valueOf(this.f373448h), java.lang.Integer.valueOf(eg4Var.f373448h)) && n51.f.a(java.lang.Integer.valueOf(this.f373449i), java.lang.Integer.valueOf(eg4Var.f373449i)) && n51.f.a(java.lang.Integer.valueOf(this.f373450m), java.lang.Integer.valueOf(eg4Var.f373450m)) && n51.f.a(java.lang.Integer.valueOf(this.f373451n), java.lang.Integer.valueOf(eg4Var.f373451n)) && n51.f.a(this.f373452o, eg4Var.f373452o) && n51.f.a(java.lang.Long.valueOf(this.f373453p), java.lang.Long.valueOf(eg4Var.f373453p)) && n51.f.a(this.f373454q, eg4Var.f373454q) && n51.f.a(this.f373455r, eg4Var.f373455r) && n51.f.a(java.lang.Integer.valueOf(this.f373456s), java.lang.Integer.valueOf(eg4Var.f373456s)) && n51.f.a(this.f373457t, eg4Var.f373457t) && n51.f.a(this.f373458u, eg4Var.f373458u) && n51.f.a(this.f373459v, eg4Var.f373459v) && n51.f.a(this.f373460w, eg4Var.f373460w) && n51.f.a(this.f373461x, eg4Var.f373461x) && n51.f.a(this.f373462y, eg4Var.f373462y) && n51.f.a(this.f373463z, eg4Var.f373463z) && n51.f.a(this.A, eg4Var.A) && n51.f.a(this.B, eg4Var.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(eg4Var.C)) && n51.f.a(this.D, eg4Var.D);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373455r;
        java.util.LinkedList linkedList2 = this.f373454q;
        java.util.LinkedList linkedList3 = this.f373452o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(2, this.f373444d);
            fVar.a(8, this.f373445e);
            fVar.e(3, this.f373446f);
            fVar.e(4, this.f373447g);
            fVar.e(5, this.f373448h);
            fVar.e(6, this.f373449i);
            fVar.e(7, this.f373450m);
            fVar.e(9, this.f373451n);
            fVar.g(10, 8, linkedList3);
            fVar.h(12, this.f373453p);
            fVar.g(14, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            fVar.e(103, this.f373456s);
            java.lang.String str = this.f373457t;
            if (str != null) {
                fVar.j(101, str);
            }
            java.lang.String str2 = this.f373458u;
            if (str2 != null) {
                fVar.j(102, str2);
            }
            java.lang.String str3 = this.f373459v;
            if (str3 != null) {
                fVar.j(104, str3);
            }
            java.lang.String str4 = this.f373460w;
            if (str4 != null) {
                fVar.j(105, str4);
            }
            java.lang.String str5 = this.f373461x;
            if (str5 != null) {
                fVar.j(201, str5);
            }
            java.lang.String str6 = this.f373462y;
            if (str6 != null) {
                fVar.j(203, str6);
            }
            java.lang.String str7 = this.f373463z;
            if (str7 != null) {
                fVar.j(204, str7);
            }
            java.lang.String str8 = this.A;
            if (str8 != null) {
                fVar.j(205, str8);
            }
            java.lang.String str9 = this.B;
            if (str9 != null) {
                fVar.j(206, str9);
            }
            fVar.e(301, this.C);
            java.lang.String str10 = this.D;
            if (str10 != null) {
                fVar.j(302, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(2, this.f373444d) + 0 + b36.f.a(8, this.f373445e) + b36.f.e(3, this.f373446f) + b36.f.e(4, this.f373447g) + b36.f.e(5, this.f373448h) + b36.f.e(6, this.f373449i) + b36.f.e(7, this.f373450m) + b36.f.e(9, this.f373451n) + b36.f.g(10, 8, linkedList3) + b36.f.h(12, this.f373453p) + b36.f.g(14, 8, linkedList2) + b36.f.g(13, 8, linkedList) + b36.f.e(103, this.f373456s);
            java.lang.String str11 = this.f373457t;
            if (str11 != null) {
                a17 += b36.f.j(101, str11);
            }
            java.lang.String str12 = this.f373458u;
            if (str12 != null) {
                a17 += b36.f.j(102, str12);
            }
            java.lang.String str13 = this.f373459v;
            if (str13 != null) {
                a17 += b36.f.j(104, str13);
            }
            java.lang.String str14 = this.f373460w;
            if (str14 != null) {
                a17 += b36.f.j(105, str14);
            }
            java.lang.String str15 = this.f373461x;
            if (str15 != null) {
                a17 += b36.f.j(201, str15);
            }
            java.lang.String str16 = this.f373462y;
            if (str16 != null) {
                a17 += b36.f.j(203, str16);
            }
            java.lang.String str17 = this.f373463z;
            if (str17 != null) {
                a17 += b36.f.j(204, str17);
            }
            java.lang.String str18 = this.A;
            if (str18 != null) {
                a17 += b36.f.j(205, str18);
            }
            java.lang.String str19 = this.B;
            if (str19 != null) {
                a17 += b36.f.j(206, str19);
            }
            int e17 = a17 + b36.f.e(301, this.C);
            java.lang.String str20 = this.D;
            return str20 != null ? e17 + b36.f.j(302, str20) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        r45.eg4 eg4Var = (r45.eg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 201) {
            eg4Var.f373461x = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 301) {
            eg4Var.C = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 302) {
            eg4Var.D = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 2:
                eg4Var.f373444d = aVar2.c(intValue);
                return 0;
            case 3:
                eg4Var.f373446f = aVar2.g(intValue);
                return 0;
            case 4:
                eg4Var.f373447g = aVar2.g(intValue);
                return 0;
            case 5:
                eg4Var.f373448h = aVar2.g(intValue);
                return 0;
            case 6:
                eg4Var.f373449i = aVar2.g(intValue);
                return 0;
            case 7:
                eg4Var.f373450m = aVar2.g(intValue);
                return 0;
            case 8:
                eg4Var.f373445e = aVar2.c(intValue);
                return 0;
            case 9:
                eg4Var.f373451n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.tg4 tg4Var = new r45.tg4();
                    if (bArr2 != null && bArr2.length > 0) {
                        tg4Var.parseFrom(bArr2);
                    }
                    eg4Var.f373452o.add(tg4Var);
                }
                return 0;
            default:
                switch (intValue) {
                    case 12:
                        eg4Var.f373453p = aVar2.i(intValue);
                        return 0;
                    case 13:
                        java.util.LinkedList j18 = aVar2.j(intValue);
                        int size2 = j18.size();
                        for (int i19 = 0; i19 < size2; i19++) {
                            byte[] bArr3 = (byte[]) j18.get(i19);
                            r45.ng4 ng4Var = new r45.ng4();
                            if (bArr3 != null && bArr3.length > 0) {
                                ng4Var.parseFrom(bArr3);
                            }
                            eg4Var.f373455r.add(ng4Var);
                        }
                        return 0;
                    case 14:
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size3 = j19.size();
                        for (int i27 = 0; i27 < size3; i27++) {
                            byte[] bArr4 = (byte[]) j19.get(i27);
                            r45.tg4 tg4Var2 = new r45.tg4();
                            if (bArr4 != null && bArr4.length > 0) {
                                tg4Var2.parseFrom(bArr4);
                            }
                            eg4Var.f373454q.add(tg4Var2);
                        }
                        return 0;
                    default:
                        switch (intValue) {
                            case 101:
                                eg4Var.f373457t = aVar2.k(intValue);
                                return 0;
                            case 102:
                                eg4Var.f373458u = aVar2.k(intValue);
                                return 0;
                            case 103:
                                eg4Var.f373456s = aVar2.g(intValue);
                                return 0;
                            case 104:
                                eg4Var.f373459v = aVar2.k(intValue);
                                return 0;
                            case 105:
                                eg4Var.f373460w = aVar2.k(intValue);
                                return 0;
                            default:
                                switch (intValue) {
                                    case 203:
                                        eg4Var.f373462y = aVar2.k(intValue);
                                        return 0;
                                    case 204:
                                        eg4Var.f373463z = aVar2.k(intValue);
                                        return 0;
                                    case 205:
                                        eg4Var.A = aVar2.k(intValue);
                                        return 0;
                                    case 206:
                                        eg4Var.B = aVar2.k(intValue);
                                        return 0;
                                    default:
                                        return -1;
                                }
                        }
                }
        }
    }
}
