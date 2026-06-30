package r45;

/* loaded from: classes15.dex */
public class x1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f389623d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f389624e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f389625f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f389626g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389627h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389628i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389629m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f389630n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f389631o = -1;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f389632p = "";

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x1)) {
            return false;
        }
        r45.x1 x1Var = (r45.x1) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f389623d), java.lang.Boolean.valueOf(x1Var.f389623d)) && n51.f.a(java.lang.Boolean.valueOf(this.f389624e), java.lang.Boolean.valueOf(x1Var.f389624e)) && n51.f.a(java.lang.Boolean.valueOf(this.f389625f), java.lang.Boolean.valueOf(x1Var.f389625f)) && n51.f.a(java.lang.Boolean.valueOf(this.f389626g), java.lang.Boolean.valueOf(x1Var.f389626g)) && n51.f.a(this.f389627h, x1Var.f389627h) && n51.f.a(this.f389628i, x1Var.f389628i) && n51.f.a(this.f389629m, x1Var.f389629m) && n51.f.a(this.f389630n, x1Var.f389630n) && n51.f.a(java.lang.Integer.valueOf(this.f389631o), java.lang.Integer.valueOf(x1Var.f389631o)) && n51.f.a(this.f389632p, x1Var.f389632p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f389623d);
            fVar.a(2, this.f389624e);
            fVar.a(3, this.f389625f);
            fVar.a(4, this.f389626g);
            java.lang.String str = this.f389627h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f389628i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f389629m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f389630n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f389631o);
            java.lang.String str5 = this.f389632p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f389623d) + 0 + b36.f.a(2, this.f389624e) + b36.f.a(3, this.f389625f) + b36.f.a(4, this.f389626g);
            java.lang.String str6 = this.f389627h;
            if (str6 != null) {
                a17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f389628i;
            if (str7 != null) {
                a17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f389629m;
            if (str8 != null) {
                a17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f389630n;
            if (str9 != null) {
                a17 += b36.f.j(8, str9);
            }
            int e17 = a17 + b36.f.e(9, this.f389631o);
            java.lang.String str10 = this.f389632p;
            return str10 != null ? e17 + b36.f.j(10, str10) : e17;
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
        r45.x1 x1Var = (r45.x1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x1Var.f389623d = aVar2.c(intValue);
                return 0;
            case 2:
                x1Var.f389624e = aVar2.c(intValue);
                return 0;
            case 3:
                x1Var.f389625f = aVar2.c(intValue);
                return 0;
            case 4:
                x1Var.f389626g = aVar2.c(intValue);
                return 0;
            case 5:
                x1Var.f389627h = aVar2.k(intValue);
                return 0;
            case 6:
                x1Var.f389628i = aVar2.k(intValue);
                return 0;
            case 7:
                x1Var.f389629m = aVar2.k(intValue);
                return 0;
            case 8:
                x1Var.f389630n = aVar2.k(intValue);
                return 0;
            case 9:
                x1Var.f389631o = aVar2.g(intValue);
                return 0;
            case 10:
                x1Var.f389632p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
