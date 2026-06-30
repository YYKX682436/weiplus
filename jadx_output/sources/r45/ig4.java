package r45;

/* loaded from: classes2.dex */
public class ig4 extends com.tencent.mm.protobuf.f {
    public r45.zf4 A;
    public r45.gg4 B;
    public boolean C;
    public java.lang.String D;
    public r45.kg4 E;
    public r45.bg4 F;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377017d;

    /* renamed from: e, reason: collision with root package name */
    public int f377018e;

    /* renamed from: f, reason: collision with root package name */
    public r45.og4 f377019f;

    /* renamed from: g, reason: collision with root package name */
    public r45.eg4 f377020g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377021h;

    /* renamed from: i, reason: collision with root package name */
    public int f377022i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f377023m;

    /* renamed from: n, reason: collision with root package name */
    public r45.jg4 f377024n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f377025o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f377026p;

    /* renamed from: q, reason: collision with root package name */
    public r45.hg4 f377027q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f377028r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f377029s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f377030t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f377031u;

    /* renamed from: v, reason: collision with root package name */
    public int f377032v;

    /* renamed from: w, reason: collision with root package name */
    public long f377033w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f377034x;

    /* renamed from: y, reason: collision with root package name */
    public r45.lg4 f377035y;

    /* renamed from: z, reason: collision with root package name */
    public r45.mg4 f377036z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ig4)) {
            return false;
        }
        r45.ig4 ig4Var = (r45.ig4) fVar;
        return n51.f.a(this.f377017d, ig4Var.f377017d) && n51.f.a(java.lang.Integer.valueOf(this.f377018e), java.lang.Integer.valueOf(ig4Var.f377018e)) && n51.f.a(this.f377019f, ig4Var.f377019f) && n51.f.a(this.f377020g, ig4Var.f377020g) && n51.f.a(this.f377021h, ig4Var.f377021h) && n51.f.a(java.lang.Integer.valueOf(this.f377022i), java.lang.Integer.valueOf(ig4Var.f377022i)) && n51.f.a(this.f377023m, ig4Var.f377023m) && n51.f.a(this.f377024n, ig4Var.f377024n) && n51.f.a(this.f377025o, ig4Var.f377025o) && n51.f.a(java.lang.Boolean.valueOf(this.f377026p), java.lang.Boolean.valueOf(ig4Var.f377026p)) && n51.f.a(this.f377027q, ig4Var.f377027q) && n51.f.a(java.lang.Boolean.valueOf(this.f377028r), java.lang.Boolean.valueOf(ig4Var.f377028r)) && n51.f.a(this.f377029s, ig4Var.f377029s) && n51.f.a(this.f377030t, ig4Var.f377030t) && n51.f.a(this.f377031u, ig4Var.f377031u) && n51.f.a(java.lang.Integer.valueOf(this.f377032v), java.lang.Integer.valueOf(ig4Var.f377032v)) && n51.f.a(java.lang.Long.valueOf(this.f377033w), java.lang.Long.valueOf(ig4Var.f377033w)) && n51.f.a(java.lang.Boolean.valueOf(this.f377034x), java.lang.Boolean.valueOf(ig4Var.f377034x)) && n51.f.a(this.f377035y, ig4Var.f377035y) && n51.f.a(this.f377036z, ig4Var.f377036z) && n51.f.a(this.A, ig4Var.A) && n51.f.a(this.B, ig4Var.B) && n51.f.a(java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(ig4Var.C)) && n51.f.a(this.D, ig4Var.D) && n51.f.a(this.E, ig4Var.E) && n51.f.a(this.F, ig4Var.F);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377017d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f377018e);
            r45.og4 og4Var = this.f377019f;
            if (og4Var != null) {
                fVar.i(3, og4Var.computeSize());
                this.f377019f.writeFields(fVar);
            }
            r45.eg4 eg4Var = this.f377020g;
            if (eg4Var != null) {
                fVar.i(4, eg4Var.computeSize());
                this.f377020g.writeFields(fVar);
            }
            java.lang.String str2 = this.f377021h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f377022i);
            java.lang.String str3 = this.f377023m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.jg4 jg4Var = this.f377024n;
            if (jg4Var != null) {
                fVar.i(8, jg4Var.computeSize());
                this.f377024n.writeFields(fVar);
            }
            java.lang.String str4 = this.f377025o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.a(10, this.f377026p);
            r45.hg4 hg4Var = this.f377027q;
            if (hg4Var != null) {
                fVar.i(11, hg4Var.computeSize());
                this.f377027q.writeFields(fVar);
            }
            fVar.a(12, this.f377028r);
            java.lang.String str5 = this.f377029s;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f377030t;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            java.lang.String str7 = this.f377031u;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            fVar.e(16, this.f377032v);
            fVar.h(17, this.f377033w);
            fVar.a(18, this.f377034x);
            r45.lg4 lg4Var = this.f377035y;
            if (lg4Var != null) {
                fVar.i(101, lg4Var.computeSize());
                this.f377035y.writeFields(fVar);
            }
            r45.mg4 mg4Var = this.f377036z;
            if (mg4Var != null) {
                fVar.i(106, mg4Var.computeSize());
                this.f377036z.writeFields(fVar);
            }
            r45.zf4 zf4Var = this.A;
            if (zf4Var != null) {
                fVar.i(102, zf4Var.computeSize());
                this.A.writeFields(fVar);
            }
            r45.gg4 gg4Var = this.B;
            if (gg4Var != null) {
                fVar.i(103, gg4Var.computeSize());
                this.B.writeFields(fVar);
            }
            fVar.a(107, this.C);
            java.lang.String str8 = this.D;
            if (str8 != null) {
                fVar.j(108, str8);
            }
            r45.kg4 kg4Var = this.E;
            if (kg4Var != null) {
                fVar.i(104, kg4Var.computeSize());
                this.E.writeFields(fVar);
            }
            r45.bg4 bg4Var = this.F;
            if (bg4Var != null) {
                fVar.i(105, bg4Var.computeSize());
                this.F.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f377017d;
            int j17 = (str9 != null ? b36.f.j(1, str9) + 0 : 0) + b36.f.e(2, this.f377018e);
            r45.og4 og4Var2 = this.f377019f;
            if (og4Var2 != null) {
                j17 += b36.f.i(3, og4Var2.computeSize());
            }
            r45.eg4 eg4Var2 = this.f377020g;
            if (eg4Var2 != null) {
                j17 += b36.f.i(4, eg4Var2.computeSize());
            }
            java.lang.String str10 = this.f377021h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            int e17 = j17 + b36.f.e(6, this.f377022i);
            java.lang.String str11 = this.f377023m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            r45.jg4 jg4Var2 = this.f377024n;
            if (jg4Var2 != null) {
                e17 += b36.f.i(8, jg4Var2.computeSize());
            }
            java.lang.String str12 = this.f377025o;
            if (str12 != null) {
                e17 += b36.f.j(9, str12);
            }
            int a17 = e17 + b36.f.a(10, this.f377026p);
            r45.hg4 hg4Var2 = this.f377027q;
            if (hg4Var2 != null) {
                a17 += b36.f.i(11, hg4Var2.computeSize());
            }
            int a18 = a17 + b36.f.a(12, this.f377028r);
            java.lang.String str13 = this.f377029s;
            if (str13 != null) {
                a18 += b36.f.j(13, str13);
            }
            java.lang.String str14 = this.f377030t;
            if (str14 != null) {
                a18 += b36.f.j(14, str14);
            }
            java.lang.String str15 = this.f377031u;
            if (str15 != null) {
                a18 += b36.f.j(15, str15);
            }
            int e18 = a18 + b36.f.e(16, this.f377032v) + b36.f.h(17, this.f377033w) + b36.f.a(18, this.f377034x);
            r45.lg4 lg4Var2 = this.f377035y;
            if (lg4Var2 != null) {
                e18 += b36.f.i(101, lg4Var2.computeSize());
            }
            r45.mg4 mg4Var2 = this.f377036z;
            if (mg4Var2 != null) {
                e18 += b36.f.i(106, mg4Var2.computeSize());
            }
            r45.zf4 zf4Var2 = this.A;
            if (zf4Var2 != null) {
                e18 += b36.f.i(102, zf4Var2.computeSize());
            }
            r45.gg4 gg4Var2 = this.B;
            if (gg4Var2 != null) {
                e18 += b36.f.i(103, gg4Var2.computeSize());
            }
            int a19 = e18 + b36.f.a(107, this.C);
            java.lang.String str16 = this.D;
            if (str16 != null) {
                a19 += b36.f.j(108, str16);
            }
            r45.kg4 kg4Var2 = this.E;
            if (kg4Var2 != null) {
                a19 += b36.f.i(104, kg4Var2.computeSize());
            }
            r45.bg4 bg4Var2 = this.F;
            return bg4Var2 != null ? a19 + b36.f.i(105, bg4Var2.computeSize()) : a19;
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
        r45.ig4 ig4Var = (r45.ig4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ig4Var.f377017d = aVar2.k(intValue);
                return 0;
            case 2:
                ig4Var.f377018e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.og4 og4Var3 = new r45.og4();
                    if (bArr != null && bArr.length > 0) {
                        og4Var3.parseFrom(bArr);
                    }
                    ig4Var.f377019f = og4Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.eg4 eg4Var3 = new r45.eg4();
                    if (bArr2 != null && bArr2.length > 0) {
                        eg4Var3.parseFrom(bArr2);
                    }
                    ig4Var.f377020g = eg4Var3;
                }
                return 0;
            case 5:
                ig4Var.f377021h = aVar2.k(intValue);
                return 0;
            case 6:
                ig4Var.f377022i = aVar2.g(intValue);
                return 0;
            case 7:
                ig4Var.f377023m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.jg4 jg4Var3 = new r45.jg4();
                    if (bArr3 != null && bArr3.length > 0) {
                        jg4Var3.parseFrom(bArr3);
                    }
                    ig4Var.f377024n = jg4Var3;
                }
                return 0;
            case 9:
                ig4Var.f377025o = aVar2.k(intValue);
                return 0;
            case 10:
                ig4Var.f377026p = aVar2.c(intValue);
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    r45.hg4 hg4Var3 = new r45.hg4();
                    if (bArr4 != null && bArr4.length > 0) {
                        hg4Var3.parseFrom(bArr4);
                    }
                    ig4Var.f377027q = hg4Var3;
                }
                return 0;
            case 12:
                ig4Var.f377028r = aVar2.c(intValue);
                return 0;
            case 13:
                ig4Var.f377029s = aVar2.k(intValue);
                return 0;
            case 14:
                ig4Var.f377030t = aVar2.k(intValue);
                return 0;
            case 15:
                ig4Var.f377031u = aVar2.k(intValue);
                return 0;
            case 16:
                ig4Var.f377032v = aVar2.g(intValue);
                return 0;
            case 17:
                ig4Var.f377033w = aVar2.i(intValue);
                return 0;
            case 18:
                ig4Var.f377034x = aVar2.c(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 101:
                        java.util.LinkedList j29 = aVar2.j(intValue);
                        int size5 = j29.size();
                        for (int i29 = 0; i29 < size5; i29++) {
                            byte[] bArr5 = (byte[]) j29.get(i29);
                            r45.lg4 lg4Var3 = new r45.lg4();
                            if (bArr5 != null && bArr5.length > 0) {
                                lg4Var3.parseFrom(bArr5);
                            }
                            ig4Var.f377035y = lg4Var3;
                        }
                        return 0;
                    case 102:
                        java.util.LinkedList j37 = aVar2.j(intValue);
                        int size6 = j37.size();
                        for (int i37 = 0; i37 < size6; i37++) {
                            byte[] bArr6 = (byte[]) j37.get(i37);
                            r45.zf4 zf4Var3 = new r45.zf4();
                            if (bArr6 != null && bArr6.length > 0) {
                                zf4Var3.parseFrom(bArr6);
                            }
                            ig4Var.A = zf4Var3;
                        }
                        return 0;
                    case 103:
                        java.util.LinkedList j38 = aVar2.j(intValue);
                        int size7 = j38.size();
                        for (int i38 = 0; i38 < size7; i38++) {
                            byte[] bArr7 = (byte[]) j38.get(i38);
                            r45.gg4 gg4Var3 = new r45.gg4();
                            if (bArr7 != null && bArr7.length > 0) {
                                gg4Var3.parseFrom(bArr7);
                            }
                            ig4Var.B = gg4Var3;
                        }
                        return 0;
                    case 104:
                        java.util.LinkedList j39 = aVar2.j(intValue);
                        int size8 = j39.size();
                        for (int i39 = 0; i39 < size8; i39++) {
                            byte[] bArr8 = (byte[]) j39.get(i39);
                            r45.kg4 kg4Var3 = new r45.kg4();
                            if (bArr8 != null && bArr8.length > 0) {
                                kg4Var3.parseFrom(bArr8);
                            }
                            ig4Var.E = kg4Var3;
                        }
                        return 0;
                    case 105:
                        java.util.LinkedList j47 = aVar2.j(intValue);
                        int size9 = j47.size();
                        for (int i47 = 0; i47 < size9; i47++) {
                            byte[] bArr9 = (byte[]) j47.get(i47);
                            r45.bg4 bg4Var3 = new r45.bg4();
                            if (bArr9 != null && bArr9.length > 0) {
                                bg4Var3.parseFrom(bArr9);
                            }
                            ig4Var.F = bg4Var3;
                        }
                        return 0;
                    case 106:
                        java.util.LinkedList j48 = aVar2.j(intValue);
                        int size10 = j48.size();
                        for (int i48 = 0; i48 < size10; i48++) {
                            byte[] bArr10 = (byte[]) j48.get(i48);
                            r45.mg4 mg4Var3 = new r45.mg4();
                            if (bArr10 != null && bArr10.length > 0) {
                                mg4Var3.parseFrom(bArr10);
                            }
                            ig4Var.f377036z = mg4Var3;
                        }
                        return 0;
                    case 107:
                        ig4Var.C = aVar2.c(intValue);
                        return 0;
                    case 108:
                        ig4Var.D = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
