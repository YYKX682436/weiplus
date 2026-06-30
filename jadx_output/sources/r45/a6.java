package r45;

/* loaded from: classes14.dex */
public class a6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369748d;

    /* renamed from: e, reason: collision with root package name */
    public int f369749e;

    /* renamed from: f, reason: collision with root package name */
    public int f369750f;

    /* renamed from: g, reason: collision with root package name */
    public int f369751g;

    /* renamed from: h, reason: collision with root package name */
    public long f369752h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f369753i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f369754m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f369755n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a6)) {
            return false;
        }
        r45.a6 a6Var = (r45.a6) fVar;
        return n51.f.a(this.f369748d, a6Var.f369748d) && n51.f.a(java.lang.Integer.valueOf(this.f369749e), java.lang.Integer.valueOf(a6Var.f369749e)) && n51.f.a(java.lang.Integer.valueOf(this.f369750f), java.lang.Integer.valueOf(a6Var.f369750f)) && n51.f.a(java.lang.Integer.valueOf(this.f369751g), java.lang.Integer.valueOf(a6Var.f369751g)) && n51.f.a(java.lang.Long.valueOf(this.f369752h), java.lang.Long.valueOf(a6Var.f369752h)) && n51.f.a(this.f369753i, a6Var.f369753i) && n51.f.a(java.lang.Boolean.valueOf(this.f369754m), java.lang.Boolean.valueOf(a6Var.f369754m)) && n51.f.a(this.f369755n, a6Var.f369755n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f369748d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f369749e);
            fVar.e(3, this.f369750f);
            fVar.e(4, this.f369751g);
            fVar.h(5, this.f369752h);
            java.lang.String str2 = this.f369753i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.a(7, this.f369754m);
            java.lang.String str3 = this.f369755n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f369748d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f369749e) + b36.f.e(3, this.f369750f) + b36.f.e(4, this.f369751g) + b36.f.h(5, this.f369752h);
            java.lang.String str5 = this.f369753i;
            if (str5 != null) {
                j17 += b36.f.j(6, str5);
            }
            int a17 = j17 + b36.f.a(7, this.f369754m);
            java.lang.String str6 = this.f369755n;
            return str6 != null ? a17 + b36.f.j(8, str6) : a17;
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
        r45.a6 a6Var = (r45.a6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a6Var.f369748d = aVar2.k(intValue);
                return 0;
            case 2:
                a6Var.f369749e = aVar2.g(intValue);
                return 0;
            case 3:
                a6Var.f369750f = aVar2.g(intValue);
                return 0;
            case 4:
                a6Var.f369751g = aVar2.g(intValue);
                return 0;
            case 5:
                a6Var.f369752h = aVar2.i(intValue);
                return 0;
            case 6:
                a6Var.f369753i = aVar2.k(intValue);
                return 0;
            case 7:
                a6Var.f369754m = aVar2.c(intValue);
                return 0;
            case 8:
                a6Var.f369755n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
