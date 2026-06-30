package r45;

/* loaded from: classes14.dex */
public class w27 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388808d;

    /* renamed from: e, reason: collision with root package name */
    public int f388809e;

    /* renamed from: g, reason: collision with root package name */
    public r45.k37 f388811g;

    /* renamed from: h, reason: collision with root package name */
    public r45.k37 f388812h;

    /* renamed from: i, reason: collision with root package name */
    public int f388813i;

    /* renamed from: m, reason: collision with root package name */
    public int f388814m;

    /* renamed from: n, reason: collision with root package name */
    public int f388815n;

    /* renamed from: o, reason: collision with root package name */
    public long f388816o;

    /* renamed from: p, reason: collision with root package name */
    public int f388817p;

    /* renamed from: q, reason: collision with root package name */
    public long f388818q;

    /* renamed from: r, reason: collision with root package name */
    public int f388819r;

    /* renamed from: s, reason: collision with root package name */
    public int f388820s;

    /* renamed from: t, reason: collision with root package name */
    public int f388821t;

    /* renamed from: u, reason: collision with root package name */
    public int f388822u;

    /* renamed from: w, reason: collision with root package name */
    public int f388824w;

    /* renamed from: x, reason: collision with root package name */
    public r45.n27 f388825x;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f388810f = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f388823v = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w27)) {
            return false;
        }
        r45.w27 w27Var = (r45.w27) fVar;
        return n51.f.a(this.BaseRequest, w27Var.BaseRequest) && n51.f.a(this.f388808d, w27Var.f388808d) && n51.f.a(java.lang.Integer.valueOf(this.f388809e), java.lang.Integer.valueOf(w27Var.f388809e)) && n51.f.a(this.f388810f, w27Var.f388810f) && n51.f.a(this.f388811g, w27Var.f388811g) && n51.f.a(this.f388812h, w27Var.f388812h) && n51.f.a(java.lang.Integer.valueOf(this.f388813i), java.lang.Integer.valueOf(w27Var.f388813i)) && n51.f.a(java.lang.Integer.valueOf(this.f388814m), java.lang.Integer.valueOf(w27Var.f388814m)) && n51.f.a(java.lang.Integer.valueOf(this.f388815n), java.lang.Integer.valueOf(w27Var.f388815n)) && n51.f.a(java.lang.Long.valueOf(this.f388816o), java.lang.Long.valueOf(w27Var.f388816o)) && n51.f.a(java.lang.Integer.valueOf(this.f388817p), java.lang.Integer.valueOf(w27Var.f388817p)) && n51.f.a(java.lang.Long.valueOf(this.f388818q), java.lang.Long.valueOf(w27Var.f388818q)) && n51.f.a(java.lang.Integer.valueOf(this.f388819r), java.lang.Integer.valueOf(w27Var.f388819r)) && n51.f.a(java.lang.Integer.valueOf(this.f388820s), java.lang.Integer.valueOf(w27Var.f388820s)) && n51.f.a(java.lang.Integer.valueOf(this.f388821t), java.lang.Integer.valueOf(w27Var.f388821t)) && n51.f.a(java.lang.Integer.valueOf(this.f388822u), java.lang.Integer.valueOf(w27Var.f388822u)) && n51.f.a(this.f388823v, w27Var.f388823v) && n51.f.a(java.lang.Integer.valueOf(this.f388824w), java.lang.Integer.valueOf(w27Var.f388824w)) && n51.f.a(this.f388825x, w27Var.f388825x);
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
            java.lang.String str = this.f388808d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f388809e);
            fVar.g(4, 8, this.f388810f);
            r45.k37 k37Var = this.f388811g;
            if (k37Var != null) {
                fVar.i(6, k37Var.computeSize());
                this.f388811g.writeFields(fVar);
            }
            r45.k37 k37Var2 = this.f388812h;
            if (k37Var2 != null) {
                fVar.i(7, k37Var2.computeSize());
                this.f388812h.writeFields(fVar);
            }
            fVar.e(8, this.f388813i);
            fVar.e(9, this.f388814m);
            fVar.e(10, this.f388815n);
            fVar.h(11, this.f388816o);
            fVar.e(12, this.f388817p);
            fVar.h(13, this.f388818q);
            fVar.e(14, this.f388819r);
            fVar.e(15, this.f388820s);
            fVar.e(16, this.f388821t);
            fVar.e(17, this.f388822u);
            fVar.g(18, 8, this.f388823v);
            fVar.e(19, this.f388824w);
            r45.n27 n27Var = this.f388825x;
            if (n27Var != null) {
                fVar.i(20, n27Var.computeSize());
                this.f388825x.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str2 = this.f388808d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f388809e) + b36.f.g(4, 8, this.f388810f);
            r45.k37 k37Var3 = this.f388811g;
            if (k37Var3 != null) {
                e17 += b36.f.i(6, k37Var3.computeSize());
            }
            r45.k37 k37Var4 = this.f388812h;
            if (k37Var4 != null) {
                e17 += b36.f.i(7, k37Var4.computeSize());
            }
            int e18 = e17 + b36.f.e(8, this.f388813i) + b36.f.e(9, this.f388814m) + b36.f.e(10, this.f388815n) + b36.f.h(11, this.f388816o) + b36.f.e(12, this.f388817p) + b36.f.h(13, this.f388818q) + b36.f.e(14, this.f388819r) + b36.f.e(15, this.f388820s) + b36.f.e(16, this.f388821t) + b36.f.e(17, this.f388822u) + b36.f.g(18, 8, this.f388823v) + b36.f.e(19, this.f388824w);
            r45.n27 n27Var2 = this.f388825x;
            return n27Var2 != null ? e18 + b36.f.i(20, n27Var2.computeSize()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388810f.clear();
            this.f388823v.clear();
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
        r45.w27 w27Var = (r45.w27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    w27Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                w27Var.f388808d = aVar2.k(intValue);
                return 0;
            case 3:
                w27Var.f388809e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    w27Var.f388810f.add(du5Var);
                }
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.k37 k37Var5 = new r45.k37();
                    if (bArr4 != null && bArr4.length > 0) {
                        k37Var5.parseFrom(bArr4);
                    }
                    w27Var.f388811g = k37Var5;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.k37 k37Var6 = new r45.k37();
                    if (bArr5 != null && bArr5.length > 0) {
                        k37Var6.parseFrom(bArr5);
                    }
                    w27Var.f388812h = k37Var6;
                }
                return 0;
            case 8:
                w27Var.f388813i = aVar2.g(intValue);
                return 0;
            case 9:
                w27Var.f388814m = aVar2.g(intValue);
                return 0;
            case 10:
                w27Var.f388815n = aVar2.g(intValue);
                return 0;
            case 11:
                w27Var.f388816o = aVar2.i(intValue);
                return 0;
            case 12:
                w27Var.f388817p = aVar2.g(intValue);
                return 0;
            case 13:
                w27Var.f388818q = aVar2.i(intValue);
                return 0;
            case 14:
                w27Var.f388819r = aVar2.g(intValue);
                return 0;
            case 15:
                w27Var.f388820s = aVar2.g(intValue);
                return 0;
            case 16:
                w27Var.f388821t = aVar2.g(intValue);
                return 0;
            case 17:
                w27Var.f388822u = aVar2.g(intValue);
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.et4 et4Var = new r45.et4();
                    if (bArr6 != null && bArr6.length > 0) {
                        et4Var.parseFrom(bArr6);
                    }
                    w27Var.f388823v.add(et4Var);
                }
                return 0;
            case 19:
                w27Var.f388824w = aVar2.g(intValue);
                return 0;
            case 20:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.n27 n27Var3 = new r45.n27();
                    if (bArr7 != null && bArr7.length > 0) {
                        n27Var3.parseFrom(bArr7);
                    }
                    w27Var.f388825x = n27Var3;
                }
                return 0;
        }
    }
}
