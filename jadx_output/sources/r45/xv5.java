package r45;

/* loaded from: classes15.dex */
public class xv5 extends r45.js5 {
    public com.tencent.mm.protobuf.g A;
    public boolean B;
    public com.tencent.mm.protobuf.g C;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390514e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390515f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390516g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f390517h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f390518i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f390519m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f390521o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f390522p;

    /* renamed from: q, reason: collision with root package name */
    public int f390523q;

    /* renamed from: r, reason: collision with root package name */
    public int f390524r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f390525s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f390526t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f390527u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f390528v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390529w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390530x;

    /* renamed from: y, reason: collision with root package name */
    public r45.qx4 f390531y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f390532z;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f390513d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f390520n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xv5)) {
            return false;
        }
        r45.xv5 xv5Var = (r45.xv5) fVar;
        return n51.f.a(this.BaseResponse, xv5Var.BaseResponse) && n51.f.a(this.f390513d, xv5Var.f390513d) && n51.f.a(this.f390514e, xv5Var.f390514e) && n51.f.a(this.f390515f, xv5Var.f390515f) && n51.f.a(this.f390516g, xv5Var.f390516g) && n51.f.a(java.lang.Boolean.valueOf(this.f390517h), java.lang.Boolean.valueOf(xv5Var.f390517h)) && n51.f.a(java.lang.Boolean.valueOf(this.f390518i), java.lang.Boolean.valueOf(xv5Var.f390518i)) && n51.f.a(java.lang.Boolean.valueOf(this.f390519m), java.lang.Boolean.valueOf(xv5Var.f390519m)) && n51.f.a(this.f390520n, xv5Var.f390520n) && n51.f.a(java.lang.Boolean.valueOf(this.f390521o), java.lang.Boolean.valueOf(xv5Var.f390521o)) && n51.f.a(java.lang.Boolean.valueOf(this.f390522p), java.lang.Boolean.valueOf(xv5Var.f390522p)) && n51.f.a(java.lang.Integer.valueOf(this.f390523q), java.lang.Integer.valueOf(xv5Var.f390523q)) && n51.f.a(java.lang.Integer.valueOf(this.f390524r), java.lang.Integer.valueOf(xv5Var.f390524r)) && n51.f.a(this.f390525s, xv5Var.f390525s) && n51.f.a(this.f390526t, xv5Var.f390526t) && n51.f.a(this.f390527u, xv5Var.f390527u) && n51.f.a(this.f390528v, xv5Var.f390528v) && n51.f.a(this.f390529w, xv5Var.f390529w) && n51.f.a(this.f390530x, xv5Var.f390530x) && n51.f.a(this.f390531y, xv5Var.f390531y) && n51.f.a(java.lang.Boolean.valueOf(this.f390532z), java.lang.Boolean.valueOf(xv5Var.f390532z)) && n51.f.a(this.A, xv5Var.A) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(xv5Var.B)) && n51.f.a(this.C, xv5Var.C);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(3, 8, this.f390513d);
            java.lang.String str = this.f390514e;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f390515f;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f390516g;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.a(8, this.f390517h);
            fVar.a(9, this.f390518i);
            fVar.a(10, this.f390519m);
            fVar.g(11, 8, this.f390520n);
            fVar.a(12, this.f390521o);
            fVar.a(13, this.f390522p);
            fVar.e(14, this.f390523q);
            fVar.e(15, this.f390524r);
            java.lang.String str4 = this.f390525s;
            if (str4 != null) {
                fVar.j(16, str4);
            }
            java.lang.String str5 = this.f390526t;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            java.lang.String str6 = this.f390527u;
            if (str6 != null) {
                fVar.j(20, str6);
            }
            java.lang.String str7 = this.f390528v;
            if (str7 != null) {
                fVar.j(21, str7);
            }
            com.tencent.mm.protobuf.g gVar = this.f390529w;
            if (gVar != null) {
                fVar.b(22, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f390530x;
            if (gVar2 != null) {
                fVar.b(24, gVar2);
            }
            r45.qx4 qx4Var = this.f390531y;
            if (qx4Var != null) {
                fVar.i(25, qx4Var.computeSize());
                this.f390531y.writeFields(fVar);
            }
            fVar.a(26, this.f390532z);
            com.tencent.mm.protobuf.g gVar3 = this.A;
            if (gVar3 != null) {
                fVar.b(27, gVar3);
            }
            fVar.a(28, this.B);
            com.tencent.mm.protobuf.g gVar4 = this.C;
            if (gVar4 != null) {
                fVar.b(29, gVar4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.g(3, 8, this.f390513d);
            java.lang.String str8 = this.f390514e;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f390515f;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f390516g;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            int a17 = i18 + b36.f.a(8, this.f390517h) + b36.f.a(9, this.f390518i) + b36.f.a(10, this.f390519m) + b36.f.g(11, 8, this.f390520n) + b36.f.a(12, this.f390521o) + b36.f.a(13, this.f390522p) + b36.f.e(14, this.f390523q) + b36.f.e(15, this.f390524r);
            java.lang.String str11 = this.f390525s;
            if (str11 != null) {
                a17 += b36.f.j(16, str11);
            }
            java.lang.String str12 = this.f390526t;
            if (str12 != null) {
                a17 += b36.f.j(17, str12);
            }
            java.lang.String str13 = this.f390527u;
            if (str13 != null) {
                a17 += b36.f.j(20, str13);
            }
            java.lang.String str14 = this.f390528v;
            if (str14 != null) {
                a17 += b36.f.j(21, str14);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f390529w;
            if (gVar5 != null) {
                a17 += b36.f.b(22, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f390530x;
            if (gVar6 != null) {
                a17 += b36.f.b(24, gVar6);
            }
            r45.qx4 qx4Var2 = this.f390531y;
            if (qx4Var2 != null) {
                a17 += b36.f.i(25, qx4Var2.computeSize());
            }
            int a18 = a17 + b36.f.a(26, this.f390532z);
            com.tencent.mm.protobuf.g gVar7 = this.A;
            if (gVar7 != null) {
                a18 += b36.f.b(27, gVar7);
            }
            int a19 = a18 + b36.f.a(28, this.B);
            com.tencent.mm.protobuf.g gVar8 = this.C;
            return gVar8 != null ? a19 + b36.f.b(29, gVar8) : a19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f390513d.clear();
            this.f390520n.clear();
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
        r45.xv5 xv5Var = (r45.xv5) objArr[1];
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
                    xv5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
            case 7:
            case 18:
            case 19:
            case 23:
            default:
                return -1;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.px4 px4Var = new r45.px4();
                    if (bArr3 != null && bArr3.length > 0) {
                        px4Var.parseFrom(bArr3);
                    }
                    xv5Var.f390513d.add(px4Var);
                }
                return 0;
            case 4:
                xv5Var.f390514e = aVar2.k(intValue);
                return 0;
            case 5:
                xv5Var.f390515f = aVar2.k(intValue);
                return 0;
            case 6:
                xv5Var.f390516g = aVar2.k(intValue);
                return 0;
            case 8:
                xv5Var.f390517h = aVar2.c(intValue);
                return 0;
            case 9:
                xv5Var.f390518i = aVar2.c(intValue);
                return 0;
            case 10:
                xv5Var.f390519m = aVar2.c(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.mx4 mx4Var = new r45.mx4();
                    if (bArr4 != null && bArr4.length > 0) {
                        mx4Var.parseFrom(bArr4);
                    }
                    xv5Var.f390520n.add(mx4Var);
                }
                return 0;
            case 12:
                xv5Var.f390521o = aVar2.c(intValue);
                return 0;
            case 13:
                xv5Var.f390522p = aVar2.c(intValue);
                return 0;
            case 14:
                xv5Var.f390523q = aVar2.g(intValue);
                return 0;
            case 15:
                xv5Var.f390524r = aVar2.g(intValue);
                return 0;
            case 16:
                xv5Var.f390525s = aVar2.k(intValue);
                return 0;
            case 17:
                xv5Var.f390526t = aVar2.k(intValue);
                return 0;
            case 20:
                xv5Var.f390527u = aVar2.k(intValue);
                return 0;
            case 21:
                xv5Var.f390528v = aVar2.k(intValue);
                return 0;
            case 22:
                xv5Var.f390529w = aVar2.d(intValue);
                return 0;
            case 24:
                xv5Var.f390530x = aVar2.d(intValue);
                return 0;
            case 25:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.qx4 qx4Var3 = new r45.qx4();
                    if (bArr5 != null && bArr5.length > 0) {
                        qx4Var3.parseFrom(bArr5);
                    }
                    xv5Var.f390531y = qx4Var3;
                }
                return 0;
            case 26:
                xv5Var.f390532z = aVar2.c(intValue);
                return 0;
            case 27:
                xv5Var.A = aVar2.d(intValue);
                return 0;
            case 28:
                xv5Var.B = aVar2.c(intValue);
                return 0;
            case 29:
                xv5Var.C = aVar2.d(intValue);
                return 0;
        }
    }
}
