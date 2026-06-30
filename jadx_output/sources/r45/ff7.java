package r45;

/* loaded from: classes4.dex */
public class ff7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cf7 f374291d;

    /* renamed from: e, reason: collision with root package name */
    public int f374292e;

    /* renamed from: f, reason: collision with root package name */
    public int f374293f;

    /* renamed from: g, reason: collision with root package name */
    public int f374294g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f374295h;

    /* renamed from: i, reason: collision with root package name */
    public int f374296i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374297m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f374298n;

    /* renamed from: o, reason: collision with root package name */
    public int f374299o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f374300p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f374301q;

    /* renamed from: r, reason: collision with root package name */
    public int f374302r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f374303s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ff7)) {
            return false;
        }
        r45.ff7 ff7Var = (r45.ff7) fVar;
        return n51.f.a(this.f374291d, ff7Var.f374291d) && n51.f.a(java.lang.Integer.valueOf(this.f374292e), java.lang.Integer.valueOf(ff7Var.f374292e)) && n51.f.a(java.lang.Integer.valueOf(this.f374293f), java.lang.Integer.valueOf(ff7Var.f374293f)) && n51.f.a(java.lang.Integer.valueOf(this.f374294g), java.lang.Integer.valueOf(ff7Var.f374294g)) && n51.f.a(java.lang.Boolean.valueOf(this.f374295h), java.lang.Boolean.valueOf(ff7Var.f374295h)) && n51.f.a(java.lang.Integer.valueOf(this.f374296i), java.lang.Integer.valueOf(ff7Var.f374296i)) && n51.f.a(this.f374297m, ff7Var.f374297m) && n51.f.a(this.f374298n, ff7Var.f374298n) && n51.f.a(java.lang.Integer.valueOf(this.f374299o), java.lang.Integer.valueOf(ff7Var.f374299o)) && n51.f.a(java.lang.Boolean.valueOf(this.f374300p), java.lang.Boolean.valueOf(ff7Var.f374300p)) && n51.f.a(this.f374301q, ff7Var.f374301q) && n51.f.a(java.lang.Integer.valueOf(this.f374302r), java.lang.Integer.valueOf(ff7Var.f374302r)) && n51.f.a(this.f374303s, ff7Var.f374303s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cf7 cf7Var = this.f374291d;
            if (cf7Var != null) {
                fVar.i(1, cf7Var.computeSize());
                this.f374291d.writeFields(fVar);
            }
            fVar.e(2, this.f374292e);
            fVar.e(3, this.f374293f);
            fVar.e(4, this.f374294g);
            fVar.a(5, this.f374295h);
            fVar.e(6, this.f374296i);
            java.lang.String str = this.f374297m;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f374298n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.e(9, this.f374299o);
            fVar.a(10, this.f374300p);
            java.lang.String str3 = this.f374301q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            fVar.e(12, this.f374302r);
            java.lang.String str4 = this.f374303s;
            if (str4 == null) {
                return 0;
            }
            fVar.j(13, str4);
            return 0;
        }
        if (i17 == 1) {
            r45.cf7 cf7Var2 = this.f374291d;
            int i18 = (cf7Var2 != null ? 0 + b36.f.i(1, cf7Var2.computeSize()) : 0) + b36.f.e(2, this.f374292e) + b36.f.e(3, this.f374293f) + b36.f.e(4, this.f374294g) + b36.f.a(5, this.f374295h) + b36.f.e(6, this.f374296i);
            java.lang.String str5 = this.f374297m;
            if (str5 != null) {
                i18 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f374298n;
            if (str6 != null) {
                i18 += b36.f.j(8, str6);
            }
            int e17 = i18 + b36.f.e(9, this.f374299o) + b36.f.a(10, this.f374300p);
            java.lang.String str7 = this.f374301q;
            if (str7 != null) {
                e17 += b36.f.j(11, str7);
            }
            int e18 = e17 + b36.f.e(12, this.f374302r);
            java.lang.String str8 = this.f374303s;
            return str8 != null ? e18 + b36.f.j(13, str8) : e18;
        }
        if (i17 == 2) {
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
        r45.ff7 ff7Var = (r45.ff7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.cf7 cf7Var3 = new r45.cf7();
                    if (bArr != null && bArr.length > 0) {
                        cf7Var3.parseFrom(bArr);
                    }
                    ff7Var.f374291d = cf7Var3;
                }
                return 0;
            case 2:
                ff7Var.f374292e = aVar2.g(intValue);
                return 0;
            case 3:
                ff7Var.f374293f = aVar2.g(intValue);
                return 0;
            case 4:
                ff7Var.f374294g = aVar2.g(intValue);
                return 0;
            case 5:
                ff7Var.f374295h = aVar2.c(intValue);
                return 0;
            case 6:
                ff7Var.f374296i = aVar2.g(intValue);
                return 0;
            case 7:
                ff7Var.f374297m = aVar2.k(intValue);
                return 0;
            case 8:
                ff7Var.f374298n = aVar2.k(intValue);
                return 0;
            case 9:
                ff7Var.f374299o = aVar2.g(intValue);
                return 0;
            case 10:
                ff7Var.f374300p = aVar2.c(intValue);
                return 0;
            case 11:
                ff7Var.f374301q = aVar2.k(intValue);
                return 0;
            case 12:
                ff7Var.f374302r = aVar2.g(intValue);
                return 0;
            case 13:
                ff7Var.f374303s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
