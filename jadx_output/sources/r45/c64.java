package r45;

/* loaded from: classes4.dex */
public class c64 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371310d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371311e;

    /* renamed from: f, reason: collision with root package name */
    public float f371312f;

    /* renamed from: g, reason: collision with root package name */
    public int f371313g;

    /* renamed from: i, reason: collision with root package name */
    public int f371315i;

    /* renamed from: n, reason: collision with root package name */
    public float f371317n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f371318o;

    /* renamed from: p, reason: collision with root package name */
    public int f371319p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f371320q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f371321r;

    /* renamed from: s, reason: collision with root package name */
    public r45.cu5 f371322s;

    /* renamed from: t, reason: collision with root package name */
    public int f371323t;

    /* renamed from: u, reason: collision with root package name */
    public int f371324u;

    /* renamed from: v, reason: collision with root package name */
    public float f371325v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f371326w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f371327x;

    /* renamed from: y, reason: collision with root package name */
    public double f371328y;

    /* renamed from: z, reason: collision with root package name */
    public double f371329z;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f371314h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f371316m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c64)) {
            return false;
        }
        r45.c64 c64Var = (r45.c64) fVar;
        return n51.f.a(this.f371310d, c64Var.f371310d) && n51.f.a(this.f371311e, c64Var.f371311e) && n51.f.a(java.lang.Float.valueOf(this.f371312f), java.lang.Float.valueOf(c64Var.f371312f)) && n51.f.a(java.lang.Integer.valueOf(this.f371313g), java.lang.Integer.valueOf(c64Var.f371313g)) && n51.f.a(this.f371314h, c64Var.f371314h) && n51.f.a(java.lang.Integer.valueOf(this.f371315i), java.lang.Integer.valueOf(c64Var.f371315i)) && n51.f.a(this.f371316m, c64Var.f371316m) && n51.f.a(java.lang.Float.valueOf(this.f371317n), java.lang.Float.valueOf(c64Var.f371317n)) && n51.f.a(this.f371318o, c64Var.f371318o) && n51.f.a(java.lang.Integer.valueOf(this.f371319p), java.lang.Integer.valueOf(c64Var.f371319p)) && n51.f.a(this.f371320q, c64Var.f371320q) && n51.f.a(this.f371321r, c64Var.f371321r) && n51.f.a(this.f371322s, c64Var.f371322s) && n51.f.a(java.lang.Integer.valueOf(this.f371323t), java.lang.Integer.valueOf(c64Var.f371323t)) && n51.f.a(java.lang.Integer.valueOf(this.f371324u), java.lang.Integer.valueOf(c64Var.f371324u)) && n51.f.a(java.lang.Float.valueOf(this.f371325v), java.lang.Float.valueOf(c64Var.f371325v)) && n51.f.a(this.f371326w, c64Var.f371326w) && n51.f.a(this.f371327x, c64Var.f371327x) && n51.f.a(java.lang.Double.valueOf(this.f371328y), java.lang.Double.valueOf(c64Var.f371328y)) && n51.f.a(java.lang.Double.valueOf(this.f371329z), java.lang.Double.valueOf(c64Var.f371329z)) && n51.f.a(this.A, c64Var.A);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371310d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371311e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.d(3, this.f371312f);
            fVar.e(4, this.f371313g);
            fVar.k(5, 2, this.f371314h);
            fVar.e(6, this.f371315i);
            fVar.g(7, 8, this.f371316m);
            fVar.d(8, this.f371317n);
            java.lang.String str3 = this.f371318o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f371319p);
            r45.cu5 cu5Var = this.f371320q;
            if (cu5Var != null) {
                fVar.i(11, cu5Var.computeSize());
                this.f371320q.writeFields(fVar);
            }
            java.lang.String str4 = this.f371321r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            r45.cu5 cu5Var2 = this.f371322s;
            if (cu5Var2 != null) {
                fVar.i(13, cu5Var2.computeSize());
                this.f371322s.writeFields(fVar);
            }
            fVar.e(14, this.f371323t);
            fVar.e(15, this.f371324u);
            fVar.d(16, this.f371325v);
            java.lang.String str5 = this.f371326w;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            java.lang.String str6 = this.f371327x;
            if (str6 != null) {
                fVar.j(18, str6);
            }
            fVar.c(19, this.f371328y);
            fVar.c(20, this.f371329z);
            java.lang.String str7 = this.A;
            if (str7 == null) {
                return 0;
            }
            fVar.j(21, str7);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f371310d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f371311e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int d17 = j17 + b36.f.d(3, this.f371312f) + b36.f.e(4, this.f371313g) + b36.f.k(5, 2, this.f371314h) + b36.f.e(6, this.f371315i) + b36.f.g(7, 8, this.f371316m) + b36.f.d(8, this.f371317n);
            java.lang.String str10 = this.f371318o;
            if (str10 != null) {
                d17 += b36.f.j(9, str10);
            }
            int e17 = d17 + b36.f.e(10, this.f371319p);
            r45.cu5 cu5Var3 = this.f371320q;
            if (cu5Var3 != null) {
                e17 += b36.f.i(11, cu5Var3.computeSize());
            }
            java.lang.String str11 = this.f371321r;
            if (str11 != null) {
                e17 += b36.f.j(12, str11);
            }
            r45.cu5 cu5Var4 = this.f371322s;
            if (cu5Var4 != null) {
                e17 += b36.f.i(13, cu5Var4.computeSize());
            }
            int e18 = e17 + b36.f.e(14, this.f371323t) + b36.f.e(15, this.f371324u) + b36.f.d(16, this.f371325v);
            java.lang.String str12 = this.f371326w;
            if (str12 != null) {
                e18 += b36.f.j(17, str12);
            }
            java.lang.String str13 = this.f371327x;
            if (str13 != null) {
                e18 += b36.f.j(18, str13);
            }
            int c17 = e18 + b36.f.c(19, this.f371328y) + b36.f.c(20, this.f371329z);
            java.lang.String str14 = this.A;
            return str14 != null ? c17 + b36.f.j(21, str14) : c17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f371314h.clear();
            this.f371316m.clear();
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
        r45.c64 c64Var = (r45.c64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c64Var.f371310d = aVar2.k(intValue);
                return 0;
            case 2:
                c64Var.f371311e = aVar2.k(intValue);
                return 0;
            case 3:
                c64Var.f371312f = aVar2.f(intValue);
                return 0;
            case 4:
                c64Var.f371313g = aVar2.g(intValue);
                return 0;
            case 5:
                byte[] bArr2 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr2, 0, bArr2.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f247596c < aVar3.f247595b) {
                    linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                c64Var.f371314h = linkedList;
                return 0;
            case 6:
                c64Var.f371315i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr3 = (byte[]) j18.get(i18);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    c64Var.f371316m.add(du5Var);
                }
                return 0;
            case 8:
                c64Var.f371317n = aVar2.f(intValue);
                return 0;
            case 9:
                c64Var.f371318o = aVar2.k(intValue);
                return 0;
            case 10:
                c64Var.f371319p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr4 = (byte[]) j19.get(i19);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var5.b(bArr4);
                    }
                    c64Var.f371320q = cu5Var5;
                }
                return 0;
            case 12:
                c64Var.f371321r = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr5 = (byte[]) j27.get(i27);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var6.b(bArr5);
                    }
                    c64Var.f371322s = cu5Var6;
                }
                return 0;
            case 14:
                c64Var.f371323t = aVar2.g(intValue);
                return 0;
            case 15:
                c64Var.f371324u = aVar2.g(intValue);
                return 0;
            case 16:
                c64Var.f371325v = aVar2.f(intValue);
                return 0;
            case 17:
                c64Var.f371326w = aVar2.k(intValue);
                return 0;
            case 18:
                c64Var.f371327x = aVar2.k(intValue);
                return 0;
            case 19:
                c64Var.f371328y = aVar2.e(intValue);
                return 0;
            case 20:
                c64Var.f371329z = aVar2.e(intValue);
                return 0;
            case 21:
                c64Var.A = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
