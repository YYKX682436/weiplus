package r45;

/* loaded from: classes12.dex */
public class xb extends com.tencent.mm.protobuf.f {
    public int A;
    public r45.cu5 B;
    public r45.cu5 C;
    public int D;
    public r45.cu5 E;
    public r45.cu5 F;

    /* renamed from: d, reason: collision with root package name */
    public int f389921d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ig0 f389922e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f389923f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f389924g;

    /* renamed from: h, reason: collision with root package name */
    public int f389925h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f389926i;

    /* renamed from: m, reason: collision with root package name */
    public r45.a67 f389927m;

    /* renamed from: n, reason: collision with root package name */
    public r45.tb7 f389928n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f389929o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f389930p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f389931q;

    /* renamed from: r, reason: collision with root package name */
    public r45.cu5 f389932r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f389933s;

    /* renamed from: t, reason: collision with root package name */
    public r45.w56 f389934t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f389935u;

    /* renamed from: v, reason: collision with root package name */
    public int f389936v;

    /* renamed from: w, reason: collision with root package name */
    public int f389937w;

    /* renamed from: x, reason: collision with root package name */
    public int f389938x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f389939y;

    /* renamed from: z, reason: collision with root package name */
    public int f389940z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xb)) {
            return false;
        }
        r45.xb xbVar = (r45.xb) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389921d), java.lang.Integer.valueOf(xbVar.f389921d)) && n51.f.a(this.f389922e, xbVar.f389922e) && n51.f.a(this.f389923f, xbVar.f389923f) && n51.f.a(this.f389924g, xbVar.f389924g) && n51.f.a(java.lang.Integer.valueOf(this.f389925h), java.lang.Integer.valueOf(xbVar.f389925h)) && n51.f.a(this.f389926i, xbVar.f389926i) && n51.f.a(this.f389927m, xbVar.f389927m) && n51.f.a(this.f389928n, xbVar.f389928n) && n51.f.a(this.f389929o, xbVar.f389929o) && n51.f.a(this.f389930p, xbVar.f389930p) && n51.f.a(this.f389931q, xbVar.f389931q) && n51.f.a(this.f389932r, xbVar.f389932r) && n51.f.a(this.f389933s, xbVar.f389933s) && n51.f.a(this.f389934t, xbVar.f389934t) && n51.f.a(this.f389935u, xbVar.f389935u) && n51.f.a(java.lang.Integer.valueOf(this.f389936v), java.lang.Integer.valueOf(xbVar.f389936v)) && n51.f.a(java.lang.Integer.valueOf(this.f389937w), java.lang.Integer.valueOf(xbVar.f389937w)) && n51.f.a(java.lang.Integer.valueOf(this.f389938x), java.lang.Integer.valueOf(xbVar.f389938x)) && n51.f.a(this.f389939y, xbVar.f389939y) && n51.f.a(java.lang.Integer.valueOf(this.f389940z), java.lang.Integer.valueOf(xbVar.f389940z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(xbVar.A)) && n51.f.a(this.B, xbVar.B) && n51.f.a(this.C, xbVar.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(xbVar.D)) && n51.f.a(this.E, xbVar.E) && n51.f.a(this.F, xbVar.F);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389921d);
            r45.ig0 ig0Var = this.f389922e;
            if (ig0Var != null) {
                fVar.i(2, ig0Var.computeSize());
                this.f389922e.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f389923f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f389923f.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f389924g;
            if (cu5Var2 != null) {
                fVar.i(4, cu5Var2.computeSize());
                this.f389924g.writeFields(fVar);
            }
            fVar.e(5, this.f389925h);
            r45.cu5 cu5Var3 = this.f389926i;
            if (cu5Var3 != null) {
                fVar.i(6, cu5Var3.computeSize());
                this.f389926i.writeFields(fVar);
            }
            r45.a67 a67Var = this.f389927m;
            if (a67Var != null) {
                fVar.i(7, a67Var.computeSize());
                this.f389927m.writeFields(fVar);
            }
            r45.tb7 tb7Var = this.f389928n;
            if (tb7Var != null) {
                fVar.i(8, tb7Var.computeSize());
                this.f389928n.writeFields(fVar);
            }
            r45.cu5 cu5Var4 = this.f389929o;
            if (cu5Var4 != null) {
                fVar.i(9, cu5Var4.computeSize());
                this.f389929o.writeFields(fVar);
            }
            r45.cu5 cu5Var5 = this.f389930p;
            if (cu5Var5 != null) {
                fVar.i(10, cu5Var5.computeSize());
                this.f389930p.writeFields(fVar);
            }
            java.lang.String str = this.f389931q;
            if (str != null) {
                fVar.j(11, str);
            }
            r45.cu5 cu5Var6 = this.f389932r;
            if (cu5Var6 != null) {
                fVar.i(12, cu5Var6.computeSize());
                this.f389932r.writeFields(fVar);
            }
            java.lang.String str2 = this.f389933s;
            if (str2 != null) {
                fVar.j(14, str2);
            }
            r45.w56 w56Var = this.f389934t;
            if (w56Var != null) {
                fVar.i(15, w56Var.computeSize());
                this.f389934t.writeFields(fVar);
            }
            java.lang.String str3 = this.f389935u;
            if (str3 != null) {
                fVar.j(16, str3);
            }
            fVar.e(17, this.f389936v);
            fVar.e(18, this.f389937w);
            fVar.e(19, this.f389938x);
            java.lang.String str4 = this.f389939y;
            if (str4 != null) {
                fVar.j(20, str4);
            }
            fVar.e(21, this.f389940z);
            fVar.e(22, this.A);
            r45.cu5 cu5Var7 = this.B;
            if (cu5Var7 != null) {
                fVar.i(23, cu5Var7.computeSize());
                this.B.writeFields(fVar);
            }
            r45.cu5 cu5Var8 = this.C;
            if (cu5Var8 != null) {
                fVar.i(24, cu5Var8.computeSize());
                this.C.writeFields(fVar);
            }
            fVar.e(25, this.D);
            r45.cu5 cu5Var9 = this.E;
            if (cu5Var9 != null) {
                fVar.i(26, cu5Var9.computeSize());
                this.E.writeFields(fVar);
            }
            r45.cu5 cu5Var10 = this.F;
            if (cu5Var10 != null) {
                fVar.i(27, cu5Var10.computeSize());
                this.F.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f389921d) + 0;
            r45.ig0 ig0Var2 = this.f389922e;
            if (ig0Var2 != null) {
                e17 += b36.f.i(2, ig0Var2.computeSize());
            }
            r45.cu5 cu5Var11 = this.f389923f;
            if (cu5Var11 != null) {
                e17 += b36.f.i(3, cu5Var11.computeSize());
            }
            r45.cu5 cu5Var12 = this.f389924g;
            if (cu5Var12 != null) {
                e17 += b36.f.i(4, cu5Var12.computeSize());
            }
            int e18 = e17 + b36.f.e(5, this.f389925h);
            r45.cu5 cu5Var13 = this.f389926i;
            if (cu5Var13 != null) {
                e18 += b36.f.i(6, cu5Var13.computeSize());
            }
            r45.a67 a67Var2 = this.f389927m;
            if (a67Var2 != null) {
                e18 += b36.f.i(7, a67Var2.computeSize());
            }
            r45.tb7 tb7Var2 = this.f389928n;
            if (tb7Var2 != null) {
                e18 += b36.f.i(8, tb7Var2.computeSize());
            }
            r45.cu5 cu5Var14 = this.f389929o;
            if (cu5Var14 != null) {
                e18 += b36.f.i(9, cu5Var14.computeSize());
            }
            r45.cu5 cu5Var15 = this.f389930p;
            if (cu5Var15 != null) {
                e18 += b36.f.i(10, cu5Var15.computeSize());
            }
            java.lang.String str5 = this.f389931q;
            if (str5 != null) {
                e18 += b36.f.j(11, str5);
            }
            r45.cu5 cu5Var16 = this.f389932r;
            if (cu5Var16 != null) {
                e18 += b36.f.i(12, cu5Var16.computeSize());
            }
            java.lang.String str6 = this.f389933s;
            if (str6 != null) {
                e18 += b36.f.j(14, str6);
            }
            r45.w56 w56Var2 = this.f389934t;
            if (w56Var2 != null) {
                e18 += b36.f.i(15, w56Var2.computeSize());
            }
            java.lang.String str7 = this.f389935u;
            if (str7 != null) {
                e18 += b36.f.j(16, str7);
            }
            int e19 = e18 + b36.f.e(17, this.f389936v) + b36.f.e(18, this.f389937w) + b36.f.e(19, this.f389938x);
            java.lang.String str8 = this.f389939y;
            if (str8 != null) {
                e19 += b36.f.j(20, str8);
            }
            int e27 = e19 + b36.f.e(21, this.f389940z) + b36.f.e(22, this.A);
            r45.cu5 cu5Var17 = this.B;
            if (cu5Var17 != null) {
                e27 += b36.f.i(23, cu5Var17.computeSize());
            }
            r45.cu5 cu5Var18 = this.C;
            if (cu5Var18 != null) {
                e27 += b36.f.i(24, cu5Var18.computeSize());
            }
            int e28 = e27 + b36.f.e(25, this.D);
            r45.cu5 cu5Var19 = this.E;
            if (cu5Var19 != null) {
                e28 += b36.f.i(26, cu5Var19.computeSize());
            }
            r45.cu5 cu5Var20 = this.F;
            return cu5Var20 != null ? e28 + b36.f.i(27, cu5Var20.computeSize()) : e28;
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
        r45.xb xbVar = (r45.xb) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xbVar.f389921d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ig0 ig0Var3 = new r45.ig0();
                    if (bArr != null && bArr.length > 0) {
                        ig0Var3.parseFrom(bArr);
                    }
                    xbVar.f389922e = ig0Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.cu5 cu5Var21 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var21.b(bArr2);
                    }
                    xbVar.f389923f = cu5Var21;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.cu5 cu5Var22 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var22.b(bArr3);
                    }
                    xbVar.f389924g = cu5Var22;
                }
                return 0;
            case 5:
                xbVar.f389925h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.cu5 cu5Var23 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var23.b(bArr4);
                    }
                    xbVar.f389926i = cu5Var23;
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.a67 a67Var3 = new r45.a67();
                    if (bArr5 != null && bArr5.length > 0) {
                        a67Var3.parseFrom(bArr5);
                    }
                    xbVar.f389927m = a67Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    r45.tb7 tb7Var3 = new r45.tb7();
                    if (bArr6 != null && bArr6.length > 0) {
                        tb7Var3.parseFrom(bArr6);
                    }
                    xbVar.f389928n = tb7Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    r45.cu5 cu5Var24 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var24.b(bArr7);
                    }
                    xbVar.f389929o = cu5Var24;
                }
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    r45.cu5 cu5Var25 = new r45.cu5();
                    if (bArr8 != null && bArr8.length > 0) {
                        cu5Var25.b(bArr8);
                    }
                    xbVar.f389930p = cu5Var25;
                }
                return 0;
            case 11:
                xbVar.f389931q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    r45.cu5 cu5Var26 = new r45.cu5();
                    if (bArr9 != null && bArr9.length > 0) {
                        cu5Var26.b(bArr9);
                    }
                    xbVar.f389932r = cu5Var26;
                }
                return 0;
            case 13:
            default:
                return -1;
            case 14:
                xbVar.f389933s = aVar2.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    r45.w56 w56Var3 = new r45.w56();
                    if (bArr10 != null && bArr10.length > 0) {
                        w56Var3.parseFrom(bArr10);
                    }
                    xbVar.f389934t = w56Var3;
                }
                return 0;
            case 16:
                xbVar.f389935u = aVar2.k(intValue);
                return 0;
            case 17:
                xbVar.f389936v = aVar2.g(intValue);
                return 0;
            case 18:
                xbVar.f389937w = aVar2.g(intValue);
                return 0;
            case 19:
                xbVar.f389938x = aVar2.g(intValue);
                return 0;
            case 20:
                xbVar.f389939y = aVar2.k(intValue);
                return 0;
            case 21:
                xbVar.f389940z = aVar2.g(intValue);
                return 0;
            case 22:
                xbVar.A = aVar2.g(intValue);
                return 0;
            case 23:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    r45.cu5 cu5Var27 = new r45.cu5();
                    if (bArr11 != null && bArr11.length > 0) {
                        cu5Var27.b(bArr11);
                    }
                    xbVar.B = cu5Var27;
                }
                return 0;
            case 24:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j49.get(i57);
                    r45.cu5 cu5Var28 = new r45.cu5();
                    if (bArr12 != null && bArr12.length > 0) {
                        cu5Var28.b(bArr12);
                    }
                    xbVar.C = cu5Var28;
                }
                return 0;
            case 25:
                xbVar.D = aVar2.g(intValue);
                return 0;
            case 26:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr13 = (byte[]) j57.get(i58);
                    r45.cu5 cu5Var29 = new r45.cu5();
                    if (bArr13 != null && bArr13.length > 0) {
                        cu5Var29.b(bArr13);
                    }
                    xbVar.E = cu5Var29;
                }
                return 0;
            case 27:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i59 = 0; i59 < size14; i59++) {
                    byte[] bArr14 = (byte[]) j58.get(i59);
                    r45.cu5 cu5Var30 = new r45.cu5();
                    if (bArr14 != null && bArr14.length > 0) {
                        cu5Var30.b(bArr14);
                    }
                    xbVar.F = cu5Var30;
                }
                return 0;
        }
    }
}
