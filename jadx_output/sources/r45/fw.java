package r45;

/* loaded from: classes15.dex */
public class fw extends r45.js5 {
    public java.lang.String A;
    public r45.o90 B;
    public boolean C;
    public boolean D;
    public r45.lt3 E;
    public r45.fk5 F;
    public java.lang.String G;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374632d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374633e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374634f;

    /* renamed from: g, reason: collision with root package name */
    public r45.uk4 f374635g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374636h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f374637i;

    /* renamed from: n, reason: collision with root package name */
    public r45.vf5 f374639n;

    /* renamed from: o, reason: collision with root package name */
    public r45.vf5 f374640o;

    /* renamed from: p, reason: collision with root package name */
    public int f374641p;

    /* renamed from: q, reason: collision with root package name */
    public int f374642q;

    /* renamed from: r, reason: collision with root package name */
    public r45.na f374643r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374644s;

    /* renamed from: t, reason: collision with root package name */
    public int f374645t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f374646u;

    /* renamed from: v, reason: collision with root package name */
    public r45.gk5 f374647v;

    /* renamed from: w, reason: collision with root package name */
    public r45.o90 f374648w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f374649x;

    /* renamed from: y, reason: collision with root package name */
    public long f374650y;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f374638m = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f374651z = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fw)) {
            return false;
        }
        r45.fw fwVar = (r45.fw) fVar;
        return n51.f.a(this.BaseResponse, fwVar.BaseResponse) && n51.f.a(this.f374632d, fwVar.f374632d) && n51.f.a(this.f374633e, fwVar.f374633e) && n51.f.a(this.f374634f, fwVar.f374634f) && n51.f.a(this.f374635g, fwVar.f374635g) && n51.f.a(this.f374636h, fwVar.f374636h) && n51.f.a(java.lang.Boolean.valueOf(this.f374637i), java.lang.Boolean.valueOf(fwVar.f374637i)) && n51.f.a(this.f374638m, fwVar.f374638m) && n51.f.a(this.f374639n, fwVar.f374639n) && n51.f.a(this.f374640o, fwVar.f374640o) && n51.f.a(java.lang.Integer.valueOf(this.f374641p), java.lang.Integer.valueOf(fwVar.f374641p)) && n51.f.a(java.lang.Integer.valueOf(this.f374642q), java.lang.Integer.valueOf(fwVar.f374642q)) && n51.f.a(this.f374643r, fwVar.f374643r) && n51.f.a(this.f374644s, fwVar.f374644s) && n51.f.a(java.lang.Integer.valueOf(this.f374645t), java.lang.Integer.valueOf(fwVar.f374645t)) && n51.f.a(java.lang.Boolean.valueOf(this.f374646u), java.lang.Boolean.valueOf(fwVar.f374646u)) && n51.f.a(this.f374647v, fwVar.f374647v) && n51.f.a(this.f374648w, fwVar.f374648w) && n51.f.a(java.lang.Boolean.valueOf(this.f374649x), java.lang.Boolean.valueOf(fwVar.f374649x)) && n51.f.a(java.lang.Long.valueOf(this.f374650y), java.lang.Long.valueOf(fwVar.f374650y)) && n51.f.a(this.f374651z, fwVar.f374651z) && n51.f.a(this.A, fwVar.A) && n51.f.a(this.B, fwVar.B) && n51.f.a(java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(fwVar.C)) && n51.f.a(java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(fwVar.D)) && n51.f.a(this.E, fwVar.E) && n51.f.a(this.F, fwVar.F) && n51.f.a(this.G, fwVar.G);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374651z;
        java.util.LinkedList linkedList2 = this.f374638m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f374632d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374633e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f374634f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.uk4 uk4Var = this.f374635g;
            if (uk4Var != null) {
                fVar.i(5, uk4Var.computeSize());
                this.f374635g.writeFields(fVar);
            }
            java.lang.String str4 = this.f374636h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.a(7, this.f374637i);
            fVar.g(8, 8, linkedList2);
            r45.vf5 vf5Var = this.f374639n;
            if (vf5Var != null) {
                fVar.i(9, vf5Var.computeSize());
                this.f374639n.writeFields(fVar);
            }
            r45.vf5 vf5Var2 = this.f374640o;
            if (vf5Var2 != null) {
                fVar.i(10, vf5Var2.computeSize());
                this.f374640o.writeFields(fVar);
            }
            fVar.e(11, this.f374641p);
            fVar.e(12, this.f374642q);
            r45.na naVar = this.f374643r;
            if (naVar != null) {
                fVar.i(13, naVar.computeSize());
                this.f374643r.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f374644s;
            if (gVar != null) {
                fVar.b(14, gVar);
            }
            fVar.e(15, this.f374645t);
            fVar.a(16, this.f374646u);
            r45.gk5 gk5Var = this.f374647v;
            if (gk5Var != null) {
                fVar.i(17, gk5Var.computeSize());
                this.f374647v.writeFields(fVar);
            }
            r45.o90 o90Var = this.f374648w;
            if (o90Var != null) {
                fVar.i(18, o90Var.computeSize());
                this.f374648w.writeFields(fVar);
            }
            fVar.a(19, this.f374649x);
            fVar.h(20, this.f374650y);
            fVar.g(21, 8, linkedList);
            java.lang.String str5 = this.A;
            if (str5 != null) {
                fVar.j(22, str5);
            }
            r45.o90 o90Var2 = this.B;
            if (o90Var2 != null) {
                fVar.i(23, o90Var2.computeSize());
                this.B.writeFields(fVar);
            }
            fVar.a(24, this.C);
            fVar.a(25, this.D);
            r45.lt3 lt3Var = this.E;
            if (lt3Var != null) {
                fVar.i(26, lt3Var.computeSize());
                this.E.writeFields(fVar);
            }
            r45.fk5 fk5Var = this.F;
            if (fk5Var != null) {
                fVar.i(27, fk5Var.computeSize());
                this.F.writeFields(fVar);
            }
            java.lang.String str6 = this.G;
            if (str6 != null) {
                fVar.j(28, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            java.lang.String str7 = this.f374632d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f374633e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f374634f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            r45.uk4 uk4Var2 = this.f374635g;
            if (uk4Var2 != null) {
                i18 += b36.f.i(5, uk4Var2.computeSize());
            }
            java.lang.String str10 = this.f374636h;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            int a17 = i18 + b36.f.a(7, this.f374637i) + b36.f.g(8, 8, linkedList2);
            r45.vf5 vf5Var3 = this.f374639n;
            if (vf5Var3 != null) {
                a17 += b36.f.i(9, vf5Var3.computeSize());
            }
            r45.vf5 vf5Var4 = this.f374640o;
            if (vf5Var4 != null) {
                a17 += b36.f.i(10, vf5Var4.computeSize());
            }
            int e17 = a17 + b36.f.e(11, this.f374641p) + b36.f.e(12, this.f374642q);
            r45.na naVar2 = this.f374643r;
            if (naVar2 != null) {
                e17 += b36.f.i(13, naVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f374644s;
            if (gVar2 != null) {
                e17 += b36.f.b(14, gVar2);
            }
            int e18 = e17 + b36.f.e(15, this.f374645t) + b36.f.a(16, this.f374646u);
            r45.gk5 gk5Var2 = this.f374647v;
            if (gk5Var2 != null) {
                e18 += b36.f.i(17, gk5Var2.computeSize());
            }
            r45.o90 o90Var3 = this.f374648w;
            if (o90Var3 != null) {
                e18 += b36.f.i(18, o90Var3.computeSize());
            }
            int a18 = e18 + b36.f.a(19, this.f374649x) + b36.f.h(20, this.f374650y) + b36.f.g(21, 8, linkedList);
            java.lang.String str11 = this.A;
            if (str11 != null) {
                a18 += b36.f.j(22, str11);
            }
            r45.o90 o90Var4 = this.B;
            if (o90Var4 != null) {
                a18 += b36.f.i(23, o90Var4.computeSize());
            }
            int a19 = a18 + b36.f.a(24, this.C) + b36.f.a(25, this.D);
            r45.lt3 lt3Var2 = this.E;
            if (lt3Var2 != null) {
                a19 += b36.f.i(26, lt3Var2.computeSize());
            }
            r45.fk5 fk5Var2 = this.F;
            if (fk5Var2 != null) {
                a19 += b36.f.i(27, fk5Var2.computeSize());
            }
            java.lang.String str12 = this.G;
            return str12 != null ? a19 + b36.f.j(28, str12) : a19;
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
        r45.fw fwVar = (r45.fw) objArr[1];
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
                    fwVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                fwVar.f374632d = aVar2.k(intValue);
                return 0;
            case 3:
                fwVar.f374633e = aVar2.k(intValue);
                return 0;
            case 4:
                fwVar.f374634f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.uk4 uk4Var3 = new r45.uk4();
                    if (bArr3 != null && bArr3.length > 0) {
                        uk4Var3.parseFrom(bArr3);
                    }
                    fwVar.f374635g = uk4Var3;
                }
                return 0;
            case 6:
                fwVar.f374636h = aVar2.k(intValue);
                return 0;
            case 7:
                fwVar.f374637i = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.uk4 uk4Var4 = new r45.uk4();
                    if (bArr4 != null && bArr4.length > 0) {
                        uk4Var4.parseFrom(bArr4);
                    }
                    fwVar.f374638m.add(uk4Var4);
                }
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.vf5 vf5Var5 = new r45.vf5();
                    if (bArr5 != null && bArr5.length > 0) {
                        vf5Var5.parseFrom(bArr5);
                    }
                    fwVar.f374639n = vf5Var5;
                }
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.vf5 vf5Var6 = new r45.vf5();
                    if (bArr6 != null && bArr6.length > 0) {
                        vf5Var6.parseFrom(bArr6);
                    }
                    fwVar.f374640o = vf5Var6;
                }
                return 0;
            case 11:
                fwVar.f374641p = aVar2.g(intValue);
                return 0;
            case 12:
                fwVar.f374642q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.na naVar3 = new r45.na();
                    if (bArr7 != null && bArr7.length > 0) {
                        naVar3.parseFrom(bArr7);
                    }
                    fwVar.f374643r = naVar3;
                }
                return 0;
            case 14:
                fwVar.f374644s = aVar2.d(intValue);
                return 0;
            case 15:
                fwVar.f374645t = aVar2.g(intValue);
                return 0;
            case 16:
                fwVar.f374646u = aVar2.c(intValue);
                return 0;
            case 17:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.gk5 gk5Var3 = new r45.gk5();
                    if (bArr8 != null && bArr8.length > 0) {
                        gk5Var3.parseFrom(bArr8);
                    }
                    fwVar.f374647v = gk5Var3;
                }
                return 0;
            case 18:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.o90 o90Var5 = new r45.o90();
                    if (bArr9 != null && bArr9.length > 0) {
                        o90Var5.parseFrom(bArr9);
                    }
                    fwVar.f374648w = o90Var5;
                }
                return 0;
            case 19:
                fwVar.f374649x = aVar2.c(intValue);
                return 0;
            case 20:
                fwVar.f374650y = aVar2.i(intValue);
                return 0;
            case 21:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.bj4 bj4Var = new r45.bj4();
                    if (bArr10 != null && bArr10.length > 0) {
                        bj4Var.parseFrom(bArr10);
                    }
                    fwVar.f374651z.add(bj4Var);
                }
                return 0;
            case 22:
                fwVar.A = aVar2.k(intValue);
                return 0;
            case 23:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.o90 o90Var6 = new r45.o90();
                    if (bArr11 != null && bArr11.length > 0) {
                        o90Var6.parseFrom(bArr11);
                    }
                    fwVar.B = o90Var6;
                }
                return 0;
            case 24:
                fwVar.C = aVar2.c(intValue);
                return 0;
            case 25:
                fwVar.D = aVar2.c(intValue);
                return 0;
            case 26:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.lt3 lt3Var3 = new r45.lt3();
                    if (bArr12 != null && bArr12.length > 0) {
                        lt3Var3.parseFrom(bArr12);
                    }
                    fwVar.E = lt3Var3;
                }
                return 0;
            case 27:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.fk5 fk5Var3 = new r45.fk5();
                    if (bArr13 != null && bArr13.length > 0) {
                        fk5Var3.parseFrom(bArr13);
                    }
                    fwVar.F = fk5Var3;
                }
                return 0;
            case 28:
                fwVar.G = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
