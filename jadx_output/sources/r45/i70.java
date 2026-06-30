package r45;

/* loaded from: classes10.dex */
public class i70 extends com.tencent.mm.protobuf.f {
    public r45.y25 A;
    public boolean B;
    public int C;
    public float D;
    public int E;
    public int F;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376775d;

    /* renamed from: e, reason: collision with root package name */
    public int f376776e;

    /* renamed from: f, reason: collision with root package name */
    public int f376777f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vl5 f376778g;

    /* renamed from: h, reason: collision with root package name */
    public float f376779h;

    /* renamed from: i, reason: collision with root package name */
    public int f376780i;

    /* renamed from: m, reason: collision with root package name */
    public int f376781m;

    /* renamed from: n, reason: collision with root package name */
    public int f376782n;

    /* renamed from: o, reason: collision with root package name */
    public int f376783o;

    /* renamed from: p, reason: collision with root package name */
    public int f376784p;

    /* renamed from: q, reason: collision with root package name */
    public int f376785q;

    /* renamed from: r, reason: collision with root package name */
    public int f376786r;

    /* renamed from: s, reason: collision with root package name */
    public int f376787s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f376788t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public int f376789u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f376790v;

    /* renamed from: w, reason: collision with root package name */
    public int f376791w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f376792x;

    /* renamed from: y, reason: collision with root package name */
    public r45.vl5 f376793y;

