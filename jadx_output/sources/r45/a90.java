package r45;

/* loaded from: classes4.dex */
public class a90 extends com.tencent.mm.protobuf.f {
    public r45.km6 A;
    public r45.fd6 B;
    public r45.mv2 C;
    public java.lang.String D;
    public r45.ev2 E;
    public r45.lh0 F;
    public r45.k86 G;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369836d;

    /* renamed from: e, reason: collision with root package name */
    public int f369837e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369838f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369839g;

    /* renamed from: i, reason: collision with root package name */
    public int f369841i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f369842m;

    /* renamed from: n, reason: collision with root package name */
    public r45.hh4 f369843n;

    /* renamed from: o, reason: collision with root package name */
    public r45.kv2 f369844o;

    /* renamed from: p, reason: collision with root package name */
    public r45.mv2 f369845p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ee f369846q;

    /* renamed from: r, reason: collision with root package name */
    public r45.dv2 f369847r;

    /* renamed from: s, reason: collision with root package name */
    public r45.g92 f369848s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ek4 f369849t;

    /* renamed from: u, reason: collision with root package name */
    public int f369850u;

    /* renamed from: v, reason: collision with root package name */
    public r45.mv2 f369851v;

    /* renamed from: w, reason: collision with root package name */
    public r45.xs4 f369852w;

    /* renamed from: x, reason: collision with root package name */
    public r45.lv2 f369853x;

    /* renamed from: y, reason: collision with root package name */
    public r45.mv2 f369854y;

