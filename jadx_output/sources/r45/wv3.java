package r45;

/* loaded from: classes9.dex */
public class wv3 extends com.tencent.mm.protobuf.f {
    public int A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public r45.r74 E;
    public int F;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389498d;

    /* renamed from: e, reason: collision with root package name */
    public int f389499e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389500f;

    /* renamed from: g, reason: collision with root package name */
    public r45.xv3 f389501g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389502h;

    /* renamed from: i, reason: collision with root package name */
    public int f389503i;

    /* renamed from: m, reason: collision with root package name */
    public int f389504m;

    /* renamed from: n, reason: collision with root package name */
    public long f389505n;

    /* renamed from: o, reason: collision with root package name */
    public int f389506o;

    /* renamed from: p, reason: collision with root package name */
    public int f389507p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f389508q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f389509r;

    /* renamed from: s, reason: collision with root package name */
    public int f389510s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f389511t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f389512u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f389513v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f389514w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f389515x;

    /* renamed from: y, reason: collision with root package name */
    public int f389516y;

    /* renamed from: z, reason: collision with root package name */
    public long f389517z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wv3)) {
            return false;
        }
        r45.wv3 wv3Var = (r45.wv3) fVar;
        return n51.f.a(this.f389498d, wv3Var.f389498d) && n51.f.a(java.lang.Integer.valueOf(this.f389499e), java.lang.Integer.valueOf(wv3Var.f389499e)) && n51.f.a(this.f389500f, wv3Var.f389500f) && n51.f.a(this.f389501g, wv3Var.f389501g) && n51.f.a(this.f389502h, wv3Var.f389502h) && n51.f.a(java.lang.Integer.valueOf(this.f389503i), java.lang.Integer.valueOf(wv3Var.f389503i)) && n51.f.a(java.lang.Integer.valueOf(this.f389504m), java.lang.Integer.valueOf(wv3Var.f389504m)) && n51.f.a(java.lang.Long.valueOf(this.f389505n), java.lang.Long.valueOf(wv3Var.f389505n)) && n51.f.a(java.lang.Integer.valueOf(this.f389506o), java.lang.Integer.valueOf(wv3Var.f389506o)) && n51.f.a(java.lang.Integer.valueOf(this.f389507p), java.lang.Integer.valueOf(wv3Var.f389507p)) && n51.f.a(this.f389508q, wv3Var.f389508q) && n51.f.a(this.f389509r, wv3Var.f389509r) && n51.f.a(java.lang.Integer.valueOf(this.f389510s), java.lang.Integer.valueOf(wv3Var.f389510s)) && n51.f.a(this.f389511t, wv3Var.f389511t) && n51.f.a(this.f389512u, wv3Var.f389512u) && n51.f.a(this.f389513v, wv3Var.f389513v) && n51.f.a(this.f389514w, wv3Var.f389514w) && n51.f.a(this.f389515x, wv3Var.f389515x) && n51.f.a(java.lang.Integer.valueOf(this.f389516y), java.lang.Integer.valueOf(wv3Var.f389516y)) && n51.f.a(java.lang.Long.valueOf(this.f389517z), java.lang.Long.valueOf(wv3Var.f389517z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(wv3Var.A)) && n51.f.a(this.B, wv3Var.B) && n51.f.a(this.C, wv3Var.C) && n51.f.a(this.D, wv3Var.D) && n51.f.a(this.E, wv3Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(wv3Var.F));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389498d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f389499e);
            java.lang.String str2 = this.f389500f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.xv3 xv3Var = this.f389501g;
            if (xv3Var != null) {
                fVar.i(4, xv3Var.computeSize());
                this.f389501g.writeFields(fVar);
            }
            java.lang.String str3 = this.f389502h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f389503i);
            fVar.e(7, this.f389504m);
            fVar.h(8, this.f389505n);
            fVar.e(9, this.f389506o);
            fVar.e(10, this.f389507p);
            java.lang.String str4 = this.f389508q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f389509r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            fVar.e(13, this.f389510s);
            java.lang.String str6 = this.f389511t;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            java.lang.String str7 = this.f389512u;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            java.lang.String str8 = this.f389513v;
            if (str8 != null) {
                fVar.j(16, str8);
            }
            java.lang.String str9 = this.f389514w;
            if (str9 != null) {
                fVar.j(17, str9);
            }
            java.lang.String str10 = this.f389515x;
            if (str10 != null) {
                fVar.j(18, str10);
            }
            fVar.e(19, this.f389516y);
            fVar.h(20, this.f389517z);
            fVar.e(21, this.A);
            java.lang.String str11 = this.B;
            if (str11 != null) {
                fVar.j(22, str11);
            }
            java.lang.String str12 = this.C;
            if (str12 != null) {
                fVar.j(23, str12);
            }
            java.lang.String str13 = this.D;
            if (str13 != null) {
                fVar.j(24, str13);
            }
            r45.r74 r74Var = this.E;
            if (r74Var != null) {
                fVar.i(25, r74Var.computeSize());
                this.E.writeFields(fVar);
            }
            fVar.e(26, this.F);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.f389498d;
            int j17 = (str14 != null ? b36.f.j(1, str14) + 0 : 0) + b36.f.e(2, this.f389499e);
            java.lang.String str15 = this.f389500f;
            if (str15 != null) {
                j17 += b36.f.j(3, str15);
            }
            r45.xv3 xv3Var2 = this.f389501g;
            if (xv3Var2 != null) {
                j17 += b36.f.i(4, xv3Var2.computeSize());
            }
            java.lang.String str16 = this.f389502h;
            if (str16 != null) {
                j17 += b36.f.j(5, str16);
            }
            int e17 = j17 + b36.f.e(6, this.f389503i) + b36.f.e(7, this.f389504m) + b36.f.h(8, this.f389505n) + b36.f.e(9, this.f389506o) + b36.f.e(10, this.f389507p);
            java.lang.String str17 = this.f389508q;
            if (str17 != null) {
                e17 += b36.f.j(11, str17);
            }
            java.lang.String str18 = this.f389509r;
            if (str18 != null) {
                e17 += b36.f.j(12, str18);
            }
            int e18 = e17 + b36.f.e(13, this.f389510s);
            java.lang.String str19 = this.f389511t;
            if (str19 != null) {
                e18 += b36.f.j(14, str19);
            }
            java.lang.String str20 = this.f389512u;
            if (str20 != null) {
                e18 += b36.f.j(15, str20);
            }
            java.lang.String str21 = this.f389513v;
            if (str21 != null) {
                e18 += b36.f.j(16, str21);
            }
            java.lang.String str22 = this.f389514w;
            if (str22 != null) {
                e18 += b36.f.j(17, str22);
            }
            java.lang.String str23 = this.f389515x;
            if (str23 != null) {
                e18 += b36.f.j(18, str23);
            }
            int e19 = e18 + b36.f.e(19, this.f389516y) + b36.f.h(20, this.f389517z) + b36.f.e(21, this.A);
            java.lang.String str24 = this.B;
            if (str24 != null) {
                e19 += b36.f.j(22, str24);
            }
            java.lang.String str25 = this.C;
            if (str25 != null) {
                e19 += b36.f.j(23, str25);
            }
            java.lang.String str26 = this.D;
            if (str26 != null) {
                e19 += b36.f.j(24, str26);
            }
            r45.r74 r74Var2 = this.E;
            if (r74Var2 != null) {
                e19 += b36.f.i(25, r74Var2.computeSize());
            }
            return e19 + b36.f.e(26, this.F);
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
        r45.wv3 wv3Var = (r45.wv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wv3Var.f389498d = aVar2.k(intValue);
                return 0;
            case 2:
                wv3Var.f389499e = aVar2.g(intValue);
                return 0;
            case 3:
                wv3Var.f389500f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.xv3 xv3Var3 = new r45.xv3();
                    if (bArr != null && bArr.length > 0) {
                        xv3Var3.parseFrom(bArr);
                    }
                    wv3Var.f389501g = xv3Var3;
                }
                return 0;
            case 5:
                wv3Var.f389502h = aVar2.k(intValue);
                return 0;
            case 6:
                wv3Var.f389503i = aVar2.g(intValue);
                return 0;
            case 7:
                wv3Var.f389504m = aVar2.g(intValue);
                return 0;
            case 8:
                wv3Var.f389505n = aVar2.i(intValue);
                return 0;
            case 9:
                wv3Var.f389506o = aVar2.g(intValue);
                return 0;
            case 10:
                wv3Var.f389507p = aVar2.g(intValue);
                return 0;
            case 11:
                wv3Var.f389508q = aVar2.k(intValue);
                return 0;
            case 12:
                wv3Var.f389509r = aVar2.k(intValue);
                return 0;
            case 13:
                wv3Var.f389510s = aVar2.g(intValue);
                return 0;
            case 14:
                wv3Var.f389511t = aVar2.k(intValue);
                return 0;
            case 15:
                wv3Var.f389512u = aVar2.k(intValue);
                return 0;
            case 16:
                wv3Var.f389513v = aVar2.k(intValue);
                return 0;
            case 17:
                wv3Var.f389514w = aVar2.k(intValue);
                return 0;
            case 18:
                wv3Var.f389515x = aVar2.k(intValue);
                return 0;
            case 19:
                wv3Var.f389516y = aVar2.g(intValue);
                return 0;
            case 20:
                wv3Var.f389517z = aVar2.i(intValue);
                return 0;
            case 21:
                wv3Var.A = aVar2.g(intValue);
                return 0;
            case 22:
                wv3Var.B = aVar2.k(intValue);
                return 0;
            case 23:
                wv3Var.C = aVar2.k(intValue);
                return 0;
            case 24:
                wv3Var.D = aVar2.k(intValue);
                return 0;
            case 25:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.r74 r74Var3 = new r45.r74();
                    if (bArr2 != null && bArr2.length > 0) {
                        r74Var3.parseFrom(bArr2);
                    }
                    wv3Var.E = r74Var3;
                }
                return 0;
            case 26:
                wv3Var.F = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
