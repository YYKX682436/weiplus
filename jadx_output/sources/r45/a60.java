package r45;

/* loaded from: classes7.dex */
public class a60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f369756d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f369757e;

    /* renamed from: f, reason: collision with root package name */
    public int f369758f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f369759g;

    /* renamed from: h, reason: collision with root package name */
    public int f369760h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f369761i;

    /* renamed from: m, reason: collision with root package name */
    public int f369762m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f369763n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f369764o;

    /* renamed from: p, reason: collision with root package name */
    public int f369765p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f369766q;

    /* renamed from: r, reason: collision with root package name */
    public int f369767r;

    /* renamed from: s, reason: collision with root package name */
    public r45.b60 f369768s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a60)) {
            return false;
        }
        r45.a60 a60Var = (r45.a60) fVar;
        return n51.f.a(this.f369756d, a60Var.f369756d) && n51.f.a(java.lang.Integer.valueOf(this.f369757e), java.lang.Integer.valueOf(a60Var.f369757e)) && n51.f.a(java.lang.Integer.valueOf(this.f369758f), java.lang.Integer.valueOf(a60Var.f369758f)) && n51.f.a(java.lang.Boolean.valueOf(this.f369759g), java.lang.Boolean.valueOf(a60Var.f369759g)) && n51.f.a(java.lang.Integer.valueOf(this.f369760h), java.lang.Integer.valueOf(a60Var.f369760h)) && n51.f.a(this.f369761i, a60Var.f369761i) && n51.f.a(java.lang.Integer.valueOf(this.f369762m), java.lang.Integer.valueOf(a60Var.f369762m)) && n51.f.a(java.lang.Boolean.valueOf(this.f369763n), java.lang.Boolean.valueOf(a60Var.f369763n)) && n51.f.a(java.lang.Boolean.valueOf(this.f369764o), java.lang.Boolean.valueOf(a60Var.f369764o)) && n51.f.a(java.lang.Integer.valueOf(this.f369765p), java.lang.Integer.valueOf(a60Var.f369765p)) && n51.f.a(this.f369766q, a60Var.f369766q) && n51.f.a(java.lang.Integer.valueOf(this.f369767r), java.lang.Integer.valueOf(a60Var.f369767r)) && n51.f.a(this.f369768s, a60Var.f369768s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f369756d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f369757e);
            fVar.e(3, this.f369758f);
            fVar.a(4, this.f369759g);
            fVar.e(5, this.f369760h);
            java.lang.String str = this.f369761i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f369762m);
            fVar.a(8, this.f369763n);
            fVar.a(9, this.f369764o);
            fVar.e(10, this.f369765p);
            java.lang.String str2 = this.f369766q;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            fVar.e(12, this.f369767r);
            r45.b60 b60Var = this.f369768s;
            if (b60Var != null) {
                fVar.i(13, b60Var.computeSize());
                this.f369768s.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f369757e) + b36.f.e(3, this.f369758f) + b36.f.a(4, this.f369759g) + b36.f.e(5, this.f369760h);
            java.lang.String str3 = this.f369761i;
            if (str3 != null) {
                g17 += b36.f.j(6, str3);
            }
            int e17 = g17 + b36.f.e(7, this.f369762m) + b36.f.a(8, this.f369763n) + b36.f.a(9, this.f369764o) + b36.f.e(10, this.f369765p);
            java.lang.String str4 = this.f369766q;
            if (str4 != null) {
                e17 += b36.f.j(11, str4);
            }
            int e18 = e17 + b36.f.e(12, this.f369767r);
            r45.b60 b60Var2 = this.f369768s;
            return b60Var2 != null ? e18 + b36.f.i(13, b60Var2.computeSize()) : e18;
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
        r45.a60 a60Var = (r45.a60) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.fn5 fn5Var = new r45.fn5();
                    if (bArr2 != null && bArr2.length > 0) {
                        fn5Var.parseFrom(bArr2);
                    }
                    a60Var.f369756d.add(fn5Var);
                }
                return 0;
            case 2:
                a60Var.f369757e = aVar2.g(intValue);
                return 0;
            case 3:
                a60Var.f369758f = aVar2.g(intValue);
                return 0;
            case 4:
                a60Var.f369759g = aVar2.c(intValue);
                return 0;
            case 5:
                a60Var.f369760h = aVar2.g(intValue);
                return 0;
            case 6:
                a60Var.f369761i = aVar2.k(intValue);
                return 0;
            case 7:
                a60Var.f369762m = aVar2.g(intValue);
                return 0;
            case 8:
                a60Var.f369763n = aVar2.c(intValue);
                return 0;
            case 9:
                a60Var.f369764o = aVar2.c(intValue);
                return 0;
            case 10:
                a60Var.f369765p = aVar2.g(intValue);
                return 0;
            case 11:
                a60Var.f369766q = aVar2.k(intValue);
                return 0;
            case 12:
                a60Var.f369767r = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.b60 b60Var3 = new r45.b60();
                    if (bArr3 != null && bArr3.length > 0) {
                        b60Var3.parseFrom(bArr3);
                    }
                    a60Var.f369768s = b60Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
