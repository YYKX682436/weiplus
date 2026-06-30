package dw5;

/* loaded from: classes15.dex */
public class d extends com.tencent.mm.protobuf.f {
    public int A;
    public java.lang.String B;
    public int C;
    public int D;

    /* renamed from: d, reason: collision with root package name */
    public dw5.k f244318d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f244319e;

    /* renamed from: f, reason: collision with root package name */
    public int f244320f;

    /* renamed from: g, reason: collision with root package name */
    public int f244321g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f244322h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f244323i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f244324m;

    /* renamed from: n, reason: collision with root package name */
    public int f244325n;

    /* renamed from: o, reason: collision with root package name */
    public int f244326o;

    /* renamed from: p, reason: collision with root package name */
    public int f244327p;

    /* renamed from: q, reason: collision with root package name */
    public int f244328q;

    /* renamed from: r, reason: collision with root package name */
    public int f244329r;

    /* renamed from: s, reason: collision with root package name */
    public int f244330s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f244331t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f244332u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f244333v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f244334w;

    /* renamed from: x, reason: collision with root package name */
    public int f244335x;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f244337z;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f244336y = new java.util.LinkedList();
    public final boolean[] E = new boolean[25];

    static {
        new dw5.d();
    }

    public dw5.d A(java.lang.String str) {
        this.f244323i = str;
        this.E[6] = true;
        return this;
    }

    public dw5.d B(java.lang.String str) {
        this.f244337z = str;
        this.E[20] = true;
        return this;
    }

    public dw5.d C(dw5.k kVar) {
        this.f244318d = kVar;
        this.E[1] = true;
        return this;
    }

    public dw5.d b(dw5.j jVar) {
        this.f244336y.add(jVar);
        this.E[19] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public dw5.d parseFrom(byte[] bArr) {
        return (dw5.d) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.d)) {
            return false;
        }
        dw5.d dVar = (dw5.d) fVar;
        return n51.f.a(this.f244318d, dVar.f244318d) && n51.f.a(this.f244319e, dVar.f244319e) && n51.f.a(java.lang.Integer.valueOf(this.f244320f), java.lang.Integer.valueOf(dVar.f244320f)) && n51.f.a(java.lang.Integer.valueOf(this.f244321g), java.lang.Integer.valueOf(dVar.f244321g)) && n51.f.a(this.f244322h, dVar.f244322h) && n51.f.a(this.f244323i, dVar.f244323i) && n51.f.a(this.f244324m, dVar.f244324m) && n51.f.a(java.lang.Integer.valueOf(this.f244325n), java.lang.Integer.valueOf(dVar.f244325n)) && n51.f.a(java.lang.Integer.valueOf(this.f244326o), java.lang.Integer.valueOf(dVar.f244326o)) && n51.f.a(java.lang.Integer.valueOf(this.f244327p), java.lang.Integer.valueOf(dVar.f244327p)) && n51.f.a(java.lang.Integer.valueOf(this.f244328q), java.lang.Integer.valueOf(dVar.f244328q)) && n51.f.a(java.lang.Integer.valueOf(this.f244329r), java.lang.Integer.valueOf(dVar.f244329r)) && n51.f.a(java.lang.Integer.valueOf(this.f244330s), java.lang.Integer.valueOf(dVar.f244330s)) && n51.f.a(this.f244331t, dVar.f244331t) && n51.f.a(this.f244332u, dVar.f244332u) && n51.f.a(this.f244333v, dVar.f244333v) && n51.f.a(this.f244334w, dVar.f244334w) && n51.f.a(java.lang.Integer.valueOf(this.f244335x), java.lang.Integer.valueOf(dVar.f244335x)) && n51.f.a(this.f244336y, dVar.f244336y) && n51.f.a(this.f244337z, dVar.f244337z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(dVar.A)) && n51.f.a(this.B, dVar.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(dVar.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(dVar.D));
    }

    public dw5.d d(int i17) {
        this.C = i17;
        this.E[23] = true;
        return this;
    }

    public dw5.d e(java.lang.String str) {
        this.f244332u = str;
        this.E[15] = true;
        return this;
    }

    public dw5.d f(java.lang.String str) {
        this.f244319e = str;
        this.E[2] = true;
        return this;
    }

    public dw5.d g(int i17) {
        this.f244335x = i17;
        this.E[18] = true;
        return this;
    }

    public dw5.d i(int i17) {
        this.f244325n = i17;
        this.E[8] = true;
        return this;
    }

    public dw5.d j(int i17) {
        this.f244327p = i17;
        this.E[10] = true;
        return this;
    }

    public dw5.d k(java.lang.String str) {
        this.B = str;
        this.E[22] = true;
        return this;
    }

    public dw5.d l(int i17) {
        this.A = i17;
        this.E[21] = true;
        return this;
    }

    public dw5.d n(int i17) {
        this.f244326o = i17;
        this.E[9] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new dw5.d();
    }

