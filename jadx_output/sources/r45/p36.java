package r45;

/* loaded from: classes11.dex */
public class p36 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public r45.va0 D;
    public java.lang.String E;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382704d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382705e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382706f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382707g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382708h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382709i;

    /* renamed from: m, reason: collision with root package name */
    public int f382710m;

    /* renamed from: n, reason: collision with root package name */
    public int f382711n;

    /* renamed from: o, reason: collision with root package name */
    public int f382712o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f382713p;

    /* renamed from: q, reason: collision with root package name */
    public int f382714q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f382715r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f382716s;

    /* renamed from: t, reason: collision with root package name */
    public int f382717t;

    /* renamed from: u, reason: collision with root package name */
    public int f382718u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f382719v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f382720w;

    /* renamed from: x, reason: collision with root package name */
    public int f382721x;

    /* renamed from: y, reason: collision with root package name */
    public r45.cb6 f382722y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f382723z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p36)) {
            return false;
        }
        r45.p36 p36Var = (r45.p36) fVar;
        return n51.f.a(this.f382704d, p36Var.f382704d) && n51.f.a(this.f382705e, p36Var.f382705e) && n51.f.a(this.f382706f, p36Var.f382706f) && n51.f.a(this.f382707g, p36Var.f382707g) && n51.f.a(this.f382708h, p36Var.f382708h) && n51.f.a(this.f382709i, p36Var.f382709i) && n51.f.a(java.lang.Integer.valueOf(this.f382710m), java.lang.Integer.valueOf(p36Var.f382710m)) && n51.f.a(java.lang.Integer.valueOf(this.f382711n), java.lang.Integer.valueOf(p36Var.f382711n)) && n51.f.a(java.lang.Integer.valueOf(this.f382712o), java.lang.Integer.valueOf(p36Var.f382712o)) && n51.f.a(this.f382713p, p36Var.f382713p) && n51.f.a(java.lang.Integer.valueOf(this.f382714q), java.lang.Integer.valueOf(p36Var.f382714q)) && n51.f.a(this.f382715r, p36Var.f382715r) && n51.f.a(this.f382716s, p36Var.f382716s) && n51.f.a(java.lang.Integer.valueOf(this.f382717t), java.lang.Integer.valueOf(p36Var.f382717t)) && n51.f.a(java.lang.Integer.valueOf(this.f382718u), java.lang.Integer.valueOf(p36Var.f382718u)) && n51.f.a(this.f382719v, p36Var.f382719v) && n51.f.a(this.f382720w, p36Var.f382720w) && n51.f.a(java.lang.Integer.valueOf(this.f382721x), java.lang.Integer.valueOf(p36Var.f382721x)) && n51.f.a(this.f382722y, p36Var.f382722y) && n51.f.a(this.f382723z, p36Var.f382723z) && n51.f.a(this.A, p36Var.A) && n51.f.a(this.B, p36Var.B) && n51.f.a(this.C, p36Var.C) && n51.f.a(this.D, p36Var.D) && n51.f.a(this.E, p36Var.E);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382704d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382705e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f382706f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f382707g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f382708h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f382709i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f382710m);
            fVar.e(8, this.f382711n);
            fVar.e(9, this.f382712o);
            r45.cu5 cu5Var = this.f382713p;
            if (cu5Var != null) {
                fVar.i(10, cu5Var.computeSize());
                this.f382713p.writeFields(fVar);
            }
            fVar.e(11, this.f382714q);
            java.lang.String str7 = this.f382715r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            java.lang.String str8 = this.f382716s;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            fVar.e(14, this.f382717t);
            fVar.e(15, this.f382718u);
            java.lang.String str9 = this.f382719v;
            if (str9 != null) {
                fVar.j(16, str9);
            }
            java.lang.String str10 = this.f382720w;
            if (str10 != null) {
                fVar.j(17, str10);
            }
            fVar.e(21, this.f382721x);
            r45.cb6 cb6Var = this.f382722y;
            if (cb6Var != null) {
                fVar.i(22, cb6Var.computeSize());
                this.f382722y.writeFields(fVar);
            }
            java.lang.String str11 = this.f382723z;
            if (str11 != null) {
                fVar.j(23, str11);
            }
            java.lang.String str12 = this.A;
            if (str12 != null) {
                fVar.j(24, str12);
            }
            java.lang.String str13 = this.B;
            if (str13 != null) {
                fVar.j(25, str13);
            }
            java.lang.String str14 = this.C;
            if (str14 != null) {
                fVar.j(26, str14);
            }
            r45.va0 va0Var = this.D;
            if (va0Var != null) {
                fVar.i(27, va0Var.computeSize());
                this.D.writeFields(fVar);
            }
            java.lang.String str15 = this.E;
            if (str15 != null) {
                fVar.j(28, str15);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str16 = this.f382704d;
            int j17 = str16 != null ? b36.f.j(1, str16) + 0 : 0;
            java.lang.String str17 = this.f382705e;
            if (str17 != null) {
                j17 += b36.f.j(2, str17);
            }
            java.lang.String str18 = this.f382706f;
            if (str18 != null) {
                j17 += b36.f.j(3, str18);
            }
            java.lang.String str19 = this.f382707g;
            if (str19 != null) {
                j17 += b36.f.j(4, str19);
            }
            java.lang.String str20 = this.f382708h;
            if (str20 != null) {
                j17 += b36.f.j(5, str20);
            }
            java.lang.String str21 = this.f382709i;
            if (str21 != null) {
                j17 += b36.f.j(6, str21);
            }
            int e17 = j17 + b36.f.e(7, this.f382710m) + b36.f.e(8, this.f382711n) + b36.f.e(9, this.f382712o);
            r45.cu5 cu5Var2 = this.f382713p;
            if (cu5Var2 != null) {
                e17 += b36.f.i(10, cu5Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(11, this.f382714q);
            java.lang.String str22 = this.f382715r;
            if (str22 != null) {
                e18 += b36.f.j(12, str22);
            }
            java.lang.String str23 = this.f382716s;
            if (str23 != null) {
                e18 += b36.f.j(13, str23);
            }
            int e19 = e18 + b36.f.e(14, this.f382717t) + b36.f.e(15, this.f382718u);
            java.lang.String str24 = this.f382719v;
            if (str24 != null) {
                e19 += b36.f.j(16, str24);
            }
            java.lang.String str25 = this.f382720w;
            if (str25 != null) {
                e19 += b36.f.j(17, str25);
            }
            int e27 = e19 + b36.f.e(21, this.f382721x);
            r45.cb6 cb6Var2 = this.f382722y;
            if (cb6Var2 != null) {
                e27 += b36.f.i(22, cb6Var2.computeSize());
            }
            java.lang.String str26 = this.f382723z;
            if (str26 != null) {
                e27 += b36.f.j(23, str26);
            }
            java.lang.String str27 = this.A;
            if (str27 != null) {
                e27 += b36.f.j(24, str27);
            }
            java.lang.String str28 = this.B;
            if (str28 != null) {
                e27 += b36.f.j(25, str28);
            }
            java.lang.String str29 = this.C;
            if (str29 != null) {
                e27 += b36.f.j(26, str29);
            }
            r45.va0 va0Var2 = this.D;
            if (va0Var2 != null) {
                e27 += b36.f.i(27, va0Var2.computeSize());
            }
            java.lang.String str30 = this.E;
            return str30 != null ? e27 + b36.f.j(28, str30) : e27;
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
        r45.p36 p36Var = (r45.p36) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p36Var.f382704d = aVar2.k(intValue);
                return 0;
            case 2:
                p36Var.f382705e = aVar2.k(intValue);
                return 0;
            case 3:
                p36Var.f382706f = aVar2.k(intValue);
                return 0;
            case 4:
                p36Var.f382707g = aVar2.k(intValue);
                return 0;
            case 5:
                p36Var.f382708h = aVar2.k(intValue);
                return 0;
            case 6:
                p36Var.f382709i = aVar2.k(intValue);
                return 0;
            case 7:
                p36Var.f382710m = aVar2.g(intValue);
                return 0;
            case 8:
                p36Var.f382711n = aVar2.g(intValue);
                return 0;
            case 9:
                p36Var.f382712o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    p36Var.f382713p = cu5Var3;
                }
                return 0;
            case 11:
                p36Var.f382714q = aVar2.g(intValue);
                return 0;
            case 12:
                p36Var.f382715r = aVar2.k(intValue);
                return 0;
            case 13:
                p36Var.f382716s = aVar2.k(intValue);
                return 0;
            case 14:
                p36Var.f382717t = aVar2.g(intValue);
                return 0;
            case 15:
                p36Var.f382718u = aVar2.g(intValue);
                return 0;
            case 16:
                p36Var.f382719v = aVar2.k(intValue);
                return 0;
            case 17:
                p36Var.f382720w = aVar2.k(intValue);
                return 0;
            case 18:
            case 19:
            case 20:
            default:
                return -1;
            case 21:
                p36Var.f382721x = aVar2.g(intValue);
                return 0;
            case 22:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.cb6 cb6Var3 = new r45.cb6();
                    if (bArr2 != null && bArr2.length > 0) {
                        cb6Var3.parseFrom(bArr2);
                    }
                    p36Var.f382722y = cb6Var3;
                }
                return 0;
            case 23:
                p36Var.f382723z = aVar2.k(intValue);
                return 0;
            case 24:
                p36Var.A = aVar2.k(intValue);
                return 0;
            case 25:
                p36Var.B = aVar2.k(intValue);
                return 0;
            case 26:
                p36Var.C = aVar2.k(intValue);
                return 0;
            case 27:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.va0 va0Var3 = new r45.va0();
                    if (bArr3 != null && bArr3.length > 0) {
                        va0Var3.parseFrom(bArr3);
                    }
                    p36Var.D = va0Var3;
                }
                return 0;
            case 28:
                p36Var.E = aVar2.k(intValue);
                return 0;
        }
    }
}
