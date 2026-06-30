package r45;

/* loaded from: classes14.dex */
public class z17 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f391610d;

    /* renamed from: e, reason: collision with root package name */
    public long f391611e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391612f;

    /* renamed from: g, reason: collision with root package name */
    public int f391613g;

    /* renamed from: h, reason: collision with root package name */
    public r45.k37 f391614h;

    /* renamed from: i, reason: collision with root package name */
    public r45.k37 f391615i;

    /* renamed from: m, reason: collision with root package name */
    public int f391616m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f391617n;

    /* renamed from: o, reason: collision with root package name */
    public int f391618o;

    /* renamed from: p, reason: collision with root package name */
    public long f391619p;

    /* renamed from: q, reason: collision with root package name */
    public int f391620q;

    /* renamed from: r, reason: collision with root package name */
    public int f391621r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f391622s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public int f391623t;

    /* renamed from: u, reason: collision with root package name */
    public r45.n27 f391624u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z17)) {
            return false;
        }
        r45.z17 z17Var = (r45.z17) fVar;
        return n51.f.a(this.BaseRequest, z17Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f391610d), java.lang.Integer.valueOf(z17Var.f391610d)) && n51.f.a(java.lang.Long.valueOf(this.f391611e), java.lang.Long.valueOf(z17Var.f391611e)) && n51.f.a(this.f391612f, z17Var.f391612f) && n51.f.a(java.lang.Integer.valueOf(this.f391613g), java.lang.Integer.valueOf(z17Var.f391613g)) && n51.f.a(this.f391614h, z17Var.f391614h) && n51.f.a(this.f391615i, z17Var.f391615i) && n51.f.a(java.lang.Integer.valueOf(this.f391616m), java.lang.Integer.valueOf(z17Var.f391616m)) && n51.f.a(this.f391617n, z17Var.f391617n) && n51.f.a(java.lang.Integer.valueOf(this.f391618o), java.lang.Integer.valueOf(z17Var.f391618o)) && n51.f.a(java.lang.Long.valueOf(this.f391619p), java.lang.Long.valueOf(z17Var.f391619p)) && n51.f.a(java.lang.Integer.valueOf(this.f391620q), java.lang.Integer.valueOf(z17Var.f391620q)) && n51.f.a(java.lang.Integer.valueOf(this.f391621r), java.lang.Integer.valueOf(z17Var.f391621r)) && n51.f.a(this.f391622s, z17Var.f391622s) && n51.f.a(java.lang.Integer.valueOf(this.f391623t), java.lang.Integer.valueOf(z17Var.f391623t)) && n51.f.a(this.f391624u, z17Var.f391624u);
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
            fVar.e(2, this.f391610d);
            fVar.h(3, this.f391611e);
            java.lang.String str = this.f391612f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f391613g);
            r45.k37 k37Var = this.f391614h;
            if (k37Var != null) {
                fVar.i(6, k37Var.computeSize());
                this.f391614h.writeFields(fVar);
            }
            r45.k37 k37Var2 = this.f391615i;
            if (k37Var2 != null) {
                fVar.i(7, k37Var2.computeSize());
                this.f391615i.writeFields(fVar);
            }
            fVar.e(8, this.f391616m);
            java.lang.String str2 = this.f391617n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            fVar.e(10, this.f391618o);
            fVar.h(11, this.f391619p);
            fVar.e(12, this.f391620q);
            fVar.e(13, this.f391621r);
            fVar.g(14, 8, this.f391622s);
            fVar.e(15, this.f391623t);
            r45.n27 n27Var = this.f391624u;
            if (n27Var != null) {
                fVar.i(16, n27Var.computeSize());
                this.f391624u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f391610d) + b36.f.h(3, this.f391611e);
            java.lang.String str3 = this.f391612f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f391613g);
            r45.k37 k37Var3 = this.f391614h;
            if (k37Var3 != null) {
                e17 += b36.f.i(6, k37Var3.computeSize());
            }
            r45.k37 k37Var4 = this.f391615i;
            if (k37Var4 != null) {
                e17 += b36.f.i(7, k37Var4.computeSize());
            }
            int e18 = e17 + b36.f.e(8, this.f391616m);
            java.lang.String str4 = this.f391617n;
            if (str4 != null) {
                e18 += b36.f.j(9, str4);
            }
            int e19 = e18 + b36.f.e(10, this.f391618o) + b36.f.h(11, this.f391619p) + b36.f.e(12, this.f391620q) + b36.f.e(13, this.f391621r) + b36.f.g(14, 8, this.f391622s) + b36.f.e(15, this.f391623t);
            r45.n27 n27Var2 = this.f391624u;
            return n27Var2 != null ? e19 + b36.f.i(16, n27Var2.computeSize()) : e19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f391622s.clear();
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
        r45.z17 z17Var = (r45.z17) objArr[1];
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
                    z17Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                z17Var.f391610d = aVar2.g(intValue);
                return 0;
            case 3:
                z17Var.f391611e = aVar2.i(intValue);
                return 0;
            case 4:
                z17Var.f391612f = aVar2.k(intValue);
                return 0;
            case 5:
                z17Var.f391613g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.k37 k37Var5 = new r45.k37();
                    if (bArr3 != null && bArr3.length > 0) {
                        k37Var5.parseFrom(bArr3);
                    }
                    z17Var.f391614h = k37Var5;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.k37 k37Var6 = new r45.k37();
                    if (bArr4 != null && bArr4.length > 0) {
                        k37Var6.parseFrom(bArr4);
                    }
                    z17Var.f391615i = k37Var6;
                }
                return 0;
            case 8:
                z17Var.f391616m = aVar2.g(intValue);
                return 0;
            case 9:
                z17Var.f391617n = aVar2.k(intValue);
                return 0;
            case 10:
                z17Var.f391618o = aVar2.g(intValue);
                return 0;
            case 11:
                z17Var.f391619p = aVar2.i(intValue);
                return 0;
            case 12:
                z17Var.f391620q = aVar2.g(intValue);
                return 0;
            case 13:
                z17Var.f391621r = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.et4 et4Var = new r45.et4();
                    if (bArr5 != null && bArr5.length > 0) {
                        et4Var.parseFrom(bArr5);
                    }
                    z17Var.f391622s.add(et4Var);
                }
                return 0;
            case 15:
                z17Var.f391623t = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.n27 n27Var3 = new r45.n27();
                    if (bArr6 != null && bArr6.length > 0) {
                        n27Var3.parseFrom(bArr6);
                    }
                    z17Var.f391624u = n27Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
