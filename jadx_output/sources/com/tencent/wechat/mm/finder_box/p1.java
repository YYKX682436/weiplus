package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class p1 extends com.tencent.mm.protobuf.f {

    /* renamed from: J, reason: collision with root package name */
    public static final com.tencent.wechat.mm.finder_box.p1 f219710J = new com.tencent.wechat.mm.finder_box.p1();
    public java.lang.String A;
    public com.tencent.wechat.mm.finder_box.m4 B;
    public int C;
    public com.tencent.wechat.mm.finder_box.o1 D;
    public com.tencent.wechat.mm.finder_box.o1 E;
    public com.tencent.wechat.mm.finder_box.o1 F;
    public boolean G;
    public int H;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.finder_box.i f219711d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.f0 f219712e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.n0 f219713f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.w0 f219714g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.p0 f219715h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.w0 f219716i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.y1 f219717m;

    /* renamed from: n, reason: collision with root package name */
    public int f219718n;

    /* renamed from: p, reason: collision with root package name */
    public int f219720p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.p3 f219721q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f219722r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.d2 f219723s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.f2 f219724t;

    /* renamed from: u, reason: collision with root package name */
    public int f219725u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f219727w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.r3 f219728x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.f1 f219729y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.m1 f219730z;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f219719o = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f219726v = new java.util.LinkedList();
    public final boolean[] I = new boolean[40];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.p1)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.p1 p1Var = (com.tencent.wechat.mm.finder_box.p1) fVar;
        return n51.f.a(this.f219711d, p1Var.f219711d) && n51.f.a(this.f219712e, p1Var.f219712e) && n51.f.a(this.f219713f, p1Var.f219713f) && n51.f.a(this.f219714g, p1Var.f219714g) && n51.f.a(this.f219715h, p1Var.f219715h) && n51.f.a(this.f219716i, p1Var.f219716i) && n51.f.a(this.f219717m, p1Var.f219717m) && n51.f.a(java.lang.Integer.valueOf(this.f219718n), java.lang.Integer.valueOf(p1Var.f219718n)) && n51.f.a(this.f219719o, p1Var.f219719o) && n51.f.a(java.lang.Integer.valueOf(this.f219720p), java.lang.Integer.valueOf(p1Var.f219720p)) && n51.f.a(this.f219721q, p1Var.f219721q) && n51.f.a(this.f219722r, p1Var.f219722r) && n51.f.a(this.f219723s, p1Var.f219723s) && n51.f.a(this.f219724t, p1Var.f219724t) && n51.f.a(java.lang.Integer.valueOf(this.f219725u), java.lang.Integer.valueOf(p1Var.f219725u)) && n51.f.a(this.f219726v, p1Var.f219726v) && n51.f.a(java.lang.Boolean.valueOf(this.f219727w), java.lang.Boolean.valueOf(p1Var.f219727w)) && n51.f.a(this.f219728x, p1Var.f219728x) && n51.f.a(this.f219729y, p1Var.f219729y) && n51.f.a(this.f219730z, p1Var.f219730z) && n51.f.a(this.A, p1Var.A) && n51.f.a(this.B, p1Var.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(p1Var.C)) && n51.f.a(this.D, p1Var.D) && n51.f.a(this.E, p1Var.E) && n51.f.a(this.F, p1Var.F) && n51.f.a(java.lang.Boolean.valueOf(this.G), java.lang.Boolean.valueOf(p1Var.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(p1Var.H));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.p1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.I;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.finder_box.i iVar = this.f219711d;
            if (iVar != null && zArr[1]) {
                fVar.i(1, iVar.computeSize());
                this.f219711d.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.f0 f0Var = this.f219712e;
            if (f0Var != null && zArr[2]) {
                fVar.i(2, f0Var.computeSize());
                this.f219712e.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.n0 n0Var = this.f219713f;
            if (n0Var != null && zArr[3]) {
                fVar.i(3, n0Var.computeSize());
                this.f219713f.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.w0 w0Var = this.f219714g;
            if (w0Var != null && zArr[4]) {
                fVar.i(4, w0Var.computeSize());
                this.f219714g.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.p0 p0Var = this.f219715h;
            if (p0Var != null && zArr[5]) {
                fVar.i(5, p0Var.computeSize());
                this.f219715h.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.w0 w0Var2 = this.f219716i;
            if (w0Var2 != null && zArr[6]) {
                fVar.i(6, w0Var2.computeSize());
                this.f219716i.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.y1 y1Var = this.f219717m;
            if (y1Var != null && zArr[7]) {
                fVar.i(7, y1Var.computeSize());
                this.f219717m.writeFields(fVar);
            }
            if (zArr[8]) {
                fVar.e(8, this.f219718n);
            }
            fVar.g(9, 8, this.f219719o);
            if (zArr[10]) {
                fVar.e(10, this.f219720p);
            }
            com.tencent.wechat.mm.finder_box.p3 p3Var = this.f219721q;
            if (p3Var != null && zArr[11]) {
                fVar.i(11, p3Var.computeSize());
                this.f219721q.writeFields(fVar);
            }
            java.lang.String str = this.f219722r;
            if (str != null && zArr[12]) {
                fVar.j(12, str);
            }
            com.tencent.wechat.mm.finder_box.d2 d2Var = this.f219723s;
            if (d2Var != null && zArr[13]) {
                fVar.i(13, d2Var.computeSize());
                this.f219723s.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.f2 f2Var = this.f219724t;
            if (f2Var != null && zArr[14]) {
                fVar.i(14, f2Var.computeSize());
                this.f219724t.writeFields(fVar);
            }
            if (zArr[17]) {
                fVar.e(17, this.f219725u);
            }
            fVar.g(20, 8, this.f219726v);
            if (zArr[21]) {
                fVar.a(21, this.f219727w);
            }
            com.tencent.wechat.mm.finder_box.r3 r3Var = this.f219728x;
            if (r3Var != null && zArr[22]) {
                fVar.i(22, r3Var.computeSize());
                this.f219728x.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.f1 f1Var = this.f219729y;
            if (f1Var != null && zArr[23]) {
                fVar.i(23, f1Var.computeSize());
                this.f219729y.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.m1 m1Var = this.f219730z;
            if (m1Var != null && zArr[24]) {
                fVar.i(24, m1Var.computeSize());
                this.f219730z.writeFields(fVar);
            }
            java.lang.String str2 = this.A;
            if (str2 != null && zArr[25]) {
                fVar.j(25, str2);
            }
            com.tencent.wechat.mm.finder_box.m4 m4Var = this.B;
            if (m4Var != null && zArr[26]) {
                fVar.i(26, m4Var.computeSize());
                this.B.writeFields(fVar);
            }
            if (zArr[27]) {
                fVar.e(27, this.C);
            }
            com.tencent.wechat.mm.finder_box.o1 o1Var = this.D;
            if (o1Var != null && zArr[31]) {
                fVar.i(31, o1Var.computeSize());
                this.D.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.o1 o1Var2 = this.E;
            if (o1Var2 != null && zArr[32]) {
                fVar.i(32, o1Var2.computeSize());
                this.E.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.o1 o1Var3 = this.F;
            if (o1Var3 != null && zArr[33]) {
                fVar.i(33, o1Var3.computeSize());
                this.F.writeFields(fVar);
            }
            if (zArr[38]) {
                fVar.a(38, this.G);
            }
            if (zArr[39]) {
                fVar.e(39, this.H);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.finder_box.i iVar2 = this.f219711d;
            if (iVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, iVar2.computeSize()) + 0;
            }
            com.tencent.wechat.mm.finder_box.f0 f0Var2 = this.f219712e;
            if (f0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, f0Var2.computeSize());
            }
            com.tencent.wechat.mm.finder_box.n0 n0Var2 = this.f219713f;
            if (n0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, n0Var2.computeSize());
            }
            com.tencent.wechat.mm.finder_box.w0 w0Var3 = this.f219714g;
            if (w0Var3 != null && zArr[4]) {
                i18 += b36.f.i(4, w0Var3.computeSize());
            }
            com.tencent.wechat.mm.finder_box.p0 p0Var2 = this.f219715h;
            if (p0Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, p0Var2.computeSize());
            }
            com.tencent.wechat.mm.finder_box.w0 w0Var4 = this.f219716i;
            if (w0Var4 != null && zArr[6]) {
                i18 += b36.f.i(6, w0Var4.computeSize());
            }
            com.tencent.wechat.mm.finder_box.y1 y1Var2 = this.f219717m;
            if (y1Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, y1Var2.computeSize());
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f219718n);
            }
            int g17 = i18 + b36.f.g(9, 8, this.f219719o);
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f219720p);
            }
            com.tencent.wechat.mm.finder_box.p3 p3Var2 = this.f219721q;
            if (p3Var2 != null && zArr[11]) {
                g17 += b36.f.i(11, p3Var2.computeSize());
            }
            java.lang.String str3 = this.f219722r;
            if (str3 != null && zArr[12]) {
                g17 += b36.f.j(12, str3);
            }
            com.tencent.wechat.mm.finder_box.d2 d2Var2 = this.f219723s;
            if (d2Var2 != null && zArr[13]) {
                g17 += b36.f.i(13, d2Var2.computeSize());
            }
            com.tencent.wechat.mm.finder_box.f2 f2Var2 = this.f219724t;
            if (f2Var2 != null && zArr[14]) {
                g17 += b36.f.i(14, f2Var2.computeSize());
            }
            if (zArr[17]) {
                g17 += b36.f.e(17, this.f219725u);
            }
            int g18 = g17 + b36.f.g(20, 8, this.f219726v);
            if (zArr[21]) {
                g18 += b36.f.a(21, this.f219727w);
            }
            com.tencent.wechat.mm.finder_box.r3 r3Var2 = this.f219728x;
            if (r3Var2 != null && zArr[22]) {
                g18 += b36.f.i(22, r3Var2.computeSize());
            }
            com.tencent.wechat.mm.finder_box.f1 f1Var2 = this.f219729y;
            if (f1Var2 != null && zArr[23]) {
                g18 += b36.f.i(23, f1Var2.computeSize());
            }
            com.tencent.wechat.mm.finder_box.m1 m1Var2 = this.f219730z;
            if (m1Var2 != null && zArr[24]) {
                g18 += b36.f.i(24, m1Var2.computeSize());
            }
            java.lang.String str4 = this.A;
            if (str4 != null && zArr[25]) {
                g18 += b36.f.j(25, str4);
            }
            com.tencent.wechat.mm.finder_box.m4 m4Var2 = this.B;
            if (m4Var2 != null && zArr[26]) {
                g18 += b36.f.i(26, m4Var2.computeSize());
            }
            if (zArr[27]) {
                g18 += b36.f.e(27, this.C);
            }
            com.tencent.wechat.mm.finder_box.o1 o1Var4 = this.D;
            if (o1Var4 != null && zArr[31]) {
                g18 += b36.f.i(31, o1Var4.computeSize());
            }
            com.tencent.wechat.mm.finder_box.o1 o1Var5 = this.E;
            if (o1Var5 != null && zArr[32]) {
                g18 += b36.f.i(32, o1Var5.computeSize());
            }
            com.tencent.wechat.mm.finder_box.o1 o1Var6 = this.F;
            if (o1Var6 != null && zArr[33]) {
                g18 += b36.f.i(33, o1Var6.computeSize());
            }
            if (zArr[38]) {
                g18 += b36.f.a(38, this.G);
            }
            return zArr[39] ? g18 + b36.f.e(39, this.H) : g18;
        }
        if (i17 == 2) {
            this.f219719o.clear();
            this.f219726v.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 17) {
            this.f219725u = aVar2.g(intValue);
            zArr[17] = true;
            return 0;
        }
        if (intValue == 38) {
            this.G = aVar2.c(intValue);
            zArr[38] = true;
            return 0;
        }
        if (intValue == 39) {
            this.H = aVar2.g(intValue);
            zArr[39] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.iam.finder_box.i iVar3 = new com.tencent.wechat.iam.finder_box.i();
                    if (bArr != null && bArr.length > 0) {
                        iVar3.parseFrom(bArr);
                    }
                    this.f219711d = iVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.finder_box.f0 f0Var3 = new com.tencent.wechat.mm.finder_box.f0();
                    if (bArr2 != null && bArr2.length > 0) {
                        f0Var3.parseFrom(bArr2);
                    }
                    this.f219712e = f0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.wechat.mm.finder_box.n0 n0Var3 = new com.tencent.wechat.mm.finder_box.n0();
                    if (bArr3 != null && bArr3.length > 0) {
                        n0Var3.parseFrom(bArr3);
                    }
                    this.f219713f = n0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.wechat.mm.finder_box.w0 w0Var5 = new com.tencent.wechat.mm.finder_box.w0();
                    if (bArr4 != null && bArr4.length > 0) {
                        w0Var5.parseFrom(bArr4);
                    }
                    this.f219714g = w0Var5;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.wechat.mm.finder_box.p0 p0Var3 = new com.tencent.wechat.mm.finder_box.p0();
                    if (bArr5 != null && bArr5.length > 0) {
                        p0Var3.parseFrom(bArr5);
                    }
                    this.f219715h = p0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.wechat.mm.finder_box.w0 w0Var6 = new com.tencent.wechat.mm.finder_box.w0();
                    if (bArr6 != null && bArr6.length > 0) {
                        w0Var6.parseFrom(bArr6);
                    }
                    this.f219716i = w0Var6;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.tencent.wechat.mm.finder_box.y1 y1Var3 = new com.tencent.wechat.mm.finder_box.y1();
                    if (bArr7 != null && bArr7.length > 0) {
                        y1Var3.parseFrom(bArr7);
                    }
                    this.f219717m = y1Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f219718n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    com.tencent.wechat.mm.finder_box.n1 n1Var = new com.tencent.wechat.mm.finder_box.n1();
                    if (bArr8 != null && bArr8.length > 0) {
                        n1Var.parseFrom(bArr8);
                    }
                    this.f219719o.add(n1Var);
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f219720p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    com.tencent.wechat.mm.finder_box.p3 p3Var3 = new com.tencent.wechat.mm.finder_box.p3();
                    if (bArr9 != null && bArr9.length > 0) {
                        p3Var3.parseFrom(bArr9);
                    }
                    this.f219721q = p3Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f219722r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    com.tencent.wechat.mm.finder_box.d2 d2Var3 = new com.tencent.wechat.mm.finder_box.d2();
                    if (bArr10 != null && bArr10.length > 0) {
                        d2Var3.parseFrom(bArr10);
                    }
                    this.f219723s = d2Var3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    com.tencent.wechat.mm.finder_box.f2 f2Var3 = new com.tencent.wechat.mm.finder_box.f2();
                    if (bArr11 != null && bArr11.length > 0) {
                        f2Var3.parseFrom(bArr11);
                    }
                    this.f219724t = f2Var3;
                }
                zArr[14] = true;
                return 0;
            default:
                switch (intValue) {
                    case 20:
                        java.util.LinkedList j49 = aVar2.j(intValue);
                        int size12 = j49.size();
                        for (int i58 = 0; i58 < size12; i58++) {
                            byte[] bArr12 = (byte[]) j49.get(i58);
                            com.tencent.wechat.mm.finder_box.l1 l1Var = new com.tencent.wechat.mm.finder_box.l1();
                            if (bArr12 != null && bArr12.length > 0) {
                                l1Var.parseFrom(bArr12);
                            }
                            this.f219726v.add(l1Var);
                        }
                        zArr[20] = true;
                        return 0;
                    case 21:
                        this.f219727w = aVar2.c(intValue);
                        zArr[21] = true;
                        return 0;
                    case 22:
                        java.util.LinkedList j57 = aVar2.j(intValue);
                        int size13 = j57.size();
                        for (int i59 = 0; i59 < size13; i59++) {
                            byte[] bArr13 = (byte[]) j57.get(i59);
                            com.tencent.wechat.mm.finder_box.r3 r3Var3 = new com.tencent.wechat.mm.finder_box.r3();
                            if (bArr13 != null && bArr13.length > 0) {
                                r3Var3.parseFrom(bArr13);
                            }
                            this.f219728x = r3Var3;
                        }
                        zArr[22] = true;
                        return 0;
                    case 23:
                        java.util.LinkedList j58 = aVar2.j(intValue);
                        int size14 = j58.size();
                        for (int i66 = 0; i66 < size14; i66++) {
                            byte[] bArr14 = (byte[]) j58.get(i66);
                            com.tencent.wechat.mm.finder_box.f1 f1Var3 = new com.tencent.wechat.mm.finder_box.f1();
                            if (bArr14 != null && bArr14.length > 0) {
                                f1Var3.parseFrom(bArr14);
                            }
                            this.f219729y = f1Var3;
                        }
                        zArr[23] = true;
                        return 0;
                    case 24:
                        java.util.LinkedList j59 = aVar2.j(intValue);
                        int size15 = j59.size();
                        for (int i67 = 0; i67 < size15; i67++) {
                            byte[] bArr15 = (byte[]) j59.get(i67);
                            com.tencent.wechat.mm.finder_box.m1 m1Var3 = new com.tencent.wechat.mm.finder_box.m1();
                            if (bArr15 != null && bArr15.length > 0) {
                                m1Var3.parseFrom(bArr15);
                            }
                            this.f219730z = m1Var3;
                        }
                        zArr[24] = true;
                        return 0;
                    case 25:
                        this.A = aVar2.k(intValue);
                        zArr[25] = true;
                        return 0;
                    case 26:
                        java.util.LinkedList j66 = aVar2.j(intValue);
                        int size16 = j66.size();
                        for (int i68 = 0; i68 < size16; i68++) {
                            byte[] bArr16 = (byte[]) j66.get(i68);
                            com.tencent.wechat.mm.finder_box.m4 m4Var3 = new com.tencent.wechat.mm.finder_box.m4();
                            if (bArr16 != null && bArr16.length > 0) {
                                m4Var3.parseFrom(bArr16);
                            }
                            this.B = m4Var3;
                        }
                        zArr[26] = true;
                        return 0;
                    case 27:
                        this.C = aVar2.g(intValue);
                        zArr[27] = true;
                        return 0;
                    default:
                        switch (intValue) {
                            case 31:
                                java.util.LinkedList j67 = aVar2.j(intValue);
                                int size17 = j67.size();
                                for (int i69 = 0; i69 < size17; i69++) {
                                    byte[] bArr17 = (byte[]) j67.get(i69);
                                    com.tencent.wechat.mm.finder_box.o1 o1Var7 = new com.tencent.wechat.mm.finder_box.o1();
                                    if (bArr17 != null && bArr17.length > 0) {
                                        o1Var7.parseFrom(bArr17);
                                    }
                                    this.D = o1Var7;
                                }
                                zArr[31] = true;
                                return 0;
                            case 32:
                                java.util.LinkedList j68 = aVar2.j(intValue);
                                int size18 = j68.size();
                                for (int i76 = 0; i76 < size18; i76++) {
                                    byte[] bArr18 = (byte[]) j68.get(i76);
                                    com.tencent.wechat.mm.finder_box.o1 o1Var8 = new com.tencent.wechat.mm.finder_box.o1();
                                    if (bArr18 != null && bArr18.length > 0) {
                                        o1Var8.parseFrom(bArr18);
                                    }
                                    this.E = o1Var8;
                                }
                                zArr[32] = true;
                                return 0;
                            case 33:
                                java.util.LinkedList j69 = aVar2.j(intValue);
                                int size19 = j69.size();
                                for (int i77 = 0; i77 < size19; i77++) {
                                    byte[] bArr19 = (byte[]) j69.get(i77);
                                    com.tencent.wechat.mm.finder_box.o1 o1Var9 = new com.tencent.wechat.mm.finder_box.o1();
                                    if (bArr19 != null && bArr19.length > 0) {
                                        o1Var9.parseFrom(bArr19);
                                    }
                                    this.F = o1Var9;
                                }
                                zArr[33] = true;
                                return 0;
                            default:
                                return -1;
                        }
                }
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.p1) super.parseFrom(bArr);
    }
}
