package r45;

/* loaded from: classes12.dex */
public class ii4 extends r45.mr5 {
    public r45.cu5 A;
    public r45.cu5 B;
    public java.lang.String C;
    public r45.ye5 D;
    public java.lang.String E;

    /* renamed from: d, reason: collision with root package name */
    public r45.zd f377065d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377066e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377067f;

    /* renamed from: g, reason: collision with root package name */
    public int f377068g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377069h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f377070i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f377071m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f377072n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f377073o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f377074p;

    /* renamed from: q, reason: collision with root package name */
    public int f377075q;

    /* renamed from: r, reason: collision with root package name */
    public int f377076r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f377077s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f377078t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f377079u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f377080v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f377081w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f377082x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f377083y;

    /* renamed from: z, reason: collision with root package name */
    public int f377084z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ii4)) {
            return false;
        }
        r45.ii4 ii4Var = (r45.ii4) fVar;
        return n51.f.a(this.BaseRequest, ii4Var.BaseRequest) && n51.f.a(this.f377065d, ii4Var.f377065d) && n51.f.a(this.f377066e, ii4Var.f377066e) && n51.f.a(this.f377067f, ii4Var.f377067f) && n51.f.a(java.lang.Integer.valueOf(this.f377068g), java.lang.Integer.valueOf(ii4Var.f377068g)) && n51.f.a(this.f377069h, ii4Var.f377069h) && n51.f.a(this.f377070i, ii4Var.f377070i) && n51.f.a(this.f377071m, ii4Var.f377071m) && n51.f.a(this.f377072n, ii4Var.f377072n) && n51.f.a(this.f377073o, ii4Var.f377073o) && n51.f.a(this.f377074p, ii4Var.f377074p) && n51.f.a(java.lang.Integer.valueOf(this.f377075q), java.lang.Integer.valueOf(ii4Var.f377075q)) && n51.f.a(java.lang.Integer.valueOf(this.f377076r), java.lang.Integer.valueOf(ii4Var.f377076r)) && n51.f.a(this.f377077s, ii4Var.f377077s) && n51.f.a(this.f377078t, ii4Var.f377078t) && n51.f.a(this.f377079u, ii4Var.f377079u) && n51.f.a(this.f377080v, ii4Var.f377080v) && n51.f.a(this.f377081w, ii4Var.f377081w) && n51.f.a(this.f377082x, ii4Var.f377082x) && n51.f.a(this.f377083y, ii4Var.f377083y) && n51.f.a(java.lang.Integer.valueOf(this.f377084z), java.lang.Integer.valueOf(ii4Var.f377084z)) && n51.f.a(this.A, ii4Var.A) && n51.f.a(this.B, ii4Var.B) && n51.f.a(this.C, ii4Var.C) && n51.f.a(this.D, ii4Var.D) && n51.f.a(this.E, ii4Var.E);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.zd zdVar = this.f377065d;
            if (zdVar != null) {
                fVar.i(2, zdVar.computeSize());
                this.f377065d.writeFields(fVar);
            }
            java.lang.String str = this.f377066e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f377067f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f377068g);
            java.lang.String str3 = this.f377069h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f377070i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f377071m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f377072n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f377073o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f377074p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            fVar.e(13, this.f377075q);
            fVar.e(14, this.f377076r);
            java.lang.String str9 = this.f377077s;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            java.lang.String str10 = this.f377078t;
            if (str10 != null) {
                fVar.j(16, str10);
            }
            java.lang.String str11 = this.f377079u;
            if (str11 != null) {
                fVar.j(17, str11);
            }
            java.lang.String str12 = this.f377080v;
            if (str12 != null) {
                fVar.j(18, str12);
            }
            java.lang.String str13 = this.f377081w;
            if (str13 != null) {
                fVar.j(19, str13);
            }
            java.lang.String str14 = this.f377082x;
            if (str14 != null) {
                fVar.j(20, str14);
            }
            java.lang.String str15 = this.f377083y;
            if (str15 != null) {
                fVar.j(21, str15);
            }
            fVar.e(22, this.f377084z);
            r45.cu5 cu5Var = this.A;
            if (cu5Var != null) {
                fVar.i(23, cu5Var.computeSize());
                this.A.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.B;
            if (cu5Var2 != null) {
                fVar.i(24, cu5Var2.computeSize());
                this.B.writeFields(fVar);
            }
            java.lang.String str16 = this.C;
            if (str16 != null) {
                fVar.j(25, str16);
            }
            r45.ye5 ye5Var = this.D;
            if (ye5Var != null) {
                fVar.i(26, ye5Var.computeSize());
                this.D.writeFields(fVar);
            }
            java.lang.String str17 = this.E;
            if (str17 != null) {
                fVar.j(32, str17);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            r45.zd zdVar2 = this.f377065d;
            if (zdVar2 != null) {
                i18 += b36.f.i(2, zdVar2.computeSize());
            }
            java.lang.String str18 = this.f377066e;
            if (str18 != null) {
                i18 += b36.f.j(3, str18);
            }
            java.lang.String str19 = this.f377067f;
            if (str19 != null) {
                i18 += b36.f.j(4, str19);
            }
            int e17 = i18 + b36.f.e(5, this.f377068g);
            java.lang.String str20 = this.f377069h;
            if (str20 != null) {
                e17 += b36.f.j(6, str20);
            }
            java.lang.String str21 = this.f377070i;
            if (str21 != null) {
                e17 += b36.f.j(7, str21);
            }
            java.lang.String str22 = this.f377071m;
            if (str22 != null) {
                e17 += b36.f.j(8, str22);
            }
            java.lang.String str23 = this.f377072n;
            if (str23 != null) {
                e17 += b36.f.j(9, str23);
            }
            java.lang.String str24 = this.f377073o;
            if (str24 != null) {
                e17 += b36.f.j(10, str24);
            }
            java.lang.String str25 = this.f377074p;
            if (str25 != null) {
                e17 += b36.f.j(11, str25);
            }
            int e18 = e17 + b36.f.e(13, this.f377075q) + b36.f.e(14, this.f377076r);
            java.lang.String str26 = this.f377077s;
            if (str26 != null) {
                e18 += b36.f.j(15, str26);
            }
            java.lang.String str27 = this.f377078t;
            if (str27 != null) {
                e18 += b36.f.j(16, str27);
            }
            java.lang.String str28 = this.f377079u;
            if (str28 != null) {
                e18 += b36.f.j(17, str28);
            }
            java.lang.String str29 = this.f377080v;
            if (str29 != null) {
                e18 += b36.f.j(18, str29);
            }
            java.lang.String str30 = this.f377081w;
            if (str30 != null) {
                e18 += b36.f.j(19, str30);
            }
            java.lang.String str31 = this.f377082x;
            if (str31 != null) {
                e18 += b36.f.j(20, str31);
            }
            java.lang.String str32 = this.f377083y;
            if (str32 != null) {
                e18 += b36.f.j(21, str32);
            }
            int e19 = e18 + b36.f.e(22, this.f377084z);
            r45.cu5 cu5Var3 = this.A;
            if (cu5Var3 != null) {
                e19 += b36.f.i(23, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.B;
            if (cu5Var4 != null) {
                e19 += b36.f.i(24, cu5Var4.computeSize());
            }
            java.lang.String str33 = this.C;
            if (str33 != null) {
                e19 += b36.f.j(25, str33);
            }
            r45.ye5 ye5Var2 = this.D;
            if (ye5Var2 != null) {
                e19 += b36.f.i(26, ye5Var2.computeSize());
            }
            java.lang.String str34 = this.E;
            return str34 != null ? e19 + b36.f.j(32, str34) : e19;
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
        r45.ii4 ii4Var = (r45.ii4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 32) {
            ii4Var.E = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    ii4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.zd zdVar3 = new r45.zd();
                    if (bArr2 != null && bArr2.length > 0) {
                        zdVar3.parseFrom(bArr2);
                    }
                    ii4Var.f377065d = zdVar3;
                }
                return 0;
            case 3:
                ii4Var.f377066e = aVar2.k(intValue);
                return 0;
            case 4:
                ii4Var.f377067f = aVar2.k(intValue);
                return 0;
            case 5:
                ii4Var.f377068g = aVar2.g(intValue);
                return 0;
            case 6:
                ii4Var.f377069h = aVar2.k(intValue);
                return 0;
            case 7:
                ii4Var.f377070i = aVar2.k(intValue);
                return 0;
            case 8:
                ii4Var.f377071m = aVar2.k(intValue);
                return 0;
            case 9:
                ii4Var.f377072n = aVar2.k(intValue);
                return 0;
            case 10:
                ii4Var.f377073o = aVar2.k(intValue);
                return 0;
            case 11:
                ii4Var.f377074p = aVar2.k(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 13:
                        ii4Var.f377075q = aVar2.g(intValue);
                        return 0;
                    case 14:
                        ii4Var.f377076r = aVar2.g(intValue);
                        return 0;
                    case 15:
                        ii4Var.f377077s = aVar2.k(intValue);
                        return 0;
                    case 16:
                        ii4Var.f377078t = aVar2.k(intValue);
                        return 0;
                    case 17:
                        ii4Var.f377079u = aVar2.k(intValue);
                        return 0;
                    case 18:
                        ii4Var.f377080v = aVar2.k(intValue);
                        return 0;
                    case 19:
                        ii4Var.f377081w = aVar2.k(intValue);
                        return 0;
                    case 20:
                        ii4Var.f377082x = aVar2.k(intValue);
                        return 0;
                    case 21:
                        ii4Var.f377083y = aVar2.k(intValue);
                        return 0;
                    case 22:
                        ii4Var.f377084z = aVar2.g(intValue);
                        return 0;
                    case 23:
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size3 = j19.size();
                        for (int i28 = 0; i28 < size3; i28++) {
                            byte[] bArr3 = (byte[]) j19.get(i28);
                            r45.cu5 cu5Var5 = new r45.cu5();
                            if (bArr3 != null && bArr3.length > 0) {
                                cu5Var5.b(bArr3);
                            }
                            ii4Var.A = cu5Var5;
                        }
                        return 0;
                    case 24:
                        java.util.LinkedList j27 = aVar2.j(intValue);
                        int size4 = j27.size();
                        for (int i29 = 0; i29 < size4; i29++) {
                            byte[] bArr4 = (byte[]) j27.get(i29);
                            r45.cu5 cu5Var6 = new r45.cu5();
                            if (bArr4 != null && bArr4.length > 0) {
                                cu5Var6.b(bArr4);
                            }
                            ii4Var.B = cu5Var6;
                        }
                        return 0;
                    case 25:
                        ii4Var.C = aVar2.k(intValue);
                        return 0;
                    case 26:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size5 = j28.size();
                        for (int i37 = 0; i37 < size5; i37++) {
                            byte[] bArr5 = (byte[]) j28.get(i37);
                            r45.ye5 ye5Var3 = new r45.ye5();
                            if (bArr5 != null && bArr5.length > 0) {
                                ye5Var3.parseFrom(bArr5);
                            }
                            ii4Var.D = ye5Var3;
                        }
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
