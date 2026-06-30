package r45;

/* loaded from: classes14.dex */
public class lf3 extends r45.mr5 {
    public boolean A;
    public java.lang.String B;
    public boolean C;
    public java.lang.String D;
    public java.lang.String E;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379407d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379408e;

    /* renamed from: f, reason: collision with root package name */
    public float f379409f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379410g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379411h;

    /* renamed from: i, reason: collision with root package name */
    public int f379412i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379413m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f379414n;

    /* renamed from: o, reason: collision with root package name */
    public r45.z55 f379415o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379416p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f379417q;

    /* renamed from: r, reason: collision with root package name */
    public int f379418r;

    /* renamed from: s, reason: collision with root package name */
    public long f379419s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ae f379420t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379421u;

    /* renamed from: v, reason: collision with root package name */
    public r45.ju3 f379422v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f379423w;

    /* renamed from: x, reason: collision with root package name */
    public r45.xk6 f379424x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f379425y;

    /* renamed from: z, reason: collision with root package name */
    public int f379426z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lf3)) {
            return false;
        }
        r45.lf3 lf3Var = (r45.lf3) fVar;
        return n51.f.a(this.BaseRequest, lf3Var.BaseRequest) && n51.f.a(this.f379407d, lf3Var.f379407d) && n51.f.a(this.f379408e, lf3Var.f379408e) && n51.f.a(java.lang.Float.valueOf(this.f379409f), java.lang.Float.valueOf(lf3Var.f379409f)) && n51.f.a(this.f379410g, lf3Var.f379410g) && n51.f.a(this.f379411h, lf3Var.f379411h) && n51.f.a(java.lang.Integer.valueOf(this.f379412i), java.lang.Integer.valueOf(lf3Var.f379412i)) && n51.f.a(this.f379413m, lf3Var.f379413m) && n51.f.a(this.f379414n, lf3Var.f379414n) && n51.f.a(this.f379415o, lf3Var.f379415o) && n51.f.a(this.f379416p, lf3Var.f379416p) && n51.f.a(java.lang.Boolean.valueOf(this.f379417q), java.lang.Boolean.valueOf(lf3Var.f379417q)) && n51.f.a(java.lang.Integer.valueOf(this.f379418r), java.lang.Integer.valueOf(lf3Var.f379418r)) && n51.f.a(java.lang.Long.valueOf(this.f379419s), java.lang.Long.valueOf(lf3Var.f379419s)) && n51.f.a(this.f379420t, lf3Var.f379420t) && n51.f.a(this.f379421u, lf3Var.f379421u) && n51.f.a(this.f379422v, lf3Var.f379422v) && n51.f.a(java.lang.Boolean.valueOf(this.f379423w), java.lang.Boolean.valueOf(lf3Var.f379423w)) && n51.f.a(this.f379424x, lf3Var.f379424x) && n51.f.a(this.f379425y, lf3Var.f379425y) && n51.f.a(java.lang.Integer.valueOf(this.f379426z), java.lang.Integer.valueOf(lf3Var.f379426z)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(lf3Var.A)) && n51.f.a(this.B, lf3Var.B) && n51.f.a(java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(lf3Var.C)) && n51.f.a(this.D, lf3Var.D) && n51.f.a(this.E, lf3Var.E);
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
            java.lang.String str = this.f379407d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379408e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.d(4, this.f379409f);
            java.lang.String str3 = this.f379410g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f379411h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f379412i);
            java.lang.String str5 = this.f379413m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f379414n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            r45.z55 z55Var = this.f379415o;
            if (z55Var != null) {
                fVar.i(10, z55Var.computeSize());
                this.f379415o.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f379416p;
            if (gVar != null) {
                fVar.b(11, gVar);
            }
            fVar.a(12, this.f379417q);
            fVar.e(13, this.f379418r);
            fVar.h(14, this.f379419s);
            r45.ae aeVar = this.f379420t;
            if (aeVar != null) {
                fVar.i(15, aeVar.computeSize());
                this.f379420t.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f379421u;
            if (gVar2 != null) {
                fVar.b(17, gVar2);
            }
            r45.ju3 ju3Var = this.f379422v;
            if (ju3Var != null) {
                fVar.i(18, ju3Var.computeSize());
                this.f379422v.writeFields(fVar);
            }
            fVar.a(19, this.f379423w);
            r45.xk6 xk6Var = this.f379424x;
            if (xk6Var != null) {
                fVar.i(22, xk6Var.computeSize());
                this.f379424x.writeFields(fVar);
            }
            java.lang.String str7 = this.f379425y;
            if (str7 != null) {
                fVar.j(23, str7);
            }
            fVar.e(24, this.f379426z);
            fVar.a(25, this.A);
            java.lang.String str8 = this.B;
            if (str8 != null) {
                fVar.j(26, str8);
            }
            fVar.a(27, this.C);
            java.lang.String str9 = this.D;
            if (str9 != null) {
                fVar.j(28, str9);
            }
            java.lang.String str10 = this.E;
            if (str10 != null) {
                fVar.j(29, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str11 = this.f379407d;
            if (str11 != null) {
                i18 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f379408e;
            if (str12 != null) {
                i18 += b36.f.j(3, str12);
            }
            int d17 = i18 + b36.f.d(4, this.f379409f);
            java.lang.String str13 = this.f379410g;
            if (str13 != null) {
                d17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f379411h;
            if (str14 != null) {
                d17 += b36.f.j(6, str14);
            }
            int e17 = d17 + b36.f.e(7, this.f379412i);
            java.lang.String str15 = this.f379413m;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f379414n;
            if (str16 != null) {
                e17 += b36.f.j(9, str16);
            }
            r45.z55 z55Var2 = this.f379415o;
            if (z55Var2 != null) {
                e17 += b36.f.i(10, z55Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar3 = this.f379416p;
            if (gVar3 != null) {
                e17 += b36.f.b(11, gVar3);
            }
            int a17 = e17 + b36.f.a(12, this.f379417q) + b36.f.e(13, this.f379418r) + b36.f.h(14, this.f379419s);
            r45.ae aeVar2 = this.f379420t;
            if (aeVar2 != null) {
                a17 += b36.f.i(15, aeVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.f379421u;
            if (gVar4 != null) {
                a17 += b36.f.b(17, gVar4);
            }
            r45.ju3 ju3Var2 = this.f379422v;
            if (ju3Var2 != null) {
                a17 += b36.f.i(18, ju3Var2.computeSize());
            }
            int a18 = a17 + b36.f.a(19, this.f379423w);
            r45.xk6 xk6Var2 = this.f379424x;
            if (xk6Var2 != null) {
                a18 += b36.f.i(22, xk6Var2.computeSize());
            }
            java.lang.String str17 = this.f379425y;
            if (str17 != null) {
                a18 += b36.f.j(23, str17);
            }
            int e18 = a18 + b36.f.e(24, this.f379426z) + b36.f.a(25, this.A);
            java.lang.String str18 = this.B;
            if (str18 != null) {
                e18 += b36.f.j(26, str18);
            }
            int a19 = e18 + b36.f.a(27, this.C);
            java.lang.String str19 = this.D;
            if (str19 != null) {
                a19 += b36.f.j(28, str19);
            }
            java.lang.String str20 = this.E;
            return str20 != null ? a19 + b36.f.j(29, str20) : a19;
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
        r45.lf3 lf3Var = (r45.lf3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
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
                    lf3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                lf3Var.f379407d = aVar2.k(intValue);
                return 0;
            case 3:
                lf3Var.f379408e = aVar2.k(intValue);
                return 0;
            case 4:
                lf3Var.f379409f = aVar2.f(intValue);
                return 0;
            case 5:
                lf3Var.f379410g = aVar2.k(intValue);
                return 0;
            case 6:
                lf3Var.f379411h = aVar2.k(intValue);
                return 0;
            case 7:
                lf3Var.f379412i = aVar2.g(intValue);
                return 0;
            case 8:
                lf3Var.f379413m = aVar2.k(intValue);
                return 0;
            case 9:
                lf3Var.f379414n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.z55 z55Var3 = new r45.z55();
                    if (bArr2 != null && bArr2.length > 0) {
                        z55Var3.parseFrom(bArr2);
                    }
                    lf3Var.f379415o = z55Var3;
                }
                return 0;
            case 11:
                lf3Var.f379416p = aVar2.d(intValue);
                return 0;
            case 12:
                lf3Var.f379417q = aVar2.c(intValue);
                return 0;
            case 13:
                lf3Var.f379418r = aVar2.g(intValue);
                return 0;
            case 14:
                lf3Var.f379419s = aVar2.i(intValue);
                return 0;
            case 15:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ae aeVar3 = new r45.ae();
                    if (bArr3 != null && bArr3.length > 0) {
                        aeVar3.parseFrom(bArr3);
                    }
                    lf3Var.f379420t = aeVar3;
                }
                return 0;
            case 16:
            case 20:
            case 21:
            default:
                return -1;
            case 17:
                lf3Var.f379421u = aVar2.d(intValue);
                return 0;
            case 18:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.ju3 ju3Var3 = new r45.ju3();
                    if (bArr4 != null && bArr4.length > 0) {
                        ju3Var3.parseFrom(bArr4);
                    }
                    lf3Var.f379422v = ju3Var3;
                }
                return 0;
            case 19:
                lf3Var.f379423w = aVar2.c(intValue);
                return 0;
            case 22:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.xk6 xk6Var3 = new r45.xk6();
                    if (bArr5 != null && bArr5.length > 0) {
                        xk6Var3.parseFrom(bArr5);
                    }
                    lf3Var.f379424x = xk6Var3;
                }
                return 0;
            case 23:
                lf3Var.f379425y = aVar2.k(intValue);
                return 0;
            case 24:
                lf3Var.f379426z = aVar2.g(intValue);
                return 0;
            case 25:
                lf3Var.A = aVar2.c(intValue);
                return 0;
            case 26:
                lf3Var.B = aVar2.k(intValue);
                return 0;
            case 27:
                lf3Var.C = aVar2.c(intValue);
                return 0;
            case 28:
                lf3Var.D = aVar2.k(intValue);
                return 0;
            case 29:
                lf3Var.E = aVar2.k(intValue);
                return 0;
        }
    }
}
