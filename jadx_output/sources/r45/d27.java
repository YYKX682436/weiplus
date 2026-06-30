package r45;

/* loaded from: classes14.dex */
public class d27 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372015d;

    /* renamed from: e, reason: collision with root package name */
    public int f372016e;

    /* renamed from: f, reason: collision with root package name */
    public int f372017f;

    /* renamed from: g, reason: collision with root package name */
    public r45.k37 f372018g;

    /* renamed from: h, reason: collision with root package name */
    public r45.k37 f372019h;

    /* renamed from: i, reason: collision with root package name */
    public long f372020i;

    /* renamed from: m, reason: collision with root package name */
    public int f372021m;

    /* renamed from: n, reason: collision with root package name */
    public long f372022n;

    /* renamed from: o, reason: collision with root package name */
    public int f372023o;

    /* renamed from: p, reason: collision with root package name */
    public int f372024p;

    /* renamed from: q, reason: collision with root package name */
    public int f372025q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f372026r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public int f372027s;

    /* renamed from: t, reason: collision with root package name */
    public r45.n27 f372028t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d27)) {
            return false;
        }
        r45.d27 d27Var = (r45.d27) fVar;
        return n51.f.a(this.BaseRequest, d27Var.BaseRequest) && n51.f.a(this.f372015d, d27Var.f372015d) && n51.f.a(java.lang.Integer.valueOf(this.f372016e), java.lang.Integer.valueOf(d27Var.f372016e)) && n51.f.a(java.lang.Integer.valueOf(this.f372017f), java.lang.Integer.valueOf(d27Var.f372017f)) && n51.f.a(this.f372018g, d27Var.f372018g) && n51.f.a(this.f372019h, d27Var.f372019h) && n51.f.a(java.lang.Long.valueOf(this.f372020i), java.lang.Long.valueOf(d27Var.f372020i)) && n51.f.a(java.lang.Integer.valueOf(this.f372021m), java.lang.Integer.valueOf(d27Var.f372021m)) && n51.f.a(java.lang.Long.valueOf(this.f372022n), java.lang.Long.valueOf(d27Var.f372022n)) && n51.f.a(java.lang.Integer.valueOf(this.f372023o), java.lang.Integer.valueOf(d27Var.f372023o)) && n51.f.a(java.lang.Integer.valueOf(this.f372024p), java.lang.Integer.valueOf(d27Var.f372024p)) && n51.f.a(java.lang.Integer.valueOf(this.f372025q), java.lang.Integer.valueOf(d27Var.f372025q)) && n51.f.a(this.f372026r, d27Var.f372026r) && n51.f.a(java.lang.Integer.valueOf(this.f372027s), java.lang.Integer.valueOf(d27Var.f372027s)) && n51.f.a(this.f372028t, d27Var.f372028t);
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
            java.lang.String str = this.f372015d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f372016e);
            fVar.e(4, this.f372017f);
            r45.k37 k37Var = this.f372018g;
            if (k37Var != null) {
                fVar.i(5, k37Var.computeSize());
                this.f372018g.writeFields(fVar);
            }
            r45.k37 k37Var2 = this.f372019h;
            if (k37Var2 != null) {
                fVar.i(6, k37Var2.computeSize());
                this.f372019h.writeFields(fVar);
            }
            fVar.h(7, this.f372020i);
            fVar.e(8, this.f372021m);
            fVar.h(9, this.f372022n);
            fVar.e(10, this.f372023o);
            fVar.e(11, this.f372024p);
            fVar.e(12, this.f372025q);
            fVar.g(13, 8, this.f372026r);
            fVar.e(14, this.f372027s);
            r45.n27 n27Var = this.f372028t;
            if (n27Var != null) {
                fVar.i(15, n27Var.computeSize());
                this.f372028t.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str2 = this.f372015d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f372016e) + b36.f.e(4, this.f372017f);
            r45.k37 k37Var3 = this.f372018g;
            if (k37Var3 != null) {
                e17 += b36.f.i(5, k37Var3.computeSize());
            }
            r45.k37 k37Var4 = this.f372019h;
            if (k37Var4 != null) {
                e17 += b36.f.i(6, k37Var4.computeSize());
            }
            int h17 = e17 + b36.f.h(7, this.f372020i) + b36.f.e(8, this.f372021m) + b36.f.h(9, this.f372022n) + b36.f.e(10, this.f372023o) + b36.f.e(11, this.f372024p) + b36.f.e(12, this.f372025q) + b36.f.g(13, 8, this.f372026r) + b36.f.e(14, this.f372027s);
            r45.n27 n27Var2 = this.f372028t;
            return n27Var2 != null ? h17 + b36.f.i(15, n27Var2.computeSize()) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f372026r.clear();
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
        r45.d27 d27Var = (r45.d27) objArr[1];
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
                    d27Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                d27Var.f372015d = aVar2.k(intValue);
                return 0;
            case 3:
                d27Var.f372016e = aVar2.g(intValue);
                return 0;
            case 4:
                d27Var.f372017f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.k37 k37Var5 = new r45.k37();
                    if (bArr3 != null && bArr3.length > 0) {
                        k37Var5.parseFrom(bArr3);
                    }
                    d27Var.f372018g = k37Var5;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.k37 k37Var6 = new r45.k37();
                    if (bArr4 != null && bArr4.length > 0) {
                        k37Var6.parseFrom(bArr4);
                    }
                    d27Var.f372019h = k37Var6;
                }
                return 0;
            case 7:
                d27Var.f372020i = aVar2.i(intValue);
                return 0;
            case 8:
                d27Var.f372021m = aVar2.g(intValue);
                return 0;
            case 9:
                d27Var.f372022n = aVar2.i(intValue);
                return 0;
            case 10:
                d27Var.f372023o = aVar2.g(intValue);
                return 0;
            case 11:
                d27Var.f372024p = aVar2.g(intValue);
                return 0;
            case 12:
                d27Var.f372025q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.et4 et4Var = new r45.et4();
                    if (bArr5 != null && bArr5.length > 0) {
                        et4Var.parseFrom(bArr5);
                    }
                    d27Var.f372026r.add(et4Var);
                }
                return 0;
            case 14:
                d27Var.f372027s = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.n27 n27Var3 = new r45.n27();
                    if (bArr6 != null && bArr6.length > 0) {
                        n27Var3.parseFrom(bArr6);
                    }
                    d27Var.f372028t = n27Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
