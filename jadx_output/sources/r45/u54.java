package r45;

/* loaded from: classes7.dex */
public class u54 extends r45.mr5 {
    public r45.r54 A;
    public boolean B;
    public boolean C;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387055d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ac7 f387056e;

    /* renamed from: f, reason: collision with root package name */
    public int f387057f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ne7 f387058g;

    /* renamed from: h, reason: collision with root package name */
    public r45.fd7 f387059h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ag7 f387060i;

    /* renamed from: m, reason: collision with root package name */
    public r45.de7 f387061m;

    /* renamed from: n, reason: collision with root package name */
    public r45.oe7 f387062n;

    /* renamed from: o, reason: collision with root package name */
    public int f387063o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f387064p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f387065q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f387066r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f387067s;

    /* renamed from: t, reason: collision with root package name */
    public r45.qe7 f387068t;

    /* renamed from: u, reason: collision with root package name */
    public r45.zt4 f387069u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f387070v;

    /* renamed from: w, reason: collision with root package name */
    public r45.y50 f387071w;

    /* renamed from: x, reason: collision with root package name */
    public r45.he7 f387072x;

    /* renamed from: y, reason: collision with root package name */
    public int f387073y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f387074z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u54)) {
            return false;
        }
        r45.u54 u54Var = (r45.u54) fVar;
        return n51.f.a(this.BaseRequest, u54Var.BaseRequest) && n51.f.a(this.f387055d, u54Var.f387055d) && n51.f.a(this.f387056e, u54Var.f387056e) && n51.f.a(java.lang.Integer.valueOf(this.f387057f), java.lang.Integer.valueOf(u54Var.f387057f)) && n51.f.a(this.f387058g, u54Var.f387058g) && n51.f.a(this.f387059h, u54Var.f387059h) && n51.f.a(this.f387060i, u54Var.f387060i) && n51.f.a(this.f387061m, u54Var.f387061m) && n51.f.a(this.f387062n, u54Var.f387062n) && n51.f.a(java.lang.Integer.valueOf(this.f387063o), java.lang.Integer.valueOf(u54Var.f387063o)) && n51.f.a(this.f387064p, u54Var.f387064p) && n51.f.a(this.f387065q, u54Var.f387065q) && n51.f.a(java.lang.Boolean.valueOf(this.f387066r), java.lang.Boolean.valueOf(u54Var.f387066r)) && n51.f.a(java.lang.Boolean.valueOf(this.f387067s), java.lang.Boolean.valueOf(u54Var.f387067s)) && n51.f.a(this.f387068t, u54Var.f387068t) && n51.f.a(this.f387069u, u54Var.f387069u) && n51.f.a(this.f387070v, u54Var.f387070v) && n51.f.a(this.f387071w, u54Var.f387071w) && n51.f.a(this.f387072x, u54Var.f387072x) && n51.f.a(java.lang.Integer.valueOf(this.f387073y), java.lang.Integer.valueOf(u54Var.f387073y)) && n51.f.a(this.f387074z, u54Var.f387074z) && n51.f.a(this.A, u54Var.A) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(u54Var.B)) && n51.f.a(java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(u54Var.C));
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
            java.lang.String str = this.f387055d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.ac7 ac7Var = this.f387056e;
            if (ac7Var != null) {
                fVar.i(3, ac7Var.computeSize());
                this.f387056e.writeFields(fVar);
            }
            fVar.e(4, this.f387057f);
            r45.ne7 ne7Var = this.f387058g;
            if (ne7Var != null) {
                fVar.i(5, ne7Var.computeSize());
                this.f387058g.writeFields(fVar);
            }
            r45.fd7 fd7Var = this.f387059h;
            if (fd7Var != null) {
                fVar.i(6, fd7Var.computeSize());
                this.f387059h.writeFields(fVar);
            }
            r45.ag7 ag7Var = this.f387060i;
            if (ag7Var != null) {
                fVar.i(7, ag7Var.computeSize());
                this.f387060i.writeFields(fVar);
            }
            r45.de7 de7Var = this.f387061m;
            if (de7Var != null) {
                fVar.i(8, de7Var.computeSize());
                this.f387061m.writeFields(fVar);
            }
            r45.oe7 oe7Var = this.f387062n;
            if (oe7Var != null) {
                fVar.i(9, oe7Var.computeSize());
                this.f387062n.writeFields(fVar);
            }
            fVar.e(10, this.f387063o);
            java.lang.String str2 = this.f387064p;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            java.lang.String str3 = this.f387065q;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            fVar.a(13, this.f387066r);
            fVar.a(14, this.f387067s);
            r45.qe7 qe7Var = this.f387068t;
            if (qe7Var != null) {
                fVar.i(15, qe7Var.computeSize());
                this.f387068t.writeFields(fVar);
            }
            r45.zt4 zt4Var = this.f387069u;
            if (zt4Var != null) {
                fVar.i(16, zt4Var.computeSize());
                this.f387069u.writeFields(fVar);
            }
            java.lang.String str4 = this.f387070v;
            if (str4 != null) {
                fVar.j(17, str4);
            }
            r45.y50 y50Var = this.f387071w;
            if (y50Var != null) {
                fVar.i(18, y50Var.computeSize());
                this.f387071w.writeFields(fVar);
            }
            r45.he7 he7Var = this.f387072x;
            if (he7Var != null) {
                fVar.i(19, he7Var.computeSize());
                this.f387072x.writeFields(fVar);
            }
            fVar.e(20, this.f387073y);
            java.lang.String str5 = this.f387074z;
            if (str5 != null) {
                fVar.j(22, str5);
            }
            r45.r54 r54Var = this.A;
            if (r54Var != null) {
                fVar.i(23, r54Var.computeSize());
                this.A.writeFields(fVar);
            }
            fVar.a(24, this.B);
            fVar.a(25, this.C);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str6 = this.f387055d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            r45.ac7 ac7Var2 = this.f387056e;
            if (ac7Var2 != null) {
                i18 += b36.f.i(3, ac7Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f387057f);
            r45.ne7 ne7Var2 = this.f387058g;
            if (ne7Var2 != null) {
                e17 += b36.f.i(5, ne7Var2.computeSize());
            }
            r45.fd7 fd7Var2 = this.f387059h;
            if (fd7Var2 != null) {
                e17 += b36.f.i(6, fd7Var2.computeSize());
            }
            r45.ag7 ag7Var2 = this.f387060i;
            if (ag7Var2 != null) {
                e17 += b36.f.i(7, ag7Var2.computeSize());
            }
            r45.de7 de7Var2 = this.f387061m;
            if (de7Var2 != null) {
                e17 += b36.f.i(8, de7Var2.computeSize());
            }
            r45.oe7 oe7Var2 = this.f387062n;
            if (oe7Var2 != null) {
                e17 += b36.f.i(9, oe7Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(10, this.f387063o);
            java.lang.String str7 = this.f387064p;
            if (str7 != null) {
                e18 += b36.f.j(11, str7);
            }
            java.lang.String str8 = this.f387065q;
            if (str8 != null) {
                e18 += b36.f.j(12, str8);
            }
            int a17 = e18 + b36.f.a(13, this.f387066r) + b36.f.a(14, this.f387067s);
            r45.qe7 qe7Var2 = this.f387068t;
            if (qe7Var2 != null) {
                a17 += b36.f.i(15, qe7Var2.computeSize());
            }
            r45.zt4 zt4Var2 = this.f387069u;
            if (zt4Var2 != null) {
                a17 += b36.f.i(16, zt4Var2.computeSize());
            }
            java.lang.String str9 = this.f387070v;
            if (str9 != null) {
                a17 += b36.f.j(17, str9);
            }
            r45.y50 y50Var2 = this.f387071w;
            if (y50Var2 != null) {
                a17 += b36.f.i(18, y50Var2.computeSize());
            }
            r45.he7 he7Var2 = this.f387072x;
            if (he7Var2 != null) {
                a17 += b36.f.i(19, he7Var2.computeSize());
            }
            int e19 = a17 + b36.f.e(20, this.f387073y);
            java.lang.String str10 = this.f387074z;
            if (str10 != null) {
                e19 += b36.f.j(22, str10);
            }
            r45.r54 r54Var2 = this.A;
            if (r54Var2 != null) {
                e19 += b36.f.i(23, r54Var2.computeSize());
            }
            return e19 + b36.f.a(24, this.B) + b36.f.a(25, this.C);
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
        r45.u54 u54Var = (r45.u54) objArr[1];
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
                    u54Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                u54Var.f387055d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ac7 ac7Var3 = new r45.ac7();
                    if (bArr2 != null && bArr2.length > 0) {
                        ac7Var3.parseFrom(bArr2);
                    }
                    u54Var.f387056e = ac7Var3;
                }
                return 0;
            case 4:
                u54Var.f387057f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ne7 ne7Var3 = new r45.ne7();
                    if (bArr3 != null && bArr3.length > 0) {
                        ne7Var3.parseFrom(bArr3);
                    }
                    u54Var.f387058g = ne7Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.fd7 fd7Var3 = new r45.fd7();
                    if (bArr4 != null && bArr4.length > 0) {
                        fd7Var3.parseFrom(bArr4);
                    }
                    u54Var.f387059h = fd7Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.ag7 ag7Var3 = new r45.ag7();
                    if (bArr5 != null && bArr5.length > 0) {
                        ag7Var3.parseFrom(bArr5);
                    }
                    u54Var.f387060i = ag7Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.de7 de7Var3 = new r45.de7();
                    if (bArr6 != null && bArr6.length > 0) {
                        de7Var3.parseFrom(bArr6);
                    }
                    u54Var.f387061m = de7Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.oe7 oe7Var3 = new r45.oe7();
                    if (bArr7 != null && bArr7.length > 0) {
                        oe7Var3.parseFrom(bArr7);
                    }
                    u54Var.f387062n = oe7Var3;
                }
                return 0;
            case 10:
                u54Var.f387063o = aVar2.g(intValue);
                return 0;
            case 11:
                u54Var.f387064p = aVar2.k(intValue);
                return 0;
            case 12:
                u54Var.f387065q = aVar2.k(intValue);
                return 0;
            case 13:
                u54Var.f387066r = aVar2.c(intValue);
                return 0;
            case 14:
                u54Var.f387067s = aVar2.c(intValue);
                return 0;
            case 15:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.qe7 qe7Var3 = new r45.qe7();
                    if (bArr8 != null && bArr8.length > 0) {
                        qe7Var3.parseFrom(bArr8);
                    }
                    u54Var.f387068t = qe7Var3;
                }
                return 0;
            case 16:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    r45.zt4 zt4Var3 = new r45.zt4();
                    if (bArr9 != null && bArr9.length > 0) {
                        zt4Var3.parseFrom(bArr9);
                    }
                    u54Var.f387069u = zt4Var3;
                }
                return 0;
            case 17:
                u54Var.f387070v = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    r45.y50 y50Var3 = new r45.y50();
                    if (bArr10 != null && bArr10.length > 0) {
                        y50Var3.parseFrom(bArr10);
                    }
                    u54Var.f387071w = y50Var3;
                }
                return 0;
            case 19:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    r45.he7 he7Var3 = new r45.he7();
                    if (bArr11 != null && bArr11.length > 0) {
                        he7Var3.parseFrom(bArr11);
                    }
                    u54Var.f387072x = he7Var3;
                }
                return 0;
            case 20:
                u54Var.f387073y = aVar2.g(intValue);
                return 0;
            case 21:
            default:
                return -1;
            case 22:
                u54Var.f387074z = aVar2.k(intValue);
                return 0;
            case 23:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    r45.r54 r54Var3 = new r45.r54();
                    if (bArr12 != null && bArr12.length > 0) {
                        r54Var3.parseFrom(bArr12);
                    }
                    u54Var.A = r54Var3;
                }
                return 0;
            case 24:
                u54Var.B = aVar2.c(intValue);
                return 0;
            case 25:
                u54Var.C = aVar2.c(intValue);
                return 0;
        }
    }
}
