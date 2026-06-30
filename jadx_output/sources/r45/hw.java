package r45;

/* loaded from: classes15.dex */
public class hw extends r45.js5 {
    public boolean A;
    public r45.lt3 B;
    public r45.hk5 C;
    public java.lang.String D;

    /* renamed from: d, reason: collision with root package name */
    public int f376475d;

    /* renamed from: e, reason: collision with root package name */
    public r45.lj5 f376476e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376477f;

    /* renamed from: g, reason: collision with root package name */
    public int f376478g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376479h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f376480i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public r45.uk4 f376481m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f376482n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f376483o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f376484p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f376485q;

    /* renamed from: r, reason: collision with root package name */
    public r45.vf5 f376486r;

    /* renamed from: s, reason: collision with root package name */
    public r45.vf5 f376487s;

    /* renamed from: t, reason: collision with root package name */
    public int f376488t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376489u;

    /* renamed from: v, reason: collision with root package name */
    public int f376490v;

    /* renamed from: w, reason: collision with root package name */
    public r45.nn f376491w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f376492x;

    /* renamed from: y, reason: collision with root package name */
    public r45.gk5 f376493y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f376494z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hw)) {
            return false;
        }
        r45.hw hwVar = (r45.hw) fVar;
        return n51.f.a(this.BaseResponse, hwVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f376475d), java.lang.Integer.valueOf(hwVar.f376475d)) && n51.f.a(this.f376476e, hwVar.f376476e) && n51.f.a(this.f376477f, hwVar.f376477f) && n51.f.a(java.lang.Integer.valueOf(this.f376478g), java.lang.Integer.valueOf(hwVar.f376478g)) && n51.f.a(this.f376479h, hwVar.f376479h) && n51.f.a(this.f376480i, hwVar.f376480i) && n51.f.a(this.f376481m, hwVar.f376481m) && n51.f.a(this.f376482n, hwVar.f376482n) && n51.f.a(java.lang.Boolean.valueOf(this.f376483o), java.lang.Boolean.valueOf(hwVar.f376483o)) && n51.f.a(this.f376484p, hwVar.f376484p) && n51.f.a(this.f376485q, hwVar.f376485q) && n51.f.a(this.f376486r, hwVar.f376486r) && n51.f.a(this.f376487s, hwVar.f376487s) && n51.f.a(java.lang.Integer.valueOf(this.f376488t), java.lang.Integer.valueOf(hwVar.f376488t)) && n51.f.a(this.f376489u, hwVar.f376489u) && n51.f.a(java.lang.Integer.valueOf(this.f376490v), java.lang.Integer.valueOf(hwVar.f376490v)) && n51.f.a(this.f376491w, hwVar.f376491w) && n51.f.a(java.lang.Boolean.valueOf(this.f376492x), java.lang.Boolean.valueOf(hwVar.f376492x)) && n51.f.a(this.f376493y, hwVar.f376493y) && n51.f.a(java.lang.Boolean.valueOf(this.f376494z), java.lang.Boolean.valueOf(hwVar.f376494z)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(hwVar.A)) && n51.f.a(this.B, hwVar.B) && n51.f.a(this.C, hwVar.C) && n51.f.a(this.D, hwVar.D);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376480i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f376475d);
            r45.lj5 lj5Var = this.f376476e;
            if (lj5Var != null) {
                fVar.i(3, lj5Var.computeSize());
                this.f376476e.writeFields(fVar);
            }
            java.lang.String str = this.f376477f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f376478g);
            java.lang.String str2 = this.f376479h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList);
            r45.uk4 uk4Var = this.f376481m;
            if (uk4Var != null) {
                fVar.i(8, uk4Var.computeSize());
                this.f376481m.writeFields(fVar);
            }
            java.lang.String str3 = this.f376482n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.a(10, this.f376483o);
            java.lang.String str4 = this.f376484p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f376485q;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            r45.vf5 vf5Var = this.f376486r;
            if (vf5Var != null) {
                fVar.i(13, vf5Var.computeSize());
                this.f376486r.writeFields(fVar);
            }
            r45.vf5 vf5Var2 = this.f376487s;
            if (vf5Var2 != null) {
                fVar.i(14, vf5Var2.computeSize());
                this.f376487s.writeFields(fVar);
            }
            fVar.e(15, this.f376488t);
            com.tencent.mm.protobuf.g gVar = this.f376489u;
            if (gVar != null) {
                fVar.b(16, gVar);
            }
            fVar.e(17, this.f376490v);
            r45.nn nnVar = this.f376491w;
            if (nnVar != null) {
                fVar.i(18, nnVar.computeSize());
                this.f376491w.writeFields(fVar);
            }
            fVar.a(19, this.f376492x);
            r45.gk5 gk5Var = this.f376493y;
            if (gk5Var != null) {
                fVar.i(20, gk5Var.computeSize());
                this.f376493y.writeFields(fVar);
            }
            fVar.a(21, this.f376494z);
            fVar.a(22, this.A);
            r45.lt3 lt3Var = this.B;
            if (lt3Var != null) {
                fVar.i(23, lt3Var.computeSize());
                this.B.writeFields(fVar);
            }
            r45.hk5 hk5Var = this.C;
            if (hk5Var != null) {
                fVar.i(24, hk5Var.computeSize());
                this.C.writeFields(fVar);
            }
            java.lang.String str6 = this.D;
            if (str6 != null) {
                fVar.j(25, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f376475d);
            r45.lj5 lj5Var2 = this.f376476e;
            if (lj5Var2 != null) {
                i18 += b36.f.i(3, lj5Var2.computeSize());
            }
            java.lang.String str7 = this.f376477f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int e17 = i18 + b36.f.e(5, this.f376478g);
            java.lang.String str8 = this.f376479h;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            int g17 = e17 + b36.f.g(7, 8, linkedList);
            r45.uk4 uk4Var2 = this.f376481m;
            if (uk4Var2 != null) {
                g17 += b36.f.i(8, uk4Var2.computeSize());
            }
            java.lang.String str9 = this.f376482n;
            if (str9 != null) {
                g17 += b36.f.j(9, str9);
            }
            int a17 = g17 + b36.f.a(10, this.f376483o);
            java.lang.String str10 = this.f376484p;
            if (str10 != null) {
                a17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f376485q;
            if (str11 != null) {
                a17 += b36.f.j(12, str11);
            }
            r45.vf5 vf5Var3 = this.f376486r;
            if (vf5Var3 != null) {
                a17 += b36.f.i(13, vf5Var3.computeSize());
            }
            r45.vf5 vf5Var4 = this.f376487s;
            if (vf5Var4 != null) {
                a17 += b36.f.i(14, vf5Var4.computeSize());
            }
            int e18 = a17 + b36.f.e(15, this.f376488t);
            com.tencent.mm.protobuf.g gVar2 = this.f376489u;
            if (gVar2 != null) {
                e18 += b36.f.b(16, gVar2);
            }
            int e19 = e18 + b36.f.e(17, this.f376490v);
            r45.nn nnVar2 = this.f376491w;
            if (nnVar2 != null) {
                e19 += b36.f.i(18, nnVar2.computeSize());
            }
            int a18 = e19 + b36.f.a(19, this.f376492x);
            r45.gk5 gk5Var2 = this.f376493y;
            if (gk5Var2 != null) {
                a18 += b36.f.i(20, gk5Var2.computeSize());
            }
            int a19 = a18 + b36.f.a(21, this.f376494z) + b36.f.a(22, this.A);
            r45.lt3 lt3Var2 = this.B;
            if (lt3Var2 != null) {
                a19 += b36.f.i(23, lt3Var2.computeSize());
            }
            r45.hk5 hk5Var2 = this.C;
            if (hk5Var2 != null) {
                a19 += b36.f.i(24, hk5Var2.computeSize());
            }
            java.lang.String str12 = this.D;
            return str12 != null ? a19 + b36.f.j(25, str12) : a19;
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
        r45.hw hwVar = (r45.hw) objArr[1];
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
                    hwVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                hwVar.f376475d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.lj5 lj5Var3 = new r45.lj5();
                    if (bArr3 != null && bArr3.length > 0) {
                        lj5Var3.parseFrom(bArr3);
                    }
                    hwVar.f376476e = lj5Var3;
                }
                return 0;
            case 4:
                hwVar.f376477f = aVar2.k(intValue);
                return 0;
            case 5:
                hwVar.f376478g = aVar2.g(intValue);
                return 0;
            case 6:
                hwVar.f376479h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.uk4 uk4Var3 = new r45.uk4();
                    if (bArr4 != null && bArr4.length > 0) {
                        uk4Var3.parseFrom(bArr4);
                    }
                    hwVar.f376480i.add(uk4Var3);
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.uk4 uk4Var4 = new r45.uk4();
                    if (bArr5 != null && bArr5.length > 0) {
                        uk4Var4.parseFrom(bArr5);
                    }
                    hwVar.f376481m = uk4Var4;
                }
                return 0;
            case 9:
                hwVar.f376482n = aVar2.k(intValue);
                return 0;
            case 10:
                hwVar.f376483o = aVar2.c(intValue);
                return 0;
            case 11:
                hwVar.f376484p = aVar2.k(intValue);
                return 0;
            case 12:
                hwVar.f376485q = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.vf5 vf5Var5 = new r45.vf5();
                    if (bArr6 != null && bArr6.length > 0) {
                        vf5Var5.parseFrom(bArr6);
                    }
                    hwVar.f376486r = vf5Var5;
                }
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.vf5 vf5Var6 = new r45.vf5();
                    if (bArr7 != null && bArr7.length > 0) {
                        vf5Var6.parseFrom(bArr7);
                    }
                    hwVar.f376487s = vf5Var6;
                }
                return 0;
            case 15:
                hwVar.f376488t = aVar2.g(intValue);
                return 0;
            case 16:
                hwVar.f376489u = aVar2.d(intValue);
                return 0;
            case 17:
                hwVar.f376490v = aVar2.g(intValue);
                return 0;
            case 18:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.nn nnVar3 = new r45.nn();
                    if (bArr8 != null && bArr8.length > 0) {
                        nnVar3.parseFrom(bArr8);
                    }
                    hwVar.f376491w = nnVar3;
                }
                return 0;
            case 19:
                hwVar.f376492x = aVar2.c(intValue);
                return 0;
            case 20:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.gk5 gk5Var3 = new r45.gk5();
                    if (bArr9 != null && bArr9.length > 0) {
                        gk5Var3.parseFrom(bArr9);
                    }
                    hwVar.f376493y = gk5Var3;
                }
                return 0;
            case 21:
                hwVar.f376494z = aVar2.c(intValue);
                return 0;
            case 22:
                hwVar.A = aVar2.c(intValue);
                return 0;
            case 23:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.lt3 lt3Var3 = new r45.lt3();
                    if (bArr10 != null && bArr10.length > 0) {
                        lt3Var3.parseFrom(bArr10);
                    }
                    hwVar.B = lt3Var3;
                }
                return 0;
            case 24:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.hk5 hk5Var3 = new r45.hk5();
                    if (bArr11 != null && bArr11.length > 0) {
                        hk5Var3.parseFrom(bArr11);
                    }
                    hwVar.C = hk5Var3;
                }
                return 0;
            case 25:
                hwVar.D = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