    /* renamed from: z, reason: collision with root package name */
    public r45.y25 f376794z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i70)) {
            return false;
        }
        r45.i70 i70Var = (r45.i70) fVar;
        return n51.f.a(this.f376775d, i70Var.f376775d) && n51.f.a(java.lang.Integer.valueOf(this.f376776e), java.lang.Integer.valueOf(i70Var.f376776e)) && n51.f.a(java.lang.Integer.valueOf(this.f376777f), java.lang.Integer.valueOf(i70Var.f376777f)) && n51.f.a(this.f376778g, i70Var.f376778g) && n51.f.a(java.lang.Float.valueOf(this.f376779h), java.lang.Float.valueOf(i70Var.f376779h)) && n51.f.a(java.lang.Integer.valueOf(this.f376780i), java.lang.Integer.valueOf(i70Var.f376780i)) && n51.f.a(java.lang.Integer.valueOf(this.f376781m), java.lang.Integer.valueOf(i70Var.f376781m)) && n51.f.a(java.lang.Integer.valueOf(this.f376782n), java.lang.Integer.valueOf(i70Var.f376782n)) && n51.f.a(java.lang.Integer.valueOf(this.f376783o), java.lang.Integer.valueOf(i70Var.f376783o)) && n51.f.a(java.lang.Integer.valueOf(this.f376784p), java.lang.Integer.valueOf(i70Var.f376784p)) && n51.f.a(java.lang.Integer.valueOf(this.f376785q), java.lang.Integer.valueOf(i70Var.f376785q)) && n51.f.a(java.lang.Integer.valueOf(this.f376786r), java.lang.Integer.valueOf(i70Var.f376786r)) && n51.f.a(java.lang.Integer.valueOf(this.f376787s), java.lang.Integer.valueOf(i70Var.f376787s)) && n51.f.a(this.f376788t, i70Var.f376788t) && n51.f.a(java.lang.Integer.valueOf(this.f376789u), java.lang.Integer.valueOf(i70Var.f376789u)) && n51.f.a(java.lang.Boolean.valueOf(this.f376790v), java.lang.Boolean.valueOf(i70Var.f376790v)) && n51.f.a(java.lang.Integer.valueOf(this.f376791w), java.lang.Integer.valueOf(i70Var.f376791w)) && n51.f.a(java.lang.Boolean.valueOf(this.f376792x), java.lang.Boolean.valueOf(i70Var.f376792x)) && n51.f.a(this.f376793y, i70Var.f376793y) && n51.f.a(this.f376794z, i70Var.f376794z) && n51.f.a(this.A, i70Var.A) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(i70Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(i70Var.C)) && n51.f.a(java.lang.Float.valueOf(this.D), java.lang.Float.valueOf(i70Var.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(i70Var.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(i70Var.F));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376788t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376775d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(4, this.f376776e);
            fVar.e(5, this.f376777f);
            r45.vl5 vl5Var = this.f376778g;
            if (vl5Var != null) {
                fVar.i(6, vl5Var.computeSize());
                this.f376778g.writeFields(fVar);
            }
            fVar.d(7, this.f376779h);
            fVar.e(8, this.f376780i);
            fVar.e(9, this.f376781m);
            fVar.e(10, this.f376782n);
            fVar.e(11, this.f376783o);
            fVar.e(12, this.f376784p);
            fVar.e(13, this.f376785q);
            fVar.e(14, this.f376786r);
            fVar.e(15, this.f376787s);
            fVar.g(16, 2, linkedList);
            fVar.e(17, this.f376789u);
            fVar.a(18, this.f376790v);
            fVar.e(19, this.f376791w);
            fVar.a(20, this.f376792x);
            r45.vl5 vl5Var2 = this.f376793y;
            if (vl5Var2 != null) {
                fVar.i(21, vl5Var2.computeSize());
                this.f376793y.writeFields(fVar);
            }
            r45.y25 y25Var = this.f376794z;
            if (y25Var != null) {
                fVar.i(22, y25Var.computeSize());
                this.f376794z.writeFields(fVar);
            }
            r45.y25 y25Var2 = this.A;
            if (y25Var2 != null) {
                fVar.i(23, y25Var2.computeSize());
                this.A.writeFields(fVar);
            }
            fVar.a(24, this.B);
            fVar.e(25, this.C);
            fVar.d(26, this.D);
            fVar.e(27, this.E);
            fVar.e(28, this.F);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f376775d;
            int j17 = (str2 != null ? b36.f.j(1, str2) + 0 : 0) + b36.f.e(4, this.f376776e) + b36.f.e(5, this.f376777f);
            r45.vl5 vl5Var3 = this.f376778g;
            if (vl5Var3 != null) {
                j17 += b36.f.i(6, vl5Var3.computeSize());
            }
            int d17 = j17 + b36.f.d(7, this.f376779h) + b36.f.e(8, this.f376780i) + b36.f.e(9, this.f376781m) + b36.f.e(10, this.f376782n) + b36.f.e(11, this.f376783o) + b36.f.e(12, this.f376784p) + b36.f.e(13, this.f376785q) + b36.f.e(14, this.f376786r) + b36.f.e(15, this.f376787s) + b36.f.g(16, 2, linkedList) + b36.f.e(17, this.f376789u) + b36.f.a(18, this.f376790v) + b36.f.e(19, this.f376791w) + b36.f.a(20, this.f376792x);
            r45.vl5 vl5Var4 = this.f376793y;
            if (vl5Var4 != null) {
                d17 += b36.f.i(21, vl5Var4.computeSize());
            }
            r45.y25 y25Var3 = this.f376794z;
            if (y25Var3 != null) {
                d17 += b36.f.i(22, y25Var3.computeSize());
            }
            r45.y25 y25Var4 = this.A;
            if (y25Var4 != null) {
                d17 += b36.f.i(23, y25Var4.computeSize());
            }
            return d17 + b36.f.a(24, this.B) + b36.f.e(25, this.C) + b36.f.d(26, this.D) + b36.f.e(27, this.E) + b36.f.e(28, this.F);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.i70 i70Var = (r45.i70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i70Var.f376775d = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 4:
                i70Var.f376776e = aVar2.g(intValue);
                return 0;
            case 5:
                i70Var.f376777f = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.vl5 vl5Var5 = new r45.vl5();
                    if (bArr2 != null && bArr2.length > 0) {
                        vl5Var5.parseFrom(bArr2);
                    }
                    i70Var.f376778g = vl5Var5;
                }
                return 0;
            case 7:
                i70Var.f376779h = aVar2.f(intValue);
                return 0;
            case 8:
                i70Var.f376780i = aVar2.g(intValue);
                return 0;
            case 9:
                i70Var.f376781m = aVar2.g(intValue);
                return 0;
            case 10:
                i70Var.f376782n = aVar2.g(intValue);
                return 0;
            case 11:
                i70Var.f376783o = aVar2.g(intValue);
                return 0;
            case 12:
                i70Var.f376784p = aVar2.g(intValue);
                return 0;
            case 13:
                i70Var.f376785q = aVar2.g(intValue);
                return 0;
            case 14:
                i70Var.f376786r = aVar2.g(intValue);
                return 0;
            case 15:
                i70Var.f376787s = aVar2.g(intValue);
                return 0;
            case 16:
                i70Var.f376788t.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 17:
                i70Var.f376789u = aVar2.g(intValue);
                return 0;
            case 18:
                i70Var.f376790v = aVar2.c(intValue);
                return 0;
            case 19:
                i70Var.f376791w = aVar2.g(intValue);
                return 0;
            case 20:
                i70Var.f376792x = aVar2.c(intValue);
                return 0;
            case 21:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.vl5 vl5Var6 = new r45.vl5();
                    if (bArr3 != null && bArr3.length > 0) {
                        vl5Var6.parseFrom(bArr3);
                    }
                    i70Var.f376793y = vl5Var6;
                }
                return 0;
            case 22:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.y25 y25Var5 = new r45.y25();
                    if (bArr4 != null && bArr4.length > 0) {
                        y25Var5.parseFrom(bArr4);
                    }
                    i70Var.f376794z = y25Var5;
                }
                return 0;
            case 23:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.y25 y25Var6 = new r45.y25();
                    if (bArr5 != null && bArr5.length > 0) {
                        y25Var6.parseFrom(bArr5);
                    }
                    i70Var.A = y25Var6;
                }
                return 0;
            case 24:
                i70Var.B = aVar2.c(intValue);
                return 0;
            case 25:
                i70Var.C = aVar2.g(intValue);
                return 0;
            case 26:
                i70Var.D = aVar2.f(intValue);
                return 0;
            case 27:
                i70Var.E = aVar2.g(intValue);
                return 0;
            case 28:
                i70Var.F = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
