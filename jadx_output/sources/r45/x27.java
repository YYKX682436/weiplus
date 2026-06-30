package r45;

/* loaded from: classes14.dex */
public class x27 extends r45.js5 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public r45.cu5 f389705J;
    public long K;
    public r45.cu5 L;
    public java.lang.String M;

    /* renamed from: d, reason: collision with root package name */
    public int f389706d;

    /* renamed from: e, reason: collision with root package name */
    public int f389707e;

    /* renamed from: g, reason: collision with root package name */
    public long f389709g;

    /* renamed from: h, reason: collision with root package name */
    public int f389710h;

    /* renamed from: i, reason: collision with root package name */
    public r45.e37 f389711i;

    /* renamed from: m, reason: collision with root package name */
    public int f389712m;

    /* renamed from: o, reason: collision with root package name */
    public int f389714o;

    /* renamed from: p, reason: collision with root package name */
    public int f389715p;

    /* renamed from: q, reason: collision with root package name */
    public int f389716q;

    /* renamed from: r, reason: collision with root package name */
    public int f389717r;

    /* renamed from: s, reason: collision with root package name */
    public int f389718s;

    /* renamed from: t, reason: collision with root package name */
    public int f389719t;

    /* renamed from: u, reason: collision with root package name */
    public int f389720u;

    /* renamed from: v, reason: collision with root package name */
    public int f389721v;

    /* renamed from: w, reason: collision with root package name */
    public int f389722w;

    /* renamed from: x, reason: collision with root package name */
    public int f389723x;

    /* renamed from: y, reason: collision with root package name */
    public int f389724y;

    /* renamed from: z, reason: collision with root package name */
    public int f389725z;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f389708f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f389713n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x27)) {
            return false;
        }
        r45.x27 x27Var = (r45.x27) fVar;
        return n51.f.a(this.BaseResponse, x27Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f389706d), java.lang.Integer.valueOf(x27Var.f389706d)) && n51.f.a(java.lang.Integer.valueOf(this.f389707e), java.lang.Integer.valueOf(x27Var.f389707e)) && n51.f.a(this.f389708f, x27Var.f389708f) && n51.f.a(java.lang.Long.valueOf(this.f389709g), java.lang.Long.valueOf(x27Var.f389709g)) && n51.f.a(java.lang.Integer.valueOf(this.f389710h), java.lang.Integer.valueOf(x27Var.f389710h)) && n51.f.a(this.f389711i, x27Var.f389711i) && n51.f.a(java.lang.Integer.valueOf(this.f389712m), java.lang.Integer.valueOf(x27Var.f389712m)) && n51.f.a(this.f389713n, x27Var.f389713n) && n51.f.a(java.lang.Integer.valueOf(this.f389714o), java.lang.Integer.valueOf(x27Var.f389714o)) && n51.f.a(java.lang.Integer.valueOf(this.f389715p), java.lang.Integer.valueOf(x27Var.f389715p)) && n51.f.a(java.lang.Integer.valueOf(this.f389716q), java.lang.Integer.valueOf(x27Var.f389716q)) && n51.f.a(java.lang.Integer.valueOf(this.f389717r), java.lang.Integer.valueOf(x27Var.f389717r)) && n51.f.a(java.lang.Integer.valueOf(this.f389718s), java.lang.Integer.valueOf(x27Var.f389718s)) && n51.f.a(java.lang.Integer.valueOf(this.f389719t), java.lang.Integer.valueOf(x27Var.f389719t)) && n51.f.a(java.lang.Integer.valueOf(this.f389720u), java.lang.Integer.valueOf(x27Var.f389720u)) && n51.f.a(java.lang.Integer.valueOf(this.f389721v), java.lang.Integer.valueOf(x27Var.f389721v)) && n51.f.a(java.lang.Integer.valueOf(this.f389722w), java.lang.Integer.valueOf(x27Var.f389722w)) && n51.f.a(java.lang.Integer.valueOf(this.f389723x), java.lang.Integer.valueOf(x27Var.f389723x)) && n51.f.a(java.lang.Integer.valueOf(this.f389724y), java.lang.Integer.valueOf(x27Var.f389724y)) && n51.f.a(java.lang.Integer.valueOf(this.f389725z), java.lang.Integer.valueOf(x27Var.f389725z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(x27Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(x27Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(x27Var.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(x27Var.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(x27Var.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(x27Var.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(x27Var.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(x27Var.H)) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(x27Var.I)) && n51.f.a(this.f389705J, x27Var.f389705J) && n51.f.a(java.lang.Long.valueOf(this.K), java.lang.Long.valueOf(x27Var.K)) && n51.f.a(this.L, x27Var.L) && n51.f.a(this.M, x27Var.M);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389713n;
        java.util.LinkedList linkedList2 = this.f389708f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f389706d);
            fVar.e(3, this.f389707e);
            fVar.g(4, 8, linkedList2);
            fVar.h(5, this.f389709g);
            fVar.e(6, this.f389710h);
            r45.e37 e37Var = this.f389711i;
            if (e37Var != null) {
                fVar.i(7, e37Var.computeSize());
                this.f389711i.writeFields(fVar);
            }
            fVar.e(8, this.f389712m);
            fVar.g(9, 8, linkedList);
            fVar.e(10, this.f389714o);
            fVar.e(11, this.f389715p);
            fVar.e(12, this.f389716q);
            fVar.e(13, this.f389717r);
            fVar.e(14, this.f389718s);
            fVar.e(15, this.f389719t);
            fVar.e(16, this.f389720u);
            fVar.e(17, this.f389721v);
            fVar.e(18, this.f389722w);
            fVar.e(19, this.f389723x);
            fVar.e(20, this.f389724y);
            fVar.e(21, this.f389725z);
            fVar.e(22, this.A);
            fVar.e(23, this.B);
            fVar.e(24, this.C);
            fVar.e(25, this.D);
            fVar.e(26, this.E);
            fVar.e(27, this.F);
            fVar.e(28, this.G);
            fVar.e(29, this.H);
            fVar.e(30, this.I);
            r45.cu5 cu5Var = this.f389705J;
            if (cu5Var != null) {
                fVar.i(31, cu5Var.computeSize());
                this.f389705J.writeFields(fVar);
            }
            fVar.h(32, this.K);
            r45.cu5 cu5Var2 = this.L;
            if (cu5Var2 != null) {
                fVar.i(33, cu5Var2.computeSize());
                this.L.writeFields(fVar);
            }
            java.lang.String str = this.M;
            if (str != null) {
                fVar.j(34, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f389706d) + b36.f.e(3, this.f389707e) + b36.f.g(4, 8, linkedList2) + b36.f.h(5, this.f389709g) + b36.f.e(6, this.f389710h);
            r45.e37 e37Var2 = this.f389711i;
            if (e37Var2 != null) {
                i18 += b36.f.i(7, e37Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(8, this.f389712m) + b36.f.g(9, 8, linkedList) + b36.f.e(10, this.f389714o) + b36.f.e(11, this.f389715p) + b36.f.e(12, this.f389716q) + b36.f.e(13, this.f389717r) + b36.f.e(14, this.f389718s) + b36.f.e(15, this.f389719t) + b36.f.e(16, this.f389720u) + b36.f.e(17, this.f389721v) + b36.f.e(18, this.f389722w) + b36.f.e(19, this.f389723x) + b36.f.e(20, this.f389724y) + b36.f.e(21, this.f389725z) + b36.f.e(22, this.A) + b36.f.e(23, this.B) + b36.f.e(24, this.C) + b36.f.e(25, this.D) + b36.f.e(26, this.E) + b36.f.e(27, this.F) + b36.f.e(28, this.G) + b36.f.e(29, this.H) + b36.f.e(30, this.I);
            r45.cu5 cu5Var3 = this.f389705J;
            if (cu5Var3 != null) {
                e17 += b36.f.i(31, cu5Var3.computeSize());
            }
            int h17 = e17 + b36.f.h(32, this.K);
            r45.cu5 cu5Var4 = this.L;
            if (cu5Var4 != null) {
                h17 += b36.f.i(33, cu5Var4.computeSize());
            }
            java.lang.String str2 = this.M;
            return str2 != null ? h17 + b36.f.j(34, str2) : h17;
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
        r45.x27 x27Var = (r45.x27) objArr[1];
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
                    x27Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                x27Var.f389706d = aVar2.g(intValue);
                return 0;
            case 3:
                x27Var.f389707e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.b27 b27Var = new r45.b27();
                    if (bArr3 != null && bArr3.length > 0) {
                        b27Var.parseFrom(bArr3);
                    }
                    x27Var.f389708f.add(b27Var);
                }
                return 0;
            case 5:
                x27Var.f389709g = aVar2.i(intValue);
                return 0;
            case 6:
                x27Var.f389710h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.e37 e37Var3 = new r45.e37();
                    if (bArr4 != null && bArr4.length > 0) {
                        e37Var3.parseFrom(bArr4);
                    }
                    x27Var.f389711i = e37Var3;
                }
                return 0;
            case 8:
                x27Var.f389712m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.g37 g37Var = new r45.g37();
                    if (bArr5 != null && bArr5.length > 0) {
                        g37Var.parseFrom(bArr5);
                    }
                    x27Var.f389713n.add(g37Var);
                }
                return 0;
            case 10:
                x27Var.f389714o = aVar2.g(intValue);
                return 0;
            case 11:
                x27Var.f389715p = aVar2.g(intValue);
                return 0;
            case 12:
                x27Var.f389716q = aVar2.g(intValue);
                return 0;
            case 13:
                x27Var.f389717r = aVar2.g(intValue);
                return 0;
            case 14:
                x27Var.f389718s = aVar2.g(intValue);
                return 0;
            case 15:
                x27Var.f389719t = aVar2.g(intValue);
                return 0;
            case 16:
                x27Var.f389720u = aVar2.g(intValue);
                return 0;
            case 17:
                x27Var.f389721v = aVar2.g(intValue);
                return 0;
            case 18:
                x27Var.f389722w = aVar2.g(intValue);
                return 0;
            case 19:
                x27Var.f389723x = aVar2.g(intValue);
                return 0;
            case 20:
                x27Var.f389724y = aVar2.g(intValue);
                return 0;
            case 21:
                x27Var.f389725z = aVar2.g(intValue);
                return 0;
            case 22:
                x27Var.A = aVar2.g(intValue);
                return 0;
            case 23:
                x27Var.B = aVar2.g(intValue);
                return 0;
            case 24:
                x27Var.C = aVar2.g(intValue);
                return 0;
            case 25:
                x27Var.D = aVar2.g(intValue);
                return 0;
            case 26:
                x27Var.E = aVar2.g(intValue);
                return 0;
            case 27:
                x27Var.F = aVar2.g(intValue);
                return 0;
            case 28:
                x27Var.G = aVar2.g(intValue);
                return 0;
            case 29:
                x27Var.H = aVar2.g(intValue);
                return 0;
            case 30:
                x27Var.I = aVar2.g(intValue);
                return 0;
            case 31:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var5.b(bArr6);
                    }
                    x27Var.f389705J = cu5Var5;
                }
                return 0;
            case 32:
                x27Var.K = aVar2.i(intValue);
                return 0;
            case 33:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var6.b(bArr7);
                    }
                    x27Var.L = cu5Var6;
                }
                return 0;
            case 34:
                x27Var.M = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