    public dw5.d o(java.lang.String str) {
        this.f244334w = str;
        this.E[17] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            dw5.k kVar = this.f244318d;
            if (kVar != null && zArr[1]) {
                fVar.e(1, kVar.f244377d);
            }
            java.lang.String str = this.f244319e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f244320f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f244321g);
            }
            java.lang.String str2 = this.f244322h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f244323i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f244324m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            if (zArr[8]) {
                fVar.e(8, this.f244325n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f244326o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f244327p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f244328q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f244329r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f244330s);
            }
            java.lang.String str5 = this.f244331t;
            if (str5 != null && zArr[14]) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f244332u;
            if (str6 != null && zArr[15]) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f244333v;
            if (str7 != null && zArr[16]) {
                fVar.j(16, str7);
            }
            java.lang.String str8 = this.f244334w;
            if (str8 != null && zArr[17]) {
                fVar.j(17, str8);
            }
            if (zArr[18]) {
                fVar.e(18, this.f244335x);
            }
            fVar.g(19, 8, this.f244336y);
            java.lang.String str9 = this.f244337z;
            if (str9 != null && zArr[20]) {
                fVar.j(20, str9);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            java.lang.String str10 = this.B;
            if (str10 != null && zArr[22]) {
                fVar.j(22, str10);
            }
            if (zArr[23]) {
                fVar.e(23, this.C);
            }
            if (zArr[24]) {
                fVar.e(24, this.D);
            }
            return 0;
        }
        if (i17 == 1) {
            dw5.k kVar2 = this.f244318d;
            if (kVar2 != null && zArr[1]) {
                i18 = b36.f.e(1, kVar2.f244377d) + 0;
            }
            java.lang.String str11 = this.f244319e;
            if (str11 != null && zArr[2]) {
                i18 += b36.f.j(2, str11);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f244320f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f244321g);
            }
            java.lang.String str12 = this.f244322h;
            if (str12 != null && zArr[5]) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f244323i;
            if (str13 != null && zArr[6]) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f244324m;
            if (str14 != null && zArr[7]) {
                i18 += b36.f.j(7, str14);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f244325n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f244326o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f244327p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f244328q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f244329r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f244330s);
            }
            java.lang.String str15 = this.f244331t;
            if (str15 != null && zArr[14]) {
                i18 += b36.f.j(14, str15);
            }
            java.lang.String str16 = this.f244332u;
            if (str16 != null && zArr[15]) {
                i18 += b36.f.j(15, str16);
            }
            java.lang.String str17 = this.f244333v;
            if (str17 != null && zArr[16]) {
                i18 += b36.f.j(16, str17);
            }
            java.lang.String str18 = this.f244334w;
            if (str18 != null && zArr[17]) {
                i18 += b36.f.j(17, str18);
            }
            if (zArr[18]) {
                i18 += b36.f.e(18, this.f244335x);
            }
            int g17 = i18 + b36.f.g(19, 8, this.f244336y);
            java.lang.String str19 = this.f244337z;
            if (str19 != null && zArr[20]) {
                g17 += b36.f.j(20, str19);
            }
            if (zArr[21]) {
                g17 += b36.f.e(21, this.A);
            }
            java.lang.String str20 = this.B;
            if (str20 != null && zArr[22]) {
                g17 += b36.f.j(22, str20);
            }
            if (zArr[23]) {
                g17 += b36.f.e(23, this.C);
            }
            return zArr[24] ? g17 + b36.f.e(24, this.D) : g17;
        }
        if (i17 == 2) {
            this.f244336y.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                int g18 = aVar2.g(intValue);
                this.f244318d = g18 != 0 ? g18 != 1 ? null : dw5.k.reply : dw5.k.comment;
                zArr[1] = true;
                return 0;
            case 2:
                this.f244319e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f244320f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f244321g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f244322h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f244323i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f244324m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f244325n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f244326o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f244327p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f244328q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f244329r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f244330s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f244331t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f244332u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f244333v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f244334w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f244335x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    dw5.j jVar = new dw5.j();
                    if (bArr != null && bArr.length > 0) {
                        jVar.parseFrom(bArr);
                    }
                    this.f244336y.add(jVar);
                }
                zArr[19] = true;
                return 0;
            case 20:
                this.f244337z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.g(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            default:
                return -1;
        }
    }

    public dw5.d p(int i17) {
        this.D = i17;
        this.E[24] = true;
        return this;
    }

    public dw5.d q(java.lang.String str) {
        this.f244333v = str;
        this.E[16] = true;
        return this;
    }

    public dw5.d r(java.lang.String str) {
        this.f244331t = str;
        this.E[14] = true;
        return this;
    }

    public dw5.d s(int i17) {
        this.f244328q = i17;
        this.E[11] = true;
        return this;
    }

    public dw5.d t(int i17) {
        this.f244329r = i17;
        this.E[12] = true;
        return this;
    }

    public dw5.d u(int i17) {
        this.f244330s = i17;
        this.E[13] = true;
        return this;
    }

    public dw5.d w(java.lang.String str) {
        this.f244324m = str;
        this.E[7] = true;
        return this;
    }

    public dw5.d x(int i17) {
        this.f244321g = i17;
        this.E[4] = true;
        return this;
    }

    public dw5.d y(int i17) {
        this.f244320f = i17;
        this.E[3] = true;
        return this;
    }

    public dw5.d z(java.lang.String str) {
        this.f244322h = str;
        this.E[5] = true;
        return this;
    }
}
