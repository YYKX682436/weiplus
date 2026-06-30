package m53;

/* loaded from: classes8.dex */
public class h extends com.tencent.mm.protobuf.f {
    public int A;
    public m53.e3 B;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323717d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323718e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323719f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323720g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f323721h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f323722i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f323723m;

    /* renamed from: n, reason: collision with root package name */
    public int f323724n;

    /* renamed from: o, reason: collision with root package name */
    public m53.b0 f323725o;

    /* renamed from: p, reason: collision with root package name */
    public int f323726p;

    /* renamed from: q, reason: collision with root package name */
    public int f323727q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f323728r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f323729s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f323731u;

    /* renamed from: v, reason: collision with root package name */
    public int f323732v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f323733w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f323734x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f323735y;

    /* renamed from: z, reason: collision with root package name */
    public m53.s3 f323736z;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f323730t = new java.util.LinkedList();
    public final java.util.LinkedList C = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.h)) {
            return false;
        }
        m53.h hVar = (m53.h) fVar;
        return n51.f.a(this.f323717d, hVar.f323717d) && n51.f.a(this.f323718e, hVar.f323718e) && n51.f.a(this.f323719f, hVar.f323719f) && n51.f.a(this.f323720g, hVar.f323720g) && n51.f.a(this.f323721h, hVar.f323721h) && n51.f.a(this.f323722i, hVar.f323722i) && n51.f.a(this.f323723m, hVar.f323723m) && n51.f.a(java.lang.Integer.valueOf(this.f323724n), java.lang.Integer.valueOf(hVar.f323724n)) && n51.f.a(this.f323725o, hVar.f323725o) && n51.f.a(java.lang.Integer.valueOf(this.f323726p), java.lang.Integer.valueOf(hVar.f323726p)) && n51.f.a(java.lang.Integer.valueOf(this.f323727q), java.lang.Integer.valueOf(hVar.f323727q)) && n51.f.a(this.f323728r, hVar.f323728r) && n51.f.a(java.lang.Boolean.valueOf(this.f323729s), java.lang.Boolean.valueOf(hVar.f323729s)) && n51.f.a(this.f323730t, hVar.f323730t) && n51.f.a(java.lang.Boolean.valueOf(this.f323731u), java.lang.Boolean.valueOf(hVar.f323731u)) && n51.f.a(java.lang.Integer.valueOf(this.f323732v), java.lang.Integer.valueOf(hVar.f323732v)) && n51.f.a(java.lang.Boolean.valueOf(this.f323733w), java.lang.Boolean.valueOf(hVar.f323733w)) && n51.f.a(java.lang.Boolean.valueOf(this.f323734x), java.lang.Boolean.valueOf(hVar.f323734x)) && n51.f.a(java.lang.Boolean.valueOf(this.f323735y), java.lang.Boolean.valueOf(hVar.f323735y)) && n51.f.a(this.f323736z, hVar.f323736z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(hVar.A)) && n51.f.a(this.B, hVar.B) && n51.f.a(this.C, hVar.C);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.C;
        java.util.LinkedList linkedList2 = this.f323730t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323717d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323718e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f323719f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f323720g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f323721h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f323722i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f323723m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.e(8, this.f323724n);
            m53.b0 b0Var = this.f323725o;
            if (b0Var != null) {
                fVar.i(9, b0Var.computeSize());
                this.f323725o.writeFields(fVar);
            }
            fVar.e(10, this.f323726p);
            fVar.e(11, this.f323727q);
            java.lang.String str8 = this.f323728r;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.a(13, this.f323729s);
            fVar.g(14, 1, linkedList2);
            fVar.a(15, this.f323731u);
            fVar.e(16, this.f323732v);
            fVar.a(17, this.f323733w);
            fVar.a(18, this.f323734x);
            fVar.a(19, this.f323735y);
            m53.s3 s3Var = this.f323736z;
            if (s3Var != null) {
                fVar.i(20, s3Var.computeSize());
                this.f323736z.writeFields(fVar);
            }
            fVar.e(21, this.A);
            m53.e3 e3Var = this.B;
            if (e3Var != null) {
                fVar.i(22, e3Var.computeSize());
                this.B.writeFields(fVar);
            }
            fVar.g(23, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f323717d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f323718e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f323719f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f323720g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f323721h;
            if (str13 != null) {
                j17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f323722i;
            if (str14 != null) {
                j17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f323723m;
            if (str15 != null) {
                j17 += b36.f.j(7, str15);
            }
            int e17 = j17 + b36.f.e(8, this.f323724n);
            m53.b0 b0Var2 = this.f323725o;
            if (b0Var2 != null) {
                e17 += b36.f.i(9, b0Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(10, this.f323726p) + b36.f.e(11, this.f323727q);
            java.lang.String str16 = this.f323728r;
            if (str16 != null) {
                e18 += b36.f.j(12, str16);
            }
            int a17 = e18 + b36.f.a(13, this.f323729s) + b36.f.g(14, 1, linkedList2) + b36.f.a(15, this.f323731u) + b36.f.e(16, this.f323732v) + b36.f.a(17, this.f323733w) + b36.f.a(18, this.f323734x) + b36.f.a(19, this.f323735y);
            m53.s3 s3Var2 = this.f323736z;
            if (s3Var2 != null) {
                a17 += b36.f.i(20, s3Var2.computeSize());
            }
            int e19 = a17 + b36.f.e(21, this.A);
            m53.e3 e3Var2 = this.B;
            if (e3Var2 != null) {
                e19 += b36.f.i(22, e3Var2.computeSize());
            }
            return e19 + b36.f.g(23, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        m53.h hVar = (m53.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hVar.f323717d = aVar2.k(intValue);
                return 0;
            case 2:
                hVar.f323718e = aVar2.k(intValue);
                return 0;
            case 3:
                hVar.f323719f = aVar2.k(intValue);
                return 0;
            case 4:
                hVar.f323720g = aVar2.k(intValue);
                return 0;
            case 5:
                hVar.f323721h = aVar2.k(intValue);
                return 0;
            case 6:
                hVar.f323722i = aVar2.k(intValue);
                return 0;
            case 7:
                hVar.f323723m = aVar2.k(intValue);
                return 0;
            case 8:
                hVar.f323724n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    m53.b0 b0Var3 = new m53.b0();
                    if (bArr2 != null && bArr2.length > 0) {
                        b0Var3.parseFrom(bArr2);
                    }
                    hVar.f323725o = b0Var3;
                }
                return 0;
            case 10:
                hVar.f323726p = aVar2.g(intValue);
                return 0;
            case 11:
                hVar.f323727q = aVar2.g(intValue);
                return 0;
            case 12:
                hVar.f323728r = aVar2.k(intValue);
                return 0;
            case 13:
                hVar.f323729s = aVar2.c(intValue);
                return 0;
            case 14:
                hVar.f323730t.add(aVar2.k(intValue));
                return 0;
            case 15:
                hVar.f323731u = aVar2.c(intValue);
                return 0;
            case 16:
                hVar.f323732v = aVar2.g(intValue);
                return 0;
            case 17:
                hVar.f323733w = aVar2.c(intValue);
                return 0;
            case 18:
                hVar.f323734x = aVar2.c(intValue);
                return 0;
            case 19:
                hVar.f323735y = aVar2.c(intValue);
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    m53.s3 s3Var3 = new m53.s3();
                    if (bArr3 != null && bArr3.length > 0) {
                        s3Var3.parseFrom(bArr3);
                    }
                    hVar.f323736z = s3Var3;
                }
                return 0;
            case 21:
                hVar.A = aVar2.g(intValue);
                return 0;
            case 22:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    m53.e3 e3Var3 = new m53.e3();
                    if (bArr4 != null && bArr4.length > 0) {
                        e3Var3.parseFrom(bArr4);
                    }
                    hVar.B = e3Var3;
                }
                return 0;
            case 23:
                hVar.C.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