    /* renamed from: z, reason: collision with root package name */
    public r45.hd2 f369855z;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f369840h = new java.util.LinkedList();
    public java.util.LinkedList H = new java.util.LinkedList();
    public final java.util.LinkedList I = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a90)) {
            return false;
        }
        r45.a90 a90Var = (r45.a90) fVar;
        return n51.f.a(this.f369836d, a90Var.f369836d) && n51.f.a(java.lang.Integer.valueOf(this.f369837e), java.lang.Integer.valueOf(a90Var.f369837e)) && n51.f.a(this.f369838f, a90Var.f369838f) && n51.f.a(this.f369839g, a90Var.f369839g) && n51.f.a(this.f369840h, a90Var.f369840h) && n51.f.a(java.lang.Integer.valueOf(this.f369841i), java.lang.Integer.valueOf(a90Var.f369841i)) && n51.f.a(this.f369842m, a90Var.f369842m) && n51.f.a(this.f369843n, a90Var.f369843n) && n51.f.a(this.f369844o, a90Var.f369844o) && n51.f.a(this.f369845p, a90Var.f369845p) && n51.f.a(this.f369846q, a90Var.f369846q) && n51.f.a(this.f369847r, a90Var.f369847r) && n51.f.a(this.f369848s, a90Var.f369848s) && n51.f.a(this.f369849t, a90Var.f369849t) && n51.f.a(java.lang.Integer.valueOf(this.f369850u), java.lang.Integer.valueOf(a90Var.f369850u)) && n51.f.a(this.f369851v, a90Var.f369851v) && n51.f.a(this.f369852w, a90Var.f369852w) && n51.f.a(this.f369853x, a90Var.f369853x) && n51.f.a(this.f369854y, a90Var.f369854y) && n51.f.a(this.f369855z, a90Var.f369855z) && n51.f.a(this.A, a90Var.A) && n51.f.a(this.B, a90Var.B) && n51.f.a(this.C, a90Var.C) && n51.f.a(this.D, a90Var.D) && n51.f.a(this.E, a90Var.E) && n51.f.a(this.F, a90Var.F) && n51.f.a(this.G, a90Var.G) && n51.f.a(this.H, a90Var.H) && n51.f.a(this.I, a90Var.I);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.I;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f369836d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f369837e);
            java.lang.String str2 = this.f369838f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f369839g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.g(5, 8, this.f369840h);
            fVar.e(6, this.f369841i);
            java.lang.String str4 = this.f369842m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            r45.hh4 hh4Var = this.f369843n;
            if (hh4Var != null) {
                fVar.i(8, hh4Var.computeSize());
                this.f369843n.writeFields(fVar);
            }
            r45.kv2 kv2Var = this.f369844o;
            if (kv2Var != null) {
                fVar.i(9, kv2Var.computeSize());
                this.f369844o.writeFields(fVar);
            }
            r45.mv2 mv2Var = this.f369845p;
            if (mv2Var != null) {
                fVar.i(10, mv2Var.computeSize());
                this.f369845p.writeFields(fVar);
            }
            r45.ee eeVar = this.f369846q;
            if (eeVar != null) {
                fVar.i(11, eeVar.computeSize());
                this.f369846q.writeFields(fVar);
            }
            r45.dv2 dv2Var = this.f369847r;
            if (dv2Var != null) {
                fVar.i(12, dv2Var.computeSize());
                this.f369847r.writeFields(fVar);
            }
            r45.g92 g92Var = this.f369848s;
            if (g92Var != null) {
                fVar.i(13, g92Var.computeSize());
                this.f369848s.writeFields(fVar);
            }
            r45.ek4 ek4Var = this.f369849t;
            if (ek4Var != null) {
                fVar.i(14, ek4Var.computeSize());
                this.f369849t.writeFields(fVar);
            }
            fVar.e(15, this.f369850u);
            r45.mv2 mv2Var2 = this.f369851v;
            if (mv2Var2 != null) {
                fVar.i(16, mv2Var2.computeSize());
                this.f369851v.writeFields(fVar);
            }
            r45.xs4 xs4Var = this.f369852w;
            if (xs4Var != null) {
                fVar.i(17, xs4Var.computeSize());
                this.f369852w.writeFields(fVar);
            }
            r45.lv2 lv2Var = this.f369853x;
            if (lv2Var != null) {
                fVar.i(18, lv2Var.computeSize());
                this.f369853x.writeFields(fVar);
            }
            r45.mv2 mv2Var3 = this.f369854y;
            if (mv2Var3 != null) {
                fVar.i(20, mv2Var3.computeSize());
                this.f369854y.writeFields(fVar);
            }
            r45.hd2 hd2Var = this.f369855z;
            if (hd2Var != null) {
                fVar.i(22, hd2Var.computeSize());
                this.f369855z.writeFields(fVar);
            }
            r45.km6 km6Var = this.A;
            if (km6Var != null) {
                fVar.i(30, km6Var.computeSize());
                this.A.writeFields(fVar);
            }
            r45.fd6 fd6Var = this.B;
            if (fd6Var != null) {
                fVar.i(31, fd6Var.computeSize());
                this.B.writeFields(fVar);
            }
            r45.mv2 mv2Var4 = this.C;
            if (mv2Var4 != null) {
                fVar.i(32, mv2Var4.computeSize());
                this.C.writeFields(fVar);
            }
            java.lang.String str5 = this.D;
            if (str5 != null) {
                fVar.j(33, str5);
            }
            r45.ev2 ev2Var = this.E;
            if (ev2Var != null) {
                fVar.i(34, ev2Var.computeSize());
                this.E.writeFields(fVar);
            }
            r45.lh0 lh0Var = this.F;
            if (lh0Var != null) {
                fVar.i(35, lh0Var.computeSize());
                this.F.writeFields(fVar);
            }
            r45.k86 k86Var = this.G;
            if (k86Var != null) {
                fVar.i(36, k86Var.computeSize());
                this.G.writeFields(fVar);
            }
            fVar.g(37, 8, this.H);
            fVar.g(38, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f369836d;
            int j17 = (str6 != null ? b36.f.j(1, str6) + 0 : 0) + b36.f.e(2, this.f369837e);
            java.lang.String str7 = this.f369838f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f369839g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            int g17 = j17 + b36.f.g(5, 8, this.f369840h) + b36.f.e(6, this.f369841i);
            java.lang.String str9 = this.f369842m;
            if (str9 != null) {
                g17 += b36.f.j(7, str9);
            }
            r45.hh4 hh4Var2 = this.f369843n;
            if (hh4Var2 != null) {
                g17 += b36.f.i(8, hh4Var2.computeSize());
            }
            r45.kv2 kv2Var2 = this.f369844o;
            if (kv2Var2 != null) {
                g17 += b36.f.i(9, kv2Var2.computeSize());
            }
            r45.mv2 mv2Var5 = this.f369845p;
            if (mv2Var5 != null) {
                g17 += b36.f.i(10, mv2Var5.computeSize());
            }
            r45.ee eeVar2 = this.f369846q;
            if (eeVar2 != null) {
                g17 += b36.f.i(11, eeVar2.computeSize());
            }
            r45.dv2 dv2Var2 = this.f369847r;
            if (dv2Var2 != null) {
                g17 += b36.f.i(12, dv2Var2.computeSize());
            }
            r45.g92 g92Var2 = this.f369848s;
            if (g92Var2 != null) {
                g17 += b36.f.i(13, g92Var2.computeSize());
            }
            r45.ek4 ek4Var2 = this.f369849t;
            if (ek4Var2 != null) {
                g17 += b36.f.i(14, ek4Var2.computeSize());
            }
            int e17 = g17 + b36.f.e(15, this.f369850u);
            r45.mv2 mv2Var6 = this.f369851v;
            if (mv2Var6 != null) {
                e17 += b36.f.i(16, mv2Var6.computeSize());
            }
            r45.xs4 xs4Var2 = this.f369852w;
            if (xs4Var2 != null) {
                e17 += b36.f.i(17, xs4Var2.computeSize());
            }
            r45.lv2 lv2Var2 = this.f369853x;
            if (lv2Var2 != null) {
                e17 += b36.f.i(18, lv2Var2.computeSize());
            }
            r45.mv2 mv2Var7 = this.f369854y;
            if (mv2Var7 != null) {
                e17 += b36.f.i(20, mv2Var7.computeSize());
            }
            r45.hd2 hd2Var2 = this.f369855z;
            if (hd2Var2 != null) {
                e17 += b36.f.i(22, hd2Var2.computeSize());
            }
            r45.km6 km6Var2 = this.A;
            if (km6Var2 != null) {
                e17 += b36.f.i(30, km6Var2.computeSize());
            }
            r45.fd6 fd6Var2 = this.B;
            if (fd6Var2 != null) {
                e17 += b36.f.i(31, fd6Var2.computeSize());
            }
            r45.mv2 mv2Var8 = this.C;
            if (mv2Var8 != null) {
                e17 += b36.f.i(32, mv2Var8.computeSize());
            }
            java.lang.String str10 = this.D;
            if (str10 != null) {
                e17 += b36.f.j(33, str10);
            }
            r45.ev2 ev2Var2 = this.E;
            if (ev2Var2 != null) {
                e17 += b36.f.i(34, ev2Var2.computeSize());
            }
            r45.lh0 lh0Var2 = this.F;
            if (lh0Var2 != null) {
                e17 += b36.f.i(35, lh0Var2.computeSize());
            }
            r45.k86 k86Var2 = this.G;
            if (k86Var2 != null) {
                e17 += b36.f.i(36, k86Var2.computeSize());
            }
            return e17 + b36.f.g(37, 8, this.H) + b36.f.g(38, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f369840h.clear();
            this.H.clear();
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
        r45.a90 a90Var = (r45.a90) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 20) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.mv2 mv2Var9 = new r45.mv2();
                if (bArr2 != null && bArr2.length > 0) {
                    mv2Var9.parseFrom(bArr2);
                }
                a90Var.f369854y = mv2Var9;
            }
            return 0;
        }
        if (intValue == 22) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j19.get(i19);
                r45.hd2 hd2Var3 = new r45.hd2();
                if (bArr3 != null && bArr3.length > 0) {
                    hd2Var3.parseFrom(bArr3);
                }
                a90Var.f369855z = hd2Var3;
            }
            return 0;
        }
        switch (intValue) {
            case 1:
                a90Var.f369836d = aVar2.k(intValue);
                return 0;
            case 2:
                a90Var.f369837e = aVar2.g(intValue);
                return 0;
            case 3:
                a90Var.f369838f = aVar2.k(intValue);
                return 0;
            case 4:
                a90Var.f369839g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.jj4 jj4Var = new r45.jj4();
                    if (bArr4 != null && bArr4.length > 0) {
                        jj4Var.parseFrom(bArr4);
                    }
                    a90Var.f369840h.add(jj4Var);
                }
                return 0;
            case 6:
                a90Var.f369841i = aVar2.g(intValue);
                return 0;
            case 7:
                a90Var.f369842m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.hh4 hh4Var3 = new r45.hh4();
                    if (bArr5 != null && bArr5.length > 0) {
                        hh4Var3.parseFrom(bArr5);
                    }
                    a90Var.f369843n = hh4Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j29.get(i29);
                    r45.kv2 kv2Var3 = new r45.kv2();
                    if (bArr6 != null && bArr6.length > 0) {
                        kv2Var3.parseFrom(bArr6);
                    }
                    a90Var.f369844o = kv2Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j37.get(i37);
                    r45.mv2 mv2Var10 = new r45.mv2();
                    if (bArr7 != null && bArr7.length > 0) {
                        mv2Var10.parseFrom(bArr7);
                    }
                    a90Var.f369845p = mv2Var10;
                }
                return 0;
            case 11:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j38.get(i38);
                    r45.ee eeVar3 = new r45.ee();
                    if (bArr8 != null && bArr8.length > 0) {
                        eeVar3.parseFrom(bArr8);
                    }
                    a90Var.f369846q = eeVar3;
                }
                return 0;
            case 12:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size8 = j39.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr9 = (byte[]) j39.get(i39);
                    r45.dv2 dv2Var3 = new r45.dv2();
                    if (bArr9 != null && bArr9.length > 0) {
                        dv2Var3.parseFrom(bArr9);
                    }
                    a90Var.f369847r = dv2Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size9 = j47.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr10 = (byte[]) j47.get(i47);
                    r45.g92 g92Var3 = new r45.g92();
                    if (bArr10 != null && bArr10.length > 0) {
                        g92Var3.parseFrom(bArr10);
                    }
                    a90Var.f369848s = g92Var3;
                }
                return 0;
            case 14:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size10 = j48.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr11 = (byte[]) j48.get(i48);
                    r45.ek4 ek4Var3 = new r45.ek4();
                    if (bArr11 != null && bArr11.length > 0) {
                        ek4Var3.parseFrom(bArr11);
                    }
                    a90Var.f369849t = ek4Var3;
                }
                return 0;
            case 15:
                a90Var.f369850u = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size11 = j49.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr12 = (byte[]) j49.get(i49);
                    r45.mv2 mv2Var11 = new r45.mv2();
                    if (bArr12 != null && bArr12.length > 0) {
                        mv2Var11.parseFrom(bArr12);
                    }
                    a90Var.f369851v = mv2Var11;
                }
                return 0;
            case 17:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size12 = j57.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr13 = (byte[]) j57.get(i57);
                    r45.xs4 xs4Var3 = new r45.xs4();
                    if (bArr13 != null && bArr13.length > 0) {
                        xs4Var3.parseFrom(bArr13);
                    }
                    a90Var.f369852w = xs4Var3;
                }
                return 0;
            case 18:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size13 = j58.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr14 = (byte[]) j58.get(i58);
                    r45.lv2 lv2Var3 = new r45.lv2();
                    if (bArr14 != null && bArr14.length > 0) {
                        lv2Var3.parseFrom(bArr14);
                    }
                    a90Var.f369853x = lv2Var3;
                }
                return 0;
            default:
                switch (intValue) {
                    case 30:
                        java.util.LinkedList j59 = aVar2.j(intValue);
                        int size14 = j59.size();
                        for (int i59 = 0; i59 < size14; i59++) {
                            byte[] bArr15 = (byte[]) j59.get(i59);
                            r45.km6 km6Var3 = new r45.km6();
                            if (bArr15 != null && bArr15.length > 0) {
                                km6Var3.parseFrom(bArr15);
                            }
                            a90Var.A = km6Var3;
                        }
                        return 0;
                    case 31:
                        java.util.LinkedList j66 = aVar2.j(intValue);
                        int size15 = j66.size();
                        for (int i66 = 0; i66 < size15; i66++) {
                            byte[] bArr16 = (byte[]) j66.get(i66);
                            r45.fd6 fd6Var3 = new r45.fd6();
                            if (bArr16 != null && bArr16.length > 0) {
                                fd6Var3.parseFrom(bArr16);
                            }
                            a90Var.B = fd6Var3;
                        }
                        return 0;
                    case 32:
                        java.util.LinkedList j67 = aVar2.j(intValue);
                        int size16 = j67.size();
                        for (int i67 = 0; i67 < size16; i67++) {
                            byte[] bArr17 = (byte[]) j67.get(i67);
                            r45.mv2 mv2Var12 = new r45.mv2();
                            if (bArr17 != null && bArr17.length > 0) {
                                mv2Var12.parseFrom(bArr17);
                            }
                            a90Var.C = mv2Var12;
                        }
                        return 0;
                    case 33:
                        a90Var.D = aVar2.k(intValue);
                        return 0;
                    case 34:
                        java.util.LinkedList j68 = aVar2.j(intValue);
                        int size17 = j68.size();
                        for (int i68 = 0; i68 < size17; i68++) {
                            byte[] bArr18 = (byte[]) j68.get(i68);
                            r45.ev2 ev2Var3 = new r45.ev2();
                            if (bArr18 != null && bArr18.length > 0) {
                                ev2Var3.parseFrom(bArr18);
                            }
                            a90Var.E = ev2Var3;
                        }
                        return 0;
                    case 35:
                        java.util.LinkedList j69 = aVar2.j(intValue);
                        int size18 = j69.size();
                        for (int i69 = 0; i69 < size18; i69++) {
                            byte[] bArr19 = (byte[]) j69.get(i69);
                            r45.lh0 lh0Var3 = new r45.lh0();
                            if (bArr19 != null && bArr19.length > 0) {
                                lh0Var3.parseFrom(bArr19);
                            }
                            a90Var.F = lh0Var3;
                        }
                        return 0;
                    case 36:
                        java.util.LinkedList j76 = aVar2.j(intValue);
                        int size19 = j76.size();
                        for (int i76 = 0; i76 < size19; i76++) {
                            byte[] bArr20 = (byte[]) j76.get(i76);
                            r45.k86 k86Var3 = new r45.k86();
                            if (bArr20 != null && bArr20.length > 0) {
                                k86Var3.parseFrom(bArr20);
                            }
                            a90Var.G = k86Var3;
                        }
                        return 0;
                    case 37:
                        java.util.LinkedList j77 = aVar2.j(intValue);
                        int size20 = j77.size();
                        for (int i77 = 0; i77 < size20; i77++) {
                            byte[] bArr21 = (byte[]) j77.get(i77);
                            r45.q86 q86Var = new r45.q86();
                            if (bArr21 != null && bArr21.length > 0) {
                                q86Var.parseFrom(bArr21);
                            }
                            a90Var.H.add(q86Var);
                        }
                        return 0;
                    case 38:
                        a90Var.I.add(aVar2.k(intValue));
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
