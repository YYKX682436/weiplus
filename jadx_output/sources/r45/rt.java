package r45;

/* loaded from: classes15.dex */
public class rt extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public r45.w50 B;
    public java.lang.String C;
    public r45.w50 D;
    public boolean E;
    public boolean F;
    public r45.w50 G;
    public r45.w50 H;

    /* renamed from: d, reason: collision with root package name */
    public int f385181d;

    /* renamed from: e, reason: collision with root package name */
    public int f385182e;

    /* renamed from: f, reason: collision with root package name */
    public int f385183f;

    /* renamed from: n, reason: collision with root package name */
    public int f385188n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f385189o;

    /* renamed from: p, reason: collision with root package name */
    public int f385190p;

    /* renamed from: r, reason: collision with root package name */
    public long f385192r;

    /* renamed from: s, reason: collision with root package name */
    public int f385193s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f385194t;

    /* renamed from: u, reason: collision with root package name */
    public r45.w50 f385195u;

    /* renamed from: w, reason: collision with root package name */
    public r45.w50 f385197w;

    /* renamed from: x, reason: collision with root package name */
    public r45.w50 f385198x;

    /* renamed from: y, reason: collision with root package name */
    public r45.w50 f385199y;

    /* renamed from: z, reason: collision with root package name */
    public r45.ee0 f385200z;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f385184g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f385185h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f385186i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f385187m = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f385191q = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f385196v = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rt)) {
            return false;
        }
        r45.rt rtVar = (r45.rt) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f385181d), java.lang.Integer.valueOf(rtVar.f385181d)) && n51.f.a(java.lang.Integer.valueOf(this.f385182e), java.lang.Integer.valueOf(rtVar.f385182e)) && n51.f.a(java.lang.Integer.valueOf(this.f385183f), java.lang.Integer.valueOf(rtVar.f385183f)) && n51.f.a(this.f385184g, rtVar.f385184g) && n51.f.a(this.f385185h, rtVar.f385185h) && n51.f.a(this.f385186i, rtVar.f385186i) && n51.f.a(this.f385187m, rtVar.f385187m) && n51.f.a(java.lang.Integer.valueOf(this.f385188n), java.lang.Integer.valueOf(rtVar.f385188n)) && n51.f.a(this.f385189o, rtVar.f385189o) && n51.f.a(java.lang.Integer.valueOf(this.f385190p), java.lang.Integer.valueOf(rtVar.f385190p)) && n51.f.a(this.f385191q, rtVar.f385191q) && n51.f.a(java.lang.Long.valueOf(this.f385192r), java.lang.Long.valueOf(rtVar.f385192r)) && n51.f.a(java.lang.Integer.valueOf(this.f385193s), java.lang.Integer.valueOf(rtVar.f385193s)) && n51.f.a(this.f385194t, rtVar.f385194t) && n51.f.a(this.f385195u, rtVar.f385195u) && n51.f.a(this.f385196v, rtVar.f385196v) && n51.f.a(this.f385197w, rtVar.f385197w) && n51.f.a(this.f385198x, rtVar.f385198x) && n51.f.a(this.f385199y, rtVar.f385199y) && n51.f.a(this.f385200z, rtVar.f385200z) && n51.f.a(this.A, rtVar.A) && n51.f.a(this.B, rtVar.B) && n51.f.a(this.C, rtVar.C) && n51.f.a(this.D, rtVar.D) && n51.f.a(java.lang.Boolean.valueOf(this.E), java.lang.Boolean.valueOf(rtVar.E)) && n51.f.a(java.lang.Boolean.valueOf(this.F), java.lang.Boolean.valueOf(rtVar.F)) && n51.f.a(this.G, rtVar.G) && n51.f.a(this.H, rtVar.H);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f385181d);
            fVar.e(2, this.f385182e);
            fVar.e(3, this.f385183f);
            fVar.g(4, 8, this.f385184g);
            fVar.g(5, 8, this.f385185h);
            fVar.g(6, 8, this.f385186i);
            fVar.g(7, 1, this.f385187m);
            fVar.e(8, this.f385188n);
            java.lang.String str = this.f385189o;
            if (str != null) {
                fVar.j(9, str);
            }
            fVar.e(10, this.f385190p);
            fVar.g(11, 8, this.f385191q);
            fVar.h(12, this.f385192r);
            fVar.e(13, this.f385193s);
            java.lang.String str2 = this.f385194t;
            if (str2 != null) {
                fVar.j(14, str2);
            }
            r45.w50 w50Var = this.f385195u;
            if (w50Var != null) {
                fVar.i(15, w50Var.computeSize());
                this.f385195u.writeFields(fVar);
            }
            fVar.g(16, 8, this.f385196v);
            r45.w50 w50Var2 = this.f385197w;
            if (w50Var2 != null) {
                fVar.i(17, w50Var2.computeSize());
                this.f385197w.writeFields(fVar);
            }
            r45.w50 w50Var3 = this.f385198x;
            if (w50Var3 != null) {
                fVar.i(18, w50Var3.computeSize());
                this.f385198x.writeFields(fVar);
            }
            r45.w50 w50Var4 = this.f385199y;
            if (w50Var4 != null) {
                fVar.i(19, w50Var4.computeSize());
                this.f385199y.writeFields(fVar);
            }
            r45.ee0 ee0Var = this.f385200z;
            if (ee0Var != null) {
                fVar.i(20, ee0Var.computeSize());
                this.f385200z.writeFields(fVar);
            }
            java.lang.String str3 = this.A;
            if (str3 != null) {
                fVar.j(21, str3);
            }
            r45.w50 w50Var5 = this.B;
            if (w50Var5 != null) {
                fVar.i(22, w50Var5.computeSize());
                this.B.writeFields(fVar);
            }
            java.lang.String str4 = this.C;
            if (str4 != null) {
                fVar.j(23, str4);
            }
            r45.w50 w50Var6 = this.D;
            if (w50Var6 != null) {
                fVar.i(24, w50Var6.computeSize());
                this.D.writeFields(fVar);
            }
            fVar.a(25, this.E);
            fVar.a(26, this.F);
            r45.w50 w50Var7 = this.G;
            if (w50Var7 != null) {
                fVar.i(29, w50Var7.computeSize());
                this.G.writeFields(fVar);
            }
            r45.w50 w50Var8 = this.H;
            if (w50Var8 != null) {
                fVar.i(30, w50Var8.computeSize());
                this.H.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f385181d) + 0 + b36.f.e(2, this.f385182e) + b36.f.e(3, this.f385183f) + b36.f.g(4, 8, this.f385184g) + b36.f.g(5, 8, this.f385185h) + b36.f.g(6, 8, this.f385186i) + b36.f.g(7, 1, this.f385187m) + b36.f.e(8, this.f385188n);
            java.lang.String str5 = this.f385189o;
            if (str5 != null) {
                e17 += b36.f.j(9, str5);
            }
            int e18 = e17 + b36.f.e(10, this.f385190p) + b36.f.g(11, 8, this.f385191q) + b36.f.h(12, this.f385192r) + b36.f.e(13, this.f385193s);
            java.lang.String str6 = this.f385194t;
            if (str6 != null) {
                e18 += b36.f.j(14, str6);
            }
            r45.w50 w50Var9 = this.f385195u;
            if (w50Var9 != null) {
                e18 += b36.f.i(15, w50Var9.computeSize());
            }
            int g17 = e18 + b36.f.g(16, 8, this.f385196v);
            r45.w50 w50Var10 = this.f385197w;
            if (w50Var10 != null) {
                g17 += b36.f.i(17, w50Var10.computeSize());
            }
            r45.w50 w50Var11 = this.f385198x;
            if (w50Var11 != null) {
                g17 += b36.f.i(18, w50Var11.computeSize());
            }
            r45.w50 w50Var12 = this.f385199y;
            if (w50Var12 != null) {
                g17 += b36.f.i(19, w50Var12.computeSize());
            }
            r45.ee0 ee0Var2 = this.f385200z;
            if (ee0Var2 != null) {
                g17 += b36.f.i(20, ee0Var2.computeSize());
            }
            java.lang.String str7 = this.A;
            if (str7 != null) {
                g17 += b36.f.j(21, str7);
            }
            r45.w50 w50Var13 = this.B;
            if (w50Var13 != null) {
                g17 += b36.f.i(22, w50Var13.computeSize());
            }
            java.lang.String str8 = this.C;
            if (str8 != null) {
                g17 += b36.f.j(23, str8);
            }
            r45.w50 w50Var14 = this.D;
            if (w50Var14 != null) {
                g17 += b36.f.i(24, w50Var14.computeSize());
            }
            int a17 = g17 + b36.f.a(25, this.E) + b36.f.a(26, this.F);
            r45.w50 w50Var15 = this.G;
            if (w50Var15 != null) {
                a17 += b36.f.i(29, w50Var15.computeSize());
            }
            r45.w50 w50Var16 = this.H;
            return w50Var16 != null ? a17 + b36.f.i(30, w50Var16.computeSize()) : a17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f385184g.clear();
            this.f385185h.clear();
            this.f385186i.clear();
            this.f385187m.clear();
            this.f385191q.clear();
            this.f385196v.clear();
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
        r45.rt rtVar = (r45.rt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rtVar.f385181d = aVar2.g(intValue);
                return 0;
            case 2:
                rtVar.f385182e = aVar2.g(intValue);
                return 0;
            case 3:
                rtVar.f385183f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.lv lvVar = new r45.lv();
                    if (bArr2 != null && bArr2.length > 0) {
                        lvVar.parseFrom(bArr2);
                    }
                    rtVar.f385184g.add(lvVar);
                }
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.lv lvVar2 = new r45.lv();
                    if (bArr3 != null && bArr3.length > 0) {
                        lvVar2.parseFrom(bArr3);
                    }
                    rtVar.f385185h.add(lvVar2);
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.lv lvVar3 = new r45.lv();
                    if (bArr4 != null && bArr4.length > 0) {
                        lvVar3.parseFrom(bArr4);
                    }
                    rtVar.f385186i.add(lvVar3);
                }
                return 0;
            case 7:
                rtVar.f385187m.add(aVar2.k(intValue));
                return 0;
            case 8:
                rtVar.f385188n = aVar2.g(intValue);
                return 0;
            case 9:
                rtVar.f385189o = aVar2.k(intValue);
                return 0;
            case 10:
                rtVar.f385190p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.w50 w50Var17 = new r45.w50();
                    if (bArr5 != null && bArr5.length > 0) {
                        w50Var17.parseFrom(bArr5);
                    }
                    rtVar.f385191q.add(w50Var17);
                }
                return 0;
            case 12:
                rtVar.f385192r = aVar2.i(intValue);
                return 0;
            case 13:
                rtVar.f385193s = aVar2.g(intValue);
                return 0;
            case 14:
                rtVar.f385194t = aVar2.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.w50 w50Var18 = new r45.w50();
                    if (bArr6 != null && bArr6.length > 0) {
                        w50Var18.parseFrom(bArr6);
                    }
                    rtVar.f385195u = w50Var18;
                }
                return 0;
            case 16:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.s1 s1Var = new r45.s1();
                    if (bArr7 != null && bArr7.length > 0) {
                        s1Var.parseFrom(bArr7);
                    }
                    rtVar.f385196v.add(s1Var);
                }
                return 0;
            case 17:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.w50 w50Var19 = new r45.w50();
                    if (bArr8 != null && bArr8.length > 0) {
                        w50Var19.parseFrom(bArr8);
                    }
                    rtVar.f385197w = w50Var19;
                }
                return 0;
            case 18:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr9 = (byte[]) j38.get(i39);
                    r45.w50 w50Var20 = new r45.w50();
                    if (bArr9 != null && bArr9.length > 0) {
                        w50Var20.parseFrom(bArr9);
                    }
                    rtVar.f385198x = w50Var20;
                }
                return 0;
            case 19:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr10 = (byte[]) j39.get(i47);
                    r45.w50 w50Var21 = new r45.w50();
                    if (bArr10 != null && bArr10.length > 0) {
                        w50Var21.parseFrom(bArr10);
                    }
                    rtVar.f385199y = w50Var21;
                }
                return 0;
            case 20:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr11 = (byte[]) j47.get(i48);
                    r45.ee0 ee0Var3 = new r45.ee0();
                    if (bArr11 != null && bArr11.length > 0) {
                        ee0Var3.parseFrom(bArr11);
                    }
                    rtVar.f385200z = ee0Var3;
                }
                return 0;
            case 21:
                rtVar.A = aVar2.k(intValue);
                return 0;
            case 22:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr12 = (byte[]) j48.get(i49);
                    r45.w50 w50Var22 = new r45.w50();
                    if (bArr12 != null && bArr12.length > 0) {
                        w50Var22.parseFrom(bArr12);
                    }
                    rtVar.B = w50Var22;
                }
                return 0;
            case 23:
                rtVar.C = aVar2.k(intValue);
                return 0;
            case 24:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr13 = (byte[]) j49.get(i57);
                    r45.w50 w50Var23 = new r45.w50();
                    if (bArr13 != null && bArr13.length > 0) {
                        w50Var23.parseFrom(bArr13);
                    }
                    rtVar.D = w50Var23;
                }
                return 0;
            case 25:
                rtVar.E = aVar2.c(intValue);
                return 0;
            case 26:
                rtVar.F = aVar2.c(intValue);
                return 0;
            case 27:
            case 28:
            default:
                return -1;
            case 29:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr14 = (byte[]) j57.get(i58);
                    r45.w50 w50Var24 = new r45.w50();
                    if (bArr14 != null && bArr14.length > 0) {
                        w50Var24.parseFrom(bArr14);
                    }
                    rtVar.G = w50Var24;
                }
                return 0;
            case 30:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i59 = 0; i59 < size14; i59++) {
                    byte[] bArr15 = (byte[]) j58.get(i59);
                    r45.w50 w50Var25 = new r45.w50();
                    if (bArr15 != null && bArr15.length > 0) {
                        w50Var25.parseFrom(bArr15);
                    }
                    rtVar.H = w50Var25;
                }
                return 0;
        }
    }
}
