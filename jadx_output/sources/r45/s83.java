package r45;

/* loaded from: classes8.dex */
public class s83 extends r45.js5 {
    public r45.cu5 A;
    public java.lang.String B;
    public r45.cu5 C;
    public r45.cu5 D;
    public r45.cu5 E;
    public int F;
    public int G;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f385544J;
    public java.lang.String K;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385545d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385546e;

    /* renamed from: f, reason: collision with root package name */
    public int f385547f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385548g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385549h;

    /* renamed from: i, reason: collision with root package name */
    public r45.w14 f385550i;

    /* renamed from: m, reason: collision with root package name */
    public r45.y73 f385551m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f385552n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f385553o;

    /* renamed from: p, reason: collision with root package name */
    public int f385554p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f385556r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f385557s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f385558t;

    /* renamed from: u, reason: collision with root package name */
    public r45.mb0 f385559u;

    /* renamed from: v, reason: collision with root package name */
    public r45.cu5 f385560v;

    /* renamed from: w, reason: collision with root package name */
    public int f385561w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f385563y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f385564z;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f385555q = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f385562x = new java.util.LinkedList();
    public final java.util.LinkedList H = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s83)) {
            return false;
        }
        r45.s83 s83Var = (r45.s83) fVar;
        return n51.f.a(this.BaseResponse, s83Var.BaseResponse) && n51.f.a(this.f385545d, s83Var.f385545d) && n51.f.a(this.f385546e, s83Var.f385546e) && n51.f.a(java.lang.Integer.valueOf(this.f385547f), java.lang.Integer.valueOf(s83Var.f385547f)) && n51.f.a(this.f385548g, s83Var.f385548g) && n51.f.a(this.f385549h, s83Var.f385549h) && n51.f.a(this.f385550i, s83Var.f385550i) && n51.f.a(this.f385551m, s83Var.f385551m) && n51.f.a(this.f385552n, s83Var.f385552n) && n51.f.a(this.f385553o, s83Var.f385553o) && n51.f.a(java.lang.Integer.valueOf(this.f385554p), java.lang.Integer.valueOf(s83Var.f385554p)) && n51.f.a(this.f385555q, s83Var.f385555q) && n51.f.a(this.f385556r, s83Var.f385556r) && n51.f.a(this.f385557s, s83Var.f385557s) && n51.f.a(this.f385558t, s83Var.f385558t) && n51.f.a(this.f385559u, s83Var.f385559u) && n51.f.a(this.f385560v, s83Var.f385560v) && n51.f.a(java.lang.Integer.valueOf(this.f385561w), java.lang.Integer.valueOf(s83Var.f385561w)) && n51.f.a(this.f385562x, s83Var.f385562x) && n51.f.a(this.f385563y, s83Var.f385563y) && n51.f.a(this.f385564z, s83Var.f385564z) && n51.f.a(this.A, s83Var.A) && n51.f.a(this.B, s83Var.B) && n51.f.a(this.C, s83Var.C) && n51.f.a(this.D, s83Var.D) && n51.f.a(this.E, s83Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(s83Var.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(s83Var.G)) && n51.f.a(this.H, s83Var.H) && n51.f.a(this.I, s83Var.I) && n51.f.a(this.f385544J, s83Var.f385544J) && n51.f.a(this.K, s83Var.K);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.H;
        java.util.LinkedList linkedList2 = this.f385562x;
        java.util.LinkedList linkedList3 = this.f385555q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f385545d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f385546e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f385547f);
            java.lang.String str3 = this.f385548g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f385549h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.w14 w14Var = this.f385550i;
            if (w14Var != null) {
                fVar.i(7, w14Var.computeSize());
                this.f385550i.writeFields(fVar);
            }
            r45.y73 y73Var = this.f385551m;
            if (y73Var != null) {
                fVar.i(8, y73Var.computeSize());
                this.f385551m.writeFields(fVar);
            }
            java.lang.String str5 = this.f385552n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f385553o;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            fVar.e(16, this.f385554p);
            fVar.g(17, 8, linkedList3);
            java.lang.String str7 = this.f385556r;
            if (str7 != null) {
                fVar.j(18, str7);
            }
            java.lang.String str8 = this.f385557s;
            if (str8 != null) {
                fVar.j(20, str8);
            }
            java.lang.String str9 = this.f385558t;
            if (str9 != null) {
                fVar.j(21, str9);
            }
            r45.mb0 mb0Var = this.f385559u;
            if (mb0Var != null) {
                fVar.i(22, mb0Var.computeSize());
                this.f385559u.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f385560v;
            if (cu5Var != null) {
                fVar.i(23, cu5Var.computeSize());
                this.f385560v.writeFields(fVar);
            }
            fVar.e(24, this.f385561w);
            fVar.g(25, 8, linkedList2);
            java.lang.String str10 = this.f385563y;
            if (str10 != null) {
                fVar.j(26, str10);
            }
            java.lang.String str11 = this.f385564z;
            if (str11 != null) {
                fVar.j(27, str11);
            }
            r45.cu5 cu5Var2 = this.A;
            if (cu5Var2 != null) {
                fVar.i(28, cu5Var2.computeSize());
                this.A.writeFields(fVar);
            }
            java.lang.String str12 = this.B;
            if (str12 != null) {
                fVar.j(29, str12);
            }
            r45.cu5 cu5Var3 = this.C;
            if (cu5Var3 != null) {
                fVar.i(30, cu5Var3.computeSize());
                this.C.writeFields(fVar);
            }
            r45.cu5 cu5Var4 = this.D;
            if (cu5Var4 != null) {
                fVar.i(31, cu5Var4.computeSize());
                this.D.writeFields(fVar);
            }
            r45.cu5 cu5Var5 = this.E;
            if (cu5Var5 != null) {
                fVar.i(32, cu5Var5.computeSize());
                this.E.writeFields(fVar);
            }
            fVar.e(33, this.F);
            fVar.e(34, this.G);
            fVar.g(35, 8, linkedList);
            java.lang.String str13 = this.I;
            if (str13 != null) {
                fVar.j(36, str13);
            }
            java.lang.String str14 = this.f385544J;
            if (str14 != null) {
                fVar.j(37, str14);
            }
            java.lang.String str15 = this.K;
            if (str15 != null) {
                fVar.j(38, str15);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            java.lang.String str16 = this.f385545d;
            if (str16 != null) {
                i18 += b36.f.j(2, str16);
            }
            java.lang.String str17 = this.f385546e;
            if (str17 != null) {
                i18 += b36.f.j(3, str17);
            }
            int e17 = i18 + b36.f.e(4, this.f385547f);
            java.lang.String str18 = this.f385548g;
            if (str18 != null) {
                e17 += b36.f.j(5, str18);
            }
            java.lang.String str19 = this.f385549h;
            if (str19 != null) {
                e17 += b36.f.j(6, str19);
            }
            r45.w14 w14Var2 = this.f385550i;
            if (w14Var2 != null) {
                e17 += b36.f.i(7, w14Var2.computeSize());
            }
            r45.y73 y73Var2 = this.f385551m;
            if (y73Var2 != null) {
                e17 += b36.f.i(8, y73Var2.computeSize());
            }
            java.lang.String str20 = this.f385552n;
            if (str20 != null) {
                e17 += b36.f.j(9, str20);
            }
            java.lang.String str21 = this.f385553o;
            if (str21 != null) {
                e17 += b36.f.j(15, str21);
            }
            int e18 = e17 + b36.f.e(16, this.f385554p) + b36.f.g(17, 8, linkedList3);
            java.lang.String str22 = this.f385556r;
            if (str22 != null) {
                e18 += b36.f.j(18, str22);
            }
            java.lang.String str23 = this.f385557s;
            if (str23 != null) {
                e18 += b36.f.j(20, str23);
            }
            java.lang.String str24 = this.f385558t;
            if (str24 != null) {
                e18 += b36.f.j(21, str24);
            }
            r45.mb0 mb0Var2 = this.f385559u;
            if (mb0Var2 != null) {
                e18 += b36.f.i(22, mb0Var2.computeSize());
            }
            r45.cu5 cu5Var6 = this.f385560v;
            if (cu5Var6 != null) {
                e18 += b36.f.i(23, cu5Var6.computeSize());
            }
            int e19 = e18 + b36.f.e(24, this.f385561w) + b36.f.g(25, 8, linkedList2);
            java.lang.String str25 = this.f385563y;
            if (str25 != null) {
                e19 += b36.f.j(26, str25);
            }
            java.lang.String str26 = this.f385564z;
            if (str26 != null) {
                e19 += b36.f.j(27, str26);
            }
            r45.cu5 cu5Var7 = this.A;
            if (cu5Var7 != null) {
                e19 += b36.f.i(28, cu5Var7.computeSize());
            }
            java.lang.String str27 = this.B;
            if (str27 != null) {
                e19 += b36.f.j(29, str27);
            }
            r45.cu5 cu5Var8 = this.C;
            if (cu5Var8 != null) {
                e19 += b36.f.i(30, cu5Var8.computeSize());
            }
            r45.cu5 cu5Var9 = this.D;
            if (cu5Var9 != null) {
                e19 += b36.f.i(31, cu5Var9.computeSize());
            }
            r45.cu5 cu5Var10 = this.E;
            if (cu5Var10 != null) {
                e19 += b36.f.i(32, cu5Var10.computeSize());
            }
            int e27 = e19 + b36.f.e(33, this.F) + b36.f.e(34, this.G) + b36.f.g(35, 8, linkedList);
            java.lang.String str28 = this.I;
            if (str28 != null) {
                e27 += b36.f.j(36, str28);
            }
            java.lang.String str29 = this.f385544J;
            if (str29 != null) {
                e27 += b36.f.j(37, str29);
            }
            java.lang.String str30 = this.K;
            return str30 != null ? e27 + b36.f.j(38, str30) : e27;
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
        r45.s83 s83Var = (r45.s83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    s83Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                s83Var.f385545d = aVar2.k(intValue);
                return 0;
            case 3:
                s83Var.f385546e = aVar2.k(intValue);
                return 0;
            case 4:
                s83Var.f385547f = aVar2.g(intValue);
                return 0;
            case 5:
                s83Var.f385548g = aVar2.k(intValue);
                return 0;
            case 6:
                s83Var.f385549h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.w14 w14Var3 = new r45.w14();
                    if (bArr3 != null && bArr3.length > 0) {
                        w14Var3.parseFrom(bArr3);
                    }
                    s83Var.f385550i = w14Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.y73 y73Var3 = new r45.y73();
                    if (bArr4 != null && bArr4.length > 0) {
                        y73Var3.parseFrom(bArr4);
                    }
                    s83Var.f385551m = y73Var3;
                }
                return 0;
            case 9:
                s83Var.f385552n = aVar2.k(intValue);
                return 0;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 19:
            default:
                return -1;
            case 15:
                s83Var.f385553o = aVar2.k(intValue);
                return 0;
            case 16:
                s83Var.f385554p = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.jm jmVar = new r45.jm();
                    if (bArr5 != null && bArr5.length > 0) {
                        jmVar.parseFrom(bArr5);
                    }
                    s83Var.f385555q.add(jmVar);
                }
                return 0;
            case 18:
                s83Var.f385556r = aVar2.k(intValue);
                return 0;
            case 20:
                s83Var.f385557s = aVar2.k(intValue);
                return 0;
            case 21:
                s83Var.f385558t = aVar2.k(intValue);
                return 0;
            case 22:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.mb0 mb0Var3 = new r45.mb0();
                    if (bArr6 != null && bArr6.length > 0) {
                        mb0Var3.parseFrom(bArr6);
                    }
                    s83Var.f385559u = mb0Var3;
                }
                return 0;
            case 23:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var11.b(bArr7);
                    }
                    s83Var.f385560v = cu5Var11;
                }
                return 0;
            case 24:
                s83Var.f385561w = aVar2.g(intValue);
                return 0;
            case 25:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.rx3 rx3Var = new r45.rx3();
                    if (bArr8 != null && bArr8.length > 0) {
                        rx3Var.parseFrom(bArr8);
                    }
                    s83Var.f385562x.add(rx3Var);
                }
                return 0;
            case 26:
                s83Var.f385563y = aVar2.k(intValue);
                return 0;
            case 27:
                s83Var.f385564z = aVar2.k(intValue);
                return 0;
            case 28:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr9 != null && bArr9.length > 0) {
                        cu5Var12.b(bArr9);
                    }
                    s83Var.A = cu5Var12;
                }
                return 0;
            case 29:
                s83Var.B = aVar2.k(intValue);
                return 0;
            case 30:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.cu5 cu5Var13 = new r45.cu5();
                    if (bArr10 != null && bArr10.length > 0) {
                        cu5Var13.b(bArr10);
                    }
                    s83Var.C = cu5Var13;
                }
                return 0;
            case 31:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.cu5 cu5Var14 = new r45.cu5();
                    if (bArr11 != null && bArr11.length > 0) {
                        cu5Var14.b(bArr11);
                    }
                    s83Var.D = cu5Var14;
                }
                return 0;
            case 32:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.cu5 cu5Var15 = new r45.cu5();
                    if (bArr12 != null && bArr12.length > 0) {
                        cu5Var15.b(bArr12);
                    }
                    s83Var.E = cu5Var15;
                }
                return 0;
            case 33:
                s83Var.F = aVar2.g(intValue);
                return 0;
            case 34:
                s83Var.G = aVar2.g(intValue);
                return 0;
            case 35:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.eo5 eo5Var = new r45.eo5();
                    if (bArr13 != null && bArr13.length > 0) {
                        eo5Var.parseFrom(bArr13);
                    }
                    s83Var.H.add(eo5Var);
                }
                return 0;
            case 36:
                s83Var.I = aVar2.k(intValue);
                return 0;
            case 37:
                s83Var.f385544J = aVar2.k(intValue);
                return 0;
            case 38:
                s83Var.K = aVar2.k(intValue);
                return 0;
        }
    }
}
