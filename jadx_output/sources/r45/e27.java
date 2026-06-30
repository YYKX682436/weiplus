package r45;

/* loaded from: classes14.dex */
public class e27 extends r45.js5 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public r45.cu5 G;
    public long H;
    public r45.cu5 I;

    /* renamed from: d, reason: collision with root package name */
    public int f372932d;

    /* renamed from: f, reason: collision with root package name */
    public int f372934f;

    /* renamed from: g, reason: collision with root package name */
    public long f372935g;

    /* renamed from: h, reason: collision with root package name */
    public int f372936h;

    /* renamed from: i, reason: collision with root package name */
    public r45.e37 f372937i;

    /* renamed from: m, reason: collision with root package name */
    public int f372938m;

    /* renamed from: o, reason: collision with root package name */
    public int f372940o;

    /* renamed from: p, reason: collision with root package name */
    public int f372941p;

    /* renamed from: q, reason: collision with root package name */
    public int f372942q;

    /* renamed from: r, reason: collision with root package name */
    public int f372943r;

    /* renamed from: s, reason: collision with root package name */
    public int f372944s;

    /* renamed from: t, reason: collision with root package name */
    public int f372945t;

    /* renamed from: u, reason: collision with root package name */
    public int f372946u;

    /* renamed from: v, reason: collision with root package name */
    public int f372947v;

    /* renamed from: w, reason: collision with root package name */
    public int f372948w;

    /* renamed from: x, reason: collision with root package name */
    public int f372949x;

    /* renamed from: y, reason: collision with root package name */
    public int f372950y;

    /* renamed from: z, reason: collision with root package name */
    public int f372951z;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f372933e = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f372939n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e27)) {
            return false;
        }
        r45.e27 e27Var = (r45.e27) fVar;
        return n51.f.a(this.BaseResponse, e27Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f372932d), java.lang.Integer.valueOf(e27Var.f372932d)) && n51.f.a(this.f372933e, e27Var.f372933e) && n51.f.a(java.lang.Integer.valueOf(this.f372934f), java.lang.Integer.valueOf(e27Var.f372934f)) && n51.f.a(java.lang.Long.valueOf(this.f372935g), java.lang.Long.valueOf(e27Var.f372935g)) && n51.f.a(java.lang.Integer.valueOf(this.f372936h), java.lang.Integer.valueOf(e27Var.f372936h)) && n51.f.a(this.f372937i, e27Var.f372937i) && n51.f.a(java.lang.Integer.valueOf(this.f372938m), java.lang.Integer.valueOf(e27Var.f372938m)) && n51.f.a(this.f372939n, e27Var.f372939n) && n51.f.a(java.lang.Integer.valueOf(this.f372940o), java.lang.Integer.valueOf(e27Var.f372940o)) && n51.f.a(java.lang.Integer.valueOf(this.f372941p), java.lang.Integer.valueOf(e27Var.f372941p)) && n51.f.a(java.lang.Integer.valueOf(this.f372942q), java.lang.Integer.valueOf(e27Var.f372942q)) && n51.f.a(java.lang.Integer.valueOf(this.f372943r), java.lang.Integer.valueOf(e27Var.f372943r)) && n51.f.a(java.lang.Integer.valueOf(this.f372944s), java.lang.Integer.valueOf(e27Var.f372944s)) && n51.f.a(java.lang.Integer.valueOf(this.f372945t), java.lang.Integer.valueOf(e27Var.f372945t)) && n51.f.a(java.lang.Integer.valueOf(this.f372946u), java.lang.Integer.valueOf(e27Var.f372946u)) && n51.f.a(java.lang.Integer.valueOf(this.f372947v), java.lang.Integer.valueOf(e27Var.f372947v)) && n51.f.a(java.lang.Integer.valueOf(this.f372948w), java.lang.Integer.valueOf(e27Var.f372948w)) && n51.f.a(java.lang.Integer.valueOf(this.f372949x), java.lang.Integer.valueOf(e27Var.f372949x)) && n51.f.a(java.lang.Integer.valueOf(this.f372950y), java.lang.Integer.valueOf(e27Var.f372950y)) && n51.f.a(java.lang.Integer.valueOf(this.f372951z), java.lang.Integer.valueOf(e27Var.f372951z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(e27Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(e27Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(e27Var.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(e27Var.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(e27Var.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(e27Var.F)) && n51.f.a(this.G, e27Var.G) && n51.f.a(java.lang.Long.valueOf(this.H), java.lang.Long.valueOf(e27Var.H)) && n51.f.a(this.I, e27Var.I);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372939n;
        java.util.LinkedList linkedList2 = this.f372933e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f372932d);
            fVar.g(3, 8, linkedList2);
            fVar.e(4, this.f372934f);
            fVar.h(5, this.f372935g);
            fVar.e(6, this.f372936h);
            r45.e37 e37Var = this.f372937i;
            if (e37Var != null) {
                fVar.i(7, e37Var.computeSize());
                this.f372937i.writeFields(fVar);
            }
            fVar.e(8, this.f372938m);
            fVar.g(9, 8, linkedList);
            fVar.e(10, this.f372940o);
            fVar.e(11, this.f372941p);
            fVar.e(12, this.f372942q);
            fVar.e(13, this.f372943r);
            fVar.e(14, this.f372944s);
            fVar.e(15, this.f372945t);
            fVar.e(16, this.f372946u);
            fVar.e(17, this.f372947v);
            fVar.e(18, this.f372948w);
            fVar.e(19, this.f372949x);
            fVar.e(20, this.f372950y);
            fVar.e(21, this.f372951z);
            fVar.e(22, this.A);
            fVar.e(23, this.B);
            fVar.e(24, this.C);
            fVar.e(25, this.D);
            fVar.e(26, this.E);
            fVar.e(27, this.F);
            r45.cu5 cu5Var = this.G;
            if (cu5Var != null) {
                fVar.i(28, cu5Var.computeSize());
                this.G.writeFields(fVar);
            }
            fVar.h(29, this.H);
            r45.cu5 cu5Var2 = this.I;
            if (cu5Var2 != null) {
                fVar.i(30, cu5Var2.computeSize());
                this.I.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f372932d) + b36.f.g(3, 8, linkedList2) + b36.f.e(4, this.f372934f) + b36.f.h(5, this.f372935g) + b36.f.e(6, this.f372936h);
            r45.e37 e37Var2 = this.f372937i;
            if (e37Var2 != null) {
                i18 += b36.f.i(7, e37Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(8, this.f372938m) + b36.f.g(9, 8, linkedList) + b36.f.e(10, this.f372940o) + b36.f.e(11, this.f372941p) + b36.f.e(12, this.f372942q) + b36.f.e(13, this.f372943r) + b36.f.e(14, this.f372944s) + b36.f.e(15, this.f372945t) + b36.f.e(16, this.f372946u) + b36.f.e(17, this.f372947v) + b36.f.e(18, this.f372948w) + b36.f.e(19, this.f372949x) + b36.f.e(20, this.f372950y) + b36.f.e(21, this.f372951z) + b36.f.e(22, this.A) + b36.f.e(23, this.B) + b36.f.e(24, this.C) + b36.f.e(25, this.D) + b36.f.e(26, this.E) + b36.f.e(27, this.F);
            r45.cu5 cu5Var3 = this.G;
            if (cu5Var3 != null) {
                e17 += b36.f.i(28, cu5Var3.computeSize());
            }
            int h17 = e17 + b36.f.h(29, this.H);
            r45.cu5 cu5Var4 = this.I;
            return cu5Var4 != null ? h17 + b36.f.i(30, cu5Var4.computeSize()) : h17;
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
        r45.e27 e27Var = (r45.e27) objArr[1];
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
                    e27Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                e27Var.f372932d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.b27 b27Var = new r45.b27();
                    if (bArr3 != null && bArr3.length > 0) {
                        b27Var.parseFrom(bArr3);
                    }
                    e27Var.f372933e.add(b27Var);
                }
                return 0;
            case 4:
                e27Var.f372934f = aVar2.g(intValue);
                return 0;
            case 5:
                e27Var.f372935g = aVar2.i(intValue);
                return 0;
            case 6:
                e27Var.f372936h = aVar2.g(intValue);
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
                    e27Var.f372937i = e37Var3;
                }
                return 0;
            case 8:
                e27Var.f372938m = aVar2.g(intValue);
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
                    e27Var.f372939n.add(g37Var);
                }
                return 0;
            case 10:
                e27Var.f372940o = aVar2.g(intValue);
                return 0;
            case 11:
                e27Var.f372941p = aVar2.g(intValue);
                return 0;
            case 12:
                e27Var.f372942q = aVar2.g(intValue);
                return 0;
            case 13:
                e27Var.f372943r = aVar2.g(intValue);
                return 0;
            case 14:
                e27Var.f372944s = aVar2.g(intValue);
                return 0;
            case 15:
                e27Var.f372945t = aVar2.g(intValue);
                return 0;
            case 16:
                e27Var.f372946u = aVar2.g(intValue);
                return 0;
            case 17:
                e27Var.f372947v = aVar2.g(intValue);
                return 0;
            case 18:
                e27Var.f372948w = aVar2.g(intValue);
                return 0;
            case 19:
                e27Var.f372949x = aVar2.g(intValue);
                return 0;
            case 20:
                e27Var.f372950y = aVar2.g(intValue);
                return 0;
            case 21:
                e27Var.f372951z = aVar2.g(intValue);
                return 0;
            case 22:
                e27Var.A = aVar2.g(intValue);
                return 0;
            case 23:
                e27Var.B = aVar2.g(intValue);
                return 0;
            case 24:
                e27Var.C = aVar2.g(intValue);
                return 0;
            case 25:
                e27Var.D = aVar2.g(intValue);
                return 0;
            case 26:
                e27Var.E = aVar2.g(intValue);
                return 0;
            case 27:
                e27Var.F = aVar2.g(intValue);
                return 0;
            case 28:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var5.b(bArr6);
                    }
                    e27Var.G = cu5Var5;
                }
                return 0;
            case 29:
                e27Var.H = aVar2.i(intValue);
                return 0;
            case 30:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var6.b(bArr7);
                    }
                    e27Var.I = cu5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
